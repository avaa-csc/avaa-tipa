package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import fi.csc.avaa.tupa.db.service.persistence.Infra_PalvelutPK;

import java.io.Serializable;

/**
 * The base model interface for the Infra_Palvelut service. Represents a row in the &quot;infra_palvelut&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link fi.csc.avaa.tupa.db.model.impl.Infra_PalvelutModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link fi.csc.avaa.tupa.db.model.impl.Infra_PalvelutImpl}.
 * </p>
 *
 * @author CSC
 * @see Infra_Palvelut
 * @see fi.csc.avaa.tupa.db.model.impl.Infra_PalvelutImpl
 * @see fi.csc.avaa.tupa.db.model.impl.Infra_PalvelutModelImpl
 * @generated
 */
public interface Infra_PalvelutModel extends BaseModel<Infra_Palvelut> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a infra_ palvelut model instance should use the {@link Infra_Palvelut} interface instead.
     */

    /**
     * Returns the primary key of this infra_ palvelut.
     *
     * @return the primary key of this infra_ palvelut
     */
    public Infra_PalvelutPK getPrimaryKey();

    /**
     * Sets the primary key of this infra_ palvelut.
     *
     * @param primaryKey the primary key of this infra_ palvelut
     */
    public void setPrimaryKey(Infra_PalvelutPK primaryKey);

    /**
     * Returns the infra_id of this infra_ palvelut.
     *
     * @return the infra_id of this infra_ palvelut
     */
    public int getInfra_id();

    /**
     * Sets the infra_id of this infra_ palvelut.
     *
     * @param infra_id the infra_id of this infra_ palvelut
     */
    public void setInfra_id(int infra_id);

    /**
     * Returns the palvelu_id of this infra_ palvelut.
     *
     * @return the palvelu_id of this infra_ palvelut
     */
    public int getPalvelu_id();

    /**
     * Sets the palvelu_id of this infra_ palvelut.
     *
     * @param palvelu_id the palvelu_id of this infra_ palvelut
     */
    public void setPalvelu_id(int palvelu_id);

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
        fi.csc.avaa.tupa.db.model.Infra_Palvelut infra_Palvelut);

    @Override
    public int hashCode();

    @Override
    public CacheModel<fi.csc.avaa.tupa.db.model.Infra_Palvelut> toCacheModel();

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Palvelut toEscapedModel();

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Palvelut toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
