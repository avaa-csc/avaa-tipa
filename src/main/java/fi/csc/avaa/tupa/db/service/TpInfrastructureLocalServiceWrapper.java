package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TpInfrastructureLocalService}.
 *
 * @author CSC
 * @see TpInfrastructureLocalService
 * @generated
 */
public class TpInfrastructureLocalServiceWrapper
    implements TpInfrastructureLocalService,
        ServiceWrapper<TpInfrastructureLocalService> {
    private TpInfrastructureLocalService _tpInfrastructureLocalService;

    public TpInfrastructureLocalServiceWrapper(
        TpInfrastructureLocalService tpInfrastructureLocalService) {
        _tpInfrastructureLocalService = tpInfrastructureLocalService;
    }

    /**
    * Adds the tp infrastructure to the database. Also notifies the appropriate model listeners.
    *
    * @param tpInfrastructure the tp infrastructure
    * @return the tp infrastructure that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpInfrastructure addTpInfrastructure(
        fi.csc.avaa.tupa.db.model.TpInfrastructure tpInfrastructure)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpInfrastructureLocalService.addTpInfrastructure(tpInfrastructure);
    }

    /**
    * Creates a new tp infrastructure with the primary key. Does not add the tp infrastructure to the database.
    *
    * @param id the primary key for the new tp infrastructure
    * @return the new tp infrastructure
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpInfrastructure createTpInfrastructure(
        int id) {
        return _tpInfrastructureLocalService.createTpInfrastructure(id);
    }

    /**
    * Deletes the tp infrastructure with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the tp infrastructure
    * @return the tp infrastructure that was removed
    * @throws PortalException if a tp infrastructure with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpInfrastructure deleteTpInfrastructure(
        int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tpInfrastructureLocalService.deleteTpInfrastructure(id);
    }

    /**
    * Deletes the tp infrastructure from the database. Also notifies the appropriate model listeners.
    *
    * @param tpInfrastructure the tp infrastructure
    * @return the tp infrastructure that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpInfrastructure deleteTpInfrastructure(
        fi.csc.avaa.tupa.db.model.TpInfrastructure tpInfrastructure)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpInfrastructureLocalService.deleteTpInfrastructure(tpInfrastructure);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _tpInfrastructureLocalService.dynamicQuery();
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
        return _tpInfrastructureLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpInfrastructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _tpInfrastructureLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpInfrastructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _tpInfrastructureLocalService.dynamicQuery(dynamicQuery, start,
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
        return _tpInfrastructureLocalService.dynamicQueryCount(dynamicQuery);
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
        return _tpInfrastructureLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.TpInfrastructure fetchTpInfrastructure(
        int id) throws com.liferay.portal.kernel.exception.SystemException {
        return _tpInfrastructureLocalService.fetchTpInfrastructure(id);
    }

    /**
    * Returns the tp infrastructure with the primary key.
    *
    * @param id the primary key of the tp infrastructure
    * @return the tp infrastructure
    * @throws PortalException if a tp infrastructure with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpInfrastructure getTpInfrastructure(
        int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tpInfrastructureLocalService.getTpInfrastructure(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tpInfrastructureLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the tp infrastructures.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpInfrastructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp infrastructures
    * @param end the upper bound of the range of tp infrastructures (not inclusive)
    * @return the range of tp infrastructures
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getTpInfrastructures(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpInfrastructureLocalService.getTpInfrastructures(start, end);
    }

    /**
    * Returns the number of tp infrastructures.
    *
    * @return the number of tp infrastructures
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getTpInfrastructuresCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpInfrastructureLocalService.getTpInfrastructuresCount();
    }

    /**
    * Updates the tp infrastructure in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param tpInfrastructure the tp infrastructure
    * @return the tp infrastructure that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpInfrastructure updateTpInfrastructure(
        fi.csc.avaa.tupa.db.model.TpInfrastructure tpInfrastructure)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpInfrastructureLocalService.updateTpInfrastructure(tpInfrastructure);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _tpInfrastructureLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _tpInfrastructureLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _tpInfrastructureLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getAllInfrastructures() {
        return _tpInfrastructureLocalService.getAllInfrastructures();
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByInfrastructuresIds(
        int[] infrastructuresIds) {
        return _tpInfrastructureLocalService.getInfrastructuresByInfrastructuresIds(infrastructuresIds);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByUrns(
        java.lang.String[] urns) {
        return _tpInfrastructureLocalService.getInfrastructuresByUrns(urns);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByOrganisationIds(
        int[] organisationsIds) {
        return _tpInfrastructureLocalService.getInfrastructuresByOrganisationIds(organisationsIds);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByServiceIds(
        int[] servicesIds) {
        return _tpInfrastructureLocalService.getInfrastructuresByServiceIds(servicesIds);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByContactIds(
        int[] contactIds) {
        return _tpInfrastructureLocalService.getInfrastructuresByContactIds(contactIds);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByKeywords(
        java.lang.String[] keywords) {
        return _tpInfrastructureLocalService.getInfrastructuresByKeywords(keywords);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByServiceTypes(
        java.lang.String[] serviceTypes) {
        return _tpInfrastructureLocalService.getInfrastructuresByServiceTypes(serviceTypes);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByLocationTypes(
        java.lang.String[] locationTypes) {
        return _tpInfrastructureLocalService.getInfrastructuresByLocationTypes(locationTypes);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPostalCodes(
        int[] PostalCodes) {
        return _tpInfrastructureLocalService.getInfrastructuresByPostalCodes(PostalCodes);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByLocation(
        double latitude, double longitude) {
        return _tpInfrastructureLocalService.getInfrastructuresByLocation(latitude,
            longitude);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByCountries(
        java.lang.String[] countries) {
        return _tpInfrastructureLocalService.getInfrastructuresByCountries(countries);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPreviousIds(
        int[] previousIds) {
        return _tpInfrastructureLocalService.getInfrastructuresByPreviousIds(previousIds);
    }

    @Override
    public java.lang.String[][] getKeywords() {
        return _tpInfrastructureLocalService.getKeywords();
    }

    @Override
    public java.lang.String[] getPids() {
        return _tpInfrastructureLocalService.getPids();
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPids(
        java.lang.String[] PIDs) {
        return _tpInfrastructureLocalService.getInfrastructuresByPids(PIDs);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPreviousUrns(
        java.lang.String[] previousUrns) {
        return _tpInfrastructureLocalService.getInfrastructuresByPreviousUrns(previousUrns);
    }

    @Override
    public int[] getInfrastructuresIdsByUrns(java.lang.String[] urns) {
        return _tpInfrastructureLocalService.getInfrastructuresIdsByUrns(urns);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONObject getPidsJson(int infraId) {
        return _tpInfrastructureLocalService.getPidsJson(infraId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TpInfrastructureLocalService getWrappedTpInfrastructureLocalService() {
        return _tpInfrastructureLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTpInfrastructureLocalService(
        TpInfrastructureLocalService tpInfrastructureLocalService) {
        _tpInfrastructureLocalService = tpInfrastructureLocalService;
    }

    @Override
    public TpInfrastructureLocalService getWrappedService() {
        return _tpInfrastructureLocalService;
    }

    @Override
    public void setWrappedService(
        TpInfrastructureLocalService tpInfrastructureLocalService) {
        _tpInfrastructureLocalService = tpInfrastructureLocalService;
    }
}
