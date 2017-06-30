package fi.csc.avaa.tupa.db.model;

import fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author CSC
 * @generated
 */
public class Infra_AvainsanatSoap implements Serializable {
    private int _infra_id;
    private int _avainsana_id;

    public Infra_AvainsanatSoap() {
    }

    public static Infra_AvainsanatSoap toSoapModel(Infra_Avainsanat model) {
        Infra_AvainsanatSoap soapModel = new Infra_AvainsanatSoap();

        soapModel.setInfra_id(model.getInfra_id());
        soapModel.setAvainsana_id(model.getAvainsana_id());

        return soapModel;
    }

    public static Infra_AvainsanatSoap[] toSoapModels(Infra_Avainsanat[] models) {
        Infra_AvainsanatSoap[] soapModels = new Infra_AvainsanatSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Infra_AvainsanatSoap[][] toSoapModels(
        Infra_Avainsanat[][] models) {
        Infra_AvainsanatSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Infra_AvainsanatSoap[models.length][models[0].length];
        } else {
            soapModels = new Infra_AvainsanatSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Infra_AvainsanatSoap[] toSoapModels(
        List<Infra_Avainsanat> models) {
        List<Infra_AvainsanatSoap> soapModels = new ArrayList<Infra_AvainsanatSoap>(models.size());

        for (Infra_Avainsanat model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Infra_AvainsanatSoap[soapModels.size()]);
    }

    public Infra_AvainsanatPK getPrimaryKey() {
        return new Infra_AvainsanatPK(_infra_id, _avainsana_id);
    }

    public void setPrimaryKey(Infra_AvainsanatPK pk) {
        setInfra_id(pk.infra_id);
        setAvainsana_id(pk.avainsana_id);
    }

    public int getInfra_id() {
        return _infra_id;
    }

    public void setInfra_id(int infra_id) {
        _infra_id = infra_id;
    }

    public int getAvainsana_id() {
        return _avainsana_id;
    }

    public void setAvainsana_id(int avainsana_id) {
        _avainsana_id = avainsana_id;
    }
}
