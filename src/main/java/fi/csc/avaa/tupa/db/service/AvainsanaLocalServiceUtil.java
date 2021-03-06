package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Avainsana. This utility wraps
 * {@link fi.csc.avaa.tupa.db.service.impl.AvainsanaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CSC
 * @see AvainsanaLocalService
 * @see fi.csc.avaa.tupa.db.service.base.AvainsanaLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.AvainsanaLocalServiceImpl
 * @generated
 */
public class AvainsanaLocalServiceUtil {
    private static AvainsanaLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.AvainsanaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the avainsana to the database. Also notifies the appropriate model listeners.
    *
    * @param avainsana the avainsana
    * @return the avainsana that was added
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Avainsana addAvainsana(
        fi.csc.avaa.tupa.db.model.Avainsana avainsana)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addAvainsana(avainsana);
    }

    /**
    * Creates a new avainsana with the primary key. Does not add the avainsana to the database.
    *
    * @param avainsana_id the primary key for the new avainsana
    * @return the new avainsana
    */
    public static fi.csc.avaa.tupa.db.model.Avainsana createAvainsana(
        int avainsana_id) {
        return getService().createAvainsana(avainsana_id);
    }

    /**
    * Deletes the avainsana with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param avainsana_id the primary key of the avainsana
    * @return the avainsana that was removed
    * @throws PortalException if a avainsana with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Avainsana deleteAvainsana(
        int avainsana_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteAvainsana(avainsana_id);
    }

    /**
    * Deletes the avainsana from the database. Also notifies the appropriate model listeners.
    *
    * @param avainsana the avainsana
    * @return the avainsana that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Avainsana deleteAvainsana(
        fi.csc.avaa.tupa.db.model.Avainsana avainsana)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteAvainsana(avainsana);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.AvainsanaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static fi.csc.avaa.tupa.db.model.Avainsana fetchAvainsana(
        int avainsana_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchAvainsana(avainsana_id);
    }

    /**
    * Returns the avainsana with the primary key.
    *
    * @param avainsana_id the primary key of the avainsana
    * @return the avainsana
    * @throws PortalException if a avainsana with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Avainsana getAvainsana(
        int avainsana_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getAvainsana(avainsana_id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<fi.csc.avaa.tupa.db.model.Avainsana> getAvainsanas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAvainsanas(start, end);
    }

    /**
    * Returns the number of avainsanas.
    *
    * @return the number of avainsanas
    * @throws SystemException if a system exception occurred
    */
    public static int getAvainsanasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAvainsanasCount();
    }

    /**
    * Updates the avainsana in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param avainsana the avainsana
    * @return the avainsana that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Avainsana updateAvainsana(
        fi.csc.avaa.tupa.db.model.Avainsana avainsana)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateAvainsana(avainsana);
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

    public static int[] getKeywordsIdsByKeywords(java.lang.String[] keywords) {
        return getService().getKeywordsIdsByKeywords(keywords);
    }

    public static java.lang.String[][] getKeywords() {
        return getService().getKeywords();
    }

    public static java.lang.String[] getKeywords_ENbyInfrastructureId(
        int infrastructureId) {
        return getService().getKeywords_ENbyInfrastructureId(infrastructureId);
    }

    public static java.lang.String[] getKeywords_FIbyInfrastructureId(
        int infrastructureId) {
        return getService().getKeywords_FIbyInfrastructureId(infrastructureId);
    }

    public static void clearService() {
        _service = null;
    }

    public static AvainsanaLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    AvainsanaLocalService.class.getName());

            if (invokableLocalService instanceof AvainsanaLocalService) {
                _service = (AvainsanaLocalService) invokableLocalService;
            } else {
                _service = new AvainsanaLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(AvainsanaLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(AvainsanaLocalService service) {
    }
}
