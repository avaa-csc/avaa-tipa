package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TpOrganisationService}.
 *
 * @author CSC
 * @see TpOrganisationService
 * @generated
 */
public class TpOrganisationServiceWrapper implements TpOrganisationService,
    ServiceWrapper<TpOrganisationService> {
    private TpOrganisationService _tpOrganisationService;

    public TpOrganisationServiceWrapper(
        TpOrganisationService tpOrganisationService) {
        _tpOrganisationService = tpOrganisationService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _tpOrganisationService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _tpOrganisationService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _tpOrganisationService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
    * Returns a complete list of Organisation objects.
    *
    * @return list of Organisation as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getAllOrganisations() {
        return _tpOrganisationService.getAllOrganisations();
    }

    /**
    * Returns a list of Organisation objects with provided Organisation IDs.
    *
    * @param organisationsIds array of integers to search the DB for (could be a single integer)
    * @return list of Organisations as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByOrganisationsIds(
        int[] organisationsIds) {
        return _tpOrganisationService.getOrganisationsByOrganisationsIds(organisationsIds);
    }

    /**
    * Returns a list of Organisation objects with provided Organisation ISNIs.
    *
    * @param organisationsIsnis array of Strings to search the DB for (could be a single String)
    * @return list of Organisations as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByIsnis(
        java.lang.String[] organisationsIsnis) {
        return _tpOrganisationService.getOrganisationsByIsnis(organisationsIsnis);
    }

    /**
    * Returns a list of Organisation objects with provided Infrastructure IDs.
    *
    * @param infrastructuresIds array of integers to search the DB for (could be a single integer)
    * @return list of Organisations as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByInfrastructuresIds(
        int[] infrastructuresIds) {
        return _tpOrganisationService.getOrganisationsByInfrastructuresIds(infrastructuresIds);
    }

    /**
    * Returns a list of Organisation objects with provided Infrastructure URNs.
    *
    * @param infrastructuresUrns array of Strings to search the DB for (could be a single String)
    * @return list of Organisations as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByInfrastructuresUrns(
        java.lang.String[] infrastructuresUrns) {
        return _tpOrganisationService.getOrganisationsByInfrastructuresUrns(infrastructuresUrns);
    }

    /**
    * Returns a list of Organisation objects with provided Service IDs.
    *
    * @param servicesIds array of integers to search the DB for (could be a single integer)
    * @return list of Organisations as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByServicesIds(
        int[] servicesIds) {
        return _tpOrganisationService.getOrganisationsByServicesIds(servicesIds);
    }

    /**
    * Returns a list of Organisation objects with provided Contacts IDs.
    *
    * @param contactsIds array of integers to search the DB for (could be a single integer)
    * @return list of Organisations as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByContactsIds(
        int[] contactsIds) {
        return _tpOrganisationService.getOrganisationsByContactsIds(contactsIds);
    }

    /**
    * Returns a list of Organisation objects with provided location types. For list of available service types
    *
    * @see TpServizeServiceImpl#getServiceTypes()
    * @param serviceTypes array of Strings to search the DB for (could be a single String)
    * @return list of Organisations as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByServiceTypes(
        java.lang.String[] serviceTypes) {
        return _tpOrganisationService.getOrganisationsByServiceTypes(serviceTypes);
    }

    /**
    * Returns a list of Organisation objects with provided location types. For list of available location types
    *
    * @see TpServizeServiceImpl#getLocationTypes()
    * @param locationTypes array of Strings to search the DB for (could be a single String)
    * @return list of Organisations as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByLocationTypes(
        java.lang.String[] locationTypes) {
        return _tpOrganisationService.getOrganisationsByLocationTypes(locationTypes);
    }

    /**
    * Returns an array of Strings for available countries as two letter codes as in ISO 3166-1 alpha-2 standard.
    *
    * @return array of Strings
    */
    @Override
    public java.lang.String[] getCountries() {
        return _tpOrganisationService.getCountries();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TpOrganisationService getWrappedTpOrganisationService() {
        return _tpOrganisationService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTpOrganisationService(
        TpOrganisationService tpOrganisationService) {
        _tpOrganisationService = tpOrganisationService;
    }

    @Override
    public TpOrganisationService getWrappedService() {
        return _tpOrganisationService;
    }

    @Override
    public void setWrappedService(TpOrganisationService tpOrganisationService) {
        _tpOrganisationService = tpOrganisationService;
    }
}
