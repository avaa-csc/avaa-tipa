package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Infra}.
 * </p>
 *
 * @author pj,jmlehtin
 * @see Infra
 * @generated
 */
public class InfraWrapper implements Infra, ModelWrapper<Infra> {
    private Infra _infra;

    public InfraWrapper(Infra infra) {
        _infra = infra;
    }

    @Override
    public Class<?> getModelClass() {
        return Infra.class;
    }

    @Override
    public String getModelClassName() {
        return Infra.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("infra_id", getInfra_id());
        attributes.put("ISNI", getISNI());
        attributes.put("aktiivinen", getAktiivinen());
        attributes.put("valmistelu_aloitusvuosi", getValmistelu_aloitusvuosi());
        attributes.put("rakennus_aloitusvuosi", getRakennus_aloitusvuosi());
        attributes.put("toiminta_aloitusvuosi", getToiminta_aloitusvuosi());
        attributes.put("toiminta_lopetusvuosi", getToiminta_lopetusvuosi());
        attributes.put("nimi", getNimi());
        attributes.put("name", getName());
        attributes.put("lyhenne", getLyhenne());
        attributes.put("acronym", getAcronym());
        attributes.put("edellinen_infra", getEdellinen_infra());
        attributes.put("kuvaus", getKuvaus());
        attributes.put("description", getDescription());
        attributes.put("logo_url", getLogo_url());
        attributes.put("image_url", getImage_url());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer infra_id = (Integer) attributes.get("infra_id");

        if (infra_id != null) {
            setInfra_id(infra_id);
        }

        String ISNI = (String) attributes.get("ISNI");

        if (ISNI != null) {
            setISNI(ISNI);
        }

        Boolean aktiivinen = (Boolean) attributes.get("aktiivinen");

        if (aktiivinen != null) {
            setAktiivinen(aktiivinen);
        }

        Integer valmistelu_aloitusvuosi = (Integer) attributes.get(
                "valmistelu_aloitusvuosi");

        if (valmistelu_aloitusvuosi != null) {
            setValmistelu_aloitusvuosi(valmistelu_aloitusvuosi);
        }

        Integer rakennus_aloitusvuosi = (Integer) attributes.get(
                "rakennus_aloitusvuosi");

        if (rakennus_aloitusvuosi != null) {
            setRakennus_aloitusvuosi(rakennus_aloitusvuosi);
        }

        Integer toiminta_aloitusvuosi = (Integer) attributes.get(
                "toiminta_aloitusvuosi");

        if (toiminta_aloitusvuosi != null) {
            setToiminta_aloitusvuosi(toiminta_aloitusvuosi);
        }

        Integer toiminta_lopetusvuosi = (Integer) attributes.get(
                "toiminta_lopetusvuosi");

        if (toiminta_lopetusvuosi != null) {
            setToiminta_lopetusvuosi(toiminta_lopetusvuosi);
        }

        String nimi = (String) attributes.get("nimi");

        if (nimi != null) {
            setNimi(nimi);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String lyhenne = (String) attributes.get("lyhenne");

        if (lyhenne != null) {
            setLyhenne(lyhenne);
        }

        String acronym = (String) attributes.get("acronym");

        if (acronym != null) {
            setAcronym(acronym);
        }

        Integer edellinen_infra = (Integer) attributes.get("edellinen_infra");

        if (edellinen_infra != null) {
            setEdellinen_infra(edellinen_infra);
        }

        String kuvaus = (String) attributes.get("kuvaus");

        if (kuvaus != null) {
            setKuvaus(kuvaus);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        String logo_url = (String) attributes.get("logo_url");

        if (logo_url != null) {
            setLogo_url(logo_url);
        }

        String image_url = (String) attributes.get("image_url");

        if (image_url != null) {
            setImage_url(image_url);
        }
    }

    /**
    * Returns the primary key of this infra.
    *
    * @return the primary key of this infra
    */
    @Override
    public int getPrimaryKey() {
        return _infra.getPrimaryKey();
    }

    /**
    * Sets the primary key of this infra.
    *
    * @param primaryKey the primary key of this infra
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _infra.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the infra_id of this infra.
    *
    * @return the infra_id of this infra
    */
    @Override
    public int getInfra_id() {
        return _infra.getInfra_id();
    }

    /**
    * Sets the infra_id of this infra.
    *
    * @param infra_id the infra_id of this infra
    */
    @Override
    public void setInfra_id(int infra_id) {
        _infra.setInfra_id(infra_id);
    }

    /**
    * Returns the i s n i of this infra.
    *
    * @return the i s n i of this infra
    */
    @Override
    public java.lang.String getISNI() {
        return _infra.getISNI();
    }

    /**
    * Sets the i s n i of this infra.
    *
    * @param ISNI the i s n i of this infra
    */
    @Override
    public void setISNI(java.lang.String ISNI) {
        _infra.setISNI(ISNI);
    }

    /**
    * Returns the aktiivinen of this infra.
    *
    * @return the aktiivinen of this infra
    */
    @Override
    public boolean getAktiivinen() {
        return _infra.getAktiivinen();
    }

    /**
    * Returns <code>true</code> if this infra is aktiivinen.
    *
    * @return <code>true</code> if this infra is aktiivinen; <code>false</code> otherwise
    */
    @Override
    public boolean isAktiivinen() {
        return _infra.isAktiivinen();
    }

    /**
    * Sets whether this infra is aktiivinen.
    *
    * @param aktiivinen the aktiivinen of this infra
    */
    @Override
    public void setAktiivinen(boolean aktiivinen) {
        _infra.setAktiivinen(aktiivinen);
    }

    /**
    * Returns the valmistelu_aloitusvuosi of this infra.
    *
    * @return the valmistelu_aloitusvuosi of this infra
    */
    @Override
    public int getValmistelu_aloitusvuosi() {
        return _infra.getValmistelu_aloitusvuosi();
    }

    /**
    * Sets the valmistelu_aloitusvuosi of this infra.
    *
    * @param valmistelu_aloitusvuosi the valmistelu_aloitusvuosi of this infra
    */
    @Override
    public void setValmistelu_aloitusvuosi(int valmistelu_aloitusvuosi) {
        _infra.setValmistelu_aloitusvuosi(valmistelu_aloitusvuosi);
    }

    /**
    * Returns the rakennus_aloitusvuosi of this infra.
    *
    * @return the rakennus_aloitusvuosi of this infra
    */
    @Override
    public int getRakennus_aloitusvuosi() {
        return _infra.getRakennus_aloitusvuosi();
    }

    /**
    * Sets the rakennus_aloitusvuosi of this infra.
    *
    * @param rakennus_aloitusvuosi the rakennus_aloitusvuosi of this infra
    */
    @Override
    public void setRakennus_aloitusvuosi(int rakennus_aloitusvuosi) {
        _infra.setRakennus_aloitusvuosi(rakennus_aloitusvuosi);
    }

    /**
    * Returns the toiminta_aloitusvuosi of this infra.
    *
    * @return the toiminta_aloitusvuosi of this infra
    */
    @Override
    public int getToiminta_aloitusvuosi() {
        return _infra.getToiminta_aloitusvuosi();
    }

    /**
    * Sets the toiminta_aloitusvuosi of this infra.
    *
    * @param toiminta_aloitusvuosi the toiminta_aloitusvuosi of this infra
    */
    @Override
    public void setToiminta_aloitusvuosi(int toiminta_aloitusvuosi) {
        _infra.setToiminta_aloitusvuosi(toiminta_aloitusvuosi);
    }

    /**
    * Returns the toiminta_lopetusvuosi of this infra.
    *
    * @return the toiminta_lopetusvuosi of this infra
    */
    @Override
    public int getToiminta_lopetusvuosi() {
        return _infra.getToiminta_lopetusvuosi();
    }

    /**
    * Sets the toiminta_lopetusvuosi of this infra.
    *
    * @param toiminta_lopetusvuosi the toiminta_lopetusvuosi of this infra
    */
    @Override
    public void setToiminta_lopetusvuosi(int toiminta_lopetusvuosi) {
        _infra.setToiminta_lopetusvuosi(toiminta_lopetusvuosi);
    }

    /**
    * Returns the nimi of this infra.
    *
    * @return the nimi of this infra
    */
    @Override
    public java.lang.String getNimi() {
        return _infra.getNimi();
    }

    /**
    * Sets the nimi of this infra.
    *
    * @param nimi the nimi of this infra
    */
    @Override
    public void setNimi(java.lang.String nimi) {
        _infra.setNimi(nimi);
    }

    /**
    * Returns the name of this infra.
    *
    * @return the name of this infra
    */
    @Override
    public java.lang.String getName() {
        return _infra.getName();
    }

    /**
    * Sets the name of this infra.
    *
    * @param name the name of this infra
    */
    @Override
    public void setName(java.lang.String name) {
        _infra.setName(name);
    }

    /**
    * Returns the lyhenne of this infra.
    *
    * @return the lyhenne of this infra
    */
    @Override
    public java.lang.String getLyhenne() {
        return _infra.getLyhenne();
    }

    /**
    * Sets the lyhenne of this infra.
    *
    * @param lyhenne the lyhenne of this infra
    */
    @Override
    public void setLyhenne(java.lang.String lyhenne) {
        _infra.setLyhenne(lyhenne);
    }

    /**
    * Returns the acronym of this infra.
    *
    * @return the acronym of this infra
    */
    @Override
    public java.lang.String getAcronym() {
        return _infra.getAcronym();
    }

    /**
    * Sets the acronym of this infra.
    *
    * @param acronym the acronym of this infra
    */
    @Override
    public void setAcronym(java.lang.String acronym) {
        _infra.setAcronym(acronym);
    }

    /**
    * Returns the edellinen_infra of this infra.
    *
    * @return the edellinen_infra of this infra
    */
    @Override
    public int getEdellinen_infra() {
        return _infra.getEdellinen_infra();
    }

    /**
    * Sets the edellinen_infra of this infra.
    *
    * @param edellinen_infra the edellinen_infra of this infra
    */
    @Override
    public void setEdellinen_infra(int edellinen_infra) {
        _infra.setEdellinen_infra(edellinen_infra);
    }

    /**
    * Returns the kuvaus of this infra.
    *
    * @return the kuvaus of this infra
    */
    @Override
    public java.lang.String getKuvaus() {
        return _infra.getKuvaus();
    }

    /**
    * Sets the kuvaus of this infra.
    *
    * @param kuvaus the kuvaus of this infra
    */
    @Override
    public void setKuvaus(java.lang.String kuvaus) {
        _infra.setKuvaus(kuvaus);
    }

    /**
    * Returns the description of this infra.
    *
    * @return the description of this infra
    */
    @Override
    public java.lang.String getDescription() {
        return _infra.getDescription();
    }

    /**
    * Sets the description of this infra.
    *
    * @param description the description of this infra
    */
    @Override
    public void setDescription(java.lang.String description) {
        _infra.setDescription(description);
    }

    /**
    * Returns the logo_url of this infra.
    *
    * @return the logo_url of this infra
    */
    @Override
    public java.lang.String getLogo_url() {
        return _infra.getLogo_url();
    }

    /**
    * Sets the logo_url of this infra.
    *
    * @param logo_url the logo_url of this infra
    */
    @Override
    public void setLogo_url(java.lang.String logo_url) {
        _infra.setLogo_url(logo_url);
    }

    /**
    * Returns the image_url of this infra.
    *
    * @return the image_url of this infra
    */
    @Override
    public java.lang.String getImage_url() {
        return _infra.getImage_url();
    }

    /**
    * Sets the image_url of this infra.
    *
    * @param image_url the image_url of this infra
    */
    @Override
    public void setImage_url(java.lang.String image_url) {
        _infra.setImage_url(image_url);
    }

    @Override
    public boolean isNew() {
        return _infra.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _infra.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _infra.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _infra.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _infra.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _infra.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _infra.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _infra.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _infra.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _infra.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _infra.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new InfraWrapper((Infra) _infra.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.tupa.db.model.Infra infra) {
        return _infra.compareTo(infra);
    }

    @Override
    public int hashCode() {
        return _infra.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.Infra> toCacheModel() {
        return _infra.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra toEscapedModel() {
        return new InfraWrapper(_infra.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Infra toUnescapedModel() {
        return new InfraWrapper(_infra.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _infra.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _infra.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _infra.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof InfraWrapper)) {
            return false;
        }

        InfraWrapper infraWrapper = (InfraWrapper) obj;

        if (Validator.equals(_infra, infraWrapper._infra)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Infra getWrappedInfra() {
        return _infra;
    }

    @Override
    public Infra getWrappedModel() {
        return _infra;
    }

    @Override
    public void resetOriginalValues() {
        _infra.resetOriginalValues();
    }
}
