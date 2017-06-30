package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Palvelutyyppi. This utility wraps
 * {@link fi.csc.avaa.tupa.db.service.impl.PalvelutyyppiLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CSC
 * @see PalvelutyyppiLocalService
 * @see fi.csc.avaa.tupa.db.service.base.PalvelutyyppiLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.PalvelutyyppiLocalServiceImpl
 * @generated
 */
public class PalvelutyyppiLocalServiceUtil {
    private static PalvelutyyppiLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.PalvelutyyppiLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the palvelutyyppi to the database. Also notifies the appropriate model listeners.
    *
    * @param palvelutyyppi the palvelutyyppi
    * @return the palvelutyyppi that was added
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelutyyppi addPalvelutyyppi(
        fi.csc.avaa.tupa.db.model.Palvelutyyppi palvelutyyppi)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addPalvelutyyppi(palvelutyyppi);
    }

    /**
    * Creates a new palvelutyyppi with the primary key. Does not add the palvelutyyppi to the database.
    *
    * @param palvelutyyppi_id the primary key for the new palvelutyyppi
    * @return the new palvelutyyppi
    */
    public static fi.csc.avaa.tupa.db.model.Palvelutyyppi createPalvelutyyppi(
        int palvelutyyppi_id) {
        return getService().createPalvelutyyppi(palvelutyyppi_id);
    }

    /**
    * Deletes the palvelutyyppi with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param palvelutyyppi_id the primary key of the palvelutyyppi
    * @return the palvelutyyppi that was removed
    * @throws PortalException if a palvelutyyppi with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelutyyppi deletePalvelutyyppi(
        int palvelutyyppi_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePalvelutyyppi(palvelutyyppi_id);
    }

    /**
    * Deletes the palvelutyyppi from the database. Also notifies the appropriate model listeners.
    *
    * @param palvelutyyppi the palvelutyyppi
    * @return the palvelutyyppi that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelutyyppi deletePalvelutyyppi(
        fi.csc.avaa.tupa.db.model.Palvelutyyppi palvelutyyppi)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePalvelutyyppi(palvelutyyppi);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalvelutyyppiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalvelutyyppiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static fi.csc.avaa.tupa.db.model.Palvelutyyppi fetchPalvelutyyppi(
        int palvelutyyppi_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPalvelutyyppi(palvelutyyppi_id);
    }

    /**
    * Returns the palvelutyyppi with the primary key.
    *
    * @param palvelutyyppi_id the primary key of the palvelutyyppi
    * @return the palvelutyyppi
    * @throws PortalException if a palvelutyyppi with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelutyyppi getPalvelutyyppi(
        int palvelutyyppi_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPalvelutyyppi(palvelutyyppi_id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the palvelutyyppis.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalvelutyyppiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of palvelutyyppis
    * @param end the upper bound of the range of palvelutyyppis (not inclusive)
    * @return the range of palvelutyyppis
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Palvelutyyppi> getPalvelutyyppis(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPalvelutyyppis(start, end);
    }

    /**
    * Returns the number of palvelutyyppis.
    *
    * @return the number of palvelutyyppis
    * @throws SystemException if a system exception occurred
    */
    public static int getPalvelutyyppisCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPalvelutyyppisCount();
    }

    /**
    * Updates the palvelutyyppi in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param palvelutyyppi the palvelutyyppi
    * @return the palvelutyyppi that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelutyyppi updatePalvelutyyppi(
        fi.csc.avaa.tupa.db.model.Palvelutyyppi palvelutyyppi)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatePalvelutyyppi(palvelutyyppi);
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

    public static int[] getServiceTypesIdsByDefinitionsIds(int[] definitionsIds) {
        return getService().getServiceTypesIdsByDefinitionsIds(definitionsIds);
    }

    public static int[] getDefinitionsIdsByServiceTypesIds(
        int[] serviceTypesIds) {
        return getService().getDefinitionsIdsByServiceTypesIds(serviceTypesIds);
    }

    public static void clearService() {
        _service = null;
    }

    public static PalvelutyyppiLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PalvelutyyppiLocalService.class.getName());

            if (invokableLocalService instanceof PalvelutyyppiLocalService) {
                _service = (PalvelutyyppiLocalService) invokableLocalService;
            } else {
                _service = new PalvelutyyppiLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(PalvelutyyppiLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PalvelutyyppiLocalService service) {
    }
}
