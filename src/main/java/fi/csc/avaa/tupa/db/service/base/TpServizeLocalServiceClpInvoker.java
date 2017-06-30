package fi.csc.avaa.tupa.db.service.base;

import fi.csc.avaa.tupa.db.service.TpServizeLocalServiceUtil;

import java.util.Arrays;

/**
 * @author CSC
 * @generated
 */
public class TpServizeLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName118;
    private String[] _methodParameterTypes118;
    private String _methodName119;
    private String[] _methodParameterTypes119;
    private String _methodName124;
    private String[] _methodParameterTypes124;
    private String _methodName125;
    private String[] _methodParameterTypes125;
    private String _methodName126;
    private String[] _methodParameterTypes126;
    private String _methodName127;
    private String[] _methodParameterTypes127;
    private String _methodName128;
    private String[] _methodParameterTypes128;
    private String _methodName129;
    private String[] _methodParameterTypes129;
    private String _methodName130;
    private String[] _methodParameterTypes130;
    private String _methodName131;
    private String[] _methodParameterTypes131;
    private String _methodName132;
    private String[] _methodParameterTypes132;
    private String _methodName133;
    private String[] _methodParameterTypes133;
    private String _methodName134;
    private String[] _methodParameterTypes134;
    private String _methodName135;
    private String[] _methodParameterTypes135;
    private String _methodName136;
    private String[] _methodParameterTypes136;
    private String _methodName137;
    private String[] _methodParameterTypes137;

    public TpServizeLocalServiceClpInvoker() {
        _methodName0 = "addTpServize";

        _methodParameterTypes0 = new String[] {
                "fi.csc.avaa.tupa.db.model.TpServize"
            };

        _methodName1 = "createTpServize";

        _methodParameterTypes1 = new String[] { "int" };

        _methodName2 = "deleteTpServize";

        _methodParameterTypes2 = new String[] { "int" };

        _methodName3 = "deleteTpServize";

        _methodParameterTypes3 = new String[] {
                "fi.csc.avaa.tupa.db.model.TpServize"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchTpServize";

        _methodParameterTypes10 = new String[] { "int" };

        _methodName11 = "getTpServize";

        _methodParameterTypes11 = new String[] { "int" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getTpServizes";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getTpServizesCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateTpServize";

        _methodParameterTypes15 = new String[] {
                "fi.csc.avaa.tupa.db.model.TpServize"
            };

        _methodName118 = "getBeanIdentifier";

        _methodParameterTypes118 = new String[] {  };

        _methodName119 = "setBeanIdentifier";

        _methodParameterTypes119 = new String[] { "java.lang.String" };

        _methodName124 = "getAllServices";

        _methodParameterTypes124 = new String[] {  };

        _methodName125 = "getServicesByServicesIds";

        _methodParameterTypes125 = new String[] { "int[][]" };

        _methodName126 = "getServicesByInfrastructuresIds";

        _methodParameterTypes126 = new String[] { "int[][]" };

        _methodName127 = "getServicesByInfrastructuresUrns";

        _methodParameterTypes127 = new String[] { "java.lang.String[][]" };

        _methodName128 = "getServicesByOrganisationsIds";

        _methodParameterTypes128 = new String[] { "int[][]" };

        _methodName129 = "getServicesByContactsIds";

        _methodParameterTypes129 = new String[] { "int[][]" };

        _methodName130 = "getServicesByKeywords";

        _methodParameterTypes130 = new String[] { "java.lang.String[][]" };

        _methodName131 = "getServicesByServiceTypes";

        _methodParameterTypes131 = new String[] { "java.lang.String[][]" };

        _methodName132 = "getServiceTypes";

        _methodParameterTypes132 = new String[] {  };

        _methodName133 = "getServicesByLocationTypes";

        _methodParameterTypes133 = new String[] { "java.lang.String[][]" };

        _methodName134 = "getLocationTypes";

        _methodParameterTypes134 = new String[] {  };

        _methodName135 = "getServicesByPostalCodes";

        _methodParameterTypes135 = new String[] { "int[][]" };

        _methodName136 = "getServicesByLocation";

        _methodParameterTypes136 = new String[] { "double", "double" };

        _methodName137 = "getServicesByCountries";

        _methodParameterTypes137 = new String[] { "java.lang.String[][]" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return TpServizeLocalServiceUtil.addTpServize((fi.csc.avaa.tupa.db.model.TpServize) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return TpServizeLocalServiceUtil.createTpServize(((Integer) arguments[0]).intValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return TpServizeLocalServiceUtil.deleteTpServize(((Integer) arguments[0]).intValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return TpServizeLocalServiceUtil.deleteTpServize((fi.csc.avaa.tupa.db.model.TpServize) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return TpServizeLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return TpServizeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return TpServizeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return TpServizeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return TpServizeLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return TpServizeLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return TpServizeLocalServiceUtil.fetchTpServize(((Integer) arguments[0]).intValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return TpServizeLocalServiceUtil.getTpServize(((Integer) arguments[0]).intValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return TpServizeLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return TpServizeLocalServiceUtil.getTpServizes(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return TpServizeLocalServiceUtil.getTpServizesCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return TpServizeLocalServiceUtil.updateTpServize((fi.csc.avaa.tupa.db.model.TpServize) arguments[0]);
        }

        if (_methodName118.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
            return TpServizeLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName119.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
            TpServizeLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName124.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
            return TpServizeLocalServiceUtil.getAllServices();
        }

        if (_methodName125.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
            return TpServizeLocalServiceUtil.getServicesByServicesIds((int[]) arguments[0]);
        }

        if (_methodName126.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
            return TpServizeLocalServiceUtil.getServicesByInfrastructuresIds((int[]) arguments[0]);
        }

        if (_methodName127.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
            return TpServizeLocalServiceUtil.getServicesByInfrastructuresUrns((java.lang.String[]) arguments[0]);
        }

        if (_methodName128.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
            return TpServizeLocalServiceUtil.getServicesByOrganisationsIds((int[]) arguments[0]);
        }

        if (_methodName129.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
            return TpServizeLocalServiceUtil.getServicesByContactsIds((int[]) arguments[0]);
        }

        if (_methodName130.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
            return TpServizeLocalServiceUtil.getServicesByKeywords((java.lang.String[]) arguments[0]);
        }

        if (_methodName131.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
            return TpServizeLocalServiceUtil.getServicesByServiceTypes((java.lang.String[]) arguments[0]);
        }

        if (_methodName132.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes132, parameterTypes)) {
            return TpServizeLocalServiceUtil.getServiceTypes();
        }

        if (_methodName133.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes133, parameterTypes)) {
            return TpServizeLocalServiceUtil.getServicesByLocationTypes((java.lang.String[]) arguments[0]);
        }

        if (_methodName134.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes134, parameterTypes)) {
            return TpServizeLocalServiceUtil.getLocationTypes();
        }

        if (_methodName135.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes135, parameterTypes)) {
            return TpServizeLocalServiceUtil.getServicesByPostalCodes((int[]) arguments[0]);
        }

        if (_methodName136.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes136, parameterTypes)) {
            return TpServizeLocalServiceUtil.getServicesByLocation(((Double) arguments[0]).doubleValue(),
                ((Double) arguments[1]).doubleValue());
        }

        if (_methodName137.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes137, parameterTypes)) {
            return TpServizeLocalServiceUtil.getServicesByCountries((java.lang.String[]) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
