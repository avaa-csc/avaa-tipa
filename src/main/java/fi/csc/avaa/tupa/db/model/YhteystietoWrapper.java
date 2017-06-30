package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Yhteystieto}.
 * </p>
 *
 * @author CSC
 * @see Yhteystieto
 * @generated
 */
public class YhteystietoWrapper implements Yhteystieto,
    ModelWrapper<Yhteystieto> {
    private Yhteystieto _yhteystieto;

    public YhteystietoWrapper(Yhteystieto yhteystieto) {
        _yhteystieto = yhteystieto;
    }

    @Override
    public Class<?> getModelClass() {
        return Yhteystieto.class;
    }

    @Override
    public String getModelClassName() {
        return Yhteystieto.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("yhteystieto_id", getYhteystieto_id());
        attributes.put("sahkoposti", getSahkoposti());
        attributes.put("affiliaatio", getAffiliaatio());
        attributes.put("puhelin", getPuhelin());
        attributes.put("titteli", getTitteli());
        attributes.put("etunimi", getEtunimi());
        attributes.put("sukunimi", getSukunimi());
        attributes.put("URL", getURL());
        attributes.put("kuvaus", getKuvaus());
        attributes.put("description", getDescription());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer yhteystieto_id = (Integer) attributes.get("yhteystieto_id");

        if (yhteystieto_id != null) {
            setYhteystieto_id(yhteystieto_id);
        }

        String sahkoposti = (String) attributes.get("sahkoposti");

        if (sahkoposti != null) {
            setSahkoposti(sahkoposti);
        }

        Integer affiliaatio = (Integer) attributes.get("affiliaatio");

        if (affiliaatio != null) {
            setAffiliaatio(affiliaatio);
        }

        String puhelin = (String) attributes.get("puhelin");

        if (puhelin != null) {
            setPuhelin(puhelin);
        }

        String titteli = (String) attributes.get("titteli");

        if (titteli != null) {
            setTitteli(titteli);
        }

        String etunimi = (String) attributes.get("etunimi");

        if (etunimi != null) {
            setEtunimi(etunimi);
        }

        String sukunimi = (String) attributes.get("sukunimi");

        if (sukunimi != null) {
            setSukunimi(sukunimi);
        }

        String URL = (String) attributes.get("URL");

        if (URL != null) {
            setURL(URL);
        }

        String kuvaus = (String) attributes.get("kuvaus");

        if (kuvaus != null) {
            setKuvaus(kuvaus);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }
    }

    /**
    * Returns the primary key of this yhteystieto.
    *
    * @return the primary key of this yhteystieto
    */
    @Override
    public int getPrimaryKey() {
        return _yhteystieto.getPrimaryKey();
    }

    /**
    * Sets the primary key of this yhteystieto.
    *
    * @param primaryKey the primary key of this yhteystieto
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _yhteystieto.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the yhteystieto_id of this yhteystieto.
    *
    * @return the yhteystieto_id of this yhteystieto
    */
    @Override
    public int getYhteystieto_id() {
        return _yhteystieto.getYhteystieto_id();
    }

    /**
    * Sets the yhteystieto_id of this yhteystieto.
    *
    * @param yhteystieto_id the yhteystieto_id of this yhteystieto
    */
    @Override
    public void setYhteystieto_id(int yhteystieto_id) {
        _yhteystieto.setYhteystieto_id(yhteystieto_id);
    }

    /**
    * Returns the sahkoposti of this yhteystieto.
    *
    * @return the sahkoposti of this yhteystieto
    */
    @Override
    public java.lang.String getSahkoposti() {
        return _yhteystieto.getSahkoposti();
    }

    /**
    * Sets the sahkoposti of this yhteystieto.
    *
    * @param sahkoposti the sahkoposti of this yhteystieto
    */
    @Override
    public void setSahkoposti(java.lang.String sahkoposti) {
        _yhteystieto.setSahkoposti(sahkoposti);
    }

    /**
    * Returns the affiliaatio of this yhteystieto.
    *
    * @return the affiliaatio of this yhteystieto
    */
    @Override
    public int getAffiliaatio() {
        return _yhteystieto.getAffiliaatio();
    }

    /**
    * Sets the affiliaatio of this yhteystieto.
    *
    * @param affiliaatio the affiliaatio of this yhteystieto
    */
    @Override
    public void setAffiliaatio(int affiliaatio) {
        _yhteystieto.setAffiliaatio(affiliaatio);
    }

    /**
    * Returns the puhelin of this yhteystieto.
    *
    * @return the puhelin of this yhteystieto
    */
    @Override
    public java.lang.String getPuhelin() {
        return _yhteystieto.getPuhelin();
    }

    /**
    * Sets the puhelin of this yhteystieto.
    *
    * @param puhelin the puhelin of this yhteystieto
    */
    @Override
    public void setPuhelin(java.lang.String puhelin) {
        _yhteystieto.setPuhelin(puhelin);
    }

    /**
    * Returns the titteli of this yhteystieto.
    *
    * @return the titteli of this yhteystieto
    */
    @Override
    public java.lang.String getTitteli() {
        return _yhteystieto.getTitteli();
    }

    /**
    * Sets the titteli of this yhteystieto.
    *
    * @param titteli the titteli of this yhteystieto
    */
    @Override
    public void setTitteli(java.lang.String titteli) {
        _yhteystieto.setTitteli(titteli);
    }

    /**
    * Returns the etunimi of this yhteystieto.
    *
    * @return the etunimi of this yhteystieto
    */
    @Override
    public java.lang.String getEtunimi() {
        return _yhteystieto.getEtunimi();
    }

    /**
    * Sets the etunimi of this yhteystieto.
    *
    * @param etunimi the etunimi of this yhteystieto
    */
    @Override
    public void setEtunimi(java.lang.String etunimi) {
        _yhteystieto.setEtunimi(etunimi);
    }

    /**
    * Returns the sukunimi of this yhteystieto.
    *
    * @return the sukunimi of this yhteystieto
    */
    @Override
    public java.lang.String getSukunimi() {
        return _yhteystieto.getSukunimi();
    }

    /**
    * Sets the sukunimi of this yhteystieto.
    *
    * @param sukunimi the sukunimi of this yhteystieto
    */
    @Override
    public void setSukunimi(java.lang.String sukunimi) {
        _yhteystieto.setSukunimi(sukunimi);
    }

    /**
    * Returns the u r l of this yhteystieto.
    *
    * @return the u r l of this yhteystieto
    */
    @Override
    public java.lang.String getURL() {
        return _yhteystieto.getURL();
    }

    /**
    * Sets the u r l of this yhteystieto.
    *
    * @param URL the u r l of this yhteystieto
    */
    @Override
    public void setURL(java.lang.String URL) {
        _yhteystieto.setURL(URL);
    }

    /**
    * Returns the kuvaus of this yhteystieto.
    *
    * @return the kuvaus of this yhteystieto
    */
    @Override
    public java.lang.String getKuvaus() {
        return _yhteystieto.getKuvaus();
    }

    /**
    * Sets the kuvaus of this yhteystieto.
    *
    * @param kuvaus the kuvaus of this yhteystieto
    */
    @Override
    public void setKuvaus(java.lang.String kuvaus) {
        _yhteystieto.setKuvaus(kuvaus);
    }

    /**
    * Returns the description of this yhteystieto.
    *
    * @return the description of this yhteystieto
    */
    @Override
    public java.lang.String getDescription() {
        return _yhteystieto.getDescription();
    }

    /**
    * Sets the description of this yhteystieto.
    *
    * @param description the description of this yhteystieto
    */
    @Override
    public void setDescription(java.lang.String description) {
        _yhteystieto.setDescription(description);
    }

    @Override
    public boolean isNew() {
        return _yhteystieto.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _yhteystieto.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _yhteystieto.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _yhteystieto.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _yhteystieto.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _yhteystieto.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _yhteystieto.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _yhteystieto.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _yhteystieto.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _yhteystieto.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _yhteystieto.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new YhteystietoWrapper((Yhteystieto) _yhteystieto.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.tupa.db.model.Yhteystieto yhteystieto) {
        return _yhteystieto.compareTo(yhteystieto);
    }

    @Override
    public int hashCode() {
        return _yhteystieto.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.Yhteystieto> toCacheModel() {
        return _yhteystieto.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Yhteystieto toEscapedModel() {
        return new YhteystietoWrapper(_yhteystieto.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Yhteystieto toUnescapedModel() {
        return new YhteystietoWrapper(_yhteystieto.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _yhteystieto.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _yhteystieto.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _yhteystieto.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof YhteystietoWrapper)) {
            return false;
        }

        YhteystietoWrapper yhteystietoWrapper = (YhteystietoWrapper) obj;

        if (Validator.equals(_yhteystieto, yhteystietoWrapper._yhteystieto)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Yhteystieto getWrappedYhteystieto() {
        return _yhteystieto;
    }

    @Override
    public Yhteystieto getWrappedModel() {
        return _yhteystieto;
    }

    @Override
    public void resetOriginalValues() {
        _yhteystieto.resetOriginalValues();
    }
}
