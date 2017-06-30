package fi.csc.avaa.tupa.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author CSC
 * @generated
 */
public class KayttoehtoSoap implements Serializable {
    private int _infra_id;
    private int _saavutettavuus;
    private int _anonymiteetti;
    private int _maksullisuus;
    private int _tulosten_julkaisuvelvoite;
    private int _tuotoksien_julkaisuvelvoite;
    private int _osaamisen_avoimuus;
    private int _seurantatyokalut;
    private int _tulosten_lisensointi;
    private String _URLfi;
    private String _URLen;

    public KayttoehtoSoap() {
    }

    public static KayttoehtoSoap toSoapModel(Kayttoehto model) {
        KayttoehtoSoap soapModel = new KayttoehtoSoap();

        soapModel.setInfra_id(model.getInfra_id());
        soapModel.setSaavutettavuus(model.getSaavutettavuus());
        soapModel.setAnonymiteetti(model.getAnonymiteetti());
        soapModel.setMaksullisuus(model.getMaksullisuus());
        soapModel.setTulosten_julkaisuvelvoite(model.getTulosten_julkaisuvelvoite());
        soapModel.setTuotoksien_julkaisuvelvoite(model.getTuotoksien_julkaisuvelvoite());
        soapModel.setOsaamisen_avoimuus(model.getOsaamisen_avoimuus());
        soapModel.setSeurantatyokalut(model.getSeurantatyokalut());
        soapModel.setTulosten_lisensointi(model.getTulosten_lisensointi());
        soapModel.setURLfi(model.getURLfi());
        soapModel.setURLen(model.getURLen());

        return soapModel;
    }

    public static KayttoehtoSoap[] toSoapModels(Kayttoehto[] models) {
        KayttoehtoSoap[] soapModels = new KayttoehtoSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static KayttoehtoSoap[][] toSoapModels(Kayttoehto[][] models) {
        KayttoehtoSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new KayttoehtoSoap[models.length][models[0].length];
        } else {
            soapModels = new KayttoehtoSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static KayttoehtoSoap[] toSoapModels(List<Kayttoehto> models) {
        List<KayttoehtoSoap> soapModels = new ArrayList<KayttoehtoSoap>(models.size());

        for (Kayttoehto model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new KayttoehtoSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _infra_id;
    }

    public void setPrimaryKey(int pk) {
        setInfra_id(pk);
    }

    public int getInfra_id() {
        return _infra_id;
    }

    public void setInfra_id(int infra_id) {
        _infra_id = infra_id;
    }

    public int getSaavutettavuus() {
        return _saavutettavuus;
    }

    public void setSaavutettavuus(int saavutettavuus) {
        _saavutettavuus = saavutettavuus;
    }

    public int getAnonymiteetti() {
        return _anonymiteetti;
    }

    public void setAnonymiteetti(int anonymiteetti) {
        _anonymiteetti = anonymiteetti;
    }

    public int getMaksullisuus() {
        return _maksullisuus;
    }

    public void setMaksullisuus(int maksullisuus) {
        _maksullisuus = maksullisuus;
    }

    public int getTulosten_julkaisuvelvoite() {
        return _tulosten_julkaisuvelvoite;
    }

    public void setTulosten_julkaisuvelvoite(int tulosten_julkaisuvelvoite) {
        _tulosten_julkaisuvelvoite = tulosten_julkaisuvelvoite;
    }

    public int getTuotoksien_julkaisuvelvoite() {
        return _tuotoksien_julkaisuvelvoite;
    }

    public void setTuotoksien_julkaisuvelvoite(int tuotoksien_julkaisuvelvoite) {
        _tuotoksien_julkaisuvelvoite = tuotoksien_julkaisuvelvoite;
    }

    public int getOsaamisen_avoimuus() {
        return _osaamisen_avoimuus;
    }

    public void setOsaamisen_avoimuus(int osaamisen_avoimuus) {
        _osaamisen_avoimuus = osaamisen_avoimuus;
    }

    public int getSeurantatyokalut() {
        return _seurantatyokalut;
    }

    public void setSeurantatyokalut(int seurantatyokalut) {
        _seurantatyokalut = seurantatyokalut;
    }

    public int getTulosten_lisensointi() {
        return _tulosten_lisensointi;
    }

    public void setTulosten_lisensointi(int tulosten_lisensointi) {
        _tulosten_lisensointi = tulosten_lisensointi;
    }

    public String getURLfi() {
        return _URLfi;
    }

    public void setURLfi(String URLfi) {
        _URLfi = URLfi;
    }

    public String getURLen() {
        return _URLen;
    }

    public void setURLen(String URLen) {
        _URLen = URLen;
    }
}
