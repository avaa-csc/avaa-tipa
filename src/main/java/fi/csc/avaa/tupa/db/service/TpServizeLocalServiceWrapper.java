package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TpServizeLocalService}.
 *
 * @author CSC
 * @see TpServizeLocalService
 * @generated
 */
public class TpServizeLocalServiceWrapper implements TpServizeLocalService,
    ServiceWrapper<TpServizeLocalService> {
    private TpServizeLocalService _tpServizeLocalService;

    public TpServizeLocalServiceWrapper(
        TpServizeLocalService tpServizeLocalService) {
        _tpServizeLocalService = tpServizeLocalService;
    }

    /**
    * Adds the tp servize to the database. Also notifies the appropriate model listeners.
    *
    * @param tpServize the tp servize
    * @return the tp servize that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpServize addTpServize(
        fi.csc.avaa.tupa.db.model.TpServize tpServize)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpServizeLocalService.addTpServize(tpServize);
    }

    /**
    * Creates a new tp servize with the primary key. Does not add the tp servize to the database.
    *
    * @param id the primary key for the new tp servize
    * @return the new tp servize
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpServize createTpServize(int id) {
        return _tpServizeLocalService.createTpServize(id);
    }

    /**
    * Deletes the tp servize with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the tp servize
    * @return the tp servize that was removed
    * @throws PortalException if a tp servize with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpServize deleteTpServize(int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tpServizeLocalService.deleteTpServize(id);
    }

    /**
    * Deletes the tp servize from the database. Also notifies the appropriate model listeners.
    *
    * @param tpServize the tp servize
    * @return the tp servize that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpServize deleteTpServize(
        fi.csc.avaa.tupa.db.model.TpServize tpServize)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpServizeLocalService.deleteTpServize(tpServize);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _tpServizeLocalService.dynamicQuery();
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
        return _tpServizeLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpServizeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _tpServizeLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpServizeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _tpServizeLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _tpServizeLocalService.dynamicQueryCount(dynamicQuery);
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
        return _tpServizeLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.TpServize fetchTpServize(int id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpServizeLocalService.fetchTpServize(id);
    }

    /**
    * Returns the tp servize with the primary key.
    *
    * @param id the primary key of the tp servize
    * @return the tp servize
    * @throws PortalException if a tp servize with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpServize getTpServize(int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tpServizeLocalService.getTpServize(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tpServizeLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the tp servizes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpServizeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp servizes
    * @param end the upper bound of the range of tp servizes (not inclusive)
    * @return the range of tp servizes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getTpServizes(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpServizeLocalService.getTpServizes(start, end);
    }

    /**
    * Returns the number of tp servizes.
    *
    * @return the number of tp servizes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getTpServizesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpServizeLocalService.getTpServizesCount();
    }

    /**
    * Updates the tp servize in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param tpServize the tp servize
    * @return the tp servize that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpServize updateTpServize(
        fi.csc.avaa.tupa.db.model.TpServize tpServize)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpServizeLocalService.updateTpServize(tpServize);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _tpServizeLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _tpServizeLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _tpServizeLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getAllServices() {
        return _tpServizeLocalService.getAllServices();
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByServicesIds(
        int[] servicesIds) {
        return _tpServizeLocalService.getServicesByServicesIds(servicesIds);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByInfrastructuresIds(
        int[] infrastructuresIds) {
        return _tpServizeLocalService.getServicesByInfrastructuresIds(infrastructuresIds);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByInfrastructuresUrns(
        java.lang.String[] infrastructuresUrns) {
        return _tpServizeLocalService.getServicesByInfrastructuresUrns(infrastructuresUrns);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByOrganisationsIds(
        int[] organisationsIds) {
        return _tpServizeLocalService.getServicesByOrganisationsIds(organisationsIds);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByContactsIds(
        int[] contactsIds) {
        return _tpServizeLocalService.getServicesByContactsIds(contactsIds);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByKeywords(
        java.lang.String[] keywords) {
        return _tpServizeLocalService.getServicesByKeywords(keywords);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByServiceTypes(
        java.lang.String[] serviceTypes) {
        return _tpServizeLocalService.getServicesByServiceTypes(serviceTypes);
    }

    @Override
    public java.lang.String[][] getServiceTypes() {
        return _tpServizeLocalService.getServiceTypes();
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByLocationTypes(
        java.lang.String[] locationTypes) {
        return _tpServizeLocalService.getServicesByLocationTypes(locationTypes);
    }

    @Override
    public java.lang.String[][] getLocationTypes() {
        return _tpServizeLocalService.getLocationTypes();
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByPostalCodes(
        int[] PostalCodes) {
        return _tpServizeLocalService.getServicesByPostalCodes(PostalCodes);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByLocation(
        double latitude, double longitude) {
        return _tpServizeLocalService.getServicesByLocation(latitude, longitude);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> getServicesByCountries(
        java.lang.String[] countries) {
        return _tpServizeLocalService.getServicesByCountries(countries);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TpServizeLocalService getWrappedTpServizeLocalService() {
        return _tpServizeLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTpServizeLocalService(
        TpServizeLocalService tpServizeLocalService) {
        _tpServizeLocalService = tpServizeLocalService;
    }

    @Override
    public TpServizeLocalService getWrappedService() {
        return _tpServizeLocalService;
    }

    @Override
    public void setWrappedService(TpServizeLocalService tpServizeLocalService) {
        _tpServizeLocalService = tpServizeLocalService;
    }
}
