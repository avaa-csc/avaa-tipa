package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.model.TpInfrastructure;
import fi.csc.avaa.tupa.db.model.TpInfrastructureModel;
import fi.csc.avaa.tupa.db.model.TpInfrastructureSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TpInfrastructure service. Represents a row in the &quot;tupa_TpInfrastructure&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link fi.csc.avaa.tupa.db.model.TpInfrastructureModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TpInfrastructureImpl}.
 * </p>
 *
 * @author CSC
 * @see TpInfrastructureImpl
 * @see fi.csc.avaa.tupa.db.model.TpInfrastructure
 * @see fi.csc.avaa.tupa.db.model.TpInfrastructureModel
 * @generated
 */
@JSON(strict = true)
public class TpInfrastructureModelImpl extends BaseModelImpl<TpInfrastructure>
    implements TpInfrastructureModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a tp infrastructure model instance should use the {@link fi.csc.avaa.tupa.db.model.TpInfrastructure} interface instead.
     */
    public static final String TABLE_NAME = "tupa_TpInfrastructure";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.INTEGER },
            { "urn", Types.VARCHAR },
            { "name_EN", Types.VARCHAR },
            { "name_FI", Types.VARCHAR },
            { "acronym_EN", Types.VARCHAR },
            { "acronym_FI", Types.VARCHAR },
            { "description_EN", Types.VARCHAR },
            { "description_FI", Types.VARCHAR },
            { "active_", Types.BOOLEAN },
            { "preparationsStarted", Types.INTEGER },
            { "buildingStarted", Types.INTEGER },
            { "operationsStarted", Types.INTEGER },
            { "operationsFinished", Types.INTEGER },
            { "formerIds", Types.VARCHAR },
            { "formerUrns", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table tupa_TpInfrastructure (id_ INTEGER not null primary key,urn VARCHAR(75) null,name_EN VARCHAR(75) null,name_FI VARCHAR(75) null,acronym_EN VARCHAR(75) null,acronym_FI VARCHAR(75) null,description_EN VARCHAR(75) null,description_FI VARCHAR(75) null,active_ BOOLEAN,preparationsStarted INTEGER,buildingStarted INTEGER,operationsStarted INTEGER,operationsFinished INTEGER,formerIds VARCHAR(75) null,formerUrns VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table tupa_TpInfrastructure";
    public static final String ORDER_BY_JPQL = " ORDER BY tpInfrastructure.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY tupa_TpInfrastructure.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.fi.csc.avaa.tupa.db.model.TpInfrastructure"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.fi.csc.avaa.tupa.db.model.TpInfrastructure"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.fi.csc.avaa.tupa.db.model.TpInfrastructure"));
    private static ClassLoader _classLoader = TpInfrastructure.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            TpInfrastructure.class
        };
    private int _id;
    private String _urn;
    private String _name_EN;
    private String _name_FI;
    private String _acronym_EN;
    private String _acronym_FI;
    private String _description_EN;
    private String _description_FI;
    private boolean _active;
    private int _preparationsStarted;
    private int _buildingStarted;
    private int _operationsStarted;
    private int _operationsFinished;
    private String _formerIds;
    private String _formerUrns;
    private TpInfrastructure _escapedModel;

    public TpInfrastructureModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static TpInfrastructure toModel(TpInfrastructureSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        TpInfrastructure model = new TpInfrastructureImpl();

        model.setId(soapModel.getId());
        model.setUrn(soapModel.getUrn());
        model.setName_EN(soapModel.getName_EN());
        model.setName_FI(soapModel.getName_FI());
        model.setAcronym_EN(soapModel.getAcronym_EN());
        model.setAcronym_FI(soapModel.getAcronym_FI());
        model.setDescription_EN(soapModel.getDescription_EN());
        model.setDescription_FI(soapModel.getDescription_FI());
        model.setActive(soapModel.getActive());
        model.setPreparationsStarted(soapModel.getPreparationsStarted());
        model.setBuildingStarted(soapModel.getBuildingStarted());
        model.setOperationsStarted(soapModel.getOperationsStarted());
        model.setOperationsFinished(soapModel.getOperationsFinished());
        model.setFormerIds(soapModel.getFormerIds());
        model.setFormerUrns(soapModel.getFormerUrns());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<TpInfrastructure> toModels(
        TpInfrastructureSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<TpInfrastructure> models = new ArrayList<TpInfrastructure>(soapModels.length);

        for (TpInfrastructureSoap soapModel : soapModels) {
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
        return TpInfrastructure.class;
    }

    @Override
    public String getModelClassName() {
        return TpInfrastructure.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("urn", getUrn());
        attributes.put("name_EN", getName_EN());
        attributes.put("name_FI", getName_FI());
        attributes.put("acronym_EN", getAcronym_EN());
        attributes.put("acronym_FI", getAcronym_FI());
        attributes.put("description_EN", getDescription_EN());
        attributes.put("description_FI", getDescription_FI());
        attributes.put("active", getActive());
        attributes.put("preparationsStarted", getPreparationsStarted());
        attributes.put("buildingStarted", getBuildingStarted());
        attributes.put("operationsStarted", getOperationsStarted());
        attributes.put("operationsFinished", getOperationsFinished());
        attributes.put("formerIds", getFormerIds());
        attributes.put("formerUrns", getFormerUrns());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer id = (Integer) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String urn = (String) attributes.get("urn");

        if (urn != null) {
            setUrn(urn);
        }

        String name_EN = (String) attributes.get("name_EN");

        if (name_EN != null) {
            setName_EN(name_EN);
        }

        String name_FI = (String) attributes.get("name_FI");

        if (name_FI != null) {
            setName_FI(name_FI);
        }

        String acronym_EN = (String) attributes.get("acronym_EN");

        if (acronym_EN != null) {
            setAcronym_EN(acronym_EN);
        }

        String acronym_FI = (String) attributes.get("acronym_FI");

        if (acronym_FI != null) {
            setAcronym_FI(acronym_FI);
        }

        String description_EN = (String) attributes.get("description_EN");

        if (description_EN != null) {
            setDescription_EN(description_EN);
        }

        String description_FI = (String) attributes.get("description_FI");

        if (description_FI != null) {
            setDescription_FI(description_FI);
        }

        Boolean active = (Boolean) attributes.get("active");

        if (active != null) {
            setActive(active);
        }

        Integer preparationsStarted = (Integer) attributes.get(
                "preparationsStarted");

        if (preparationsStarted != null) {
            setPreparationsStarted(preparationsStarted);
        }

        Integer buildingStarted = (Integer) attributes.get("buildingStarted");

        if (buildingStarted != null) {
            setBuildingStarted(buildingStarted);
        }

        Integer operationsStarted = (Integer) attributes.get(
                "operationsStarted");

        if (operationsStarted != null) {
            setOperationsStarted(operationsStarted);
        }

        Integer operationsFinished = (Integer) attributes.get(
                "operationsFinished");

        if (operationsFinished != null) {
            setOperationsFinished(operationsFinished);
        }

        String formerIds = (String) attributes.get("formerIds");

        if (formerIds != null) {
            setFormerIds(formerIds);
        }

        String formerUrns = (String) attributes.get("formerUrns");

        if (formerUrns != null) {
            setFormerUrns(formerUrns);
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
    public String getUrn() {
        if (_urn == null) {
            return StringPool.BLANK;
        } else {
            return _urn;
        }
    }

    @Override
    public void setUrn(String urn) {
        _urn = urn;
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
    public String getAcronym_EN() {
        if (_acronym_EN == null) {
            return StringPool.BLANK;
        } else {
            return _acronym_EN;
        }
    }

    @Override
    public void setAcronym_EN(String acronym_EN) {
        _acronym_EN = acronym_EN;
    }

    @JSON
    @Override
    public String getAcronym_FI() {
        if (_acronym_FI == null) {
            return StringPool.BLANK;
        } else {
            return _acronym_FI;
        }
    }

    @Override
    public void setAcronym_FI(String acronym_FI) {
        _acronym_FI = acronym_FI;
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
    public boolean getActive() {
        return _active;
    }

    @Override
    public boolean isActive() {
        return _active;
    }

    @Override
    public void setActive(boolean active) {
        _active = active;
    }

    @JSON
    @Override
    public int getPreparationsStarted() {
        return _preparationsStarted;
    }

    @Override
    public void setPreparationsStarted(int preparationsStarted) {
        _preparationsStarted = preparationsStarted;
    }

    @JSON
    @Override
    public int getBuildingStarted() {
        return _buildingStarted;
    }

    @Override
    public void setBuildingStarted(int buildingStarted) {
        _buildingStarted = buildingStarted;
    }

    @JSON
    @Override
    public int getOperationsStarted() {
        return _operationsStarted;
    }

    @Override
    public void setOperationsStarted(int operationsStarted) {
        _operationsStarted = operationsStarted;
    }

    @JSON
    @Override
    public int getOperationsFinished() {
        return _operationsFinished;
    }

    @Override
    public void setOperationsFinished(int operationsFinished) {
        _operationsFinished = operationsFinished;
    }

    @JSON
    @Override
    public String getFormerIds() {
        if (_formerIds == null) {
            return StringPool.BLANK;
        } else {
            return _formerIds;
        }
    }

    @Override
    public void setFormerIds(String formerIds) {
        _formerIds = formerIds;
    }

    @JSON
    @Override
    public String getFormerUrns() {
        if (_formerUrns == null) {
            return StringPool.BLANK;
        } else {
            return _formerUrns;
        }
    }

    @Override
    public void setFormerUrns(String formerUrns) {
        _formerUrns = formerUrns;
    }

    @Override
    public TpInfrastructure toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (TpInfrastructure) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        TpInfrastructureImpl tpInfrastructureImpl = new TpInfrastructureImpl();

        tpInfrastructureImpl.setId(getId());
        tpInfrastructureImpl.setUrn(getUrn());
        tpInfrastructureImpl.setName_EN(getName_EN());
        tpInfrastructureImpl.setName_FI(getName_FI());
        tpInfrastructureImpl.setAcronym_EN(getAcronym_EN());
        tpInfrastructureImpl.setAcronym_FI(getAcronym_FI());
        tpInfrastructureImpl.setDescription_EN(getDescription_EN());
        tpInfrastructureImpl.setDescription_FI(getDescription_FI());
        tpInfrastructureImpl.setActive(getActive());
        tpInfrastructureImpl.setPreparationsStarted(getPreparationsStarted());
        tpInfrastructureImpl.setBuildingStarted(getBuildingStarted());
        tpInfrastructureImpl.setOperationsStarted(getOperationsStarted());
        tpInfrastructureImpl.setOperationsFinished(getOperationsFinished());
        tpInfrastructureImpl.setFormerIds(getFormerIds());
        tpInfrastructureImpl.setFormerUrns(getFormerUrns());

        tpInfrastructureImpl.resetOriginalValues();

        return tpInfrastructureImpl;
    }

    @Override
    public int compareTo(TpInfrastructure tpInfrastructure) {
        int primaryKey = tpInfrastructure.getPrimaryKey();

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

        if (!(obj instanceof TpInfrastructure)) {
            return false;
        }

        TpInfrastructure tpInfrastructure = (TpInfrastructure) obj;

        int primaryKey = tpInfrastructure.getPrimaryKey();

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
    public CacheModel<TpInfrastructure> toCacheModel() {
        TpInfrastructureCacheModel tpInfrastructureCacheModel = new TpInfrastructureCacheModel();

        tpInfrastructureCacheModel.id = getId();

        tpInfrastructureCacheModel.urn = getUrn();

        String urn = tpInfrastructureCacheModel.urn;

        if ((urn != null) && (urn.length() == 0)) {
            tpInfrastructureCacheModel.urn = null;
        }

        tpInfrastructureCacheModel.name_EN = getName_EN();

        String name_EN = tpInfrastructureCacheModel.name_EN;

        if ((name_EN != null) && (name_EN.length() == 0)) {
            tpInfrastructureCacheModel.name_EN = null;
        }

        tpInfrastructureCacheModel.name_FI = getName_FI();

        String name_FI = tpInfrastructureCacheModel.name_FI;

        if ((name_FI != null) && (name_FI.length() == 0)) {
            tpInfrastructureCacheModel.name_FI = null;
        }

        tpInfrastructureCacheModel.acronym_EN = getAcronym_EN();

        String acronym_EN = tpInfrastructureCacheModel.acronym_EN;

        if ((acronym_EN != null) && (acronym_EN.length() == 0)) {
            tpInfrastructureCacheModel.acronym_EN = null;
        }

        tpInfrastructureCacheModel.acronym_FI = getAcronym_FI();

        String acronym_FI = tpInfrastructureCacheModel.acronym_FI;

        if ((acronym_FI != null) && (acronym_FI.length() == 0)) {
            tpInfrastructureCacheModel.acronym_FI = null;
        }

        tpInfrastructureCacheModel.description_EN = getDescription_EN();

        String description_EN = tpInfrastructureCacheModel.description_EN;

        if ((description_EN != null) && (description_EN.length() == 0)) {
            tpInfrastructureCacheModel.description_EN = null;
        }

        tpInfrastructureCacheModel.description_FI = getDescription_FI();

        String description_FI = tpInfrastructureCacheModel.description_FI;

        if ((description_FI != null) && (description_FI.length() == 0)) {
            tpInfrastructureCacheModel.description_FI = null;
        }

        tpInfrastructureCacheModel.active = getActive();

        tpInfrastructureCacheModel.preparationsStarted = getPreparationsStarted();

        tpInfrastructureCacheModel.buildingStarted = getBuildingStarted();

        tpInfrastructureCacheModel.operationsStarted = getOperationsStarted();

        tpInfrastructureCacheModel.operationsFinished = getOperationsFinished();

        tpInfrastructureCacheModel.formerIds = getFormerIds();

        String formerIds = tpInfrastructureCacheModel.formerIds;

        if ((formerIds != null) && (formerIds.length() == 0)) {
            tpInfrastructureCacheModel.formerIds = null;
        }

        tpInfrastructureCacheModel.formerUrns = getFormerUrns();

        String formerUrns = tpInfrastructureCacheModel.formerUrns;

        if ((formerUrns != null) && (formerUrns.length() == 0)) {
            tpInfrastructureCacheModel.formerUrns = null;
        }

        return tpInfrastructureCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(31);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", urn=");
        sb.append(getUrn());
        sb.append(", name_EN=");
        sb.append(getName_EN());
        sb.append(", name_FI=");
        sb.append(getName_FI());
        sb.append(", acronym_EN=");
        sb.append(getAcronym_EN());
        sb.append(", acronym_FI=");
        sb.append(getAcronym_FI());
        sb.append(", description_EN=");
        sb.append(getDescription_EN());
        sb.append(", description_FI=");
        sb.append(getDescription_FI());
        sb.append(", active=");
        sb.append(getActive());
        sb.append(", preparationsStarted=");
        sb.append(getPreparationsStarted());
        sb.append(", buildingStarted=");
        sb.append(getBuildingStarted());
        sb.append(", operationsStarted=");
        sb.append(getOperationsStarted());
        sb.append(", operationsFinished=");
        sb.append(getOperationsFinished());
        sb.append(", formerIds=");
        sb.append(getFormerIds());
        sb.append(", formerUrns=");
        sb.append(getFormerUrns());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(49);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.TpInfrastructure");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>urn</column-name><column-value><![CDATA[");
        sb.append(getUrn());
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
            "<column><column-name>acronym_EN</column-name><column-value><![CDATA[");
        sb.append(getAcronym_EN());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>acronym_FI</column-name><column-value><![CDATA[");
        sb.append(getAcronym_FI());
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
            "<column><column-name>active</column-name><column-value><![CDATA[");
        sb.append(getActive());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>preparationsStarted</column-name><column-value><![CDATA[");
        sb.append(getPreparationsStarted());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>buildingStarted</column-name><column-value><![CDATA[");
        sb.append(getBuildingStarted());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>operationsStarted</column-name><column-value><![CDATA[");
        sb.append(getOperationsStarted());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>operationsFinished</column-name><column-value><![CDATA[");
        sb.append(getOperationsFinished());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>formerIds</column-name><column-value><![CDATA[");
        sb.append(getFormerIds());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>formerUrns</column-name><column-value><![CDATA[");
        sb.append(getFormerUrns());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
