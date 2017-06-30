package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Palvelu_Palvelutyypit. This utility wraps
 * {@link fi.csc.avaa.tupa.db.service.impl.Palvelu_PalvelutyypitLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CSC
 * @see Palvelu_PalvelutyypitLocalService
 * @see fi.csc.avaa.tupa.db.service.base.Palvelu_PalvelutyypitLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.Palvelu_PalvelutyypitLocalServiceImpl
 * @generated
 */
public class Palvelu_PalvelutyypitLocalServiceUtil {
    private static Palvelu_PalvelutyypitLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.Palvelu_PalvelutyypitLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the palvelu_ palvelutyypit to the database. Also notifies the appropriate model listeners.
    *
    * @param palvelu_Palvelutyypit the palvelu_ palvelutyypit
    * @return the palvelu_ palvelutyypit that was added
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit addPalvelu_Palvelutyypit(
        fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit palvelu_Palvelutyypit)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addPalvelu_Palvelutyypit(palvelu_Palvelutyypit);
    }

    /**
    * Creates a new palvelu_ palvelutyypit with the primary key. Does not add the palvelu_ palvelutyypit to the database.
    *
    * @param palvelu_PalvelutyypitPK the primary key for the new palvelu_ palvelutyypit
    * @return the new palvelu_ palvelutyypit
    */
    public static fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit createPalvelu_Palvelutyypit(
        fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK) {
        return getService().createPalvelu_Palvelutyypit(palvelu_PalvelutyypitPK);
    }

    /**
    * Deletes the palvelu_ palvelutyypit with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param palvelu_PalvelutyypitPK the primary key of the palvelu_ palvelutyypit
    * @return the palvelu_ palvelutyypit that was removed
    * @throws PortalException if a palvelu_ palvelutyypit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit deletePalvelu_Palvelutyypit(
        fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePalvelu_Palvelutyypit(palvelu_PalvelutyypitPK);
    }

    /**
    * Deletes the palvelu_ palvelutyypit from the database. Also notifies the appropriate model listeners.
    *
    * @param palvelu_Palvelutyypit the palvelu_ palvelutyypit
    * @return the palvelu_ palvelutyypit that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit deletePalvelu_Palvelutyypit(
        fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit palvelu_Palvelutyypit)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePalvelu_Palvelutyypit(palvelu_Palvelutyypit);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit fetchPalvelu_Palvelutyypit(
        fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPalvelu_Palvelutyypit(palvelu_PalvelutyypitPK);
    }

    /**
    * Returns the palvelu_ palvelutyypit with the primary key.
    *
    * @param palvelu_PalvelutyypitPK the primary key of the palvelu_ palvelutyypit
    * @return the palvelu_ palvelutyypit
    * @throws PortalException if a palvelu_ palvelutyypit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit getPalvelu_Palvelutyypit(
        fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPalvelu_Palvelutyypit(palvelu_PalvelutyypitPK);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit> getPalvelu_Palvelutyypits(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPalvelu_Palvelutyypits(start, end);
    }

    /**
    * Returns the number of palvelu_ palvelutyypits.
    *
    * @return the number of palvelu_ palvelutyypits
    * @throws SystemException if a system exception occurred
    */
    public static int getPalvelu_PalvelutyypitsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPalvelu_PalvelutyypitsCount();
    }

    /**
    * Updates the palvelu_ palvelutyypit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param palvelu_Palvelutyypit the palvelu_ palvelutyypit
    * @return the palvelu_ palvelutyypit that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit updatePalvelu_Palvelutyypit(
        fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit palvelu_Palvelutyypit)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatePalvelu_Palvelutyypit(palvelu_Palvelutyypit);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static int[] getServiceTypesIdsByServiceId(int serviceId) {
        return getService().getServiceTypesIdsByServiceId(serviceId);
    }

    public static int[] getServiceTypesIdsByServicesIds(int[] servicesIds) {
        return getService().getServiceTypesIdsByServicesIds(servicesIds);
    }

    public static int[] getServicesIdsByServiceTypesIds(int[] serviceTypesIds) {
        return getService().getServicesIdsByServiceTypesIds(serviceTypesIds);
    }

    public static void clearService() {
        _service = null;
    }

    public static Palvelu_PalvelutyypitLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Palvelu_PalvelutyypitLocalService.class.getName());

            if (invokableLocalService instanceof Palvelu_PalvelutyypitLocalService) {
                _service = (Palvelu_PalvelutyypitLocalService) invokableLocalService;
            } else {
                _service = new Palvelu_PalvelutyypitLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(Palvelu_PalvelutyypitLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Palvelu_PalvelutyypitLocalService service) {
    }
}
