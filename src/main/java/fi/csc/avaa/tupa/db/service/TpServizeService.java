package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for TpServize. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author CSC
 * @see TpServizeServiceUtil
 * @see fi.csc.avaa.tupa.db.service.base.TpServizeServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.TpServizeServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface TpServizeService extends BaseService, InvokableService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TpServizeServiceUtil} to access the tp servize remote service. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.TpServizeServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    /**
    * Returns a complete list of Service objects.
    *
    * @return list of Services as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getAllServices();

    /**
    * Returns a list of Service objects with provided Service IDs.
    *
    * @param servicesIds array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByServicesIds(
        int[] servicesIds);

    /**
    * Returns a list of Service objects for related Infrastructure IDs.
    *
    * @param infrastructuresIds array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByInfrastructuresIds(
        int[] infrastructuresIds);

    /**
    * Returns a list of Service objects for related Infrastructure URNs.
    *
    * @param infrastructuresUrns array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByInfrastructuresUrns(
        java.lang.String[] infrastructuresUrns);

    /**
    * Returns a list of Service objects for related Organisation IDs.
    *
    * @param organisationsIds array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByOrganisationsIds(
        int[] organisationsIds);

    /**
    * Returns a list of Service objects for related Contact IDs.
    *
    * @param contactsIds array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByContactsIds(
        int[] contactsIds);

    /**
    * Returns a list of Service objects for related keywords.
    *
    * @param keywords array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByKeywords(
        java.lang.String[] keywords);

    /**
    * Returns a list of Service objects for related service types. For list of available countries
    *
    * @see #getServiceTypes()
    * @param serviceTypes array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByServiceTypes(
        java.lang.String[] serviceTypes);

    /**
    * Returns a double array of Strings for service types.
    *
    * @return double array of Strings for service types in English and Finnish respectively
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.lang.String[][] getServiceTypes();

    /**
    * Returns a list of Service objects for location types. For list of available location
    *
    * @see #getLocationTypes()
    * @param locationTypes array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByLocationTypes(
        java.lang.String[] locationTypes);

    /**
    * Returns a double array of Strings for location types.
    *
    * @return double array of Strings for location types in English and Finnish respectively
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.lang.String[][] getLocationTypes();

    /**
    * Returns a list of Service objects for related postal codes.
    *
    * @param PostalCodes array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByPostalCodes(
        int[] PostalCodes);

    /**
    * Returns a list of Service objects located at approximately (depends on the actual location) 1 km from exact coordinates.
    *
    * @param latitude double coordinate to search the DB for
    * @param longitude double coordinate to search the DB for
    * @return list of Services as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByLocation(
        double latitude, double longitude);

    /**
    * Returns a list of Service objects for related countries. For list of available countries as two letter codes as in ISO 3166-1 alpha-2 standard.
    *
    * @see TpOrganisationServiceImpl#getCountries()
    * @param countries array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByCountries(
        java.lang.String[] countries);
}
