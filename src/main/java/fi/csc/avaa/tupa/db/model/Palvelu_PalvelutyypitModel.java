package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK;

import java.io.Serializable;

/**
 * The base model interface for the Palvelu_Palvelutyypit service. Represents a row in the &quot;palvelu_palvelutyypit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link fi.csc.avaa.tupa.db.model.impl.Palvelu_PalvelutyypitModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link fi.csc.avaa.tupa.db.model.impl.Palvelu_PalvelutyypitImpl}.
 * </p>
 *
 * @author CSC
 * @see Palvelu_Palvelutyypit
 * @see fi.csc.avaa.tupa.db.model.impl.Palvelu_PalvelutyypitImpl
 * @see fi.csc.avaa.tupa.db.model.impl.Palvelu_PalvelutyypitModelImpl
 * @generated
 */
public interface Palvelu_PalvelutyypitModel extends BaseModel<Palvelu_Palvelutyypit> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a palvelu_ palvelutyypit model instance should use the {@link Palvelu_Palvelutyypit} interface instead.
     */

    /**
     * Returns the primary key of this palvelu_ palvelutyypit.
     *
     * @return the primary key of this palvelu_ palvelutyypit
     */
    public Palvelu_PalvelutyypitPK getPrimaryKey();

    /**
     * Sets the primary key of this palvelu_ palvelutyypit.
     *
     * @param primaryKey the primary key of this palvelu_ palvelutyypit
     */
    public void setPrimaryKey(Palvelu_PalvelutyypitPK primaryKey);

    /**
     * Returns the palvelu_id of this palvelu_ palvelutyypit.
     *
     * @return the palvelu_id of this palvelu_ palvelutyypit
     */
    public int getPalvelu_id();

    /**
     * Sets the palvelu_id of this palvelu_ palvelutyypit.
     *
     * @param palvelu_id the palvelu_id of this palvelu_ palvelutyypit
     */
    public void setPalvelu_id(int palvelu_id);

    /**
     * Returns the palvelutyyppi_id of this palvelu_ palvelutyypit.
     *
     * @return the palvelutyyppi_id of this palvelu_ palvelutyypit
     */
    public int getPalvelutyyppi_id();

    /**
     * Sets the palvelutyyppi_id of this palvelu_ palvelutyypit.
     *
     * @param palvelutyyppi_id the palvelutyyppi_id of this palvelu_ palvelutyypit
     */
    public void setPalvelutyyppi_id(int palvelutyyppi_id);

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
        fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit palvelu_Palvelutyypit);

    @Override
    public int hashCode();

    @Override
    public CacheModel<fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit> toCacheModel();

    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit toEscapedModel();

    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
