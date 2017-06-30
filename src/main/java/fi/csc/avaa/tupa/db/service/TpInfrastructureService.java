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
 * Provides the remote service interface for TpInfrastructure. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author CSC
 * @see TpInfrastructureServiceUtil
 * @see fi.csc.avaa.tupa.db.service.base.TpInfrastructureServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.TpInfrastructureServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface TpInfrastructureService extends BaseService, InvokableService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TpInfrastructureServiceUtil} to access the tp infrastructure remote service. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.TpInfrastructureServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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
    * Returns a complete list of Infrastructure objects.
    *
    * @return list of Infrastructure as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getAllInfrastructures();

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure IDs.
    *
    * @param infrastructuresIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByInfrastructuresIds(
        int[] infrastructuresIds);

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure URNs.
    *
    * @param infrastructuresUrns array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByUrns(
        java.lang.String[] infrastructuresUrns);

    /**
    * Returns a list of Infrastructure objects with provided Organisation IDs.
    *
    * @param organisationsIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByOrganisationIds(
        int[] organisationsIds);

    /**
    * Returns a list of Infrastructure objects with provided Service IDs.
    *
    * @param servicesIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByServiceIds(
        int[] servicesIds);

    /**
    * Returns a list of Infrastructure objects with provided Contact IDs.
    *
    * @param contactIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByContactIds(
        int[] contactIds);

    /**
    * Returns a list of Infrastructure objects with provided keyword. For list of available keywords
    *
    * @see #getKeywords()
    * @param keywords array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByKeywords(
        java.lang.String[] keywords);

    /**
    * Returns a list of Infrastructure objects with provided service types. For list of available service types
    *
    * @see TpServizeServiceImpl#getServiceTypes()
    * @param serviceTypes array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByServiceTypes(
        java.lang.String[] serviceTypes);

    /**
    * Returns a list of Infrastructure objects with provided location types. For list of available location types
    *
    * @see TpServizeServiceImpl#getLocationTypes()
    * @param locationTypes array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByLocationTypes(
        java.lang.String[] locationTypes);

    /**
    * Returns a list of Infrastructure objects for related postal codes.
    *
    * @param PostalCodes array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPostalCodes(
        int[] PostalCodes);

    /**
    * Returns a list of Infrastructure objects located at approximately (depends on the actual location) 1 km from exact coordinates.
    *
    * @param latitude double coordinate to search the DB for
    * @param longitude double coordinate to search the DB for
    * @return list of Infrastructures as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByLocation(
        double latitude, double longitude);

    /**
    * Returns a list of Infrastructure objects for related countries. For list of available countries as two letter codes as in ISO 3166-1 alpha-2 standard.
    *
    * @see TpOrganisationServiceImpl#getCountries()
    * @param countries array of Strings to search the DB for (could be a single String)
    * @return list of Interface JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByCountries(
        java.lang.String[] countries);

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure previous IDs.
    *
    * @param previousIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPreviousIds(
        int[] previousIds);

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure previous URNs.
    *
    * @param previousUrns array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPreviousUrns(
        java.lang.String[] previousUrns);

    /**
    * Returns a double array of Strings for keywords.
    *
    * @return double array of Strings for keywords in English and Finnish respectively
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.lang.String[][] getKeywords();

    /**
    * Returns an array of Strings for overall existing PIDs.
    *
    * @return an array of Strings for of persistent identifiers' names
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.lang.String[] getPids();

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure PIDs.
    *
    * @param pids array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPids(
        java.lang.String[] pids);
}
