package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.Infra_IdentifierLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class Infra_IdentifierClp extends BaseModelImpl<Infra_Identifier>
    implements Infra_Identifier {
    private int _identifier_type;
    private int _infra_id;
    private String _identifier_value;
    private BaseModel<?> _infra_IdentifierRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public Infra_IdentifierClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Infra_Identifier.class;
    }

    @Override
    public String getModelClassName() {
        return Infra_Identifier.class.getName();
    }

    @Override
    public Infra_IdentifierPK getPrimaryKey() {
        return new Infra_IdentifierPK(_identifier_type, _infra_id,
            _identifier_value);
    }

    @Override
    public void setPrimaryKey(Infra_IdentifierPK primaryKey) {
        setIdentifier_type(primaryKey.identifier_type);
        setInfra_id(primaryKey.infra_id);
        setIdentifier_value(primaryKey.identifier_value);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new Infra_IdentifierPK(_identifier_type, _infra_id,
            _identifier_value);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((Infra_IdentifierPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("identifier_type", getIdentifier_type());
        attributes.put("infra_id", getInfra_id());
        attributes.put("identifier_value", getIdentifier_value());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer identifier_type = (Integer) attributes.get("identifier_type");

        if (identifier_type != null) {
            setIdentifier_type(identifier_type);
        }

        Integer infra_id = (Integer) attributes.get("infra_id");

        if (infra_id != null) {
            setInfra_id(infra_id);
        }

        String identifier_value = (String) attributes.get("identifier_value");

        if (identifier_value != null) {
            setIdentifier_value(identifier_value);
        }
    }

    @Override
    public int getIdentifier_type() {
        return _identifier_type;
    }

    @Override
    public void setIdentifier_type(int identifier_type) {
        _identifier_type = identifier_type;

        if (_infra_IdentifierRemoteModel != null) {
            try {
                Class<?> clazz = _infra_IdentifierRemoteModel.getClass();

                Method method = clazz.getMethod("setIdentifier_type", int.class);

                method.invoke(_infra_IdentifierRemoteModel, identifier_type);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getInfra_id() {
        return _infra_id;
    }

    @Override
    public void setInfra_id(int infra_id) {
        _infra_id = infra_id;

        if (_infra_IdentifierRemoteModel != null) {
            try {
                Class<?> clazz = _infra_IdentifierRemoteModel.getClass();

                Method method = clazz.getMethod("setInfra_id", int.class);

                method.invoke(_infra_IdentifierRemoteModel, infra_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getIdentifier_value() {
        return _identifier_value;
    }

    @Override
    public void setIdentifier_value(String identifier_value) {
        _identifier_value = identifier_value;

        if (_infra_IdentifierRemoteModel != null) {
            try {
                Class<?> clazz = _infra_IdentifierRemoteModel.getClass();

                Method method = clazz.getMethod("setIdentifier_value",
                        String.class);

                method.invoke(_infra_IdentifierRemoteModel, identifier_value);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public void setDefinition_url(java.lang.String definition_url) {
        try {
            String methodName = "setDefinition_url";

            Class<?>[] parameterTypes = new Class<?>[] { java.lang.String.class };

            Object[] parameterValues = new Object[] { definition_url };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setIdentifier_name(java.lang.String identifier_name) {
        try {
            String methodName = "setIdentifier_name";

            Class<?>[] parameterTypes = new Class<?>[] { java.lang.String.class };

            Object[] parameterValues = new Object[] { identifier_name };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getResolution_url() {
        try {
            String methodName = "getResolution_url";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getDefinition_url() {
        try {
            String methodName = "getDefinition_url";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setResolution_url(java.lang.String resolution_url) {
        try {
            String methodName = "setResolution_url";

            Class<?>[] parameterTypes = new Class<?>[] { java.lang.String.class };

            Object[] parameterValues = new Object[] { resolution_url };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setIdentifier_description_translation_key(
        java.lang.String identifier_description_translation_key) {
        try {
            String methodName = "setIdentifier_description_translation_key";

            Class<?>[] parameterTypes = new Class<?>[] { java.lang.String.class };

            Object[] parameterValues = new Object[] {
                    identifier_description_translation_key
                };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getIdentifier_description_translation_key() {
        try {
            String methodName = "getIdentifier_description_translation_key";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getIdentifier_name() {
        try {
            String methodName = "getIdentifier_name";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public BaseModel<?> getInfra_IdentifierRemoteModel() {
        return _infra_IdentifierRemoteModel;
    }

    public void setInfra_IdentifierRemoteModel(
        BaseModel<?> infra_IdentifierRemoteModel) {
        _infra_IdentifierRemoteModel = infra_IdentifierRemoteModel;
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

        Class<?> remoteModelClass = _infra_IdentifierRemoteModel.getClass();

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

        Object returnValue = method.invoke(_infra_IdentifierRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Infra_IdentifierLocalServiceUtil.addInfra_Identifier(this);
        } else {
            Infra_IdentifierLocalServiceUtil.updateInfra_Identifier(this);
        }
    }

    @Override
    public Infra_Identifier toEscapedModel() {
        return (Infra_Identifier) ProxyUtil.newProxyInstance(Infra_Identifier.class.getClassLoader(),
            new Class[] { Infra_Identifier.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Infra_IdentifierClp clone = new Infra_IdentifierClp();

        clone.setIdentifier_type(getIdentifier_type());
        clone.setInfra_id(getInfra_id());
        clone.setIdentifier_value(getIdentifier_value());

        return clone;
    }

    @Override
    public int compareTo(Infra_Identifier infra_Identifier) {
        Infra_IdentifierPK primaryKey = infra_Identifier.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Infra_IdentifierClp)) {
            return false;
        }

        Infra_IdentifierClp infra_Identifier = (Infra_IdentifierClp) obj;

        Infra_IdentifierPK primaryKey = infra_Identifier.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
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
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{identifier_type=");
        sb.append(getIdentifier_type());
        sb.append(", infra_id=");
        sb.append(getInfra_id());
        sb.append(", identifier_value=");
        sb.append(getIdentifier_value());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.Infra_Identifier");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>identifier_type</column-name><column-value><![CDATA[");
        sb.append(getIdentifier_type());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>infra_id</column-name><column-value><![CDATA[");
        sb.append(getInfra_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>identifier_value</column-name><column-value><![CDATA[");
        sb.append(getIdentifier_value());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
