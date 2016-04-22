package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Infra_AvainsanatLocalService}.
 *
 * @author pj,jmlehtin
 * @see Infra_AvainsanatLocalService
 * @generated
 */
public class Infra_AvainsanatLocalServiceWrapper
    implements Infra_AvainsanatLocalService,
        ServiceWrapper<Infra_AvainsanatLocalService> {
    private Infra_AvainsanatLocalService _infra_AvainsanatLocalService;

    public Infra_AvainsanatLocalServiceWrapper(
        Infra_AvainsanatLocalService infra_AvainsanatLocalService) {
        _infra_AvainsanatLocalService = infra_AvainsanatLocalService;
    }

    /**
    * Adds the infra_ avainsanat to the database. Also notifies the appropriate model listeners.
    *
    * @param infra_Avainsanat the infra_ avainsanat
    * @return the infra_ avainsanat that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Avainsanat addInfra_Avainsanat(
        fi.csc.avaa.tupa.db.model.Infra_Avainsanat infra_Avainsanat)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_AvainsanatLocalService.addInfra_Avainsanat(infra_Avainsanat);
    }

    /**
    * Creates a new infra_ avainsanat with the primary key. Does not add the infra_ avainsanat to the database.
    *
    * @param infra_AvainsanatPK the primary key for the new infra_ avainsanat
    * @return the new infra_ avainsanat
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Avainsanat createInfra_Avainsanat(
        fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK infra_AvainsanatPK) {
        return _infra_AvainsanatLocalService.createInfra_Avainsanat(infra_AvainsanatPK);
    }

    /**
    * Deletes the infra_ avainsanat with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_AvainsanatPK the primary key of the infra_ avainsanat
    * @return the infra_ avainsanat that was removed
    * @throws PortalException if a infra_ avainsanat with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Avainsanat deleteInfra_Avainsanat(
        fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK infra_AvainsanatPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infra_AvainsanatLocalService.deleteInfra_Avainsanat(infra_AvainsanatPK);
    }

    /**
    * Deletes the infra_ avainsanat from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_Avainsanat the infra_ avainsanat
    * @return the infra_ avainsanat that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Avainsanat deleteInfra_Avainsanat(
        fi.csc.avaa.tupa.db.model.Infra_Avainsanat infra_Avainsanat)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_AvainsanatLocalService.deleteInfra_Avainsanat(infra_Avainsanat);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _infra_AvainsanatLocalService.dynamicQuery();
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
        return _infra_AvainsanatLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _infra_AvainsanatLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _infra_AvainsanatLocalService.dynamicQuery(dynamicQuery, start,
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
        return _infra_AvainsanatLocalService.dynamicQueryCount(dynamicQuery);
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
        return _infra_AvainsanatLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Avainsanat fetchInfra_Avainsanat(
        fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK infra_AvainsanatPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_AvainsanatLocalService.fetchInfra_Avainsanat(infra_AvainsanatPK);
    }

    /**
    * Returns the infra_ avainsanat with the primary key.
    *
    * @param infra_AvainsanatPK the primary key of the infra_ avainsanat
    * @return the infra_ avainsanat
    * @throws PortalException if a infra_ avainsanat with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Avainsanat getInfra_Avainsanat(
        fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK infra_AvainsanatPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infra_AvainsanatLocalService.getInfra_Avainsanat(infra_AvainsanatPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infra_AvainsanatLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the infra_ avainsanats.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ avainsanats
    * @param end the upper bound of the range of infra_ avainsanats (not inclusive)
    * @return the range of infra_ avainsanats
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Avainsanat> getInfra_Avainsanats(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_AvainsanatLocalService.getInfra_Avainsanats(start, end);
    }

    /**
    * Returns the number of infra_ avainsanats.
    *
    * @return the number of infra_ avainsanats
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getInfra_AvainsanatsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_AvainsanatLocalService.getInfra_AvainsanatsCount();
    }

    /**
    * Updates the infra_ avainsanat in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param infra_Avainsanat the infra_ avainsanat
    * @return the infra_ avainsanat that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Avainsanat updateInfra_Avainsanat(
        fi.csc.avaa.tupa.db.model.Infra_Avainsanat infra_Avainsanat)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_AvainsanatLocalService.updateInfra_Avainsanat(infra_Avainsanat);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _infra_AvainsanatLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _infra_AvainsanatLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _infra_AvainsanatLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Infra_AvainsanatLocalService getWrappedInfra_AvainsanatLocalService() {
        return _infra_AvainsanatLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedInfra_AvainsanatLocalService(
        Infra_AvainsanatLocalService infra_AvainsanatLocalService) {
        _infra_AvainsanatLocalService = infra_AvainsanatLocalService;
    }

    @Override
    public Infra_AvainsanatLocalService getWrappedService() {
        return _infra_AvainsanatLocalService;
    }

    @Override
    public void setWrappedService(
        Infra_AvainsanatLocalService infra_AvainsanatLocalService) {
        _infra_AvainsanatLocalService = infra_AvainsanatLocalService;
    }
}
