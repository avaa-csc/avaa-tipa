package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.SeliteLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class SeliteClp extends BaseModelImpl<Selite> implements Selite {
    private int _selite_id;
    private String _nimi;
    private String _name;
    private String _kuvaus;
    private String _description;
    private BaseModel<?> _seliteRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public SeliteClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Selite.class;
    }

    @Override
    public String getModelClassName() {
        return Selite.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _selite_id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setSelite_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _selite_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("selite_id", getSelite_id());
        attributes.put("nimi", getNimi());
        attributes.put("name", getName());
        attributes.put("kuvaus", getKuvaus());
        attributes.put("description", getDescription());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer selite_id = (Integer) attributes.get("selite_id");

        if (selite_id != null) {
            setSelite_id(selite_id);
        }

        String nimi = (String) attributes.get("nimi");

        if (nimi != null) {
            setNimi(nimi);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String kuvaus = (String) attributes.get("kuvaus");

        if (kuvaus != null) {
            setKuvaus(kuvaus);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }
    }

    @Override
    public int getSelite_id() {
        return _selite_id;
    }

    @Override
    public void setSelite_id(int selite_id) {
        _selite_id = selite_id;

        if (_seliteRemoteModel != null) {
            try {
                Class<?> clazz = _seliteRemoteModel.getClass();

                Method method = clazz.getMethod("setSelite_id", int.class);

                method.invoke(_seliteRemoteModel, selite_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNimi() {
        return _nimi;
    }

    @Override
    public void setNimi(String nimi) {
        _nimi = nimi;

        if (_seliteRemoteModel != null) {
            try {
                Class<?> clazz = _seliteRemoteModel.getClass();

                Method method = clazz.getMethod("setNimi", String.class);

                method.invoke(_seliteRemoteModel, nimi);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_seliteRemoteModel != null) {
            try {
                Class<?> clazz = _seliteRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_seliteRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKuvaus() {
        return _kuvaus;
    }

    @Override
    public void setKuvaus(String kuvaus) {
        _kuvaus = kuvaus;

        if (_seliteRemoteModel != null) {
            try {
                Class<?> clazz = _seliteRemoteModel.getClass();

                Method method = clazz.getMethod("setKuvaus", String.class);

                method.invoke(_seliteRemoteModel, kuvaus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;

        if (_seliteRemoteModel != null) {
            try {
                Class<?> clazz = _seliteRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription", String.class);

                method.invoke(_seliteRemoteModel, description);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSeliteRemoteModel() {
        return _seliteRemoteModel;
    }

    public void setSeliteRemoteModel(BaseModel<?> seliteRemoteModel) {
        _seliteRemoteModel = seliteRemoteModel;
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

        Class<?> remoteModelClass = _seliteRemoteModel.getClass();

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

        Object returnValue = method.invoke(_seliteRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SeliteLocalServiceUtil.addSelite(this);
        } else {
            SeliteLocalServiceUtil.updateSelite(this);
        }
    }

    @Override
    public Selite toEscapedModel() {
        return (Selite) ProxyUtil.newProxyInstance(Selite.class.getClassLoader(),
            new Class[] { Selite.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        SeliteClp clone = new SeliteClp();

        clone.setSelite_id(getSelite_id());
        clone.setNimi(getNimi());
        clone.setName(getName());
        clone.setKuvaus(getKuvaus());
        clone.setDescription(getDescription());

        return clone;
    }

    @Override
    public int compareTo(Selite selite) {
        int primaryKey = selite.getPrimaryKey();

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

        if (!(obj instanceof SeliteClp)) {
            return false;
        }

        SeliteClp selite = (SeliteClp) obj;

        int primaryKey = selite.getPrimaryKey();

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

        sb.append("{selite_id=");
        sb.append(getSelite_id());
        sb.append(", nimi=");
        sb.append(getNimi());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", kuvaus=");
        sb.append(getKuvaus());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.Selite");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>selite_id</column-name><column-value><![CDATA[");
        sb.append(getSelite_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nimi</column-name><column-value><![CDATA[");
        sb.append(getNimi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kuvaus</column-name><column-value><![CDATA[");
        sb.append(getKuvaus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
