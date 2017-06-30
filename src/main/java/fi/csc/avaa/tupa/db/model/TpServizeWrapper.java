package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TpServize}.
 * </p>
 *
 * @author CSC
 * @see TpServize
 * @generated
 */
public class TpServizeWrapper implements TpServize, ModelWrapper<TpServize> {
    private TpServize _tpServize;

    public TpServizeWrapper(TpServize tpServize) {
        _tpServize = tpServize;
    }

    @Override
    public Class<?> getModelClass() {
        return TpServize.class;
    }

    @Override
    public String getModelClassName() {
        return TpServize.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("name_EN", getName_EN());
        attributes.put("name_FI", getName_FI());
        attributes.put("description_EN", getDescription_EN());
        attributes.put("description_FI", getDescription_FI());
        attributes.put("url", getUrl());
        attributes.put("address", getAddress());
        attributes.put("city", getCity());
        attributes.put("lat", getLat());
        attributes.put("lon", getLon());

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

        String description_EN = (String) attributes.get("description_EN");

        if (description_EN != null) {
            setDescription_EN(description_EN);
        }

        String description_FI = (String) attributes.get("description_FI");

        if (description_FI != null) {
            setDescription_FI(description_FI);
        }

        String url = (String) attributes.get("url");

        if (url != null) {
            setUrl(url);
        }

        String address = (String) attributes.get("address");

        if (address != null) {
            setAddress(address);
        }

        String city = (String) attributes.get("city");

        if (city != null) {
            setCity(city);
        }

        Double lat = (Double) attributes.get("lat");

        if (lat != null) {
            setLat(lat);
        }

        Double lon = (Double) attributes.get("lon");

        if (lon != null) {
            setLon(lon);
        }
    }

    /**
    * Returns the primary key of this tp servize.
    *
    * @return the primary key of this tp servize
    */
    @Override
    public int getPrimaryKey() {
        return _tpServize.getPrimaryKey();
    }

    /**
    * Sets the primary key of this tp servize.
    *
    * @param primaryKey the primary key of this tp servize
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _tpServize.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this tp servize.
    *
    * @return the ID of this tp servize
    */
    @Override
    public int getId() {
        return _tpServize.getId();
    }

    /**
    * Sets the ID of this tp servize.
    *
    * @param id the ID of this tp servize
    */
    @Override
    public void setId(int id) {
        _tpServize.setId(id);
    }

    /**
    * Returns the name_ e n of this tp servize.
    *
    * @return the name_ e n of this tp servize
    */
    @Override
    public java.lang.String getName_EN() {
        return _tpServize.getName_EN();
    }

    /**
    * Sets the name_ e n of this tp servize.
    *
    * @param name_EN the name_ e n of this tp servize
    */
    @Override
    public void setName_EN(java.lang.String name_EN) {
        _tpServize.setName_EN(name_EN);
    }

    /**
    * Returns the name_ f i of this tp servize.
    *
    * @return the name_ f i of this tp servize
    */
    @Override
    public java.lang.String getName_FI() {
        return _tpServize.getName_FI();
    }

    /**
    * Sets the name_ f i of this tp servize.
    *
    * @param name_FI the name_ f i of this tp servize
    */
    @Override
    public void setName_FI(java.lang.String name_FI) {
        _tpServize.setName_FI(name_FI);
    }

    /**
    * Returns the description_ e n of this tp servize.
    *
    * @return the description_ e n of this tp servize
    */
    @Override
    public java.lang.String getDescription_EN() {
        return _tpServize.getDescription_EN();
    }

    /**
    * Sets the description_ e n of this tp servize.
    *
    * @param description_EN the description_ e n of this tp servize
    */
    @Override
    public void setDescription_EN(java.lang.String description_EN) {
        _tpServize.setDescription_EN(description_EN);
    }

    /**
    * Returns the description_ f i of this tp servize.
    *
    * @return the description_ f i of this tp servize
    */
    @Override
    public java.lang.String getDescription_FI() {
        return _tpServize.getDescription_FI();
    }

    /**
    * Sets the description_ f i of this tp servize.
    *
    * @param description_FI the description_ f i of this tp servize
    */
    @Override
    public void setDescription_FI(java.lang.String description_FI) {
        _tpServize.setDescription_FI(description_FI);
    }

    /**
    * Returns the url of this tp servize.
    *
    * @return the url of this tp servize
    */
    @Override
    public java.lang.String getUrl() {
        return _tpServize.getUrl();
    }

    /**
    * Sets the url of this tp servize.
    *
    * @param url the url of this tp servize
    */
    @Override
    public void setUrl(java.lang.String url) {
        _tpServize.setUrl(url);
    }

    /**
    * Returns the address of this tp servize.
    *
    * @return the address of this tp servize
    */
    @Override
    public java.lang.String getAddress() {
        return _tpServize.getAddress();
    }

    /**
    * Sets the address of this tp servize.
    *
    * @param address the address of this tp servize
    */
    @Override
    public void setAddress(java.lang.String address) {
        _tpServize.setAddress(address);
    }

    /**
    * Returns the city of this tp servize.
    *
    * @return the city of this tp servize
    */
    @Override
    public java.lang.String getCity() {
        return _tpServize.getCity();
    }

    /**
    * Sets the city of this tp servize.
    *
    * @param city the city of this tp servize
    */
    @Override
    public void setCity(java.lang.String city) {
        _tpServize.setCity(city);
    }

    /**
    * Returns the lat of this tp servize.
    *
    * @return the lat of this tp servize
    */
    @Override
    public double getLat() {
        return _tpServize.getLat();
    }

    /**
    * Sets the lat of this tp servize.
    *
    * @param lat the lat of this tp servize
    */
    @Override
    public void setLat(double lat) {
        _tpServize.setLat(lat);
    }

    /**
    * Returns the lon of this tp servize.
    *
    * @return the lon of this tp servize
    */
    @Override
    public double getLon() {
        return _tpServize.getLon();
    }

    /**
    * Sets the lon of this tp servize.
    *
    * @param lon the lon of this tp servize
    */
    @Override
    public void setLon(double lon) {
        _tpServize.setLon(lon);
    }

    @Override
    public boolean isNew() {
        return _tpServize.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _tpServize.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _tpServize.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _tpServize.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _tpServize.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _tpServize.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _tpServize.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _tpServize.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _tpServize.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _tpServize.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _tpServize.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new TpServizeWrapper((TpServize) _tpServize.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.tupa.db.model.TpServize tpServize) {
        return _tpServize.compareTo(tpServize);
    }

    @Override
    public int hashCode() {
        return _tpServize.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.TpServize> toCacheModel() {
        return _tpServize.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.TpServize toEscapedModel() {
        return new TpServizeWrapper(_tpServize.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.TpServize toUnescapedModel() {
        return new TpServizeWrapper(_tpServize.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _tpServize.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _tpServize.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _tpServize.persist();
    }

    @Override
    public int[] getInfrastructuresIds() {
        return _tpServize.getInfrastructuresIds();
    }

    @Override
    public void setInfrastructuresIds(int[] infrastructuresIds) {
        _tpServize.setInfrastructuresIds(infrastructuresIds);
    }

    @Override
    public int[] getOrganisationsIds() {
        return _tpServize.getOrganisationsIds();
    }

    @Override
    public void setOrganisationsIds(int[] organisationsIds) {
        _tpServize.setOrganisationsIds(organisationsIds);
    }

    @Override
    public int[] getContactsIds() {
        return _tpServize.getContactsIds();
    }

    @Override
    public void setContactsIds(int[] contactsIds) {
        _tpServize.setContactsIds(contactsIds);
    }

    @Override
    public java.lang.String[] getLocationTypes() {
        return _tpServize.getLocationTypes();
    }

    @Override
    public void setLocationTypes(java.lang.String[] locationTypes) {
        _tpServize.setLocationTypes(locationTypes);
    }

    @Override
    public java.lang.String[] getServiceTypes() {
        return _tpServize.getServiceTypes();
    }

    @Override
    public void setServiceTypes(java.lang.String[] serviceTypes) {
        _tpServize.setServiceTypes(serviceTypes);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TpServizeWrapper)) {
            return false;
        }

        TpServizeWrapper tpServizeWrapper = (TpServizeWrapper) obj;

        if (Validator.equals(_tpServize, tpServizeWrapper._tpServize)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public TpServize getWrappedTpServize() {
        return _tpServize;
    }

    @Override
    public TpServize getWrappedModel() {
        return _tpServize;
    }

    @Override
    public void resetOriginalValues() {
        _tpServize.resetOriginalValues();
    }
}
