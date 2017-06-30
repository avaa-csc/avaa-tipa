package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.security.ac.AccessControlled;
import fi.csc.avaa.tupa.db.model.TpInfrastructure;
import fi.csc.avaa.tupa.db.service.TpInfrastructureLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.TpInfrastructureServiceBaseImpl;

import java.util.List;

import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;

/**
 * This API class provides access to Infrastructure entity.
 * <p>
 *
 * @author CSC
 * @version 1.0
 */
@JSONWebService("Infrastructures")
public class TpInfrastructureServiceImpl extends TpInfrastructureServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.TpInfrastructureServiceUtil} to access the tp infrastructure remote service.
     */
	
	/**
	 * Returns a complete list of Infrastructure objects.
	 *
	 * @return list of Infrastructure as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpInfrastructure> getAllInfrastructures() {
		return TpInfrastructureLocalServiceUtil.getAllInfrastructures();
	}

	/**
	 * Returns a list of Infrastructure objects with provided Infrastructure IDs.
	 *
	 * @param  infrastructuresIds array of integers to search the DB for (could be a single integer)
	 * @return list of Infrastructures as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpInfrastructure> getInfrastructuresByInfrastructuresIds(int[] infrastructuresIds) {
		if (isEmpty(infrastructuresIds)) return null;

		return TpInfrastructureLocalServiceUtil.getInfrastructuresByInfrastructuresIds(infrastructuresIds);
	}

	/**
	 * Returns a list of Infrastructure objects with provided Infrastructure URNs.
	 *
	 * @param  infrastructuresUrns array of Strings to search the DB for (could be a single String)
	 * @return list of Infrastructures as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpInfrastructure> getInfrastructuresByUrns(String[] infrastructuresUrns) {
		if (isEmpty(infrastructuresUrns)) return null;

		return TpInfrastructureLocalServiceUtil.getInfrastructuresByUrns(infrastructuresUrns);
	}

	/**
	 * Returns a list of Infrastructure objects with provided Organisation IDs.
	 *
	 * @param  organisationsIds array of integers to search the DB for (could be a single integer)
	 * @return list of Infrastructures as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpInfrastructure> getInfrastructuresByOrganisationIds(int[] organisationsIds) {
		if (isEmpty(organisationsIds)) return null;
		
		return TpInfrastructureLocalServiceUtil.getInfrastructuresByOrganisationIds(organisationsIds);
	}

	/**
	 * Returns a list of Infrastructure objects with provided Service IDs.
	 *
	 * @param  servicesIds array of integers to search the DB for (could be a single integer)
	 * @return list of Infrastructures as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpInfrastructure> getInfrastructuresByServiceIds(int[] servicesIds) {
		if (isEmpty(servicesIds)) return null;

		return TpInfrastructureLocalServiceUtil.getInfrastructuresByServiceIds(servicesIds);
	}

	/**
	 * Returns a list of Infrastructure objects with provided Contact IDs.
	 *
	 * @param  contactIds array of integers to search the DB for (could be a single integer)
	 * @return list of Infrastructures as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpInfrastructure> getInfrastructuresByContactIds(int[] contactIds) {
		if (isEmpty(contactIds)) return null;

		return TpInfrastructureLocalServiceUtil.getInfrastructuresByContactIds(contactIds);
	}

	/**
	 * Returns a list of Infrastructure objects with provided keyword. For list of available keywords
	 * @see #getKeywords()
	 *
	 * @param  keywords array of integers to search the DB for (could be a single integer)
	 * @return list of Infrastructures as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpInfrastructure> getInfrastructuresByKeywords(String[] keywords) {
		if (isEmpty(keywords)) return null;

		return TpInfrastructureLocalServiceUtil.getInfrastructuresByKeywords(keywords);
	}

	/**
	 * Returns a list of Infrastructure objects with provided service types. For list of available service types
	 * @see TpServizeServiceImpl#getServiceTypes() 
	 *
	 * @param  serviceTypes array of Strings to search the DB for (could be a single String)
	 * @return list of Infrastructures as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpInfrastructure> getInfrastructuresByServiceTypes(String[] serviceTypes) {
		if (isEmpty(serviceTypes)) return null;

		return TpInfrastructureLocalServiceUtil.getInfrastructuresByServiceTypes(serviceTypes);
	}

	/**
	 * Returns a list of Infrastructure objects with provided location types. For list of available location types
	 * @see TpServizeServiceImpl#getLocationTypes()   

	 * @param  locationTypes array of Strings to search the DB for (could be a single String)
	 * @return list of Infrastructures as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpInfrastructure> getInfrastructuresByLocationTypes(String[] locationTypes) {
		if (isEmpty(locationTypes)) return null;

		return TpInfrastructureLocalServiceUtil.getInfrastructuresByLocationTypes(locationTypes);
	}

	/**
	 * Returns a list of Infrastructure objects for related postal codes.
	 * 
	 * @param  PostalCodes array of integers to search the DB for (could be a single integer)
	 * @return list of Infrastructures as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpInfrastructure> getInfrastructuresByPostalCodes(int[] PostalCodes) {
		if (isEmpty(PostalCodes)) return null;

		return TpInfrastructureLocalServiceUtil.getInfrastructuresByPostalCodes(PostalCodes);
	}

	/**
	 * Returns a list of Infrastructure objects located at approximately (depends on the actual location) 1 km from exact coordinates.
	 *
	 * @param  latitude double coordinate to search the DB for
	 * @param  longitude double coordinate to search the DB for
	 * @return list of Infrastructures as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpInfrastructure> getInfrastructuresByLocation(double latitude, double longitude) {

		return TpInfrastructureLocalServiceUtil.getInfrastructuresByLocation(latitude, longitude);
	}

	/**
	 * Returns a list of Infrastructure objects for related countries. For list of available countries as two letter codes as in ISO 3166-1 alpha-2 standard.
	 * @see TpOrganisationServiceImpl#getCountries()
	 *
	 * @param  countries array of Strings to search the DB for (could be a single String)
	 * @return list of Interface JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpInfrastructure> getInfrastructuresByCountries(String[] countries) {
		if (isEmpty(countries)) return null;

		return TpInfrastructureLocalServiceUtil.getInfrastructuresByCountries(countries);
	}

	/**
	 * Returns a list of Infrastructure objects with provided Infrastructure previous IDs.
	 *
	 * @param  previousIds array of integers to search the DB for (could be a single integer)
	 * @return list of Infrastructures as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpInfrastructure> getInfrastructuresByPreviousIds(int[] previousIds) {
		if (isEmpty(previousIds)) return null;

		return TpInfrastructureLocalServiceUtil.getInfrastructuresByPreviousIds(previousIds);
	}

	/**
	 * Returns a list of Infrastructure objects with provided Infrastructure previous URNs.
	 *
	 * @param  previousUrns array of Strings to search the DB for (could be a single String)
	 * @return list of Infrastructures as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpInfrastructure> getInfrastructuresByPreviousUrns(String[] previousUrns) {
		if (isEmpty(previousUrns)) return null;

		return TpInfrastructureLocalServiceUtil.getInfrastructuresByUrns(previousUrns);
	}

	/**
	 * Returns a double array of Strings for keywords.
	 *
	 * @return double array of Strings for keywords in English and Finnish respectively
	 */
	@AccessControlled(guestAccessEnabled = true)
	public String[][] getKeywords() {

		return TpInfrastructureLocalServiceUtil.getKeywords();
	}

	/**
	 * Returns an array of Strings for overall existing PIDs.
	 *
	 * @return an array of Strings for of persistent identifiers' names
	 */
	@AccessControlled(guestAccessEnabled = true)
	public String[] getPids() {

		return TpInfrastructureLocalServiceUtil.getPids();
	}

	/**
	 * Returns a list of Infrastructure objects with provided Infrastructure PIDs.
	 *
	 * @param  pids array of Strings to search the DB for (could be a single String)
	 * @return list of Infrastructures as JSON
	 */
	@AccessControlled(guestAccessEnabled = true)
	public List<TpInfrastructure> getInfrastructuresByPids(String[] pids) {
		if (isEmpty(pids)) return null;

		return TpInfrastructureLocalServiceUtil.getInfrastructuresByPids(pids);
	}
}
