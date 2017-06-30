package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for TpContact. This utility wraps
 * {@link fi.csc.avaa.tupa.db.service.impl.TpContactServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author CSC
 * @see TpContactService
 * @see fi.csc.avaa.tupa.db.service.base.TpContactServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.TpContactServiceImpl
 * @generated
 */
public class TpContactServiceUtil {
    private static TpContactService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.TpContactServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

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

    /**
    * Returns a complete list of Contact objects.
    *
    * @return list of Contacts as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getAllContacts() {
        return getService().getAllContacts();
    }

    /**
    * Returns a list of Contact objects with provided Contact IDs.
    *
    * @param contactIds array of integers to search the DB for (could be a single integer)
    * @return list of Contacts as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByContactsIds(
        int[] contactIds) {
        return getService().getContactsByContactsIds(contactIds);
    }

    /**
    * Returns a list of Contact objects with provided Infrastructure IDs.
    *
    * @param infrastructuresIds array of integers to search the DB for (could be a single integer)
    * @return list of Contacts as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByInfrastructuresIds(
        int[] infrastructuresIds) {
        return getService().getContactsByInfrastructuresIds(infrastructuresIds);
    }

    /**
    * Returns a list of Contact objects with provided Infrastructure URNs.
    *
    * @param infrastructuresUrns array of String to search the DB for (could be a single String)
    * @return list of Contacts as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByInfrastructuresUrns(
        java.lang.String[] infrastructuresUrns) {
        return getService().getContactsByInfrastructuresUrns(infrastructuresUrns);
    }

    /**
    * Returns a list of Contact objects with provided Organisation IDs.
    *
    * @param organisationIds array of integers to search the DB for (could be a single integer)
    * @return list of Contacts as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByOrganisationsIds(
        int[] organisationIds) {
        return getService().getContactsByOrganisationsIds(organisationIds);
    }

    /**
    * Returns a list of Contact objects with provided Service IDs.
    *
    * @param serviceIds array of integers to search the DB for (could be a single integer)
    * @return list of Contacts as JSON
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpContact> getContactsByServicesIds(
        int[] serviceIds) {
        return getService().getContactsByServicesIds(serviceIds);
    }

    public static void clearService() {
        _service = null;
    }

    public static TpContactService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    TpContactService.class.getName());

            if (invokableService instanceof TpContactService) {
                _service = (TpContactService) invokableService;
            } else {
                _service = new TpContactServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(TpContactServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(TpContactService service) {
    }
}
