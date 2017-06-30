package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Selite}.
 * </p>
 *
 * @author CSC
 * @see Selite
 * @generated
 */
public class SeliteWrapper implements Selite, ModelWrapper<Selite> {
    private Selite _selite;

    public SeliteWrapper(Selite selite) {
        _selite = selite;
    }

    @Override
    public Class<?> getModelClass() {
        return Selite.class;
    }

    @Override
    public String getModelClassName() {
        return Selite.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("selite_id", getSelite_id());
        attributes.put("nimi", getNimi());
        attributes.put("name", getName());
        attributes.put("kuvaus", getKuvaus());
        attributes.put("description", getDescription());
        attributes.put("classificator", getClassificator());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer selite_id = (Integer) attributes.get("selite_id");

        if (selite_id != null) {
            setSelite_id(selite_id);
        }

        String nimi = (String) attributes.get("nimi");

        if (nimi != null) {
            setNimi(nimi);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String kuvaus = (String) attributes.get("kuvaus");

        if (kuvaus != null) {
            setKuvaus(kuvaus);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        String classificator = (String) attributes.get("classificator");

        if (classificator != null) {
            setClassificator(classificator);
        }
    }

    /**
    * Returns the primary key of this selite.
    *
    * @return the primary key of this selite
    */
    @Override
    public int getPrimaryKey() {
        return _selite.getPrimaryKey();
    }

    /**
    * Sets the primary key of this selite.
    *
    * @param primaryKey the primary key of this selite
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _selite.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the selite_id of this selite.
    *
    * @return the selite_id of this selite
    */
    @Override
    public int getSelite_id() {
        return _selite.getSelite_id();
    }

    /**
    * Sets the selite_id of this selite.
    *
    * @param selite_id the selite_id of this selite
    */
    @Override
    public void setSelite_id(int selite_id) {
        _selite.setSelite_id(selite_id);
    }

    /**
    * Returns the nimi of this selite.
    *
    * @return the nimi of this selite
    */
    @Override
    public java.lang.String getNimi() {
        return _selite.getNimi();
    }

    /**
    * Sets the nimi of this selite.
    *
    * @param nimi the nimi of this selite
    */
    @Override
    public void setNimi(java.lang.String nimi) {
        _selite.setNimi(nimi);
    }

    /**
    * Returns the name of this selite.
    *
    * @return the name of this selite
    */
    @Override
    public java.lang.String getName() {
        return _selite.getName();
    }

    /**
    * Sets the name of this selite.
    *
    * @param name the name of this selite
    */
    @Override
    public void setName(java.lang.String name) {
        _selite.setName(name);
    }

    /**
    * Returns the kuvaus of this selite.
    *
    * @return the kuvaus of this selite
    */
    @Override
    public java.lang.String getKuvaus() {
        return _selite.getKuvaus();
    }

    /**
    * Sets the kuvaus of this selite.
    *
    * @param kuvaus the kuvaus of this selite
    */
    @Override
    public void setKuvaus(java.lang.String kuvaus) {
        _selite.setKuvaus(kuvaus);
    }

    /**
    * Returns the description of this selite.
    *
    * @return the description of this selite
    */
    @Override
    public java.lang.String getDescription() {
        return _selite.getDescription();
    }

    /**
    * Sets the description of this selite.
    *
    * @param description the description of this selite
    */
    @Override
    public void setDescription(java.lang.String description) {
        _selite.setDescription(description);
    }

    /**
    * Returns the classificator of this selite.
    *
    * @return the classificator of this selite
    */
    @Override
    public java.lang.String getClassificator() {
        return _selite.getClassificator();
    }

    /**
    * Sets the classificator of this selite.
    *
    * @param classificator the classificator of this selite
    */
    @Override
    public void setClassificator(java.lang.String classificator) {
        _selite.setClassificator(classificator);
    }

    @Override
    public boolean isNew() {
        return _selite.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _selite.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _selite.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _selite.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _selite.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _selite.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _selite.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _selite.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _selite.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _selite.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _selite.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new SeliteWrapper((Selite) _selite.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.tupa.db.model.Selite selite) {
        return _selite.compareTo(selite);
    }

    @Override
    public int hashCode() {
        return _selite.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.Selite> toCacheModel() {
        return _selite.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Selite toEscapedModel() {
        return new SeliteWrapper(_selite.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Selite toUnescapedModel() {
        return new SeliteWrapper(_selite.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _selite.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _selite.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _selite.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SeliteWrapper)) {
            return false;
        }

        SeliteWrapper seliteWrapper = (SeliteWrapper) obj;

        if (Validator.equals(_selite, seliteWrapper._selite)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Selite getWrappedSelite() {
        return _selite;
    }

    @Override
    public Selite getWrappedModel() {
        return _selite;
    }

    @Override
    public void resetOriginalValues() {
        _selite.resetOriginalValues();
    }
}
