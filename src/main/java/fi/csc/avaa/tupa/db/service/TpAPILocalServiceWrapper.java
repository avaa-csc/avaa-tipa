package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TpAPILocalService}.
 *
 * @author CSC
 * @see TpAPILocalService
 * @generated
 */
public class TpAPILocalServiceWrapper implements TpAPILocalService,
    ServiceWrapper<TpAPILocalService> {
    private TpAPILocalService _tpAPILocalService;

    public TpAPILocalServiceWrapper(TpAPILocalService tpAPILocalService) {
        _tpAPILocalService = tpAPILocalService;
    }

    /**
    * Adds the tp a p i to the database. Also notifies the appropriate model listeners.
    *
    * @param tpAPI the tp a p i
    * @return the tp a p i that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpAPI addTpAPI(
        fi.csc.avaa.tupa.db.model.TpAPI tpAPI)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpAPILocalService.addTpAPI(tpAPI);
    }

    /**
    * Creates a new tp a p i with the primary key. Does not add the tp a p i to the database.
    *
    * @param methodsDescription the primary key for the new tp a p i
    * @return the new tp a p i
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpAPI createTpAPI(
        java.lang.String methodsDescription) {
        return _tpAPILocalService.createTpAPI(methodsDescription);
    }

    /**
    * Deletes the tp a p i with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param methodsDescription the primary key of the tp a p i
    * @return the tp a p i that was removed
    * @throws PortalException if a tp a p i with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpAPI deleteTpAPI(
        java.lang.String methodsDescription)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tpAPILocalService.deleteTpAPI(methodsDescription);
    }

    /**
    * Deletes the tp a p i from the database. Also notifies the appropriate model listeners.
    *
    * @param tpAPI the tp a p i
    * @return the tp a p i that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpAPI deleteTpAPI(
        fi.csc.avaa.tupa.db.model.TpAPI tpAPI)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpAPILocalService.deleteTpAPI(tpAPI);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _tpAPILocalService.dynamicQuery();
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
        return _tpAPILocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpAPIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _tpAPILocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpAPIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _tpAPILocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _tpAPILocalService.dynamicQueryCount(dynamicQuery);
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
        return _tpAPILocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.TpAPI fetchTpAPI(
        java.lang.String methodsDescription)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpAPILocalService.fetchTpAPI(methodsDescription);
    }

    /**
    * Returns the tp a p i with the primary key.
    *
    * @param methodsDescription the primary key of the tp a p i
    * @return the tp a p i
    * @throws PortalException if a tp a p i with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpAPI getTpAPI(
        java.lang.String methodsDescription)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tpAPILocalService.getTpAPI(methodsDescription);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tpAPILocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the tp a p is.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpAPIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp a p is
    * @param end the upper bound of the range of tp a p is (not inclusive)
    * @return the range of tp a p is
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpAPI> getTpAPIs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpAPILocalService.getTpAPIs(start, end);
    }

    /**
    * Returns the number of tp a p is.
    *
    * @return the number of tp a p is
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getTpAPIsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpAPILocalService.getTpAPIsCount();
    }

    /**
    * Updates the tp a p i in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param tpAPI the tp a p i
    * @return the tp a p i that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpAPI updateTpAPI(
        fi.csc.avaa.tupa.db.model.TpAPI tpAPI)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpAPILocalService.updateTpAPI(tpAPI);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _tpAPILocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _tpAPILocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _tpAPILocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpAPI> getCapabilities() {
        return _tpAPILocalService.getCapabilities();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TpAPILocalService getWrappedTpAPILocalService() {
        return _tpAPILocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTpAPILocalService(TpAPILocalService tpAPILocalService) {
        _tpAPILocalService = tpAPILocalService;
    }

    @Override
    public TpAPILocalService getWrappedService() {
        return _tpAPILocalService;
    }

    @Override
    public void setWrappedService(TpAPILocalService tpAPILocalService) {
        _tpAPILocalService = tpAPILocalService;
    }
}
