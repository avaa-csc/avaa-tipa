package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for TpOrganisation. This utility wraps
 * {@link fi.csc.avaa.tupa.db.service.impl.TpOrganisationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CSC
 * @see TpOrganisationLocalService
 * @see fi.csc.avaa.tupa.db.service.base.TpOrganisationLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.TpOrganisationLocalServiceImpl
 * @generated
 */
public class TpOrganisationLocalServiceUtil {
    private static TpOrganisationLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.TpOrganisationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the tp organisation to the database. Also notifies the appropriate model listeners.
    *
    * @param tpOrganisation the tp organisation
    * @return the tp organisation that was added
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisation addTpOrganisation(
        fi.csc.avaa.tupa.db.model.TpOrganisation tpOrganisation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addTpOrganisation(tpOrganisation);
    }

    /**
    * Creates a new tp organisation with the primary key. Does not add the tp organisation to the database.
    *
    * @param id the primary key for the new tp organisation
    * @return the new tp organisation
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisation createTpOrganisation(
        int id) {
        return getService().createTpOrganisation(id);
    }

    /**
    * Deletes the tp organisation with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the tp organisation
    * @return the tp organisation that was removed
    * @throws PortalException if a tp organisation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisation deleteTpOrganisation(
        int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteTpOrganisation(id);
    }

    /**
    * Deletes the tp organisation from the database. Also notifies the appropriate model listeners.
    *
    * @param tpOrganisation the tp organisation
    * @return the tp organisation that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisation deleteTpOrganisation(
        fi.csc.avaa.tupa.db.model.TpOrganisation tpOrganisation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteTpOrganisation(tpOrganisation);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpOrganisationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpOrganisationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static fi.csc.avaa.tupa.db.model.TpOrganisation fetchTpOrganisation(
        int id) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchTpOrganisation(id);
    }

    /**
    * Returns the tp organisation with the primary key.
    *
    * @param id the primary key of the tp organisation
    * @return the tp organisation
    * @throws PortalException if a tp organisation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisation getTpOrganisation(
        int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getTpOrganisation(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the tp organisations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpOrganisationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp organisations
    * @param end the upper bound of the range of tp organisations (not inclusive)
    * @return the range of tp organisations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getTpOrganisations(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getTpOrganisations(start, end);
    }

    /**
    * Returns the number of tp organisations.
    *
    * @return the number of tp organisations
    * @throws SystemException if a system exception occurred
    */
    public static int getTpOrganisationsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getTpOrganisationsCount();
    }

    /**
    * Updates the tp organisation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param tpOrganisation the tp organisation
    * @return the tp organisation that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisation updateTpOrganisation(
        fi.csc.avaa.tupa.db.model.TpOrganisation tpOrganisation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateTpOrganisation(tpOrganisation);
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

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getAllOrganisations() {
        return getService().getAllOrganisations();
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByOrganisationsIds(
        int[] organisationsIds) {
        return getService().getOrganisationsByOrganisationsIds(organisationsIds);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByIsnis(
        java.lang.String[] organisationsIsnis) {
        return getService().getOrganisationsByIsnis(organisationsIsnis);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByInfrastructuresIds(
        int[] infrastructuresIds) {
        return getService()
                   .getOrganisationsByInfrastructuresIds(infrastructuresIds);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByInfrastructuresUrns(
        java.lang.String[] infrastructuresUrns) {
        return getService()
                   .getOrganisationsByInfrastructuresUrns(infrastructuresUrns);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByServicesIds(
        int[] servicesIds) {
        return getService().getOrganisationsByServicesIds(servicesIds);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByContactsIds(
        int[] contactsIds) {
        return getService().getOrganisationsByContactsIds(contactsIds);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByServiceTypes(
        java.lang.String[] serviceTypes) {
        return getService().getOrganisationsByServiceTypes(serviceTypes);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> getOrganisationsByLocationTypes(
        java.lang.String[] locationTypes) {
        return getService().getOrganisationsByLocationTypes(locationTypes);
    }

    public static java.lang.String[] getCountries() {
        return getService().getCountries();
    }

    public static void clearService() {
        _service = null;
    }

    public static TpOrganisationLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    TpOrganisationLocalService.class.getName());

            if (invokableLocalService instanceof TpOrganisationLocalService) {
                _service = (TpOrganisationLocalService) invokableLocalService;
            } else {
                _service = new TpOrganisationLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(TpOrganisationLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(TpOrganisationLocalService service) {
    }
}
