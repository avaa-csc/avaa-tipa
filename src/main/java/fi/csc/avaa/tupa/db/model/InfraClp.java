package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.InfraLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class InfraClp extends BaseModelImpl<Infra> implements Infra {
    private int _infra_id;
    private String _ISNI;
    private boolean _aktiivinen;
    private int _valmistelu_aloitusvuosi;
    private int _rakennus_aloitusvuosi;
    private int _toiminta_aloitusvuosi;
    private int _toiminta_lopetusvuosi;
    private String _nimi;
    private String _name;
    private String _lyhenne;
    private String _acronym;
    private int _edellinen_infra;
    private String _kuvaus;
    private String _description;
    private String _logo_url;
    private String _image_url;
    private Date _api_date;
    private BaseModel<?> _infraRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public InfraClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Infra.class;
    }

    @Override
    public String getModelClassName() {
        return Infra.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _infra_id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setInfra_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _infra_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("infra_id", getInfra_id());
        attributes.put("ISNI", getISNI());
        attributes.put("aktiivinen", getAktiivinen());
        attributes.put("valmistelu_aloitusvuosi", getValmistelu_aloitusvuosi());
        attributes.put("rakennus_aloitusvuosi", getRakennus_aloitusvuosi());
        attributes.put("toiminta_aloitusvuosi", getToiminta_aloitusvuosi());
        attributes.put("toiminta_lopetusvuosi", getToiminta_lopetusvuosi());
        attributes.put("nimi", getNimi());
        attributes.put("name", getName());
        attributes.put("lyhenne", getLyhenne());
        attributes.put("acronym", getAcronym());
        attributes.put("edellinen_infra", getEdellinen_infra());
        attributes.put("kuvaus", getKuvaus());
        attributes.put("description", getDescription());
        attributes.put("logo_url", getLogo_url());
        attributes.put("image_url", getImage_url());
        attributes.put("api_date", getApi_date());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer infra_id = (Integer) attributes.get("infra_id");

        if (infra_id != null) {
            setInfra_id(infra_id);
        }

        String ISNI = (String) attributes.get("ISNI");

        if (ISNI != null) {
            setISNI(ISNI);
        }

        Boolean aktiivinen = (Boolean) attributes.get("aktiivinen");

        if (aktiivinen != null) {
            setAktiivinen(aktiivinen);
        }

        Integer valmistelu_aloitusvuosi = (Integer) attributes.get(
                "valmistelu_aloitusvuosi");

        if (valmistelu_aloitusvuosi != null) {
            setValmistelu_aloitusvuosi(valmistelu_aloitusvuosi);
        }

        Integer rakennus_aloitusvuosi = (Integer) attributes.get(
                "rakennus_aloitusvuosi");

        if (rakennus_aloitusvuosi != null) {
            setRakennus_aloitusvuosi(rakennus_aloitusvuosi);
        }

        Integer toiminta_aloitusvuosi = (Integer) attributes.get(
                "toiminta_aloitusvuosi");

        if (toiminta_aloitusvuosi != null) {
            setToiminta_aloitusvuosi(toiminta_aloitusvuosi);
        }

        Integer toiminta_lopetusvuosi = (Integer) attributes.get(
                "toiminta_lopetusvuosi");

        if (toiminta_lopetusvuosi != null) {
            setToiminta_lopetusvuosi(toiminta_lopetusvuosi);
        }

        String nimi = (String) attributes.get("nimi");

        if (nimi != null) {
            setNimi(nimi);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String lyhenne = (String) attributes.get("lyhenne");

        if (lyhenne != null) {
            setLyhenne(lyhenne);
        }

        String acronym = (String) attributes.get("acronym");

        if (acronym != null) {
            setAcronym(acronym);
        }

        Integer edellinen_infra = (Integer) attributes.get("edellinen_infra");

        if (edellinen_infra != null) {
            setEdellinen_infra(edellinen_infra);
        }

        String kuvaus = (String) attributes.get("kuvaus");

        if (kuvaus != null) {
            setKuvaus(kuvaus);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        String logo_url = (String) attributes.get("logo_url");

        if (logo_url != null) {
            setLogo_url(logo_url);
        }

        String image_url = (String) attributes.get("image_url");

        if (image_url != null) {
            setImage_url(image_url);
        }

        Date api_date = (Date) attributes.get("api_date");

        if (api_date != null) {
            setApi_date(api_date);
        }
    }

    @Override
    public int getInfra_id() {
        return _infra_id;
    }

    @Override
    public void setInfra_id(int infra_id) {
        _infra_id = infra_id;

        if (_infraRemoteModel != null) {
            try {
                Class<?> clazz = _infraRemoteModel.getClass();

                Method method = clazz.getMethod("setInfra_id", int.class);

                method.invoke(_infraRemoteModel, infra_id);
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

        if (_infraRemoteModel != null) {
            try {
                Class<?> clazz = _infraRemoteModel.getClass();

                Method method = clazz.getMethod("setISNI", String.class);

                method.invoke(_infraRemoteModel, ISNI);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getAktiivinen() {
        return _aktiivinen;
    }

    @Override
    public boolean isAktiivinen() {
        return _aktiivinen;
    }

    @Override
    public void setAktiivinen(boolean aktiivinen) {
        _aktiivinen = aktiivinen;

        if (_infraRemoteModel != null) {
            try {
                Class<?> clazz = _infraRemoteModel.getClass();

                Method method = clazz.getMethod("setAktiivinen", boolean.class);

                method.invoke(_infraRemoteModel, aktiivinen);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getValmistelu_aloitusvuosi() {
        return _valmistelu_aloitusvuosi;
    }

    @Override
    public void setValmistelu_aloitusvuosi(int valmistelu_aloitusvuosi) {
        _valmistelu_aloitusvuosi = valmistelu_aloitusvuosi;

        if (_infraRemoteModel != null) {
            try {
                Class<?> clazz = _infraRemoteModel.getClass();

                Method method = clazz.getMethod("setValmistelu_aloitusvuosi",
                        int.class);

                method.invoke(_infraRemoteModel, valmistelu_aloitusvuosi);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getRakennus_aloitusvuosi() {
        return _rakennus_aloitusvuosi;
    }

    @Override
    public void setRakennus_aloitusvuosi(int rakennus_aloitusvuosi) {
        _rakennus_aloitusvuosi = rakennus_aloitusvuosi;

        if (_infraRemoteModel != null) {
            try {
                Class<?> clazz = _infraRemoteModel.getClass();

                Method method = clazz.getMethod("setRakennus_aloitusvuosi",
                        int.class);

                method.invoke(_infraRemoteModel, rakennus_aloitusvuosi);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getToiminta_aloitusvuosi() {
        return _toiminta_aloitusvuosi;
    }

    @Override
    public void setToiminta_aloitusvuosi(int toiminta_aloitusvuosi) {
        _toiminta_aloitusvuosi = toiminta_aloitusvuosi;

        if (_infraRemoteModel != null) {
            try {
                Class<?> clazz = _infraRemoteModel.getClass();

                Method method = clazz.getMethod("setToiminta_aloitusvuosi",
                        int.class);

                method.invoke(_infraRemoteModel, toiminta_aloitusvuosi);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getToiminta_lopetusvuosi() {
        return _toiminta_lopetusvuosi;
    }

    @Override
    public void setToiminta_lopetusvuosi(int toiminta_lopetusvuosi) {
        _toiminta_lopetusvuosi = toiminta_lopetusvuosi;

        if (_infraRemoteModel != null) {
            try {
                Class<?> clazz = _infraRemoteModel.getClass();

                Method method = clazz.getMethod("setToiminta_lopetusvuosi",
                        int.class);

                method.invoke(_infraRemoteModel, toiminta_lopetusvuosi);
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

        if (_infraRemoteModel != null) {
            try {
                Class<?> clazz = _infraRemoteModel.getClass();

                Method method = clazz.getMethod("setNimi", String.class);

                method.invoke(_infraRemoteModel, nimi);
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

        if (_infraRemoteModel != null) {
            try {
                Class<?> clazz = _infraRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_infraRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLyhenne() {
        return _lyhenne;
    }

    @Override
    public void setLyhenne(String lyhenne) {
        _lyhenne = lyhenne;

        if (_infraRemoteModel != null) {
            try {
                Class<?> clazz = _infraRemoteModel.getClass();

                Method method = clazz.getMethod("setLyhenne", String.class);

                method.invoke(_infraRemoteModel, lyhenne);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAcronym() {
        return _acronym;
    }

    @Override
    public void setAcronym(String acronym) {
        _acronym = acronym;

        if (_infraRemoteModel != null) {
            try {
                Class<?> clazz = _infraRemoteModel.getClass();

                Method method = clazz.getMethod("setAcronym", String.class);

                method.invoke(_infraRemoteModel, acronym);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getEdellinen_infra() {
        return _edellinen_infra;
    }

    @Override
    public void setEdellinen_infra(int edellinen_infra) {
        _edellinen_infra = edellinen_infra;

        if (_infraRemoteModel != null) {
            try {
                Class<?> clazz = _infraRemoteModel.getClass();

                Method method = clazz.getMethod("setEdellinen_infra", int.class);

                method.invoke(_infraRemoteModel, edellinen_infra);
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

        if (_infraRemoteModel != null) {
            try {
                Class<?> clazz = _infraRemoteModel.getClass();

                Method method = clazz.getMethod("setKuvaus", String.class);

                method.invoke(_infraRemoteModel, kuvaus);
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

        if (_infraRemoteModel != null) {
            try {
                Class<?> clazz = _infraRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription", String.class);

                method.invoke(_infraRemoteModel, description);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLogo_url() {
        return _logo_url;
    }

    @Override
    public void setLogo_url(String logo_url) {
        _logo_url = logo_url;

        if (_infraRemoteModel != null) {
            try {
                Class<?> clazz = _infraRemoteModel.getClass();

                Method method = clazz.getMethod("setLogo_url", String.class);

                method.invoke(_infraRemoteModel, logo_url);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getImage_url() {
        return _image_url;
    }

    @Override
    public void setImage_url(String image_url) {
        _image_url = image_url;

        if (_infraRemoteModel != null) {
            try {
                Class<?> clazz = _infraRemoteModel.getClass();

                Method method = clazz.getMethod("setImage_url", String.class);

                method.invoke(_infraRemoteModel, image_url);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getApi_date() {
        return _api_date;
    }

    @Override
    public void setApi_date(Date api_date) {
        _api_date = api_date;

        if (_infraRemoteModel != null) {
            try {
                Class<?> clazz = _infraRemoteModel.getClass();

                Method method = clazz.getMethod("setApi_date", Date.class);

                method.invoke(_infraRemoteModel, api_date);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public void setURN(java.lang.String URN) {
        try {
            String methodName = "setURN";

            Class<?>[] parameterTypes = new Class<?>[] { java.lang.String.class };

            Object[] parameterValues = new Object[] { URN };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getURN() {
        try {
            String methodName = "getURN";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public BaseModel<?> getInfraRemoteModel() {
        return _infraRemoteModel;
    }

    public void setInfraRemoteModel(BaseModel<?> infraRemoteModel) {
        _infraRemoteModel = infraRemoteModel;
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

        Class<?> remoteModelClass = _infraRemoteModel.getClass();

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

        Object returnValue = method.invoke(_infraRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            InfraLocalServiceUtil.addInfra(this);
        } else {
            InfraLocalServiceUtil.updateInfra(this);
        }
    }

    @Override
    public Infra toEscapedModel() {
        return (Infra) ProxyUtil.newProxyInstance(Infra.class.getClassLoader(),
            new Class[] { Infra.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        InfraClp clone = new InfraClp();

        clone.setInfra_id(getInfra_id());
        clone.setISNI(getISNI());
        clone.setAktiivinen(getAktiivinen());
        clone.setValmistelu_aloitusvuosi(getValmistelu_aloitusvuosi());
        clone.setRakennus_aloitusvuosi(getRakennus_aloitusvuosi());
        clone.setToiminta_aloitusvuosi(getToiminta_aloitusvuosi());
        clone.setToiminta_lopetusvuosi(getToiminta_lopetusvuosi());
        clone.setNimi(getNimi());
        clone.setName(getName());
        clone.setLyhenne(getLyhenne());
        clone.setAcronym(getAcronym());
        clone.setEdellinen_infra(getEdellinen_infra());
        clone.setKuvaus(getKuvaus());
        clone.setDescription(getDescription());
        clone.setLogo_url(getLogo_url());
        clone.setImage_url(getImage_url());
        clone.setApi_date(getApi_date());

        return clone;
    }

    @Override
    public int compareTo(Infra infra) {
        int primaryKey = infra.getPrimaryKey();

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

        if (!(obj instanceof InfraClp)) {
            return false;
        }

        InfraClp infra = (InfraClp) obj;

        int primaryKey = infra.getPrimaryKey();

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
        StringBundler sb = new StringBundler(35);

        sb.append("{infra_id=");
        sb.append(getInfra_id());
        sb.append(", ISNI=");
        sb.append(getISNI());
        sb.append(", aktiivinen=");
        sb.append(getAktiivinen());
        sb.append(", valmistelu_aloitusvuosi=");
        sb.append(getValmistelu_aloitusvuosi());
        sb.append(", rakennus_aloitusvuosi=");
        sb.append(getRakennus_aloitusvuosi());
        sb.append(", toiminta_aloitusvuosi=");
        sb.append(getToiminta_aloitusvuosi());
        sb.append(", toiminta_lopetusvuosi=");
        sb.append(getToiminta_lopetusvuosi());
        sb.append(", nimi=");
        sb.append(getNimi());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", lyhenne=");
        sb.append(getLyhenne());
        sb.append(", acronym=");
        sb.append(getAcronym());
        sb.append(", edellinen_infra=");
        sb.append(getEdellinen_infra());
        sb.append(", kuvaus=");
        sb.append(getKuvaus());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", logo_url=");
        sb.append(getLogo_url());
        sb.append(", image_url=");
        sb.append(getImage_url());
        sb.append(", api_date=");
        sb.append(getApi_date());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(55);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.Infra");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>infra_id</column-name><column-value><![CDATA[");
        sb.append(getInfra_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ISNI</column-name><column-value><![CDATA[");
        sb.append(getISNI());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>aktiivinen</column-name><column-value><![CDATA[");
        sb.append(getAktiivinen());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>valmistelu_aloitusvuosi</column-name><column-value><![CDATA[");
        sb.append(getValmistelu_aloitusvuosi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rakennus_aloitusvuosi</column-name><column-value><![CDATA[");
        sb.append(getRakennus_aloitusvuosi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>toiminta_aloitusvuosi</column-name><column-value><![CDATA[");
        sb.append(getToiminta_aloitusvuosi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>toiminta_lopetusvuosi</column-name><column-value><![CDATA[");
        sb.append(getToiminta_lopetusvuosi());
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
            "<column><column-name>lyhenne</column-name><column-value><![CDATA[");
        sb.append(getLyhenne());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>acronym</column-name><column-value><![CDATA[");
        sb.append(getAcronym());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>edellinen_infra</column-name><column-value><![CDATA[");
        sb.append(getEdellinen_infra());
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
            "<column><column-name>logo_url</column-name><column-value><![CDATA[");
        sb.append(getLogo_url());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>image_url</column-name><column-value><![CDATA[");
        sb.append(getImage_url());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>api_date</column-name><column-value><![CDATA[");
        sb.append(getApi_date());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
