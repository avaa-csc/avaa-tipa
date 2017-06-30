package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TpContact}.
 * </p>
 *
 * @author CSC
 * @see TpContact
 * @generated
 */
public class TpContactWrapper implements TpContact, ModelWrapper<TpContact> {
    private TpContact _tpContact;

    public TpContactWrapper(TpContact tpContact) {
        _tpContact = tpContact;
    }

    @Override
    public Class<?> getModelClass() {
        return TpContact.class;
    }

    @Override
    public String getModelClassName() {
        return TpContact.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("email", getEmail());
        attributes.put("phone", getPhone());
        attributes.put("title", getTitle());
        attributes.put("firstName", getFirstName());
        attributes.put("lastName", getLastName());
        attributes.put("url", getUrl());
        attributes.put("description_EN", getDescription_EN());
        attributes.put("description_FI", getDescription_FI());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer id = (Integer) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String phone = (String) attributes.get("phone");

        if (phone != null) {
            setPhone(phone);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String firstName = (String) attributes.get("firstName");

        if (firstName != null) {
            setFirstName(firstName);
        }

        String lastName = (String) attributes.get("lastName");

        if (lastName != null) {
            setLastName(lastName);
        }

        String url = (String) attributes.get("url");

        if (url != null) {
            setUrl(url);
        }

        String description_EN = (String) attributes.get("description_EN");

        if (description_EN != null) {
            setDescription_EN(description_EN);
        }

        String description_FI = (String) attributes.get("description_FI");

        if (description_FI != null) {
            setDescription_FI(description_FI);
        }
    }

    /**
    * Returns the primary key of this tp contact.
    *
    * @return the primary key of this tp contact
    */
    @Override
    public int getPrimaryKey() {
        return _tpContact.getPrimaryKey();
    }

    /**
    * Sets the primary key of this tp contact.
    *
    * @param primaryKey the primary key of this tp contact
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _tpContact.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this tp contact.
    *
    * @return the ID of this tp contact
    */
    @Override
    public int getId() {
        return _tpContact.getId();
    }

    /**
    * Sets the ID of this tp contact.
    *
    * @param id the ID of this tp contact
    */
    @Override
    public void setId(int id) {
        _tpContact.setId(id);
    }

    /**
    * Returns the email of this tp contact.
    *
    * @return the email of this tp contact
    */
    @Override
    public java.lang.String getEmail() {
        return _tpContact.getEmail();
    }

    /**
    * Sets the email of this tp contact.
    *
    * @param email the email of this tp contact
    */
    @Override
    public void setEmail(java.lang.String email) {
        _tpContact.setEmail(email);
    }

    /**
    * Returns the phone of this tp contact.
    *
    * @return the phone of this tp contact
    */
    @Override
    public java.lang.String getPhone() {
        return _tpContact.getPhone();
    }

    /**
    * Sets the phone of this tp contact.
    *
    * @param phone the phone of this tp contact
    */
    @Override
    public void setPhone(java.lang.String phone) {
        _tpContact.setPhone(phone);
    }

    /**
    * Returns the title of this tp contact.
    *
    * @return the title of this tp contact
    */
    @Override
    public java.lang.String getTitle() {
        return _tpContact.getTitle();
    }

    /**
    * Sets the title of this tp contact.
    *
    * @param title the title of this tp contact
    */
    @Override
    public void setTitle(java.lang.String title) {
        _tpContact.setTitle(title);
    }

    /**
    * Returns the first name of this tp contact.
    *
    * @return the first name of this tp contact
    */
    @Override
    public java.lang.String getFirstName() {
        return _tpContact.getFirstName();
    }

    /**
    * Sets the first name of this tp contact.
    *
    * @param firstName the first name of this tp contact
    */
    @Override
    public void setFirstName(java.lang.String firstName) {
        _tpContact.setFirstName(firstName);
    }

    /**
    * Returns the last name of this tp contact.
    *
    * @return the last name of this tp contact
    */
    @Override
    public java.lang.String getLastName() {
        return _tpContact.getLastName();
    }

    /**
    * Sets the last name of this tp contact.
    *
    * @param lastName the last name of this tp contact
    */
    @Override
    public void setLastName(java.lang.String lastName) {
        _tpContact.setLastName(lastName);
    }

    /**
    * Returns the url of this tp contact.
    *
    * @return the url of this tp contact
    */
    @Override
    public java.lang.String getUrl() {
        return _tpContact.getUrl();
    }

    /**
    * Sets the url of this tp contact.
    *
    * @param url the url of this tp contact
    */
    @Override
    public void setUrl(java.lang.String url) {
        _tpContact.setUrl(url);
    }

    /**
    * Returns the description_ e n of this tp contact.
    *
    * @return the description_ e n of this tp contact
    */
    @Override
    public java.lang.String getDescription_EN() {
        return _tpContact.getDescription_EN();
    }

    /**
    * Sets the description_ e n of this tp contact.
    *
    * @param description_EN the description_ e n of this tp contact
    */
    @Override
    public void setDescription_EN(java.lang.String description_EN) {
        _tpContact.setDescription_EN(description_EN);
    }

    /**
    * Returns the description_ f i of this tp contact.
    *
    * @return the description_ f i of this tp contact
    */
    @Override
    public java.lang.String getDescription_FI() {
        return _tpContact.getDescription_FI();
    }

    /**
    * Sets the description_ f i of this tp contact.
    *
    * @param description_FI the description_ f i of this tp contact
    */
    @Override
    public void setDescription_FI(java.lang.String description_FI) {
        _tpContact.setDescription_FI(description_FI);
    }

    @Override
    public boolean isNew() {
        return _tpContact.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _tpContact.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _tpContact.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _tpContact.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _tpContact.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _tpContact.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _tpContact.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _tpContact.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _tpContact.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _tpContact.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _tpContact.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new TpContactWrapper((TpContact) _tpContact.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.tupa.db.model.TpContact tpContact) {
        return _tpContact.compareTo(tpContact);
    }

    @Override
    public int hashCode() {
        return _tpContact.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.TpContact> toCacheModel() {
        return _tpContact.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.TpContact toEscapedModel() {
        return new TpContactWrapper(_tpContact.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.TpContact toUnescapedModel() {
        return new TpContactWrapper(_tpContact.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _tpContact.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _tpContact.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _tpContact.persist();
    }

    @Override
    public int[] getInfrastructuresIds() {
        return _tpContact.getInfrastructuresIds();
    }

    @Override
    public void setInfrastructuresIds(int[] infrastructuresIds) {
        _tpContact.setInfrastructuresIds(infrastructuresIds);
    }

    @Override
    public int[] getServicesIds() {
        return _tpContact.getServicesIds();
    }

    @Override
    public void setServicesIds(int[] servicesIds) {
        _tpContact.setServicesIds(servicesIds);
    }

    @Override
    public int[] getOrganisationsIds() {
        return _tpContact.getOrganisationsIds();
    }

    @Override
    public void setOrganisationsIds(int[] organisationsIds) {
        _tpContact.setOrganisationsIds(organisationsIds);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TpContactWrapper)) {
            return false;
        }

        TpContactWrapper tpContactWrapper = (TpContactWrapper) obj;

        if (Validator.equals(_tpContact, tpContactWrapper._tpContact)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public TpContact getWrappedTpContact() {
        return _tpContact;
    }

    @Override
    public TpContact getWrappedModel() {
        return _tpContact;
    }

    @Override
    public void resetOriginalValues() {
        _tpContact.resetOriginalValues();
    }
}
