package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.Infra_AvainsanatLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class Infra_AvainsanatClp extends BaseModelImpl<Infra_Avainsanat>
    implements Infra_Avainsanat {
    private int _infra_id;
    private int _avainsana_id;
    private BaseModel<?> _infra_AvainsanatRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public Infra_AvainsanatClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Infra_Avainsanat.class;
    }

    @Override
    public String getModelClassName() {
        return Infra_Avainsanat.class.getName();
    }

    @Override
    public Infra_AvainsanatPK getPrimaryKey() {
        return new Infra_AvainsanatPK(_infra_id, _avainsana_id);
    }

    @Override
    public void setPrimaryKey(Infra_AvainsanatPK primaryKey) {
        setInfra_id(primaryKey.infra_id);
        setAvainsana_id(primaryKey.avainsana_id);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new Infra_AvainsanatPK(_infra_id, _avainsana_id);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((Infra_AvainsanatPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("infra_id", getInfra_id());
        attributes.put("avainsana_id", getAvainsana_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer infra_id = (Integer) attributes.get("infra_id");

        if (infra_id != null) {
            setInfra_id(infra_id);
        }

        Integer avainsana_id = (Integer) attributes.get("avainsana_id");

        if (avainsana_id != null) {
            setAvainsana_id(avainsana_id);
        }
    }

    @Override
    public int getInfra_id() {
        return _infra_id;
    }

    @Override
    public void setInfra_id(int infra_id) {
        _infra_id = infra_id;

        if (_infra_AvainsanatRemoteModel != null) {
            try {
                Class<?> clazz = _infra_AvainsanatRemoteModel.getClass();

                Method method = clazz.getMethod("setInfra_id", int.class);

                method.invoke(_infra_AvainsanatRemoteModel, infra_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAvainsana_id() {
        return _avainsana_id;
    }

    @Override
    public void setAvainsana_id(int avainsana_id) {
        _avainsana_id = avainsana_id;

        if (_infra_AvainsanatRemoteModel != null) {
            try {
                Class<?> clazz = _infra_AvainsanatRemoteModel.getClass();

                Method method = clazz.getMethod("setAvainsana_id", int.class);

                method.invoke(_infra_AvainsanatRemoteModel, avainsana_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getInfra_AvainsanatRemoteModel() {
        return _infra_AvainsanatRemoteModel;
    }

    public void setInfra_AvainsanatRemoteModel(
        BaseModel<?> infra_AvainsanatRemoteModel) {
        _infra_AvainsanatRemoteModel = infra_AvainsanatRemoteModel;
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

        Class<?> remoteModelClass = _infra_AvainsanatRemoteModel.getClass();

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

        Object returnValue = method.invoke(_infra_AvainsanatRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Infra_AvainsanatLocalServiceUtil.addInfra_Avainsanat(this);
        } else {
            Infra_AvainsanatLocalServiceUtil.updateInfra_Avainsanat(this);
        }
    }

    @Override
    public Infra_Avainsanat toEscapedModel() {
        return (Infra_Avainsanat) ProxyUtil.newProxyInstance(Infra_Avainsanat.class.getClassLoader(),
            new Class[] { Infra_Avainsanat.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Infra_AvainsanatClp clone = new Infra_AvainsanatClp();

        clone.setInfra_id(getInfra_id());
        clone.setAvainsana_id(getAvainsana_id());

        return clone;
    }

    @Override
    public int compareTo(Infra_Avainsanat infra_Avainsanat) {
        Infra_AvainsanatPK primaryKey = infra_Avainsanat.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Infra_AvainsanatClp)) {
            return false;
        }

        Infra_AvainsanatClp infra_Avainsanat = (Infra_AvainsanatClp) obj;

        Infra_AvainsanatPK primaryKey = infra_Avainsanat.getPrimaryKey();

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
        StringBundler sb = new StringBundler(5);

        sb.append("{infra_id=");
        sb.append(getInfra_id());
        sb.append(", avainsana_id=");
        sb.append(getAvainsana_id());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.Infra_Avainsanat");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>infra_id</column-name><column-value><![CDATA[");
        sb.append(getInfra_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>avainsana_id</column-name><column-value><![CDATA[");
        sb.append(getAvainsana_id());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
