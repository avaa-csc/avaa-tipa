package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.security.ac.AccessControlled;
import fi.csc.avaa.tupa.db.model.TpOrganisation;
import fi.csc.avaa.tupa.db.service.TpOrganisationLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.TpOrganisationServiceBaseImpl;

import java.util.List;

import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;

/**
 * This API class provides access to Organisation entity.
 * <p>
 *
 * @author CSC
 * @version 1.0
 */
@JSONWebService("Organisations")
public class TpOrganisationServiceImpl extends TpOrganisationServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.TpOrganisationServiceUtil} to access the tp organisation remote service.
     */

	/**
	 * Returns a complete list of Organisation objects.
	 *
	 * @return list of Organisation as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpOrganisation> getAllOrganisations() {
		return TpOrganisationLocalServiceUtil.getAllOrganisations();
	}

	/**
	 * Returns a list of Organisation objects with provided Organisation IDs.
	 *
	 * @param  organisationsIds array of integers to search the DB for (could be a single integer)
	 * @return list of Organisations as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpOrganisation> getOrganisationsByOrganisationsIds(int[] organisationsIds) {
		if (isEmpty(organisationsIds)) return null;

		return TpOrganisationLocalServiceUtil.getOrganisationsByOrganisationsIds(organisationsIds);
	}

	/**
	 * Returns a list of Organisation objects with provided Organisation ISNIs.
	 *
	 * @param  organisationsIsnis array of Strings to search the DB for (could be a single String)
	 * @return list of Organisations as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpOrganisation> getOrganisationsByIsnis(String[] organisationsIsnis) {
		if (isEmpty(organisationsIsnis)) return null;

		return TpOrganisationLocalServiceUtil.getOrganisationsByIsnis(organisationsIsnis);
	}

	/**
	 * Returns a list of Organisation objects with provided Infrastructure IDs.
	 *
	 * @param  infrastructuresIds array of integers to search the DB for (could be a single integer)
	 * @return list of Organisations as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpOrganisation> getOrganisationsByInfrastructuresIds(int[] infrastructuresIds) {
		if (isEmpty(infrastructuresIds)) return null;

		return TpOrganisationLocalServiceUtil.getOrganisationsByInfrastructuresIds(infrastructuresIds);
	}

	/**
	 * Returns a list of Organisation objects with provided Infrastructure URNs.
	 *
	 * @param  infrastructuresUrns array of Strings to search the DB for (could be a single String)
	 * @return list of Organisations as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpOrganisation> getOrganisationsByInfrastructuresUrns(String[] infrastructuresUrns) {
		if (isEmpty(infrastructuresUrns)) return null;

		return TpOrganisationLocalServiceUtil.getOrganisationsByInfrastructuresUrns(infrastructuresUrns);
	}

	/**
	 * Returns a list of Organisation objects with provided Service IDs.
	 *
	 * @param  servicesIds array of integers to search the DB for (could be a single integer)
	 * @return list of Organisations as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpOrganisation> getOrganisationsByServicesIds(int[] servicesIds) {
		if (isEmpty(servicesIds)) return null;

		return TpOrganisationLocalServiceUtil.getOrganisationsByServicesIds(servicesIds);
	}

	/**
	 * Returns a list of Organisation objects with provided Contacts IDs.
	 *
	 * @param  contactsIds array of integers to search the DB for (could be a single integer)
	 * @return list of Organisations as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpOrganisation> getOrganisationsByContactsIds(int[] contactsIds) {
		if (isEmpty(contactsIds)) return null;

		return TpOrganisationLocalServiceUtil.getOrganisationsByContactsIds(contactsIds);
	}

	/**
	 * Returns a list of Organisation objects with provided location types. For list of available service types
	 * @see TpServizeServiceImpl#getServiceTypes()
	 *
	 * @param  serviceTypes array of Strings to search the DB for (could be a single String)
	 * @return list of Organisations as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpOrganisation> getOrganisationsByServiceTypes(String[] serviceTypes) {
		if (isEmpty(serviceTypes)) return null;

		return TpOrganisationLocalServiceUtil.getOrganisationsByServiceTypes(serviceTypes);
	}

	/**
	 * Returns a list of Organisation objects with provided location types. For list of available location types
	 * @see TpServizeServiceImpl#getLocationTypes() 
	 *
	 * @param  locationTypes array of Strings to search the DB for (could be a single String)
	 * @return list of Organisations as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpOrganisation> getOrganisationsByLocationTypes(String[] locationTypes) {
		if (isEmpty(locationTypes)) return null;

		return TpOrganisationLocalServiceUtil.getOrganisationsByLocationTypes(locationTypes);
	}

	/**
	 * Returns an array of Strings for available countries as two letter codes as in ISO 3166-1 alpha-2 standard.
	 *
	 * @return array of Strings
	 */
	@AccessControlled(guestAccessEnabled = true)
	public String[] getCountries() {

		return TpOrganisationLocalServiceUtil.getCountries();
	}
}
