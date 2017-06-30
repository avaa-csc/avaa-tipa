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
public class SeliteSoap implements Serializable {
    private int _selite_id;
    private String _nimi;
    private String _name;
    private String _kuvaus;
    private String _description;
    private String _classificator;

    public SeliteSoap() {
    }

    public static SeliteSoap toSoapModel(Selite model) {
        SeliteSoap soapModel = new SeliteSoap();

        soapModel.setSelite_id(model.getSelite_id());
        soapModel.setNimi(model.getNimi());
        soapModel.setName(model.getName());
        soapModel.setKuvaus(model.getKuvaus());
        soapModel.setDescription(model.getDescription());
        soapModel.setClassificator(model.getClassificator());

        return soapModel;
    }

    public static SeliteSoap[] toSoapModels(Selite[] models) {
        SeliteSoap[] soapModels = new SeliteSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static SeliteSoap[][] toSoapModels(Selite[][] models) {
        SeliteSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new SeliteSoap[models.length][models[0].length];
        } else {
            soapModels = new SeliteSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static SeliteSoap[] toSoapModels(List<Selite> models) {
        List<SeliteSoap> soapModels = new ArrayList<SeliteSoap>(models.size());

        for (Selite model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new SeliteSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _selite_id;
    }

    public void setPrimaryKey(int pk) {
        setSelite_id(pk);
    }

    public int getSelite_id() {
        return _selite_id;
    }

    public void setSelite_id(int selite_id) {
        _selite_id = selite_id;
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

    public String getClassificator() {
        return _classificator;
    }

    public void setClassificator(String classificator) {
        _classificator = classificator;
    }
}
