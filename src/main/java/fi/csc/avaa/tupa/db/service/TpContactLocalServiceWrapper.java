package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TpContactLocalService}.
 *
 * @author CSC
 * @see TpContactLocalService
 * @generated
 */
public class TpContactLocalServiceWrapper implements TpContactLocalService,
    ServiceWrapper<TpContactLocalService> {
    private TpContactLocalService _tpContactLocalService;

    public TpContactLocalServiceWrapper(
        TpContactLocalService tpContactLocalService) {
        _tpContactLocalService = tpContactLocalService;
    }

    /**
    * Adds the tp contact to the database. Also notifies the appropriate model listeners.
    *
    * @param tpContact the tp contact
    * @return the tp contact that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpContact addTpContact(
        fi.csc.avaa.tupa.db.model.TpContact tpContact)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpContactLocalService.addTpContact(tpContact);
    }

    /**
    * Creates a new tp contact with the primary key. Does not add the tp contact to the database.
    *
    * @param id the primary key for the new tp contact
    * @return the new tp contact
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpContact createTpContact(int id) {
        return _tpContactLocalService.createTpContact(id);
    }

    /**
    * Deletes the tp contact with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the tp contact
    * @return the tp contact that was removed
    * @throws PortalException if a tp contact with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpContact deleteTpContact(int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tpContactLocalService.deleteTpContact(id);
    }

    /**
    * Deletes the tp contact from the database. Also notifies the appropriate model listeners.
    *
    * @param tpContact the tp contact
    * @return the tp contact that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpContact deleteTpContact(
        fi.csc.avaa.tupa.db.model.TpContact tpContact)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpContactLocalService.deleteTpContact(tpContact);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _tpContactLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpContactLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _tpContactLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpContactLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpContactLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpContactLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.TpContact fetchTpContact(int id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpContactLocalService.fetchTpContact(id);
    }

    /**
    * Returns the tp contact with the primary key.
    *
    * @param id the primary key of the tp contact
    * @return the tp contact
    * @throws PortalException if a tp contact with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpContact getTpContact(int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tpContactLocalService.getTpContact(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tpContactLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the tp contacts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp contacts
    * @param end the upper bound of the range of tp contacts (not inclusive)
    * @return the range of tp contacts
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getTpContacts(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpContactLocalService.getTpContacts(start, end);
    }

    /**
    * Returns the number of tp contacts.
    *
    * @return the number of tp contacts
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getTpContactsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpContactLocalService.getTpContactsCount();
    }

    /**
    * Updates the tp contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param tpContact the tp contact
    * @return the tp contact that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpContact updateTpContact(
        fi.csc.avaa.tupa.db.model.TpContact tpContact)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpContactLocalService.updateTpContact(tpContact);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _tpContactLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _tpContactLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _tpContactLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getAllContacts() {
        return _tpContactLocalService.getAllContacts();
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByContactsIds(
        int[] contactIds) {
        return _tpContactLocalService.getContactsByContactsIds(contactIds);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByInfrastructuresIds(
        int[] infrastructuresIds) {
        return _tpContactLocalService.getContactsByInfrastructuresIds(infrastructuresIds);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByInfrastructuresUrns(
        java.lang.String[] infrastructuresUrns) {
        return _tpContactLocalService.getContactsByInfrastructuresUrns(infrastructuresUrns);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByOrganisationsIds(
        int[] organisationIds) {
        return _tpContactLocalService.getContactsByOrganisationsIds(organisationIds);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByServicesIds(
        int[] serviceIds) {
        return _tpContactLocalService.getContactsByServicesIds(serviceIds);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.TpContact getTpContactFromYhteystieto(
        fi.csc.avaa.tupa.db.model.Yhteystieto yhteystieto) {
        return _tpContactLocalService.getTpContactFromYhteystieto(yhteystieto);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TpContactLocalService getWrappedTpContactLocalService() {
        return _tpContactLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTpContactLocalService(
        TpContactLocalService tpContactLocalService) {
        _tpContactLocalService = tpContactLocalService;
    }

    @Override
    public TpContactLocalService getWrappedService() {
        return _tpContactLocalService;
    }

    @Override
    public void setWrappedService(TpContactLocalService tpContactLocalService) {
        _tpContactLocalService = tpContactLocalService;
    }
}
