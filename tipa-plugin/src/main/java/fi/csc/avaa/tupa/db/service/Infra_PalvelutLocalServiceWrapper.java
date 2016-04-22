package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Infra_PalvelutLocalService}.
 *
 * @author pj,jmlehtin
 * @see Infra_PalvelutLocalService
 * @generated
 */
public class Infra_PalvelutLocalServiceWrapper
    implements Infra_PalvelutLocalService,
        ServiceWrapper<Infra_PalvelutLocalService> {
    private Infra_PalvelutLocalService _infra_PalvelutLocalService;

    public Infra_PalvelutLocalServiceWrapper(
        Infra_PalvelutLocalService infra_PalvelutLocalService) {
        _infra_PalvelutLocalService = infra_PalvelutLocalService;
    }

    /**
    * Adds the infra_ palvelut to the database. Also notifies the appropriate model listeners.
    *
    * @param infra_Palvelut the infra_ palvelut
    * @return the infra_ palvelut that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Palvelut addInfra_Palvelut(
        fi.csc.avaa.tupa.db.model.Infra_Palvelut infra_Palvelut)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_PalvelutLocalService.addInfra_Palvelut(infra_Palvelut);
    }

    /**
    * Creates a new infra_ palvelut with the primary key. Does not add the infra_ palvelut to the database.
    *
    * @param infra_PalvelutPK the primary key for the new infra_ palvelut
    * @return the new infra_ palvelut
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Palvelut createInfra_Palvelut(
        fi.csc.avaa.tupa.db.service.persistence.Infra_PalvelutPK infra_PalvelutPK) {
        return _infra_PalvelutLocalService.createInfra_Palvelut(infra_PalvelutPK);
    }

    /**
    * Deletes the infra_ palvelut with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_PalvelutPK the primary key of the infra_ palvelut
    * @return the infra_ palvelut that was removed
    * @throws PortalException if a infra_ palvelut with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Palvelut deleteInfra_Palvelut(
        fi.csc.avaa.tupa.db.service.persistence.Infra_PalvelutPK infra_PalvelutPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infra_PalvelutLocalService.deleteInfra_Palvelut(infra_PalvelutPK);
    }

    /**
    * Deletes the infra_ palvelut from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_Palvelut the infra_ palvelut
    * @return the infra_ palvelut that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Palvelut deleteInfra_Palvelut(
        fi.csc.avaa.tupa.db.model.Infra_Palvelut infra_Palvelut)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_PalvelutLocalService.deleteInfra_Palvelut(infra_Palvelut);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _infra_PalvelutLocalService.dynamicQuery();
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
        return _infra_PalvelutLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_PalvelutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _infra_PalvelutLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_PalvelutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _infra_PalvelutLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return _infra_PalvelutLocalService.dynamicQueryCount(dynamicQuery);
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
        return _infra_PalvelutLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Palvelut fetchInfra_Palvelut(
        fi.csc.avaa.tupa.db.service.persistence.Infra_PalvelutPK infra_PalvelutPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_PalvelutLocalService.fetchInfra_Palvelut(infra_PalvelutPK);
    }

    /**
    * Returns the infra_ palvelut with the primary key.
    *
    * @param infra_PalvelutPK the primary key of the infra_ palvelut
    * @return the infra_ palvelut
    * @throws PortalException if a infra_ palvelut with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Palvelut getInfra_Palvelut(
        fi.csc.avaa.tupa.db.service.persistence.Infra_PalvelutPK infra_PalvelutPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infra_PalvelutLocalService.getInfra_Palvelut(infra_PalvelutPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infra_PalvelutLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the infra_ palveluts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_PalvelutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ palveluts
    * @param end the upper bound of the range of infra_ palveluts (not inclusive)
    * @return the range of infra_ palveluts
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Palvelut> getInfra_Palveluts(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_PalvelutLocalService.getInfra_Palveluts(start, end);
    }

    /**
    * Returns the number of infra_ palveluts.
    *
    * @return the number of infra_ palveluts
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getInfra_PalvelutsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_PalvelutLocalService.getInfra_PalvelutsCount();
    }

    /**
    * Updates the infra_ palvelut in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param infra_Palvelut the infra_ palvelut
    * @return the infra_ palvelut that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Palvelut updateInfra_Palvelut(
        fi.csc.avaa.tupa.db.model.Infra_Palvelut infra_Palvelut)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_PalvelutLocalService.updateInfra_Palvelut(infra_Palvelut);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _infra_PalvelutLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _infra_PalvelutLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _infra_PalvelutLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Infra_PalvelutLocalService getWrappedInfra_PalvelutLocalService() {
        return _infra_PalvelutLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedInfra_PalvelutLocalService(
        Infra_PalvelutLocalService infra_PalvelutLocalService) {
        _infra_PalvelutLocalService = infra_PalvelutLocalService;
    }

    @Override
    public Infra_PalvelutLocalService getWrappedService() {
        return _infra_PalvelutLocalService;
    }

    @Override
    public void setWrappedService(
        Infra_PalvelutLocalService infra_PalvelutLocalService) {
        _infra_PalvelutLocalService = infra_PalvelutLocalService;
    }
}
