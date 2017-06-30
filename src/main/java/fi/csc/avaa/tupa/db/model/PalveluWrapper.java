package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Palvelu}.
 * </p>
 *
 * @author CSC
 * @see Palvelu
 * @generated
 */
public class PalveluWrapper implements Palvelu, ModelWrapper<Palvelu> {
    private Palvelu _palvelu;

    public PalveluWrapper(Palvelu palvelu) {
        _palvelu = palvelu;
    }

    @Override
    public Class<?> getModelClass() {
        return Palvelu.class;
    }

    @Override
    public String getModelClassName() {
        return Palvelu.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("palvelu_id", getPalvelu_id());
        attributes.put("nimi", getNimi());
        attributes.put("name", getName());
        attributes.put("kuvaus", getKuvaus());
        attributes.put("description", getDescription());
        attributes.put("URLen", getURLen());
        attributes.put("URLfi", getURLfi());
        attributes.put("paikkatyyppi", getPaikkatyyppi());
        attributes.put("katuosoite", getKatuosoite());
        attributes.put("kaupunki", getKaupunki());
        attributes.put("lat", getLat());
        attributes.put("lon", getLon());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer palvelu_id = (Integer) attributes.get("palvelu_id");

        if (palvelu_id != null) {
            setPalvelu_id(palvelu_id);
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

        String URLen = (String) attributes.get("URLen");

        if (URLen != null) {
            setURLen(URLen);
        }

        String URLfi = (String) attributes.get("URLfi");

        if (URLfi != null) {
            setURLfi(URLfi);
        }

        Integer paikkatyyppi = (Integer) attributes.get("paikkatyyppi");

        if (paikkatyyppi != null) {
            setPaikkatyyppi(paikkatyyppi);
        }

        String katuosoite = (String) attributes.get("katuosoite");

        if (katuosoite != null) {
            setKatuosoite(katuosoite);
        }

        String kaupunki = (String) attributes.get("kaupunki");

        if (kaupunki != null) {
            setKaupunki(kaupunki);
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
    * Returns the primary key of this palvelu.
    *
    * @return the primary key of this palvelu
    */
    @Override
    public int getPrimaryKey() {
        return _palvelu.getPrimaryKey();
    }

    /**
    * Sets the primary key of this palvelu.
    *
    * @param primaryKey the primary key of this palvelu
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _palvelu.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the palvelu_id of this palvelu.
    *
    * @return the palvelu_id of this palvelu
    */
    @Override
    public int getPalvelu_id() {
        return _palvelu.getPalvelu_id();
    }

    /**
    * Sets the palvelu_id of this palvelu.
    *
    * @param palvelu_id the palvelu_id of this palvelu
    */
    @Override
    public void setPalvelu_id(int palvelu_id) {
        _palvelu.setPalvelu_id(palvelu_id);
    }

    /**
    * Returns the nimi of this palvelu.
    *
    * @return the nimi of this palvelu
    */
    @Override
    public java.lang.String getNimi() {
        return _palvelu.getNimi();
    }

    /**
    * Sets the nimi of this palvelu.
    *
    * @param nimi the nimi of this palvelu
    */
    @Override
    public void setNimi(java.lang.String nimi) {
        _palvelu.setNimi(nimi);
    }

    /**
    * Returns the name of this palvelu.
    *
    * @return the name of this palvelu
    */
    @Override
    public java.lang.String getName() {
        return _palvelu.getName();
    }

    /**
    * Sets the name of this palvelu.
    *
    * @param name the name of this palvelu
    */
    @Override
    public void setName(java.lang.String name) {
        _palvelu.setName(name);
    }

    /**
    * Returns the kuvaus of this palvelu.
    *
    * @return the kuvaus of this palvelu
    */
    @Override
    public java.lang.String getKuvaus() {
        return _palvelu.getKuvaus();
    }

    /**
    * Sets the kuvaus of this palvelu.
    *
    * @param kuvaus the kuvaus of this palvelu
    */
    @Override
    public void setKuvaus(java.lang.String kuvaus) {
        _palvelu.setKuvaus(kuvaus);
    }

    /**
    * Returns the description of this palvelu.
    *
    * @return the description of this palvelu
    */
    @Override
    public java.lang.String getDescription() {
        return _palvelu.getDescription();
    }

    /**
    * Sets the description of this palvelu.
    *
    * @param description the description of this palvelu
    */
    @Override
    public void setDescription(java.lang.String description) {
        _palvelu.setDescription(description);
    }

    /**
    * Returns the u r len of this palvelu.
    *
    * @return the u r len of this palvelu
    */
    @Override
    public java.lang.String getURLen() {
        return _palvelu.getURLen();
    }

    /**
    * Sets the u r len of this palvelu.
    *
    * @param URLen the u r len of this palvelu
    */
    @Override
    public void setURLen(java.lang.String URLen) {
        _palvelu.setURLen(URLen);
    }

    /**
    * Returns the u r lfi of this palvelu.
    *
    * @return the u r lfi of this palvelu
    */
    @Override
    public java.lang.String getURLfi() {
        return _palvelu.getURLfi();
    }

    /**
    * Sets the u r lfi of this palvelu.
    *
    * @param URLfi the u r lfi of this palvelu
    */
    @Override
    public void setURLfi(java.lang.String URLfi) {
        _palvelu.setURLfi(URLfi);
    }

    /**
    * Returns the paikkatyyppi of this palvelu.
    *
    * @return the paikkatyyppi of this palvelu
    */
    @Override
    public int getPaikkatyyppi() {
        return _palvelu.getPaikkatyyppi();
    }

    /**
    * Sets the paikkatyyppi of this palvelu.
    *
    * @param paikkatyyppi the paikkatyyppi of this palvelu
    */
    @Override
    public void setPaikkatyyppi(int paikkatyyppi) {
        _palvelu.setPaikkatyyppi(paikkatyyppi);
    }

    /**
    * Returns the katuosoite of this palvelu.
    *
    * @return the katuosoite of this palvelu
    */
    @Override
    public java.lang.String getKatuosoite() {
        return _palvelu.getKatuosoite();
    }

    /**
    * Sets the katuosoite of this palvelu.
    *
    * @param katuosoite the katuosoite of this palvelu
    */
    @Override
    public void setKatuosoite(java.lang.String katuosoite) {
        _palvelu.setKatuosoite(katuosoite);
    }

    /**
    * Returns the kaupunki of this palvelu.
    *
    * @return the kaupunki of this palvelu
    */
    @Override
    public java.lang.String getKaupunki() {
        return _palvelu.getKaupunki();
    }

    /**
    * Sets the kaupunki of this palvelu.
    *
    * @param kaupunki the kaupunki of this palvelu
    */
    @Override
    public void setKaupunki(java.lang.String kaupunki) {
        _palvelu.setKaupunki(kaupunki);
    }

    /**
    * Returns the lat of this palvelu.
    *
    * @return the lat of this palvelu
    */
    @Override
    public double getLat() {
        return _palvelu.getLat();
    }

    /**
    * Sets the lat of this palvelu.
    *
    * @param lat the lat of this palvelu
    */
    @Override
    public void setLat(double lat) {
        _palvelu.setLat(lat);
    }

    /**
    * Returns the lon of this palvelu.
    *
    * @return the lon of this palvelu
    */
    @Override
    public double getLon() {
        return _palvelu.getLon();
    }

    /**
    * Sets the lon of this palvelu.
    *
    * @param lon the lon of this palvelu
    */
    @Override
    public void setLon(double lon) {
        _palvelu.setLon(lon);
    }

    @Override
    public boolean isNew() {
        return _palvelu.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _palvelu.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _palvelu.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _palvelu.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _palvelu.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _palvelu.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _palvelu.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _palvelu.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _palvelu.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _palvelu.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _palvelu.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PalveluWrapper((Palvelu) _palvelu.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.tupa.db.model.Palvelu palvelu) {
        return _palvelu.compareTo(palvelu);
    }

    @Override
    public int hashCode() {
        return _palvelu.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.Palvelu> toCacheModel() {
        return _palvelu.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu toEscapedModel() {
        return new PalveluWrapper(_palvelu.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Palvelu toUnescapedModel() {
        return new PalveluWrapper(_palvelu.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _palvelu.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _palvelu.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _palvelu.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PalveluWrapper)) {
            return false;
        }

        PalveluWrapper palveluWrapper = (PalveluWrapper) obj;

        if (Validator.equals(_palvelu, palveluWrapper._palvelu)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Palvelu getWrappedPalvelu() {
        return _palvelu;
    }

    @Override
    public Palvelu getWrappedModel() {
        return _palvelu;
    }

    @Override
    public void resetOriginalValues() {
        _palvelu.resetOriginalValues();
    }
}
