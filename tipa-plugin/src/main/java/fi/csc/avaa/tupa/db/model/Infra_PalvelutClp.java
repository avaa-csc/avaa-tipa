package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.persistence.Infra_PalvelutPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class Infra_PalvelutClp extends BaseModelImpl<Infra_Palvelut>
    implements Infra_Palvelut {
    private int _infra_id;
    private int _palvelu_id;
    private BaseModel<?> _infra_PalvelutRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public Infra_PalvelutClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Infra_Palvelut.class;
    }

    @Override
    public String getModelClassName() {
        return Infra_Palvelut.class.getName();
    }

    @Override
    public Infra_PalvelutPK getPrimaryKey() {
        return new Infra_PalvelutPK(_infra_id, _palvelu_id);
    }

    @Override
    public void setPrimaryKey(Infra_PalvelutPK primaryKey) {
        setInfra_id(primaryKey.infra_id);
        setPalvelu_id(primaryKey.palvelu_id);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new Infra_PalvelutPK(_infra_id, _palvelu_id);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((Infra_PalvelutPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("infra_id", getInfra_id());
        attributes.put("palvelu_id", getPalvelu_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer infra_id = (Integer) attributes.get("infra_id");

        if (infra_id != null) {
            setInfra_id(infra_id);
        }

        Integer palvelu_id = (Integer) attributes.get("palvelu_id");

        if (palvelu_id != null) {
            setPalvelu_id(palvelu_id);
        }
    }

    @Override
    public int getInfra_id() {
        return _infra_id;
    }

    @Override
    public void setInfra_id(int infra_id) {
        _infra_id = infra_id;

        if (_infra_PalvelutRemoteModel != null) {
            try {
                Class<?> clazz = _infra_PalvelutRemoteModel.getClass();

                Method method = clazz.getMethod("setInfra_id", int.class);

                method.invoke(_infra_PalvelutRemoteModel, infra_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPalvelu_id() {
        return _palvelu_id;
    }

    @Override
    public void setPalvelu_id(int palvelu_id) {
        _palvelu_id = palvelu_id;

        if (_infra_PalvelutRemoteModel != null) {
            try {
                Class<?> clazz = _infra_PalvelutRemoteModel.getClass();

                Method method = clazz.getMethod("setPalvelu_id", int.class);

                method.invoke(_infra_PalvelutRemoteModel, palvelu_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getInfra_PalvelutRemoteModel() {
        return _infra_PalvelutRemoteModel;
    }

    public void setInfra_PalvelutRemoteModel(
        BaseModel<?> infra_PalvelutRemoteModel) {
        _infra_PalvelutRemoteModel = infra_PalvelutRemoteModel;
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

        Class<?> remoteModelClass = _infra_PalvelutRemoteModel.getClass();

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

        Object returnValue = method.invoke(_infra_PalvelutRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Infra_PalvelutLocalServiceUtil.addInfra_Palvelut(this);
        } else {
            Infra_PalvelutLocalServiceUtil.updateInfra_Palvelut(this);
        }
    }

    @Override
    public Infra_Palvelut toEscapedModel() {
        return (Infra_Palvelut) ProxyUtil.newProxyInstance(Infra_Palvelut.class.getClassLoader(),
            new Class[] { Infra_Palvelut.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Infra_PalvelutClp clone = new Infra_PalvelutClp();

        clone.setInfra_id(getInfra_id());
        clone.setPalvelu_id(getPalvelu_id());

        return clone;
    }

    @Override
    public int compareTo(Infra_Palvelut infra_Palvelut) {
        Infra_PalvelutPK primaryKey = infra_Palvelut.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Infra_PalvelutClp)) {
            return false;
        }

        Infra_PalvelutClp infra_Palvelut = (Infra_PalvelutClp) obj;

        Infra_PalvelutPK primaryKey = infra_Palvelut.getPrimaryKey();

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
        sb.append(", palvelu_id=");
        sb.append(getPalvelu_id());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.Infra_Palvelut");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>infra_id</column-name><column-value><![CDATA[");
        sb.append(getInfra_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>palvelu_id</column-name><column-value><![CDATA[");
        sb.append(getPalvelu_id());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
