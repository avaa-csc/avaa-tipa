package fi.csc.avaa.tupa.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.avaa.tupa.db.service.http.TpOrganisationServiceSoap}.
 *
 * @author CSC
 * @see fi.csc.avaa.tupa.db.service.http.TpOrganisationServiceSoap
 * @generated
 */
public class TpOrganisationSoap implements Serializable {
    private int _id;
    private String _name_EN;
    private String _name_FI;
    private String _isni;
    private int _motherOrganisationsIds;
    private String _country;

    public TpOrganisationSoap() {
    }

    public static TpOrganisationSoap toSoapModel(TpOrganisation model) {
        TpOrganisationSoap soapModel = new TpOrganisationSoap();

        soapModel.setId(model.getId());
        soapModel.setName_EN(model.getName_EN());
        soapModel.setName_FI(model.getName_FI());
        soapModel.setIsni(model.getIsni());
        soapModel.setMotherOrganisationsIds(model.getMotherOrganisationsIds());
        soapModel.setCountry(model.getCountry());

        return soapModel;
    }

    public static TpOrganisationSoap[] toSoapModels(TpOrganisation[] models) {
        TpOrganisationSoap[] soapModels = new TpOrganisationSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TpOrganisationSoap[][] toSoapModels(TpOrganisation[][] models) {
        TpOrganisationSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TpOrganisationSoap[models.length][models[0].length];
        } else {
            soapModels = new TpOrganisationSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TpOrganisationSoap[] toSoapModels(List<TpOrganisation> models) {
        List<TpOrganisationSoap> soapModels = new ArrayList<TpOrganisationSoap>(models.size());

        for (TpOrganisation model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TpOrganisationSoap[soapModels.size()]);
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

    public String getIsni() {
        return _isni;
    }

    public void setIsni(String isni) {
        _isni = isni;
    }

    public int getMotherOrganisationsIds() {
        return _motherOrganisationsIds;
    }

    public void setMotherOrganisationsIds(int motherOrganisationsIds) {
        _motherOrganisationsIds = motherOrganisationsIds;
    }

    public String getCountry() {
        return _country;
    }

    public void setCountry(String country) {
        _country = country;
    }
}
