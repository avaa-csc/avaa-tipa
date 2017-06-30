package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.security.ac.AccessControlled;
import fi.csc.avaa.tupa.db.model.TpServize;
import fi.csc.avaa.tupa.db.service.TpServizeLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.TpServizeServiceBaseImpl;

import java.util.List;

import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;

/**
 * This API class provides access to Service entity.
 * <p>
 *
 * @version 1.0
 * @author CSC
 */
@JSONWebService("Services")
public class TpServizeServiceImpl extends TpServizeServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.TpServizeServiceUtil} to access the tp servize remote service.
     */

	/**
	 * Returns a complete list of Service objects.
	 *
	 * @return list of Services as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpServize> getAllServices() {
		return TpServizeLocalServiceUtil.getAllServices();
	}

	/**
	 * Returns a list of Service objects with provided Service IDs.
	 *
	 * @param  servicesIds array of integers to search the DB for (could be a single integer)
	 * @return list of Services as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpServize> getServicesByServicesIds(int[] servicesIds) {
		if (isEmpty(servicesIds)) return null;

		return TpServizeLocalServiceUtil.getServicesByServicesIds(servicesIds);
	}

	/**
	 * Returns a list of Service objects for related Infrastructure IDs.
	 *
	 * @param  infrastructuresIds array of integers to search the DB for (could be a single integer)
	 * @return list of Services as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpServize> getServicesByInfrastructuresIds(int[] infrastructuresIds) {
		if (isEmpty(infrastructuresIds)) return null;

		return TpServizeLocalServiceUtil.getServicesByInfrastructuresIds(infrastructuresIds);
	}

	/**
	 * Returns a list of Service objects for related Infrastructure URNs.
	 *
	 * @param  infrastructuresUrns array of Strings to search the DB for (could be a single String)
	 * @return list of Services as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpServize> getServicesByInfrastructuresUrns(String[] infrastructuresUrns) {
		if (isEmpty(infrastructuresUrns)) return null;

		return TpServizeLocalServiceUtil.getServicesByInfrastructuresUrns(infrastructuresUrns);
	}

	/**
	 * Returns a list of Service objects for related Organisation IDs.
	 *
	 * @param  organisationsIds array of integers to search the DB for (could be a single integer)
	 * @return list of Services as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpServize> getServicesByOrganisationsIds(int[] organisationsIds) {
		if (isEmpty(organisationsIds)) return null;

		return TpServizeLocalServiceUtil.getServicesByOrganisationsIds(organisationsIds);
	}

	/**
	 * Returns a list of Service objects for related Contact IDs.
	 *
	 * @param  contactsIds array of integers to search the DB for (could be a single integer)
	 * @return list of Services as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpServize> getServicesByContactsIds(int[] contactsIds) {
		if (isEmpty(contactsIds)) return null;

		return TpServizeLocalServiceUtil.getServicesByContactsIds(contactsIds);
	}

	/**
	 * Returns a list of Service objects for related keywords.
	 *
	 * @param  keywords array of Strings to search the DB for (could be a single String)
	 * @return list of Services as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpServize> getServicesByKeywords(String[] keywords) {
		if (isEmpty(keywords)) return null;

		return TpServizeLocalServiceUtil.getServicesByKeywords(keywords);
	}

	/**
	 * Returns a list of Service objects for related service types. For list of available countries
	 * @see #getServiceTypes()
	 *
	 * @param  serviceTypes array of Strings to search the DB for (could be a single String)
	 * @return list of Services as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpServize> getServicesByServiceTypes(String[] serviceTypes) {
		if (isEmpty(serviceTypes)) return null;

		return TpServizeLocalServiceUtil.getServicesByServiceTypes(serviceTypes);
	}

	/**
	 * Returns a double array of Strings for service types.
	 *
	 * @return double array of Strings for service types in English and Finnish respectively
	 */
	@AccessControlled(guestAccessEnabled = true)
	public String[][] getServiceTypes() {

		return TpServizeLocalServiceUtil.getServiceTypes();
	}
	
	/**
	 * Returns a list of Service objects for location types. For list of available location
	 * @see #getLocationTypes()
	 *
	 * @param  locationTypes array of Strings to search the DB for (could be a single String)
	 * @return list of Services as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpServize> getServicesByLocationTypes(String[] locationTypes) {
		if (isEmpty(locationTypes)) return null;

		return TpServizeLocalServiceUtil.getServicesByLocationTypes(locationTypes);
	}

	/**
	 * Returns a double array of Strings for location types.
	 *
	 * @return double array of Strings for location types in English and Finnish respectively
	 */
	@AccessControlled(guestAccessEnabled = true)
	public String[][] getLocationTypes() {

		return TpServizeLocalServiceUtil.getLocationTypes();
	}

	/**
	 * Returns a list of Service objects for related postal codes.
	 *
	 * @param  PostalCodes array of integers to search the DB for (could be a single integer)
	 * @return list of Services as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpServize> getServicesByPostalCodes(int[] PostalCodes) {
		if (isEmpty(PostalCodes)) return null;

		return TpServizeLocalServiceUtil.getServicesByPostalCodes(PostalCodes);
	}

	/**
	 * Returns a list of Service objects located at approximately (depends on the actual location) 1 km from exact coordinates.
	 *
	 * @param  latitude double coordinate to search the DB for
	 * @param  longitude double coordinate to search the DB for
	 * @return list of Services as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpServize> getServicesByLocation(double latitude, double longitude) {

		return TpServizeLocalServiceUtil.getServicesByLocation(latitude, longitude);
	}

	/**
	 * Returns a list of Service objects for related countries. For list of available countries as two letter codes as in ISO 3166-1 alpha-2 standard.
	 * @see TpOrganisationServiceImpl#getCountries() 
	 *
	 * @param  countries array of Strings to search the DB for (could be a single String)
	 * @return list of Services as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpServize> getServicesByCountries(String[] countries) {
		if (isEmpty(countries)) return null;

		return TpServizeLocalServiceUtil.getServicesByCountries(countries);
	}
}
