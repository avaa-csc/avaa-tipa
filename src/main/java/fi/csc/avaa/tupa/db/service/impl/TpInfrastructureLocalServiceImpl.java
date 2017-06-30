package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.model.*;
import fi.csc.avaa.tupa.db.service.*;
import fi.csc.avaa.tupa.db.service.base.TpInfrastructureLocalServiceBaseImpl;
import fi.csc.avaa.tupa.db.service.persistence.InfraUtil;
import fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;
import static fi.csc.avaa.tupa.common.TupaAPIConst.createURN;
import static fi.csc.avaa.tupa.common.TupaConst.BASE_URN;
import static fi.csc.avaa.tupa.db.service.AvainsanaLocalServiceUtil.*;
import static fi.csc.avaa.tupa.db.service.InfraLocalServiceUtil.getInfras;
import static fi.csc.avaa.tupa.db.service.Infra_AvainsanatLocalServiceUtil.getInfrastructuresIdsByKeywordsIds;
import static fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalServiceUtil.getInfrastructuresIdsByServicesIds;
import static fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalServiceUtil.getServicesIdsByInfrastructureId;
import static fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil.getInfrastructuresIdsByOrganisationsIds;
import static fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil.getOrganisationsIdsByInfrastructureId;
import static fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalServiceUtil.getContactsIdsByInfrastructureId;
import static fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalServiceUtil.getInfrastructuresIdsByContactsIds;
import static fi.csc.avaa.tupa.db.service.OrganisaatioLocalServiceUtil.getOrganisationsIdsByCountries;
import static fi.csc.avaa.tupa.db.service.PalveluLocalServiceUtil.*;
import static fi.csc.avaa.tupa.db.service.Palvelu_PalvelutyypitLocalServiceUtil.getServicesIdsByServiceTypesIds;
import static fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalServiceUtil.getServiceTypesIdsByDefinitionsIds;
import static fi.csc.avaa.tupa.db.service.SeliteLocalServiceUtil.getDefinitionsIdsByServiceTypes;
import static fi.csc.avaa.tupa.db.service.SeliteLocalServiceUtil.getLocationTypesIdsByLocationTypes;

/**
 * The implementation of the tp infrastructure local service.
 * <p>
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.TpInfrastructureLocalService} interface.
 * <p>
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CSC
 * @see fi.csc.avaa.tupa.db.service.base.TpInfrastructureLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.TpInfrastructureLocalServiceUtil
 */
public class TpInfrastructureLocalServiceImpl
		extends TpInfrastructureLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.TpInfrastructureLocalServiceUtil} to access the tp infrastructure local service.
     */

	private static final AvaaLogger log = new AvaaLogger(TpInfrastructureLocalServiceImpl.class.getName());

	public List<TpInfrastructure> getAllInfrastructures() {
		try {
			return getTpInfrastructuresListFromInfrasList(getInfras(QueryUtil.ALL_POS, QueryUtil.ALL_POS));
		} catch (SystemException e) {
			log.error(e, e);
		}
		return null;
	}

	public List<TpInfrastructure> getInfrastructuresByInfrastructuresIds(int[] infrastructuresIds) {
		if (isEmpty(infrastructuresIds)) return null;

		List<Infra> list = new ArrayList<>();

		Arrays.stream(infrastructuresIds)
				.distinct()
				.forEach(id -> {
					try {
						list.add(InfraLocalServiceUtil.getInfra(id));
					} catch (PortalException | SystemException e) {
						log.error(e, e);
					}
				});

		return getTpInfrastructuresListFromInfrasList(list);
	}

	public List<TpInfrastructure> getInfrastructuresByUrns(String[] urns) {
		if (isEmpty(urns)) return null;

		int[] infrastructuresIds = getInfrastructuresIdsByUrns(urns);

		return getInfrastructuresByInfrastructuresIds(infrastructuresIds);
	}

	public List<TpInfrastructure> getInfrastructuresByOrganisationIds(int[] organisationsIds) {
		if (isEmpty(organisationsIds)) return null;

		int[] infrastructuresIds = getInfrastructuresIdsByOrganisationsIds(organisationsIds);

		return getInfrastructuresByInfrastructuresIds(infrastructuresIds);
	}

	public List<TpInfrastructure> getInfrastructuresByServiceIds(int[] servicesIds) {
		if (isEmpty(servicesIds)) return null;

		int[] infrastructuresIds = getInfrastructuresIdsByServicesIds(servicesIds);

		return getInfrastructuresByInfrastructuresIds(infrastructuresIds);
	}

	public List<TpInfrastructure> getInfrastructuresByContactIds(int[] contactIds) {
		if (isEmpty(contactIds)) return null;

		int[] infrastructuresIds = getInfrastructuresIdsByContactsIds(contactIds);

		return getInfrastructuresByInfrastructuresIds(infrastructuresIds);
	}

	public List<TpInfrastructure> getInfrastructuresByKeywords(String[] keywords) {
		if (isEmpty(keywords)) return null;

		int[] keywordsIds = getKeywordsIdsByKeywords(keywords);
		int[] infrastructuresIds = getInfrastructuresIdsByKeywordsIds(keywordsIds);

		return getInfrastructuresByInfrastructuresIds(infrastructuresIds);
	}

	public List<TpInfrastructure> getInfrastructuresByServiceTypes(String[] serviceTypes) {
		if (isEmpty(serviceTypes)) return null;

		int[] definitionsIds = getDefinitionsIdsByServiceTypes(serviceTypes);
		int[] serviceTypesIds = getServiceTypesIdsByDefinitionsIds(definitionsIds);
		int[] servicesIds = getServicesIdsByServiceTypesIds(serviceTypesIds);
		int[] infrastructuresIds = getInfrastructuresIdsByServicesIds(servicesIds);

		return getInfrastructuresByInfrastructuresIds(infrastructuresIds);
	}

	public List<TpInfrastructure> getInfrastructuresByLocationTypes(String[] locationTypes) {
		if (isEmpty(locationTypes)) return null;

		int[] locationTypesIds = getLocationTypesIdsByLocationTypes(locationTypes);
		int[] servicesIds = getServicesIdsByLocationTypesIds(locationTypesIds);

		int[] infrastructuresIds = getInfrastructuresIdsByServicesIds(servicesIds);

		return getInfrastructuresByInfrastructuresIds(infrastructuresIds);
	}

	public List<TpInfrastructure> getInfrastructuresByPostalCodes(int[] PostalCodes) {
		if (isEmpty(PostalCodes)) return null;

		int[] servicesIds = getServicesIdsByPostalCodes(PostalCodes);
		int[] infrastructuresIds = getInfrastructuresIdsByServicesIds(servicesIds);

		return getInfrastructuresByInfrastructuresIds(infrastructuresIds);
	}

	public List<TpInfrastructure> getInfrastructuresByLocation(double latitude, double longitude) {

		int[] servicesIds = getServicesIdsByLocation(latitude, longitude);
		int[] infrastructuresIds = getInfrastructuresIdsByServicesIds(servicesIds);

		return getInfrastructuresByInfrastructuresIds(infrastructuresIds);
	}

	public List<TpInfrastructure> getInfrastructuresByCountries(String[] countries) {
		if (isEmpty(countries)) return null;

		int[] organisationIds = getOrganisationsIdsByCountries(countries);
		int[] infrastructuresIds = getInfrastructuresIdsByOrganisationsIds(organisationIds);

		return getInfrastructuresByInfrastructuresIds(infrastructuresIds);
	}

	public List<TpInfrastructure> getInfrastructuresByPreviousIds(int[] previousIds) {
		if (isEmpty(previousIds)) return null;

		List<Infra> list = new ArrayList<>();

		Arrays.stream(previousIds)
				.distinct()
				.forEach(id -> {
					try {
						InfraUtil.findBypreviousId(id).stream().forEach(list::add);
					} catch (SystemException e) {
						log.error(e, e);
					}
				});

		return getTpInfrastructuresListFromInfrasList(list);
	}

	public String[][] getKeywords() {

		return AvainsanaLocalServiceUtil.getKeywords();
	}

	public String[] getPids() {

		return IdentifierLocalServiceUtil.getPidsArray();
	}

	public List<TpInfrastructure> getInfrastructuresByPids(String[] PIDs) {
		if (isEmpty(PIDs)) return null;

		List<Integer> infrastructuresIdsList = new ArrayList<>();

		Arrays.stream(PIDs)
				.distinct()
				.forEach(pid -> {
					try {
						Infra_IdentifierUtil.findByidentifierValue(pid).stream().map(Infra_IdentifierModel::getInfra_id).forEach(infrastructuresIdsList::add);
					} catch (SystemException e) {
						log.error(e, e);
					}
				});

		int[] infrastructuresIds = infrastructuresIdsList.stream().mapToInt(Integer::intValue).toArray();
		return getInfrastructuresByInfrastructuresIds(infrastructuresIds);
	}

	//todo when such data will appear in DB ;-)
	public List<TpInfrastructure> getInfrastructuresByPreviousUrns(String[] previousUrns) {
		if (isEmpty(previousUrns)) return null;

		return null;
	}

	private TpInfrastructure getTpInfrastructureFromInfra(Infra infra) {
		if (infra == null) return null;

		int id = infra.getInfra_id();
		TpInfrastructure tp = TpInfrastructureLocalServiceUtil.createTpInfrastructure(id);
		tp.setUrn(createURN(infra));
		tp.setPids(getPidsJson(id));
		tp.setName_EN(infra.getName());
		tp.setName_FI(infra.getNimi());
		tp.setAcronym_EN(infra.getAcronym());
		tp.setAcronym_FI(infra.getLyhenne());
		tp.setDescription_EN(infra.getDescription());
		tp.setDescription_FI(infra.getKuvaus());
		tp.setActive(infra.getAktiivinen());
		tp.setPreparationsStarted(infra.getValmistelu_aloitusvuosi());
		tp.setBuildingStarted(infra.getRakennus_aloitusvuosi());
		tp.setOperationsStarted(infra.getToiminta_aloitusvuosi());
		tp.setOperationsFinished(infra.getToiminta_lopetusvuosi());
		tp.setKeywords_EN(getKeywords_ENbyInfrastructureId(id));
		tp.setKeywords_FI(getKeywords_FIbyInfrastructureId(id));
		tp.setFormerIds(String.valueOf(infra.getEdellinen_infra()));
		tp.setFormerUrns(null);
		tp.setServicesIds(getServicesIdsByInfrastructureId(id));
		tp.setOrganisationsIds(getOrganisationsIdsByInfrastructureId(id));
		tp.setContactsIds(getContactsIdsByInfrastructureId(id));

		return tp;
	}

	private List<TpInfrastructure> getTpInfrastructuresListFromInfrasList(List<Infra> list) {
		if (list == null || list.isEmpty()) return null;

		return list
				.stream()
				.distinct()
				.map(this::getTpInfrastructureFromInfra)
				.collect(Collectors.toList());
	}

	public int[] getInfrastructuresIdsByUrns(String[] urns) {
		if (isEmpty(urns)) return null;

		// number 8 is the the date partition length in "urn:nbn:fi:csc-infras-201607251"
		return Arrays.stream(urns).mapToInt(urn -> Integer.valueOf(urn.substring(BASE_URN.length() + 8, urn.length()))).toArray();
	}

	public JSONObject getPidsJson(int infraId) {
		if (infraId == 0) return null;

		JSONObject pids = JSONFactoryUtil.createJSONObject();

		List<Infra_Identifier> infraIdentifiers = Infra_IdentifierLocalServiceUtil.getExtendedInfraIdentifiersList(infraId);

		if (infraIdentifiers != null) {
			for (int i = 0; i < infraIdentifiers.size(); i++) {
				pids.put(infraIdentifiers.get(i).getIdentifier_name(), infraIdentifiers.get(i).getIdentifier_value());
			}
		}
		
		return pids;
	}
}
