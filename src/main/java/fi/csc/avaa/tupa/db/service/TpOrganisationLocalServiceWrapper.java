package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TpOrganisationLocalService}.
 *
 * @author CSC
 * @see TpOrganisationLocalService
 * @generated
 */
public class TpOrganisationLocalServiceWrapper
    implements TpOrganisationLocalService,
        ServiceWrapper<TpOrganisationLocalService> {
    private TpOrganisationLocalService _tpOrganisationLocalService;

    public TpOrganisationLocalServiceWrapper(
        TpOrganisationLocalService tpOrganisationLocalService) {
        _tpOrganisationLocalService = tpOrganisationLocalService;
    }

    /**
    * Adds the tp organisation to the database. Also notifies the appropriate model listeners.
    *
    * @param tpOrganisation the tp organisation
    * @return the tp organisation that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpOrganisation addTpOrganisation(
        fi.csc.avaa.tupa.db.model.TpOrganisation tpOrganisation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpOrganisationLocalService.addTpOrganisation(tpOrganisation);
    }

    /**
    * Creates a new tp organisation with the primary key. Does not add the tp organisation to the database.
    *
    * @param id the primary key for the new tp organisation
    * @return the new tp organisation
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpOrganisation createTpOrganisation(int id) {
        return _tpOrganisationLocalService.createTpOrganisation(id);
    }

    /**
    * Deletes the tp organisation with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the tp organisation
    * @return the tp organisation that was removed
    * @throws PortalException if a tp organisation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpOrganisation deleteTpOrganisation(int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tpOrganisationLocalService.deleteTpOrganisation(id);
    }

    /**
    * Deletes the tp organisation from the database. Also notifies the appropriate model listeners.
    *
    * @param tpOrganisation the tp organisation
    * @return the tp organisation that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpOrganisation deleteTpOrganisation(
        fi.csc.avaa.tupa.db.model.TpOrganisation tpOrganisation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpOrganisationLocalService.deleteTpOrganisation(tpOrganisation);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _tpOrganisationLocalService.dynamicQuery();
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
        return _tpOrganisationLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpOrganisationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _tpOrganisationLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpOrganisationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _tpOrganisationLocalService.dynamicQuery(dynamicQuery, start,
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
        return _tpOrganisationLocalService.dynamicQueryCount(dynamicQuery);
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
        return _tpOrganisationLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.TpOrganisation fetchTpOrganisation(int id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpOrganisationLocalService.fetchTpOrganisation(id);
    }

    /**
    * Returns the tp organisation with the primary key.
    *
    * @param id the primary key of the tp organisation
    * @return the tp organisation
    * @throws PortalException if a tp organisation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpOrganisation getTpOrganisation(int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tpOrganisationLocalService.getTpOrganisation(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tpOrganisationLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the tp organisations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpOrganisationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp organisations
    * @param end the upper bound of the range of tp organisations (not inclusive)
    * @return the range of tp organisations
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getTpOrganisations(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpOrganisationLocalService.getTpOrganisations(start, end);
    }

    /**
    * Returns the number of tp organisations.
    *
    * @return the number of tp organisations
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getTpOrganisationsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpOrganisationLocalService.getTpOrganisationsCount();
    }

    /**
    * Updates the tp organisation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param tpOrganisation the tp organisation
    * @return the tp organisation that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.TpOrganisation updateTpOrganisation(
        fi.csc.avaa.tupa.db.model.TpOrganisation tpOrganisation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tpOrganisationLocalService.updateTpOrganisation(tpOrganisation);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _tpOrganisationLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _tpOrganisationLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _tpOrganisationLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getAllOrganisations() {
        return _tpOrganisationLocalService.getAllOrganisations();
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByOrganisationsIds(
        int[] organisationsIds) {
        return _tpOrganisationLocalService.getOrganisationsByOrganisationsIds(organisationsIds);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByIsnis(
        java.lang.String[] organisationsIsnis) {
        return _tpOrganisationLocalService.getOrganisationsByIsnis(organisationsIsnis);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByInfrastructuresIds(
        int[] infrastructuresIds) {
        return _tpOrganisationLocalService.getOrganisationsByInfrastructuresIds(infrastructuresIds);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByInfrastructuresUrns(
        java.lang.String[] infrastructuresUrns) {
        return _tpOrganisationLocalService.getOrganisationsByInfrastructuresUrns(infrastructuresUrns);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByServicesIds(
        int[] servicesIds) {
        return _tpOrganisationLocalService.getOrganisationsByServicesIds(servicesIds);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByContactsIds(
        int[] contactsIds) {
        return _tpOrganisationLocalService.getOrganisationsByContactsIds(contactsIds);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByServiceTypes(
        java.lang.String[] serviceTypes) {
        return _tpOrganisationLocalService.getOrganisationsByServiceTypes(serviceTypes);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByLocationTypes(
        java.lang.String[] locationTypes) {
        return _tpOrganisationLocalService.getOrganisationsByLocationTypes(locationTypes);
    }

    @Override
    public java.lang.String[] getCountries() {
        return _tpOrganisationLocalService.getCountries();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TpOrganisationLocalService getWrappedTpOrganisationLocalService() {
        return _tpOrganisationLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTpOrganisationLocalService(
        TpOrganisationLocalService tpOrganisationLocalService) {
        _tpOrganisationLocalService = tpOrganisationLocalService;
    }

    @Override
    public TpOrganisationLocalService getWrappedService() {
        return _tpOrganisationLocalService;
    }

    @Override
    public void setWrappedService(
        TpOrganisationLocalService tpOrganisationLocalService) {
        _tpOrganisationLocalService = tpOrganisationLocalService;
    }
}
