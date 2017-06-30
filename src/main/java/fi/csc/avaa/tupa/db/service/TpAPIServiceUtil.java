package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for TpAPI. This utility wraps
 * {@link fi.csc.avaa.tupa.db.service.impl.TpAPIServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author CSC
 * @see TpAPIService
 * @see fi.csc.avaa.tupa.db.service.base.TpAPIServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.TpAPIServiceImpl
 * @generated
 */
public class TpAPIServiceUtil {
    private static TpAPIService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.TpAPIServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static java.util.List<fi.csc.avaa.tupa.db.model.TpAPI> getCapabilities() {
        return getService().getCapabilities();
    }

    public static void clearService() {
        _service = null;
    }

    public static TpAPIService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    TpAPIService.class.getName());

            if (invokableService instanceof TpAPIService) {
                _service = (TpAPIService) invokableService;
            } else {
                _service = new TpAPIServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(TpAPIServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(TpAPIService service) {
    }
}
