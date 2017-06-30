package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TpInfrastructure}.
 * </p>
 *
 * @author CSC
 * @see TpInfrastructure
 * @generated
 */
public class TpInfrastructureWrapper implements TpInfrastructure,
    ModelWrapper<TpInfrastructure> {
    private TpInfrastructure _tpInfrastructure;

    public TpInfrastructureWrapper(TpInfrastructure tpInfrastructure) {
        _tpInfrastructure = tpInfrastructure;
    }

    @Override
    public Class<?> getModelClass() {
        return TpInfrastructure.class;
    }

    @Override
    public String getModelClassName() {
        return TpInfrastructure.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("urn", getUrn());
        attributes.put("name_EN", getName_EN());
        attributes.put("name_FI", getName_FI());
        attributes.put("acronym_EN", getAcronym_EN());
        attributes.put("acronym_FI", getAcronym_FI());
        attributes.put("description_EN", getDescription_EN());
        attributes.put("description_FI", getDescription_FI());
        attributes.put("active", getActive());
        attributes.put("preparationsStarted", getPreparationsStarted());
        attributes.put("buildingStarted", getBuildingStarted());
        attributes.put("operationsStarted", getOperationsStarted());
        attributes.put("operationsFinished", getOperationsFinished());
        attributes.put("formerIds", getFormerIds());
        attributes.put("formerUrns", getFormerUrns());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer id = (Integer) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String urn = (String) attributes.get("urn");

        if (urn != null) {
            setUrn(urn);
        }

        String name_EN = (String) attributes.get("name_EN");

        if (name_EN != null) {
            setName_EN(name_EN);
        }

        String name_FI = (String) attributes.get("name_FI");

        if (name_FI != null) {
            setName_FI(name_FI);
        }

        String acronym_EN = (String) attributes.get("acronym_EN");

        if (acronym_EN != null) {
            setAcronym_EN(acronym_EN);
        }

        String acronym_FI = (String) attributes.get("acronym_FI");

        if (acronym_FI != null) {
            setAcronym_FI(acronym_FI);
        }

        String description_EN = (String) attributes.get("description_EN");

        if (description_EN != null) {
            setDescription_EN(description_EN);
        }

        String description_FI = (String) attributes.get("description_FI");

        if (description_FI != null) {
            setDescription_FI(description_FI);
        }

        Boolean active = (Boolean) attributes.get("active");

        if (active != null) {
            setActive(active);
        }

        Integer preparationsStarted = (Integer) attributes.get(
                "preparationsStarted");

        if (preparationsStarted != null) {
            setPreparationsStarted(preparationsStarted);
        }

        Integer buildingStarted = (Integer) attributes.get("buildingStarted");

        if (buildingStarted != null) {
            setBuildingStarted(buildingStarted);
        }

        Integer operationsStarted = (Integer) attributes.get(
                "operationsStarted");

        if (operationsStarted != null) {
            setOperationsStarted(operationsStarted);
        }

        Integer operationsFinished = (Integer) attributes.get(
                "operationsFinished");

        if (operationsFinished != null) {
            setOperationsFinished(operationsFinished);
        }

        String formerIds = (String) attributes.get("formerIds");

        if (formerIds != null) {
            setFormerIds(formerIds);
        }

        String formerUrns = (String) attributes.get("formerUrns");

        if (formerUrns != null) {
            setFormerUrns(formerUrns);
        }
    }

    /**
    * Returns the primary key of this tp infrastructure.
    *
    * @return the primary key of this tp infrastructure
    */
    @Override
    public int getPrimaryKey() {
        return _tpInfrastructure.getPrimaryKey();
    }

    /**
    * Sets the primary key of this tp infrastructure.
    *
    * @param primaryKey the primary key of this tp infrastructure
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _tpInfrastructure.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this tp infrastructure.
    *
    * @return the ID of this tp infrastructure
    */
    @Override
    public int getId() {
        return _tpInfrastructure.getId();
    }

    /**
    * Sets the ID of this tp infrastructure.
    *
    * @param id the ID of this tp infrastructure
    */
    @Override
    public void setId(int id) {
        _tpInfrastructure.setId(id);
    }

    /**
    * Returns the urn of this tp infrastructure.
    *
    * @return the urn of this tp infrastructure
    */
    @Override
    public java.lang.String getUrn() {
        return _tpInfrastructure.getUrn();
    }

    /**
    * Sets the urn of this tp infrastructure.
    *
    * @param urn the urn of this tp infrastructure
    */
    @Override
    public void setUrn(java.lang.String urn) {
        _tpInfrastructure.setUrn(urn);
    }

    /**
    * Returns the name_ e n of this tp infrastructure.
    *
    * @return the name_ e n of this tp infrastructure
    */
    @Override
    public java.lang.String getName_EN() {
        return _tpInfrastructure.getName_EN();
    }

    /**
    * Sets the name_ e n of this tp infrastructure.
    *
    * @param name_EN the name_ e n of this tp infrastructure
    */
    @Override
    public void setName_EN(java.lang.String name_EN) {
        _tpInfrastructure.setName_EN(name_EN);
    }

    /**
    * Returns the name_ f i of this tp infrastructure.
    *
    * @return the name_ f i of this tp infrastructure
    */
    @Override
    public java.lang.String getName_FI() {
        return _tpInfrastructure.getName_FI();
    }

    /**
    * Sets the name_ f i of this tp infrastructure.
    *
    * @param name_FI the name_ f i of this tp infrastructure
    */
    @Override
    public void setName_FI(java.lang.String name_FI) {
        _tpInfrastructure.setName_FI(name_FI);
    }

    /**
    * Returns the acronym_ e n of this tp infrastructure.
    *
    * @return the acronym_ e n of this tp infrastructure
    */
    @Override
    public java.lang.String getAcronym_EN() {
        return _tpInfrastructure.getAcronym_EN();
    }

    /**
    * Sets the acronym_ e n of this tp infrastructure.
    *
    * @param acronym_EN the acronym_ e n of this tp infrastructure
    */
    @Override
    public void setAcronym_EN(java.lang.String acronym_EN) {
        _tpInfrastructure.setAcronym_EN(acronym_EN);
    }

    /**
    * Returns the acronym_ f i of this tp infrastructure.
    *
    * @return the acronym_ f i of this tp infrastructure
    */
    @Override
    public java.lang.String getAcronym_FI() {
        return _tpInfrastructure.getAcronym_FI();
    }

    /**
    * Sets the acronym_ f i of this tp infrastructure.
    *
    * @param acronym_FI the acronym_ f i of this tp infrastructure
    */
    @Override
    public void setAcronym_FI(java.lang.String acronym_FI) {
        _tpInfrastructure.setAcronym_FI(acronym_FI);
    }

    /**
    * Returns the description_ e n of this tp infrastructure.
    *
    * @return the description_ e n of this tp infrastructure
    */
    @Override
    public java.lang.String getDescription_EN() {
        return _tpInfrastructure.getDescription_EN();
    }

    /**
    * Sets the description_ e n of this tp infrastructure.
    *
    * @param description_EN the description_ e n of this tp infrastructure
    */
    @Override
    public void setDescription_EN(java.lang.String description_EN) {
        _tpInfrastructure.setDescription_EN(description_EN);
    }

    /**
    * Returns the description_ f i of this tp infrastructure.
    *
    * @return the description_ f i of this tp infrastructure
    */
    @Override
    public java.lang.String getDescription_FI() {
        return _tpInfrastructure.getDescription_FI();
    }

    /**
    * Sets the description_ f i of this tp infrastructure.
    *
    * @param description_FI the description_ f i of this tp infrastructure
    */
    @Override
    public void setDescription_FI(java.lang.String description_FI) {
        _tpInfrastructure.setDescription_FI(description_FI);
    }

    /**
    * Returns the active of this tp infrastructure.
    *
    * @return the active of this tp infrastructure
    */
    @Override
    public boolean getActive() {
        return _tpInfrastructure.getActive();
    }

    /**
    * Returns <code>true</code> if this tp infrastructure is active.
    *
    * @return <code>true</code> if this tp infrastructure is active; <code>false</code> otherwise
    */
    @Override
    public boolean isActive() {
        return _tpInfrastructure.isActive();
    }

    /**
    * Sets whether this tp infrastructure is active.
    *
    * @param active the active of this tp infrastructure
    */
    @Override
    public void setActive(boolean active) {
        _tpInfrastructure.setActive(active);
    }

    /**
    * Returns the preparations started of this tp infrastructure.
    *
    * @return the preparations started of this tp infrastructure
    */
    @Override
    public int getPreparationsStarted() {
        return _tpInfrastructure.getPreparationsStarted();
    }

    /**
    * Sets the preparations started of this tp infrastructure.
    *
    * @param preparationsStarted the preparations started of this tp infrastructure
    */
    @Override
    public void setPreparationsStarted(int preparationsStarted) {
        _tpInfrastructure.setPreparationsStarted(preparationsStarted);
    }

    /**
    * Returns the building started of this tp infrastructure.
    *
    * @return the building started of this tp infrastructure
    */
    @Override
    public int getBuildingStarted() {
        return _tpInfrastructure.getBuildingStarted();
    }

    /**
    * Sets the building started of this tp infrastructure.
    *
    * @param buildingStarted the building started of this tp infrastructure
    */
    @Override
    public void setBuildingStarted(int buildingStarted) {
        _tpInfrastructure.setBuildingStarted(buildingStarted);
    }

    /**
    * Returns the operations started of this tp infrastructure.
    *
    * @return the operations started of this tp infrastructure
    */
    @Override
    public int getOperationsStarted() {
        return _tpInfrastructure.getOperationsStarted();
    }

    /**
    * Sets the operations started of this tp infrastructure.
    *
    * @param operationsStarted the operations started of this tp infrastructure
    */
    @Override
    public void setOperationsStarted(int operationsStarted) {
        _tpInfrastructure.setOperationsStarted(operationsStarted);
    }

    /**
    * Returns the operations finished of this tp infrastructure.
    *
    * @return the operations finished of this tp infrastructure
    */
    @Override
    public int getOperationsFinished() {
        return _tpInfrastructure.getOperationsFinished();
    }

    /**
    * Sets the operations finished of this tp infrastructure.
    *
    * @param operationsFinished the operations finished of this tp infrastructure
    */
    @Override
    public void setOperationsFinished(int operationsFinished) {
        _tpInfrastructure.setOperationsFinished(operationsFinished);
    }

    /**
    * Returns the former IDs of this tp infrastructure.
    *
    * @return the former IDs of this tp infrastructure
    */
    @Override
    public java.lang.String getFormerIds() {
        return _tpInfrastructure.getFormerIds();
    }

    /**
    * Sets the former IDs of this tp infrastructure.
    *
    * @param formerIds the former IDs of this tp infrastructure
    */
    @Override
    public void setFormerIds(java.lang.String formerIds) {
        _tpInfrastructure.setFormerIds(formerIds);
    }

    /**
    * Returns the former urns of this tp infrastructure.
    *
    * @return the former urns of this tp infrastructure
    */
    @Override
    public java.lang.String getFormerUrns() {
        return _tpInfrastructure.getFormerUrns();
    }

    /**
    * Sets the former urns of this tp infrastructure.
    *
    * @param formerUrns the former urns of this tp infrastructure
    */
    @Override
    public void setFormerUrns(java.lang.String formerUrns) {
        _tpInfrastructure.setFormerUrns(formerUrns);
    }

    @Override
    public boolean isNew() {
        return _tpInfrastructure.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _tpInfrastructure.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _tpInfrastructure.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _tpInfrastructure.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _tpInfrastructure.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _tpInfrastructure.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _tpInfrastructure.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _tpInfrastructure.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _tpInfrastructure.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _tpInfrastructure.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _tpInfrastructure.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new TpInfrastructureWrapper((TpInfrastructure) _tpInfrastructure.clone());
    }

    @Override
    public int compareTo(
        fi.csc.avaa.tupa.db.model.TpInfrastructure tpInfrastructure) {
        return _tpInfrastructure.compareTo(tpInfrastructure);
    }

    @Override
    public int hashCode() {
        return _tpInfrastructure.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.TpInfrastructure> toCacheModel() {
        return _tpInfrastructure.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.TpInfrastructure toEscapedModel() {
        return new TpInfrastructureWrapper(_tpInfrastructure.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.TpInfrastructure toUnescapedModel() {
        return new TpInfrastructureWrapper(_tpInfrastructure.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _tpInfrastructure.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _tpInfrastructure.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _tpInfrastructure.persist();
    }

    @Override
    public int[] getServicesIds() {
        return _tpInfrastructure.getServicesIds();
    }

    @Override
    public void setServicesIds(int[] servicesIds) {
        _tpInfrastructure.setServicesIds(servicesIds);
    }

    @Override
    public int[] getContactsIds() {
        return _tpInfrastructure.getContactsIds();
    }

    @Override
    public void setContactsIds(int[] contactsIds) {
        _tpInfrastructure.setContactsIds(contactsIds);
    }

    @Override
    public int[] getOrganisationsIds() {
        return _tpInfrastructure.getOrganisationsIds();
    }

    @Override
    public void setOrganisationsIds(int[] organisationsIds) {
        _tpInfrastructure.setOrganisationsIds(organisationsIds);
    }

    @Override
    public java.lang.String[] getKeywords_EN() {
        return _tpInfrastructure.getKeywords_EN();
    }

    @Override
    public void setKeywords_EN(java.lang.String[] keywords_EN) {
        _tpInfrastructure.setKeywords_EN(keywords_EN);
    }

    @Override
    public java.lang.String[] getKeywords_FI() {
        return _tpInfrastructure.getKeywords_FI();
    }

    @Override
    public void setKeywords_FI(java.lang.String[] keywords_FI) {
        _tpInfrastructure.setKeywords_FI(keywords_FI);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONObject getPids() {
        return _tpInfrastructure.getPids();
    }

    @Override
    public void setPids(com.liferay.portal.kernel.json.JSONObject pids) {
        _tpInfrastructure.setPids(pids);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TpInfrastructureWrapper)) {
            return false;
        }

        TpInfrastructureWrapper tpInfrastructureWrapper = (TpInfrastructureWrapper) obj;

        if (Validator.equals(_tpInfrastructure,
                    tpInfrastructureWrapper._tpInfrastructure)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public TpInfrastructure getWrappedTpInfrastructure() {
        return _tpInfrastructure;
    }

    @Override
    public TpInfrastructure getWrappedModel() {
        return _tpInfrastructure;
    }

    @Override
    public void resetOriginalValues() {
        _tpInfrastructure.resetOriginalValues();
    }
}
