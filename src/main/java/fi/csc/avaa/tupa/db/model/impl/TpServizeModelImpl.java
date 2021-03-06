package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.model.TpServize;
import fi.csc.avaa.tupa.db.model.TpServizeModel;
import fi.csc.avaa.tupa.db.model.TpServizeSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TpServize service. Represents a row in the &quot;tupa_TpServize&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link fi.csc.avaa.tupa.db.model.TpServizeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TpServizeImpl}.
 * </p>
 *
 * @author CSC
 * @see TpServizeImpl
 * @see fi.csc.avaa.tupa.db.model.TpServize
 * @see fi.csc.avaa.tupa.db.model.TpServizeModel
 * @generated
 */
@JSON(strict = true)
public class TpServizeModelImpl extends BaseModelImpl<TpServize>
    implements TpServizeModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a tp servize model instance should use the {@link fi.csc.avaa.tupa.db.model.TpServize} interface instead.
     */
    public static final String TABLE_NAME = "tupa_TpServize";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.INTEGER },
            { "name_EN", Types.VARCHAR },
            { "name_FI", Types.VARCHAR },
            { "description_EN", Types.VARCHAR },
            { "description_FI", Types.VARCHAR },
            { "url", Types.VARCHAR },
            { "address", Types.VARCHAR },
            { "city", Types.VARCHAR },
            { "lat", Types.DOUBLE },
            { "lon", Types.DOUBLE }
        };
    public static final String TABLE_SQL_CREATE = "create table tupa_TpServize (id_ INTEGER not null primary key,name_EN VARCHAR(75) null,name_FI VARCHAR(75) null,description_EN VARCHAR(75) null,description_FI VARCHAR(75) null,url VARCHAR(75) null,address VARCHAR(75) null,city VARCHAR(75) null,lat DOUBLE,lon DOUBLE)";
    public static final String TABLE_SQL_DROP = "drop table tupa_TpServize";
    public static final String ORDER_BY_JPQL = " ORDER BY tpServize.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY tupa_TpServize.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.fi.csc.avaa.tupa.db.model.TpServize"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.fi.csc.avaa.tupa.db.model.TpServize"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.fi.csc.avaa.tupa.db.model.TpServize"));
    private static ClassLoader _classLoader = TpServize.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            TpServize.class
        };
    private int _id;
    private String _name_EN;
    private String _name_FI;
    private String _description_EN;
    private String _description_FI;
    private String _url;
    private String _address;
    private String _city;
    private double _lat;
    private double _lon;
    private TpServize _escapedModel;

    public TpServizeModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static TpServize toModel(TpServizeSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        TpServize model = new TpServizeImpl();

        model.setId(soapModel.getId());
        model.setName_EN(soapModel.getName_EN());
        model.setName_FI(soapModel.getName_FI());
        model.setDescription_EN(soapModel.getDescription_EN());
        model.setDescription_FI(soapModel.getDescription_FI());
        model.setUrl(soapModel.getUrl());
        model.setAddress(soapModel.getAddress());
        model.setCity(soapModel.getCity());
        model.setLat(soapModel.getLat());
        model.setLon(soapModel.getLon());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<TpServize> toModels(TpServizeSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<TpServize> models = new ArrayList<TpServize>(soapModels.length);

        for (TpServizeSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public int getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Class<?> getModelClass() {
        return TpServize.class;
    }

    @Override
    public String getModelClassName() {
        return TpServize.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("name_EN", getName_EN());
        attributes.put("name_FI", getName_FI());
        attributes.put("description_EN", getDescription_EN());
        attributes.put("description_FI", getDescription_FI());
        attributes.put("url", getUrl());
        attributes.put("address", getAddress());
        attributes.put("city", getCity());
        attributes.put("lat", getLat());
        attributes.put("lon", getLon());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer id = (Integer) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String name_EN = (String) attributes.get("name_EN");

        if (name_EN != null) {
            setName_EN(name_EN);
        }

        String name_FI = (String) attributes.get("name_FI");

        if (name_FI != null) {
            setName_FI(name_FI);
        }

        String description_EN = (String) attributes.get("description_EN");

        if (description_EN != null) {
            setDescription_EN(description_EN);
        }

        String description_FI = (String) attributes.get("description_FI");

        if (description_FI != null) {
            setDescription_FI(description_FI);
        }

        String url = (String) attributes.get("url");

        if (url != null) {
            setUrl(url);
        }

        String address = (String) attributes.get("address");

        if (address != null) {
            setAddress(address);
        }

        String city = (String) attributes.get("city");

        if (city != null) {
            setCity(city);
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

    @JSON
    @Override
    public int getId() {
        return _id;
    }

    @Override
    public void setId(int id) {
        _id = id;
    }

    @JSON
    @Override
    public String getName_EN() {
        if (_name_EN == null) {
            return StringPool.BLANK;
        } else {
            return _name_EN;
        }
    }

    @Override
    public void setName_EN(String name_EN) {
        _name_EN = name_EN;
    }

    @JSON
    @Override
    public String getName_FI() {
        if (_name_FI == null) {
            return StringPool.BLANK;
        } else {
            return _name_FI;
        }
    }

    @Override
    public void setName_FI(String name_FI) {
        _name_FI = name_FI;
    }

    @JSON
    @Override
    public String getDescription_EN() {
        if (_description_EN == null) {
            return StringPool.BLANK;
        } else {
            return _description_EN;
        }
    }

    @Override
    public void setDescription_EN(String description_EN) {
        _description_EN = description_EN;
    }

    @JSON
    @Override
    public String getDescription_FI() {
        if (_description_FI == null) {
            return StringPool.BLANK;
        } else {
            return _description_FI;
        }
    }

    @Override
    public void setDescription_FI(String description_FI) {
        _description_FI = description_FI;
    }

    @JSON
    @Override
    public String getUrl() {
        if (_url == null) {
            return StringPool.BLANK;
        } else {
            return _url;
        }
    }

    @Override
    public void setUrl(String url) {
        _url = url;
    }

    @JSON
    @Override
    public String getAddress() {
        if (_address == null) {
            return StringPool.BLANK;
        } else {
            return _address;
        }
    }

    @Override
    public void setAddress(String address) {
        _address = address;
    }

    @JSON
    @Override
    public String getCity() {
        if (_city == null) {
            return StringPool.BLANK;
        } else {
            return _city;
        }
    }

    @Override
    public void setCity(String city) {
        _city = city;
    }

    @JSON
    @Override
    public double getLat() {
        return _lat;
    }

    @Override
    public void setLat(double lat) {
        _lat = lat;
    }

    @JSON
    @Override
    public double getLon() {
        return _lon;
    }

    @Override
    public void setLon(double lon) {
        _lon = lon;
    }

    @Override
    public TpServize toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (TpServize) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        TpServizeImpl tpServizeImpl = new TpServizeImpl();

        tpServizeImpl.setId(getId());
        tpServizeImpl.setName_EN(getName_EN());
        tpServizeImpl.setName_FI(getName_FI());
        tpServizeImpl.setDescription_EN(getDescription_EN());
        tpServizeImpl.setDescription_FI(getDescription_FI());
        tpServizeImpl.setUrl(getUrl());
        tpServizeImpl.setAddress(getAddress());
        tpServizeImpl.setCity(getCity());
        tpServizeImpl.setLat(getLat());
        tpServizeImpl.setLon(getLon());

        tpServizeImpl.resetOriginalValues();

        return tpServizeImpl;
    }

    @Override
    public int compareTo(TpServize tpServize) {
        int primaryKey = tpServize.getPrimaryKey();

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

        if (!(obj instanceof TpServize)) {
            return false;
        }

        TpServize tpServize = (TpServize) obj;

        int primaryKey = tpServize.getPrimaryKey();

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
    public CacheModel<TpServize> toCacheModel() {
        TpServizeCacheModel tpServizeCacheModel = new TpServizeCacheModel();

        tpServizeCacheModel.id = getId();

        tpServizeCacheModel.name_EN = getName_EN();

        String name_EN = tpServizeCacheModel.name_EN;

        if ((name_EN != null) && (name_EN.length() == 0)) {
            tpServizeCacheModel.name_EN = null;
        }

        tpServizeCacheModel.name_FI = getName_FI();

        String name_FI = tpServizeCacheModel.name_FI;

        if ((name_FI != null) && (name_FI.length() == 0)) {
            tpServizeCacheModel.name_FI = null;
        }

        tpServizeCacheModel.description_EN = getDescription_EN();

        String description_EN = tpServizeCacheModel.description_EN;

        if ((description_EN != null) && (description_EN.length() == 0)) {
            tpServizeCacheModel.description_EN = null;
        }

        tpServizeCacheModel.description_FI = getDescription_FI();

        String description_FI = tpServizeCacheModel.description_FI;

        if ((description_FI != null) && (description_FI.length() == 0)) {
            tpServizeCacheModel.description_FI = null;
        }

        tpServizeCacheModel.url = getUrl();

        String url = tpServizeCacheModel.url;

        if ((url != null) && (url.length() == 0)) {
            tpServizeCacheModel.url = null;
        }

        tpServizeCacheModel.address = getAddress();

        String address = tpServizeCacheModel.address;

        if ((address != null) && (address.length() == 0)) {
            tpServizeCacheModel.address = null;
        }

        tpServizeCacheModel.city = getCity();

        String city = tpServizeCacheModel.city;

        if ((city != null) && (city.length() == 0)) {
            tpServizeCacheModel.city = null;
        }

        tpServizeCacheModel.lat = getLat();

        tpServizeCacheModel.lon = getLon();

        return tpServizeCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", name_EN=");
        sb.append(getName_EN());
        sb.append(", name_FI=");
        sb.append(getName_FI());
        sb.append(", description_EN=");
        sb.append(getDescription_EN());
        sb.append(", description_FI=");
        sb.append(getDescription_FI());
        sb.append(", url=");
        sb.append(getUrl());
        sb.append(", address=");
        sb.append(getAddress());
        sb.append(", city=");
        sb.append(getCity());
        sb.append(", lat=");
        sb.append(getLat());
        sb.append(", lon=");
        sb.append(getLon());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.TpServize");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name_EN</column-name><column-value><![CDATA[");
        sb.append(getName_EN());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name_FI</column-name><column-value><![CDATA[");
        sb.append(getName_FI());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description_EN</column-name><column-value><![CDATA[");
        sb.append(getDescription_EN());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description_FI</column-name><column-value><![CDATA[");
        sb.append(getDescription_FI());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>url</column-name><column-value><![CDATA[");
        sb.append(getUrl());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>address</column-name><column-value><![CDATA[");
        sb.append(getAddress());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>city</column-name><column-value><![CDATA[");
        sb.append(getCity());
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
