package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.TpOrganisationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class TpOrganisationClp extends BaseModelImpl<TpOrganisation>
    implements TpOrganisation {
    private int _id;
    private String _name_EN;
    private String _name_FI;
    private String _isni;
    private int _motherOrganisationsIds;
    private String _country;
    private BaseModel<?> _tpOrganisationRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public TpOrganisationClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return TpOrganisation.class;
    }

    @Override
    public String getModelClassName() {
        return TpOrganisation.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("name_EN", getName_EN());
        attributes.put("name_FI", getName_FI());
        attributes.put("isni", getIsni());
        attributes.put("motherOrganisationsIds", getMotherOrganisationsIds());
        attributes.put("country", getCountry());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer id = (Integer) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String name_EN = (String) attributes.get("name_EN");

        if (name_EN != null) {
            setName_EN(name_EN);
        }

        String name_FI = (String) attributes.get("name_FI");

        if (name_FI != null) {
            setName_FI(name_FI);
        }

        String isni = (String) attributes.get("isni");

        if (isni != null) {
            setIsni(isni);
        }

        Integer motherOrganisationsIds = (Integer) attributes.get(
                "motherOrganisationsIds");

        if (motherOrganisationsIds != null) {
            setMotherOrganisationsIds(motherOrganisationsIds);
        }

        String country = (String) attributes.get("country");

        if (country != null) {
            setCountry(country);
        }
    }

    @Override
    public int getId() {
        return _id;
    }

    @Override
    public void setId(int id) {
        _id = id;

        if (_tpOrganisationRemoteModel != null) {
            try {
                Class<?> clazz = _tpOrganisationRemoteModel.getClass();

                Method method = clazz.getMethod("setId", int.class);

                method.invoke(_tpOrganisationRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName_EN() {
        return _name_EN;
    }

    @Override
    public void setName_EN(String name_EN) {
        _name_EN = name_EN;

        if (_tpOrganisationRemoteModel != null) {
            try {
                Class<?> clazz = _tpOrganisationRemoteModel.getClass();

                Method method = clazz.getMethod("setName_EN", String.class);

                method.invoke(_tpOrganisationRemoteModel, name_EN);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName_FI() {
        return _name_FI;
    }

    @Override
    public void setName_FI(String name_FI) {
        _name_FI = name_FI;

        if (_tpOrganisationRemoteModel != null) {
            try {
                Class<?> clazz = _tpOrganisationRemoteModel.getClass();

                Method method = clazz.getMethod("setName_FI", String.class);

                method.invoke(_tpOrganisationRemoteModel, name_FI);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getIsni() {
        return _isni;
    }

    @Override
    public void setIsni(String isni) {
        _isni = isni;

        if (_tpOrganisationRemoteModel != null) {
            try {
                Class<?> clazz = _tpOrganisationRemoteModel.getClass();

                Method method = clazz.getMethod("setIsni", String.class);

                method.invoke(_tpOrganisationRemoteModel, isni);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getMotherOrganisationsIds() {
        return _motherOrganisationsIds;
    }

    @Override
    public void setMotherOrganisationsIds(int motherOrganisationsIds) {
        _motherOrganisationsIds = motherOrganisationsIds;

        if (_tpOrganisationRemoteModel != null) {
            try {
                Class<?> clazz = _tpOrganisationRemoteModel.getClass();

                Method method = clazz.getMethod("setMotherOrganisationsIds",
                        int.class);

                method.invoke(_tpOrganisationRemoteModel, motherOrganisationsIds);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCountry() {
        return _country;
    }

    @Override
    public void setCountry(String country) {
        _country = country;

        if (_tpOrganisationRemoteModel != null) {
            try {
                Class<?> clazz = _tpOrganisationRemoteModel.getClass();

                Method method = clazz.getMethod("setCountry", String.class);

                method.invoke(_tpOrganisationRemoteModel, country);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int[] getInfrastructuresIds() {
        try {
            String methodName = "getInfrastructuresIds";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            int[] returnObj = (int[]) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setInfrastructuresIds(int[] infrastructuresIds) {
        try {
            String methodName = "setInfrastructuresIds";

            Class<?>[] parameterTypes = new Class<?>[] { int.class };

            Object[] parameterValues = new Object[] { infrastructuresIds };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setServicesIds(int[] servicesIds) {
        try {
            String methodName = "setServicesIds";

            Class<?>[] parameterTypes = new Class<?>[] { int.class };

            Object[] parameterValues = new Object[] { servicesIds };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public int[] getServicesIds() {
        try {
            String methodName = "getServicesIds";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            int[] returnObj = (int[]) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public int[] getContactsIds() {
        try {
            String methodName = "getContactsIds";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            int[] returnObj = (int[]) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setContactsIds(int[] contactsIds) {
        try {
            String methodName = "setContactsIds";

            Class<?>[] parameterTypes = new Class<?>[] { int.class };

            Object[] parameterValues = new Object[] { contactsIds };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public BaseModel<?> getTpOrganisationRemoteModel() {
        return _tpOrganisationRemoteModel;
    }

    public void setTpOrganisationRemoteModel(
        BaseModel<?> tpOrganisationRemoteModel) {
        _tpOrganisationRemoteModel = tpOrganisationRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _tpOrganisationRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_tpOrganisationRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TpOrganisationLocalServiceUtil.addTpOrganisation(this);
        } else {
            TpOrganisationLocalServiceUtil.updateTpOrganisation(this);
        }
    }

    @Override
    public TpOrganisation toEscapedModel() {
        return (TpOrganisation) ProxyUtil.newProxyInstance(TpOrganisation.class.getClassLoader(),
            new Class[] { TpOrganisation.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        TpOrganisationClp clone = new TpOrganisationClp();

        clone.setId(getId());
        clone.setName_EN(getName_EN());
        clone.setName_FI(getName_FI());
        clone.setIsni(getIsni());
        clone.setMotherOrganisationsIds(getMotherOrganisationsIds());
        clone.setCountry(getCountry());

        return clone;
    }

    @Override
    public int compareTo(TpOrganisation tpOrganisation) {
        int primaryKey = tpOrganisation.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TpOrganisationClp)) {
            return false;
        }

        TpOrganisationClp tpOrganisation = (TpOrganisationClp) obj;

        int primaryKey = tpOrganisation.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", name_EN=");
        sb.append(getName_EN());
        sb.append(", name_FI=");
        sb.append(getName_FI());
        sb.append(", isni=");
        sb.append(getIsni());
        sb.append(", motherOrganisationsIds=");
        sb.append(getMotherOrganisationsIds());
        sb.append(", country=");
        sb.append(getCountry());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.TpOrganisation");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name_EN</column-name><column-value><![CDATA[");
        sb.append(getName_EN());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name_FI</column-name><column-value><![CDATA[");
        sb.append(getName_FI());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>isni</column-name><column-value><![CDATA[");
        sb.append(getIsni());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>motherOrganisationsIds</column-name><column-value><![CDATA[");
        sb.append(getMotherOrganisationsIds());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>country</column-name><column-value><![CDATA[");
        sb.append(getCountry());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
