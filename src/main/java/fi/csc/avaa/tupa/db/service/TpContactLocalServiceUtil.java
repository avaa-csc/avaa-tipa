package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for TpContact. This utility wraps
 * {@link fi.csc.avaa.tupa.db.service.impl.TpContactLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CSC
 * @see TpContactLocalService
 * @see fi.csc.avaa.tupa.db.service.base.TpContactLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.TpContactLocalServiceImpl
 * @generated
 */
public class TpContactLocalServiceUtil {
    private static TpContactLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.TpContactLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the tp contact to the database. Also notifies the appropriate model listeners.
    *
    * @param tpContact the tp contact
    * @return the tp contact that was added
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpContact addTpContact(
        fi.csc.avaa.tupa.db.model.TpContact tpContact)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addTpContact(tpContact);
    }

    /**
    * Creates a new tp contact with the primary key. Does not add the tp contact to the database.
    *
    * @param id the primary key for the new tp contact
    * @return the new tp contact
    */
    public static fi.csc.avaa.tupa.db.model.TpContact createTpContact(int id) {
        return getService().createTpContact(id);
    }

    /**
    * Deletes the tp contact with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the tp contact
    * @return the tp contact that was removed
    * @throws PortalException if a tp contact with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpContact deleteTpContact(int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteTpContact(id);
    }

    /**
    * Deletes the tp contact from the database. Also notifies the appropriate model listeners.
    *
    * @param tpContact the tp contact
    * @return the tp contact that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpContact deleteTpContact(
        fi.csc.avaa.tupa.db.model.TpContact tpContact)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteTpContact(tpContact);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static fi.csc.avaa.tupa.db.model.TpContact fetchTpContact(int id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchTpContact(id);
    }

    /**
    * Returns the tp contact with the primary key.
    *
    * @param id the primary key of the tp contact
    * @return the tp contact
    * @throws PortalException if a tp contact with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpContact getTpContact(int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getTpContact(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the tp contacts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp contacts
    * @param end the upper bound of the range of tp contacts (not inclusive)
    * @return the range of tp contacts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getTpContacts(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getTpContacts(start, end);
    }

    /**
    * Returns the number of tp contacts.
    *
    * @return the number of tp contacts
    * @throws SystemException if a system exception occurred
    */
    public static int getTpContactsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getTpContactsCount();
    }

    /**
    * Updates the tp contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param tpContact the tp contact
    * @return the tp contact that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpContact updateTpContact(
        fi.csc.avaa.tupa.db.model.TpContact tpContact)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateTpContact(tpContact);
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

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getAllContacts() {
        return getService().getAllContacts();
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByContactsIds(
        int[] contactIds) {
        return getService().getContactsByContactsIds(contactIds);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByInfrastructuresIds(
        int[] infrastructuresIds) {
        return getService().getContactsByInfrastructuresIds(infrastructuresIds);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByInfrastructuresUrns(
        java.lang.String[] infrastructuresUrns) {
        return getService().getContactsByInfrastructuresUrns(infrastructuresUrns);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByOrganisationsIds(
        int[] organisationIds) {
        return getService().getContactsByOrganisationsIds(organisationIds);
    }

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByServicesIds(
        int[] serviceIds) {
        return getService().getContactsByServicesIds(serviceIds);
    }

    public static fi.csc.avaa.tupa.db.model.TpContact getTpContactFromYhteystieto(
        fi.csc.avaa.tupa.db.model.Yhteystieto yhteystieto) {
        return getService().getTpContactFromYhteystieto(yhteystieto);
    }

    public static void clearService() {
        _service = null;
    }

    public static TpContactLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    TpContactLocalService.class.getName());

            if (invokableLocalService instanceof TpContactLocalService) {
                _service = (TpContactLocalService) invokableLocalService;
            } else {
                _service = new TpContactLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(TpContactLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(TpContactLocalService service) {
    }
}
