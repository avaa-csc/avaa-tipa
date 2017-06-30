package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.model.Palvelu;
import fi.csc.avaa.tupa.db.model.TpServize;
import fi.csc.avaa.tupa.db.service.TpServizeLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.TpServizeLocalServiceBaseImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;
import static fi.csc.avaa.tupa.db.service.AvainsanaLocalServiceUtil.getKeywordsIdsByKeywords;
import static fi.csc.avaa.tupa.db.service.Infra_AvainsanatLocalServiceUtil.getInfrastructuresIdsByKeywordsIds;
import static fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalServiceUtil.getServicesIdsByInfrastructuresIds;
import static fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil.getInfrastructuresIdsByOrganisationsIds;
import static fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalServiceUtil.getInfrastructuresIdsByContactsIds;
import static fi.csc.avaa.tupa.db.service.OrganisaatioLocalServiceUtil.getOrganisationsIdsByCountries;
import static fi.csc.avaa.tupa.db.service.PalveluLocalServiceUtil.*;
import static fi.csc.avaa.tupa.db.service.Palvelu_PalvelutyypitLocalServiceUtil.getServicesIdsByServiceTypesIds;
import static fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalServiceUtil.getServiceTypesIdsByDefinitionsIds;
import static fi.csc.avaa.tupa.db.service.SeliteLocalServiceUtil.*;
import static fi.csc.avaa.tupa.db.service.TpInfrastructureLocalServiceUtil.getInfrastructuresIdsByUrns;

/**
 * The implementation of the tp servize local service.
 * <p>
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.TpServizeLocalService} interface.
 * <p>
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CSC
 * @see fi.csc.avaa.tupa.db.service.base.TpServizeLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.TpServizeLocalServiceUtil
 */
public class TpServizeLocalServiceImpl extends TpServizeLocalServiceBaseImpl {
	/*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.TpServizeLocalServiceUtil} to access the tp servize local service.
     */

	private static final AvaaLogger log = new AvaaLogger(TpServizeLocalServiceImpl.class.getName());

	public List<TpServize> getAllServices() {
		try {
			return getTpServizesListFromPalvelusList(getPalvelus(QueryUtil.ALL_POS, QueryUtil.ALL_POS));
		} catch (SystemException e) {
			log.error(e, e);
		}
		return null;
	}

	public List<TpServize> getServicesByServicesIds(int[] servicesIds) {
		if (isEmpty(servicesIds)) return null;

		List<Palvelu> list = new ArrayList<>();

		Arrays.stream(servicesIds)
				.distinct()
				.forEach(id -> {
					try {
						list.add(getPalvelu(id));
					} catch (PortalException | SystemException e) {
						log.error(e, e);
					}
				});

		return getTpServizesListFromPalvelusList(list);
	}

	public List<TpServize> getServicesByInfrastructuresIds(int[] infrastructuresIds) {
		if (isEmpty(infrastructuresIds)) return null;

		int[] servicesIds = getServicesIdsByInfrastructuresIds(infrastructuresIds);

		return getServicesByServicesIds(servicesIds);
	}

	public List<TpServize> getServicesByInfrastructuresUrns(String[] infrastructuresUrns) {
		if (isEmpty(infrastructuresUrns)) return null;

		int[] infrastructuresIds = getInfrastructuresIdsByUrns(infrastructuresUrns);
		int[] servicesIds = getServicesIdsByInfrastructuresIds(infrastructuresIds);

		return getServicesByServicesIds(servicesIds);
	}

	public List<TpServize> getServicesByOrganisationsIds(int[] organisationsIds) {
		if (isEmpty(organisationsIds)) return null;

		int[] infrastructuresIds = getInfrastructuresIdsByOrganisationsIds(organisationsIds);
		int[] servicesIds = getServicesIdsByInfrastructuresIds(infrastructuresIds);

		return getServicesByServicesIds(servicesIds);
	}

	public List<TpServize> getServicesByContactsIds(int[] contactsIds) {
		if (isEmpty(contactsIds)) return null;

		int[] infrastructuresIds = getInfrastructuresIdsByContactsIds(contactsIds);
		int[] servicesIds = getServicesIdsByInfrastructuresIds(infrastructuresIds);

		return getServicesByServicesIds(servicesIds);
	}

	public List<TpServize> getServicesByKeywords(String[] keywords) {
		if (isEmpty(keywords)) return null;

		int[] keywordsIds = getKeywordsIdsByKeywords(keywords);
		int[] infrastructuresIds = getInfrastructuresIdsByKeywordsIds(keywordsIds);
		int[] servicesIds = getServicesIdsByInfrastructuresIds(infrastructuresIds);

		return getServicesByServicesIds(servicesIds);
	}

	public List<TpServize> getServicesByServiceTypes(String[] serviceTypes) {
		if (isEmpty(serviceTypes)) return null;

		int[] definitionsIds = getDefinitionsIdsByServiceTypes(serviceTypes);
		int[] serviceTypesIds = getServiceTypesIdsByDefinitionsIds(definitionsIds);
		int[] servicesIds = getServicesIdsByServiceTypesIds(serviceTypesIds);

		return getServicesByServicesIds(servicesIds);
	}

	public String[][] getServiceTypes() {

		return getServiceTypesByClassificator();
	}

	public List<TpServize> getServicesByLocationTypes(String[] locationTypes) {
		if (isEmpty(locationTypes)) return null;

		int[] locationTypesIds = getLocationTypesIdsByLocationTypes(locationTypes);
		int[] servicesIds = getServicesIdsByLocationTypesIds(locationTypesIds);

		return getServicesByServicesIds(servicesIds);
	}

	public String[][] getLocationTypes() {

		return getLocationTypesByClassificator();
	}

	public List<TpServize> getServicesByPostalCodes(int[] PostalCodes) {
		if (isEmpty(PostalCodes)) return null;

		int[] servicesIds = getServicesIdsByPostalCodes(PostalCodes);

		return getServicesByServicesIds(servicesIds);
	}

	public List<TpServize> getServicesByLocation(double latitude, double longitude) {

		int[] servicesIds = getServicesIdsByLocation(latitude, longitude);

		return getServicesByServicesIds(servicesIds);
	}

	public List<TpServize> getServicesByCountries(String[] countries) {
		if (isEmpty(countries)) return null;

		int[] organisationIds = getOrganisationsIdsByCountries(countries);
		int[] infrastructuresIds = getInfrastructuresIdsByOrganisationsIds(organisationIds);
		int[] servicesIds = getServicesIdsByInfrastructuresIds(infrastructuresIds);

		return getServicesByServicesIds(servicesIds);
	}

	private List<TpServize> getTpServizesListFromPalvelusList(List<Palvelu> list) {
		if (list == null || list.isEmpty()) return null;

		return list
				.stream()
				.distinct()
				.map(this::getTpServizeFromPalvelu)
				.collect(Collectors.toList());
	}

	private TpServize getTpServizeFromPalvelu(Palvelu palvelu) {
		if (palvelu == null) return null;

		int id = palvelu.getPalvelu_id();
		TpServize tp = TpServizeLocalServiceUtil.createTpServize(id);
		tp.setName_EN(palvelu.getName());
		tp.setName_FI(palvelu.getNimi());
		tp.setDescription_EN(palvelu.getDescription());
		tp.setDescription_FI(palvelu.getKuvaus());
		tp.setUrl(palvelu.getURLen());
		tp.setServiceTypes(getServiceTypesByServiceId(id));
		tp.setLocationTypes(getLocationTypesByServiceId(id));
		tp.setAddress(palvelu.getKatuosoite());
		tp.setCity(palvelu.getKaupunki());
		tp.setLat(palvelu.getLat());
		tp.setLon(palvelu.getLon());
		tp.setInfrastructuresIds(getInfrastructuresIdsByServiceId(id));
		tp.setOrganisationsIds(getOrganisationsIdsByServiceId(id));
		tp.setContactsIds(getContactsIdsByServiceId(id));

		return tp;
	}
}
