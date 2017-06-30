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
 * Provides the remote service interface for TpOrganisation. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author CSC
 * @see TpOrganisationServiceUtil
 * @see fi.csc.avaa.tupa.db.service.base.TpOrganisationServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.TpOrganisationServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface TpOrganisationService extends BaseService, InvokableService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TpOrganisationServiceUtil} to access the tp organisation remote service. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.TpOrganisationServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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
    * Returns a complete list of Organisation objects.
    *
    * @return list of Organisation as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getAllOrganisations();

    /**
    * Returns a list of Organisation objects with provided Organisation IDs.
    *
    * @param organisationsIds array of integers to search the DB for (could be a single integer)
    * @return list of Organisations as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByOrganisationsIds(
        int[] organisationsIds);

    /**
    * Returns a list of Organisation objects with provided Organisation ISNIs.
    *
    * @param organisationsIsnis array of Strings to search the DB for (could be a single String)
    * @return list of Organisations as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByIsnis(
        java.lang.String[] organisationsIsnis);

    /**
    * Returns a list of Organisation objects with provided Infrastructure IDs.
    *
    * @param infrastructuresIds array of integers to search the DB for (could be a single integer)
    * @return list of Organisations as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByInfrastructuresIds(
        int[] infrastructuresIds);

    /**
    * Returns a list of Organisation objects with provided Infrastructure URNs.
    *
    * @param infrastructuresUrns array of Strings to search the DB for (could be a single String)
    * @return list of Organisations as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByInfrastructuresUrns(
        java.lang.String[] infrastructuresUrns);

    /**
    * Returns a list of Organisation objects with provided Service IDs.
    *
    * @param servicesIds array of integers to search the DB for (could be a single integer)
    * @return list of Organisations as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByServicesIds(
        int[] servicesIds);

    /**
    * Returns a list of Organisation objects with provided Contacts IDs.
    *
    * @param contactsIds array of integers to search the DB for (could be a single integer)
    * @return list of Organisations as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByContactsIds(
        int[] contactsIds);

    /**
    * Returns a list of Organisation objects with provided location types. For list of available service types
    *
    * @see TpServizeServiceImpl#getServiceTypes()
    * @param serviceTypes array of Strings to search the DB for (could be a single String)
    * @return list of Organisations as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByServiceTypes(
        java.lang.String[] serviceTypes);

    /**
    * Returns a list of Organisation objects with provided location types. For list of available location types
    *
    * @see TpServizeServiceImpl#getLocationTypes()
    * @param locationTypes array of Strings to search the DB for (could be a single String)
    * @return list of Organisations as JSON
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByLocationTypes(
        java.lang.String[] locationTypes);

    /**
    * Returns an array of Strings for available countries as two letter codes as in ISO 3166-1 alpha-2 standard.
    *
    * @return array of Strings
    */
    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.lang.String[] getCountries();
}
