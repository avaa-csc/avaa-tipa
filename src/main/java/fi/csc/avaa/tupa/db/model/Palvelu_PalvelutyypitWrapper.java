package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Palvelu_Palvelutyypit}.
 * </p>
 *
 * @author CSC
 * @see Palvelu_Palvelutyypit
 * @generated
 */
public class Palvelu_PalvelutyypitWrapper implements Palvelu_Palvelutyypit,
    ModelWrapper<Palvelu_Palvelutyypit> {
    private Palvelu_Palvelutyypit _palvelu_Palvelutyypit;

    public Palvelu_PalvelutyypitWrapper(
        Palvelu_Palvelutyypit palvelu_Palvelutyypit) {
        _palvelu_Palvelutyypit = palvelu_Palvelutyypit;
    }

    @Override
    public Class<?> getModelClass() {
        return Palvelu_Palvelutyypit.class;
    }

    @Override
    public String getModelClassName() {
        return Palvelu_Palvelutyypit.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("palvelu_id", getPalvelu_id());
        attributes.put("palvelutyyppi_id", getPalvelutyyppi_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer palvelu_id = (Integer) attributes.get("palvelu_id");

        if (palvelu_id != null) {
            setPalvelu_id(palvelu_id);
        }

        Integer palvelutyyppi_id = (Integer) attributes.get("palvelutyyppi_id");

        if (palvelutyyppi_id != null) {
            setPalvelutyyppi_id(palvelutyyppi_id);
        }
    }

    /**
    * Returns the primary key of this palvelu_ palvelutyypit.
    *
    * @return the primary key of this palvelu_ palvelutyypit
    */
    @Override
    public fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK getPrimaryKey() {
        return _palvelu_Palvelutyypit.getPrimaryKey();
    }

    /**
    * Sets the primary key of this palvelu_ palvelutyypit.
    *
    * @param primaryKey the primary key of this palvelu_ palvelutyypit
    */
    @Override
    public void setPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK primaryKey) {
        _palvelu_Palvelutyypit.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the palvelu_id of this palvelu_ palvelutyypit.
    *
    * @return the palvelu_id of this palvelu_ palvelutyypit
    */
    @Override
    public int getPalvelu_id() {
        return _palvelu_Palvelutyypit.getPalvelu_id();
    }

    /**
    * Sets the palvelu_id of this palvelu_ palvelutyypit.
    *
    * @param palvelu_id the palvelu_id of this palvelu_ palvelutyypit
    */
    @Override
    public void setPalvelu_id(int palvelu_id) {
        _palvelu_Palvelutyypit.setPalvelu_id(palvelu_id);
    }

    /**
    * Returns the palvelutyyppi_id of this palvelu_ palvelutyypit.
    *
    * @return the palvelutyyppi_id of this palvelu_ palvelutyypit
    */
    @Override
    public int getPalvelutyyppi_id() {
        return _palvelu_Palvelutyypit.getPalvelutyyppi_id();
    }

    /**
    * Sets the palvelutyyppi_id of this palvelu_ palvelutyypit.
    *
    * @param palvelutyyppi_id the palvelutyyppi_id of this palvelu_ palvelutyypit
    */
    @Override
    public void setPalvelutyyppi_id(int palvelutyyppi_id) {
        _palvelu_Palvelutyypit.setPalvelutyyppi_id(palvelutyyppi_id);
    }

    @Override
    public boolean isNew() {
        return _palvelu_Palvelutyypit.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _palvelu_Palvelutyypit.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _palvelu_Palvelutyypit.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _palvelu_Palvelutyypit.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _palvelu_Palvelutyypit.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _palvelu_Palvelutyypit.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _palvelu_Palvelutyypit.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _palvelu_Palvelutyypit.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _palvelu_Palvelutyypit.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _palvelu_Palvelutyypit.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _palvelu_Palvelutyypit.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Palvelu_PalvelutyypitWrapper((Palvelu_Palvelutyypit) _palvelu_Palvelutyypit.clone());
    }

    @Override
    public int compareTo(
        fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit palvelu_Palvelutyypit) {
        return _palvelu_Palvelutyypit.compareTo(palvelu_Palvelutyypit);
    }

    @Override
    public int hashCode() {
        return _palvelu_Palvelutyypit.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit> toCacheModel() {
        return _palvelu_Palvelutyypit.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit toEscapedModel() {
        return new Palvelu_PalvelutyypitWrapper(_palvelu_Palvelutyypit.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit toUnescapedModel() {
        return new Palvelu_PalvelutyypitWrapper(_palvelu_Palvelutyypit.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _palvelu_Palvelutyypit.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _palvelu_Palvelutyypit.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _palvelu_Palvelutyypit.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Palvelu_PalvelutyypitWrapper)) {
            return false;
        }

        Palvelu_PalvelutyypitWrapper palvelu_PalvelutyypitWrapper = (Palvelu_PalvelutyypitWrapper) obj;

        if (Validator.equals(_palvelu_Palvelutyypit,
                    palvelu_PalvelutyypitWrapper._palvelu_Palvelutyypit)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Palvelu_Palvelutyypit getWrappedPalvelu_Palvelutyypit() {
        return _palvelu_Palvelutyypit;
    }

    @Override
    public Palvelu_Palvelutyypit getWrappedModel() {
        return _palvelu_Palvelutyypit;
    }

    @Override
    public void resetOriginalValues() {
        _palvelu_Palvelutyypit.resetOriginalValues();
    }
}
