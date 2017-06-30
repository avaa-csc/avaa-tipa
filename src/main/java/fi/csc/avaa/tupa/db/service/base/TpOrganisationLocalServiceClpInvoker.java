package fi.csc.avaa.tupa.db.service.base;

import fi.csc.avaa.tupa.db.service.TpOrganisationLocalServiceUtil;

import java.util.Arrays;

/**
 * @author CSC
 * @generated
 */
public class TpOrganisationLocalServiceClpInvoker {
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

    public TpOrganisationLocalServiceClpInvoker() {
        _methodName0 = "addTpOrganisation";

        _methodParameterTypes0 = new String[] {
                "fi.csc.avaa.tupa.db.model.TpOrganisation"
            };

        _methodName1 = "createTpOrganisation";

        _methodParameterTypes1 = new String[] { "int" };

        _methodName2 = "deleteTpOrganisation";

        _methodParameterTypes2 = new String[] { "int" };

        _methodName3 = "deleteTpOrganisation";

        _methodParameterTypes3 = new String[] {
                "fi.csc.avaa.tupa.db.model.TpOrganisation"
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

        _methodName10 = "fetchTpOrganisation";

        _methodParameterTypes10 = new String[] { "int" };

        _methodName11 = "getTpOrganisation";

        _methodParameterTypes11 = new String[] { "int" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getTpOrganisations";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getTpOrganisationsCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateTpOrganisation";

        _methodParameterTypes15 = new String[] {
                "fi.csc.avaa.tupa.db.model.TpOrganisation"
            };

        _methodName118 = "getBeanIdentifier";

        _methodParameterTypes118 = new String[] {  };

        _methodName119 = "setBeanIdentifier";

        _methodParameterTypes119 = new String[] { "java.lang.String" };

        _methodName124 = "getAllOrganisations";

        _methodParameterTypes124 = new String[] {  };

        _methodName125 = "getOrganisationsByOrganisationsIds";

        _methodParameterTypes125 = new String[] { "int[][]" };

        _methodName126 = "getOrganisationsByIsnis";

        _methodParameterTypes126 = new String[] { "java.lang.String[][]" };

        _methodName127 = "getOrganisationsByInfrastructuresIds";

        _methodParameterTypes127 = new String[] { "int[][]" };

        _methodName128 = "getOrganisationsByInfrastructuresUrns";

        _methodParameterTypes128 = new String[] { "java.lang.String[][]" };

        _methodName129 = "getOrganisationsByServicesIds";

        _methodParameterTypes129 = new String[] { "int[][]" };

        _methodName130 = "getOrganisationsByContactsIds";

        _methodParameterTypes130 = new String[] { "int[][]" };

        _methodName131 = "getOrganisationsByServiceTypes";

        _methodParameterTypes131 = new String[] { "java.lang.String[][]" };

        _methodName132 = "getOrganisationsByLocationTypes";

        _methodParameterTypes132 = new String[] { "java.lang.String[][]" };

        _methodName133 = "getCountries";

        _methodParameterTypes133 = new String[] {  };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.addTpOrganisation((fi.csc.avaa.tupa.db.model.TpOrganisation) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.createTpOrganisation(((Integer) arguments[0]).intValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.deleteTpOrganisation(((Integer) arguments[0]).intValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.deleteTpOrganisation((fi.csc.avaa.tupa.db.model.TpOrganisation) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.fetchTpOrganisation(((Integer) arguments[0]).intValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.getTpOrganisation(((Integer) arguments[0]).intValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.getTpOrganisations(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.getTpOrganisationsCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.updateTpOrganisation((fi.csc.avaa.tupa.db.model.TpOrganisation) arguments[0]);
        }

        if (_methodName118.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName119.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
            TpOrganisationLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName124.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.getAllOrganisations();
        }

        if (_methodName125.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.getOrganisationsByOrganisationsIds((int[]) arguments[0]);
        }

        if (_methodName126.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.getOrganisationsByIsnis((java.lang.String[]) arguments[0]);
        }

        if (_methodName127.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.getOrganisationsByInfrastructuresIds((int[]) arguments[0]);
        }

        if (_methodName128.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.getOrganisationsByInfrastructuresUrns((java.lang.String[]) arguments[0]);
        }

        if (_methodName129.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.getOrganisationsByServicesIds((int[]) arguments[0]);
        }

        if (_methodName130.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.getOrganisationsByContactsIds((int[]) arguments[0]);
        }

        if (_methodName131.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.getOrganisationsByServiceTypes((java.lang.String[]) arguments[0]);
        }

        if (_methodName132.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes132, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.getOrganisationsByLocationTypes((java.lang.String[]) arguments[0]);
        }

        if (_methodName133.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes133, parameterTypes)) {
            return TpOrganisationLocalServiceUtil.getCountries();
        }

        throw new UnsupportedOperationException();
    }
}
