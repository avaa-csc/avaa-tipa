package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AvainsanaLocalService}.
 *
 * @author CSC
 * @see AvainsanaLocalService
 * @generated
 */
public class AvainsanaLocalServiceWrapper implements AvainsanaLocalService,
    ServiceWrapper<AvainsanaLocalService> {
    private AvainsanaLocalService _avainsanaLocalService;

    public AvainsanaLocalServiceWrapper(
        AvainsanaLocalService avainsanaLocalService) {
        _avainsanaLocalService = avainsanaLocalService;
    }

    /**
    * Adds the avainsana to the database. Also notifies the appropriate model listeners.
    *
    * @param avainsana the avainsana
    * @return the avainsana that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Avainsana addAvainsana(
        fi.csc.avaa.tupa.db.model.Avainsana avainsana)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _avainsanaLocalService.addAvainsana(avainsana);
    }

    /**
    * Creates a new avainsana with the primary key. Does not add the avainsana to the database.
    *
    * @param avainsana_id the primary key for the new avainsana
    * @return the new avainsana
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Avainsana createAvainsana(int avainsana_id) {
        return _avainsanaLocalService.createAvainsana(avainsana_id);
    }

    /**
    * Deletes the avainsana with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param avainsana_id the primary key of the avainsana
    * @return the avainsana that was removed
    * @throws PortalException if a avainsana with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Avainsana deleteAvainsana(int avainsana_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _avainsanaLocalService.deleteAvainsana(avainsana_id);
    }

    /**
    * Deletes the avainsana from the database. Also notifies the appropriate model listeners.
    *
    * @param avainsana the avainsana
    * @return the avainsana that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Avainsana deleteAvainsana(
        fi.csc.avaa.tupa.db.model.Avainsana avainsana)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _avainsanaLocalService.deleteAvainsana(avainsana);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _avainsanaLocalService.dynamicQuery();
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
        return _avainsanaLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.AvainsanaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _avainsanaLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.AvainsanaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _avainsanaLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _avainsanaLocalService.dynamicQueryCount(dynamicQuery);
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
        return _avainsanaLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Avainsana fetchAvainsana(int avainsana_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _avainsanaLocalService.fetchAvainsana(avainsana_id);
    }

    /**
    * Returns the avainsana with the primary key.
    *
    * @param avainsana_id the primary key of the avainsana
    * @return the avainsana
    * @throws PortalException if a avainsana with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Avainsana getAvainsana(int avainsana_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _avainsanaLocalService.getAvainsana(avainsana_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _avainsanaLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the avainsanas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.AvainsanaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of avainsanas
    * @param end the upper bound of the range of avainsanas (not inclusive)
    * @return the range of avainsanas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.Avainsana> getAvainsanas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _avainsanaLocalService.getAvainsanas(start, end);
    }

    /**
    * Returns the number of avainsanas.
    *
    * @return the number of avainsanas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getAvainsanasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _avainsanaLocalService.getAvainsanasCount();
    }

    /**
    * Updates the avainsana in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param avainsana the avainsana
    * @return the avainsana that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Avainsana updateAvainsana(
        fi.csc.avaa.tupa.db.model.Avainsana avainsana)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _avainsanaLocalService.updateAvainsana(avainsana);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _avainsanaLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _avainsanaLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _avainsanaLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public int[] getKeywordsIdsByKeywords(java.lang.String[] keywords) {
        return _avainsanaLocalService.getKeywordsIdsByKeywords(keywords);
    }

    @Override
    public java.lang.String[][] getKeywords() {
        return _avainsanaLocalService.getKeywords();
    }

    @Override
    public java.lang.String[] getKeywords_ENbyInfrastructureId(
        int infrastructureId) {
        return _avainsanaLocalService.getKeywords_ENbyInfrastructureId(infrastructureId);
    }

    @Override
    public java.lang.String[] getKeywords_FIbyInfrastructureId(
        int infrastructureId) {
        return _avainsanaLocalService.getKeywords_FIbyInfrastructureId(infrastructureId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AvainsanaLocalService getWrappedAvainsanaLocalService() {
        return _avainsanaLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAvainsanaLocalService(
        AvainsanaLocalService avainsanaLocalService) {
        _avainsanaLocalService = avainsanaLocalService;
    }

    @Override
    public AvainsanaLocalService getWrappedService() {
        return _avainsanaLocalService;
    }

    @Override
    public void setWrappedService(AvainsanaLocalService avainsanaLocalService) {
        _avainsanaLocalService = avainsanaLocalService;
    }
}
