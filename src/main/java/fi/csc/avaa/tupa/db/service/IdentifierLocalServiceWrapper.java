package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link IdentifierLocalService}.
 *
 * @author CSC
 * @see IdentifierLocalService
 * @generated
 */
public class IdentifierLocalServiceWrapper implements IdentifierLocalService,
    ServiceWrapper<IdentifierLocalService> {
    private IdentifierLocalService _identifierLocalService;

    public IdentifierLocalServiceWrapper(
        IdentifierLocalService identifierLocalService) {
        _identifierLocalService = identifierLocalService;
    }

    /**
    * Adds the identifier to the database. Also notifies the appropriate model listeners.
    *
    * @param identifier the identifier
    * @return the identifier that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Identifier addIdentifier(
        fi.csc.avaa.tupa.db.model.Identifier identifier)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _identifierLocalService.addIdentifier(identifier);
    }

    /**
    * Creates a new identifier with the primary key. Does not add the identifier to the database.
    *
    * @param identifier_type the primary key for the new identifier
    * @return the new identifier
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Identifier createIdentifier(
        int identifier_type) {
        return _identifierLocalService.createIdentifier(identifier_type);
    }

    /**
    * Deletes the identifier with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param identifier_type the primary key of the identifier
    * @return the identifier that was removed
    * @throws PortalException if a identifier with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Identifier deleteIdentifier(
        int identifier_type)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _identifierLocalService.deleteIdentifier(identifier_type);
    }

    /**
    * Deletes the identifier from the database. Also notifies the appropriate model listeners.
    *
    * @param identifier the identifier
    * @return the identifier that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Identifier deleteIdentifier(
        fi.csc.avaa.tupa.db.model.Identifier identifier)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _identifierLocalService.deleteIdentifier(identifier);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _identifierLocalService.dynamicQuery();
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
        return _identifierLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _identifierLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _identifierLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _identifierLocalService.dynamicQueryCount(dynamicQuery);
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
        return _identifierLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Identifier fetchIdentifier(
        int identifier_type)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _identifierLocalService.fetchIdentifier(identifier_type);
    }

    /**
    * Returns the identifier with the primary key.
    *
    * @param identifier_type the primary key of the identifier
    * @return the identifier
    * @throws PortalException if a identifier with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Identifier getIdentifier(
        int identifier_type)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _identifierLocalService.getIdentifier(identifier_type);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _identifierLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the identifiers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of identifiers
    * @param end the upper bound of the range of identifiers (not inclusive)
    * @return the range of identifiers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.Identifier> getIdentifiers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _identifierLocalService.getIdentifiers(start, end);
    }

    /**
    * Returns the number of identifiers.
    *
    * @return the number of identifiers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getIdentifiersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _identifierLocalService.getIdentifiersCount();
    }

    /**
    * Updates the identifier in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param identifier the identifier
    * @return the identifier that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Identifier updateIdentifier(
        fi.csc.avaa.tupa.db.model.Identifier identifier)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _identifierLocalService.updateIdentifier(identifier);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _identifierLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _identifierLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _identifierLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.lang.String[] getPidsArray() {
        return _identifierLocalService.getPidsArray();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public IdentifierLocalService getWrappedIdentifierLocalService() {
        return _identifierLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedIdentifierLocalService(
        IdentifierLocalService identifierLocalService) {
        _identifierLocalService = identifierLocalService;
    }

    @Override
    public IdentifierLocalService getWrappedService() {
        return _identifierLocalService;
    }

    @Override
    public void setWrappedService(IdentifierLocalService identifierLocalService) {
        _identifierLocalService = identifierLocalService;
    }
}
