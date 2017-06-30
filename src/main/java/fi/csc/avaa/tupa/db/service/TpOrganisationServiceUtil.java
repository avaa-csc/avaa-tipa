package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for TpOrganisation. This utility wraps
 * {@link fi.csc.avaa.tupa.db.service.impl.TpOrganisationServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author CSC
 * @see TpOrganisationService
 * @see fi.csc.avaa.tupa.db.service.base.TpOrganisationServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.TpOrganisationServiceImpl
 * @generated
 */
public class TpOrganisationServiceUtil {
    private static TpOrganisationService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.TpOrganisationServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * Returns a complete list of Organisation objects.
    *
    * @return list of Organisation as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getAllOrganisations() {
        return getService().getAllOrganisations();
    }

    /**
    * Returns a list of Organisation objects with provided Organisation IDs.
    *
    * @param organisationsIds array of integers to search the DB for (could be a single integer)
    * @return list of Organisations as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByOrganisationsIds(
        int[] organisationsIds) {
        return getService().getOrganisationsByOrganisationsIds(organisationsIds);
    }

    /**
    * Returns a list of Organisation objects with provided Organisation ISNIs.
    *
    * @param organisationsIsnis array of Strings to search the DB for (could be a single String)
    * @return list of Organisations as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByIsnis(
        java.lang.String[] organisationsIsnis) {
        return getService().getOrganisationsByIsnis(organisationsIsnis);
    }

    /**
    * Returns a list of Organisation objects with provided Infrastructure IDs.
    *
    * @param infrastructuresIds array of integers to search the DB for (could be a single integer)
    * @return list of Organisations as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByInfrastructuresIds(
        int[] infrastructuresIds) {
        return getService()
                   .getOrganisationsByInfrastructuresIds(infrastructuresIds);
    }

    /**
    * Returns a list of Organisation objects with provided Infrastructure URNs.
    *
    * @param infrastructuresUrns array of Strings to search the DB for (could be a single String)
    * @return list of Organisations as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByInfrastructuresUrns(
        java.lang.String[] infrastructuresUrns) {
        return getService()
                   .getOrganisationsByInfrastructuresUrns(infrastructuresUrns);
    }

    /**
    * Returns a list of Organisation objects with provided Service IDs.
    *
    * @param servicesIds array of integers to search the DB for (could be a single integer)
    * @return list of Organisations as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByServicesIds(
        int[] servicesIds) {
        return getService().getOrganisationsByServicesIds(servicesIds);
    }

    /**
    * Returns a list of Organisation objects with provided Contacts IDs.
    *
    * @param contactsIds array of integers to search the DB for (could be a single integer)
    * @return list of Organisations as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByContactsIds(
        int[] contactsIds) {
        return getService().getOrganisationsByContactsIds(contactsIds);
    }

    /**
    * Returns a list of Organisation objects with provided location types. For list of available service types
    *
    * @see TpServizeServiceImpl#getServiceTypes()
    * @param serviceTypes array of Strings to search the DB for (could be a single String)
    * @return list of Organisations as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByServiceTypes(
        java.lang.String[] serviceTypes) {
        return getService().getOrganisationsByServiceTypes(serviceTypes);
    }

    /**
    * Returns a list of Organisation objects with provided location types. For list of available location types
    *
    * @see TpServizeServiceImpl#getLocationTypes()
    * @param locationTypes array of Strings to search the DB for (could be a single String)
    * @return list of Organisations as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByLocationTypes(
        java.lang.String[] locationTypes) {
        return getService().getOrganisationsByLocationTypes(locationTypes);
    }

    /**
    * Returns an array of Strings for available countries as two letter codes as in ISO 3166-1 alpha-2 standard.
    *
    * @return array of Strings
    */
    public static java.lang.String[] getCountries() {
        return getService().getCountries();
    }

    public static void clearService() {
        _service = null;
    }

    public static TpOrganisationService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    TpOrganisationService.class.getName());

            if (invokableService instanceof TpOrganisationService) {
                _service = (TpOrganisationService) invokableService;
            } else {
                _service = new TpOrganisationServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(TpOrganisationServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(TpOrganisationService service) {
    }
}
