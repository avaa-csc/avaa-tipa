package fi.csc.avaa.tupa.db.model;

import fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author CSC
 * @generated
 */
public class Infra_IdentifierSoap implements Serializable {
    private int _identifier_type;
    private int _infra_id;
    private String _identifier_value;

    public Infra_IdentifierSoap() {
    }

    public static Infra_IdentifierSoap toSoapModel(Infra_Identifier model) {
        Infra_IdentifierSoap soapModel = new Infra_IdentifierSoap();

        soapModel.setIdentifier_type(model.getIdentifier_type());
        soapModel.setInfra_id(model.getInfra_id());
        soapModel.setIdentifier_value(model.getIdentifier_value());

        return soapModel;
    }

    public static Infra_IdentifierSoap[] toSoapModels(Infra_Identifier[] models) {
        Infra_IdentifierSoap[] soapModels = new Infra_IdentifierSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Infra_IdentifierSoap[][] toSoapModels(
        Infra_Identifier[][] models) {
        Infra_IdentifierSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Infra_IdentifierSoap[models.length][models[0].length];
        } else {
            soapModels = new Infra_IdentifierSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Infra_IdentifierSoap[] toSoapModels(
        List<Infra_Identifier> models) {
        List<Infra_IdentifierSoap> soapModels = new ArrayList<Infra_IdentifierSoap>(models.size());

        for (Infra_Identifier model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Infra_IdentifierSoap[soapModels.size()]);
    }

    public Infra_IdentifierPK getPrimaryKey() {
        return new Infra_IdentifierPK(_identifier_type, _infra_id,
            _identifier_value);
    }

    public void setPrimaryKey(Infra_IdentifierPK pk) {
        setIdentifier_type(pk.identifier_type);
        setInfra_id(pk.infra_id);
        setIdentifier_value(pk.identifier_value);
    }

    public int getIdentifier_type() {
        return _identifier_type;
    }

    public void setIdentifier_type(int identifier_type) {
        _identifier_type = identifier_type;
    }

    public int getInfra_id() {
        return _infra_id;
    }

    public void setInfra_id(int infra_id) {
        _infra_id = infra_id;
    }

    public String getIdentifier_value() {
        return _identifier_value;
    }

    public void setIdentifier_value(String identifier_value) {
        _identifier_value = identifier_value;
    }
}
