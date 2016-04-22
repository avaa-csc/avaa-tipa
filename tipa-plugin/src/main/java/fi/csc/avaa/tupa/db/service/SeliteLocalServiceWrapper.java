package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SeliteLocalService}.
 *
 * @author pj,jmlehtin
 * @see SeliteLocalService
 * @generated
 */
public class SeliteLocalServiceWrapper implements SeliteLocalService,
    ServiceWrapper<SeliteLocalService> {
    private SeliteLocalService _seliteLocalService;

    public SeliteLocalServiceWrapper(SeliteLocalService seliteLocalService) {
        _seliteLocalService = seliteLocalService;
    }

    /**
    * Adds the selite to the database. Also notifies the appropriate model listeners.
    *
    * @param selite the selite
    * @return the selite that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Selite addSelite(
        fi.csc.avaa.tupa.db.model.Selite selite)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _seliteLocalService.addSelite(selite);
    }

    /**
    * Creates a new selite with the primary key. Does not add the selite to the database.
    *
    * @param selite_id the primary key for the new selite
    * @return the new selite
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Selite createSelite(int selite_id) {
        return _seliteLocalService.createSelite(selite_id);
    }

    /**
    * Deletes the selite with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param selite_id the primary key of the selite
    * @return the selite that was removed
    * @throws PortalException if a selite with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Selite deleteSelite(int selite_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _seliteLocalService.deleteSelite(selite_id);
    }

    /**
    * Deletes the selite from the database. Also notifies the appropriate model listeners.
    *
    * @param selite the selite
    * @return the selite that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Selite deleteSelite(
        fi.csc.avaa.tupa.db.model.Selite selite)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _seliteLocalService.deleteSelite(selite);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _seliteLocalService.dynamicQuery();
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
        return _seliteLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.SeliteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _seliteLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.SeliteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _seliteLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _seliteLocalService.dynamicQueryCount(dynamicQuery);
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
        return _seliteLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Selite fetchSelite(int selite_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _seliteLocalService.fetchSelite(selite_id);
    }

    /**
    * Returns the selite with the primary key.
    *
    * @param selite_id the primary key of the selite
    * @return the selite
    * @throws PortalException if a selite with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Selite getSelite(int selite_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _seliteLocalService.getSelite(selite_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _seliteLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the selites.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.SeliteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of selites
    * @param end the upper bound of the range of selites (not inclusive)
    * @return the range of selites
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.Selite> getSelites(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _seliteLocalService.getSelites(start, end);
    }

    /**
    * Returns the number of selites.
    *
    * @return the number of selites
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getSelitesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _seliteLocalService.getSelitesCount();
    }

    /**
    * Updates the selite in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param selite the selite
    * @return the selite that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Selite updateSelite(
        fi.csc.avaa.tupa.db.model.Selite selite)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _seliteLocalService.updateSelite(selite);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _seliteLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _seliteLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _seliteLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SeliteLocalService getWrappedSeliteLocalService() {
        return _seliteLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSeliteLocalService(
        SeliteLocalService seliteLocalService) {
        _seliteLocalService = seliteLocalService;
    }

    @Override
    public SeliteLocalService getWrappedService() {
        return _seliteLocalService;
    }

    @Override
    public void setWrappedService(SeliteLocalService seliteLocalService) {
        _seliteLocalService = seliteLocalService;
    }
}
