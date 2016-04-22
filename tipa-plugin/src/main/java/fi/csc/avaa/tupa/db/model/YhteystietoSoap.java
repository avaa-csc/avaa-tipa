package fi.csc.avaa.tupa.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author pj,jmlehtin
 * @generated
 */
public class YhteystietoSoap implements Serializable {
    private int _yhteystieto_id;
    private String _sahkoposti;
    private int _affiliaatio;
    private String _puhelin;
    private String _titteli;
    private String _etunimi;
    private String _sukunimi;
    private String _URL;
    private String _kuvaus;
    private String _description;

    public YhteystietoSoap() {
    }

    public static YhteystietoSoap toSoapModel(Yhteystieto model) {
        YhteystietoSoap soapModel = new YhteystietoSoap();

        soapModel.setYhteystieto_id(model.getYhteystieto_id());
        soapModel.setSahkoposti(model.getSahkoposti());
        soapModel.setAffiliaatio(model.getAffiliaatio());
        soapModel.setPuhelin(model.getPuhelin());
        soapModel.setTitteli(model.getTitteli());
        soapModel.setEtunimi(model.getEtunimi());
        soapModel.setSukunimi(model.getSukunimi());
        soapModel.setURL(model.getURL());
        soapModel.setKuvaus(model.getKuvaus());
        soapModel.setDescription(model.getDescription());

        return soapModel;
    }

    public static YhteystietoSoap[] toSoapModels(Yhteystieto[] models) {
        YhteystietoSoap[] soapModels = new YhteystietoSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static YhteystietoSoap[][] toSoapModels(Yhteystieto[][] models) {
        YhteystietoSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new YhteystietoSoap[models.length][models[0].length];
        } else {
            soapModels = new YhteystietoSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static YhteystietoSoap[] toSoapModels(List<Yhteystieto> models) {
        List<YhteystietoSoap> soapModels = new ArrayList<YhteystietoSoap>(models.size());

        for (Yhteystieto model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new YhteystietoSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _yhteystieto_id;
    }

    public void setPrimaryKey(int pk) {
        setYhteystieto_id(pk);
    }

    public int getYhteystieto_id() {
        return _yhteystieto_id;
    }

    public void setYhteystieto_id(int yhteystieto_id) {
        _yhteystieto_id = yhteystieto_id;
    }

    public String getSahkoposti() {
        return _sahkoposti;
    }

    public void setSahkoposti(String sahkoposti) {
        _sahkoposti = sahkoposti;
    }

    public int getAffiliaatio() {
        return _affiliaatio;
    }

    public void setAffiliaatio(int affiliaatio) {
        _affiliaatio = affiliaatio;
    }

    public String getPuhelin() {
        return _puhelin;
    }

    public void setPuhelin(String puhelin) {
        _puhelin = puhelin;
    }

    public String getTitteli() {
        return _titteli;
    }

    public void setTitteli(String titteli) {
        _titteli = titteli;
    }

    public String getEtunimi() {
        return _etunimi;
    }

    public void setEtunimi(String etunimi) {
        _etunimi = etunimi;
    }

    public String getSukunimi() {
        return _sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        _sukunimi = sukunimi;
    }

    public String getURL() {
        return _URL;
    }

    public void setURL(String URL) {
        _URL = URL;
    }

    public String getKuvaus() {
        return _kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        _kuvaus = kuvaus;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }
}
