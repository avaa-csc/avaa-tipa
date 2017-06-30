package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Infra_Palvelut}.
 * </p>
 *
 * @author CSC
 * @see Infra_Palvelut
 * @generated
 */
public class Infra_PalvelutWrapper implements Infra_Palvelut,
    ModelWrapper<Infra_Palvelut> {
    private Infra_Palvelut _infra_Palvelut;

    public Infra_PalvelutWrapper(Infra_Palvelut infra_Palvelut) {
        _infra_Palvelut = infra_Palvelut;
    }

    @Override
    public Class<?> getModelClass() {
        return Infra_Palvelut.class;
    }

    @Override
    public String getModelClassName() {
        return Infra_Palvelut.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("infra_id", getInfra_id());
        attributes.put("palvelu_id", getPalvelu_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer infra_id = (Integer) attributes.get("infra_id");

        if (infra_id != null) {
            setInfra_id(infra_id);
        }

        Integer palvelu_id = (Integer) attributes.get("palvelu_id");

        if (palvelu_id != null) {
            setPalvelu_id(palvelu_id);
        }
    }

    /**
    * Returns the primary key of this infra_ palvelut.
    *
    * @return the primary key of this infra_ palvelut
    */
    @Override
    public fi.csc.avaa.tupa.db.service.persistence.Infra_PalvelutPK getPrimaryKey() {
        return _infra_Palvelut.getPrimaryKey();
    }

    /**
    * Sets the primary key of this infra_ palvelut.
    *
    * @param primaryKey the primary key of this infra_ palvelut
    */
    @Override
    public void setPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_PalvelutPK primaryKey) {
        _infra_Palvelut.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the infra_id of this infra_ palvelut.
    *
    * @return the infra_id of this infra_ palvelut
    */
    @Override
    public int getInfra_id() {
        return _infra_Palvelut.getInfra_id();
    }

    /**
    * Sets the infra_id of this infra_ palvelut.
    *
    * @param infra_id the infra_id of this infra_ palvelut
    */
    @Override
    public void setInfra_id(int infra_id) {
        _infra_Palvelut.setInfra_id(infra_id);
    }

    /**
    * Returns the palvelu_id of this infra_ palvelut.
    *
    * @return the palvelu_id of this infra_ palvelut
    */
    @Override
    public int getPalvelu_id() {
        return _infra_Palvelut.getPalvelu_id();
    }

    /**
    * Sets the palvelu_id of this infra_ palvelut.
    *
    * @param palvelu_id the palvelu_id of this infra_ palvelut
    */
    @Override
    public void setPalvelu_id(int palvelu_id) {
        _infra_Palvelut.setPalvelu_id(palvelu_id);
    }

    @Override
    public boolean isNew() {
        return _infra_Palvelut.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _infra_Palvelut.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _infra_Palvelut.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _infra_Palvelut.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _infra_Palvelut.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _infra_Palvelut.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _infra_Palvelut.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _infra_Palvelut.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _infra_Palvelut.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _infra_Palvelut.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _infra_Palvelut.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Infra_PalvelutWrapper((Infra_Palvelut) _infra_Palvelut.clone());
    }

    @Override
    public int compareTo(
        fi.csc.avaa.tupa.db.model.Infra_Palvelut infra_Palvelut) {
        return _infra_Palvelut.compareTo(infra_Palvelut);
    }

    @Override
    public int hashCode() {
        return _infra_Palvelut.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.Infra_Palvelut> toCacheModel() {
        return _infra_Palvelut.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Palvelut toEscapedModel() {
        return new Infra_PalvelutWrapper(_infra_Palvelut.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Palvelut toUnescapedModel() {
        return new Infra_PalvelutWrapper(_infra_Palvelut.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _infra_Palvelut.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _infra_Palvelut.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _infra_Palvelut.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Infra_PalvelutWrapper)) {
            return false;
        }

        Infra_PalvelutWrapper infra_PalvelutWrapper = (Infra_PalvelutWrapper) obj;

        if (Validator.equals(_infra_Palvelut,
                    infra_PalvelutWrapper._infra_Palvelut)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Infra_Palvelut getWrappedInfra_Palvelut() {
        return _infra_Palvelut;
    }

    @Override
    public Infra_Palvelut getWrappedModel() {
        return _infra_Palvelut;
    }

    @Override
    public void resetOriginalValues() {
        _infra_Palvelut.resetOriginalValues();
    }
}
