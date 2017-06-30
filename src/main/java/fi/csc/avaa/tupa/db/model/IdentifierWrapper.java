package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Identifier}.
 * </p>
 *
 * @author CSC
 * @see Identifier
 * @generated
 */
public class IdentifierWrapper implements Identifier, ModelWrapper<Identifier> {
    private Identifier _identifier;

    public IdentifierWrapper(Identifier identifier) {
        _identifier = identifier;
    }

    @Override
    public Class<?> getModelClass() {
        return Identifier.class;
    }

    @Override
    public String getModelClassName() {
        return Identifier.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("identifier_type", getIdentifier_type());
        attributes.put("identifier_name", getIdentifier_name());
        attributes.put("identifier_description_translation_key",
            getIdentifier_description_translation_key());
        attributes.put("resolution_url", getResolution_url());
        attributes.put("definition_url", getDefinition_url());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer identifier_type = (Integer) attributes.get("identifier_type");

        if (identifier_type != null) {
            setIdentifier_type(identifier_type);
        }

        String identifier_name = (String) attributes.get("identifier_name");

        if (identifier_name != null) {
            setIdentifier_name(identifier_name);
        }

        String identifier_description_translation_key = (String) attributes.get(
                "identifier_description_translation_key");

        if (identifier_description_translation_key != null) {
            setIdentifier_description_translation_key(identifier_description_translation_key);
        }

        String resolution_url = (String) attributes.get("resolution_url");

        if (resolution_url != null) {
            setResolution_url(resolution_url);
        }

        String definition_url = (String) attributes.get("definition_url");

        if (definition_url != null) {
            setDefinition_url(definition_url);
        }
    }

    /**
    * Returns the primary key of this identifier.
    *
    * @return the primary key of this identifier
    */
    @Override
    public int getPrimaryKey() {
        return _identifier.getPrimaryKey();
    }

    /**
    * Sets the primary key of this identifier.
    *
    * @param primaryKey the primary key of this identifier
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _identifier.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the identifier_type of this identifier.
    *
    * @return the identifier_type of this identifier
    */
    @Override
    public int getIdentifier_type() {
        return _identifier.getIdentifier_type();
    }

    /**
    * Sets the identifier_type of this identifier.
    *
    * @param identifier_type the identifier_type of this identifier
    */
    @Override
    public void setIdentifier_type(int identifier_type) {
        _identifier.setIdentifier_type(identifier_type);
    }

    /**
    * Returns the identifier_name of this identifier.
    *
    * @return the identifier_name of this identifier
    */
    @Override
    public java.lang.String getIdentifier_name() {
        return _identifier.getIdentifier_name();
    }

    /**
    * Sets the identifier_name of this identifier.
    *
    * @param identifier_name the identifier_name of this identifier
    */
    @Override
    public void setIdentifier_name(java.lang.String identifier_name) {
        _identifier.setIdentifier_name(identifier_name);
    }

    /**
    * Returns the identifier_description_translation_key of this identifier.
    *
    * @return the identifier_description_translation_key of this identifier
    */
    @Override
    public java.lang.String getIdentifier_description_translation_key() {
        return _identifier.getIdentifier_description_translation_key();
    }

    /**
    * Sets the identifier_description_translation_key of this identifier.
    *
    * @param identifier_description_translation_key the identifier_description_translation_key of this identifier
    */
    @Override
    public void setIdentifier_description_translation_key(
        java.lang.String identifier_description_translation_key) {
        _identifier.setIdentifier_description_translation_key(identifier_description_translation_key);
    }

    /**
    * Returns the resolution_url of this identifier.
    *
    * @return the resolution_url of this identifier
    */
    @Override
    public java.lang.String getResolution_url() {
        return _identifier.getResolution_url();
    }

    /**
    * Sets the resolution_url of this identifier.
    *
    * @param resolution_url the resolution_url of this identifier
    */
    @Override
    public void setResolution_url(java.lang.String resolution_url) {
        _identifier.setResolution_url(resolution_url);
    }

    /**
    * Returns the definition_url of this identifier.
    *
    * @return the definition_url of this identifier
    */
    @Override
    public java.lang.String getDefinition_url() {
        return _identifier.getDefinition_url();
    }

    /**
    * Sets the definition_url of this identifier.
    *
    * @param definition_url the definition_url of this identifier
    */
    @Override
    public void setDefinition_url(java.lang.String definition_url) {
        _identifier.setDefinition_url(definition_url);
    }

    @Override
    public boolean isNew() {
        return _identifier.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _identifier.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _identifier.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _identifier.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _identifier.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _identifier.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _identifier.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _identifier.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _identifier.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _identifier.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _identifier.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new IdentifierWrapper((Identifier) _identifier.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.tupa.db.model.Identifier identifier) {
        return _identifier.compareTo(identifier);
    }

    @Override
    public int hashCode() {
        return _identifier.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.Identifier> toCacheModel() {
        return _identifier.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Identifier toEscapedModel() {
        return new IdentifierWrapper(_identifier.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Identifier toUnescapedModel() {
        return new IdentifierWrapper(_identifier.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _identifier.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _identifier.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _identifier.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof IdentifierWrapper)) {
            return false;
        }

        IdentifierWrapper identifierWrapper = (IdentifierWrapper) obj;

        if (Validator.equals(_identifier, identifierWrapper._identifier)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Identifier getWrappedIdentifier() {
        return _identifier;
    }

    @Override
    public Identifier getWrappedModel() {
        return _identifier;
    }

    @Override
    public void resetOriginalValues() {
        _identifier.resetOriginalValues();
    }
}
