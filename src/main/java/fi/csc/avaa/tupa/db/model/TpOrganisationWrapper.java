package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TpOrganisation}.
 * </p>
 *
 * @author CSC
 * @see TpOrganisation
 * @generated
 */
public class TpOrganisationWrapper implements TpOrganisation,
    ModelWrapper<TpOrganisation> {
    private TpOrganisation _tpOrganisation;

    public TpOrganisationWrapper(TpOrganisation tpOrganisation) {
        _tpOrganisation = tpOrganisation;
    }

    @Override
    public Class<?> getModelClass() {
        return TpOrganisation.class;
    }

    @Override
    public String getModelClassName() {
        return TpOrganisation.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("name_EN", getName_EN());
        attributes.put("name_FI", getName_FI());
        attributes.put("isni", getIsni());
        attributes.put("motherOrganisationsIds", getMotherOrganisationsIds());
        attributes.put("country", getCountry());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer id = (Integer) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String name_EN = (String) attributes.get("name_EN");

        if (name_EN != null) {
            setName_EN(name_EN);
        }

        String name_FI = (String) attributes.get("name_FI");

        if (name_FI != null) {
            setName_FI(name_FI);
        }

        String isni = (String) attributes.get("isni");

        if (isni != null) {
            setIsni(isni);
        }

        Integer motherOrganisationsIds = (Integer) attributes.get(
                "motherOrganisationsIds");

        if (motherOrganisationsIds != null) {
            setMotherOrganisationsIds(motherOrganisationsIds);
        }

        String country = (String) attributes.get("country");

        if (country != null) {
            setCountry(country);
        }
    }

    /**
    * Returns the primary key of this tp organisation.
    *
    * @return the primary key of this tp organisation
    */
    @Override
    public int getPrimaryKey() {
        return _tpOrganisation.getPrimaryKey();
    }

    /**
    * Sets the primary key of this tp organisation.
    *
    * @param primaryKey the primary key of this tp organisation
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _tpOrganisation.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this tp organisation.
    *
    * @return the ID of this tp organisation
    */
    @Override
    public int getId() {
        return _tpOrganisation.getId();
    }

    /**
    * Sets the ID of this tp organisation.
    *
    * @param id the ID of this tp organisation
    */
    @Override
    public void setId(int id) {
        _tpOrganisation.setId(id);
    }

    /**
    * Returns the name_ e n of this tp organisation.
    *
    * @return the name_ e n of this tp organisation
    */
    @Override
    public java.lang.String getName_EN() {
        return _tpOrganisation.getName_EN();
    }

    /**
    * Sets the name_ e n of this tp organisation.
    *
    * @param name_EN the name_ e n of this tp organisation
    */
    @Override
    public void setName_EN(java.lang.String name_EN) {
        _tpOrganisation.setName_EN(name_EN);
    }

    /**
    * Returns the name_ f i of this tp organisation.
    *
    * @return the name_ f i of this tp organisation
    */
    @Override
    public java.lang.String getName_FI() {
        return _tpOrganisation.getName_FI();
    }

    /**
    * Sets the name_ f i of this tp organisation.
    *
    * @param name_FI the name_ f i of this tp organisation
    */
    @Override
    public void setName_FI(java.lang.String name_FI) {
        _tpOrganisation.setName_FI(name_FI);
    }

    /**
    * Returns the isni of this tp organisation.
    *
    * @return the isni of this tp organisation
    */
    @Override
    public java.lang.String getIsni() {
        return _tpOrganisation.getIsni();
    }

    /**
    * Sets the isni of this tp organisation.
    *
    * @param isni the isni of this tp organisation
    */
    @Override
    public void setIsni(java.lang.String isni) {
        _tpOrganisation.setIsni(isni);
    }

    /**
    * Returns the mother organisations IDs of this tp organisation.
    *
    * @return the mother organisations IDs of this tp organisation
    */
    @Override
    public int getMotherOrganisationsIds() {
        return _tpOrganisation.getMotherOrganisationsIds();
    }

    /**
    * Sets the mother organisations IDs of this tp organisation.
    *
    * @param motherOrganisationsIds the mother organisations IDs of this tp organisation
    */
    @Override
    public void setMotherOrganisationsIds(int motherOrganisationsIds) {
        _tpOrganisation.setMotherOrganisationsIds(motherOrganisationsIds);
    }

    /**
    * Returns the country of this tp organisation.
    *
    * @return the country of this tp organisation
    */
    @Override
    public java.lang.String getCountry() {
        return _tpOrganisation.getCountry();
    }

    /**
    * Sets the country of this tp organisation.
    *
    * @param country the country of this tp organisation
    */
    @Override
    public void setCountry(java.lang.String country) {
        _tpOrganisation.setCountry(country);
    }

    @Override
    public boolean isNew() {
        return _tpOrganisation.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _tpOrganisation.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _tpOrganisation.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _tpOrganisation.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _tpOrganisation.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _tpOrganisation.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _tpOrganisation.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _tpOrganisation.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _tpOrganisation.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _tpOrganisation.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _tpOrganisation.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new TpOrganisationWrapper((TpOrganisation) _tpOrganisation.clone());
    }

    @Override
    public int compareTo(
        fi.csc.avaa.tupa.db.model.TpOrganisation tpOrganisation) {
        return _tpOrganisation.compareTo(tpOrganisation);
    }

    @Override
    public int hashCode() {
        return _tpOrganisation.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.TpOrganisation> toCacheModel() {
        return _tpOrganisation.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.TpOrganisation toEscapedModel() {
        return new TpOrganisationWrapper(_tpOrganisation.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.TpOrganisation toUnescapedModel() {
        return new TpOrganisationWrapper(_tpOrganisation.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _tpOrganisation.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _tpOrganisation.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _tpOrganisation.persist();
    }

    @Override
    public int[] getInfrastructuresIds() {
        return _tpOrganisation.getInfrastructuresIds();
    }

    @Override
    public void setInfrastructuresIds(int[] infrastructuresIds) {
        _tpOrganisation.setInfrastructuresIds(infrastructuresIds);
    }

    @Override
    public int[] getServicesIds() {
        return _tpOrganisation.getServicesIds();
    }

    @Override
    public void setServicesIds(int[] servicesIds) {
        _tpOrganisation.setServicesIds(servicesIds);
    }

    @Override
    public int[] getContactsIds() {
        return _tpOrganisation.getContactsIds();
    }

    @Override
    public void setContactsIds(int[] contactsIds) {
        _tpOrganisation.setContactsIds(contactsIds);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TpOrganisationWrapper)) {
            return false;
        }

        TpOrganisationWrapper tpOrganisationWrapper = (TpOrganisationWrapper) obj;

        if (Validator.equals(_tpOrganisation,
                    tpOrganisationWrapper._tpOrganisation)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public TpOrganisation getWrappedTpOrganisation() {
        return _tpOrganisation;
    }

    @Override
    public TpOrganisation getWrappedModel() {
        return _tpOrganisation;
    }

    @Override
    public void resetOriginalValues() {
        _tpOrganisation.resetOriginalValues();
    }
}
