package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PalveluLocalService}.
 *
 * @author CSC
 * @see PalveluLocalService
 * @generated
 */
public class PalveluLocalServiceWrapper implements PalveluLocalService,
    ServiceWrapper<PalveluLocalService> {
    private PalveluLocalService _palveluLocalService;

    public PalveluLocalServiceWrapper(PalveluLocalService palveluLocalService) {
        _palveluLocalService = palveluLocalService;
    }

    /**
    * Adds the palvelu to the database. Also notifies the appropriate model listeners.
    *
    * @param palvelu the palvelu
    * @return the palvelu that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu addPalvelu(
        fi.csc.avaa.tupa.db.model.Palvelu palvelu)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _palveluLocalService.addPalvelu(palvelu);
    }

    /**
    * Creates a new palvelu with the primary key. Does not add the palvelu to the database.
    *
    * @param palvelu_id the primary key for the new palvelu
    * @return the new palvelu
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu createPalvelu(int palvelu_id) {
        return _palveluLocalService.createPalvelu(palvelu_id);
    }

    /**
    * Deletes the palvelu with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param palvelu_id the primary key of the palvelu
    * @return the palvelu that was removed
    * @throws PortalException if a palvelu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu deletePalvelu(int palvelu_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _palveluLocalService.deletePalvelu(palvelu_id);
    }

    /**
    * Deletes the palvelu from the database. Also notifies the appropriate model listeners.
    *
    * @param palvelu the palvelu
    * @return the palvelu that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu deletePalvelu(
        fi.csc.avaa.tupa.db.model.Palvelu palvelu)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _palveluLocalService.deletePalvelu(palvelu);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _palveluLocalService.dynamicQuery();
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
        return _palveluLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalveluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _palveluLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalveluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _palveluLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _palveluLocalService.dynamicQueryCount(dynamicQuery);
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
        return _palveluLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu fetchPalvelu(int palvelu_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _palveluLocalService.fetchPalvelu(palvelu_id);
    }

    /**
    * Returns the palvelu with the primary key.
    *
    * @param palvelu_id the primary key of the palvelu
    * @return the palvelu
    * @throws PortalException if a palvelu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu getPalvelu(int palvelu_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _palveluLocalService.getPalvelu(palvelu_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _palveluLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the palvelus.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalveluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of palvelus
    * @param end the upper bound of the range of palvelus (not inclusive)
    * @return the range of palvelus
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> getPalvelus(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _palveluLocalService.getPalvelus(start, end);
    }

    /**
    * Returns the number of palvelus.
    *
    * @return the number of palvelus
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPalvelusCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _palveluLocalService.getPalvelusCount();
    }

    /**
    * Updates the palvelu in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param palvelu the palvelu
    * @return the palvelu that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu updatePalvelu(
        fi.csc.avaa.tupa.db.model.Palvelu palvelu)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _palveluLocalService.updatePalvelu(palvelu);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _palveluLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _palveluLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _palveluLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public int[] getInfrastructuresIdsByServiceId(int serviceId) {
        return _palveluLocalService.getInfrastructuresIdsByServiceId(serviceId);
    }

    @Override
    public int[] getOrganisationsIdsByServiceId(int serviceId) {
        return _palveluLocalService.getOrganisationsIdsByServiceId(serviceId);
    }

    @Override
    public int[] getContactsIdsByServiceId(int serviceId) {
        return _palveluLocalService.getContactsIdsByServiceId(serviceId);
    }

    @Override
    public java.lang.String[] getLocationTypesByServiceId(int serviceId) {
        return _palveluLocalService.getLocationTypesByServiceId(serviceId);
    }

    @Override
    public java.lang.String[] getServiceTypesByServiceId(int serviceId) {
        return _palveluLocalService.getServiceTypesByServiceId(serviceId);
    }

    @Override
    public int[] getServicesIdsByPostalCodes(int[] PostalCodes) {
        return _palveluLocalService.getServicesIdsByPostalCodes(PostalCodes);
    }

    @Override
    public int[] getServicesIdsByLocation(double latitude, double longitude) {
        return _palveluLocalService.getServicesIdsByLocation(latitude, longitude);
    }

    @Override
    public int[] getServiceTypesIdsByServicesIds(int[] servicesIds) {
        return _palveluLocalService.getServiceTypesIdsByServicesIds(servicesIds);
    }

    @Override
    public int[] getServicesIdsByLocationTypesIds(int[] locationTypesIds) {
        return _palveluLocalService.getServicesIdsByLocationTypesIds(locationTypesIds);
    }

    @Override
    public int[] getLocationTypesIdsByServicesIds(int[] servicesIds) {
        return _palveluLocalService.getLocationTypesIdsByServicesIds(servicesIds);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PalveluLocalService getWrappedPalveluLocalService() {
        return _palveluLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPalveluLocalService(
        PalveluLocalService palveluLocalService) {
        _palveluLocalService = palveluLocalService;
    }

    @Override
    public PalveluLocalService getWrappedService() {
        return _palveluLocalService;
    }

    @Override
    public void setWrappedService(PalveluLocalService palveluLocalService) {
        _palveluLocalService = palveluLocalService;
    }
}
