package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OrganisaatioLocalService}.
 *
 * @author CSC
 * @see OrganisaatioLocalService
 * @generated
 */
public class OrganisaatioLocalServiceWrapper implements OrganisaatioLocalService,
    ServiceWrapper<OrganisaatioLocalService> {
    private OrganisaatioLocalService _organisaatioLocalService;

    public OrganisaatioLocalServiceWrapper(
        OrganisaatioLocalService organisaatioLocalService) {
        _organisaatioLocalService = organisaatioLocalService;
    }

    /**
    * Adds the organisaatio to the database. Also notifies the appropriate model listeners.
    *
    * @param organisaatio the organisaatio
    * @return the organisaatio that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Organisaatio addOrganisaatio(
        fi.csc.avaa.tupa.db.model.Organisaatio organisaatio)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _organisaatioLocalService.addOrganisaatio(organisaatio);
    }

    /**
    * Creates a new organisaatio with the primary key. Does not add the organisaatio to the database.
    *
    * @param organisaatio_id the primary key for the new organisaatio
    * @return the new organisaatio
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Organisaatio createOrganisaatio(
        int organisaatio_id) {
        return _organisaatioLocalService.createOrganisaatio(organisaatio_id);
    }

    /**
    * Deletes the organisaatio with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param organisaatio_id the primary key of the organisaatio
    * @return the organisaatio that was removed
    * @throws PortalException if a organisaatio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Organisaatio deleteOrganisaatio(
        int organisaatio_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _organisaatioLocalService.deleteOrganisaatio(organisaatio_id);
    }

    /**
    * Deletes the organisaatio from the database. Also notifies the appropriate model listeners.
    *
    * @param organisaatio the organisaatio
    * @return the organisaatio that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Organisaatio deleteOrganisaatio(
        fi.csc.avaa.tupa.db.model.Organisaatio organisaatio)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _organisaatioLocalService.deleteOrganisaatio(organisaatio);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _organisaatioLocalService.dynamicQuery();
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
        return _organisaatioLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _organisaatioLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _organisaatioLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _organisaatioLocalService.dynamicQueryCount(dynamicQuery);
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
        return _organisaatioLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Organisaatio fetchOrganisaatio(
        int organisaatio_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _organisaatioLocalService.fetchOrganisaatio(organisaatio_id);
    }

    /**
    * Returns the organisaatio with the primary key.
    *
    * @param organisaatio_id the primary key of the organisaatio
    * @return the organisaatio
    * @throws PortalException if a organisaatio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Organisaatio getOrganisaatio(
        int organisaatio_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _organisaatioLocalService.getOrganisaatio(organisaatio_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _organisaatioLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the organisaatios.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of organisaatios
    * @param end the upper bound of the range of organisaatios (not inclusive)
    * @return the range of organisaatios
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> getOrganisaatios(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _organisaatioLocalService.getOrganisaatios(start, end);
    }

    /**
    * Returns the number of organisaatios.
    *
    * @return the number of organisaatios
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getOrganisaatiosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _organisaatioLocalService.getOrganisaatiosCount();
    }

    /**
    * Updates the organisaatio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param organisaatio the organisaatio
    * @return the organisaatio that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Organisaatio updateOrganisaatio(
        fi.csc.avaa.tupa.db.model.Organisaatio organisaatio)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _organisaatioLocalService.updateOrganisaatio(organisaatio);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _organisaatioLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _organisaatioLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _organisaatioLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public int[] getInfrastructuresIdsByOrganisationId(int organisationId) {
        return _organisaatioLocalService.getInfrastructuresIdsByOrganisationId(organisationId);
    }

    @Override
    public int[] getServicesIdsByOrganisationId(int organisationId) {
        return _organisaatioLocalService.getServicesIdsByOrganisationId(organisationId);
    }

    @Override
    public int[] getContactsIdsByOrganisationId(int organisationId) {
        return _organisaatioLocalService.getContactsIdsByOrganisationId(organisationId);
    }

    @Override
    public java.lang.String[] getCountries() {
        return _organisaatioLocalService.getCountries();
    }

    @Override
    public int[] getOrganisationsIdsByCountries(java.lang.String[] countries) {
        return _organisaatioLocalService.getOrganisationsIdsByCountries(countries);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public OrganisaatioLocalService getWrappedOrganisaatioLocalService() {
        return _organisaatioLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedOrganisaatioLocalService(
        OrganisaatioLocalService organisaatioLocalService) {
        _organisaatioLocalService = organisaatioLocalService;
    }

    @Override
    public OrganisaatioLocalService getWrappedService() {
        return _organisaatioLocalService;
    }

    @Override
    public void setWrappedService(
        OrganisaatioLocalService organisaatioLocalService) {
        _organisaatioLocalService = organisaatioLocalService;
    }
}
