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
public class OrganisaatioSoap implements Serializable {
    private int _organisaatio_id;
    private String _nimi;
    private String _name;
    private String _maa;
    private String _ISNI;
    private String _crmid;
    private int _emo_organisaatio;
    private boolean _kv_isanta;

    public OrganisaatioSoap() {
    }

    public static OrganisaatioSoap toSoapModel(Organisaatio model) {
        OrganisaatioSoap soapModel = new OrganisaatioSoap();

        soapModel.setOrganisaatio_id(model.getOrganisaatio_id());
        soapModel.setNimi(model.getNimi());
        soapModel.setName(model.getName());
        soapModel.setMaa(model.getMaa());
        soapModel.setISNI(model.getISNI());
        soapModel.setCrmid(model.getCrmid());
        soapModel.setEmo_organisaatio(model.getEmo_organisaatio());
        soapModel.setKv_isanta(model.getKv_isanta());

        return soapModel;
    }

    public static OrganisaatioSoap[] toSoapModels(Organisaatio[] models) {
        OrganisaatioSoap[] soapModels = new OrganisaatioSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static OrganisaatioSoap[][] toSoapModels(Organisaatio[][] models) {
        OrganisaatioSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new OrganisaatioSoap[models.length][models[0].length];
        } else {
            soapModels = new OrganisaatioSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static OrganisaatioSoap[] toSoapModels(List<Organisaatio> models) {
        List<OrganisaatioSoap> soapModels = new ArrayList<OrganisaatioSoap>(models.size());

        for (Organisaatio model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new OrganisaatioSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _organisaatio_id;
    }

    public void setPrimaryKey(int pk) {
        setOrganisaatio_id(pk);
    }

    public int getOrganisaatio_id() {
        return _organisaatio_id;
    }

    public void setOrganisaatio_id(int organisaatio_id) {
        _organisaatio_id = organisaatio_id;
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

    public String getMaa() {
        return _maa;
    }

    public void setMaa(String maa) {
        _maa = maa;
    }

    public String getISNI() {
        return _ISNI;
    }

    public void setISNI(String ISNI) {
        _ISNI = ISNI;
    }

    public String getCrmid() {
        return _crmid;
    }

    public void setCrmid(String crmid) {
        _crmid = crmid;
    }

    public int getEmo_organisaatio() {
        return _emo_organisaatio;
    }

    public void setEmo_organisaatio(int emo_organisaatio) {
        _emo_organisaatio = emo_organisaatio;
    }

    public boolean getKv_isanta() {
        return _kv_isanta;
    }

    public boolean isKv_isanta() {
        return _kv_isanta;
    }

    public void setKv_isanta(boolean kv_isanta) {
        _kv_isanta = kv_isanta;
    }
}
