package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for TpInfrastructure. This utility wraps
 * {@link fi.csc.avaa.tupa.db.service.impl.TpInfrastructureServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author CSC
 * @see TpInfrastructureService
 * @see fi.csc.avaa.tupa.db.service.base.TpInfrastructureServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.TpInfrastructureServiceImpl
 * @generated
 */
public class TpInfrastructureServiceUtil {
    private static TpInfrastructureService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.TpInfrastructureServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
    * Returns a complete list of Infrastructure objects.
    *
    * @return list of Infrastructure as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getAllInfrastructures() {
        return getService().getAllInfrastructures();
    }

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure IDs.
    *
    * @param infrastructuresIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByInfrastructuresIds(
        int[] infrastructuresIds) {
        return getService()
                   .getInfrastructuresByInfrastructuresIds(infrastructuresIds);
    }

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure URNs.
    *
    * @param infrastructuresUrns array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByUrns(
        java.lang.String[] infrastructuresUrns) {
        return getService().getInfrastructuresByUrns(infrastructuresUrns);
    }

    /**
    * Returns a list of Infrastructure objects with provided Organisation IDs.
    *
    * @param organisationsIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByOrganisationIds(
        int[] organisationsIds) {
        return getService().getInfrastructuresByOrganisationIds(organisationsIds);
    }

    /**
    * Returns a list of Infrastructure objects with provided Service IDs.
    *
    * @param servicesIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByServiceIds(
        int[] servicesIds) {
        return getService().getInfrastructuresByServiceIds(servicesIds);
    }

    /**
    * Returns a list of Infrastructure objects with provided Contact IDs.
    *
    * @param contactIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByContactIds(
        int[] contactIds) {
        return getService().getInfrastructuresByContactIds(contactIds);
    }

    /**
    * Returns a list of Infrastructure objects with provided keyword. For list of available keywords
    *
    * @see #getKeywords()
    * @param keywords array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByKeywords(
        java.lang.String[] keywords) {
        return getService().getInfrastructuresByKeywords(keywords);
    }

    /**
    * Returns a list of Infrastructure objects with provided service types. For list of available service types
    *
    * @see TpServizeServiceImpl#getServiceTypes()
    * @param serviceTypes array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByServiceTypes(
        java.lang.String[] serviceTypes) {
        return getService().getInfrastructuresByServiceTypes(serviceTypes);
    }

    /**
    * Returns a list of Infrastructure objects with provided location types. For list of available location types
    *
    * @see TpServizeServiceImpl#getLocationTypes()
    * @param locationTypes array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByLocationTypes(
        java.lang.String[] locationTypes) {
        return getService().getInfrastructuresByLocationTypes(locationTypes);
    }

    /**
    * Returns a list of Infrastructure objects for related postal codes.
    *
    * @param PostalCodes array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPostalCodes(
        int[] PostalCodes) {
        return getService().getInfrastructuresByPostalCodes(PostalCodes);
    }

    /**
    * Returns a list of Infrastructure objects located at approximately (depends on the actual location) 1 km from exact coordinates.
    *
    * @param latitude double coordinate to search the DB for
    * @param longitude double coordinate to search the DB for
    * @return list of Infrastructures as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByLocation(
        double latitude, double longitude) {
        return getService().getInfrastructuresByLocation(latitude, longitude);
    }

    /**
    * Returns a list of Infrastructure objects for related countries. For list of available countries as two letter codes as in ISO 3166-1 alpha-2 standard.
    *
    * @see TpOrganisationServiceImpl#getCountries()
    * @param countries array of Strings to search the DB for (could be a single String)
    * @return list of Interface JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByCountries(
        java.lang.String[] countries) {
        return getService().getInfrastructuresByCountries(countries);
    }

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure previous IDs.
    *
    * @param previousIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPreviousIds(
        int[] previousIds) {
        return getService().getInfrastructuresByPreviousIds(previousIds);
    }

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure previous URNs.
    *
    * @param previousUrns array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPreviousUrns(
        java.lang.String[] previousUrns) {
        return getService().getInfrastructuresByPreviousUrns(previousUrns);
    }

    /**
    * Returns a double array of Strings for keywords.
    *
    * @return double array of Strings for keywords in English and Finnish respectively
    */
    public static java.lang.String[][] getKeywords() {
        return getService().getKeywords();
    }

    /**
    * Returns an array of Strings for overall existing PIDs.
    *
    * @return an array of Strings for of persistent identifiers' names
    */
    public static java.lang.String[] getPids() {
        return getService().getPids();
    }

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure PIDs.
    *
    * @param pids array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPids(
        java.lang.String[] pids) {
        return getService().getInfrastructuresByPids(pids);
    }

    public static void clearService() {
        _service = null;
    }

    public static TpInfrastructureService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    TpInfrastructureService.class.getName());

            if (invokableService instanceof TpInfrastructureService) {
                _service = (TpInfrastructureService) invokableService;
            } else {
                _service = new TpInfrastructureServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(TpInfrastructureServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(TpInfrastructureService service) {
    }
}
