package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.IdentifierLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class IdentifierClp extends BaseModelImpl<Identifier>
    implements Identifier {
    private int _identifier_type;
    private String _identifier_name;
    private String _identifier_description_translation_key;
    private String _resolution_url;
    private String _definition_url;
    private BaseModel<?> _identifierRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public IdentifierClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Identifier.class;
    }

    @Override
    public String getModelClassName() {
        return Identifier.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _identifier_type;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setIdentifier_type(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _identifier_type;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("identifier_type", getIdentifier_type());
        attributes.put("identifier_name", getIdentifier_name());
        attributes.put("identifier_description_translation_key",
            getIdentifier_description_translation_key());
        attributes.put("resolution_url", getResolution_url());
        attributes.put("definition_url", getDefinition_url());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer identifier_type = (Integer) attributes.get("identifier_type");

        if (identifier_type != null) {
            setIdentifier_type(identifier_type);
        }

        String identifier_name = (String) attributes.get("identifier_name");

        if (identifier_name != null) {
            setIdentifier_name(identifier_name);
        }

        String identifier_description_translation_key = (String) attributes.get(
                "identifier_description_translation_key");

        if (identifier_description_translation_key != null) {
            setIdentifier_description_translation_key(identifier_description_translation_key);
        }

        String resolution_url = (String) attributes.get("resolution_url");

        if (resolution_url != null) {
            setResolution_url(resolution_url);
        }

        String definition_url = (String) attributes.get("definition_url");

        if (definition_url != null) {
            setDefinition_url(definition_url);
        }
    }

    @Override
    public int getIdentifier_type() {
        return _identifier_type;
    }

    @Override
    public void setIdentifier_type(int identifier_type) {
        _identifier_type = identifier_type;

        if (_identifierRemoteModel != null) {
            try {
                Class<?> clazz = _identifierRemoteModel.getClass();

                Method method = clazz.getMethod("setIdentifier_type", int.class);

                method.invoke(_identifierRemoteModel, identifier_type);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getIdentifier_name() {
        return _identifier_name;
    }

    @Override
    public void setIdentifier_name(String identifier_name) {
        _identifier_name = identifier_name;

        if (_identifierRemoteModel != null) {
            try {
                Class<?> clazz = _identifierRemoteModel.getClass();

                Method method = clazz.getMethod("setIdentifier_name",
                        String.class);

                method.invoke(_identifierRemoteModel, identifier_name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getIdentifier_description_translation_key() {
        return _identifier_description_translation_key;
    }

    @Override
    public void setIdentifier_description_translation_key(
        String identifier_description_translation_key) {
        _identifier_description_translation_key = identifier_description_translation_key;

        if (_identifierRemoteModel != null) {
            try {
                Class<?> clazz = _identifierRemoteModel.getClass();

                Method method = clazz.getMethod("setIdentifier_description_translation_key",
                        String.class);

                method.invoke(_identifierRemoteModel,
                    identifier_description_translation_key);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getResolution_url() {
        return _resolution_url;
    }

    @Override
    public void setResolution_url(String resolution_url) {
        _resolution_url = resolution_url;

        if (_identifierRemoteModel != null) {
            try {
                Class<?> clazz = _identifierRemoteModel.getClass();

                Method method = clazz.getMethod("setResolution_url",
                        String.class);

                method.invoke(_identifierRemoteModel, resolution_url);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDefinition_url() {
        return _definition_url;
    }

    @Override
    public void setDefinition_url(String definition_url) {
        _definition_url = definition_url;

        if (_identifierRemoteModel != null) {
            try {
                Class<?> clazz = _identifierRemoteModel.getClass();

                Method method = clazz.getMethod("setDefinition_url",
                        String.class);

                method.invoke(_identifierRemoteModel, definition_url);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getIdentifierRemoteModel() {
        return _identifierRemoteModel;
    }

    public void setIdentifierRemoteModel(BaseModel<?> identifierRemoteModel) {
        _identifierRemoteModel = identifierRemoteModel;
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

        Class<?> remoteModelClass = _identifierRemoteModel.getClass();

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

        Object returnValue = method.invoke(_identifierRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            IdentifierLocalServiceUtil.addIdentifier(this);
        } else {
            IdentifierLocalServiceUtil.updateIdentifier(this);
        }
    }

    @Override
    public Identifier toEscapedModel() {
        return (Identifier) ProxyUtil.newProxyInstance(Identifier.class.getClassLoader(),
            new Class[] { Identifier.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        IdentifierClp clone = new IdentifierClp();

        clone.setIdentifier_type(getIdentifier_type());
        clone.setIdentifier_name(getIdentifier_name());
        clone.setIdentifier_description_translation_key(getIdentifier_description_translation_key());
        clone.setResolution_url(getResolution_url());
        clone.setDefinition_url(getDefinition_url());

        return clone;
    }

    @Override
    public int compareTo(Identifier identifier) {
        int primaryKey = identifier.getPrimaryKey();

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

        if (!(obj instanceof IdentifierClp)) {
            return false;
        }

        IdentifierClp identifier = (IdentifierClp) obj;

        int primaryKey = identifier.getPrimaryKey();

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
        StringBundler sb = new StringBundler(11);

        sb.append("{identifier_type=");
        sb.append(getIdentifier_type());
        sb.append(", identifier_name=");
        sb.append(getIdentifier_name());
        sb.append(", identifier_description_translation_key=");
        sb.append(getIdentifier_description_translation_key());
        sb.append(", resolution_url=");
        sb.append(getResolution_url());
        sb.append(", definition_url=");
        sb.append(getDefinition_url());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.Identifier");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>identifier_type</column-name><column-value><![CDATA[");
        sb.append(getIdentifier_type());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>identifier_name</column-name><column-value><![CDATA[");
        sb.append(getIdentifier_name());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>identifier_description_translation_key</column-name><column-value><![CDATA[");
        sb.append(getIdentifier_description_translation_key());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>resolution_url</column-name><column-value><![CDATA[");
        sb.append(getResolution_url());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>definition_url</column-name><column-value><![CDATA[");
        sb.append(getDefinition_url());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
