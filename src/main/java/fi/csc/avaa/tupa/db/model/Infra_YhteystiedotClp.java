package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class Infra_YhteystiedotClp extends BaseModelImpl<Infra_Yhteystiedot>
    implements Infra_Yhteystiedot {
    private int _infra_id;
    private int _yhteystieto_id;
    private BaseModel<?> _infra_YhteystiedotRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public Infra_YhteystiedotClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Infra_Yhteystiedot.class;
    }

    @Override
    public String getModelClassName() {
        return Infra_Yhteystiedot.class.getName();
    }

    @Override
    public Infra_YhteystiedotPK getPrimaryKey() {
        return new Infra_YhteystiedotPK(_infra_id, _yhteystieto_id);
    }

    @Override
    public void setPrimaryKey(Infra_YhteystiedotPK primaryKey) {
        setInfra_id(primaryKey.infra_id);
        setYhteystieto_id(primaryKey.yhteystieto_id);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new Infra_YhteystiedotPK(_infra_id, _yhteystieto_id);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((Infra_YhteystiedotPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("infra_id", getInfra_id());
        attributes.put("yhteystieto_id", getYhteystieto_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer infra_id = (Integer) attributes.get("infra_id");

        if (infra_id != null) {
            setInfra_id(infra_id);
        }

        Integer yhteystieto_id = (Integer) attributes.get("yhteystieto_id");

        if (yhteystieto_id != null) {
            setYhteystieto_id(yhteystieto_id);
        }
    }

    @Override
    public int getInfra_id() {
        return _infra_id;
    }

    @Override
    public void setInfra_id(int infra_id) {
        _infra_id = infra_id;

        if (_infra_YhteystiedotRemoteModel != null) {
            try {
                Class<?> clazz = _infra_YhteystiedotRemoteModel.getClass();

                Method method = clazz.getMethod("setInfra_id", int.class);

                method.invoke(_infra_YhteystiedotRemoteModel, infra_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getYhteystieto_id() {
        return _yhteystieto_id;
    }

    @Override
    public void setYhteystieto_id(int yhteystieto_id) {
        _yhteystieto_id = yhteystieto_id;

        if (_infra_YhteystiedotRemoteModel != null) {
            try {
                Class<?> clazz = _infra_YhteystiedotRemoteModel.getClass();

                Method method = clazz.getMethod("setYhteystieto_id", int.class);

                method.invoke(_infra_YhteystiedotRemoteModel, yhteystieto_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getInfra_YhteystiedotRemoteModel() {
        return _infra_YhteystiedotRemoteModel;
    }

    public void setInfra_YhteystiedotRemoteModel(
        BaseModel<?> infra_YhteystiedotRemoteModel) {
        _infra_YhteystiedotRemoteModel = infra_YhteystiedotRemoteModel;
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

        Class<?> remoteModelClass = _infra_YhteystiedotRemoteModel.getClass();

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

        Object returnValue = method.invoke(_infra_YhteystiedotRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Infra_YhteystiedotLocalServiceUtil.addInfra_Yhteystiedot(this);
        } else {
            Infra_YhteystiedotLocalServiceUtil.updateInfra_Yhteystiedot(this);
        }
    }

    @Override
    public Infra_Yhteystiedot toEscapedModel() {
        return (Infra_Yhteystiedot) ProxyUtil.newProxyInstance(Infra_Yhteystiedot.class.getClassLoader(),
            new Class[] { Infra_Yhteystiedot.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Infra_YhteystiedotClp clone = new Infra_YhteystiedotClp();

        clone.setInfra_id(getInfra_id());
        clone.setYhteystieto_id(getYhteystieto_id());

        return clone;
    }

    @Override
    public int compareTo(Infra_Yhteystiedot infra_Yhteystiedot) {
        Infra_YhteystiedotPK primaryKey = infra_Yhteystiedot.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Infra_YhteystiedotClp)) {
            return false;
        }

        Infra_YhteystiedotClp infra_Yhteystiedot = (Infra_YhteystiedotClp) obj;

        Infra_YhteystiedotPK primaryKey = infra_Yhteystiedot.getPrimaryKey();

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
        sb.append(", yhteystieto_id=");
        sb.append(getYhteystieto_id());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>infra_id</column-name><column-value><![CDATA[");
        sb.append(getInfra_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>yhteystieto_id</column-name><column-value><![CDATA[");
        sb.append(getYhteystieto_id());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
