package fi.csc.avaa.tupa.db.service.base;

import fi.csc.avaa.tupa.db.service.TpAPIServiceUtil;

import java.util.Arrays;

/**
 * @author CSC
 * @generated
 */
public class TpAPIServiceClpInvoker {
    private String _methodName102;
    private String[] _methodParameterTypes102;
    private String _methodName103;
    private String[] _methodParameterTypes103;
    private String _methodName108;
    private String[] _methodParameterTypes108;

    public TpAPIServiceClpInvoker() {
        _methodName102 = "getBeanIdentifier";

        _methodParameterTypes102 = new String[] {  };

        _methodName103 = "setBeanIdentifier";

        _methodParameterTypes103 = new String[] { "java.lang.String" };

        _methodName108 = "getCapabilities";

        _methodParameterTypes108 = new String[] {  };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName102.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
            return TpAPIServiceUtil.getBeanIdentifier();
        }

        if (_methodName103.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
            TpAPIServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName108.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
            return TpAPIServiceUtil.getCapabilities();
        }

        throw new UnsupportedOperationException();
    }
}
