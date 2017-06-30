package fi.csc.avaa.tupa.db.model;

import fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author CSC
 * @generated
 */
public class Palvelu_PalvelutyypitSoap implements Serializable {
    private int _palvelu_id;
    private int _palvelutyyppi_id;

    public Palvelu_PalvelutyypitSoap() {
    }

    public static Palvelu_PalvelutyypitSoap toSoapModel(
        Palvelu_Palvelutyypit model) {
        Palvelu_PalvelutyypitSoap soapModel = new Palvelu_PalvelutyypitSoap();

        soapModel.setPalvelu_id(model.getPalvelu_id());
        soapModel.setPalvelutyyppi_id(model.getPalvelutyyppi_id());

        return soapModel;
    }

    public static Palvelu_PalvelutyypitSoap[] toSoapModels(
        Palvelu_Palvelutyypit[] models) {
        Palvelu_PalvelutyypitSoap[] soapModels = new Palvelu_PalvelutyypitSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Palvelu_PalvelutyypitSoap[][] toSoapModels(
        Palvelu_Palvelutyypit[][] models) {
        Palvelu_PalvelutyypitSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Palvelu_PalvelutyypitSoap[models.length][models[0].length];
        } else {
            soapModels = new Palvelu_PalvelutyypitSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Palvelu_PalvelutyypitSoap[] toSoapModels(
        List<Palvelu_Palvelutyypit> models) {
        List<Palvelu_PalvelutyypitSoap> soapModels = new ArrayList<Palvelu_PalvelutyypitSoap>(models.size());

        for (Palvelu_Palvelutyypit model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Palvelu_PalvelutyypitSoap[soapModels.size()]);
    }

    public Palvelu_PalvelutyypitPK getPrimaryKey() {
        return new Palvelu_PalvelutyypitPK(_palvelu_id, _palvelutyyppi_id);
    }

    public void setPrimaryKey(Palvelu_PalvelutyypitPK pk) {
        setPalvelu_id(pk.palvelu_id);
        setPalvelutyyppi_id(pk.palvelutyyppi_id);
    }

    public int getPalvelu_id() {
        return _palvelu_id;
    }

    public void setPalvelu_id(int palvelu_id) {
        _palvelu_id = palvelu_id;
    }

    public int getPalvelutyyppi_id() {
        return _palvelutyyppi_id;
    }

    public void setPalvelutyyppi_id(int palvelutyyppi_id) {
        _palvelutyyppi_id = palvelutyyppi_id;
    }
}
