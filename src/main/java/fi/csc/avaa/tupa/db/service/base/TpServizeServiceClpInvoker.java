package fi.csc.avaa.tupa.db.service.base;

import fi.csc.avaa.tupa.db.service.TpServizeServiceUtil;

import java.util.Arrays;

/**
 * @author CSC
 * @generated
 */
public class TpServizeServiceClpInvoker {
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
    private String _methodName118;
    private String[] _methodParameterTypes118;
    private String _methodName119;
    private String[] _methodParameterTypes119;
    private String _methodName120;
    private String[] _methodParameterTypes120;
    private String _methodName121;
    private String[] _methodParameterTypes121;

    public TpServizeServiceClpInvoker() {
        _methodName102 = "getBeanIdentifier";

        _methodParameterTypes102 = new String[] {  };

        _methodName103 = "setBeanIdentifier";

        _methodParameterTypes103 = new String[] { "java.lang.String" };

        _methodName108 = "getAllServices";

        _methodParameterTypes108 = new String[] {  };

        _methodName109 = "getServicesByServicesIds";

        _methodParameterTypes109 = new String[] { "int[][]" };

        _methodName110 = "getServicesByInfrastructuresIds";

        _methodParameterTypes110 = new String[] { "int[][]" };

        _methodName111 = "getServicesByInfrastructuresUrns";

        _methodParameterTypes111 = new String[] { "java.lang.String[][]" };

        _methodName112 = "getServicesByOrganisationsIds";

        _methodParameterTypes112 = new String[] { "int[][]" };

        _methodName113 = "getServicesByContactsIds";

        _methodParameterTypes113 = new String[] { "int[][]" };

        _methodName114 = "getServicesByKeywords";

        _methodParameterTypes114 = new String[] { "java.lang.String[][]" };

        _methodName115 = "getServicesByServiceTypes";

        _methodParameterTypes115 = new String[] { "java.lang.String[][]" };

        _methodName116 = "getServiceTypes";

        _methodParameterTypes116 = new String[] {  };

        _methodName117 = "getServicesByLocationTypes";

        _methodParameterTypes117 = new String[] { "java.lang.String[][]" };

        _methodName118 = "getLocationTypes";

        _methodParameterTypes118 = new String[] {  };

        _methodName119 = "getServicesByPostalCodes";

        _methodParameterTypes119 = new String[] { "int[][]" };

        _methodName120 = "getServicesByLocation";

        _methodParameterTypes120 = new String[] { "double", "double" };

        _methodName121 = "getServicesByCountries";

        _methodParameterTypes121 = new String[] { "java.lang.String[][]" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName102.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
            return TpServizeServiceUtil.getBeanIdentifier();
        }

        if (_methodName103.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
            TpServizeServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName108.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
            return TpServizeServiceUtil.getAllServices();
        }

        if (_methodName109.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
            return TpServizeServiceUtil.getServicesByServicesIds((int[]) arguments[0]);
        }

        if (_methodName110.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
            return TpServizeServiceUtil.getServicesByInfrastructuresIds((int[]) arguments[0]);
        }

        if (_methodName111.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
            return TpServizeServiceUtil.getServicesByInfrastructuresUrns((java.lang.String[]) arguments[0]);
        }

        if (_methodName112.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
            return TpServizeServiceUtil.getServicesByOrganisationsIds((int[]) arguments[0]);
        }

        if (_methodName113.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
            return TpServizeServiceUtil.getServicesByContactsIds((int[]) arguments[0]);
        }

        if (_methodName114.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
            return TpServizeServiceUtil.getServicesByKeywords((java.lang.String[]) arguments[0]);
        }

        if (_methodName115.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
            return TpServizeServiceUtil.getServicesByServiceTypes((java.lang.String[]) arguments[0]);
        }

        if (_methodName116.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
            return TpServizeServiceUtil.getServiceTypes();
        }

        if (_methodName117.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
            return TpServizeServiceUtil.getServicesByLocationTypes((java.lang.String[]) arguments[0]);
        }

        if (_methodName118.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
            return TpServizeServiceUtil.getLocationTypes();
        }

        if (_methodName119.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
            return TpServizeServiceUtil.getServicesByPostalCodes((int[]) arguments[0]);
        }

        if (_methodName120.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
            return TpServizeServiceUtil.getServicesByLocation(((Double) arguments[0]).doubleValue(),
                ((Double) arguments[1]).doubleValue());
        }

        if (_methodName121.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
            return TpServizeServiceUtil.getServicesByCountries((java.lang.String[]) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
