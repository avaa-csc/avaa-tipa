package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Infra_Vastuuorganisaatiot. This utility wraps
 * {@link fi.csc.avaa.tupa.db.service.impl.Infra_VastuuorganisaatiotLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CSC
 * @see Infra_VastuuorganisaatiotLocalService
 * @see fi.csc.avaa.tupa.db.service.base.Infra_VastuuorganisaatiotLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.Infra_VastuuorganisaatiotLocalServiceImpl
 * @generated
 */
public class Infra_VastuuorganisaatiotLocalServiceUtil {
    private static Infra_VastuuorganisaatiotLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.Infra_VastuuorganisaatiotLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the infra_ vastuuorganisaatiot to the database. Also notifies the appropriate model listeners.
    *
    * @param infra_Vastuuorganisaatiot the infra_ vastuuorganisaatiot
    * @return the infra_ vastuuorganisaatiot that was added
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot addInfra_Vastuuorganisaatiot(
        fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addInfra_Vastuuorganisaatiot(infra_Vastuuorganisaatiot);
    }

    /**
    * Creates a new infra_ vastuuorganisaatiot with the primary key. Does not add the infra_ vastuuorganisaatiot to the database.
    *
    * @param infra_VastuuorganisaatiotPK the primary key for the new infra_ vastuuorganisaatiot
    * @return the new infra_ vastuuorganisaatiot
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot createInfra_Vastuuorganisaatiot(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK) {
        return getService()
                   .createInfra_Vastuuorganisaatiot(infra_VastuuorganisaatiotPK);
    }

    /**
    * Deletes the infra_ vastuuorganisaatiot with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_VastuuorganisaatiotPK the primary key of the infra_ vastuuorganisaatiot
    * @return the infra_ vastuuorganisaatiot that was removed
    * @throws PortalException if a infra_ vastuuorganisaatiot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot deleteInfra_Vastuuorganisaatiot(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .deleteInfra_Vastuuorganisaatiot(infra_VastuuorganisaatiotPK);
    }

    /**
    * Deletes the infra_ vastuuorganisaatiot from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_Vastuuorganisaatiot the infra_ vastuuorganisaatiot
    * @return the infra_ vastuuorganisaatiot that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot deleteInfra_Vastuuorganisaatiot(
        fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .deleteInfra_Vastuuorganisaatiot(infra_Vastuuorganisaatiot);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot fetchInfra_Vastuuorganisaatiot(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .fetchInfra_Vastuuorganisaatiot(infra_VastuuorganisaatiotPK);
    }

    /**
    * Returns the infra_ vastuuorganisaatiot with the primary key.
    *
    * @param infra_VastuuorganisaatiotPK the primary key of the infra_ vastuuorganisaatiot
    * @return the infra_ vastuuorganisaatiot
    * @throws PortalException if a infra_ vastuuorganisaatiot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot getInfra_Vastuuorganisaatiot(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getInfra_Vastuuorganisaatiot(infra_VastuuorganisaatiotPK);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the infra_ vastuuorganisaatiots.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ vastuuorganisaatiots
    * @param end the upper bound of the range of infra_ vastuuorganisaatiots (not inclusive)
    * @return the range of infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> getInfra_Vastuuorganisaatiots(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getInfra_Vastuuorganisaatiots(start, end);
    }

    /**
    * Returns the number of infra_ vastuuorganisaatiots.
    *
    * @return the number of infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public static int getInfra_VastuuorganisaatiotsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getInfra_VastuuorganisaatiotsCount();
    }

    /**
    * Updates the infra_ vastuuorganisaatiot in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param infra_Vastuuorganisaatiot the infra_ vastuuorganisaatiot
    * @return the infra_ vastuuorganisaatiot that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot updateInfra_Vastuuorganisaatiot(
        fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateInfra_Vastuuorganisaatiot(infra_Vastuuorganisaatiot);
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

    public static int[] getOrganisationsIdsByInfrastructureId(
        int infrastructureId) {
        return getService()
                   .getOrganisationsIdsByInfrastructureId(infrastructureId);
    }

    public static int[] getOrganisationsIdsByInfrastructuresIds(
        int[] infrastructuresIds) {
        return getService()
                   .getOrganisationsIdsByInfrastructuresIds(infrastructuresIds);
    }

    public static int[] getInfrastructuresIdsByOrganisationsIds(
        int[] organisationsIds) {
        return getService()
                   .getInfrastructuresIdsByOrganisationsIds(organisationsIds);
    }

    public static void clearService() {
        _service = null;
    }

    public static Infra_VastuuorganisaatiotLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Infra_VastuuorganisaatiotLocalService.class.getName());

            if (invokableLocalService instanceof Infra_VastuuorganisaatiotLocalService) {
                _service = (Infra_VastuuorganisaatiotLocalService) invokableLocalService;
            } else {
                _service = new Infra_VastuuorganisaatiotLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(Infra_VastuuorganisaatiotLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Infra_VastuuorganisaatiotLocalService service) {
    }
}
