package fi.csc.avaa.tupa.db.service.base;

import fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil;

import java.util.Arrays;

/**
 * @author CSC
 * @generated
 */
public class Infra_VastuuorganisaatiotLocalServiceClpInvoker {
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

    public Infra_VastuuorganisaatiotLocalServiceClpInvoker() {
        _methodName0 = "addInfra_Vastuuorganisaatiot";

        _methodParameterTypes0 = new String[] {
                "fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot"
            };

        _methodName1 = "createInfra_Vastuuorganisaatiot";

        _methodParameterTypes1 = new String[] {
                "fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK"
            };

        _methodName2 = "deleteInfra_Vastuuorganisaatiot";

        _methodParameterTypes2 = new String[] {
                "fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK"
            };

        _methodName3 = "deleteInfra_Vastuuorganisaatiot";

        _methodParameterTypes3 = new String[] {
                "fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot"
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

        _methodName10 = "fetchInfra_Vastuuorganisaatiot";

        _methodParameterTypes10 = new String[] {
                "fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK"
            };

        _methodName11 = "getInfra_Vastuuorganisaatiot";

        _methodParameterTypes11 = new String[] {
                "fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK"
            };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getInfra_Vastuuorganisaatiots";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getInfra_VastuuorganisaatiotsCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateInfra_Vastuuorganisaatiot";

        _methodParameterTypes15 = new String[] {
                "fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot"
            };

        _methodName118 = "getBeanIdentifier";

        _methodParameterTypes118 = new String[] {  };

        _methodName119 = "setBeanIdentifier";

        _methodParameterTypes119 = new String[] { "java.lang.String" };

        _methodName124 = "getOrganisationsIdsByInfrastructureId";

        _methodParameterTypes124 = new String[] { "int" };

        _methodName125 = "getOrganisationsIdsByInfrastructuresIds";

        _methodParameterTypes125 = new String[] { "int[][]" };

        _methodName126 = "getInfrastructuresIdsByOrganisationsIds";

        _methodParameterTypes126 = new String[] { "int[][]" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.addInfra_Vastuuorganisaatiot((fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.createInfra_Vastuuorganisaatiot((fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK) arguments[0]);
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.deleteInfra_Vastuuorganisaatiot((fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK) arguments[0]);
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.deleteInfra_Vastuuorganisaatiot((fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.fetchInfra_Vastuuorganisaatiot((fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK) arguments[0]);
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.getInfra_Vastuuorganisaatiot((fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK) arguments[0]);
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.getInfra_Vastuuorganisaatiots(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.getInfra_VastuuorganisaatiotsCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.updateInfra_Vastuuorganisaatiot((fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot) arguments[0]);
        }

        if (_methodName118.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName119.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
            Infra_VastuuorganisaatiotLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName124.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.getOrganisationsIdsByInfrastructureId(((Integer) arguments[0]).intValue());
        }

        if (_methodName125.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.getOrganisationsIdsByInfrastructuresIds((int[]) arguments[0]);
        }

        if (_methodName126.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
            return Infra_VastuuorganisaatiotLocalServiceUtil.getInfrastructuresIdsByOrganisationsIds((int[]) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
