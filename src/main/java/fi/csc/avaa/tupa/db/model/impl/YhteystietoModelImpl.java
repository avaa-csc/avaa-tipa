package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.model.Yhteystieto;
import fi.csc.avaa.tupa.db.model.YhteystietoModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Yhteystieto service. Represents a row in the &quot;yhteystieto&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link fi.csc.avaa.tupa.db.model.YhteystietoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link YhteystietoImpl}.
 * </p>
 *
 * @author CSC
 * @see YhteystietoImpl
 * @see fi.csc.avaa.tupa.db.model.Yhteystieto
 * @see fi.csc.avaa.tupa.db.model.YhteystietoModel
 * @generated
 */
public class YhteystietoModelImpl extends BaseModelImpl<Yhteystieto>
    implements YhteystietoModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a yhteystieto model instance should use the {@link fi.csc.avaa.tupa.db.model.Yhteystieto} interface instead.
     */
    public static final String TABLE_NAME = "yhteystieto";
    public static final Object[][] TABLE_COLUMNS = {
            { "yhteystieto_id", Types.INTEGER },
            { "sahkoposti", Types.VARCHAR },
            { "affiliaatio", Types.INTEGER },
            { "puhelin", Types.VARCHAR },
            { "titteli", Types.VARCHAR },
            { "etunimi", Types.VARCHAR },
            { "sukunimi", Types.VARCHAR },
            { "URL", Types.VARCHAR },
            { "kuvaus", Types.VARCHAR },
            { "description", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table yhteystieto (yhteystieto_id INTEGER not null primary key,sahkoposti VARCHAR(75) null,affiliaatio INTEGER,puhelin VARCHAR(75) null,titteli VARCHAR(75) null,etunimi VARCHAR(75) null,sukunimi VARCHAR(75) null,URL VARCHAR(75) null,kuvaus VARCHAR(75) null,description VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table yhteystieto";
    public static final String ORDER_BY_JPQL = " ORDER BY yhteystieto.yhteystieto_id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY yhteystieto.yhteystieto_id ASC";
    public static final String DATA_SOURCE = "tupa";
    public static final String SESSION_FACTORY = "tupaSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.fi.csc.avaa.tupa.db.model.Yhteystieto"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.fi.csc.avaa.tupa.db.model.Yhteystieto"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.fi.csc.avaa.tupa.db.model.Yhteystieto"));
    private static ClassLoader _classLoader = Yhteystieto.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Yhteystieto.class
        };
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
    private Yhteystieto _escapedModel;

    public YhteystietoModelImpl() {
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
    public Class<?> getModelClass() {
        return Yhteystieto.class;
    }

    @Override
    public String getModelClassName() {
        return Yhteystieto.class.getName();
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
    }

    @Override
    public String getSahkoposti() {
        if (_sahkoposti == null) {
            return StringPool.BLANK;
        } else {
            return _sahkoposti;
        }
    }

    @Override
    public void setSahkoposti(String sahkoposti) {
        _sahkoposti = sahkoposti;
    }

    @Override
    public int getAffiliaatio() {
        return _affiliaatio;
    }

    @Override
    public void setAffiliaatio(int affiliaatio) {
        _affiliaatio = affiliaatio;
    }

    @Override
    public String getPuhelin() {
        if (_puhelin == null) {
            return StringPool.BLANK;
        } else {
            return _puhelin;
        }
    }

    @Override
    public void setPuhelin(String puhelin) {
        _puhelin = puhelin;
    }

    @Override
    public String getTitteli() {
        if (_titteli == null) {
            return StringPool.BLANK;
        } else {
            return _titteli;
        }
    }

    @Override
    public void setTitteli(String titteli) {
        _titteli = titteli;
    }

    @Override
    public String getEtunimi() {
        if (_etunimi == null) {
            return StringPool.BLANK;
        } else {
            return _etunimi;
        }
    }

    @Override
    public void setEtunimi(String etunimi) {
        _etunimi = etunimi;
    }

    @Override
    public String getSukunimi() {
        if (_sukunimi == null) {
            return StringPool.BLANK;
        } else {
            return _sukunimi;
        }
    }

    @Override
    public void setSukunimi(String sukunimi) {
        _sukunimi = sukunimi;
    }

    @Override
    public String getURL() {
        if (_URL == null) {
            return StringPool.BLANK;
        } else {
            return _URL;
        }
    }

    @Override
    public void setURL(String URL) {
        _URL = URL;
    }

    @Override
    public String getKuvaus() {
        if (_kuvaus == null) {
            return StringPool.BLANK;
        } else {
            return _kuvaus;
        }
    }

    @Override
    public void setKuvaus(String kuvaus) {
        _kuvaus = kuvaus;
    }

    @Override
    public String getDescription() {
        if (_description == null) {
            return StringPool.BLANK;
        } else {
            return _description;
        }
    }

    @Override
    public void setDescription(String description) {
        _description = description;
    }

    @Override
    public Yhteystieto toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Yhteystieto) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        YhteystietoImpl yhteystietoImpl = new YhteystietoImpl();

        yhteystietoImpl.setYhteystieto_id(getYhteystieto_id());
        yhteystietoImpl.setSahkoposti(getSahkoposti());
        yhteystietoImpl.setAffiliaatio(getAffiliaatio());
        yhteystietoImpl.setPuhelin(getPuhelin());
        yhteystietoImpl.setTitteli(getTitteli());
        yhteystietoImpl.setEtunimi(getEtunimi());
        yhteystietoImpl.setSukunimi(getSukunimi());
        yhteystietoImpl.setURL(getURL());
        yhteystietoImpl.setKuvaus(getKuvaus());
        yhteystietoImpl.setDescription(getDescription());

        yhteystietoImpl.resetOriginalValues();

        return yhteystietoImpl;
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

        if (!(obj instanceof Yhteystieto)) {
            return false;
        }

        Yhteystieto yhteystieto = (Yhteystieto) obj;

        int primaryKey = yhteystieto.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Yhteystieto> toCacheModel() {
        YhteystietoCacheModel yhteystietoCacheModel = new YhteystietoCacheModel();

        yhteystietoCacheModel.yhteystieto_id = getYhteystieto_id();

        yhteystietoCacheModel.sahkoposti = getSahkoposti();

        String sahkoposti = yhteystietoCacheModel.sahkoposti;

        if ((sahkoposti != null) && (sahkoposti.length() == 0)) {
            yhteystietoCacheModel.sahkoposti = null;
        }

        yhteystietoCacheModel.affiliaatio = getAffiliaatio();

        yhteystietoCacheModel.puhelin = getPuhelin();

        String puhelin = yhteystietoCacheModel.puhelin;

        if ((puhelin != null) && (puhelin.length() == 0)) {
            yhteystietoCacheModel.puhelin = null;
        }

        yhteystietoCacheModel.titteli = getTitteli();

        String titteli = yhteystietoCacheModel.titteli;

        if ((titteli != null) && (titteli.length() == 0)) {
            yhteystietoCacheModel.titteli = null;
        }

        yhteystietoCacheModel.etunimi = getEtunimi();

        String etunimi = yhteystietoCacheModel.etunimi;

        if ((etunimi != null) && (etunimi.length() == 0)) {
            yhteystietoCacheModel.etunimi = null;
        }

        yhteystietoCacheModel.sukunimi = getSukunimi();

        String sukunimi = yhteystietoCacheModel.sukunimi;

        if ((sukunimi != null) && (sukunimi.length() == 0)) {
            yhteystietoCacheModel.sukunimi = null;
        }

        yhteystietoCacheModel.URL = getURL();

        String URL = yhteystietoCacheModel.URL;

        if ((URL != null) && (URL.length() == 0)) {
            yhteystietoCacheModel.URL = null;
        }

        yhteystietoCacheModel.kuvaus = getKuvaus();

        String kuvaus = yhteystietoCacheModel.kuvaus;

        if ((kuvaus != null) && (kuvaus.length() == 0)) {
            yhteystietoCacheModel.kuvaus = null;
        }

        yhteystietoCacheModel.description = getDescription();

        String description = yhteystietoCacheModel.description;

        if ((description != null) && (description.length() == 0)) {
            yhteystietoCacheModel.description = null;
        }

        return yhteystietoCacheModel;
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
