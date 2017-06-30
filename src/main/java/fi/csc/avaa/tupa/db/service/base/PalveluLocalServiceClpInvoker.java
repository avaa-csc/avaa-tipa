package fi.csc.avaa.tupa.db.service.base;

import fi.csc.avaa.tupa.db.service.PalveluLocalServiceUtil;

import java.util.Arrays;

/**
 * @author CSC
 * @generated
 */
public class PalveluLocalServiceClpInvoker {
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

    public PalveluLocalServiceClpInvoker() {
        _methodName0 = "addPalvelu";

        _methodParameterTypes0 = new String[] {
                "fi.csc.avaa.tupa.db.model.Palvelu"
            };

        _methodName1 = "createPalvelu";

        _methodParameterTypes1 = new String[] { "int" };

        _methodName2 = "deletePalvelu";

        _methodParameterTypes2 = new String[] { "int" };

        _methodName3 = "deletePalvelu";

        _methodParameterTypes3 = new String[] {
                "fi.csc.avaa.tupa.db.model.Palvelu"
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

        _methodName10 = "fetchPalvelu";

        _methodParameterTypes10 = new String[] { "int" };

        _methodName11 = "getPalvelu";

        _methodParameterTypes11 = new String[] { "int" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getPalvelus";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getPalvelusCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updatePalvelu";

        _methodParameterTypes15 = new String[] {
                "fi.csc.avaa.tupa.db.model.Palvelu"
            };

        _methodName118 = "getBeanIdentifier";

        _methodParameterTypes118 = new String[] {  };

        _methodName119 = "setBeanIdentifier";

        _methodParameterTypes119 = new String[] { "java.lang.String" };

        _methodName124 = "getInfrastructuresIdsByServiceId";

        _methodParameterTypes124 = new String[] { "int" };

        _methodName125 = "getOrganisationsIdsByServiceId";

        _methodParameterTypes125 = new String[] { "int" };

        _methodName126 = "getContactsIdsByServiceId";

        _methodParameterTypes126 = new String[] { "int" };

        _methodName127 = "getLocationTypesByServiceId";

        _methodParameterTypes127 = new String[] { "int" };

        _methodName128 = "getServiceTypesByServiceId";

        _methodParameterTypes128 = new String[] { "int" };

        _methodName129 = "getServicesIdsByPostalCodes";

        _methodParameterTypes129 = new String[] { "int[][]" };

        _methodName130 = "getServicesIdsByLocation";

        _methodParameterTypes130 = new String[] { "double", "double" };

        _methodName131 = "getServiceTypesIdsByServicesIds";

        _methodParameterTypes131 = new String[] { "int[][]" };

        _methodName132 = "getServicesIdsByLocationTypesIds";

        _methodParameterTypes132 = new String[] { "int[][]" };

        _methodName133 = "getLocationTypesIdsByServicesIds";

        _methodParameterTypes133 = new String[] { "int[][]" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return PalveluLocalServiceUtil.addPalvelu((fi.csc.avaa.tupa.db.model.Palvelu) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return PalveluLocalServiceUtil.createPalvelu(((Integer) arguments[0]).intValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return PalveluLocalServiceUtil.deletePalvelu(((Integer) arguments[0]).intValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return PalveluLocalServiceUtil.deletePalvelu((fi.csc.avaa.tupa.db.model.Palvelu) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return PalveluLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return PalveluLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return PalveluLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return PalveluLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return PalveluLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return PalveluLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return PalveluLocalServiceUtil.fetchPalvelu(((Integer) arguments[0]).intValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return PalveluLocalServiceUtil.getPalvelu(((Integer) arguments[0]).intValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return PalveluLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return PalveluLocalServiceUtil.getPalvelus(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return PalveluLocalServiceUtil.getPalvelusCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return PalveluLocalServiceUtil.updatePalvelu((fi.csc.avaa.tupa.db.model.Palvelu) arguments[0]);
        }

        if (_methodName118.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
            return PalveluLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName119.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
            PalveluLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName124.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
            return PalveluLocalServiceUtil.getInfrastructuresIdsByServiceId(((Integer) arguments[0]).intValue());
        }

        if (_methodName125.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
            return PalveluLocalServiceUtil.getOrganisationsIdsByServiceId(((Integer) arguments[0]).intValue());
        }

        if (_methodName126.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
            return PalveluLocalServiceUtil.getContactsIdsByServiceId(((Integer) arguments[0]).intValue());
        }

        if (_methodName127.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
            return PalveluLocalServiceUtil.getLocationTypesByServiceId(((Integer) arguments[0]).intValue());
        }

        if (_methodName128.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
            return PalveluLocalServiceUtil.getServiceTypesByServiceId(((Integer) arguments[0]).intValue());
        }

        if (_methodName129.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
            return PalveluLocalServiceUtil.getServicesIdsByPostalCodes((int[]) arguments[0]);
        }

        if (_methodName130.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
            return PalveluLocalServiceUtil.getServicesIdsByLocation(((Double) arguments[0]).doubleValue(),
                ((Double) arguments[1]).doubleValue());
        }

        if (_methodName131.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
            return PalveluLocalServiceUtil.getServiceTypesIdsByServicesIds((int[]) arguments[0]);
        }

        if (_methodName132.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes132, parameterTypes)) {
            return PalveluLocalServiceUtil.getServicesIdsByLocationTypesIds((int[]) arguments[0]);
        }

        if (_methodName133.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes133, parameterTypes)) {
            return PalveluLocalServiceUtil.getLocationTypesIdsByServicesIds((int[]) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
