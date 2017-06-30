package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class Infra_VastuuorganisaatiotClp extends BaseModelImpl<Infra_Vastuuorganisaatiot>
    implements Infra_Vastuuorganisaatiot {
    private int _infra_id;
    private int _organisaatio_id;
    private BaseModel<?> _infra_VastuuorganisaatiotRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public Infra_VastuuorganisaatiotClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Infra_Vastuuorganisaatiot.class;
    }

    @Override
    public String getModelClassName() {
        return Infra_Vastuuorganisaatiot.class.getName();
    }

    @Override
    public Infra_VastuuorganisaatiotPK getPrimaryKey() {
        return new Infra_VastuuorganisaatiotPK(_infra_id, _organisaatio_id);
    }

    @Override
    public void setPrimaryKey(Infra_VastuuorganisaatiotPK primaryKey) {
        setInfra_id(primaryKey.infra_id);
        setOrganisaatio_id(primaryKey.organisaatio_id);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new Infra_VastuuorganisaatiotPK(_infra_id, _organisaatio_id);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((Infra_VastuuorganisaatiotPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("infra_id", getInfra_id());
        attributes.put("organisaatio_id", getOrganisaatio_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer infra_id = (Integer) attributes.get("infra_id");

        if (infra_id != null) {
            setInfra_id(infra_id);
        }

        Integer organisaatio_id = (Integer) attributes.get("organisaatio_id");

        if (organisaatio_id != null) {
            setOrganisaatio_id(organisaatio_id);
        }
    }

    @Override
    public int getInfra_id() {
        return _infra_id;
    }

    @Override
    public void setInfra_id(int infra_id) {
        _infra_id = infra_id;

        if (_infra_VastuuorganisaatiotRemoteModel != null) {
            try {
                Class<?> clazz = _infra_VastuuorganisaatiotRemoteModel.getClass();

                Method method = clazz.getMethod("setInfra_id", int.class);

                method.invoke(_infra_VastuuorganisaatiotRemoteModel, infra_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOrganisaatio_id() {
        return _organisaatio_id;
    }

    @Override
    public void setOrganisaatio_id(int organisaatio_id) {
        _organisaatio_id = organisaatio_id;

        if (_infra_VastuuorganisaatiotRemoteModel != null) {
            try {
                Class<?> clazz = _infra_VastuuorganisaatiotRemoteModel.getClass();

                Method method = clazz.getMethod("setOrganisaatio_id", int.class);

                method.invoke(_infra_VastuuorganisaatiotRemoteModel,
                    organisaatio_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getInfra_VastuuorganisaatiotRemoteModel() {
        return _infra_VastuuorganisaatiotRemoteModel;
    }

    public void setInfra_VastuuorganisaatiotRemoteModel(
        BaseModel<?> infra_VastuuorganisaatiotRemoteModel) {
        _infra_VastuuorganisaatiotRemoteModel = infra_VastuuorganisaatiotRemoteModel;
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

        Class<?> remoteModelClass = _infra_VastuuorganisaatiotRemoteModel.getClass();

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

        Object returnValue = method.invoke(_infra_VastuuorganisaatiotRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Infra_VastuuorganisaatiotLocalServiceUtil.addInfra_Vastuuorganisaatiot(this);
        } else {
            Infra_VastuuorganisaatiotLocalServiceUtil.updateInfra_Vastuuorganisaatiot(this);
        }
    }

    @Override
    public Infra_Vastuuorganisaatiot toEscapedModel() {
        return (Infra_Vastuuorganisaatiot) ProxyUtil.newProxyInstance(Infra_Vastuuorganisaatiot.class.getClassLoader(),
            new Class[] { Infra_Vastuuorganisaatiot.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Infra_VastuuorganisaatiotClp clone = new Infra_VastuuorganisaatiotClp();

        clone.setInfra_id(getInfra_id());
        clone.setOrganisaatio_id(getOrganisaatio_id());

        return clone;
    }

    @Override
    public int compareTo(Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot) {
        Infra_VastuuorganisaatiotPK primaryKey = infra_Vastuuorganisaatiot.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Infra_VastuuorganisaatiotClp)) {
            return false;
        }

        Infra_VastuuorganisaatiotClp infra_Vastuuorganisaatiot = (Infra_VastuuorganisaatiotClp) obj;

        Infra_VastuuorganisaatiotPK primaryKey = infra_Vastuuorganisaatiot.getPrimaryKey();

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
        sb.append(", organisaatio_id=");
        sb.append(getOrganisaatio_id());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>infra_id</column-name><column-value><![CDATA[");
        sb.append(getInfra_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>organisaatio_id</column-name><column-value><![CDATA[");
        sb.append(getOrganisaatio_id());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
