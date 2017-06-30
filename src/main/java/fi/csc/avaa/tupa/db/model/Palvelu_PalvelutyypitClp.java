package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.Palvelu_PalvelutyypitLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class Palvelu_PalvelutyypitClp extends BaseModelImpl<Palvelu_Palvelutyypit>
    implements Palvelu_Palvelutyypit {
    private int _palvelu_id;
    private int _palvelutyyppi_id;
    private BaseModel<?> _palvelu_PalvelutyypitRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public Palvelu_PalvelutyypitClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Palvelu_Palvelutyypit.class;
    }

    @Override
    public String getModelClassName() {
        return Palvelu_Palvelutyypit.class.getName();
    }

    @Override
    public Palvelu_PalvelutyypitPK getPrimaryKey() {
        return new Palvelu_PalvelutyypitPK(_palvelu_id, _palvelutyyppi_id);
    }

    @Override
    public void setPrimaryKey(Palvelu_PalvelutyypitPK primaryKey) {
        setPalvelu_id(primaryKey.palvelu_id);
        setPalvelutyyppi_id(primaryKey.palvelutyyppi_id);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new Palvelu_PalvelutyypitPK(_palvelu_id, _palvelutyyppi_id);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((Palvelu_PalvelutyypitPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("palvelu_id", getPalvelu_id());
        attributes.put("palvelutyyppi_id", getPalvelutyyppi_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer palvelu_id = (Integer) attributes.get("palvelu_id");

        if (palvelu_id != null) {
            setPalvelu_id(palvelu_id);
        }

        Integer palvelutyyppi_id = (Integer) attributes.get("palvelutyyppi_id");

        if (palvelutyyppi_id != null) {
            setPalvelutyyppi_id(palvelutyyppi_id);
        }
    }

    @Override
    public int getPalvelu_id() {
        return _palvelu_id;
    }

    @Override
    public void setPalvelu_id(int palvelu_id) {
        _palvelu_id = palvelu_id;

        if (_palvelu_PalvelutyypitRemoteModel != null) {
            try {
                Class<?> clazz = _palvelu_PalvelutyypitRemoteModel.getClass();

                Method method = clazz.getMethod("setPalvelu_id", int.class);

                method.invoke(_palvelu_PalvelutyypitRemoteModel, palvelu_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPalvelutyyppi_id() {
        return _palvelutyyppi_id;
    }

    @Override
    public void setPalvelutyyppi_id(int palvelutyyppi_id) {
        _palvelutyyppi_id = palvelutyyppi_id;

        if (_palvelu_PalvelutyypitRemoteModel != null) {
            try {
                Class<?> clazz = _palvelu_PalvelutyypitRemoteModel.getClass();

                Method method = clazz.getMethod("setPalvelutyyppi_id", int.class);

                method.invoke(_palvelu_PalvelutyypitRemoteModel,
                    palvelutyyppi_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPalvelu_PalvelutyypitRemoteModel() {
        return _palvelu_PalvelutyypitRemoteModel;
    }

    public void setPalvelu_PalvelutyypitRemoteModel(
        BaseModel<?> palvelu_PalvelutyypitRemoteModel) {
        _palvelu_PalvelutyypitRemoteModel = palvelu_PalvelutyypitRemoteModel;
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

        Class<?> remoteModelClass = _palvelu_PalvelutyypitRemoteModel.getClass();

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

        Object returnValue = method.invoke(_palvelu_PalvelutyypitRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Palvelu_PalvelutyypitLocalServiceUtil.addPalvelu_Palvelutyypit(this);
        } else {
            Palvelu_PalvelutyypitLocalServiceUtil.updatePalvelu_Palvelutyypit(this);
        }
    }

    @Override
    public Palvelu_Palvelutyypit toEscapedModel() {
        return (Palvelu_Palvelutyypit) ProxyUtil.newProxyInstance(Palvelu_Palvelutyypit.class.getClassLoader(),
            new Class[] { Palvelu_Palvelutyypit.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Palvelu_PalvelutyypitClp clone = new Palvelu_PalvelutyypitClp();

        clone.setPalvelu_id(getPalvelu_id());
        clone.setPalvelutyyppi_id(getPalvelutyyppi_id());

        return clone;
    }

    @Override
    public int compareTo(Palvelu_Palvelutyypit palvelu_Palvelutyypit) {
        Palvelu_PalvelutyypitPK primaryKey = palvelu_Palvelutyypit.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Palvelu_PalvelutyypitClp)) {
            return false;
        }

        Palvelu_PalvelutyypitClp palvelu_Palvelutyypit = (Palvelu_PalvelutyypitClp) obj;

        Palvelu_PalvelutyypitPK primaryKey = palvelu_Palvelutyypit.getPrimaryKey();

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

        sb.append("{palvelu_id=");
        sb.append(getPalvelu_id());
        sb.append(", palvelutyyppi_id=");
        sb.append(getPalvelutyyppi_id());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>palvelu_id</column-name><column-value><![CDATA[");
        sb.append(getPalvelu_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>palvelutyyppi_id</column-name><column-value><![CDATA[");
        sb.append(getPalvelutyyppi_id());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
