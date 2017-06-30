package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TpContactService}.
 *
 * @author CSC
 * @see TpContactService
 * @generated
 */
public class TpContactServiceWrapper implements TpContactService,
    ServiceWrapper<TpContactService> {
    private TpContactService _tpContactService;

    public TpContactServiceWrapper(TpContactService tpContactService) {
        _tpContactService = tpContactService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _tpContactService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _tpContactService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _tpContactService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * Returns a complete list of Contact objects.
    *
    * @return list of Contacts as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getAllContacts() {
        return _tpContactService.getAllContacts();
    }

    /**
    * Returns a list of Contact objects with provided Contact IDs.
    *
    * @param contactIds array of integers to search the DB for (could be a single integer)
    * @return list of Contacts as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByContactsIds(
        int[] contactIds) {
        return _tpContactService.getContactsByContactsIds(contactIds);
    }

    /**
    * Returns a list of Contact objects with provided Infrastructure IDs.
    *
    * @param infrastructuresIds array of integers to search the DB for (could be a single integer)
    * @return list of Contacts as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByInfrastructuresIds(
        int[] infrastructuresIds) {
        return _tpContactService.getContactsByInfrastructuresIds(infrastructuresIds);
    }

    /**
    * Returns a list of Contact objects with provided Infrastructure URNs.
    *
    * @param infrastructuresUrns array of String to search the DB for (could be a single String)
    * @return list of Contacts as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByInfrastructuresUrns(
        java.lang.String[] infrastructuresUrns) {
        return _tpContactService.getContactsByInfrastructuresUrns(infrastructuresUrns);
    }

    /**
    * Returns a list of Contact objects with provided Organisation IDs.
    *
    * @param organisationIds array of integers to search the DB for (could be a single integer)
    * @return list of Contacts as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByOrganisationsIds(
        int[] organisationIds) {
        return _tpContactService.getContactsByOrganisationsIds(organisationIds);
    }

    /**
    * Returns a list of Contact objects with provided Service IDs.
    *
    * @param serviceIds array of integers to search the DB for (could be a single integer)
    * @return list of Contacts as JSON
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByServicesIds(
        int[] serviceIds) {
        return _tpContactService.getContactsByServicesIds(serviceIds);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TpContactService getWrappedTpContactService() {
        return _tpContactService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTpContactService(TpContactService tpContactService) {
        _tpContactService = tpContactService;
    }

    @Override
    public TpContactService getWrappedService() {
        return _tpContactService;
    }

    @Override
    public void setWrappedService(TpContactService tpContactService) {
        _tpContactService = tpContactService;
    }
}
