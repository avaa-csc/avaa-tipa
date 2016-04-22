package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link InfraLocalService}.
 *
 * @author pj,jmlehtin
 * @see InfraLocalService
 * @generated
 */
public class InfraLocalServiceWrapper implements InfraLocalService,
    ServiceWrapper<InfraLocalService> {
    private InfraLocalService _infraLocalService;

    public InfraLocalServiceWrapper(InfraLocalService infraLocalService) {
        _infraLocalService = infraLocalService;
    }

    /**
    * Adds the infra to the database. Also notifies the appropriate model listeners.
    *
    * @param infra the infra
    * @return the infra that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra addInfra(
        fi.csc.avaa.tupa.db.model.Infra infra)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infraLocalService.addInfra(infra);
    }

    /**
    * Creates a new infra with the primary key. Does not add the infra to the database.
    *
    * @param infra_id the primary key for the new infra
    * @return the new infra
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra createInfra(int infra_id) {
        return _infraLocalService.createInfra(infra_id);
    }

    /**
    * Deletes the infra with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_id the primary key of the infra
    * @return the infra that was removed
    * @throws PortalException if a infra with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra deleteInfra(int infra_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infraLocalService.deleteInfra(infra_id);
    }

    /**
    * Deletes the infra from the database. Also notifies the appropriate model listeners.
    *
    * @param infra the infra
    * @return the infra that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra deleteInfra(
        fi.csc.avaa.tupa.db.model.Infra infra)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infraLocalService.deleteInfra(infra);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _infraLocalService.dynamicQuery();
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
        return _infraLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _infraLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _infraLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _infraLocalService.dynamicQueryCount(dynamicQuery);
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
        return _infraLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra fetchInfra(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infraLocalService.fetchInfra(infra_id);
    }

    /**
    * Returns the infra with the primary key.
    *
    * @param infra_id the primary key of the infra
    * @return the infra
    * @throws PortalException if a infra with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra getInfra(int infra_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infraLocalService.getInfra(infra_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infraLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the infras.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infras
    * @param end the upper bound of the range of infras (not inclusive)
    * @return the range of infras
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra> getInfras(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infraLocalService.getInfras(start, end);
    }

    /**
    * Returns the number of infras.
    *
    * @return the number of infras
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getInfrasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infraLocalService.getInfrasCount();
    }

    /**
    * Updates the infra in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param infra the infra
    * @return the infra that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra updateInfra(
        fi.csc.avaa.tupa.db.model.Infra infra)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infraLocalService.updateInfra(infra);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _infraLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _infraLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _infraLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public InfraLocalService getWrappedInfraLocalService() {
        return _infraLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedInfraLocalService(InfraLocalService infraLocalService) {
        _infraLocalService = infraLocalService;
    }

    @Override
    public InfraLocalService getWrappedService() {
        return _infraLocalService;
    }

    @Override
    public void setWrappedService(InfraLocalService infraLocalService) {
        _infraLocalService = infraLocalService;
    }
}
