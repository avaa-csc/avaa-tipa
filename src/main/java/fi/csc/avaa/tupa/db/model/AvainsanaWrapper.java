package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Avainsana}.
 * </p>
 *
 * @author CSC
 * @see Avainsana
 * @generated
 */
public class AvainsanaWrapper implements Avainsana, ModelWrapper<Avainsana> {
    private Avainsana _avainsana;

    public AvainsanaWrapper(Avainsana avainsana) {
        _avainsana = avainsana;
    }

    @Override
    public Class<?> getModelClass() {
        return Avainsana.class;
    }

    @Override
    public String getModelClassName() {
        return Avainsana.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("avainsana_id", getAvainsana_id());
        attributes.put("avainsana", getAvainsana());
        attributes.put("keyword", getKeyword());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer avainsana_id = (Integer) attributes.get("avainsana_id");

        if (avainsana_id != null) {
            setAvainsana_id(avainsana_id);
        }

        String avainsana = (String) attributes.get("avainsana");

        if (avainsana != null) {
            setAvainsana(avainsana);
        }

        String keyword = (String) attributes.get("keyword");

        if (keyword != null) {
            setKeyword(keyword);
        }
    }

    /**
    * Returns the primary key of this avainsana.
    *
    * @return the primary key of this avainsana
    */
    @Override
    public int getPrimaryKey() {
        return _avainsana.getPrimaryKey();
    }

    /**
    * Sets the primary key of this avainsana.
    *
    * @param primaryKey the primary key of this avainsana
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _avainsana.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the avainsana_id of this avainsana.
    *
    * @return the avainsana_id of this avainsana
    */
    @Override
    public int getAvainsana_id() {
        return _avainsana.getAvainsana_id();
    }

    /**
    * Sets the avainsana_id of this avainsana.
    *
    * @param avainsana_id the avainsana_id of this avainsana
    */
    @Override
    public void setAvainsana_id(int avainsana_id) {
        _avainsana.setAvainsana_id(avainsana_id);
    }

    /**
    * Returns the avainsana of this avainsana.
    *
    * @return the avainsana of this avainsana
    */
    @Override
    public java.lang.String getAvainsana() {
        return _avainsana.getAvainsana();
    }

    /**
    * Sets the avainsana of this avainsana.
    *
    * @param avainsana the avainsana of this avainsana
    */
    @Override
    public void setAvainsana(java.lang.String avainsana) {
        _avainsana.setAvainsana(avainsana);
    }

    /**
    * Returns the keyword of this avainsana.
    *
    * @return the keyword of this avainsana
    */
    @Override
    public java.lang.String getKeyword() {
        return _avainsana.getKeyword();
    }

    /**
    * Sets the keyword of this avainsana.
    *
    * @param keyword the keyword of this avainsana
    */
    @Override
    public void setKeyword(java.lang.String keyword) {
        _avainsana.setKeyword(keyword);
    }

    @Override
    public boolean isNew() {
        return _avainsana.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _avainsana.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _avainsana.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _avainsana.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _avainsana.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _avainsana.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _avainsana.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _avainsana.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _avainsana.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _avainsana.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _avainsana.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new AvainsanaWrapper((Avainsana) _avainsana.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.tupa.db.model.Avainsana avainsana) {
        return _avainsana.compareTo(avainsana);
    }

    @Override
    public int hashCode() {
        return _avainsana.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.Avainsana> toCacheModel() {
        return _avainsana.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Avainsana toEscapedModel() {
        return new AvainsanaWrapper(_avainsana.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Avainsana toUnescapedModel() {
        return new AvainsanaWrapper(_avainsana.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _avainsana.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _avainsana.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _avainsana.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AvainsanaWrapper)) {
            return false;
        }

        AvainsanaWrapper avainsanaWrapper = (AvainsanaWrapper) obj;

        if (Validator.equals(_avainsana, avainsanaWrapper._avainsana)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Avainsana getWrappedAvainsana() {
        return _avainsana;
    }

    @Override
    public Avainsana getWrappedModel() {
        return _avainsana;
    }

    @Override
    public void resetOriginalValues() {
        _avainsana.resetOriginalValues();
    }
}
