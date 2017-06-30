package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Palvelutyyppi}.
 * </p>
 *
 * @author CSC
 * @see Palvelutyyppi
 * @generated
 */
public class PalvelutyyppiWrapper implements Palvelutyyppi,
    ModelWrapper<Palvelutyyppi> {
    private Palvelutyyppi _palvelutyyppi;

    public PalvelutyyppiWrapper(Palvelutyyppi palvelutyyppi) {
        _palvelutyyppi = palvelutyyppi;
    }

    @Override
    public Class<?> getModelClass() {
        return Palvelutyyppi.class;
    }

    @Override
    public String getModelClassName() {
        return Palvelutyyppi.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("palvelutyyppi_id", getPalvelutyyppi_id());
        attributes.put("tyyppi", getTyyppi());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer palvelutyyppi_id = (Integer) attributes.get("palvelutyyppi_id");

        if (palvelutyyppi_id != null) {
            setPalvelutyyppi_id(palvelutyyppi_id);
        }

        Integer tyyppi = (Integer) attributes.get("tyyppi");

        if (tyyppi != null) {
            setTyyppi(tyyppi);
        }
    }

    /**
    * Returns the primary key of this palvelutyyppi.
    *
    * @return the primary key of this palvelutyyppi
    */
    @Override
    public int getPrimaryKey() {
        return _palvelutyyppi.getPrimaryKey();
    }

    /**
    * Sets the primary key of this palvelutyyppi.
    *
    * @param primaryKey the primary key of this palvelutyyppi
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _palvelutyyppi.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the palvelutyyppi_id of this palvelutyyppi.
    *
    * @return the palvelutyyppi_id of this palvelutyyppi
    */
    @Override
    public int getPalvelutyyppi_id() {
        return _palvelutyyppi.getPalvelutyyppi_id();
    }

    /**
    * Sets the palvelutyyppi_id of this palvelutyyppi.
    *
    * @param palvelutyyppi_id the palvelutyyppi_id of this palvelutyyppi
    */
    @Override
    public void setPalvelutyyppi_id(int palvelutyyppi_id) {
        _palvelutyyppi.setPalvelutyyppi_id(palvelutyyppi_id);
    }

    /**
    * Returns the tyyppi of this palvelutyyppi.
    *
    * @return the tyyppi of this palvelutyyppi
    */
    @Override
    public int getTyyppi() {
        return _palvelutyyppi.getTyyppi();
    }

    /**
    * Sets the tyyppi of this palvelutyyppi.
    *
    * @param tyyppi the tyyppi of this palvelutyyppi
    */
    @Override
    public void setTyyppi(int tyyppi) {
        _palvelutyyppi.setTyyppi(tyyppi);
    }

    @Override
    public boolean isNew() {
        return _palvelutyyppi.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _palvelutyyppi.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _palvelutyyppi.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _palvelutyyppi.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _palvelutyyppi.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _palvelutyyppi.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _palvelutyyppi.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _palvelutyyppi.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _palvelutyyppi.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _palvelutyyppi.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _palvelutyyppi.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PalvelutyyppiWrapper((Palvelutyyppi) _palvelutyyppi.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.tupa.db.model.Palvelutyyppi palvelutyyppi) {
        return _palvelutyyppi.compareTo(palvelutyyppi);
    }

    @Override
    public int hashCode() {
        return _palvelutyyppi.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.Palvelutyyppi> toCacheModel() {
        return _palvelutyyppi.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Palvelutyyppi toEscapedModel() {
        return new PalvelutyyppiWrapper(_palvelutyyppi.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Palvelutyyppi toUnescapedModel() {
        return new PalvelutyyppiWrapper(_palvelutyyppi.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _palvelutyyppi.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _palvelutyyppi.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _palvelutyyppi.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PalvelutyyppiWrapper)) {
            return false;
        }

        PalvelutyyppiWrapper palvelutyyppiWrapper = (PalvelutyyppiWrapper) obj;

        if (Validator.equals(_palvelutyyppi, palvelutyyppiWrapper._palvelutyyppi)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Palvelutyyppi getWrappedPalvelutyyppi() {
        return _palvelutyyppi;
    }

    @Override
    public Palvelutyyppi getWrappedModel() {
        return _palvelutyyppi;
    }

    @Override
    public void resetOriginalValues() {
        _palvelutyyppi.resetOriginalValues();
    }
}
