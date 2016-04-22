package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Infra_YhteystiedotLocalService}.
 *
 * @author pj,jmlehtin
 * @see Infra_YhteystiedotLocalService
 * @generated
 */
public class Infra_YhteystiedotLocalServiceWrapper
    implements Infra_YhteystiedotLocalService,
        ServiceWrapper<Infra_YhteystiedotLocalService> {
    private Infra_YhteystiedotLocalService _infra_YhteystiedotLocalService;

    public Infra_YhteystiedotLocalServiceWrapper(
        Infra_YhteystiedotLocalService infra_YhteystiedotLocalService) {
        _infra_YhteystiedotLocalService = infra_YhteystiedotLocalService;
    }

    /**
    * Adds the infra_ yhteystiedot to the database. Also notifies the appropriate model listeners.
    *
    * @param infra_Yhteystiedot the infra_ yhteystiedot
    * @return the infra_ yhteystiedot that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot addInfra_Yhteystiedot(
        fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot infra_Yhteystiedot)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_YhteystiedotLocalService.addInfra_Yhteystiedot(infra_Yhteystiedot);
    }

    /**
    * Creates a new infra_ yhteystiedot with the primary key. Does not add the infra_ yhteystiedot to the database.
    *
    * @param infra_YhteystiedotPK the primary key for the new infra_ yhteystiedot
    * @return the new infra_ yhteystiedot
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot createInfra_Yhteystiedot(
        fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK infra_YhteystiedotPK) {
        return _infra_YhteystiedotLocalService.createInfra_Yhteystiedot(infra_YhteystiedotPK);
    }

    /**
    * Deletes the infra_ yhteystiedot with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_YhteystiedotPK the primary key of the infra_ yhteystiedot
    * @return the infra_ yhteystiedot that was removed
    * @throws PortalException if a infra_ yhteystiedot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot deleteInfra_Yhteystiedot(
        fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK infra_YhteystiedotPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infra_YhteystiedotLocalService.deleteInfra_Yhteystiedot(infra_YhteystiedotPK);
    }

    /**
    * Deletes the infra_ yhteystiedot from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_Yhteystiedot the infra_ yhteystiedot
    * @return the infra_ yhteystiedot that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot deleteInfra_Yhteystiedot(
        fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot infra_Yhteystiedot)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_YhteystiedotLocalService.deleteInfra_Yhteystiedot(infra_Yhteystiedot);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _infra_YhteystiedotLocalService.dynamicQuery();
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
        return _infra_YhteystiedotLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_YhteystiedotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _infra_YhteystiedotLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_YhteystiedotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _infra_YhteystiedotLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
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
        return _infra_YhteystiedotLocalService.dynamicQueryCount(dynamicQuery);
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
        return _infra_YhteystiedotLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot fetchInfra_Yhteystiedot(
        fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK infra_YhteystiedotPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_YhteystiedotLocalService.fetchInfra_Yhteystiedot(infra_YhteystiedotPK);
    }

    /**
    * Returns the infra_ yhteystiedot with the primary key.
    *
    * @param infra_YhteystiedotPK the primary key of the infra_ yhteystiedot
    * @return the infra_ yhteystiedot
    * @throws PortalException if a infra_ yhteystiedot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot getInfra_Yhteystiedot(
        fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK infra_YhteystiedotPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infra_YhteystiedotLocalService.getInfra_Yhteystiedot(infra_YhteystiedotPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infra_YhteystiedotLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the infra_ yhteystiedots.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_YhteystiedotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ yhteystiedots
    * @param end the upper bound of the range of infra_ yhteystiedots (not inclusive)
    * @return the range of infra_ yhteystiedots
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot> getInfra_Yhteystiedots(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_YhteystiedotLocalService.getInfra_Yhteystiedots(start, end);
    }

    /**
    * Returns the number of infra_ yhteystiedots.
    *
    * @return the number of infra_ yhteystiedots
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getInfra_YhteystiedotsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_YhteystiedotLocalService.getInfra_YhteystiedotsCount();
    }

    /**
    * Updates the infra_ yhteystiedot in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param infra_Yhteystiedot the infra_ yhteystiedot
    * @return the infra_ yhteystiedot that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot updateInfra_Yhteystiedot(
        fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot infra_Yhteystiedot)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_YhteystiedotLocalService.updateInfra_Yhteystiedot(infra_Yhteystiedot);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _infra_YhteystiedotLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _infra_YhteystiedotLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _infra_YhteystiedotLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Infra_YhteystiedotLocalService getWrappedInfra_YhteystiedotLocalService() {
        return _infra_YhteystiedotLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedInfra_YhteystiedotLocalService(
        Infra_YhteystiedotLocalService infra_YhteystiedotLocalService) {
        _infra_YhteystiedotLocalService = infra_YhteystiedotLocalService;
    }

    @Override
    public Infra_YhteystiedotLocalService getWrappedService() {
        return _infra_YhteystiedotLocalService;
    }

    @Override
    public void setWrappedService(
        Infra_YhteystiedotLocalService infra_YhteystiedotLocalService) {
        _infra_YhteystiedotLocalService = infra_YhteystiedotLocalService;
    }
}
