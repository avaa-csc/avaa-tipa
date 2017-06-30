package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.PalveluLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class PalveluClp extends BaseModelImpl<Palvelu> implements Palvelu {
    private int _palvelu_id;
    private String _nimi;
    private String _name;
    private String _kuvaus;
    private String _description;
    private String _URLen;
    private String _URLfi;
    private int _paikkatyyppi;
    private String _katuosoite;
    private String _kaupunki;
    private double _lat;
    private double _lon;
    private BaseModel<?> _palveluRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public PalveluClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Palvelu.class;
    }

    @Override
    public String getModelClassName() {
        return Palvelu.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _palvelu_id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setPalvelu_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _palvelu_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("palvelu_id", getPalvelu_id());
        attributes.put("nimi", getNimi());
        attributes.put("name", getName());
        attributes.put("kuvaus", getKuvaus());
        attributes.put("description", getDescription());
        attributes.put("URLen", getURLen());
        attributes.put("URLfi", getURLfi());
        attributes.put("paikkatyyppi", getPaikkatyyppi());
        attributes.put("katuosoite", getKatuosoite());
        attributes.put("kaupunki", getKaupunki());
        attributes.put("lat", getLat());
        attributes.put("lon", getLon());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer palvelu_id = (Integer) attributes.get("palvelu_id");

        if (palvelu_id != null) {
            setPalvelu_id(palvelu_id);
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

        String URLen = (String) attributes.get("URLen");

        if (URLen != null) {
            setURLen(URLen);
        }

        String URLfi = (String) attributes.get("URLfi");

        if (URLfi != null) {
            setURLfi(URLfi);
        }

        Integer paikkatyyppi = (Integer) attributes.get("paikkatyyppi");

        if (paikkatyyppi != null) {
            setPaikkatyyppi(paikkatyyppi);
        }

        String katuosoite = (String) attributes.get("katuosoite");

        if (katuosoite != null) {
            setKatuosoite(katuosoite);
        }

        String kaupunki = (String) attributes.get("kaupunki");

        if (kaupunki != null) {
            setKaupunki(kaupunki);
        }

        Double lat = (Double) attributes.get("lat");

        if (lat != null) {
            setLat(lat);
        }

        Double lon = (Double) attributes.get("lon");

        if (lon != null) {
            setLon(lon);
        }
    }

    @Override
    public int getPalvelu_id() {
        return _palvelu_id;
    }

    @Override
    public void setPalvelu_id(int palvelu_id) {
        _palvelu_id = palvelu_id;

        if (_palveluRemoteModel != null) {
            try {
                Class<?> clazz = _palveluRemoteModel.getClass();

                Method method = clazz.getMethod("setPalvelu_id", int.class);

                method.invoke(_palveluRemoteModel, palvelu_id);
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

        if (_palveluRemoteModel != null) {
            try {
                Class<?> clazz = _palveluRemoteModel.getClass();

                Method method = clazz.getMethod("setNimi", String.class);

                method.invoke(_palveluRemoteModel, nimi);
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

        if (_palveluRemoteModel != null) {
            try {
                Class<?> clazz = _palveluRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_palveluRemoteModel, name);
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

        if (_palveluRemoteModel != null) {
            try {
                Class<?> clazz = _palveluRemoteModel.getClass();

                Method method = clazz.getMethod("setKuvaus", String.class);

                method.invoke(_palveluRemoteModel, kuvaus);
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

        if (_palveluRemoteModel != null) {
            try {
                Class<?> clazz = _palveluRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription", String.class);

                method.invoke(_palveluRemoteModel, description);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getURLen() {
        return _URLen;
    }

    @Override
    public void setURLen(String URLen) {
        _URLen = URLen;

        if (_palveluRemoteModel != null) {
            try {
                Class<?> clazz = _palveluRemoteModel.getClass();

                Method method = clazz.getMethod("setURLen", String.class);

                method.invoke(_palveluRemoteModel, URLen);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getURLfi() {
        return _URLfi;
    }

    @Override
    public void setURLfi(String URLfi) {
        _URLfi = URLfi;

        if (_palveluRemoteModel != null) {
            try {
                Class<?> clazz = _palveluRemoteModel.getClass();

                Method method = clazz.getMethod("setURLfi", String.class);

                method.invoke(_palveluRemoteModel, URLfi);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPaikkatyyppi() {
        return _paikkatyyppi;
    }

    @Override
    public void setPaikkatyyppi(int paikkatyyppi) {
        _paikkatyyppi = paikkatyyppi;

        if (_palveluRemoteModel != null) {
            try {
                Class<?> clazz = _palveluRemoteModel.getClass();

                Method method = clazz.getMethod("setPaikkatyyppi", int.class);

                method.invoke(_palveluRemoteModel, paikkatyyppi);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKatuosoite() {
        return _katuosoite;
    }

    @Override
    public void setKatuosoite(String katuosoite) {
        _katuosoite = katuosoite;

        if (_palveluRemoteModel != null) {
            try {
                Class<?> clazz = _palveluRemoteModel.getClass();

                Method method = clazz.getMethod("setKatuosoite", String.class);

                method.invoke(_palveluRemoteModel, katuosoite);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKaupunki() {
        return _kaupunki;
    }

    @Override
    public void setKaupunki(String kaupunki) {
        _kaupunki = kaupunki;

        if (_palveluRemoteModel != null) {
            try {
                Class<?> clazz = _palveluRemoteModel.getClass();

                Method method = clazz.getMethod("setKaupunki", String.class);

                method.invoke(_palveluRemoteModel, kaupunki);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getLat() {
        return _lat;
    }

    @Override
    public void setLat(double lat) {
        _lat = lat;

        if (_palveluRemoteModel != null) {
            try {
                Class<?> clazz = _palveluRemoteModel.getClass();

                Method method = clazz.getMethod("setLat", double.class);

                method.invoke(_palveluRemoteModel, lat);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getLon() {
        return _lon;
    }

    @Override
    public void setLon(double lon) {
        _lon = lon;

        if (_palveluRemoteModel != null) {
            try {
                Class<?> clazz = _palveluRemoteModel.getClass();

                Method method = clazz.getMethod("setLon", double.class);

                method.invoke(_palveluRemoteModel, lon);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPalveluRemoteModel() {
        return _palveluRemoteModel;
    }

    public void setPalveluRemoteModel(BaseModel<?> palveluRemoteModel) {
        _palveluRemoteModel = palveluRemoteModel;
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

        Class<?> remoteModelClass = _palveluRemoteModel.getClass();

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

        Object returnValue = method.invoke(_palveluRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PalveluLocalServiceUtil.addPalvelu(this);
        } else {
            PalveluLocalServiceUtil.updatePalvelu(this);
        }
    }

    @Override
    public Palvelu toEscapedModel() {
        return (Palvelu) ProxyUtil.newProxyInstance(Palvelu.class.getClassLoader(),
            new Class[] { Palvelu.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PalveluClp clone = new PalveluClp();

        clone.setPalvelu_id(getPalvelu_id());
        clone.setNimi(getNimi());
        clone.setName(getName());
        clone.setKuvaus(getKuvaus());
        clone.setDescription(getDescription());
        clone.setURLen(getURLen());
        clone.setURLfi(getURLfi());
        clone.setPaikkatyyppi(getPaikkatyyppi());
        clone.setKatuosoite(getKatuosoite());
        clone.setKaupunki(getKaupunki());
        clone.setLat(getLat());
        clone.setLon(getLon());

        return clone;
    }

    @Override
    public int compareTo(Palvelu palvelu) {
        int primaryKey = palvelu.getPrimaryKey();

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

        if (!(obj instanceof PalveluClp)) {
            return false;
        }

        PalveluClp palvelu = (PalveluClp) obj;

        int primaryKey = palvelu.getPrimaryKey();

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
        StringBundler sb = new StringBundler(25);

        sb.append("{palvelu_id=");
        sb.append(getPalvelu_id());
        sb.append(", nimi=");
        sb.append(getNimi());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", kuvaus=");
        sb.append(getKuvaus());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", URLen=");
        sb.append(getURLen());
        sb.append(", URLfi=");
        sb.append(getURLfi());
        sb.append(", paikkatyyppi=");
        sb.append(getPaikkatyyppi());
        sb.append(", katuosoite=");
        sb.append(getKatuosoite());
        sb.append(", kaupunki=");
        sb.append(getKaupunki());
        sb.append(", lat=");
        sb.append(getLat());
        sb.append(", lon=");
        sb.append(getLon());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.Palvelu");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>palvelu_id</column-name><column-value><![CDATA[");
        sb.append(getPalvelu_id());
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
        sb.append(
            "<column><column-name>URLen</column-name><column-value><![CDATA[");
        sb.append(getURLen());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>URLfi</column-name><column-value><![CDATA[");
        sb.append(getURLfi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>paikkatyyppi</column-name><column-value><![CDATA[");
        sb.append(getPaikkatyyppi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>katuosoite</column-name><column-value><![CDATA[");
        sb.append(getKatuosoite());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kaupunki</column-name><column-value><![CDATA[");
        sb.append(getKaupunki());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lat</column-name><column-value><![CDATA[");
        sb.append(getLat());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lon</column-name><column-value><![CDATA[");
        sb.append(getLon());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
