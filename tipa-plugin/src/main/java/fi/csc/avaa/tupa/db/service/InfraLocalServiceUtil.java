package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Infra. This utility wraps
 * {@link fi.csc.avaa.tupa.db.service.impl.InfraLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author pj,jmlehtin
 * @see InfraLocalService
 * @see fi.csc.avaa.tupa.db.service.base.InfraLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.InfraLocalServiceImpl
 * @generated
 */
public class InfraLocalServiceUtil {
    private static InfraLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.InfraLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the infra to the database. Also notifies the appropriate model listeners.
    *
    * @param infra the infra
    * @return the infra that was added
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra addInfra(
        fi.csc.avaa.tupa.db.model.Infra infra)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addInfra(infra);
    }

    /**
    * Creates a new infra with the primary key. Does not add the infra to the database.
    *
    * @param infra_id the primary key for the new infra
    * @return the new infra
    */
    public static fi.csc.avaa.tupa.db.model.Infra createInfra(int infra_id) {
        return getService().createInfra(infra_id);
    }

    /**
    * Deletes the infra with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_id the primary key of the infra
    * @return the infra that was removed
    * @throws PortalException if a infra with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra deleteInfra(int infra_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteInfra(infra_id);
    }

    /**
    * Deletes the infra from the database. Also notifies the appropriate model listeners.
    *
    * @param infra the infra
    * @return the infra that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra deleteInfra(
        fi.csc.avaa.tupa.db.model.Infra infra)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteInfra(infra);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static fi.csc.avaa.tupa.db.model.Infra fetchInfra(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchInfra(infra_id);
    }

    /**
    * Returns the infra with the primary key.
    *
    * @param infra_id the primary key of the infra
    * @return the infra
    * @throws PortalException if a infra with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra getInfra(int infra_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getInfra(infra_id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the infras.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infras
    * @param end the upper bound of the range of infras (not inclusive)
    * @return the range of infras
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra> getInfras(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getInfras(start, end);
    }

    /**
    * Returns the number of infras.
    *
    * @return the number of infras
    * @throws SystemException if a system exception occurred
    */
    public static int getInfrasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getInfrasCount();
    }

    /**
    * Updates the infra in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param infra the infra
    * @return the infra that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra updateInfra(
        fi.csc.avaa.tupa.db.model.Infra infra)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateInfra(infra);
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

    public static void clearService() {
        _service = null;
    }

    public static InfraLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    InfraLocalService.class.getName());

            if (invokableLocalService instanceof InfraLocalService) {
                _service = (InfraLocalService) invokableLocalService;
            } else {
                _service = new InfraLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(InfraLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(InfraLocalService service) {
    }
}
