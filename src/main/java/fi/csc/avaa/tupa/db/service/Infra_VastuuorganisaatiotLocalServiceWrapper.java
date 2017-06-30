package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Infra_VastuuorganisaatiotLocalService}.
 *
 * @author CSC
 * @see Infra_VastuuorganisaatiotLocalService
 * @generated
 */
public class Infra_VastuuorganisaatiotLocalServiceWrapper
    implements Infra_VastuuorganisaatiotLocalService,
        ServiceWrapper<Infra_VastuuorganisaatiotLocalService> {
    private Infra_VastuuorganisaatiotLocalService _infra_VastuuorganisaatiotLocalService;

    public Infra_VastuuorganisaatiotLocalServiceWrapper(
        Infra_VastuuorganisaatiotLocalService infra_VastuuorganisaatiotLocalService) {
        _infra_VastuuorganisaatiotLocalService = infra_VastuuorganisaatiotLocalService;
    }

    /**
    * Adds the infra_ vastuuorganisaatiot to the database. Also notifies the appropriate model listeners.
    *
    * @param infra_Vastuuorganisaatiot the infra_ vastuuorganisaatiot
    * @return the infra_ vastuuorganisaatiot that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot addInfra_Vastuuorganisaatiot(
        fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_VastuuorganisaatiotLocalService.addInfra_Vastuuorganisaatiot(infra_Vastuuorganisaatiot);
    }

    /**
    * Creates a new infra_ vastuuorganisaatiot with the primary key. Does not add the infra_ vastuuorganisaatiot to the database.
    *
    * @param infra_VastuuorganisaatiotPK the primary key for the new infra_ vastuuorganisaatiot
    * @return the new infra_ vastuuorganisaatiot
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot createInfra_Vastuuorganisaatiot(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK) {
        return _infra_VastuuorganisaatiotLocalService.createInfra_Vastuuorganisaatiot(infra_VastuuorganisaatiotPK);
    }

    /**
    * Deletes the infra_ vastuuorganisaatiot with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_VastuuorganisaatiotPK the primary key of the infra_ vastuuorganisaatiot
    * @return the infra_ vastuuorganisaatiot that was removed
    * @throws PortalException if a infra_ vastuuorganisaatiot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot deleteInfra_Vastuuorganisaatiot(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infra_VastuuorganisaatiotLocalService.deleteInfra_Vastuuorganisaatiot(infra_VastuuorganisaatiotPK);
    }

    /**
    * Deletes the infra_ vastuuorganisaatiot from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_Vastuuorganisaatiot the infra_ vastuuorganisaatiot
    * @return the infra_ vastuuorganisaatiot that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot deleteInfra_Vastuuorganisaatiot(
        fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_VastuuorganisaatiotLocalService.deleteInfra_Vastuuorganisaatiot(infra_Vastuuorganisaatiot);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _infra_VastuuorganisaatiotLocalService.dynamicQuery();
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
        return _infra_VastuuorganisaatiotLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _infra_VastuuorganisaatiotLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _infra_VastuuorganisaatiotLocalService.dynamicQuery(dynamicQuery,
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
        return _infra_VastuuorganisaatiotLocalService.dynamicQueryCount(dynamicQuery);
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
        return _infra_VastuuorganisaatiotLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot fetchInfra_Vastuuorganisaatiot(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_VastuuorganisaatiotLocalService.fetchInfra_Vastuuorganisaatiot(infra_VastuuorganisaatiotPK);
    }

    /**
    * Returns the infra_ vastuuorganisaatiot with the primary key.
    *
    * @param infra_VastuuorganisaatiotPK the primary key of the infra_ vastuuorganisaatiot
    * @return the infra_ vastuuorganisaatiot
    * @throws PortalException if a infra_ vastuuorganisaatiot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot getInfra_Vastuuorganisaatiot(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infra_VastuuorganisaatiotLocalService.getInfra_Vastuuorganisaatiot(infra_VastuuorganisaatiotPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _infra_VastuuorganisaatiotLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the infra_ vastuuorganisaatiots.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ vastuuorganisaatiots
    * @param end the upper bound of the range of infra_ vastuuorganisaatiots (not inclusive)
    * @return the range of infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> getInfra_Vastuuorganisaatiots(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_VastuuorganisaatiotLocalService.getInfra_Vastuuorganisaatiots(start,
            end);
    }

    /**
    * Returns the number of infra_ vastuuorganisaatiots.
    *
    * @return the number of infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getInfra_VastuuorganisaatiotsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_VastuuorganisaatiotLocalService.getInfra_VastuuorganisaatiotsCount();
    }

    /**
    * Updates the infra_ vastuuorganisaatiot in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param infra_Vastuuorganisaatiot the infra_ vastuuorganisaatiot
    * @return the infra_ vastuuorganisaatiot that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot updateInfra_Vastuuorganisaatiot(
        fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _infra_VastuuorganisaatiotLocalService.updateInfra_Vastuuorganisaatiot(infra_Vastuuorganisaatiot);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _infra_VastuuorganisaatiotLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _infra_VastuuorganisaatiotLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _infra_VastuuorganisaatiotLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public int[] getOrganisationsIdsByInfrastructureId(int infrastructureId) {
        return _infra_VastuuorganisaatiotLocalService.getOrganisationsIdsByInfrastructureId(infrastructureId);
    }

    @Override
    public int[] getOrganisationsIdsByInfrastructuresIds(
        int[] infrastructuresIds) {
        return _infra_VastuuorganisaatiotLocalService.getOrganisationsIdsByInfrastructuresIds(infrastructuresIds);
    }

    @Override
    public int[] getInfrastructuresIdsByOrganisationsIds(int[] organisationsIds) {
        return _infra_VastuuorganisaatiotLocalService.getInfrastructuresIdsByOrganisationsIds(organisationsIds);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Infra_VastuuorganisaatiotLocalService getWrappedInfra_VastuuorganisaatiotLocalService() {
        return _infra_VastuuorganisaatiotLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedInfra_VastuuorganisaatiotLocalService(
        Infra_VastuuorganisaatiotLocalService infra_VastuuorganisaatiotLocalService) {
        _infra_VastuuorganisaatiotLocalService = infra_VastuuorganisaatiotLocalService;
    }

    @Override
    public Infra_VastuuorganisaatiotLocalService getWrappedService() {
        return _infra_VastuuorganisaatiotLocalService;
    }

    @Override
    public void setWrappedService(
        Infra_VastuuorganisaatiotLocalService infra_VastuuorganisaatiotLocalService) {
        _infra_VastuuorganisaatiotLocalService = infra_VastuuorganisaatiotLocalService;
    }
}
