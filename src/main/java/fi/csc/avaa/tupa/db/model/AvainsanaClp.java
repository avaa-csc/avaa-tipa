package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.AvainsanaLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class AvainsanaClp extends BaseModelImpl<Avainsana> implements Avainsana {
    private int _avainsana_id;
    private String _avainsana;
    private String _keyword;
    private BaseModel<?> _avainsanaRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public AvainsanaClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Avainsana.class;
    }

    @Override
    public String getModelClassName() {
        return Avainsana.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _avainsana_id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setAvainsana_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _avainsana_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("avainsana_id", getAvainsana_id());
        attributes.put("avainsana", getAvainsana());
        attributes.put("keyword", getKeyword());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer avainsana_id = (Integer) attributes.get("avainsana_id");

        if (avainsana_id != null) {
            setAvainsana_id(avainsana_id);
        }

        String avainsana = (String) attributes.get("avainsana");

        if (avainsana != null) {
            setAvainsana(avainsana);
        }

        String keyword = (String) attributes.get("keyword");

        if (keyword != null) {
            setKeyword(keyword);
        }
    }

    @Override
    public int getAvainsana_id() {
        return _avainsana_id;
    }

    @Override
    public void setAvainsana_id(int avainsana_id) {
        _avainsana_id = avainsana_id;

        if (_avainsanaRemoteModel != null) {
            try {
                Class<?> clazz = _avainsanaRemoteModel.getClass();

                Method method = clazz.getMethod("setAvainsana_id", int.class);

                method.invoke(_avainsanaRemoteModel, avainsana_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAvainsana() {
        return _avainsana;
    }

    @Override
    public void setAvainsana(String avainsana) {
        _avainsana = avainsana;

        if (_avainsanaRemoteModel != null) {
            try {
                Class<?> clazz = _avainsanaRemoteModel.getClass();

                Method method = clazz.getMethod("setAvainsana", String.class);

                method.invoke(_avainsanaRemoteModel, avainsana);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKeyword() {
        return _keyword;
    }

    @Override
    public void setKeyword(String keyword) {
        _keyword = keyword;

        if (_avainsanaRemoteModel != null) {
            try {
                Class<?> clazz = _avainsanaRemoteModel.getClass();

                Method method = clazz.getMethod("setKeyword", String.class);

                method.invoke(_avainsanaRemoteModel, keyword);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getAvainsanaRemoteModel() {
        return _avainsanaRemoteModel;
    }

    public void setAvainsanaRemoteModel(BaseModel<?> avainsanaRemoteModel) {
        _avainsanaRemoteModel = avainsanaRemoteModel;
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

        Class<?> remoteModelClass = _avainsanaRemoteModel.getClass();

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

        Object returnValue = method.invoke(_avainsanaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AvainsanaLocalServiceUtil.addAvainsana(this);
        } else {
            AvainsanaLocalServiceUtil.updateAvainsana(this);
        }
    }

    @Override
    public Avainsana toEscapedModel() {
        return (Avainsana) ProxyUtil.newProxyInstance(Avainsana.class.getClassLoader(),
            new Class[] { Avainsana.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        AvainsanaClp clone = new AvainsanaClp();

        clone.setAvainsana_id(getAvainsana_id());
        clone.setAvainsana(getAvainsana());
        clone.setKeyword(getKeyword());

        return clone;
    }

    @Override
    public int compareTo(Avainsana avainsana) {
        int primaryKey = avainsana.getPrimaryKey();

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

        if (!(obj instanceof AvainsanaClp)) {
            return false;
        }

        AvainsanaClp avainsana = (AvainsanaClp) obj;

        int primaryKey = avainsana.getPrimaryKey();

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
        StringBundler sb = new StringBundler(7);

        sb.append("{avainsana_id=");
        sb.append(getAvainsana_id());
        sb.append(", avainsana=");
        sb.append(getAvainsana());
        sb.append(", keyword=");
        sb.append(getKeyword());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.Avainsana");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>avainsana_id</column-name><column-value><![CDATA[");
        sb.append(getAvainsana_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>avainsana</column-name><column-value><![CDATA[");
        sb.append(getAvainsana());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>keyword</column-name><column-value><![CDATA[");
        sb.append(getKeyword());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
