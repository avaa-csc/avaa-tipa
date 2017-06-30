package fi.csc.avaa.tupa.db.model;

import fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author CSC
 * @generated
 */
public class Infra_VastuuorganisaatiotSoap implements Serializable {
    private int _infra_id;
    private int _organisaatio_id;

    public Infra_VastuuorganisaatiotSoap() {
    }

    public static Infra_VastuuorganisaatiotSoap toSoapModel(
        Infra_Vastuuorganisaatiot model) {
        Infra_VastuuorganisaatiotSoap soapModel = new Infra_VastuuorganisaatiotSoap();

        soapModel.setInfra_id(model.getInfra_id());
        soapModel.setOrganisaatio_id(model.getOrganisaatio_id());

        return soapModel;
    }

    public static Infra_VastuuorganisaatiotSoap[] toSoapModels(
        Infra_Vastuuorganisaatiot[] models) {
        Infra_VastuuorganisaatiotSoap[] soapModels = new Infra_VastuuorganisaatiotSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Infra_VastuuorganisaatiotSoap[][] toSoapModels(
        Infra_Vastuuorganisaatiot[][] models) {
        Infra_VastuuorganisaatiotSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Infra_VastuuorganisaatiotSoap[models.length][models[0].length];
        } else {
            soapModels = new Infra_VastuuorganisaatiotSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Infra_VastuuorganisaatiotSoap[] toSoapModels(
        List<Infra_Vastuuorganisaatiot> models) {
        List<Infra_VastuuorganisaatiotSoap> soapModels = new ArrayList<Infra_VastuuorganisaatiotSoap>(models.size());

        for (Infra_Vastuuorganisaatiot model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Infra_VastuuorganisaatiotSoap[soapModels.size()]);
    }

    public Infra_VastuuorganisaatiotPK getPrimaryKey() {
        return new Infra_VastuuorganisaatiotPK(_infra_id, _organisaatio_id);
    }

    public void setPrimaryKey(Infra_VastuuorganisaatiotPK pk) {
        setInfra_id(pk.infra_id);
        setOrganisaatio_id(pk.organisaatio_id);
    }

    public int getInfra_id() {
        return _infra_id;
    }

    public void setInfra_id(int infra_id) {
        _infra_id = infra_id;
    }

    public int getOrganisaatio_id() {
        return _organisaatio_id;
    }

    public void setOrganisaatio_id(int organisaatio_id) {
        _organisaatio_id = organisaatio_id;
    }
}
