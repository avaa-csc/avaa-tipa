package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.TpAPILocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class TpAPIClp extends BaseModelImpl<TpAPI> implements TpAPI {
    private String _methodsDescription;
    private BaseModel<?> _tpAPIRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public TpAPIClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return TpAPI.class;
    }

    @Override
    public String getModelClassName() {
        return TpAPI.class.getName();
    }

    @Override
    public String getPrimaryKey() {
        return _methodsDescription;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setMethodsDescription(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _methodsDescription;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("methodsDescription", getMethodsDescription());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String methodsDescription = (String) attributes.get(
                "methodsDescription");

        if (methodsDescription != null) {
            setMethodsDescription(methodsDescription);
        }
    }

    @Override
    public String getMethodsDescription() {
        return _methodsDescription;
    }

    @Override
    public void setMethodsDescription(String methodsDescription) {
        _methodsDescription = methodsDescription;

        if (_tpAPIRemoteModel != null) {
            try {
                Class<?> clazz = _tpAPIRemoteModel.getClass();

                Method method = clazz.getMethod("setMethodsDescription",
                        String.class);

                method.invoke(_tpAPIRemoteModel, methodsDescription);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public void setMethodDescription(
        java.util.List<com.liferay.portal.kernel.json.JSONObject> methodDescription) {
        try {
            String methodName = "setMethodDescription";

            Class<?>[] parameterTypes = new Class<?>[] { java.util.List.class };

            Object[] parameterValues = new Object[] { methodDescription };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.util.List<com.liferay.portal.kernel.json.JSONObject> getMethodDescription() {
        try {
            String methodName = "getMethodDescription";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.util.List<com.liferay.portal.kernel.json.JSONObject> returnObj = (java.util.List<com.liferay.portal.kernel.json.JSONObject>) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public BaseModel<?> getTpAPIRemoteModel() {
        return _tpAPIRemoteModel;
    }

    public void setTpAPIRemoteModel(BaseModel<?> tpAPIRemoteModel) {
        _tpAPIRemoteModel = tpAPIRemoteModel;
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

        Class<?> remoteModelClass = _tpAPIRemoteModel.getClass();

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

        Object returnValue = method.invoke(_tpAPIRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TpAPILocalServiceUtil.addTpAPI(this);
        } else {
            TpAPILocalServiceUtil.updateTpAPI(this);
        }
    }

    @Override
    public TpAPI toEscapedModel() {
        return (TpAPI) ProxyUtil.newProxyInstance(TpAPI.class.getClassLoader(),
            new Class[] { TpAPI.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        TpAPIClp clone = new TpAPIClp();

        clone.setMethodsDescription(getMethodsDescription());

        return clone;
    }

    @Override
    public int compareTo(TpAPI tpAPI) {
        String primaryKey = tpAPI.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TpAPIClp)) {
            return false;
        }

        TpAPIClp tpAPI = (TpAPIClp) obj;

        String primaryKey = tpAPI.getPrimaryKey();

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
        StringBundler sb = new StringBundler(3);

        sb.append("{methodsDescription=");
        sb.append(getMethodsDescription());

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(7);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.TpAPI");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>methodsDescription</column-name><column-value><![CDATA[");
        sb.append(getMethodsDescription());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
