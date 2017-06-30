package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for TpServize. This utility wraps
 * {@link fi.csc.avaa.tupa.db.service.impl.TpServizeServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author CSC
 * @see TpServizeService
 * @see fi.csc.avaa.tupa.db.service.base.TpServizeServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.TpServizeServiceImpl
 * @generated
 */
public class TpServizeServiceUtil {
    private static TpServizeService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.TpServizeServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
    * Returns a complete list of Service objects.
    *
    * @return list of Services as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getAllServices() {
        return getService().getAllServices();
    }

    /**
    * Returns a list of Service objects with provided Service IDs.
    *
    * @param servicesIds array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByServicesIds(
        int[] servicesIds) {
        return getService().getServicesByServicesIds(servicesIds);
    }

    /**
    * Returns a list of Service objects for related Infrastructure IDs.
    *
    * @param infrastructuresIds array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByInfrastructuresIds(
        int[] infrastructuresIds) {
        return getService().getServicesByInfrastructuresIds(infrastructuresIds);
    }

    /**
    * Returns a list of Service objects for related Infrastructure URNs.
    *
    * @param infrastructuresUrns array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByInfrastructuresUrns(
        java.lang.String[] infrastructuresUrns) {
        return getService().getServicesByInfrastructuresUrns(infrastructuresUrns);
    }

    /**
    * Returns a list of Service objects for related Organisation IDs.
    *
    * @param organisationsIds array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByOrganisationsIds(
        int[] organisationsIds) {
        return getService().getServicesByOrganisationsIds(organisationsIds);
    }

    /**
    * Returns a list of Service objects for related Contact IDs.
    *
    * @param contactsIds array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByContactsIds(
        int[] contactsIds) {
        return getService().getServicesByContactsIds(contactsIds);
    }

    /**
    * Returns a list of Service objects for related keywords.
    *
    * @param keywords array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByKeywords(
        java.lang.String[] keywords) {
        return getService().getServicesByKeywords(keywords);
    }

    /**
    * Returns a list of Service objects for related service types. For list of available countries
    *
    * @see #getServiceTypes()
    * @param serviceTypes array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByServiceTypes(
        java.lang.String[] serviceTypes) {
        return getService().getServicesByServiceTypes(serviceTypes);
    }

    /**
    * Returns a double array of Strings for service types.
    *
    * @return double array of Strings for service types in English and Finnish respectively
    */
    public static java.lang.String[][] getServiceTypes() {
        return getService().getServiceTypes();
    }

    /**
    * Returns a list of Service objects for location types. For list of available location
    *
    * @see #getLocationTypes()
    * @param locationTypes array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByLocationTypes(
        java.lang.String[] locationTypes) {
        return getService().getServicesByLocationTypes(locationTypes);
    }

    /**
    * Returns a double array of Strings for location types.
    *
    * @return double array of Strings for location types in English and Finnish respectively
    */
    public static java.lang.String[][] getLocationTypes() {
        return getService().getLocationTypes();
    }

    /**
    * Returns a list of Service objects for related postal codes.
    *
    * @param PostalCodes array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByPostalCodes(
        int[] PostalCodes) {
        return getService().getServicesByPostalCodes(PostalCodes);
    }

    /**
    * Returns a list of Service objects located at approximately (depends on the actual location) 1 km from exact coordinates.
    *
    * @param latitude double coordinate to search the DB for
    * @param longitude double coordinate to search the DB for
    * @return list of Services as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByLocation(
        double latitude, double longitude) {
        return getService().getServicesByLocation(latitude, longitude);
    }

    /**
    * Returns a list of Service objects for related countries. For list of available countries as two letter codes as in ISO 3166-1 alpha-2 standard.
    *
    * @see TpOrganisationServiceImpl#getCountries()
    * @param countries array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByCountries(
        java.lang.String[] countries) {
        return getService().getServicesByCountries(countries);
    }

    public static void clearService() {
        _service = null;
    }

    public static TpServizeService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    TpServizeService.class.getName());

            if (invokableService instanceof TpServizeService) {
                _service = (TpServizeService) invokableService;
            } else {
                _service = new TpServizeServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(TpServizeServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(TpServizeService service) {
    }
}
