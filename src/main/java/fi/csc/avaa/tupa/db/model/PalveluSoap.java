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
public class PalveluSoap implements Serializable {
    private int _palvelu_id;
    private String _nimi;
    private String _name;
    private String _kuvaus;
    private String _description;
    private String _URLen;
    private String _URLfi;
    private int _paikkatyyppi;
    private String _katuosoite;
    private String _kaupunki;
    private double _lat;
    private double _lon;

    public PalveluSoap() {
    }

    public static PalveluSoap toSoapModel(Palvelu model) {
        PalveluSoap soapModel = new PalveluSoap();

        soapModel.setPalvelu_id(model.getPalvelu_id());
        soapModel.setNimi(model.getNimi());
        soapModel.setName(model.getName());
        soapModel.setKuvaus(model.getKuvaus());
        soapModel.setDescription(model.getDescription());
        soapModel.setURLen(model.getURLen());
        soapModel.setURLfi(model.getURLfi());
        soapModel.setPaikkatyyppi(model.getPaikkatyyppi());
        soapModel.setKatuosoite(model.getKatuosoite());
        soapModel.setKaupunki(model.getKaupunki());
        soapModel.setLat(model.getLat());
        soapModel.setLon(model.getLon());

        return soapModel;
    }

    public static PalveluSoap[] toSoapModels(Palvelu[] models) {
        PalveluSoap[] soapModels = new PalveluSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PalveluSoap[][] toSoapModels(Palvelu[][] models) {
        PalveluSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PalveluSoap[models.length][models[0].length];
        } else {
            soapModels = new PalveluSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PalveluSoap[] toSoapModels(List<Palvelu> models) {
        List<PalveluSoap> soapModels = new ArrayList<PalveluSoap>(models.size());

        for (Palvelu model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PalveluSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _palvelu_id;
    }

    public void setPrimaryKey(int pk) {
        setPalvelu_id(pk);
    }

    public int getPalvelu_id() {
        return _palvelu_id;
    }

    public void setPalvelu_id(int palvelu_id) {
        _palvelu_id = palvelu_id;
    }

    public String getNimi() {
        return _nimi;
    }

    public void setNimi(String nimi) {
        _nimi = nimi;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
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

    public String getURLen() {
        return _URLen;
    }

    public void setURLen(String URLen) {
        _URLen = URLen;
    }

    public String getURLfi() {
        return _URLfi;
    }

    public void setURLfi(String URLfi) {
        _URLfi = URLfi;
    }

    public int getPaikkatyyppi() {
        return _paikkatyyppi;
    }

    public void setPaikkatyyppi(int paikkatyyppi) {
        _paikkatyyppi = paikkatyyppi;
    }

    public String getKatuosoite() {
        return _katuosoite;
    }

    public void setKatuosoite(String katuosoite) {
        _katuosoite = katuosoite;
    }

    public String getKaupunki() {
        return _kaupunki;
    }

    public void setKaupunki(String kaupunki) {
        _kaupunki = kaupunki;
    }

    public double getLat() {
        return _lat;
    }

    public void setLat(double lat) {
        _lat = lat;
    }

    public double getLon() {
        return _lon;
    }

    public void setLon(double lon) {
        _lon = lon;
    }
}
