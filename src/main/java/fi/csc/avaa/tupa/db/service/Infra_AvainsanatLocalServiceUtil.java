package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Infra_Avainsanat. This utility wraps
 * {@link fi.csc.avaa.tupa.db.service.impl.Infra_AvainsanatLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CSC
 * @see Infra_AvainsanatLocalService
 * @see fi.csc.avaa.tupa.db.service.base.Infra_AvainsanatLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.Infra_AvainsanatLocalServiceImpl
 * @generated
 */
public class Infra_AvainsanatLocalServiceUtil {
    private static Infra_AvainsanatLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.Infra_AvainsanatLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the infra_ avainsanat to the database. Also notifies the appropriate model listeners.
    *
    * @param infra_Avainsanat the infra_ avainsanat
    * @return the infra_ avainsanat that was added
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Avainsanat addInfra_Avainsanat(
        fi.csc.avaa.tupa.db.model.Infra_Avainsanat infra_Avainsanat)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addInfra_Avainsanat(infra_Avainsanat);
    }

    /**
    * Creates a new infra_ avainsanat with the primary key. Does not add the infra_ avainsanat to the database.
    *
    * @param infra_AvainsanatPK the primary key for the new infra_ avainsanat
    * @return the new infra_ avainsanat
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Avainsanat createInfra_Avainsanat(
        fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK infra_AvainsanatPK) {
        return getService().createInfra_Avainsanat(infra_AvainsanatPK);
    }

    /**
    * Deletes the infra_ avainsanat with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_AvainsanatPK the primary key of the infra_ avainsanat
    * @return the infra_ avainsanat that was removed
    * @throws PortalException if a infra_ avainsanat with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Avainsanat deleteInfra_Avainsanat(
        fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK infra_AvainsanatPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteInfra_Avainsanat(infra_AvainsanatPK);
    }

    /**
    * Deletes the infra_ avainsanat from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_Avainsanat the infra_ avainsanat
    * @return the infra_ avainsanat that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Avainsanat deleteInfra_Avainsanat(
        fi.csc.avaa.tupa.db.model.Infra_Avainsanat infra_Avainsanat)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteInfra_Avainsanat(infra_Avainsanat);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static fi.csc.avaa.tupa.db.model.Infra_Avainsanat fetchInfra_Avainsanat(
        fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK infra_AvainsanatPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchInfra_Avainsanat(infra_AvainsanatPK);
    }

    /**
    * Returns the infra_ avainsanat with the primary key.
    *
    * @param infra_AvainsanatPK the primary key of the infra_ avainsanat
    * @return the infra_ avainsanat
    * @throws PortalException if a infra_ avainsanat with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Avainsanat getInfra_Avainsanat(
        fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK infra_AvainsanatPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getInfra_Avainsanat(infra_AvainsanatPK);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the infra_ avainsanats.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ avainsanats
    * @param end the upper bound of the range of infra_ avainsanats (not inclusive)
    * @return the range of infra_ avainsanats
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Avainsanat> getInfra_Avainsanats(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getInfra_Avainsanats(start, end);
    }

    /**
    * Returns the number of infra_ avainsanats.
    *
    * @return the number of infra_ avainsanats
    * @throws SystemException if a system exception occurred
    */
    public static int getInfra_AvainsanatsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getInfra_AvainsanatsCount();
    }

    /**
    * Updates the infra_ avainsanat in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param infra_Avainsanat the infra_ avainsanat
    * @return the infra_ avainsanat that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Avainsanat updateInfra_Avainsanat(
        fi.csc.avaa.tupa.db.model.Infra_Avainsanat infra_Avainsanat)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateInfra_Avainsanat(infra_Avainsanat);
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

    public static int[] getKeywordsIdsByInfrastructureId(int infrastructureId) {
        return getService().getKeywordsIdsByInfrastructureId(infrastructureId);
    }

    public static int[] getKeywordsIdsByInfrastructuresIds(
        int[] infrastructuresIds) {
        return getService()
                   .getKeywordsIdsByInfrastructuresIds(infrastructuresIds);
    }

    public static int[] getInfrastructuresIdsByKeywordsIds(int[] keywordsIds) {
        return getService().getInfrastructuresIdsByKeywordsIds(keywordsIds);
    }

    public static void clearService() {
        _service = null;
    }

    public static Infra_AvainsanatLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Infra_AvainsanatLocalService.class.getName());

            if (invokableLocalService instanceof Infra_AvainsanatLocalService) {
                _service = (Infra_AvainsanatLocalService) invokableLocalService;
            } else {
                _service = new Infra_AvainsanatLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(Infra_AvainsanatLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Infra_AvainsanatLocalService service) {
    }
}
