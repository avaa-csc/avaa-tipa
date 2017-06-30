package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TpServizeService}.
 *
 * @author CSC
 * @see TpServizeService
 * @generated
 */
public class TpServizeServiceWrapper implements TpServizeService,
    ServiceWrapper<TpServizeService> {
    private TpServizeService _tpServizeService;

    public TpServizeServiceWrapper(TpServizeService tpServizeService) {
        _tpServizeService = tpServizeService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _tpServizeService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _tpServizeService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _tpServizeService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * Returns a complete list of Service objects.
    *
    * @return list of Services as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getAllServices() {
        return _tpServizeService.getAllServices();
    }

    /**
    * Returns a list of Service objects with provided Service IDs.
    *
    * @param servicesIds array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByServicesIds(
        int[] servicesIds) {
        return _tpServizeService.getServicesByServicesIds(servicesIds);
    }

    /**
    * Returns a list of Service objects for related Infrastructure IDs.
    *
    * @param infrastructuresIds array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByInfrastructuresIds(
        int[] infrastructuresIds) {
        return _tpServizeService.getServicesByInfrastructuresIds(infrastructuresIds);
    }

    /**
    * Returns a list of Service objects for related Infrastructure URNs.
    *
    * @param infrastructuresUrns array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByInfrastructuresUrns(
        java.lang.String[] infrastructuresUrns) {
        return _tpServizeService.getServicesByInfrastructuresUrns(infrastructuresUrns);
    }

    /**
    * Returns a list of Service objects for related Organisation IDs.
    *
    * @param organisationsIds array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByOrganisationsIds(
        int[] organisationsIds) {
        return _tpServizeService.getServicesByOrganisationsIds(organisationsIds);
    }

    /**
    * Returns a list of Service objects for related Contact IDs.
    *
    * @param contactsIds array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByContactsIds(
        int[] contactsIds) {
        return _tpServizeService.getServicesByContactsIds(contactsIds);
    }

    /**
    * Returns a list of Service objects for related keywords.
    *
    * @param keywords array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByKeywords(
        java.lang.String[] keywords) {
        return _tpServizeService.getServicesByKeywords(keywords);
    }

    /**
    * Returns a list of Service objects for related service types. For list of available countries
    *
    * @see #getServiceTypes()
    * @param serviceTypes array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByServiceTypes(
        java.lang.String[] serviceTypes) {
        return _tpServizeService.getServicesByServiceTypes(serviceTypes);
    }

    /**
    * Returns a double array of Strings for service types.
    *
    * @return double array of Strings for service types in English and Finnish respectively
    */
    @Override
    public java.lang.String[][] getServiceTypes() {
        return _tpServizeService.getServiceTypes();
    }

    /**
    * Returns a list of Service objects for location types. For list of available location
    *
    * @see #getLocationTypes()
    * @param locationTypes array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByLocationTypes(
        java.lang.String[] locationTypes) {
        return _tpServizeService.getServicesByLocationTypes(locationTypes);
    }

    /**
    * Returns a double array of Strings for location types.
    *
    * @return double array of Strings for location types in English and Finnish respectively
    */
    @Override
    public java.lang.String[][] getLocationTypes() {
        return _tpServizeService.getLocationTypes();
    }

    /**
    * Returns a list of Service objects for related postal codes.
    *
    * @param PostalCodes array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByPostalCodes(
        int[] PostalCodes) {
        return _tpServizeService.getServicesByPostalCodes(PostalCodes);
    }

    /**
    * Returns a list of Service objects located at approximately (depends on the actual location) 1 km from exact coordinates.
    *
    * @param latitude double coordinate to search the DB for
    * @param longitude double coordinate to search the DB for
    * @return list of Services as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByLocation(
        double latitude, double longitude) {
        return _tpServizeService.getServicesByLocation(latitude, longitude);
    }

    /**
    * Returns a list of Service objects for related countries. For list of available countries as two letter codes as in ISO 3166-1 alpha-2 standard.
    *
    * @see TpOrganisationServiceImpl#getCountries()
    * @param countries array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByCountries(
        java.lang.String[] countries) {
        return _tpServizeService.getServicesByCountries(countries);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TpServizeService getWrappedTpServizeService() {
        return _tpServizeService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTpServizeService(TpServizeService tpServizeService) {
        _tpServizeService = tpServizeService;
    }

    @Override
    public TpServizeService getWrappedService() {
        return _tpServizeService;
    }

    @Override
    public void setWrappedService(TpServizeService tpServizeService) {
        _tpServizeService = tpServizeService;
    }
}
