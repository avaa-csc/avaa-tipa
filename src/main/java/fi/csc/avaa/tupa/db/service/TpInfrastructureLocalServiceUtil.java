package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for TpInfrastructure. This utility wraps
 * {@link fi.csc.avaa.tupa.db.service.impl.TpInfrastructureLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CSC
 * @see TpInfrastructureLocalService
 * @see fi.csc.avaa.tupa.db.service.base.TpInfrastructureLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.TpInfrastructureLocalServiceImpl
 * @generated
 */
public class TpInfrastructureLocalServiceUtil {
    private static TpInfrastructureLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.TpInfrastructureLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the tp infrastructure to the database. Also notifies the appropriate model listeners.
    *
    * @param tpInfrastructure the tp infrastructure
    * @return the tp infrastructure that was added
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructure addTpInfrastructure(
        fi.csc.avaa.tupa.db.model.TpInfrastructure tpInfrastructure)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addTpInfrastructure(tpInfrastructure);
    }

    /**
    * Creates a new tp infrastructure with the primary key. Does not add the tp infrastructure to the database.
    *
    * @param id the primary key for the new tp infrastructure
    * @return the new tp infrastructure
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructure createTpInfrastructure(
        int id) {
        return getService().createTpInfrastructure(id);
    }

    /**
    * Deletes the tp infrastructure with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the tp infrastructure
    * @return the tp infrastructure that was removed
    * @throws PortalException if a tp infrastructure with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructure deleteTpInfrastructure(
        int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteTpInfrastructure(id);
    }

    /**
    * Deletes the tp infrastructure from the database. Also notifies the appropriate model listeners.
    *
    * @param tpInfrastructure the tp infrastructure
    * @return the tp infrastructure that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructure deleteTpInfrastructure(
        fi.csc.avaa.tupa.db.model.TpInfrastructure tpInfrastructure)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteTpInfrastructure(tpInfrastructure);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpInfrastructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpInfrastructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static fi.csc.avaa.tupa.db.model.TpInfrastructure fetchTpInfrastructure(
        int id) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchTpInfrastructure(id);
    }

    /**
    * Returns the tp infrastructure with the primary key.
    *
    * @param id the primary key of the tp infrastructure
    * @return the tp infrastructure
    * @throws PortalException if a tp infrastructure with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructure getTpInfrastructure(
        int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getTpInfrastructure(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the tp infrastructures.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpInfrastructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp infrastructures
    * @param end the upper bound of the range of tp infrastructures (not inclusive)
    * @return the range of tp infrastructures
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getTpInfrastructures(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getTpInfrastructures(start, end);
    }

    /**
    * Returns the number of tp infrastructures.
    *
    * @return the number of tp infrastructures
    * @throws SystemException if a system exception occurred
    */
    public static int getTpInfrastructuresCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getTpInfrastructuresCount();
    }

    /**
    * Updates the tp infrastructure in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param tpInfrastructure the tp infrastructure
    * @return the tp infrastructure that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructure updateTpInfrastructure(
        fi.csc.avaa.tupa.db.model.TpInfrastructure tpInfrastructure)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateTpInfrastructure(tpInfrastructure);
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

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getAllInfrastructures() {
        return getService().getAllInfrastructures();
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByInfrastructuresIds(
        int[] infrastructuresIds) {
        return getService()
                   .getInfrastructuresByInfrastructuresIds(infrastructuresIds);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByUrns(
        java.lang.String[] urns) {
        return getService().getInfrastructuresByUrns(urns);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByOrganisationIds(
        int[] organisationsIds) {
        return getService().getInfrastructuresByOrganisationIds(organisationsIds);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByServiceIds(
        int[] servicesIds) {
        return getService().getInfrastructuresByServiceIds(servicesIds);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByContactIds(
        int[] contactIds) {
        return getService().getInfrastructuresByContactIds(contactIds);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByKeywords(
        java.lang.String[] keywords) {
        return getService().getInfrastructuresByKeywords(keywords);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByServiceTypes(
        java.lang.String[] serviceTypes) {
        return getService().getInfrastructuresByServiceTypes(serviceTypes);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByLocationTypes(
        java.lang.String[] locationTypes) {
        return getService().getInfrastructuresByLocationTypes(locationTypes);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPostalCodes(
        int[] PostalCodes) {
        return getService().getInfrastructuresByPostalCodes(PostalCodes);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByLocation(
        double latitude, double longitude) {
        return getService().getInfrastructuresByLocation(latitude, longitude);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByCountries(
        java.lang.String[] countries) {
        return getService().getInfrastructuresByCountries(countries);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPreviousIds(
        int[] previousIds) {
        return getService().getInfrastructuresByPreviousIds(previousIds);
    }

    public static java.lang.String[][] getKeywords() {
        return getService().getKeywords();
    }

    public static java.lang.String[] getPids() {
        return getService().getPids();
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPids(
        java.lang.String[] PIDs) {
        return getService().getInfrastructuresByPids(PIDs);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPreviousUrns(
        java.lang.String[] previousUrns) {
        return getService().getInfrastructuresByPreviousUrns(previousUrns);
    }

    public static int[] getInfrastructuresIdsByUrns(java.lang.String[] urns) {
        return getService().getInfrastructuresIdsByUrns(urns);
    }

    public static com.liferay.portal.kernel.json.JSONObject getPidsJson(
        int infraId) {
        return getService().getPidsJson(infraId);
    }

    public static void clearService() {
        _service = null;
    }

    public static TpInfrastructureLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    TpInfrastructureLocalService.class.getName());

            if (invokableLocalService instanceof TpInfrastructureLocalService) {
                _service = (TpInfrastructureLocalService) invokableLocalService;
            } else {
                _service = new TpInfrastructureLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(TpInfrastructureLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(TpInfrastructureLocalService service) {
    }
}
