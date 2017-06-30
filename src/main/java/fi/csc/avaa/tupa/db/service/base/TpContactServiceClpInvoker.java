package fi.csc.avaa.tupa.db.service.base;

import fi.csc.avaa.tupa.db.service.TpContactServiceUtil;

import java.util.Arrays;

/**
 * @author CSC
 * @generated
 */
public class TpContactServiceClpInvoker {
    private String _methodName102;
    private String[] _methodParameterTypes102;
    private String _methodName103;
    private String[] _methodParameterTypes103;
    private String _methodName108;
    private String[] _methodParameterTypes108;
    private String _methodName109;
    private String[] _methodParameterTypes109;
    private String _methodName110;
    private String[] _methodParameterTypes110;
    private String _methodName111;
    private String[] _methodParameterTypes111;
    private String _methodName112;
    private String[] _methodParameterTypes112;
    private String _methodName113;
    private String[] _methodParameterTypes113;

    public TpContactServiceClpInvoker() {
        _methodName102 = "getBeanIdentifier";

        _methodParameterTypes102 = new String[] {  };

        _methodName103 = "setBeanIdentifier";

        _methodParameterTypes103 = new String[] { "java.lang.String" };

        _methodName108 = "getAllContacts";

        _methodParameterTypes108 = new String[] {  };

        _methodName109 = "getContactsByContactsIds";

        _methodParameterTypes109 = new String[] { "int[][]" };

        _methodName110 = "getContactsByInfrastructuresIds";

        _methodParameterTypes110 = new String[] { "int[][]" };

        _methodName111 = "getContactsByInfrastructuresUrns";

        _methodParameterTypes111 = new String[] { "java.lang.String[][]" };

        _methodName112 = "getContactsByOrganisationsIds";

        _methodParameterTypes112 = new String[] { "int[][]" };

        _methodName113 = "getContactsByServicesIds";

        _methodParameterTypes113 = new String[] { "int[][]" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName102.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
            return TpContactServiceUtil.getBeanIdentifier();
        }

        if (_methodName103.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
            TpContactServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName108.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
            return TpContactServiceUtil.getAllContacts();
        }

        if (_methodName109.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
            return TpContactServiceUtil.getContactsByContactsIds((int[]) arguments[0]);
        }

        if (_methodName110.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
            return TpContactServiceUtil.getContactsByInfrastructuresIds((int[]) arguments[0]);
        }

        if (_methodName111.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
            return TpContactServiceUtil.getContactsByInfrastructuresUrns((java.lang.String[]) arguments[0]);
        }

        if (_methodName112.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
            return TpContactServiceUtil.getContactsByOrganisationsIds((int[]) arguments[0]);
        }

        if (_methodName113.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
            return TpContactServiceUtil.getContactsByServicesIds((int[]) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
