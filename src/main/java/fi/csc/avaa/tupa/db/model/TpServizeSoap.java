package fi.csc.avaa.tupa.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.avaa.tupa.db.service.http.TpServizeServiceSoap}.
 *
 * @author CSC
 * @see fi.csc.avaa.tupa.db.service.http.TpServizeServiceSoap
 * @generated
 */
public class TpServizeSoap implements Serializable {
    private int _id;
    private String _name_EN;
    private String _name_FI;
    private String _description_EN;
    private String _description_FI;
    private String _url;
    private String _address;
    private String _city;
    private double _lat;
    private double _lon;

    public TpServizeSoap() {
    }

    public static TpServizeSoap toSoapModel(TpServize model) {
        TpServizeSoap soapModel = new TpServizeSoap();

        soapModel.setId(model.getId());
        soapModel.setName_EN(model.getName_EN());
        soapModel.setName_FI(model.getName_FI());
        soapModel.setDescription_EN(model.getDescription_EN());
        soapModel.setDescription_FI(model.getDescription_FI());
        soapModel.setUrl(model.getUrl());
        soapModel.setAddress(model.getAddress());
        soapModel.setCity(model.getCity());
        soapModel.setLat(model.getLat());
        soapModel.setLon(model.getLon());

        return soapModel;
    }

    public static TpServizeSoap[] toSoapModels(TpServize[] models) {
        TpServizeSoap[] soapModels = new TpServizeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TpServizeSoap[][] toSoapModels(TpServize[][] models) {
        TpServizeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TpServizeSoap[models.length][models[0].length];
        } else {
            soapModels = new TpServizeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TpServizeSoap[] toSoapModels(List<TpServize> models) {
        List<TpServizeSoap> soapModels = new ArrayList<TpServizeSoap>(models.size());

        for (TpServize model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TpServizeSoap[soapModels.size()]);
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

    public String getName_EN() {
        return _name_EN;
    }

    public void setName_EN(String name_EN) {
        _name_EN = name_EN;
    }

    public String getName_FI() {
        return _name_FI;
    }

    public void setName_FI(String name_FI) {
        _name_FI = name_FI;
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

    public String getUrl() {
        return _url;
    }

    public void setUrl(String url) {
        _url = url;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        _address = address;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String city) {
        _city = city;
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
