package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Infra_Identifier}.
 * </p>
 *
 * @author CSC
 * @see Infra_Identifier
 * @generated
 */
public class Infra_IdentifierWrapper implements Infra_Identifier,
    ModelWrapper<Infra_Identifier> {
    private Infra_Identifier _infra_Identifier;

    public Infra_IdentifierWrapper(Infra_Identifier infra_Identifier) {
        _infra_Identifier = infra_Identifier;
    }

    @Override
    public Class<?> getModelClass() {
        return Infra_Identifier.class;
    }

    @Override
    public String getModelClassName() {
        return Infra_Identifier.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("identifier_type", getIdentifier_type());
        attributes.put("infra_id", getInfra_id());
        attributes.put("identifier_value", getIdentifier_value());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer identifier_type = (Integer) attributes.get("identifier_type");

        if (identifier_type != null) {
            setIdentifier_type(identifier_type);
        }

        Integer infra_id = (Integer) attributes.get("infra_id");

        if (infra_id != null) {
            setInfra_id(infra_id);
        }

        String identifier_value = (String) attributes.get("identifier_value");

        if (identifier_value != null) {
            setIdentifier_value(identifier_value);
        }
    }

    /**
    * Returns the primary key of this infra_ identifier.
    *
    * @return the primary key of this infra_ identifier
    */
    @Override
    public fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierPK getPrimaryKey() {
        return _infra_Identifier.getPrimaryKey();
    }

    /**
    * Sets the primary key of this infra_ identifier.
    *
    * @param primaryKey the primary key of this infra_ identifier
    */
    @Override
    public void setPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierPK primaryKey) {
        _infra_Identifier.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the identifier_type of this infra_ identifier.
    *
    * @return the identifier_type of this infra_ identifier
    */
    @Override
    public int getIdentifier_type() {
        return _infra_Identifier.getIdentifier_type();
    }

    /**
    * Sets the identifier_type of this infra_ identifier.
    *
    * @param identifier_type the identifier_type of this infra_ identifier
    */
    @Override
    public void setIdentifier_type(int identifier_type) {
        _infra_Identifier.setIdentifier_type(identifier_type);
    }

    /**
    * Returns the infra_id of this infra_ identifier.
    *
    * @return the infra_id of this infra_ identifier
    */
    @Override
    public int getInfra_id() {
        return _infra_Identifier.getInfra_id();
    }

    /**
    * Sets the infra_id of this infra_ identifier.
    *
    * @param infra_id the infra_id of this infra_ identifier
    */
    @Override
    public void setInfra_id(int infra_id) {
        _infra_Identifier.setInfra_id(infra_id);
    }

    /**
    * Returns the identifier_value of this infra_ identifier.
    *
    * @return the identifier_value of this infra_ identifier
    */
    @Override
    public java.lang.String getIdentifier_value() {
        return _infra_Identifier.getIdentifier_value();
    }

    /**
    * Sets the identifier_value of this infra_ identifier.
    *
    * @param identifier_value the identifier_value of this infra_ identifier
    */
    @Override
    public void setIdentifier_value(java.lang.String identifier_value) {
        _infra_Identifier.setIdentifier_value(identifier_value);
    }

    @Override
    public boolean isNew() {
        return _infra_Identifier.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _infra_Identifier.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _infra_Identifier.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _infra_Identifier.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _infra_Identifier.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _infra_Identifier.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _infra_Identifier.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _infra_Identifier.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _infra_Identifier.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _infra_Identifier.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _infra_Identifier.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Infra_IdentifierWrapper((Infra_Identifier) _infra_Identifier.clone());
    }

    @Override
    public int compareTo(
        fi.csc.avaa.tupa.db.model.Infra_Identifier infra_Identifier) {
        return _infra_Identifier.compareTo(infra_Identifier);
    }

    @Override
    public int hashCode() {
        return _infra_Identifier.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.Infra_Identifier> toCacheModel() {
        return _infra_Identifier.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Identifier toEscapedModel() {
        return new Infra_IdentifierWrapper(_infra_Identifier.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Identifier toUnescapedModel() {
        return new Infra_IdentifierWrapper(_infra_Identifier.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _infra_Identifier.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _infra_Identifier.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _infra_Identifier.persist();
    }

    @Override
    public java.lang.String getDefinition_url() {
        return _infra_Identifier.getDefinition_url();
    }

    @Override
    public void setDefinition_url(java.lang.String definition_url) {
        _infra_Identifier.setDefinition_url(definition_url);
    }

    @Override
    public java.lang.String getResolution_url() {
        return _infra_Identifier.getResolution_url();
    }

    @Override
    public void setResolution_url(java.lang.String resolution_url) {
        _infra_Identifier.setResolution_url(resolution_url);
    }

    @Override
    public java.lang.String getIdentifier_description_translation_key() {
        return _infra_Identifier.getIdentifier_description_translation_key();
    }

    @Override
    public void setIdentifier_description_translation_key(
        java.lang.String identifier_description_translation_key) {
        _infra_Identifier.setIdentifier_description_translation_key(identifier_description_translation_key);
    }

    @Override
    public java.lang.String getIdentifier_name() {
        return _infra_Identifier.getIdentifier_name();
    }

    @Override
    public void setIdentifier_name(java.lang.String identifier_name) {
        _infra_Identifier.setIdentifier_name(identifier_name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Infra_IdentifierWrapper)) {
            return false;
        }

        Infra_IdentifierWrapper infra_IdentifierWrapper = (Infra_IdentifierWrapper) obj;

        if (Validator.equals(_infra_Identifier,
                    infra_IdentifierWrapper._infra_Identifier)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Infra_Identifier getWrappedInfra_Identifier() {
        return _infra_Identifier;
    }

    @Override
    public Infra_Identifier getWrappedModel() {
        return _infra_Identifier;
    }

    @Override
    public void resetOriginalValues() {
        _infra_Identifier.resetOriginalValues();
    }
}
