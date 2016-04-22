package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Palvelu_PalvelutyypitLocalService}.
 *
 * @author pj,jmlehtin
 * @see Palvelu_PalvelutyypitLocalService
 * @generated
 */
public class Palvelu_PalvelutyypitLocalServiceWrapper
    implements Palvelu_PalvelutyypitLocalService,
        ServiceWrapper<Palvelu_PalvelutyypitLocalService> {
    private Palvelu_PalvelutyypitLocalService _palvelu_PalvelutyypitLocalService;

    public Palvelu_PalvelutyypitLocalServiceWrapper(
        Palvelu_PalvelutyypitLocalService palvelu_PalvelutyypitLocalService) {
        _palvelu_PalvelutyypitLocalService = palvelu_PalvelutyypitLocalService;
    }

    /**
    * Adds the palvelu_ palvelutyypit to the database. Also notifies the appropriate model listeners.
    *
    * @param palvelu_Palvelutyypit the palvelu_ palvelutyypit
    * @return the palvelu_ palvelutyypit that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit addPalvelu_Palvelutyypit(
        fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit palvelu_Palvelutyypit)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _palvelu_PalvelutyypitLocalService.addPalvelu_Palvelutyypit(palvelu_Palvelutyypit);
    }

    /**
    * Creates a new palvelu_ palvelutyypit with the primary key. Does not add the palvelu_ palvelutyypit to the database.
    *
    * @param palvelu_PalvelutyypitPK the primary key for the new palvelu_ palvelutyypit
    * @return the new palvelu_ palvelutyypit
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit createPalvelu_Palvelutyypit(
        fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK) {
        return _palvelu_PalvelutyypitLocalService.createPalvelu_Palvelutyypit(palvelu_PalvelutyypitPK);
    }

    /**
    * Deletes the palvelu_ palvelutyypit with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param palvelu_PalvelutyypitPK the primary key of the palvelu_ palvelutyypit
    * @return the palvelu_ palvelutyypit that was removed
    * @throws PortalException if a palvelu_ palvelutyypit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit deletePalvelu_Palvelutyypit(
        fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _palvelu_PalvelutyypitLocalService.deletePalvelu_Palvelutyypit(palvelu_PalvelutyypitPK);
    }

    /**
    * Deletes the palvelu_ palvelutyypit from the database. Also notifies the appropriate model listeners.
    *
    * @param palvelu_Palvelutyypit the palvelu_ palvelutyypit
    * @return the palvelu_ palvelutyypit that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit deletePalvelu_Palvelutyypit(
        fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit palvelu_Palvelutyypit)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _palvelu_PalvelutyypitLocalService.deletePalvelu_Palvelutyypit(palvelu_Palvelutyypit);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _palvelu_PalvelutyypitLocalService.dynamicQuery();
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
        return _palvelu_PalvelutyypitLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Palvelu_PalvelutyypitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _palvelu_PalvelutyypitLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Palvelu_PalvelutyypitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _palvelu_PalvelutyypitLocalService.dynamicQuery(dynamicQuery,
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
        return _palvelu_PalvelutyypitLocalService.dynamicQueryCount(dynamicQuery);
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
        return _palvelu_PalvelutyypitLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit fetchPalvelu_Palvelutyypit(
        fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _palvelu_PalvelutyypitLocalService.fetchPalvelu_Palvelutyypit(palvelu_PalvelutyypitPK);
    }

    /**
    * Returns the palvelu_ palvelutyypit with the primary key.
    *
    * @param palvelu_PalvelutyypitPK the primary key of the palvelu_ palvelutyypit
    * @return the palvelu_ palvelutyypit
    * @throws PortalException if a palvelu_ palvelutyypit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit getPalvelu_Palvelutyypit(
        fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _palvelu_PalvelutyypitLocalService.getPalvelu_Palvelutyypit(palvelu_PalvelutyypitPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _palvelu_PalvelutyypitLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the palvelu_ palvelutyypits.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Palvelu_PalvelutyypitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of palvelu_ palvelutyypits
    * @param end the upper bound of the range of palvelu_ palvelutyypits (not inclusive)
    * @return the range of palvelu_ palvelutyypits
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit> getPalvelu_Palvelutyypits(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _palvelu_PalvelutyypitLocalService.getPalvelu_Palvelutyypits(start,
            end);
    }

    /**
    * Returns the number of palvelu_ palvelutyypits.
    *
    * @return the number of palvelu_ palvelutyypits
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPalvelu_PalvelutyypitsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _palvelu_PalvelutyypitLocalService.getPalvelu_PalvelutyypitsCount();
    }

    /**
    * Updates the palvelu_ palvelutyypit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param palvelu_Palvelutyypit the palvelu_ palvelutyypit
    * @return the palvelu_ palvelutyypit that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit updatePalvelu_Palvelutyypit(
        fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit palvelu_Palvelutyypit)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _palvelu_PalvelutyypitLocalService.updatePalvelu_Palvelutyypit(palvelu_Palvelutyypit);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _palvelu_PalvelutyypitLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _palvelu_PalvelutyypitLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _palvelu_PalvelutyypitLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Palvelu_PalvelutyypitLocalService getWrappedPalvelu_PalvelutyypitLocalService() {
        return _palvelu_PalvelutyypitLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPalvelu_PalvelutyypitLocalService(
        Palvelu_PalvelutyypitLocalService palvelu_PalvelutyypitLocalService) {
        _palvelu_PalvelutyypitLocalService = palvelu_PalvelutyypitLocalService;
    }

    @Override
    public Palvelu_PalvelutyypitLocalService getWrappedService() {
        return _palvelu_PalvelutyypitLocalService;
    }

    @Override
    public void setWrappedService(
        Palvelu_PalvelutyypitLocalService palvelu_PalvelutyypitLocalService) {
        _palvelu_PalvelutyypitLocalService = palvelu_PalvelutyypitLocalService;
    }
}
