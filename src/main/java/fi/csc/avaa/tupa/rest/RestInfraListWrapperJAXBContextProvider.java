package fi.csc.avaa.tupa.rest;

import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.model.RestInfraRecordListWrapper;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

@Provider
public class RestInfraListWrapperJAXBContextProvider implements ContextResolver<JAXBContext> {

	private static final AvaaLogger log = new AvaaLogger(RestInfraListWrapperJAXBContextProvider.class.getName());

	private JAXBContext context = null;

	@Override
	public JAXBContext getContext(Class<?> type) {
		if (type != RestInfraRecordListWrapper.class) {
			return null;
		}

		if (context == null) {
			try {
				context = JAXBContext.newInstance(RestInfraRecordListWrapper.class);
			} catch (JAXBException e) {
				log.error("could not get RestInfraWrapper JAXBContext", e);
			}
		}
		return context;
	}
}
