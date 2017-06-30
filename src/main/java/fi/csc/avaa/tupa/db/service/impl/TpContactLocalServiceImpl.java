package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.model.TpContact;
import fi.csc.avaa.tupa.db.model.Yhteystieto;
import fi.csc.avaa.tupa.db.service.TpContactLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.YhteystietoLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.TpContactLocalServiceBaseImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;
import static fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalServiceUtil.getInfrastructuresIdsByServicesIds;
import static fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil.getInfrastructuresIdsByOrganisationsIds;
import static fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalServiceUtil.getContactsIdsByInfrastructuresIds;
import static fi.csc.avaa.tupa.db.service.TpInfrastructureLocalServiceUtil.getInfrastructuresIdsByUrns;
import static fi.csc.avaa.tupa.db.service.YhteystietoLocalServiceUtil.*;

/**
 * The implementation of the tp contact local service.
 * <p>
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.TpContactLocalService} interface.
 * <p>
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CSC
 * @see fi.csc.avaa.tupa.db.service.base.TpContactLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.TpContactLocalServiceUtil
 */
public class TpContactLocalServiceImpl extends TpContactLocalServiceBaseImpl {
	/*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.TpContactLocalServiceUtil} to access the tp contact local service.
     */

	private static final AvaaLogger log = new AvaaLogger(TpContactLocalServiceImpl.class.getName());

	public List<TpContact> getAllContacts() {
		try {
			return getTpContactsListFromYhteystietosList(getYhteystietos(QueryUtil.ALL_POS, QueryUtil.ALL_POS));
		} catch (SystemException e) {
			log.error(e, e);
		}
		return null;
	}

	public List<TpContact> getContactsByContactsIds(int[] contactIds) {
		if (isEmpty(contactIds)) return null;

		List<Yhteystieto> list = new ArrayList<>();

		Arrays.stream(contactIds)
				.distinct()
				.forEach(id -> {
			try {
				list.add(YhteystietoLocalServiceUtil.getYhteystieto(id));
			} catch (PortalException | SystemException e) {
				log.error(e, e);
			}
				});

		return getTpContactsListFromYhteystietosList(list);
	}

	public List<TpContact> getContactsByInfrastructuresIds(int[] infrastructuresIds) {
		if (isEmpty(infrastructuresIds)) return null;

		int[] contactsIds = getContactsIdsByInfrastructuresIds(infrastructuresIds);

		return getContactsByContactsIds(contactsIds);
	}

	public List<TpContact> getContactsByInfrastructuresUrns(String[] infrastructuresUrns) {
		if (isEmpty(infrastructuresUrns)) return null;

		int[] infrastructuresIds = getInfrastructuresIdsByUrns(infrastructuresUrns);
		int[] contactsIds = getContactsIdsByInfrastructuresIds(infrastructuresIds);

		return getContactsByContactsIds(contactsIds);
	}

	public List<TpContact> getContactsByOrganisationsIds(int[] organisationIds) {
		if (isEmpty(organisationIds)) return null;

		int[] infrastructuresIds = getInfrastructuresIdsByOrganisationsIds(organisationIds);
		int[] contactsIds = getContactsIdsByInfrastructuresIds(infrastructuresIds);

		return getContactsByContactsIds(contactsIds);
	}

	public List<TpContact> getContactsByServicesIds(int[] serviceIds) {
		if (isEmpty(serviceIds)) return null;

		int[] infrastructuresIds = getInfrastructuresIdsByServicesIds(serviceIds);
		int[] contactsIds = getContactsIdsByInfrastructuresIds(infrastructuresIds);

		return getContactsByContactsIds(contactsIds);
	}

	public TpContact getTpContactFromYhteystieto(Yhteystieto yhteystieto) {
		if (yhteystieto == null) return null;

		int id = yhteystieto.getYhteystieto_id();
		TpContact tp = TpContactLocalServiceUtil.createTpContact(id);
		tp.setEmail(yhteystieto.getSahkoposti());
		tp.setPhone(yhteystieto.getPuhelin());
		tp.setTitle(yhteystieto.getTitteli());
		tp.setFirstName(yhteystieto.getEtunimi());
		tp.setLastName(yhteystieto.getSukunimi());
		tp.setUrl(yhteystieto.getURL());
		tp.setDescription_EN(yhteystieto.getDescription());
		tp.setDescription_FI(yhteystieto.getKuvaus());
		tp.setInfrastructuresIds(getInfrastructuresIdsByContactId(id));
		tp.setServicesIds(getServicesIdsByContactId(id));
		tp.setOrganisationsIds(getOrganisationsIdsByContactId(id));
		
		return tp;
	}

	private List<TpContact> getTpContactsListFromYhteystietosList(List<Yhteystieto> list) {
		if (list == null || list.isEmpty()) return null;

		return list
				.stream()
				.distinct()
				.map(this::getTpContactFromYhteystieto)
				.collect(Collectors.toList());
	}
}
