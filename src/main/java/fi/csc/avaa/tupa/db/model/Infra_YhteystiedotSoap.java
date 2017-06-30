package fi.csc.avaa.tupa.db.model;

import fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author CSC
 * @generated
 */
public class Infra_YhteystiedotSoap implements Serializable {
    private int _infra_id;
    private int _yhteystieto_id;

    public Infra_YhteystiedotSoap() {
    }

    public static Infra_YhteystiedotSoap toSoapModel(Infra_Yhteystiedot model) {
        Infra_YhteystiedotSoap soapModel = new Infra_YhteystiedotSoap();

        soapModel.setInfra_id(model.getInfra_id());
        soapModel.setYhteystieto_id(model.getYhteystieto_id());

        return soapModel;
    }

    public static Infra_YhteystiedotSoap[] toSoapModels(
        Infra_Yhteystiedot[] models) {
        Infra_YhteystiedotSoap[] soapModels = new Infra_YhteystiedotSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Infra_YhteystiedotSoap[][] toSoapModels(
        Infra_Yhteystiedot[][] models) {
        Infra_YhteystiedotSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Infra_YhteystiedotSoap[models.length][models[0].length];
        } else {
            soapModels = new Infra_YhteystiedotSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Infra_YhteystiedotSoap[] toSoapModels(
        List<Infra_Yhteystiedot> models) {
        List<Infra_YhteystiedotSoap> soapModels = new ArrayList<Infra_YhteystiedotSoap>(models.size());

        for (Infra_Yhteystiedot model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Infra_YhteystiedotSoap[soapModels.size()]);
    }

    public Infra_YhteystiedotPK getPrimaryKey() {
        return new Infra_YhteystiedotPK(_infra_id, _yhteystieto_id);
    }

    public void setPrimaryKey(Infra_YhteystiedotPK pk) {
        setInfra_id(pk.infra_id);
        setYhteystieto_id(pk.yhteystieto_id);
    }

    public int getInfra_id() {
        return _infra_id;
    }

    public void setInfra_id(int infra_id) {
        _infra_id = infra_id;
    }

    public int getYhteystieto_id() {
        return _yhteystieto_id;
    }

    public void setYhteystieto_id(int yhteystieto_id) {
        _yhteystieto_id = yhteystieto_id;
    }
}
