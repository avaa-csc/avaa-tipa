package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.KayttoehtoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class KayttoehtoClp extends BaseModelImpl<Kayttoehto>
    implements Kayttoehto {
    private int _infra_id;
    private int _saavutettavuus;
    private int _anonymiteetti;
    private int _maksullisuus;
    private int _tulosten_julkaisuvelvoite;
    private int _tuotoksien_julkaisuvelvoite;
    private int _osaamisen_avoimuus;
    private int _seurantatyokalut;
    private int _tulosten_lisensointi;
    private String _URLfi;
    private String _URLen;
    private BaseModel<?> _kayttoehtoRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public KayttoehtoClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Kayttoehto.class;
    }

    @Override
    public String getModelClassName() {
        return Kayttoehto.class.getName();
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
        attributes.put("saavutettavuus", getSaavutettavuus());
        attributes.put("anonymiteetti", getAnonymiteetti());
        attributes.put("maksullisuus", getMaksullisuus());
        attributes.put("tulosten_julkaisuvelvoite",
            getTulosten_julkaisuvelvoite());
        attributes.put("tuotoksien_julkaisuvelvoite",
            getTuotoksien_julkaisuvelvoite());
        attributes.put("osaamisen_avoimuus", getOsaamisen_avoimuus());
        attributes.put("seurantatyokalut", getSeurantatyokalut());
        attributes.put("tulosten_lisensointi", getTulosten_lisensointi());
        attributes.put("URLfi", getURLfi());
        attributes.put("URLen", getURLen());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer infra_id = (Integer) attributes.get("infra_id");

        if (infra_id != null) {
            setInfra_id(infra_id);
        }

        Integer saavutettavuus = (Integer) attributes.get("saavutettavuus");

        if (saavutettavuus != null) {
            setSaavutettavuus(saavutettavuus);
        }

        Integer anonymiteetti = (Integer) attributes.get("anonymiteetti");

        if (anonymiteetti != null) {
            setAnonymiteetti(anonymiteetti);
        }

        Integer maksullisuus = (Integer) attributes.get("maksullisuus");

        if (maksullisuus != null) {
            setMaksullisuus(maksullisuus);
        }

        Integer tulosten_julkaisuvelvoite = (Integer) attributes.get(
                "tulosten_julkaisuvelvoite");

        if (tulosten_julkaisuvelvoite != null) {
            setTulosten_julkaisuvelvoite(tulosten_julkaisuvelvoite);
        }

        Integer tuotoksien_julkaisuvelvoite = (Integer) attributes.get(
                "tuotoksien_julkaisuvelvoite");

        if (tuotoksien_julkaisuvelvoite != null) {
            setTuotoksien_julkaisuvelvoite(tuotoksien_julkaisuvelvoite);
        }

        Integer osaamisen_avoimuus = (Integer) attributes.get(
                "osaamisen_avoimuus");

        if (osaamisen_avoimuus != null) {
            setOsaamisen_avoimuus(osaamisen_avoimuus);
        }

        Integer seurantatyokalut = (Integer) attributes.get("seurantatyokalut");

        if (seurantatyokalut != null) {
            setSeurantatyokalut(seurantatyokalut);
        }

        Integer tulosten_lisensointi = (Integer) attributes.get(
                "tulosten_lisensointi");

        if (tulosten_lisensointi != null) {
            setTulosten_lisensointi(tulosten_lisensointi);
        }

        String URLfi = (String) attributes.get("URLfi");

        if (URLfi != null) {
            setURLfi(URLfi);
        }

        String URLen = (String) attributes.get("URLen");

        if (URLen != null) {
            setURLen(URLen);
        }
    }

    @Override
    public int getInfra_id() {
        return _infra_id;
    }

    @Override
    public void setInfra_id(int infra_id) {
        _infra_id = infra_id;

        if (_kayttoehtoRemoteModel != null) {
            try {
                Class<?> clazz = _kayttoehtoRemoteModel.getClass();

                Method method = clazz.getMethod("setInfra_id", int.class);

                method.invoke(_kayttoehtoRemoteModel, infra_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getSaavutettavuus() {
        return _saavutettavuus;
    }

    @Override
    public void setSaavutettavuus(int saavutettavuus) {
        _saavutettavuus = saavutettavuus;

        if (_kayttoehtoRemoteModel != null) {
            try {
                Class<?> clazz = _kayttoehtoRemoteModel.getClass();

                Method method = clazz.getMethod("setSaavutettavuus", int.class);

                method.invoke(_kayttoehtoRemoteModel, saavutettavuus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAnonymiteetti() {
        return _anonymiteetti;
    }

    @Override
    public void setAnonymiteetti(int anonymiteetti) {
        _anonymiteetti = anonymiteetti;

        if (_kayttoehtoRemoteModel != null) {
            try {
                Class<?> clazz = _kayttoehtoRemoteModel.getClass();

                Method method = clazz.getMethod("setAnonymiteetti", int.class);

                method.invoke(_kayttoehtoRemoteModel, anonymiteetti);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getMaksullisuus() {
        return _maksullisuus;
    }

    @Override
    public void setMaksullisuus(int maksullisuus) {
        _maksullisuus = maksullisuus;

        if (_kayttoehtoRemoteModel != null) {
            try {
                Class<?> clazz = _kayttoehtoRemoteModel.getClass();

                Method method = clazz.getMethod("setMaksullisuus", int.class);

                method.invoke(_kayttoehtoRemoteModel, maksullisuus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTulosten_julkaisuvelvoite() {
        return _tulosten_julkaisuvelvoite;
    }

    @Override
    public void setTulosten_julkaisuvelvoite(int tulosten_julkaisuvelvoite) {
        _tulosten_julkaisuvelvoite = tulosten_julkaisuvelvoite;

        if (_kayttoehtoRemoteModel != null) {
            try {
                Class<?> clazz = _kayttoehtoRemoteModel.getClass();

                Method method = clazz.getMethod("setTulosten_julkaisuvelvoite",
                        int.class);

                method.invoke(_kayttoehtoRemoteModel, tulosten_julkaisuvelvoite);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTuotoksien_julkaisuvelvoite() {
        return _tuotoksien_julkaisuvelvoite;
    }

    @Override
    public void setTuotoksien_julkaisuvelvoite(int tuotoksien_julkaisuvelvoite) {
        _tuotoksien_julkaisuvelvoite = tuotoksien_julkaisuvelvoite;

        if (_kayttoehtoRemoteModel != null) {
            try {
                Class<?> clazz = _kayttoehtoRemoteModel.getClass();

                Method method = clazz.getMethod("setTuotoksien_julkaisuvelvoite",
                        int.class);

                method.invoke(_kayttoehtoRemoteModel,
                    tuotoksien_julkaisuvelvoite);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOsaamisen_avoimuus() {
        return _osaamisen_avoimuus;
    }

    @Override
    public void setOsaamisen_avoimuus(int osaamisen_avoimuus) {
        _osaamisen_avoimuus = osaamisen_avoimuus;

        if (_kayttoehtoRemoteModel != null) {
            try {
                Class<?> clazz = _kayttoehtoRemoteModel.getClass();

                Method method = clazz.getMethod("setOsaamisen_avoimuus",
                        int.class);

                method.invoke(_kayttoehtoRemoteModel, osaamisen_avoimuus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getSeurantatyokalut() {
        return _seurantatyokalut;
    }

    @Override
    public void setSeurantatyokalut(int seurantatyokalut) {
        _seurantatyokalut = seurantatyokalut;

        if (_kayttoehtoRemoteModel != null) {
            try {
                Class<?> clazz = _kayttoehtoRemoteModel.getClass();

                Method method = clazz.getMethod("setSeurantatyokalut", int.class);

                method.invoke(_kayttoehtoRemoteModel, seurantatyokalut);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTulosten_lisensointi() {
        return _tulosten_lisensointi;
    }

    @Override
    public void setTulosten_lisensointi(int tulosten_lisensointi) {
        _tulosten_lisensointi = tulosten_lisensointi;

        if (_kayttoehtoRemoteModel != null) {
            try {
                Class<?> clazz = _kayttoehtoRemoteModel.getClass();

                Method method = clazz.getMethod("setTulosten_lisensointi",
                        int.class);

                method.invoke(_kayttoehtoRemoteModel, tulosten_lisensointi);
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

        if (_kayttoehtoRemoteModel != null) {
            try {
                Class<?> clazz = _kayttoehtoRemoteModel.getClass();

                Method method = clazz.getMethod("setURLfi", String.class);

                method.invoke(_kayttoehtoRemoteModel, URLfi);
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

        if (_kayttoehtoRemoteModel != null) {
            try {
                Class<?> clazz = _kayttoehtoRemoteModel.getClass();

                Method method = clazz.getMethod("setURLen", String.class);

                method.invoke(_kayttoehtoRemoteModel, URLen);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getKayttoehtoRemoteModel() {
        return _kayttoehtoRemoteModel;
    }

    public void setKayttoehtoRemoteModel(BaseModel<?> kayttoehtoRemoteModel) {
        _kayttoehtoRemoteModel = kayttoehtoRemoteModel;
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

        Class<?> remoteModelClass = _kayttoehtoRemoteModel.getClass();

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

        Object returnValue = method.invoke(_kayttoehtoRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            KayttoehtoLocalServiceUtil.addKayttoehto(this);
        } else {
            KayttoehtoLocalServiceUtil.updateKayttoehto(this);
        }
    }

    @Override
    public Kayttoehto toEscapedModel() {
        return (Kayttoehto) ProxyUtil.newProxyInstance(Kayttoehto.class.getClassLoader(),
            new Class[] { Kayttoehto.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        KayttoehtoClp clone = new KayttoehtoClp();

        clone.setInfra_id(getInfra_id());
        clone.setSaavutettavuus(getSaavutettavuus());
        clone.setAnonymiteetti(getAnonymiteetti());
        clone.setMaksullisuus(getMaksullisuus());
        clone.setTulosten_julkaisuvelvoite(getTulosten_julkaisuvelvoite());
        clone.setTuotoksien_julkaisuvelvoite(getTuotoksien_julkaisuvelvoite());
        clone.setOsaamisen_avoimuus(getOsaamisen_avoimuus());
        clone.setSeurantatyokalut(getSeurantatyokalut());
        clone.setTulosten_lisensointi(getTulosten_lisensointi());
        clone.setURLfi(getURLfi());
        clone.setURLen(getURLen());

        return clone;
    }

    @Override
    public int compareTo(Kayttoehto kayttoehto) {
        int primaryKey = kayttoehto.getPrimaryKey();

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

        if (!(obj instanceof KayttoehtoClp)) {
            return false;
        }

        KayttoehtoClp kayttoehto = (KayttoehtoClp) obj;

        int primaryKey = kayttoehto.getPrimaryKey();

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
        StringBundler sb = new StringBundler(23);

        sb.append("{infra_id=");
        sb.append(getInfra_id());
        sb.append(", saavutettavuus=");
        sb.append(getSaavutettavuus());
        sb.append(", anonymiteetti=");
        sb.append(getAnonymiteetti());
        sb.append(", maksullisuus=");
        sb.append(getMaksullisuus());
        sb.append(", tulosten_julkaisuvelvoite=");
        sb.append(getTulosten_julkaisuvelvoite());
        sb.append(", tuotoksien_julkaisuvelvoite=");
        sb.append(getTuotoksien_julkaisuvelvoite());
        sb.append(", osaamisen_avoimuus=");
        sb.append(getOsaamisen_avoimuus());
        sb.append(", seurantatyokalut=");
        sb.append(getSeurantatyokalut());
        sb.append(", tulosten_lisensointi=");
        sb.append(getTulosten_lisensointi());
        sb.append(", URLfi=");
        sb.append(getURLfi());
        sb.append(", URLen=");
        sb.append(getURLen());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(37);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.Kayttoehto");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>infra_id</column-name><column-value><![CDATA[");
        sb.append(getInfra_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>saavutettavuus</column-name><column-value><![CDATA[");
        sb.append(getSaavutettavuus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>anonymiteetti</column-name><column-value><![CDATA[");
        sb.append(getAnonymiteetti());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>maksullisuus</column-name><column-value><![CDATA[");
        sb.append(getMaksullisuus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tulosten_julkaisuvelvoite</column-name><column-value><![CDATA[");
        sb.append(getTulosten_julkaisuvelvoite());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tuotoksien_julkaisuvelvoite</column-name><column-value><![CDATA[");
        sb.append(getTuotoksien_julkaisuvelvoite());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>osaamisen_avoimuus</column-name><column-value><![CDATA[");
        sb.append(getOsaamisen_avoimuus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>seurantatyokalut</column-name><column-value><![CDATA[");
        sb.append(getSeurantatyokalut());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tulosten_lisensointi</column-name><column-value><![CDATA[");
        sb.append(getTulosten_lisensointi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>URLfi</column-name><column-value><![CDATA[");
        sb.append(getURLfi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>URLen</column-name><column-value><![CDATA[");
        sb.append(getURLen());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
