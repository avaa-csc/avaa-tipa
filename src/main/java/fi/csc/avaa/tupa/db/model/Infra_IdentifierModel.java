package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierPK;

import java.io.Serializable;

/**
 * The base model interface for the Infra_Identifier service. Represents a row in the &quot;infra_identifier&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierImpl}.
 * </p>
 *
 * @author CSC
 * @see Infra_Identifier
 * @see fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierImpl
 * @see fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl
 * @generated
 */
public interface Infra_IdentifierModel extends BaseModel<Infra_Identifier> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a infra_ identifier model instance should use the {@link Infra_Identifier} interface instead.
     */

    /**
     * Returns the primary key of this infra_ identifier.
     *
     * @return the primary key of this infra_ identifier
     */
    public Infra_IdentifierPK getPrimaryKey();

    /**
     * Sets the primary key of this infra_ identifier.
     *
     * @param primaryKey the primary key of this infra_ identifier
     */
    public void setPrimaryKey(Infra_IdentifierPK primaryKey);

    /**
     * Returns the identifier_type of this infra_ identifier.
     *
     * @return the identifier_type of this infra_ identifier
     */
    public int getIdentifier_type();

    /**
     * Sets the identifier_type of this infra_ identifier.
     *
     * @param identifier_type the identifier_type of this infra_ identifier
     */
    public void setIdentifier_type(int identifier_type);

    /**
     * Returns the infra_id of this infra_ identifier.
     *
     * @return the infra_id of this infra_ identifier
     */
    public int getInfra_id();

    /**
     * Sets the infra_id of this infra_ identifier.
     *
     * @param infra_id the infra_id of this infra_ identifier
     */
    public void setInfra_id(int infra_id);

    /**
     * Returns the identifier_value of this infra_ identifier.
     *
     * @return the identifier_value of this infra_ identifier
     */
    @AutoEscape
    public String getIdentifier_value();

    /**
     * Sets the identifier_value of this infra_ identifier.
     *
     * @param identifier_value the identifier_value of this infra_ identifier
     */
    public void setIdentifier_value(String identifier_value);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(
        fi.csc.avaa.tupa.db.model.Infra_Identifier infra_Identifier);

    @Override
    public int hashCode();

    @Override
    public CacheModel<fi.csc.avaa.tupa.db.model.Infra_Identifier> toCacheModel();

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Identifier toEscapedModel();

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Identifier toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
