package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link KayttoehtoLocalService}.
 *
 * @author pj,jmlehtin
 * @see KayttoehtoLocalService
 * @generated
 */
public class KayttoehtoLocalServiceWrapper implements KayttoehtoLocalService,
    ServiceWrapper<KayttoehtoLocalService> {
    private KayttoehtoLocalService _kayttoehtoLocalService;

    public KayttoehtoLocalServiceWrapper(
        KayttoehtoLocalService kayttoehtoLocalService) {
        _kayttoehtoLocalService = kayttoehtoLocalService;
    }

    /**
    * Adds the kayttoehto to the database. Also notifies the appropriate model listeners.
    *
    * @param kayttoehto the kayttoehto
    * @return the kayttoehto that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Kayttoehto addKayttoehto(
        fi.csc.avaa.tupa.db.model.Kayttoehto kayttoehto)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kayttoehtoLocalService.addKayttoehto(kayttoehto);
    }

    /**
    * Creates a new kayttoehto with the primary key. Does not add the kayttoehto to the database.
    *
    * @param infra_id the primary key for the new kayttoehto
    * @return the new kayttoehto
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Kayttoehto createKayttoehto(int infra_id) {
        return _kayttoehtoLocalService.createKayttoehto(infra_id);
    }

    /**
    * Deletes the kayttoehto with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_id the primary key of the kayttoehto
    * @return the kayttoehto that was removed
    * @throws PortalException if a kayttoehto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Kayttoehto deleteKayttoehto(int infra_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _kayttoehtoLocalService.deleteKayttoehto(infra_id);
    }

    /**
    * Deletes the kayttoehto from the database. Also notifies the appropriate model listeners.
    *
    * @param kayttoehto the kayttoehto
    * @return the kayttoehto that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Kayttoehto deleteKayttoehto(
        fi.csc.avaa.tupa.db.model.Kayttoehto kayttoehto)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kayttoehtoLocalService.deleteKayttoehto(kayttoehto);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _kayttoehtoLocalService.dynamicQuery();
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
        return _kayttoehtoLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.KayttoehtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _kayttoehtoLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.KayttoehtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _kayttoehtoLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _kayttoehtoLocalService.dynamicQueryCount(dynamicQuery);
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
        return _kayttoehtoLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Kayttoehto fetchKayttoehto(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kayttoehtoLocalService.fetchKayttoehto(infra_id);
    }

    /**
    * Returns the kayttoehto with the primary key.
    *
    * @param infra_id the primary key of the kayttoehto
    * @return the kayttoehto
    * @throws PortalException if a kayttoehto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Kayttoehto getKayttoehto(int infra_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _kayttoehtoLocalService.getKayttoehto(infra_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _kayttoehtoLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the kayttoehtos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.KayttoehtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kayttoehtos
    * @param end the upper bound of the range of kayttoehtos (not inclusive)
    * @return the range of kayttoehtos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.Kayttoehto> getKayttoehtos(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kayttoehtoLocalService.getKayttoehtos(start, end);
    }

    /**
    * Returns the number of kayttoehtos.
    *
    * @return the number of kayttoehtos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getKayttoehtosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kayttoehtoLocalService.getKayttoehtosCount();
    }

    /**
    * Updates the kayttoehto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param kayttoehto the kayttoehto
    * @return the kayttoehto that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Kayttoehto updateKayttoehto(
        fi.csc.avaa.tupa.db.model.Kayttoehto kayttoehto)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kayttoehtoLocalService.updateKayttoehto(kayttoehto);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _kayttoehtoLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _kayttoehtoLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _kayttoehtoLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public KayttoehtoLocalService getWrappedKayttoehtoLocalService() {
        return _kayttoehtoLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedKayttoehtoLocalService(
        KayttoehtoLocalService kayttoehtoLocalService) {
        _kayttoehtoLocalService = kayttoehtoLocalService;
    }

    @Override
    public KayttoehtoLocalService getWrappedService() {
        return _kayttoehtoLocalService;
    }

    @Override
    public void setWrappedService(KayttoehtoLocalService kayttoehtoLocalService) {
        _kayttoehtoLocalService = kayttoehtoLocalService;
    }
}
