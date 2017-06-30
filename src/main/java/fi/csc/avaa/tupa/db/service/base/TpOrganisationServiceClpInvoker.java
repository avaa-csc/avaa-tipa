package fi.csc.avaa.tupa.db.service.base;

import fi.csc.avaa.tupa.db.service.TpOrganisationServiceUtil;

import java.util.Arrays;

/**
 * @author CSC
 * @generated
 */
public class TpOrganisationServiceClpInvoker {
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
    private String _methodName114;
    private String[] _methodParameterTypes114;
    private String _methodName115;
    private String[] _methodParameterTypes115;
    private String _methodName116;
    private String[] _methodParameterTypes116;
    private String _methodName117;
    private String[] _methodParameterTypes117;

    public TpOrganisationServiceClpInvoker() {
        _methodName102 = "getBeanIdentifier";

        _methodParameterTypes102 = new String[] {  };

        _methodName103 = "setBeanIdentifier";

        _methodParameterTypes103 = new String[] { "java.lang.String" };

        _methodName108 = "getAllOrganisations";

        _methodParameterTypes108 = new String[] {  };

        _methodName109 = "getOrganisationsByOrganisationsIds";

        _methodParameterTypes109 = new String[] { "int[][]" };

        _methodName110 = "getOrganisationsByIsnis";

        _methodParameterTypes110 = new String[] { "java.lang.String[][]" };

        _methodName111 = "getOrganisationsByInfrastructuresIds";

        _methodParameterTypes111 = new String[] { "int[][]" };

        _methodName112 = "getOrganisationsByInfrastructuresUrns";

        _methodParameterTypes112 = new String[] { "java.lang.String[][]" };

        _methodName113 = "getOrganisationsByServicesIds";

        _methodParameterTypes113 = new String[] { "int[][]" };

        _methodName114 = "getOrganisationsByContactsIds";

        _methodParameterTypes114 = new String[] { "int[][]" };

        _methodName115 = "getOrganisationsByServiceTypes";

        _methodParameterTypes115 = new String[] { "java.lang.String[][]" };

        _methodName116 = "getOrganisationsByLocationTypes";

        _methodParameterTypes116 = new String[] { "java.lang.String[][]" };

        _methodName117 = "getCountries";

        _methodParameterTypes117 = new String[] {  };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName102.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
            return TpOrganisationServiceUtil.getBeanIdentifier();
        }

        if (_methodName103.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
            TpOrganisationServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName108.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
            return TpOrganisationServiceUtil.getAllOrganisations();
        }

        if (_methodName109.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
            return TpOrganisationServiceUtil.getOrganisationsByOrganisationsIds((int[]) arguments[0]);
        }

        if (_methodName110.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
            return TpOrganisationServiceUtil.getOrganisationsByIsnis((java.lang.String[]) arguments[0]);
        }

        if (_methodName111.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
            return TpOrganisationServiceUtil.getOrganisationsByInfrastructuresIds((int[]) arguments[0]);
        }

        if (_methodName112.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
            return TpOrganisationServiceUtil.getOrganisationsByInfrastructuresUrns((java.lang.String[]) arguments[0]);
        }

        if (_methodName113.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
            return TpOrganisationServiceUtil.getOrganisationsByServicesIds((int[]) arguments[0]);
        }

        if (_methodName114.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
            return TpOrganisationServiceUtil.getOrganisationsByContactsIds((int[]) arguments[0]);
        }

        if (_methodName115.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
            return TpOrganisationServiceUtil.getOrganisationsByServiceTypes((java.lang.String[]) arguments[0]);
        }

        if (_methodName116.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
            return TpOrganisationServiceUtil.getOrganisationsByLocationTypes((java.lang.String[]) arguments[0]);
        }

        if (_methodName117.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
            return TpOrganisationServiceUtil.getCountries();
        }

        throw new UnsupportedOperationException();
    }
}
