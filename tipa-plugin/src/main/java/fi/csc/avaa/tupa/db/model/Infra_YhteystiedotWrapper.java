package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Infra_Yhteystiedot}.
 * </p>
 *
 * @author pj,jmlehtin
 * @see Infra_Yhteystiedot
 * @generated
 */
public class Infra_YhteystiedotWrapper implements Infra_Yhteystiedot,
    ModelWrapper<Infra_Yhteystiedot> {
    private Infra_Yhteystiedot _infra_Yhteystiedot;

    public Infra_YhteystiedotWrapper(Infra_Yhteystiedot infra_Yhteystiedot) {
        _infra_Yhteystiedot = infra_Yhteystiedot;
    }

    @Override
    public Class<?> getModelClass() {
        return Infra_Yhteystiedot.class;
    }

    @Override
    public String getModelClassName() {
        return Infra_Yhteystiedot.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("infra_id", getInfra_id());
        attributes.put("yhteystieto_id", getYhteystieto_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer infra_id = (Integer) attributes.get("infra_id");

        if (infra_id != null) {
            setInfra_id(infra_id);
        }

        Integer yhteystieto_id = (Integer) attributes.get("yhteystieto_id");

        if (yhteystieto_id != null) {
            setYhteystieto_id(yhteystieto_id);
        }
    }

    /**
    * Returns the primary key of this infra_ yhteystiedot.
    *
    * @return the primary key of this infra_ yhteystiedot
    */
    @Override
    public fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK getPrimaryKey() {
        return _infra_Yhteystiedot.getPrimaryKey();
    }

    /**
    * Sets the primary key of this infra_ yhteystiedot.
    *
    * @param primaryKey the primary key of this infra_ yhteystiedot
    */
    @Override
    public void setPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK primaryKey) {
        _infra_Yhteystiedot.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the infra_id of this infra_ yhteystiedot.
    *
    * @return the infra_id of this infra_ yhteystiedot
    */
    @Override
    public int getInfra_id() {
        return _infra_Yhteystiedot.getInfra_id();
    }

    /**
    * Sets the infra_id of this infra_ yhteystiedot.
    *
    * @param infra_id the infra_id of this infra_ yhteystiedot
    */
    @Override
    public void setInfra_id(int infra_id) {
        _infra_Yhteystiedot.setInfra_id(infra_id);
    }

    /**
    * Returns the yhteystieto_id of this infra_ yhteystiedot.
    *
    * @return the yhteystieto_id of this infra_ yhteystiedot
    */
    @Override
    public int getYhteystieto_id() {
        return _infra_Yhteystiedot.getYhteystieto_id();
    }

    /**
    * Sets the yhteystieto_id of this infra_ yhteystiedot.
    *
    * @param yhteystieto_id the yhteystieto_id of this infra_ yhteystiedot
    */
    @Override
    public void setYhteystieto_id(int yhteystieto_id) {
        _infra_Yhteystiedot.setYhteystieto_id(yhteystieto_id);
    }

    @Override
    public boolean isNew() {
        return _infra_Yhteystiedot.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _infra_Yhteystiedot.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _infra_Yhteystiedot.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _infra_Yhteystiedot.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _infra_Yhteystiedot.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _infra_Yhteystiedot.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _infra_Yhteystiedot.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _infra_Yhteystiedot.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _infra_Yhteystiedot.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _infra_Yhteystiedot.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _infra_Yhteystiedot.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Infra_YhteystiedotWrapper((Infra_Yhteystiedot) _infra_Yhteystiedot.clone());
    }

    @Override
    public int compareTo(
        fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot infra_Yhteystiedot) {
        return _infra_Yhteystiedot.compareTo(infra_Yhteystiedot);
    }

    @Override
    public int hashCode() {
        return _infra_Yhteystiedot.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot> toCacheModel() {
        return _infra_Yhteystiedot.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot toEscapedModel() {
        return new Infra_YhteystiedotWrapper(_infra_Yhteystiedot.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot toUnescapedModel() {
        return new Infra_YhteystiedotWrapper(_infra_Yhteystiedot.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _infra_Yhteystiedot.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _infra_Yhteystiedot.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _infra_Yhteystiedot.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Infra_YhteystiedotWrapper)) {
            return false;
        }

        Infra_YhteystiedotWrapper infra_YhteystiedotWrapper = (Infra_YhteystiedotWrapper) obj;

        if (Validator.equals(_infra_Yhteystiedot,
                    infra_YhteystiedotWrapper._infra_Yhteystiedot)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Infra_Yhteystiedot getWrappedInfra_Yhteystiedot() {
        return _infra_Yhteystiedot;
    }

    @Override
    public Infra_Yhteystiedot getWrappedModel() {
        return _infra_Yhteystiedot;
    }

    @Override
    public void resetOriginalValues() {
        _infra_Yhteystiedot.resetOriginalValues();
    }
}
