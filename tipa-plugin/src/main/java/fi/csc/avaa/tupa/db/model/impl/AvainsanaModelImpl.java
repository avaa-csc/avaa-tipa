package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.model.Avainsana;
import fi.csc.avaa.tupa.db.model.AvainsanaModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Avainsana service. Represents a row in the &quot;avainsana&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link fi.csc.avaa.tupa.db.model.AvainsanaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AvainsanaImpl}.
 * </p>
 *
 * @author pj,jmlehtin
 * @see AvainsanaImpl
 * @see fi.csc.avaa.tupa.db.model.Avainsana
 * @see fi.csc.avaa.tupa.db.model.AvainsanaModel
 * @generated
 */
public class AvainsanaModelImpl extends BaseModelImpl<Avainsana>
    implements AvainsanaModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a avainsana model instance should use the {@link fi.csc.avaa.tupa.db.model.Avainsana} interface instead.
     */
    public static final String TABLE_NAME = "avainsana";
    public static final Object[][] TABLE_COLUMNS = {
            { "avainsana_id", Types.INTEGER },
            { "avainsana", Types.VARCHAR },
            { "keyword", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table avainsana (avainsana_id INTEGER not null primary key,avainsana VARCHAR(75) null,keyword VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table avainsana";
    public static final String ORDER_BY_JPQL = " ORDER BY avainsana.avainsana_id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY avainsana.avainsana_id ASC";
    public static final String DATA_SOURCE = "tupa";
    public static final String SESSION_FACTORY = "tupaSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.fi.csc.avaa.tupa.db.model.Avainsana"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.fi.csc.avaa.tupa.db.model.Avainsana"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.fi.csc.avaa.tupa.db.model.Avainsana"));
    private static ClassLoader _classLoader = Avainsana.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Avainsana.class
        };
    private int _avainsana_id;
    private String _avainsana;
    private String _keyword;
    private Avainsana _escapedModel;

    public AvainsanaModelImpl() {
    }

    @Override
    public int getPrimaryKey() {
        return _avainsana_id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setAvainsana_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _avainsana_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Avainsana.class;
    }

    @Override
    public String getModelClassName() {
        return Avainsana.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("avainsana_id", getAvainsana_id());
        attributes.put("avainsana", getAvainsana());
        attributes.put("keyword", getKeyword());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer avainsana_id = (Integer) attributes.get("avainsana_id");

        if (avainsana_id != null) {
            setAvainsana_id(avainsana_id);
        }

        String avainsana = (String) attributes.get("avainsana");

        if (avainsana != null) {
            setAvainsana(avainsana);
        }

        String keyword = (String) attributes.get("keyword");

        if (keyword != null) {
            setKeyword(keyword);
        }
    }

    @Override
    public int getAvainsana_id() {
        return _avainsana_id;
    }

    @Override
    public void setAvainsana_id(int avainsana_id) {
        _avainsana_id = avainsana_id;
    }

    @Override
    public String getAvainsana() {
        if (_avainsana == null) {
            return StringPool.BLANK;
        } else {
            return _avainsana;
        }
    }

    @Override
    public void setAvainsana(String avainsana) {
        _avainsana = avainsana;
    }

    @Override
    public String getKeyword() {
        if (_keyword == null) {
            return StringPool.BLANK;
        } else {
            return _keyword;
        }
    }

    @Override
    public void setKeyword(String keyword) {
        _keyword = keyword;
    }

    @Override
    public Avainsana toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Avainsana) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        AvainsanaImpl avainsanaImpl = new AvainsanaImpl();

        avainsanaImpl.setAvainsana_id(getAvainsana_id());
        avainsanaImpl.setAvainsana(getAvainsana());
        avainsanaImpl.setKeyword(getKeyword());

        avainsanaImpl.resetOriginalValues();

        return avainsanaImpl;
    }

    @Override
    public int compareTo(Avainsana avainsana) {
        int primaryKey = avainsana.getPrimaryKey();

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

        if (!(obj instanceof Avainsana)) {
            return false;
        }

        Avainsana avainsana = (Avainsana) obj;

        int primaryKey = avainsana.getPrimaryKey();

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
    public CacheModel<Avainsana> toCacheModel() {
        AvainsanaCacheModel avainsanaCacheModel = new AvainsanaCacheModel();

        avainsanaCacheModel.avainsana_id = getAvainsana_id();

        avainsanaCacheModel.avainsana = getAvainsana();

        String avainsana = avainsanaCacheModel.avainsana;

        if ((avainsana != null) && (avainsana.length() == 0)) {
            avainsanaCacheModel.avainsana = null;
        }

        avainsanaCacheModel.keyword = getKeyword();

        String keyword = avainsanaCacheModel.keyword;

        if ((keyword != null) && (keyword.length() == 0)) {
            avainsanaCacheModel.keyword = null;
        }

        return avainsanaCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{avainsana_id=");
        sb.append(getAvainsana_id());
        sb.append(", avainsana=");
        sb.append(getAvainsana());
        sb.append(", keyword=");
        sb.append(getKeyword());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.Avainsana");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>avainsana_id</column-name><column-value><![CDATA[");
        sb.append(getAvainsana_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>avainsana</column-name><column-value><![CDATA[");
        sb.append(getAvainsana());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>keyword</column-name><column-value><![CDATA[");
        sb.append(getKeyword());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}