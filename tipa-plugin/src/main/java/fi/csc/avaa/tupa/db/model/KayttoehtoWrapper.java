package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Kayttoehto}.
 * </p>
 *
 * @author pj,jmlehtin
 * @see Kayttoehto
 * @generated
 */
public class KayttoehtoWrapper implements Kayttoehto, ModelWrapper<Kayttoehto> {
    private Kayttoehto _kayttoehto;

    public KayttoehtoWrapper(Kayttoehto kayttoehto) {
        _kayttoehto = kayttoehto;
    }

    @Override
    public Class<?> getModelClass() {
        return Kayttoehto.class;
    }

    @Override
    public String getModelClassName() {
        return Kayttoehto.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("infra_id", getInfra_id());
        attributes.put("saavutettavuus", getSaavutettavuus());
        attributes.put("anonymiteetti", getAnonymiteetti());
        attributes.put("maksullisuus", getMaksullisuus());
        attributes.put("tulosten_julkaisuvelvoite",
            getTulosten_julkaisuvelvoite());
        attributes.put("tuotoksien_julkaisuvelvoite",
            getTuotoksien_julkaisuvelvoite());
        attributes.put("osaamisen_avoimuus", getOsaamisen_avoimuus());
        attributes.put("seurantatyokalut", getSeurantatyokalut());
        attributes.put("tulosten_lisensointi", getTulosten_lisensointi());
        attributes.put("URLfi", getURLfi());
        attributes.put("URLen", getURLen());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer infra_id = (Integer) attributes.get("infra_id");

        if (infra_id != null) {
            setInfra_id(infra_id);
        }

        Integer saavutettavuus = (Integer) attributes.get("saavutettavuus");

        if (saavutettavuus != null) {
            setSaavutettavuus(saavutettavuus);
        }

        Integer anonymiteetti = (Integer) attributes.get("anonymiteetti");

        if (anonymiteetti != null) {
            setAnonymiteetti(anonymiteetti);
        }

        Integer maksullisuus = (Integer) attributes.get("maksullisuus");

        if (maksullisuus != null) {
            setMaksullisuus(maksullisuus);
        }

        Integer tulosten_julkaisuvelvoite = (Integer) attributes.get(
                "tulosten_julkaisuvelvoite");

        if (tulosten_julkaisuvelvoite != null) {
            setTulosten_julkaisuvelvoite(tulosten_julkaisuvelvoite);
        }

        Integer tuotoksien_julkaisuvelvoite = (Integer) attributes.get(
                "tuotoksien_julkaisuvelvoite");

        if (tuotoksien_julkaisuvelvoite != null) {
            setTuotoksien_julkaisuvelvoite(tuotoksien_julkaisuvelvoite);
        }

        Integer osaamisen_avoimuus = (Integer) attributes.get(
                "osaamisen_avoimuus");

        if (osaamisen_avoimuus != null) {
            setOsaamisen_avoimuus(osaamisen_avoimuus);
        }

        Integer seurantatyokalut = (Integer) attributes.get("seurantatyokalut");

        if (seurantatyokalut != null) {
            setSeurantatyokalut(seurantatyokalut);
        }

        Integer tulosten_lisensointi = (Integer) attributes.get(
                "tulosten_lisensointi");

        if (tulosten_lisensointi != null) {
            setTulosten_lisensointi(tulosten_lisensointi);
        }

        String URLfi = (String) attributes.get("URLfi");

        if (URLfi != null) {
            setURLfi(URLfi);
        }

        String URLen = (String) attributes.get("URLen");

        if (URLen != null) {
            setURLen(URLen);
        }
    }

    /**
    * Returns the primary key of this kayttoehto.
    *
    * @return the primary key of this kayttoehto
    */
    @Override
    public int getPrimaryKey() {
        return _kayttoehto.getPrimaryKey();
    }

    /**
    * Sets the primary key of this kayttoehto.
    *
    * @param primaryKey the primary key of this kayttoehto
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _kayttoehto.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the infra_id of this kayttoehto.
    *
    * @return the infra_id of this kayttoehto
    */
    @Override
    public int getInfra_id() {
        return _kayttoehto.getInfra_id();
    }

    /**
    * Sets the infra_id of this kayttoehto.
    *
    * @param infra_id the infra_id of this kayttoehto
    */
    @Override
    public void setInfra_id(int infra_id) {
        _kayttoehto.setInfra_id(infra_id);
    }

    /**
    * Returns the saavutettavuus of this kayttoehto.
    *
    * @return the saavutettavuus of this kayttoehto
    */
    @Override
    public int getSaavutettavuus() {
        return _kayttoehto.getSaavutettavuus();
    }

    /**
    * Sets the saavutettavuus of this kayttoehto.
    *
    * @param saavutettavuus the saavutettavuus of this kayttoehto
    */
    @Override
    public void setSaavutettavuus(int saavutettavuus) {
        _kayttoehto.setSaavutettavuus(saavutettavuus);
    }

    /**
    * Returns the anonymiteetti of this kayttoehto.
    *
    * @return the anonymiteetti of this kayttoehto
    */
    @Override
    public int getAnonymiteetti() {
        return _kayttoehto.getAnonymiteetti();
    }

    /**
    * Sets the anonymiteetti of this kayttoehto.
    *
    * @param anonymiteetti the anonymiteetti of this kayttoehto
    */
    @Override
    public void setAnonymiteetti(int anonymiteetti) {
        _kayttoehto.setAnonymiteetti(anonymiteetti);
    }

    /**
    * Returns the maksullisuus of this kayttoehto.
    *
    * @return the maksullisuus of this kayttoehto
    */
    @Override
    public int getMaksullisuus() {
        return _kayttoehto.getMaksullisuus();
    }

    /**
    * Sets the maksullisuus of this kayttoehto.
    *
    * @param maksullisuus the maksullisuus of this kayttoehto
    */
    @Override
    public void setMaksullisuus(int maksullisuus) {
        _kayttoehto.setMaksullisuus(maksullisuus);
    }

    /**
    * Returns the tulosten_julkaisuvelvoite of this kayttoehto.
    *
    * @return the tulosten_julkaisuvelvoite of this kayttoehto
    */
    @Override
    public int getTulosten_julkaisuvelvoite() {
        return _kayttoehto.getTulosten_julkaisuvelvoite();
    }

    /**
    * Sets the tulosten_julkaisuvelvoite of this kayttoehto.
    *
    * @param tulosten_julkaisuvelvoite the tulosten_julkaisuvelvoite of this kayttoehto
    */
    @Override
    public void setTulosten_julkaisuvelvoite(int tulosten_julkaisuvelvoite) {
        _kayttoehto.setTulosten_julkaisuvelvoite(tulosten_julkaisuvelvoite);
    }

    /**
    * Returns the tuotoksien_julkaisuvelvoite of this kayttoehto.
    *
    * @return the tuotoksien_julkaisuvelvoite of this kayttoehto
    */
    @Override
    public int getTuotoksien_julkaisuvelvoite() {
        return _kayttoehto.getTuotoksien_julkaisuvelvoite();
    }

    /**
    * Sets the tuotoksien_julkaisuvelvoite of this kayttoehto.
    *
    * @param tuotoksien_julkaisuvelvoite the tuotoksien_julkaisuvelvoite of this kayttoehto
    */
    @Override
    public void setTuotoksien_julkaisuvelvoite(int tuotoksien_julkaisuvelvoite) {
        _kayttoehto.setTuotoksien_julkaisuvelvoite(tuotoksien_julkaisuvelvoite);
    }

    /**
    * Returns the osaamisen_avoimuus of this kayttoehto.
    *
    * @return the osaamisen_avoimuus of this kayttoehto
    */
    @Override
    public int getOsaamisen_avoimuus() {
        return _kayttoehto.getOsaamisen_avoimuus();
    }

    /**
    * Sets the osaamisen_avoimuus of this kayttoehto.
    *
    * @param osaamisen_avoimuus the osaamisen_avoimuus of this kayttoehto
    */
    @Override
    public void setOsaamisen_avoimuus(int osaamisen_avoimuus) {
        _kayttoehto.setOsaamisen_avoimuus(osaamisen_avoimuus);
    }

    /**
    * Returns the seurantatyokalut of this kayttoehto.
    *
    * @return the seurantatyokalut of this kayttoehto
    */
    @Override
    public int getSeurantatyokalut() {
        return _kayttoehto.getSeurantatyokalut();
    }

    /**
    * Sets the seurantatyokalut of this kayttoehto.
    *
    * @param seurantatyokalut the seurantatyokalut of this kayttoehto
    */
    @Override
    public void setSeurantatyokalut(int seurantatyokalut) {
        _kayttoehto.setSeurantatyokalut(seurantatyokalut);
    }

    /**
    * Returns the tulosten_lisensointi of this kayttoehto.
    *
    * @return the tulosten_lisensointi of this kayttoehto
    */
    @Override
    public int getTulosten_lisensointi() {
        return _kayttoehto.getTulosten_lisensointi();
    }

    /**
    * Sets the tulosten_lisensointi of this kayttoehto.
    *
    * @param tulosten_lisensointi the tulosten_lisensointi of this kayttoehto
    */
    @Override
    public void setTulosten_lisensointi(int tulosten_lisensointi) {
        _kayttoehto.setTulosten_lisensointi(tulosten_lisensointi);
    }

    /**
    * Returns the u r lfi of this kayttoehto.
    *
    * @return the u r lfi of this kayttoehto
    */
    @Override
    public java.lang.String getURLfi() {
        return _kayttoehto.getURLfi();
    }

    /**
    * Sets the u r lfi of this kayttoehto.
    *
    * @param URLfi the u r lfi of this kayttoehto
    */
    @Override
    public void setURLfi(java.lang.String URLfi) {
        _kayttoehto.setURLfi(URLfi);
    }

    /**
    * Returns the u r len of this kayttoehto.
    *
    * @return the u r len of this kayttoehto
    */
    @Override
    public java.lang.String getURLen() {
        return _kayttoehto.getURLen();
    }

    /**
    * Sets the u r len of this kayttoehto.
    *
    * @param URLen the u r len of this kayttoehto
    */
    @Override
    public void setURLen(java.lang.String URLen) {
        _kayttoehto.setURLen(URLen);
    }

    @Override
    public boolean isNew() {
        return _kayttoehto.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _kayttoehto.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _kayttoehto.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _kayttoehto.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _kayttoehto.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _kayttoehto.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _kayttoehto.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _kayttoehto.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _kayttoehto.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _kayttoehto.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _kayttoehto.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new KayttoehtoWrapper((Kayttoehto) _kayttoehto.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.tupa.db.model.Kayttoehto kayttoehto) {
        return _kayttoehto.compareTo(kayttoehto);
    }

    @Override
    public int hashCode() {
        return _kayttoehto.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.Kayttoehto> toCacheModel() {
        return _kayttoehto.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Kayttoehto toEscapedModel() {
        return new KayttoehtoWrapper(_kayttoehto.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.Kayttoehto toUnescapedModel() {
        return new KayttoehtoWrapper(_kayttoehto.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _kayttoehto.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _kayttoehto.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _kayttoehto.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof KayttoehtoWrapper)) {
            return false;
        }

        KayttoehtoWrapper kayttoehtoWrapper = (KayttoehtoWrapper) obj;

        if (Validator.equals(_kayttoehto, kayttoehtoWrapper._kayttoehto)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Kayttoehto getWrappedKayttoehto() {
        return _kayttoehto;
    }

    @Override
    public Kayttoehto getWrappedModel() {
        return _kayttoehto;
    }

    @Override
    public void resetOriginalValues() {
        _kayttoehto.resetOriginalValues();
    }
}
