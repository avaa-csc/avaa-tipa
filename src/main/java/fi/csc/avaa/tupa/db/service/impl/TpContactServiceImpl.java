package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.security.ac.AccessControlled;
import fi.csc.avaa.tupa.db.model.TpContact;
import fi.csc.avaa.tupa.db.service.TpContactLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.TpContactServiceBaseImpl;

import java.util.List;

import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;

/**
 * This API class provides access to Contact entity.
 * <p>
 *
 * @author CSC
 * @version 1.0
 */
@JSONWebService("Contacts")
public class TpContactServiceImpl extends TpContactServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.TpContactServiceUtil} to access the tp contact remote service.
     */

	/**
	 * Returns a complete list of Contact objects.
	 *
	 * @return list of Contacts as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpContact> getAllContacts() {
		return TpContactLocalServiceUtil.getAllContacts();
	}

	/**
	 * Returns a list of Contact objects with provided Contact IDs.
	 *
	 * @param  contactIds array of integers to search the DB for (could be a single integer)
	 * @return list of Contacts as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpContact> getContactsByContactsIds(int[] contactIds) {
		if (isEmpty(contactIds)) return null;

		return TpContactLocalServiceUtil.getContactsByContactsIds(contactIds);
	}

	/**
	 * Returns a list of Contact objects with provided Infrastructure IDs.
	 *
	 * @param  infrastructuresIds array of integers to search the DB for (could be a single integer)
	 * @return list of Contacts as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpContact> getContactsByInfrastructuresIds(int[] infrastructuresIds) {
		if (isEmpty(infrastructuresIds)) return null;

		return TpContactLocalServiceUtil.getContactsByInfrastructuresIds(infrastructuresIds);
	}

	/**
	 * Returns a list of Contact objects with provided Infrastructure URNs.
	 *
	 * @param  infrastructuresUrns array of String to search the DB for (could be a single String)
	 * @return list of Contacts as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpContact> getContactsByInfrastructuresUrns(String[] infrastructuresUrns) {
		if (isEmpty(infrastructuresUrns)) return null;

		return TpContactLocalServiceUtil.getContactsByInfrastructuresUrns(infrastructuresUrns);
	}

	/**
	 * Returns a list of Contact objects with provided Organisation IDs.
	 *
	 * @param  organisationIds array of integers to search the DB for (could be a single integer)
	 * @return list of Contacts as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpContact> getContactsByOrganisationsIds(int[] organisationIds) {
		if (isEmpty(organisationIds)) return null;

		return TpContactLocalServiceUtil.getContactsByOrganisationsIds(organisationIds);
	}

	/**
	 * Returns a list of Contact objects with provided Service IDs.
	 *
	 * @param  serviceIds array of integers to search the DB for (could be a single integer)
	 * @return list of Contacts as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpContact> getContactsByServicesIds(int[] serviceIds) {
		if (isEmpty(serviceIds)) return null;

		return TpContactLocalServiceUtil.getContactsByServicesIds(serviceIds);
	}
}
