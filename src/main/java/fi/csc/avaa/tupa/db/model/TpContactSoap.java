package fi.csc.avaa.tupa.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.avaa.tupa.db.service.http.TpContactServiceSoap}.
 *
 * @author CSC
 * @see fi.csc.avaa.tupa.db.service.http.TpContactServiceSoap
 * @generated
 */
public class TpContactSoap implements Serializable {
    private int _id;
    private String _email;
    private String _phone;
    private String _title;
    private String _firstName;
    private String _lastName;
    private String _url;
    private String _description_EN;
    private String _description_FI;

    public TpContactSoap() {
    }

    public static TpContactSoap toSoapModel(TpContact model) {
        TpContactSoap soapModel = new TpContactSoap();

        soapModel.setId(model.getId());
        soapModel.setEmail(model.getEmail());
        soapModel.setPhone(model.getPhone());
        soapModel.setTitle(model.getTitle());
        soapModel.setFirstName(model.getFirstName());
        soapModel.setLastName(model.getLastName());
        soapModel.setUrl(model.getUrl());
        soapModel.setDescription_EN(model.getDescription_EN());
        soapModel.setDescription_FI(model.getDescription_FI());

        return soapModel;
    }

    public static TpContactSoap[] toSoapModels(TpContact[] models) {
        TpContactSoap[] soapModels = new TpContactSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TpContactSoap[][] toSoapModels(TpContact[][] models) {
        TpContactSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TpContactSoap[models.length][models[0].length];
        } else {
            soapModels = new TpContactSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TpContactSoap[] toSoapModels(List<TpContact> models) {
        List<TpContactSoap> soapModels = new ArrayList<TpContactSoap>(models.size());

        for (TpContact model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TpContactSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(int pk) {
        setId(pk);
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public String getPhone() {
        return _phone;
    }

    public void setPhone(String phone) {
        _phone = phone;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public String getUrl() {
        return _url;
    }

    public void setUrl(String url) {
        _url = url;
    }

    public String getDescription_EN() {
        return _description_EN;
    }

    public void setDescription_EN(String description_EN) {
        _description_EN = description_EN;
    }

    public String getDescription_FI() {
        return _description_FI;
    }

    public void setDescription_FI(String description_FI) {
        _description_FI = description_FI;
    }
}
