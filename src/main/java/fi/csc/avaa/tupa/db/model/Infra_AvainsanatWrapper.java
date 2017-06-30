package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Infra_Avainsanat}.
 * </p>
 *
 * @author CSC
 * @see Infra_Avainsanat
 * @generated
 */
public class Infra_AvainsanatWrapper implements Infra_Avainsanat,
    ModelWrapper<Infra_Avainsanat> {
    private Infra_Avainsanat _infra_Avainsanat;

    public Infra_AvainsanatWrapper(Infra_Avainsanat infra_Avainsanat) {
        _infra_Avainsanat = infra_Avainsanat;
    }

    @Override
    public Class<?> getModelClass() {
        return Infra_Avainsanat.class;
    }

    @Override
    public String getModelClassName() {
        return Infra_Avainsanat.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("infra_id", getInfra_id());
        attributes.put("avainsana_id", getAvainsana_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer infra_id = (Integer) attributes.get("infra_id");

        if (infra_id != null) {
            setInfra_id(infra_id);
        }

        Integer avainsana_id = (Integer) attributes.get("avainsana_id");

        if (avainsana_id != null) {
            setAvainsana_id(avainsana_id);
        }
    }

    /**
    * Returns the primary key of this infra_ avainsanat.
    *
    * @return the primary key of this infra_ avainsanat
    */
    @Override
    public fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK getPrimaryKey() {
        return _infra_Avainsanat.getPrimaryKey();
    }

    /**
    * Sets the primary key of this infra_ avainsanat.
    *
    * @param primaryKey the primary key of this infra_ avainsanat
    */
    @Override
    public void setPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK primaryKey) {
        _infra_Avainsanat.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the infra_id of this infra_ avainsanat.
    *
    * @return the infra_id of this infra_ avainsanat
    */
    @Override
    public int getInfra_id() {
        return _infra_Avainsanat.getInfra_id();
    }

    /**
    * Sets the infra_id of this infra_ avainsanat.
    *
    * @param infra_id the infra_id of this infra_ avainsanat
    */
    @Override
    public void setInfra_id(int infra_id) {
        _infra_Avainsanat.setInfra_id(infra_id);
    }

    /**
    * Returns the avainsana_id of this infra_ avainsanat.
    *
    * @return the avainsana_id of this infra_ avainsanat
    */
    @Override
    public int getAvainsana_id() {
        return _infra_Avainsanat.getAvainsana_id();
    }

    /**
    * Sets the avainsana_id of this infra_ avainsanat.
    *
    * @param avainsana_id the avainsana_id of this infra_ avainsanat
    */
    @Override
    public void setAvainsana_id(int avainsana_id) {
        _infra_Avainsanat.setAvainsana_id(avainsana_id);
    }

    @Override
    public boolean isNew() {
        return _infra_Avainsanat.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _infra_Avainsanat.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _infra_Avainsanat.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _infra_Avainsanat.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _infra_Avainsanat.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _infra_Avainsanat.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _infra_Avainsanat.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _infra_Avainsanat.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _infra_Avainsanat.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _infra_Avainsanat.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _infra_Avainsanat.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Infra_AvainsanatWrapper((Infra_Avainsanat) _infra_Avainsanat.clone());
    }

    @Override
    public int compareTo(
        fi.csc.avaa.tupa.db.model.Infra_Avainsanat infra_Avainsanat) {
        return _infra_Avainsanat.compareTo(infra_Avainsanat);
    }

    @Override
    public int hashCode() {
        return _infra_Avainsanat.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.Infra_Avainsanat> toCacheModel() {
        return _infra_Avainsanat.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Avainsanat toEscapedModel() {
        return new Infra_AvainsanatWrapper(_infra_Avainsanat.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Avainsanat toUnescapedModel() {
        return new Infra_AvainsanatWrapper(_infra_Avainsanat.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _infra_Avainsanat.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _infra_Avainsanat.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _infra_Avainsanat.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Infra_AvainsanatWrapper)) {
            return false;
        }

        Infra_AvainsanatWrapper infra_AvainsanatWrapper = (Infra_AvainsanatWrapper) obj;

        if (Validator.equals(_infra_Avainsanat,
                    infra_AvainsanatWrapper._infra_Avainsanat)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Infra_Avainsanat getWrappedInfra_Avainsanat() {
        return _infra_Avainsanat;
    }

    @Override
    public Infra_Avainsanat getWrappedModel() {
        return _infra_Avainsanat;
    }

    @Override
    public void resetOriginalValues() {
        _infra_Avainsanat.resetOriginalValues();
    }
}
