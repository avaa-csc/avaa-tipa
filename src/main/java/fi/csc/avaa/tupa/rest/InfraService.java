package fi.csc.avaa.tupa.rest;

import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.common.DBTools;
import fi.csc.avaa.tupa.db.model.Infra;
import fi.csc.avaa.tupa.model.*;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static fi.csc.avaa.tupa.common.TupaConst.*;
import static fi.csc.avaa.tupa.result.InfraDetailsWindow.NAME;
import static javax.xml.bind.Marshaller.JAXB_SCHEMA_LOCATION;


@Path("/infraservice")
@Singleton
public class InfraService {

	private static final AvaaLogger log = new AvaaLogger(InfraService.class.getName());
	private RestInfraListWrapperJAXBContextProvider contextProvider = new RestInfraListWrapperJAXBContextProvider();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/infra-URN-URL-identifier-location.xml")
	public String getInfrasXML() {

		StringWriter sw = new StringWriter();
		String result = null;

		try {
			JAXBContext context = contextProvider.getContext(RestInfraRecordListWrapper.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(JAXB_SCHEMA_LOCATION, SCHEMA_LOCATION);

			marshaller.marshal(mapDBtoRestInfraObjects(), sw);
			result = sw.toString();

		} catch (JAXBException e) {
			log.error("issue with JAXBContext", e);
		}

		return result;
	}

	protected static RestInfraRecordListWrapper mapDBtoRestInfraObjects(){

		RestInfraRecordListWrapper recordListWrapper = new RestInfraRecordListWrapper();
		List<Infra> allDBInfrasList = DBTools.getAllInfras();
		
		if (allDBInfrasList != null) {
			allDBInfrasList.stream().filter(e -> e != null).forEach(e -> {
				RestInfraDestination destination = new RestInfraDestination();
				RestInfraDestinationListWrapper destinationListWrapper = new RestInfraDestinationListWrapper();
				RestInfraHeader legacyHeader = new RestInfraHeader();
				RestInfraHeader header = new RestInfraHeader();
				RestInfraRecord legacyRecord = new RestInfraRecord();
				RestInfraRecord record = new RestInfraRecord();
				RestInfraDateStamp dateStamp = new RestInfraDateStamp();
				
				destination.setDateStamp(dateStamp);
				destination.setUrl(createURL(e.getInfra_id()));
				destinationListWrapper.getList().add(destination);
				legacyHeader.setIdentifier(createLegacyURN(e.getInfra_id(), e.getApi_date()));
				legacyHeader.setRestInfraDestinationListWrapper(destinationListWrapper);
				header.setIdentifier((createURN(e.getInfra_id(), e.getApi_date())));
				header.setRestInfraDestinationListWrapper(destinationListWrapper);
				legacyRecord.setRestInfraLegacyHeader(legacyHeader);
				record.setRestInfraLegacyHeader(header);
				recordListWrapper.getList().add(legacyRecord);
				recordListWrapper.getList().add(record);
			});
		}
		return recordListWrapper;
	}

	public static String createLegacyURN(int id, Date date){
		return BASE_LEGACY_URN + new SimpleDateFormat("yyyyMMdd").format(date) + id;
	}

	public static String createURN(int id, Date date){
		return BASE_URN + new SimpleDateFormat("yyyyMMdd").format(date) + id;
	}

	private static String createURL(int id){
		return PROTOCOL + APPLICATION_HOST_NAME_EN + "/#!" +  NAME + "/" + id;
	}
}