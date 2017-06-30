package fi.csc.avaa.tupa.db.model;

import fi.csc.avaa.tupa.db.service.persistence.Infra_PalvelutPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author CSC
 * @generated
 */
public class Infra_PalvelutSoap implements Serializable {
    private int _infra_id;
    private int _palvelu_id;

    public Infra_PalvelutSoap() {
    }

    public static Infra_PalvelutSoap toSoapModel(Infra_Palvelut model) {
        Infra_PalvelutSoap soapModel = new Infra_PalvelutSoap();

        soapModel.setInfra_id(model.getInfra_id());
        soapModel.setPalvelu_id(model.getPalvelu_id());

        return soapModel;
    }

    public static Infra_PalvelutSoap[] toSoapModels(Infra_Palvelut[] models) {
        Infra_PalvelutSoap[] soapModels = new Infra_PalvelutSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Infra_PalvelutSoap[][] toSoapModels(Infra_Palvelut[][] models) {
        Infra_PalvelutSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Infra_PalvelutSoap[models.length][models[0].length];
        } else {
            soapModels = new Infra_PalvelutSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Infra_PalvelutSoap[] toSoapModels(List<Infra_Palvelut> models) {
        List<Infra_PalvelutSoap> soapModels = new ArrayList<Infra_PalvelutSoap>(models.size());

        for (Infra_Palvelut model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Infra_PalvelutSoap[soapModels.size()]);
    }

    public Infra_PalvelutPK getPrimaryKey() {
        return new Infra_PalvelutPK(_infra_id, _palvelu_id);
    }

    public void setPrimaryKey(Infra_PalvelutPK pk) {
        setInfra_id(pk.infra_id);
        setPalvelu_id(pk.palvelu_id);
    }

    public int getInfra_id() {
        return _infra_id;
    }

    public void setInfra_id(int infra_id) {
        _infra_id = infra_id;
    }

    public int getPalvelu_id() {
        return _palvelu_id;
    }

    public void setPalvelu_id(int palvelu_id) {
        _palvelu_id = palvelu_id;
    }
}
