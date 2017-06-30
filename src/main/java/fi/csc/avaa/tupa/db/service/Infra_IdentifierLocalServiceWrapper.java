package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Infra_IdentifierLocalService}.
 *
 * @author CSC
 * @see Infra_IdentifierLocalService
 * @generated
 */
public class Infra_IdentifierLocalServiceWrapper
    implements Infra_IdentifierLocalService,
        ServiceWrapper<Infra_IdentifierLocalService> {
    private Infra_IdentifierLocalService _infra_IdentifierLocalService;

    public Infra_IdentifierLocalServiceWrapper(
        Infra_IdentifierLocalService infra_IdentifierLocalService) {
        _infra_IdentifierLocalService = infra_IdentifierLocalService;
    }

    /**
    * Adds the infra_ identifier to the database. Also notifies the appropriate model listeners.
    *
    * @param infra_Identifier the infra_ identifier
    * @return the infra_ identifier that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Identifier addInfra_Identifier(
        fi.csc.avaa.tupa.db.model.Infra_Identifier infra_Identifier)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_IdentifierLocalService.addInfra_Identifier(infra_Identifier);
    }

    /**
    * Creates a new infra_ identifier with the primary key. Does not add the infra_ identifier to the database.
    *
    * @param infra_IdentifierPK the primary key for the new infra_ identifier
    * @return the new infra_ identifier
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Identifier createInfra_Identifier(
        fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierPK infra_IdentifierPK) {
        return _infra_IdentifierLocalService.createInfra_Identifier(infra_IdentifierPK);
    }

    /**
    * Deletes the infra_ identifier with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_IdentifierPK the primary key of the infra_ identifier
    * @return the infra_ identifier that was removed
    * @throws PortalException if a infra_ identifier with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Identifier deleteInfra_Identifier(
        fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierPK infra_IdentifierPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infra_IdentifierLocalService.deleteInfra_Identifier(infra_IdentifierPK);
    }

    /**
    * Deletes the infra_ identifier from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_Identifier the infra_ identifier
    * @return the infra_ identifier that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Identifier deleteInfra_Identifier(
        fi.csc.avaa.tupa.db.model.Infra_Identifier infra_Identifier)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_IdentifierLocalService.deleteInfra_Identifier(infra_Identifier);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _infra_IdentifierLocalService.dynamicQuery();
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
        return _infra_IdentifierLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _infra_IdentifierLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _infra_IdentifierLocalService.dynamicQuery(dynamicQuery, start,
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
        return _infra_IdentifierLocalService.dynamicQueryCount(dynamicQuery);
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
        return _infra_IdentifierLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Identifier fetchInfra_Identifier(
        fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierPK infra_IdentifierPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_IdentifierLocalService.fetchInfra_Identifier(infra_IdentifierPK);
    }

    /**
    * Returns the infra_ identifier with the primary key.
    *
    * @param infra_IdentifierPK the primary key of the infra_ identifier
    * @return the infra_ identifier
    * @throws PortalException if a infra_ identifier with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Identifier getInfra_Identifier(
        fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierPK infra_IdentifierPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infra_IdentifierLocalService.getInfra_Identifier(infra_IdentifierPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infra_IdentifierLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the infra_ identifiers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ identifiers
    * @param end the upper bound of the range of infra_ identifiers (not inclusive)
    * @return the range of infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Identifier> getInfra_Identifiers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_IdentifierLocalService.getInfra_Identifiers(start, end);
    }

    /**
    * Returns the number of infra_ identifiers.
    *
    * @return the number of infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getInfra_IdentifiersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_IdentifierLocalService.getInfra_IdentifiersCount();
    }

    /**
    * Updates the infra_ identifier in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param infra_Identifier the infra_ identifier
    * @return the infra_ identifier that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Identifier updateInfra_Identifier(
        fi.csc.avaa.tupa.db.model.Infra_Identifier infra_Identifier)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_IdentifierLocalService.updateInfra_Identifier(infra_Identifier);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _infra_IdentifierLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _infra_IdentifierLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _infra_IdentifierLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Identifier> getExtendedInfraIdentifiersList(
        int infraId) {
        return _infra_IdentifierLocalService.getExtendedInfraIdentifiersList(infraId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Infra_IdentifierLocalService getWrappedInfra_IdentifierLocalService() {
        return _infra_IdentifierLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedInfra_IdentifierLocalService(
        Infra_IdentifierLocalService infra_IdentifierLocalService) {
        _infra_IdentifierLocalService = infra_IdentifierLocalService;
    }

    @Override
    public Infra_IdentifierLocalService getWrappedService() {
        return _infra_IdentifierLocalService;
    }

    @Override
    public void setWrappedService(
        Infra_IdentifierLocalService infra_IdentifierLocalService) {
        _infra_IdentifierLocalService = infra_IdentifierLocalService;
    }
}
