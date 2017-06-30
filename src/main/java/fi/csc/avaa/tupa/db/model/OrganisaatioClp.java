package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.OrganisaatioLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class OrganisaatioClp extends BaseModelImpl<Organisaatio>
    implements Organisaatio {
    private int _organisaatio_id;
    private String _nimi;
    private String _name;
    private String _maa;
    private String _ISNI;
    private String _crmid;
    private int _emo_organisaatio;
    private boolean _kv_isanta;
    private BaseModel<?> _organisaatioRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public OrganisaatioClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Organisaatio.class;
    }

    @Override
    public String getModelClassName() {
        return Organisaatio.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _organisaatio_id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setOrganisaatio_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _organisaatio_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("organisaatio_id", getOrganisaatio_id());
        attributes.put("nimi", getNimi());
        attributes.put("name", getName());
        attributes.put("maa", getMaa());
        attributes.put("ISNI", getISNI());
        attributes.put("crmid", getCrmid());
        attributes.put("emo_organisaatio", getEmo_organisaatio());
        attributes.put("kv_isanta", getKv_isanta());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer organisaatio_id = (Integer) attributes.get("organisaatio_id");

        if (organisaatio_id != null) {
            setOrganisaatio_id(organisaatio_id);
        }

        String nimi = (String) attributes.get("nimi");

        if (nimi != null) {
            setNimi(nimi);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String maa = (String) attributes.get("maa");

        if (maa != null) {
            setMaa(maa);
        }

        String ISNI = (String) attributes.get("ISNI");

        if (ISNI != null) {
            setISNI(ISNI);
        }

        String crmid = (String) attributes.get("crmid");

        if (crmid != null) {
            setCrmid(crmid);
        }

        Integer emo_organisaatio = (Integer) attributes.get("emo_organisaatio");

        if (emo_organisaatio != null) {
            setEmo_organisaatio(emo_organisaatio);
        }

        Boolean kv_isanta = (Boolean) attributes.get("kv_isanta");

        if (kv_isanta != null) {
            setKv_isanta(kv_isanta);
        }
    }

    @Override
    public int getOrganisaatio_id() {
        return _organisaatio_id;
    }

    @Override
    public void setOrganisaatio_id(int organisaatio_id) {
        _organisaatio_id = organisaatio_id;

        if (_organisaatioRemoteModel != null) {
            try {
                Class<?> clazz = _organisaatioRemoteModel.getClass();

                Method method = clazz.getMethod("setOrganisaatio_id", int.class);

                method.invoke(_organisaatioRemoteModel, organisaatio_id);
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

        if (_organisaatioRemoteModel != null) {
            try {
                Class<?> clazz = _organisaatioRemoteModel.getClass();

                Method method = clazz.getMethod("setNimi", String.class);

                method.invoke(_organisaatioRemoteModel, nimi);
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

        if (_organisaatioRemoteModel != null) {
            try {
                Class<?> clazz = _organisaatioRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_organisaatioRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMaa() {
        return _maa;
    }

    @Override
    public void setMaa(String maa) {
        _maa = maa;

        if (_organisaatioRemoteModel != null) {
            try {
                Class<?> clazz = _organisaatioRemoteModel.getClass();

                Method method = clazz.getMethod("setMaa", String.class);

                method.invoke(_organisaatioRemoteModel, maa);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getISNI() {
        return _ISNI;
    }

    @Override
    public void setISNI(String ISNI) {
        _ISNI = ISNI;

        if (_organisaatioRemoteModel != null) {
            try {
                Class<?> clazz = _organisaatioRemoteModel.getClass();

                Method method = clazz.getMethod("setISNI", String.class);

                method.invoke(_organisaatioRemoteModel, ISNI);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCrmid() {
        return _crmid;
    }

    @Override
    public void setCrmid(String crmid) {
        _crmid = crmid;

        if (_organisaatioRemoteModel != null) {
            try {
                Class<?> clazz = _organisaatioRemoteModel.getClass();

                Method method = clazz.getMethod("setCrmid", String.class);

                method.invoke(_organisaatioRemoteModel, crmid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getEmo_organisaatio() {
        return _emo_organisaatio;
    }

    @Override
    public void setEmo_organisaatio(int emo_organisaatio) {
        _emo_organisaatio = emo_organisaatio;

        if (_organisaatioRemoteModel != null) {
            try {
                Class<?> clazz = _organisaatioRemoteModel.getClass();

                Method method = clazz.getMethod("setEmo_organisaatio", int.class);

                method.invoke(_organisaatioRemoteModel, emo_organisaatio);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getKv_isanta() {
        return _kv_isanta;
    }

    @Override
    public boolean isKv_isanta() {
        return _kv_isanta;
    }

    @Override
    public void setKv_isanta(boolean kv_isanta) {
        _kv_isanta = kv_isanta;

        if (_organisaatioRemoteModel != null) {
            try {
                Class<?> clazz = _organisaatioRemoteModel.getClass();

                Method method = clazz.getMethod("setKv_isanta", boolean.class);

                method.invoke(_organisaatioRemoteModel, kv_isanta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getOrganisaatioRemoteModel() {
        return _organisaatioRemoteModel;
    }

    public void setOrganisaatioRemoteModel(BaseModel<?> organisaatioRemoteModel) {
        _organisaatioRemoteModel = organisaatioRemoteModel;
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

        Class<?> remoteModelClass = _organisaatioRemoteModel.getClass();

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

        Object returnValue = method.invoke(_organisaatioRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            OrganisaatioLocalServiceUtil.addOrganisaatio(this);
        } else {
            OrganisaatioLocalServiceUtil.updateOrganisaatio(this);
        }
    }

    @Override
    public Organisaatio toEscapedModel() {
        return (Organisaatio) ProxyUtil.newProxyInstance(Organisaatio.class.getClassLoader(),
            new Class[] { Organisaatio.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        OrganisaatioClp clone = new OrganisaatioClp();

        clone.setOrganisaatio_id(getOrganisaatio_id());
        clone.setNimi(getNimi());
        clone.setName(getName());
        clone.setMaa(getMaa());
        clone.setISNI(getISNI());
        clone.setCrmid(getCrmid());
        clone.setEmo_organisaatio(getEmo_organisaatio());
        clone.setKv_isanta(getKv_isanta());

        return clone;
    }

    @Override
    public int compareTo(Organisaatio organisaatio) {
        int primaryKey = organisaatio.getPrimaryKey();

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

        if (!(obj instanceof OrganisaatioClp)) {
            return false;
        }

        OrganisaatioClp organisaatio = (OrganisaatioClp) obj;

        int primaryKey = organisaatio.getPrimaryKey();

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
        StringBundler sb = new StringBundler(17);

        sb.append("{organisaatio_id=");
        sb.append(getOrganisaatio_id());
        sb.append(", nimi=");
        sb.append(getNimi());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", maa=");
        sb.append(getMaa());
        sb.append(", ISNI=");
        sb.append(getISNI());
        sb.append(", crmid=");
        sb.append(getCrmid());
        sb.append(", emo_organisaatio=");
        sb.append(getEmo_organisaatio());
        sb.append(", kv_isanta=");
        sb.append(getKv_isanta());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.Organisaatio");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>organisaatio_id</column-name><column-value><![CDATA[");
        sb.append(getOrganisaatio_id());
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
            "<column><column-name>maa</column-name><column-value><![CDATA[");
        sb.append(getMaa());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ISNI</column-name><column-value><![CDATA[");
        sb.append(getISNI());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>crmid</column-name><column-value><![CDATA[");
        sb.append(getCrmid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>emo_organisaatio</column-name><column-value><![CDATA[");
        sb.append(getEmo_organisaatio());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kv_isanta</column-name><column-value><![CDATA[");
        sb.append(getKv_isanta());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
