package fi.csc.avaa.tupa.db.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import fi.csc.avaa.tupa.db.service.TpAPIServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link fi.csc.avaa.tupa.db.service.TpAPIServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link fi.csc.avaa.tupa.db.model.TpAPISoap}.
 * If the method in the service utility returns a
 * {@link fi.csc.avaa.tupa.db.model.TpAPI}, that is translated to a
 * {@link fi.csc.avaa.tupa.db.model.TpAPISoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author CSC
 * @see TpAPIServiceHttp
 * @see fi.csc.avaa.tupa.db.model.TpAPISoap
 * @see fi.csc.avaa.tupa.db.service.TpAPIServiceUtil
 * @generated
 */
public class TpAPIServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(TpAPIServiceSoap.class);

    public static fi.csc.avaa.tupa.db.model.TpAPISoap[] getCapabilities()
        throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpAPI> returnValue = TpAPIServiceUtil.getCapabilities();

            return fi.csc.avaa.tupa.db.model.TpAPISoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
