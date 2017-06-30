package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TpInfrastructureService}.
 *
 * @author CSC
 * @see TpInfrastructureService
 * @generated
 */
public class TpInfrastructureServiceWrapper implements TpInfrastructureService,
    ServiceWrapper<TpInfrastructureService> {
    private TpInfrastructureService _tpInfrastructureService;

    public TpInfrastructureServiceWrapper(
        TpInfrastructureService tpInfrastructureService) {
        _tpInfrastructureService = tpInfrastructureService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _tpInfrastructureService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _tpInfrastructureService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _tpInfrastructureService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
    * Returns a complete list of Infrastructure objects.
    *
    * @return list of Infrastructure as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getAllInfrastructures() {
        return _tpInfrastructureService.getAllInfrastructures();
    }

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure IDs.
    *
    * @param infrastructuresIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByInfrastructuresIds(
        int[] infrastructuresIds) {
        return _tpInfrastructureService.getInfrastructuresByInfrastructuresIds(infrastructuresIds);
    }

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure URNs.
    *
    * @param infrastructuresUrns array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByUrns(
        java.lang.String[] infrastructuresUrns) {
        return _tpInfrastructureService.getInfrastructuresByUrns(infrastructuresUrns);
    }

    /**
    * Returns a list of Infrastructure objects with provided Organisation IDs.
    *
    * @param organisationsIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByOrganisationIds(
        int[] organisationsIds) {
        return _tpInfrastructureService.getInfrastructuresByOrganisationIds(organisationsIds);
    }

    /**
    * Returns a list of Infrastructure objects with provided Service IDs.
    *
    * @param servicesIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByServiceIds(
        int[] servicesIds) {
        return _tpInfrastructureService.getInfrastructuresByServiceIds(servicesIds);
    }

    /**
    * Returns a list of Infrastructure objects with provided Contact IDs.
    *
    * @param contactIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByContactIds(
        int[] contactIds) {
        return _tpInfrastructureService.getInfrastructuresByContactIds(contactIds);
    }

    /**
    * Returns a list of Infrastructure objects with provided keyword. For list of available keywords
    *
    * @see #getKeywords()
    * @param keywords array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByKeywords(
        java.lang.String[] keywords) {
        return _tpInfrastructureService.getInfrastructuresByKeywords(keywords);
    }

    /**
    * Returns a list of Infrastructure objects with provided service types. For list of available service types
    *
    * @see TpServizeServiceImpl#getServiceTypes()
    * @param serviceTypes array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByServiceTypes(
        java.lang.String[] serviceTypes) {
        return _tpInfrastructureService.getInfrastructuresByServiceTypes(serviceTypes);
    }

    /**
    * Returns a list of Infrastructure objects with provided location types. For list of available location types
    *
    * @see TpServizeServiceImpl#getLocationTypes()
    * @param locationTypes array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByLocationTypes(
        java.lang.String[] locationTypes) {
        return _tpInfrastructureService.getInfrastructuresByLocationTypes(locationTypes);
    }

    /**
    * Returns a list of Infrastructure objects for related postal codes.
    *
    * @param PostalCodes array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPostalCodes(
        int[] PostalCodes) {
        return _tpInfrastructureService.getInfrastructuresByPostalCodes(PostalCodes);
    }

    /**
    * Returns a list of Infrastructure objects located at approximately (depends on the actual location) 1 km from exact coordinates.
    *
    * @param latitude double coordinate to search the DB for
    * @param longitude double coordinate to search the DB for
    * @return list of Infrastructures as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByLocation(
        double latitude, double longitude) {
        return _tpInfrastructureService.getInfrastructuresByLocation(latitude,
            longitude);
    }

    /**
    * Returns a list of Infrastructure objects for related countries. For list of available countries as two letter codes as in ISO 3166-1 alpha-2 standard.
    *
    * @see TpOrganisationServiceImpl#getCountries()
    * @param countries array of Strings to search the DB for (could be a single String)
    * @return list of Interface JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByCountries(
        java.lang.String[] countries) {
        return _tpInfrastructureService.getInfrastructuresByCountries(countries);
    }

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure previous IDs.
    *
    * @param previousIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPreviousIds(
        int[] previousIds) {
        return _tpInfrastructureService.getInfrastructuresByPreviousIds(previousIds);
    }

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure previous URNs.
    *
    * @param previousUrns array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPreviousUrns(
        java.lang.String[] previousUrns) {
        return _tpInfrastructureService.getInfrastructuresByPreviousUrns(previousUrns);
    }

    /**
    * Returns a double array of Strings for keywords.
    *
    * @return double array of Strings for keywords in English and Finnish respectively
    */
    @Override
    public java.lang.String[][] getKeywords() {
        return _tpInfrastructureService.getKeywords();
    }

    /**
    * Returns an array of Strings for overall existing PIDs.
    *
    * @return an array of Strings for of persistent identifiers' names
    */
    @Override
    public java.lang.String[] getPids() {
        return _tpInfrastructureService.getPids();
    }

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure PIDs.
    *
    * @param pids array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPids(
        java.lang.String[] pids) {
        return _tpInfrastructureService.getInfrastructuresByPids(pids);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TpInfrastructureService getWrappedTpInfrastructureService() {
        return _tpInfrastructureService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTpInfrastructureService(
        TpInfrastructureService tpInfrastructureService) {
        _tpInfrastructureService = tpInfrastructureService;
    }

    @Override
    public TpInfrastructureService getWrappedService() {
        return _tpInfrastructureService;
    }

    @Override
    public void setWrappedService(
        TpInfrastructureService tpInfrastructureService) {
        _tpInfrastructureService = tpInfrastructureService;
    }
}
