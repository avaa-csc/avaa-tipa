package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class PalvelutyyppiClp extends BaseModelImpl<Palvelutyyppi>
    implements Palvelutyyppi {
    private int _palvelutyyppi_id;
    private int _tyyppi;
    private BaseModel<?> _palvelutyyppiRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public PalvelutyyppiClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Palvelutyyppi.class;
    }

    @Override
    public String getModelClassName() {
        return Palvelutyyppi.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _palvelutyyppi_id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setPalvelutyyppi_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _palvelutyyppi_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("palvelutyyppi_id", getPalvelutyyppi_id());
        attributes.put("tyyppi", getTyyppi());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer palvelutyyppi_id = (Integer) attributes.get("palvelutyyppi_id");

        if (palvelutyyppi_id != null) {
            setPalvelutyyppi_id(palvelutyyppi_id);
        }

        Integer tyyppi = (Integer) attributes.get("tyyppi");

        if (tyyppi != null) {
            setTyyppi(tyyppi);
        }
    }

    @Override
    public int getPalvelutyyppi_id() {
        return _palvelutyyppi_id;
    }

    @Override
    public void setPalvelutyyppi_id(int palvelutyyppi_id) {
        _palvelutyyppi_id = palvelutyyppi_id;

        if (_palvelutyyppiRemoteModel != null) {
            try {
                Class<?> clazz = _palvelutyyppiRemoteModel.getClass();

                Method method = clazz.getMethod("setPalvelutyyppi_id", int.class);

                method.invoke(_palvelutyyppiRemoteModel, palvelutyyppi_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTyyppi() {
        return _tyyppi;
    }

    @Override
    public void setTyyppi(int tyyppi) {
        _tyyppi = tyyppi;

        if (_palvelutyyppiRemoteModel != null) {
            try {
                Class<?> clazz = _palvelutyyppiRemoteModel.getClass();

                Method method = clazz.getMethod("setTyyppi", int.class);

                method.invoke(_palvelutyyppiRemoteModel, tyyppi);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPalvelutyyppiRemoteModel() {
        return _palvelutyyppiRemoteModel;
    }

    public void setPalvelutyyppiRemoteModel(
        BaseModel<?> palvelutyyppiRemoteModel) {
        _palvelutyyppiRemoteModel = palvelutyyppiRemoteModel;
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

        Class<?> remoteModelClass = _palvelutyyppiRemoteModel.getClass();

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

        Object returnValue = method.invoke(_palvelutyyppiRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PalvelutyyppiLocalServiceUtil.addPalvelutyyppi(this);
        } else {
            PalvelutyyppiLocalServiceUtil.updatePalvelutyyppi(this);
        }
    }

    @Override
    public Palvelutyyppi toEscapedModel() {
        return (Palvelutyyppi) ProxyUtil.newProxyInstance(Palvelutyyppi.class.getClassLoader(),
            new Class[] { Palvelutyyppi.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PalvelutyyppiClp clone = new PalvelutyyppiClp();

        clone.setPalvelutyyppi_id(getPalvelutyyppi_id());
        clone.setTyyppi(getTyyppi());

        return clone;
    }

    @Override
    public int compareTo(Palvelutyyppi palvelutyyppi) {
        int primaryKey = palvelutyyppi.getPrimaryKey();

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

        if (!(obj instanceof PalvelutyyppiClp)) {
            return false;
        }

        PalvelutyyppiClp palvelutyyppi = (PalvelutyyppiClp) obj;

        int primaryKey = palvelutyyppi.getPrimaryKey();

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
        StringBundler sb = new StringBundler(5);

        sb.append("{palvelutyyppi_id=");
        sb.append(getPalvelutyyppi_id());
        sb.append(", tyyppi=");
        sb.append(getTyyppi());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.Palvelutyyppi");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>palvelutyyppi_id</column-name><column-value><![CDATA[");
        sb.append(getPalvelutyyppi_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tyyppi</column-name><column-value><![CDATA[");
        sb.append(getTyyppi());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
