package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.model.Organisaatio;
import fi.csc.avaa.tupa.db.model.TpOrganisation;
import fi.csc.avaa.tupa.db.model.Yhteystieto;
import fi.csc.avaa.tupa.db.service.OrganisaatioLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.TpOrganisationLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.YhteystietoLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.TpOrganisationLocalServiceBaseImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;
import static fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalServiceUtil.getInfrastructuresIdsByServicesIds;
import static fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil.getOrganisationsIdsByInfrastructuresIds;
import static fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalServiceUtil.getInfrastructuresIdsByContactsIds;
import static fi.csc.avaa.tupa.db.service.OrganisaatioLocalServiceUtil.*;
import static fi.csc.avaa.tupa.db.service.PalveluLocalServiceUtil.getServicesIdsByLocationTypesIds;
import static fi.csc.avaa.tupa.db.service.Palvelu_PalvelutyypitLocalServiceUtil.getServicesIdsByServiceTypesIds;
import static fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalServiceUtil.getServiceTypesIdsByDefinitionsIds;
import static fi.csc.avaa.tupa.db.service.SeliteLocalServiceUtil.getDefinitionsIdsByServiceTypes;
import static fi.csc.avaa.tupa.db.service.SeliteLocalServiceUtil.getLocationTypesIdsByLocationTypes;
import static fi.csc.avaa.tupa.db.service.TpInfrastructureLocalServiceUtil.getInfrastructuresIdsByUrns;
import static fi.csc.avaa.tupa.db.service.persistence.OrganisaatioUtil.findByisni;

/**
 * The implementation of the tp organisation local service.
 * <p>
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.TpOrganisationLocalService} interface.
 * <p>
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CSC
 * @see fi.csc.avaa.tupa.db.service.base.TpOrganisationLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.TpOrganisationLocalServiceUtil
 */
public class TpOrganisationLocalServiceImpl
		extends TpOrganisationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.TpOrganisationLocalServiceUtil} to access the tp organisation local service.
     */

	private static final AvaaLogger log = new AvaaLogger(TpOrganisationLocalServiceImpl.class.getName());

	public List<TpOrganisation> getAllOrganisations() {
		try {
			return getTpOrganisationsListFromOrganisaatiosList(getOrganisaatios(QueryUtil.ALL_POS, QueryUtil.ALL_POS));
		} catch (SystemException e) {
			log.error(e, e);
		}
		return null;
	}

	public List<TpOrganisation> getOrganisationsByOrganisationsIds(int[] organisationsIds) {
		if (isEmpty(organisationsIds)) return null;

		List<Organisaatio> list = new ArrayList<>();

		Arrays.stream(organisationsIds)
				.distinct()
				.forEach(id -> {
					try {
						list.add(getOrganisaatio(id));
					} catch (PortalException | SystemException e) {
						log.error(e, e);
					}
				});

		return getTpOrganisationsListFromOrganisaatiosList(list);
	}

	public List<TpOrganisation> getOrganisationsByIsnis(String[] organisationsIsnis) {
		if (isEmpty(organisationsIsnis)) return null;

		List<Organisaatio> list = new ArrayList<>();

		Arrays.stream(organisationsIsnis)
				.distinct()
				.forEach(isni -> {
					try {
						findByisni(isni).stream().forEach(list::add);
					} catch (SystemException e) {
						log.error(e, e);
					}
				});

		return getTpOrganisationsListFromOrganisaatiosList(list);
	}

	public List<TpOrganisation> getOrganisationsByInfrastructuresIds(int[] infrastructuresIds) {
		if (isEmpty(infrastructuresIds)) return null;

		int[] organisationsIds = getOrganisationsIdsByInfrastructuresIds(infrastructuresIds);

		return getOrganisationsByOrganisationsIds(organisationsIds);
	}

	public List<TpOrganisation> getOrganisationsByInfrastructuresUrns(String[] infrastructuresUrns) {
		if (isEmpty(infrastructuresUrns)) return null;

		int[] infrastructuresIds = getInfrastructuresIdsByUrns(infrastructuresUrns);
		int[] organisationsIds = getOrganisationsIdsByInfrastructuresIds(infrastructuresIds);

		return getOrganisationsByOrganisationsIds(organisationsIds);
	}

	public List<TpOrganisation> getOrganisationsByServicesIds(int[] servicesIds) {
		if (isEmpty(servicesIds)) return null;

		int[] infrastructuresIds = getInfrastructuresIdsByServicesIds(servicesIds);
		int[] organisationsIds = getOrganisationsIdsByInfrastructuresIds(infrastructuresIds);

		return getOrganisationsByOrganisationsIds(organisationsIds);
	}

	public List<TpOrganisation> getOrganisationsByContactsIds(int[] contactsIds) {
		if (isEmpty(contactsIds)) return null;

		int[] infrastructuresIds = getInfrastructuresIdsByContactsIds(contactsIds);
		int[] organisationsIds = getOrganisationsIdsByInfrastructuresIds(infrastructuresIds);

		return getOrganisationsByOrganisationsIds(organisationsIds);
	}

	public List<TpOrganisation> getOrganisationsByServiceTypes(String[] serviceTypes) {
		if (isEmpty(serviceTypes)) return null;

		int[] definitionsIds = getDefinitionsIdsByServiceTypes(serviceTypes);
		int[] serviceTypesIds = getServiceTypesIdsByDefinitionsIds(definitionsIds);
		int[] servicesIds = getServicesIdsByServiceTypesIds(serviceTypesIds);

		return getOrganisationsByServicesIds(servicesIds);
	}

	public List<TpOrganisation> getOrganisationsByLocationTypes(String[] locationTypes) {
		if (isEmpty(locationTypes)) return null;

		int[] locationTypesIds = getLocationTypesIdsByLocationTypes(locationTypes);
		int[] servicesIds = getServicesIdsByLocationTypesIds(locationTypesIds);

		return getOrganisationsByServicesIds(servicesIds);
	}

	public String[] getCountries() {

		return OrganisaatioLocalServiceUtil.getCountries();
	}

	private TpOrganisation getTpOrganisationFromOrganisaatio(Organisaatio organisaatio) {
		if (organisaatio == null) return null;

		int id = organisaatio.getOrganisaatio_id();
		TpOrganisation tp = TpOrganisationLocalServiceUtil.createTpOrganisation(id);
		tp.setName_EN(organisaatio.getName());
		tp.setName_FI(organisaatio.getNimi());
		tp.setCountry(organisaatio.getMaa());
		tp.setIsni(organisaatio.getISNI());
		tp.setMotherOrganisationsIds(organisaatio.getEmo_organisaatio());
		tp.setInfrastructuresIds(getInfrastructuresIdsByOrganisationId(id));
		tp.setServicesIds(getServicesIdsByOrganisationId(id));
		tp.setContactsIds(getContactsIdsByOrganisationId(id));

		return tp;
	}

	private List<TpOrganisation> getTpOrganisationsListFromOrganisaatiosList(List<Organisaatio> list) {
		if (list == null || list.isEmpty()) return null;

		return list
				.stream()
				.distinct()
				.map(this::getTpOrganisationFromOrganisaatio)
				.collect(Collectors.toList());
	}
}
