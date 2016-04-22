package fi.csc.avaa.tupa.db.service.base;

import fi.csc.avaa.tupa.db.service.YhteystietoLocalServiceUtil;

import java.util.Arrays;

/**
 * @author pj,jmlehtin
 * @generated
 */
public class YhteystietoLocalServiceClpInvoker {
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

    public YhteystietoLocalServiceClpInvoker() {
        _methodName0 = "addYhteystieto";

        _methodParameterTypes0 = new String[] {
                "fi.csc.avaa.tupa.db.model.Yhteystieto"
            };

        _methodName1 = "createYhteystieto";

        _methodParameterTypes1 = new String[] { "int" };

        _methodName2 = "deleteYhteystieto";

        _methodParameterTypes2 = new String[] { "int" };

        _methodName3 = "deleteYhteystieto";

        _methodParameterTypes3 = new String[] {
                "fi.csc.avaa.tupa.db.model.Yhteystieto"
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

        _methodName10 = "fetchYhteystieto";

        _methodParameterTypes10 = new String[] { "int" };

        _methodName11 = "getYhteystieto";

        _methodParameterTypes11 = new String[] { "int" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getYhteystietos";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getYhteystietosCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateYhteystieto";

        _methodParameterTypes15 = new String[] {
                "fi.csc.avaa.tupa.db.model.Yhteystieto"
            };

        _methodName80 = "getBeanIdentifier";

        _methodParameterTypes80 = new String[] {  };

        _methodName81 = "setBeanIdentifier";

        _methodParameterTypes81 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return YhteystietoLocalServiceUtil.addYhteystieto((fi.csc.avaa.tupa.db.model.Yhteystieto) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return YhteystietoLocalServiceUtil.createYhteystieto(((Integer) arguments[0]).intValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return YhteystietoLocalServiceUtil.deleteYhteystieto(((Integer) arguments[0]).intValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return YhteystietoLocalServiceUtil.deleteYhteystieto((fi.csc.avaa.tupa.db.model.Yhteystieto) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return YhteystietoLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return YhteystietoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return YhteystietoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return YhteystietoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return YhteystietoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return YhteystietoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return YhteystietoLocalServiceUtil.fetchYhteystieto(((Integer) arguments[0]).intValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return YhteystietoLocalServiceUtil.getYhteystieto(((Integer) arguments[0]).intValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return YhteystietoLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return YhteystietoLocalServiceUtil.getYhteystietos(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return YhteystietoLocalServiceUtil.getYhteystietosCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return YhteystietoLocalServiceUtil.updateYhteystieto((fi.csc.avaa.tupa.db.model.Yhteystieto) arguments[0]);
        }

        if (_methodName80.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
            return YhteystietoLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName81.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
            YhteystietoLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
