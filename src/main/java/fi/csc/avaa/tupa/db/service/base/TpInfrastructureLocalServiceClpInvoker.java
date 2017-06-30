package fi.csc.avaa.tupa.db.service.base;

import fi.csc.avaa.tupa.db.service.TpInfrastructureLocalServiceUtil;

import java.util.Arrays;

/**
 * @author CSC
 * @generated
 */
public class TpInfrastructureLocalServiceClpInvoker {
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
    private String _methodName138;
    private String[] _methodParameterTypes138;
    private String _methodName139;
    private String[] _methodParameterTypes139;
    private String _methodName140;
    private String[] _methodParameterTypes140;
    private String _methodName143;
    private String[] _methodParameterTypes143;
    private String _methodName144;
    private String[] _methodParameterTypes144;

    public TpInfrastructureLocalServiceClpInvoker() {
        _methodName0 = "addTpInfrastructure";

        _methodParameterTypes0 = new String[] {
                "fi.csc.avaa.tupa.db.model.TpInfrastructure"
            };

        _methodName1 = "createTpInfrastructure";

        _methodParameterTypes1 = new String[] { "int" };

        _methodName2 = "deleteTpInfrastructure";

        _methodParameterTypes2 = new String[] { "int" };

        _methodName3 = "deleteTpInfrastructure";

        _methodParameterTypes3 = new String[] {
                "fi.csc.avaa.tupa.db.model.TpInfrastructure"
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

        _methodName10 = "fetchTpInfrastructure";

        _methodParameterTypes10 = new String[] { "int" };

        _methodName11 = "getTpInfrastructure";

        _methodParameterTypes11 = new String[] { "int" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getTpInfrastructures";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getTpInfrastructuresCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateTpInfrastructure";

        _methodParameterTypes15 = new String[] {
                "fi.csc.avaa.tupa.db.model.TpInfrastructure"
            };

        _methodName118 = "getBeanIdentifier";

        _methodParameterTypes118 = new String[] {  };

        _methodName119 = "setBeanIdentifier";

        _methodParameterTypes119 = new String[] { "java.lang.String" };

        _methodName124 = "getAllInfrastructures";

        _methodParameterTypes124 = new String[] {  };

        _methodName125 = "getInfrastructuresByInfrastructuresIds";

        _methodParameterTypes125 = new String[] { "int[][]" };

        _methodName126 = "getInfrastructuresByUrns";

        _methodParameterTypes126 = new String[] { "java.lang.String[][]" };

        _methodName127 = "getInfrastructuresByOrganisationIds";

        _methodParameterTypes127 = new String[] { "int[][]" };

        _methodName128 = "getInfrastructuresByServiceIds";

        _methodParameterTypes128 = new String[] { "int[][]" };

        _methodName129 = "getInfrastructuresByContactIds";

        _methodParameterTypes129 = new String[] { "int[][]" };

        _methodName130 = "getInfrastructuresByKeywords";

        _methodParameterTypes130 = new String[] { "java.lang.String[][]" };

        _methodName131 = "getInfrastructuresByServiceTypes";

        _methodParameterTypes131 = new String[] { "java.lang.String[][]" };

        _methodName132 = "getInfrastructuresByLocationTypes";

        _methodParameterTypes132 = new String[] { "java.lang.String[][]" };

        _methodName133 = "getInfrastructuresByPostalCodes";

        _methodParameterTypes133 = new String[] { "int[][]" };

        _methodName134 = "getInfrastructuresByLocation";

        _methodParameterTypes134 = new String[] { "double", "double" };

        _methodName135 = "getInfrastructuresByCountries";

        _methodParameterTypes135 = new String[] { "java.lang.String[][]" };

        _methodName136 = "getInfrastructuresByPreviousIds";

        _methodParameterTypes136 = new String[] { "int[][]" };

        _methodName137 = "getKeywords";

        _methodParameterTypes137 = new String[] {  };

        _methodName138 = "getPids";

        _methodParameterTypes138 = new String[] {  };

        _methodName139 = "getInfrastructuresByPids";

        _methodParameterTypes139 = new String[] { "java.lang.String[][]" };

        _methodName140 = "getInfrastructuresByPreviousUrns";

        _methodParameterTypes140 = new String[] { "java.lang.String[][]" };

        _methodName143 = "getInfrastructuresIdsByUrns";

        _methodParameterTypes143 = new String[] { "java.lang.String[][]" };

        _methodName144 = "getPidsJson";

        _methodParameterTypes144 = new String[] { "int" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.addTpInfrastructure((fi.csc.avaa.tupa.db.model.TpInfrastructure) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.createTpInfrastructure(((Integer) arguments[0]).intValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.deleteTpInfrastructure(((Integer) arguments[0]).intValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.deleteTpInfrastructure((fi.csc.avaa.tupa.db.model.TpInfrastructure) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.fetchTpInfrastructure(((Integer) arguments[0]).intValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getTpInfrastructure(((Integer) arguments[0]).intValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getTpInfrastructures(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getTpInfrastructuresCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.updateTpInfrastructure((fi.csc.avaa.tupa.db.model.TpInfrastructure) arguments[0]);
        }

        if (_methodName118.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName119.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
            TpInfrastructureLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName124.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getAllInfrastructures();
        }

        if (_methodName125.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getInfrastructuresByInfrastructuresIds((int[]) arguments[0]);
        }

        if (_methodName126.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getInfrastructuresByUrns((java.lang.String[]) arguments[0]);
        }

        if (_methodName127.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getInfrastructuresByOrganisationIds((int[]) arguments[0]);
        }

        if (_methodName128.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getInfrastructuresByServiceIds((int[]) arguments[0]);
        }

        if (_methodName129.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getInfrastructuresByContactIds((int[]) arguments[0]);
        }

        if (_methodName130.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getInfrastructuresByKeywords((java.lang.String[]) arguments[0]);
        }

        if (_methodName131.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getInfrastructuresByServiceTypes((java.lang.String[]) arguments[0]);
        }

        if (_methodName132.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes132, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getInfrastructuresByLocationTypes((java.lang.String[]) arguments[0]);
        }

        if (_methodName133.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes133, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getInfrastructuresByPostalCodes((int[]) arguments[0]);
        }

        if (_methodName134.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes134, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getInfrastructuresByLocation(((Double) arguments[0]).doubleValue(),
                ((Double) arguments[1]).doubleValue());
        }

        if (_methodName135.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes135, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getInfrastructuresByCountries((java.lang.String[]) arguments[0]);
        }

        if (_methodName136.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes136, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getInfrastructuresByPreviousIds((int[]) arguments[0]);
        }

        if (_methodName137.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes137, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getKeywords();
        }

        if (_methodName138.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes138, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getPids();
        }

        if (_methodName139.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes139, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getInfrastructuresByPids((java.lang.String[]) arguments[0]);
        }

        if (_methodName140.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes140, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getInfrastructuresByPreviousUrns((java.lang.String[]) arguments[0]);
        }

        if (_methodName143.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes143, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getInfrastructuresIdsByUrns((java.lang.String[]) arguments[0]);
        }

        if (_methodName144.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes144, parameterTypes)) {
            return TpInfrastructureLocalServiceUtil.getPidsJson(((Integer) arguments[0]).intValue());
        }

        throw new UnsupportedOperationException();
    }
}
