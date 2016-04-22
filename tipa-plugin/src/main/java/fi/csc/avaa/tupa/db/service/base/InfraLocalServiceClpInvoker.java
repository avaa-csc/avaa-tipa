package fi.csc.avaa.tupa.db.service.base;

import fi.csc.avaa.tupa.db.service.InfraLocalServiceUtil;

import java.util.Arrays;

/**
 * @author pj,jmlehtin
 * @generated
 */
public class InfraLocalServiceClpInvoker {
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
    private String _methodName80;
    private String[] _methodParameterTypes80;
    private String _methodName81;
    private String[] _methodParameterTypes81;

    public InfraLocalServiceClpInvoker() {
        _methodName0 = "addInfra";

        _methodParameterTypes0 = new String[] { "fi.csc.avaa.tupa.db.model.Infra" };

        _methodName1 = "createInfra";

        _methodParameterTypes1 = new String[] { "int" };

        _methodName2 = "deleteInfra";

        _methodParameterTypes2 = new String[] { "int" };

        _methodName3 = "deleteInfra";

        _methodParameterTypes3 = new String[] { "fi.csc.avaa.tupa.db.model.Infra" };

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

        _methodName10 = "fetchInfra";

        _methodParameterTypes10 = new String[] { "int" };

        _methodName11 = "getInfra";

        _methodParameterTypes11 = new String[] { "int" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getInfras";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getInfrasCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateInfra";

        _methodParameterTypes15 = new String[] { "fi.csc.avaa.tupa.db.model.Infra" };

        _methodName80 = "getBeanIdentifier";

        _methodParameterTypes80 = new String[] {  };

        _methodName81 = "setBeanIdentifier";

        _methodParameterTypes81 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return InfraLocalServiceUtil.addInfra((fi.csc.avaa.tupa.db.model.Infra) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return InfraLocalServiceUtil.createInfra(((Integer) arguments[0]).intValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return InfraLocalServiceUtil.deleteInfra(((Integer) arguments[0]).intValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return InfraLocalServiceUtil.deleteInfra((fi.csc.avaa.tupa.db.model.Infra) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return InfraLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return InfraLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return InfraLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return InfraLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return InfraLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return InfraLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return InfraLocalServiceUtil.fetchInfra(((Integer) arguments[0]).intValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return InfraLocalServiceUtil.getInfra(((Integer) arguments[0]).intValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return InfraLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return InfraLocalServiceUtil.getInfras(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return InfraLocalServiceUtil.getInfrasCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return InfraLocalServiceUtil.updateInfra((fi.csc.avaa.tupa.db.model.Infra) arguments[0]);
        }

        if (_methodName80.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
            return InfraLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName81.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
            InfraLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
