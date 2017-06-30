package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TpAPIService}.
 *
 * @author CSC
 * @see TpAPIService
 * @generated
 */
public class TpAPIServiceWrapper implements TpAPIService,
    ServiceWrapper<TpAPIService> {
    private TpAPIService _tpAPIService;

    public TpAPIServiceWrapper(TpAPIService tpAPIService) {
        _tpAPIService = tpAPIService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _tpAPIService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _tpAPIService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _tpAPIService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpAPI> getCapabilities() {
        return _tpAPIService.getCapabilities();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TpAPIService getWrappedTpAPIService() {
        return _tpAPIService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTpAPIService(TpAPIService tpAPIService) {
        _tpAPIService = tpAPIService;
    }

    @Override
    public TpAPIService getWrappedService() {
        return _tpAPIService;
    }

    @Override
    public void setWrappedService(TpAPIService tpAPIService) {
        _tpAPIService = tpAPIService;
    }
}
