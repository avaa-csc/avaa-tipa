package fi.csc.avaa.tupa.db.service.base;

import fi.csc.avaa.tupa.db.service.AvainsanaLocalServiceUtil;

import java.util.Arrays;

/**
 * @author CSC
 * @generated
 */
public class AvainsanaLocalServiceClpInvoker {
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
    private String _methodName126;
    private String[] _methodParameterTypes126;
    private String _methodName130;
    private String[] _methodParameterTypes130;
    private String _methodName131;
    private String[] _methodParameterTypes131;

    public AvainsanaLocalServiceClpInvoker() {
        _methodName0 = "addAvainsana";

        _methodParameterTypes0 = new String[] {
                "fi.csc.avaa.tupa.db.model.Avainsana"
            };

        _methodName1 = "createAvainsana";

        _methodParameterTypes1 = new String[] { "int" };

        _methodName2 = "deleteAvainsana";

        _methodParameterTypes2 = new String[] { "int" };

        _methodName3 = "deleteAvainsana";

        _methodParameterTypes3 = new String[] {
                "fi.csc.avaa.tupa.db.model.Avainsana"
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

        _methodName10 = "fetchAvainsana";

        _methodParameterTypes10 = new String[] { "int" };

        _methodName11 = "getAvainsana";

        _methodParameterTypes11 = new String[] { "int" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getAvainsanas";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getAvainsanasCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateAvainsana";

        _methodParameterTypes15 = new String[] {
                "fi.csc.avaa.tupa.db.model.Avainsana"
            };

        _methodName118 = "getBeanIdentifier";

        _methodParameterTypes118 = new String[] {  };

        _methodName119 = "setBeanIdentifier";

        _methodParameterTypes119 = new String[] { "java.lang.String" };

        _methodName124 = "getKeywordsIdsByKeywords";

        _methodParameterTypes124 = new String[] { "java.lang.String[][]" };

        _methodName126 = "getKeywords";

        _methodParameterTypes126 = new String[] {  };

        _methodName130 = "getKeywords_ENbyInfrastructureId";

        _methodParameterTypes130 = new String[] { "int" };

        _methodName131 = "getKeywords_FIbyInfrastructureId";

        _methodParameterTypes131 = new String[] { "int" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return AvainsanaLocalServiceUtil.addAvainsana((fi.csc.avaa.tupa.db.model.Avainsana) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return AvainsanaLocalServiceUtil.createAvainsana(((Integer) arguments[0]).intValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return AvainsanaLocalServiceUtil.deleteAvainsana(((Integer) arguments[0]).intValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return AvainsanaLocalServiceUtil.deleteAvainsana((fi.csc.avaa.tupa.db.model.Avainsana) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return AvainsanaLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return AvainsanaLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return AvainsanaLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return AvainsanaLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return AvainsanaLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return AvainsanaLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return AvainsanaLocalServiceUtil.fetchAvainsana(((Integer) arguments[0]).intValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return AvainsanaLocalServiceUtil.getAvainsana(((Integer) arguments[0]).intValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return AvainsanaLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return AvainsanaLocalServiceUtil.getAvainsanas(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return AvainsanaLocalServiceUtil.getAvainsanasCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return AvainsanaLocalServiceUtil.updateAvainsana((fi.csc.avaa.tupa.db.model.Avainsana) arguments[0]);
        }

        if (_methodName118.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
            return AvainsanaLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName119.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
            AvainsanaLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName124.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
            return AvainsanaLocalServiceUtil.getKeywordsIdsByKeywords((java.lang.String[]) arguments[0]);
        }

        if (_methodName126.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
            return AvainsanaLocalServiceUtil.getKeywords();
        }

        if (_methodName130.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
            return AvainsanaLocalServiceUtil.getKeywords_ENbyInfrastructureId(((Integer) arguments[0]).intValue());
        }

        if (_methodName131.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
            return AvainsanaLocalServiceUtil.getKeywords_FIbyInfrastructureId(((Integer) arguments[0]).intValue());
        }

        throw new UnsupportedOperationException();
    }
}
