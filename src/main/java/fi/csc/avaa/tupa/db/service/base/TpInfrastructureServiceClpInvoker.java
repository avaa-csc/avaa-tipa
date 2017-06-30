package fi.csc.avaa.tupa.db.service.base;

import fi.csc.avaa.tupa.db.service.TpInfrastructureServiceUtil;

import java.util.Arrays;

/**
 * @author CSC
 * @generated
 */
public class TpInfrastructureServiceClpInvoker {
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
    private String _methodName122;
    private String[] _methodParameterTypes122;
    private String _methodName123;
    private String[] _methodParameterTypes123;
    private String _methodName124;
    private String[] _methodParameterTypes124;

    public TpInfrastructureServiceClpInvoker() {
        _methodName102 = "getBeanIdentifier";

        _methodParameterTypes102 = new String[] {  };

        _methodName103 = "setBeanIdentifier";

        _methodParameterTypes103 = new String[] { "java.lang.String" };

        _methodName108 = "getAllInfrastructures";

        _methodParameterTypes108 = new String[] {  };

        _methodName109 = "getInfrastructuresByInfrastructuresIds";

        _methodParameterTypes109 = new String[] { "int[][]" };

        _methodName110 = "getInfrastructuresByUrns";

        _methodParameterTypes110 = new String[] { "java.lang.String[][]" };

        _methodName111 = "getInfrastructuresByOrganisationIds";

        _methodParameterTypes111 = new String[] { "int[][]" };

        _methodName112 = "getInfrastructuresByServiceIds";

        _methodParameterTypes112 = new String[] { "int[][]" };

        _methodName113 = "getInfrastructuresByContactIds";

        _methodParameterTypes113 = new String[] { "int[][]" };

        _methodName114 = "getInfrastructuresByKeywords";

        _methodParameterTypes114 = new String[] { "java.lang.String[][]" };

        _methodName115 = "getInfrastructuresByServiceTypes";

        _methodParameterTypes115 = new String[] { "java.lang.String[][]" };

        _methodName116 = "getInfrastructuresByLocationTypes";

        _methodParameterTypes116 = new String[] { "java.lang.String[][]" };

        _methodName117 = "getInfrastructuresByPostalCodes";

        _methodParameterTypes117 = new String[] { "int[][]" };

        _methodName118 = "getInfrastructuresByLocation";

        _methodParameterTypes118 = new String[] { "double", "double" };

        _methodName119 = "getInfrastructuresByCountries";

        _methodParameterTypes119 = new String[] { "java.lang.String[][]" };

        _methodName120 = "getInfrastructuresByPreviousIds";

        _methodParameterTypes120 = new String[] { "int[][]" };

        _methodName121 = "getInfrastructuresByPreviousUrns";

        _methodParameterTypes121 = new String[] { "java.lang.String[][]" };

        _methodName122 = "getKeywords";

        _methodParameterTypes122 = new String[] {  };

        _methodName123 = "getPids";

        _methodParameterTypes123 = new String[] {  };

        _methodName124 = "getInfrastructuresByPids";

        _methodParameterTypes124 = new String[] { "java.lang.String[][]" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName102.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
            return TpInfrastructureServiceUtil.getBeanIdentifier();
        }

        if (_methodName103.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
            TpInfrastructureServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName108.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
            return TpInfrastructureServiceUtil.getAllInfrastructures();
        }

        if (_methodName109.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
            return TpInfrastructureServiceUtil.getInfrastructuresByInfrastructuresIds((int[]) arguments[0]);
        }

        if (_methodName110.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
            return TpInfrastructureServiceUtil.getInfrastructuresByUrns((java.lang.String[]) arguments[0]);
        }

        if (_methodName111.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
            return TpInfrastructureServiceUtil.getInfrastructuresByOrganisationIds((int[]) arguments[0]);
        }

        if (_methodName112.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
            return TpInfrastructureServiceUtil.getInfrastructuresByServiceIds((int[]) arguments[0]);
        }

        if (_methodName113.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
            return TpInfrastructureServiceUtil.getInfrastructuresByContactIds((int[]) arguments[0]);
        }

        if (_methodName114.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
            return TpInfrastructureServiceUtil.getInfrastructuresByKeywords((java.lang.String[]) arguments[0]);
        }

        if (_methodName115.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
            return TpInfrastructureServiceUtil.getInfrastructuresByServiceTypes((java.lang.String[]) arguments[0]);
        }

        if (_methodName116.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
            return TpInfrastructureServiceUtil.getInfrastructuresByLocationTypes((java.lang.String[]) arguments[0]);
        }

        if (_methodName117.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
            return TpInfrastructureServiceUtil.getInfrastructuresByPostalCodes((int[]) arguments[0]);
        }

        if (_methodName118.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
            return TpInfrastructureServiceUtil.getInfrastructuresByLocation(((Double) arguments[0]).doubleValue(),
                ((Double) arguments[1]).doubleValue());
        }

        if (_methodName119.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
            return TpInfrastructureServiceUtil.getInfrastructuresByCountries((java.lang.String[]) arguments[0]);
        }

        if (_methodName120.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
            return TpInfrastructureServiceUtil.getInfrastructuresByPreviousIds((int[]) arguments[0]);
        }

        if (_methodName121.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
            return TpInfrastructureServiceUtil.getInfrastructuresByPreviousUrns((java.lang.String[]) arguments[0]);
        }

        if (_methodName122.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
            return TpInfrastructureServiceUtil.getKeywords();
        }

        if (_methodName123.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
            return TpInfrastructureServiceUtil.getPids();
        }

        if (_methodName124.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
            return TpInfrastructureServiceUtil.getInfrastructuresByPids((java.lang.String[]) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
