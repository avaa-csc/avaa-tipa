package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.YhteystietoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class YhteystietoClp extends BaseModelImpl<Yhteystieto>
    implements Yhteystieto {
    private int _yhteystieto_id;
    private String _sahkoposti;
    private int _affiliaatio;
    private String _puhelin;
    private String _titteli;
    private String _etunimi;
    private String _sukunimi;
    private String _URL;
    private String _kuvaus;
    private String _description;
    private BaseModel<?> _yhteystietoRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public YhteystietoClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Yhteystieto.class;
    }

    @Override
    public String getModelClassName() {
        return Yhteystieto.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _yhteystieto_id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setYhteystieto_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _yhteystieto_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("yhteystieto_id", getYhteystieto_id());
        attributes.put("sahkoposti", getSahkoposti());
        attributes.put("affiliaatio", getAffiliaatio());
        attributes.put("puhelin", getPuhelin());
        attributes.put("titteli", getTitteli());
        attributes.put("etunimi", getEtunimi());
        attributes.put("sukunimi", getSukunimi());
        attributes.put("URL", getURL());
        attributes.put("kuvaus", getKuvaus());
        attributes.put("description", getDescription());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer yhteystieto_id = (Integer) attributes.get("yhteystieto_id");

        if (yhteystieto_id != null) {
            setYhteystieto_id(yhteystieto_id);
        }

        String sahkoposti = (String) attributes.get("sahkoposti");

        if (sahkoposti != null) {
            setSahkoposti(sahkoposti);
        }

        Integer affiliaatio = (Integer) attributes.get("affiliaatio");

        if (affiliaatio != null) {
            setAffiliaatio(affiliaatio);
        }

        String puhelin = (String) attributes.get("puhelin");

        if (puhelin != null) {
            setPuhelin(puhelin);
        }

        String titteli = (String) attributes.get("titteli");

        if (titteli != null) {
            setTitteli(titteli);
        }

        String etunimi = (String) attributes.get("etunimi");

        if (etunimi != null) {
            setEtunimi(etunimi);
        }

        String sukunimi = (String) attributes.get("sukunimi");

        if (sukunimi != null) {
            setSukunimi(sukunimi);
        }

        String URL = (String) attributes.get("URL");

        if (URL != null) {
            setURL(URL);
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
    public int getYhteystieto_id() {
        return _yhteystieto_id;
    }

    @Override
    public void setYhteystieto_id(int yhteystieto_id) {
        _yhteystieto_id = yhteystieto_id;

        if (_yhteystietoRemoteModel != null) {
            try {
                Class<?> clazz = _yhteystietoRemoteModel.getClass();

                Method method = clazz.getMethod("setYhteystieto_id", int.class);

                method.invoke(_yhteystietoRemoteModel, yhteystieto_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSahkoposti() {
        return _sahkoposti;
    }

    @Override
    public void setSahkoposti(String sahkoposti) {
        _sahkoposti = sahkoposti;

        if (_yhteystietoRemoteModel != null) {
            try {
                Class<?> clazz = _yhteystietoRemoteModel.getClass();

                Method method = clazz.getMethod("setSahkoposti", String.class);

                method.invoke(_yhteystietoRemoteModel, sahkoposti);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAffiliaatio() {
        return _affiliaatio;
    }

    @Override
    public void setAffiliaatio(int affiliaatio) {
        _affiliaatio = affiliaatio;

        if (_yhteystietoRemoteModel != null) {
            try {
                Class<?> clazz = _yhteystietoRemoteModel.getClass();

                Method method = clazz.getMethod("setAffiliaatio", int.class);

                method.invoke(_yhteystietoRemoteModel, affiliaatio);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPuhelin() {
        return _puhelin;
    }

    @Override
    public void setPuhelin(String puhelin) {
        _puhelin = puhelin;

        if (_yhteystietoRemoteModel != null) {
            try {
                Class<?> clazz = _yhteystietoRemoteModel.getClass();

                Method method = clazz.getMethod("setPuhelin", String.class);

                method.invoke(_yhteystietoRemoteModel, puhelin);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTitteli() {
        return _titteli;
    }

    @Override
    public void setTitteli(String titteli) {
        _titteli = titteli;

        if (_yhteystietoRemoteModel != null) {
            try {
                Class<?> clazz = _yhteystietoRemoteModel.getClass();

                Method method = clazz.getMethod("setTitteli", String.class);

                method.invoke(_yhteystietoRemoteModel, titteli);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEtunimi() {
        return _etunimi;
    }

    @Override
    public void setEtunimi(String etunimi) {
        _etunimi = etunimi;

        if (_yhteystietoRemoteModel != null) {
            try {
                Class<?> clazz = _yhteystietoRemoteModel.getClass();

                Method method = clazz.getMethod("setEtunimi", String.class);

                method.invoke(_yhteystietoRemoteModel, etunimi);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSukunimi() {
        return _sukunimi;
    }

    @Override
    public void setSukunimi(String sukunimi) {
        _sukunimi = sukunimi;

        if (_yhteystietoRemoteModel != null) {
            try {
                Class<?> clazz = _yhteystietoRemoteModel.getClass();

                Method method = clazz.getMethod("setSukunimi", String.class);

                method.invoke(_yhteystietoRemoteModel, sukunimi);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getURL() {
        return _URL;
    }

    @Override
    public void setURL(String URL) {
        _URL = URL;

        if (_yhteystietoRemoteModel != null) {
            try {
                Class<?> clazz = _yhteystietoRemoteModel.getClass();

                Method method = clazz.getMethod("setURL", String.class);

                method.invoke(_yhteystietoRemoteModel, URL);
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

        if (_yhteystietoRemoteModel != null) {
            try {
                Class<?> clazz = _yhteystietoRemoteModel.getClass();

                Method method = clazz.getMethod("setKuvaus", String.class);

                method.invoke(_yhteystietoRemoteModel, kuvaus);
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

        if (_yhteystietoRemoteModel != null) {
            try {
                Class<?> clazz = _yhteystietoRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription", String.class);

                method.invoke(_yhteystietoRemoteModel, description);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getYhteystietoRemoteModel() {
        return _yhteystietoRemoteModel;
    }

    public void setYhteystietoRemoteModel(BaseModel<?> yhteystietoRemoteModel) {
        _yhteystietoRemoteModel = yhteystietoRemoteModel;
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

        Class<?> remoteModelClass = _yhteystietoRemoteModel.getClass();

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

        Object returnValue = method.invoke(_yhteystietoRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            YhteystietoLocalServiceUtil.addYhteystieto(this);
        } else {
            YhteystietoLocalServiceUtil.updateYhteystieto(this);
        }
    }

    @Override
    public Yhteystieto toEscapedModel() {
        return (Yhteystieto) ProxyUtil.newProxyInstance(Yhteystieto.class.getClassLoader(),
            new Class[] { Yhteystieto.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        YhteystietoClp clone = new YhteystietoClp();

        clone.setYhteystieto_id(getYhteystieto_id());
        clone.setSahkoposti(getSahkoposti());
        clone.setAffiliaatio(getAffiliaatio());
        clone.setPuhelin(getPuhelin());
        clone.setTitteli(getTitteli());
        clone.setEtunimi(getEtunimi());
        clone.setSukunimi(getSukunimi());
        clone.setURL(getURL());
        clone.setKuvaus(getKuvaus());
        clone.setDescription(getDescription());

        return clone;
    }

    @Override
    public int compareTo(Yhteystieto yhteystieto) {
        int primaryKey = yhteystieto.getPrimaryKey();

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

        if (!(obj instanceof YhteystietoClp)) {
            return false;
        }

        YhteystietoClp yhteystieto = (YhteystietoClp) obj;

        int primaryKey = yhteystieto.getPrimaryKey();

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
        StringBundler sb = new StringBundler(21);

        sb.append("{yhteystieto_id=");
        sb.append(getYhteystieto_id());
        sb.append(", sahkoposti=");
        sb.append(getSahkoposti());
        sb.append(", affiliaatio=");
        sb.append(getAffiliaatio());
        sb.append(", puhelin=");
        sb.append(getPuhelin());
        sb.append(", titteli=");
        sb.append(getTitteli());
        sb.append(", etunimi=");
        sb.append(getEtunimi());
        sb.append(", sukunimi=");
        sb.append(getSukunimi());
        sb.append(", URL=");
        sb.append(getURL());
        sb.append(", kuvaus=");
        sb.append(getKuvaus());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.Yhteystieto");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>yhteystieto_id</column-name><column-value><![CDATA[");
        sb.append(getYhteystieto_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sahkoposti</column-name><column-value><![CDATA[");
        sb.append(getSahkoposti());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>affiliaatio</column-name><column-value><![CDATA[");
        sb.append(getAffiliaatio());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>puhelin</column-name><column-value><![CDATA[");
        sb.append(getPuhelin());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>titteli</column-name><column-value><![CDATA[");
        sb.append(getTitteli());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>etunimi</column-name><column-value><![CDATA[");
        sb.append(getEtunimi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sukunimi</column-name><column-value><![CDATA[");
        sb.append(getSukunimi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>URL</column-name><column-value><![CDATA[");
        sb.append(getURL());
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
