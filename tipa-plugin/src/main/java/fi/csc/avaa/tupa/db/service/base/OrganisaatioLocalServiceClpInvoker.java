package fi.csc.avaa.tupa.db.service.base;

import fi.csc.avaa.tupa.db.service.OrganisaatioLocalServiceUtil;

import java.util.Arrays;

/**
 * @author pj,jmlehtin
 * @generated
 */
public class OrganisaatioLocalServiceClpInvoker {
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

    public OrganisaatioLocalServiceClpInvoker() {
        _methodName0 = "addOrganisaatio";

        _methodParameterTypes0 = new String[] {
                "fi.csc.avaa.tupa.db.model.Organisaatio"
            };

        _methodName1 = "createOrganisaatio";

        _methodParameterTypes1 = new String[] { "int" };

        _methodName2 = "deleteOrganisaatio";

        _methodParameterTypes2 = new String[] { "int" };

        _methodName3 = "deleteOrganisaatio";

        _methodParameterTypes3 = new String[] {
                "fi.csc.avaa.tupa.db.model.Organisaatio"
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

        _methodName10 = "fetchOrganisaatio";

        _methodParameterTypes10 = new String[] { "int" };

        _methodName11 = "getOrganisaatio";

        _methodParameterTypes11 = new String[] { "int" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getOrganisaatios";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getOrganisaatiosCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateOrganisaatio";

        _methodParameterTypes15 = new String[] {
                "fi.csc.avaa.tupa.db.model.Organisaatio"
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
            return OrganisaatioLocalServiceUtil.addOrganisaatio((fi.csc.avaa.tupa.db.model.Organisaatio) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return OrganisaatioLocalServiceUtil.createOrganisaatio(((Integer) arguments[0]).intValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return OrganisaatioLocalServiceUtil.deleteOrganisaatio(((Integer) arguments[0]).intValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return OrganisaatioLocalServiceUtil.deleteOrganisaatio((fi.csc.avaa.tupa.db.model.Organisaatio) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return OrganisaatioLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return OrganisaatioLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return OrganisaatioLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return OrganisaatioLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return OrganisaatioLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return OrganisaatioLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return OrganisaatioLocalServiceUtil.fetchOrganisaatio(((Integer) arguments[0]).intValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return OrganisaatioLocalServiceUtil.getOrganisaatio(((Integer) arguments[0]).intValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return OrganisaatioLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return OrganisaatioLocalServiceUtil.getOrganisaatios(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return OrganisaatioLocalServiceUtil.getOrganisaatiosCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return OrganisaatioLocalServiceUtil.updateOrganisaatio((fi.csc.avaa.tupa.db.model.Organisaatio) arguments[0]);
        }

        if (_methodName80.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
            return OrganisaatioLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName81.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
            OrganisaatioLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
