package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK;

import java.io.Serializable;

/**
 * The base model interface for the Infra_Vastuuorganisaatiot service. Represents a row in the &quot;infra_vastuuorganisaatiot&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotImpl}.
 * </p>
 *
 * @author pj,jmlehtin
 * @see Infra_Vastuuorganisaatiot
 * @see fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotImpl
 * @see fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotModelImpl
 * @generated
 */
public interface Infra_VastuuorganisaatiotModel extends BaseModel<Infra_Vastuuorganisaatiot> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a infra_ vastuuorganisaatiot model instance should use the {@link Infra_Vastuuorganisaatiot} interface instead.
     */

    /**
     * Returns the primary key of this infra_ vastuuorganisaatiot.
     *
     * @return the primary key of this infra_ vastuuorganisaatiot
     */
    public Infra_VastuuorganisaatiotPK getPrimaryKey();

    /**
     * Sets the primary key of this infra_ vastuuorganisaatiot.
     *
     * @param primaryKey the primary key of this infra_ vastuuorganisaatiot
     */
    public void setPrimaryKey(Infra_VastuuorganisaatiotPK primaryKey);

    /**
     * Returns the infra_id of this infra_ vastuuorganisaatiot.
     *
     * @return the infra_id of this infra_ vastuuorganisaatiot
     */
    public int getInfra_id();

    /**
     * Sets the infra_id of this infra_ vastuuorganisaatiot.
     *
     * @param infra_id the infra_id of this infra_ vastuuorganisaatiot
     */
    public void setInfra_id(int infra_id);

    /**
     * Returns the organisaatio_id of this infra_ vastuuorganisaatiot.
     *
     * @return the organisaatio_id of this infra_ vastuuorganisaatiot
     */
    public int getOrganisaatio_id();

    /**
     * Sets the organisaatio_id of this infra_ vastuuorganisaatiot.
     *
     * @param organisaatio_id the organisaatio_id of this infra_ vastuuorganisaatiot
     */
    public void setOrganisaatio_id(int organisaatio_id);

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
    public int compareTo(Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Infra_Vastuuorganisaatiot> toCacheModel();

    @Override
    public Infra_Vastuuorganisaatiot toEscapedModel();

    @Override
    public Infra_Vastuuorganisaatiot toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
