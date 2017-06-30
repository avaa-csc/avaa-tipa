package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Infra_Vastuuorganisaatiot}.
 * </p>
 *
 * @author CSC
 * @see Infra_Vastuuorganisaatiot
 * @generated
 */
public class Infra_VastuuorganisaatiotWrapper
    implements Infra_Vastuuorganisaatiot,
        ModelWrapper<Infra_Vastuuorganisaatiot> {
    private Infra_Vastuuorganisaatiot _infra_Vastuuorganisaatiot;

    public Infra_VastuuorganisaatiotWrapper(
        Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot) {
        _infra_Vastuuorganisaatiot = infra_Vastuuorganisaatiot;
    }

    @Override
    public Class<?> getModelClass() {
        return Infra_Vastuuorganisaatiot.class;
    }

    @Override
    public String getModelClassName() {
        return Infra_Vastuuorganisaatiot.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("infra_id", getInfra_id());
        attributes.put("organisaatio_id", getOrganisaatio_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer infra_id = (Integer) attributes.get("infra_id");

        if (infra_id != null) {
            setInfra_id(infra_id);
        }

        Integer organisaatio_id = (Integer) attributes.get("organisaatio_id");

        if (organisaatio_id != null) {
            setOrganisaatio_id(organisaatio_id);
        }
    }

    /**
    * Returns the primary key of this infra_ vastuuorganisaatiot.
    *
    * @return the primary key of this infra_ vastuuorganisaatiot
    */
    @Override
    public fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK getPrimaryKey() {
        return _infra_Vastuuorganisaatiot.getPrimaryKey();
    }

    /**
    * Sets the primary key of this infra_ vastuuorganisaatiot.
    *
    * @param primaryKey the primary key of this infra_ vastuuorganisaatiot
    */
    @Override
    public void setPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK primaryKey) {
        _infra_Vastuuorganisaatiot.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the infra_id of this infra_ vastuuorganisaatiot.
    *
    * @return the infra_id of this infra_ vastuuorganisaatiot
    */
    @Override
    public int getInfra_id() {
        return _infra_Vastuuorganisaatiot.getInfra_id();
    }

    /**
    * Sets the infra_id of this infra_ vastuuorganisaatiot.
    *
    * @param infra_id the infra_id of this infra_ vastuuorganisaatiot
    */
    @Override
    public void setInfra_id(int infra_id) {
        _infra_Vastuuorganisaatiot.setInfra_id(infra_id);
    }

    /**
    * Returns the organisaatio_id of this infra_ vastuuorganisaatiot.
    *
    * @return the organisaatio_id of this infra_ vastuuorganisaatiot
    */
    @Override
    public int getOrganisaatio_id() {
        return _infra_Vastuuorganisaatiot.getOrganisaatio_id();
    }

    /**
    * Sets the organisaatio_id of this infra_ vastuuorganisaatiot.
    *
    * @param organisaatio_id the organisaatio_id of this infra_ vastuuorganisaatiot
    */
    @Override
    public void setOrganisaatio_id(int organisaatio_id) {
        _infra_Vastuuorganisaatiot.setOrganisaatio_id(organisaatio_id);
    }

    @Override
    public boolean isNew() {
        return _infra_Vastuuorganisaatiot.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _infra_Vastuuorganisaatiot.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _infra_Vastuuorganisaatiot.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _infra_Vastuuorganisaatiot.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _infra_Vastuuorganisaatiot.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _infra_Vastuuorganisaatiot.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _infra_Vastuuorganisaatiot.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _infra_Vastuuorganisaatiot.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _infra_Vastuuorganisaatiot.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _infra_Vastuuorganisaatiot.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _infra_Vastuuorganisaatiot.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Infra_VastuuorganisaatiotWrapper((Infra_Vastuuorganisaatiot) _infra_Vastuuorganisaatiot.clone());
    }

    @Override
    public int compareTo(
        fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot) {
        return _infra_Vastuuorganisaatiot.compareTo(infra_Vastuuorganisaatiot);
    }

    @Override
    public int hashCode() {
        return _infra_Vastuuorganisaatiot.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> toCacheModel() {
        return _infra_Vastuuorganisaatiot.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot toEscapedModel() {
        return new Infra_VastuuorganisaatiotWrapper(_infra_Vastuuorganisaatiot.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot toUnescapedModel() {
        return new Infra_VastuuorganisaatiotWrapper(_infra_Vastuuorganisaatiot.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _infra_Vastuuorganisaatiot.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _infra_Vastuuorganisaatiot.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _infra_Vastuuorganisaatiot.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Infra_VastuuorganisaatiotWrapper)) {
            return false;
        }

        Infra_VastuuorganisaatiotWrapper infra_VastuuorganisaatiotWrapper = (Infra_VastuuorganisaatiotWrapper) obj;

        if (Validator.equals(_infra_Vastuuorganisaatiot,
                    infra_VastuuorganisaatiotWrapper._infra_Vastuuorganisaatiot)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Infra_Vastuuorganisaatiot getWrappedInfra_Vastuuorganisaatiot() {
        return _infra_Vastuuorganisaatiot;
    }

    @Override
    public Infra_Vastuuorganisaatiot getWrappedModel() {
        return _infra_Vastuuorganisaatiot;
    }

    @Override
    public void resetOriginalValues() {
        _infra_Vastuuorganisaatiot.resetOriginalValues();
    }
}
