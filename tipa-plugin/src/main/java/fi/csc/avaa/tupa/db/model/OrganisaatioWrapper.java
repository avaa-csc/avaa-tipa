package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Organisaatio}.
 * </p>
 *
 * @author pj,jmlehtin
 * @see Organisaatio
 * @generated
 */
public class OrganisaatioWrapper implements Organisaatio,
    ModelWrapper<Organisaatio> {
    private Organisaatio _organisaatio;

    public OrganisaatioWrapper(Organisaatio organisaatio) {
        _organisaatio = organisaatio;
    }

    @Override
    public Class<?> getModelClass() {
        return Organisaatio.class;
    }

    @Override
    public String getModelClassName() {
        return Organisaatio.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("organisaatio_id", getOrganisaatio_id());
        attributes.put("nimi", getNimi());
        attributes.put("name", getName());
        attributes.put("maa", getMaa());
        attributes.put("ISNI", getISNI());
        attributes.put("crmid", getCrmid());
        attributes.put("emo_organisaatio", getEmo_organisaatio());
        attributes.put("kv_isanta", getKv_isanta());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer organisaatio_id = (Integer) attributes.get("organisaatio_id");

        if (organisaatio_id != null) {
            setOrganisaatio_id(organisaatio_id);
        }

        String nimi = (String) attributes.get("nimi");

        if (nimi != null) {
            setNimi(nimi);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String maa = (String) attributes.get("maa");

        if (maa != null) {
            setMaa(maa);
        }

        String ISNI = (String) attributes.get("ISNI");

        if (ISNI != null) {
            setISNI(ISNI);
        }

        String crmid = (String) attributes.get("crmid");

        if (crmid != null) {
            setCrmid(crmid);
        }

        Integer emo_organisaatio = (Integer) attributes.get("emo_organisaatio");

        if (emo_organisaatio != null) {
            setEmo_organisaatio(emo_organisaatio);
        }

        Boolean kv_isanta = (Boolean) attributes.get("kv_isanta");

        if (kv_isanta != null) {
            setKv_isanta(kv_isanta);
        }
    }

    /**
    * Returns the primary key of this organisaatio.
    *
    * @return the primary key of this organisaatio
    */
    @Override
    public int getPrimaryKey() {
        return _organisaatio.getPrimaryKey();
    }

    /**
    * Sets the primary key of this organisaatio.
    *
    * @param primaryKey the primary key of this organisaatio
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _organisaatio.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the organisaatio_id of this organisaatio.
    *
    * @return the organisaatio_id of this organisaatio
    */
    @Override
    public int getOrganisaatio_id() {
        return _organisaatio.getOrganisaatio_id();
    }

    /**
    * Sets the organisaatio_id of this organisaatio.
    *
    * @param organisaatio_id the organisaatio_id of this organisaatio
    */
    @Override
    public void setOrganisaatio_id(int organisaatio_id) {
        _organisaatio.setOrganisaatio_id(organisaatio_id);
    }

    /**
    * Returns the nimi of this organisaatio.
    *
    * @return the nimi of this organisaatio
    */
    @Override
    public java.lang.String getNimi() {
        return _organisaatio.getNimi();
    }

    /**
    * Sets the nimi of this organisaatio.
    *
    * @param nimi the nimi of this organisaatio
    */
    @Override
    public void setNimi(java.lang.String nimi) {
        _organisaatio.setNimi(nimi);
    }

    /**
    * Returns the name of this organisaatio.
    *
    * @return the name of this organisaatio
    */
    @Override
    public java.lang.String getName() {
        return _organisaatio.getName();
    }

    /**
    * Sets the name of this organisaatio.
    *
    * @param name the name of this organisaatio
    */
    @Override
    public void setName(java.lang.String name) {
        _organisaatio.setName(name);
    }

    /**
    * Returns the maa of this organisaatio.
    *
    * @return the maa of this organisaatio
    */
    @Override
    public java.lang.String getMaa() {
        return _organisaatio.getMaa();
    }

    /**
    * Sets the maa of this organisaatio.
    *
    * @param maa the maa of this organisaatio
    */
    @Override
    public void setMaa(java.lang.String maa) {
        _organisaatio.setMaa(maa);
    }

    /**
    * Returns the i s n i of this organisaatio.
    *
    * @return the i s n i of this organisaatio
    */
    @Override
    public java.lang.String getISNI() {
        return _organisaatio.getISNI();
    }

    /**
    * Sets the i s n i of this organisaatio.
    *
    * @param ISNI the i s n i of this organisaatio
    */
    @Override
    public void setISNI(java.lang.String ISNI) {
        _organisaatio.setISNI(ISNI);
    }

    /**
    * Returns the crmid of this organisaatio.
    *
    * @return the crmid of this organisaatio
    */
    @Override
    public java.lang.String getCrmid() {
        return _organisaatio.getCrmid();
    }

    /**
    * Sets the crmid of this organisaatio.
    *
    * @param crmid the crmid of this organisaatio
    */
    @Override
    public void setCrmid(java.lang.String crmid) {
        _organisaatio.setCrmid(crmid);
    }

    /**
    * Returns the emo_organisaatio of this organisaatio.
    *
    * @return the emo_organisaatio of this organisaatio
    */
    @Override
    public int getEmo_organisaatio() {
        return _organisaatio.getEmo_organisaatio();
    }

    /**
    * Sets the emo_organisaatio of this organisaatio.
    *
    * @param emo_organisaatio the emo_organisaatio of this organisaatio
    */
    @Override
    public void setEmo_organisaatio(int emo_organisaatio) {
        _organisaatio.setEmo_organisaatio(emo_organisaatio);
    }

    /**
    * Returns the kv_isanta of this organisaatio.
    *
    * @return the kv_isanta of this organisaatio
    */
    @Override
    public boolean getKv_isanta() {
        return _organisaatio.getKv_isanta();
    }

    /**
    * Returns <code>true</code> if this organisaatio is kv_isanta.
    *
    * @return <code>true</code> if this organisaatio is kv_isanta; <code>false</code> otherwise
    */
    @Override
    public boolean isKv_isanta() {
        return _organisaatio.isKv_isanta();
    }

    /**
    * Sets whether this organisaatio is kv_isanta.
    *
    * @param kv_isanta the kv_isanta of this organisaatio
    */
    @Override
    public void setKv_isanta(boolean kv_isanta) {
        _organisaatio.setKv_isanta(kv_isanta);
    }

    @Override
    public boolean isNew() {
        return _organisaatio.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _organisaatio.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _organisaatio.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _organisaatio.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _organisaatio.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _organisaatio.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _organisaatio.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _organisaatio.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _organisaatio.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _organisaatio.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _organisaatio.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new OrganisaatioWrapper((Organisaatio) _organisaatio.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.tupa.db.model.Organisaatio organisaatio) {
        return _organisaatio.compareTo(organisaatio);
    }

    @Override
    public int hashCode() {
        return _organisaatio.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.Organisaatio> toCacheModel() {
        return _organisaatio.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Organisaatio toEscapedModel() {
        return new OrganisaatioWrapper(_organisaatio.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Organisaatio toUnescapedModel() {
        return new OrganisaatioWrapper(_organisaatio.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _organisaatio.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _organisaatio.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _organisaatio.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof OrganisaatioWrapper)) {
            return false;
        }

        OrganisaatioWrapper organisaatioWrapper = (OrganisaatioWrapper) obj;

        if (Validator.equals(_organisaatio, organisaatioWrapper._organisaatio)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Organisaatio getWrappedOrganisaatio() {
        return _organisaatio;
    }

    @Override
    public Organisaatio getWrappedModel() {
        return _organisaatio;
    }

    @Override
    public void resetOriginalValues() {
        _organisaatio.resetOriginalValues();
    }
}
