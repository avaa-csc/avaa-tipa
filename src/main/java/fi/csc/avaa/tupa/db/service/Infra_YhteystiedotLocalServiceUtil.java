package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Infra_Yhteystiedot. This utility wraps
 * {@link fi.csc.avaa.tupa.db.service.impl.Infra_YhteystiedotLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CSC
 * @see Infra_YhteystiedotLocalService
 * @see fi.csc.avaa.tupa.db.service.base.Infra_YhteystiedotLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.Infra_YhteystiedotLocalServiceImpl
 * @generated
 */
public class Infra_YhteystiedotLocalServiceUtil {
    private static Infra_YhteystiedotLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.Infra_YhteystiedotLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the infra_ yhteystiedot to the database. Also notifies the appropriate model listeners.
    *
    * @param infra_Yhteystiedot the infra_ yhteystiedot
    * @return the infra_ yhteystiedot that was added
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot addInfra_Yhteystiedot(
        fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot infra_Yhteystiedot)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addInfra_Yhteystiedot(infra_Yhteystiedot);
    }

    /**
    * Creates a new infra_ yhteystiedot with the primary key. Does not add the infra_ yhteystiedot to the database.
    *
    * @param infra_YhteystiedotPK the primary key for the new infra_ yhteystiedot
    * @return the new infra_ yhteystiedot
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot createInfra_Yhteystiedot(
        fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK infra_YhteystiedotPK) {
        return getService().createInfra_Yhteystiedot(infra_YhteystiedotPK);
    }

    /**
    * Deletes the infra_ yhteystiedot with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_YhteystiedotPK the primary key of the infra_ yhteystiedot
    * @return the infra_ yhteystiedot that was removed
    * @throws PortalException if a infra_ yhteystiedot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot deleteInfra_Yhteystiedot(
        fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK infra_YhteystiedotPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteInfra_Yhteystiedot(infra_YhteystiedotPK);
    }

    /**
    * Deletes the infra_ yhteystiedot from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_Yhteystiedot the infra_ yhteystiedot
    * @return the infra_ yhteystiedot that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot deleteInfra_Yhteystiedot(
        fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot infra_Yhteystiedot)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteInfra_Yhteystiedot(infra_Yhteystiedot);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_YhteystiedotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_YhteystiedotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot fetchInfra_Yhteystiedot(
        fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK infra_YhteystiedotPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchInfra_Yhteystiedot(infra_YhteystiedotPK);
    }

    /**
    * Returns the infra_ yhteystiedot with the primary key.
    *
    * @param infra_YhteystiedotPK the primary key of the infra_ yhteystiedot
    * @return the infra_ yhteystiedot
    * @throws PortalException if a infra_ yhteystiedot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot getInfra_Yhteystiedot(
        fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK infra_YhteystiedotPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getInfra_Yhteystiedot(infra_YhteystiedotPK);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the infra_ yhteystiedots.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_YhteystiedotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ yhteystiedots
    * @param end the upper bound of the range of infra_ yhteystiedots (not inclusive)
    * @return the range of infra_ yhteystiedots
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot> getInfra_Yhteystiedots(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getInfra_Yhteystiedots(start, end);
    }

    /**
    * Returns the number of infra_ yhteystiedots.
    *
    * @return the number of infra_ yhteystiedots
    * @throws SystemException if a system exception occurred
    */
    public static int getInfra_YhteystiedotsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getInfra_YhteystiedotsCount();
    }

    /**
    * Updates the infra_ yhteystiedot in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param infra_Yhteystiedot the infra_ yhteystiedot
    * @return the infra_ yhteystiedot that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot updateInfra_Yhteystiedot(
        fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot infra_Yhteystiedot)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateInfra_Yhteystiedot(infra_Yhteystiedot);
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

    public static int[] getContactsIdsByInfrastructureId(int infrastructureId) {
        return getService().getContactsIdsByInfrastructureId(infrastructureId);
    }

    public static int[] getContactsIdsByInfrastructuresIds(
        int[] infrastructuresIds) {
        return getService()
                   .getContactsIdsByInfrastructuresIds(infrastructuresIds);
    }

    public static int[] getInfrastructuresIdsByContactsIds(int[] contactsIds) {
        return getService().getInfrastructuresIdsByContactsIds(contactsIds);
    }

    public static void clearService() {
        _service = null;
    }

    public static Infra_YhteystiedotLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Infra_YhteystiedotLocalService.class.getName());

            if (invokableLocalService instanceof Infra_YhteystiedotLocalService) {
                _service = (Infra_YhteystiedotLocalService) invokableLocalService;
            } else {
                _service = new Infra_YhteystiedotLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(Infra_YhteystiedotLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Infra_YhteystiedotLocalService service) {
    }
}
