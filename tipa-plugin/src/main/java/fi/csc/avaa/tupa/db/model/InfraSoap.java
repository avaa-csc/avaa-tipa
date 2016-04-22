package fi.csc.avaa.tupa.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author pj,jmlehtin
 * @generated
 */
public class InfraSoap implements Serializable {
    private int _infra_id;
    private String _ISNI;
    private boolean _aktiivinen;
    private int _valmistelu_aloitusvuosi;
    private int _rakennus_aloitusvuosi;
    private int _toiminta_aloitusvuosi;
    private int _toiminta_lopetusvuosi;
    private String _nimi;
    private String _name;
    private String _lyhenne;
    private String _acronym;
    private int _edellinen_infra;
    private String _kuvaus;
    private String _description;
    private String _logo_url;
    private String _image_url;

    public InfraSoap() {
    }

    public static InfraSoap toSoapModel(Infra model) {
        InfraSoap soapModel = new InfraSoap();

        soapModel.setInfra_id(model.getInfra_id());
        soapModel.setISNI(model.getISNI());
        soapModel.setAktiivinen(model.getAktiivinen());
        soapModel.setValmistelu_aloitusvuosi(model.getValmistelu_aloitusvuosi());
        soapModel.setRakennus_aloitusvuosi(model.getRakennus_aloitusvuosi());
        soapModel.setToiminta_aloitusvuosi(model.getToiminta_aloitusvuosi());
        soapModel.setToiminta_lopetusvuosi(model.getToiminta_lopetusvuosi());
        soapModel.setNimi(model.getNimi());
        soapModel.setName(model.getName());
        soapModel.setLyhenne(model.getLyhenne());
        soapModel.setAcronym(model.getAcronym());
        soapModel.setEdellinen_infra(model.getEdellinen_infra());
        soapModel.setKuvaus(model.getKuvaus());
        soapModel.setDescription(model.getDescription());
        soapModel.setLogo_url(model.getLogo_url());
        soapModel.setImage_url(model.getImage_url());

        return soapModel;
    }

    public static InfraSoap[] toSoapModels(Infra[] models) {
        InfraSoap[] soapModels = new InfraSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static InfraSoap[][] toSoapModels(Infra[][] models) {
        InfraSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new InfraSoap[models.length][models[0].length];
        } else {
            soapModels = new InfraSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static InfraSoap[] toSoapModels(List<Infra> models) {
        List<InfraSoap> soapModels = new ArrayList<InfraSoap>(models.size());

        for (Infra model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new InfraSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _infra_id;
    }

    public void setPrimaryKey(int pk) {
        setInfra_id(pk);
    }

    public int getInfra_id() {
        return _infra_id;
    }

    public void setInfra_id(int infra_id) {
        _infra_id = infra_id;
    }

    public String getISNI() {
        return _ISNI;
    }

    public void setISNI(String ISNI) {
        _ISNI = ISNI;
    }

    public boolean getAktiivinen() {
        return _aktiivinen;
    }

    public boolean isAktiivinen() {
        return _aktiivinen;
    }

    public void setAktiivinen(boolean aktiivinen) {
        _aktiivinen = aktiivinen;
    }

    public int getValmistelu_aloitusvuosi() {
        return _valmistelu_aloitusvuosi;
    }

    public void setValmistelu_aloitusvuosi(int valmistelu_aloitusvuosi) {
        _valmistelu_aloitusvuosi = valmistelu_aloitusvuosi;
    }

    public int getRakennus_aloitusvuosi() {
        return _rakennus_aloitusvuosi;
    }

    public void setRakennus_aloitusvuosi(int rakennus_aloitusvuosi) {
        _rakennus_aloitusvuosi = rakennus_aloitusvuosi;
    }

    public int getToiminta_aloitusvuosi() {
        return _toiminta_aloitusvuosi;
    }

    public void setToiminta_aloitusvuosi(int toiminta_aloitusvuosi) {
        _toiminta_aloitusvuosi = toiminta_aloitusvuosi;
    }

    public int getToiminta_lopetusvuosi() {
        return _toiminta_lopetusvuosi;
    }

    public void setToiminta_lopetusvuosi(int toiminta_lopetusvuosi) {
        _toiminta_lopetusvuosi = toiminta_lopetusvuosi;
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

    public String getLyhenne() {
        return _lyhenne;
    }

    public void setLyhenne(String lyhenne) {
        _lyhenne = lyhenne;
    }

    public String getAcronym() {
        return _acronym;
    }

    public void setAcronym(String acronym) {
        _acronym = acronym;
    }

    public int getEdellinen_infra() {
        return _edellinen_infra;
    }

    public void setEdellinen_infra(int edellinen_infra) {
        _edellinen_infra = edellinen_infra;
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

    public String getLogo_url() {
        return _logo_url;
    }

    public void setLogo_url(String logo_url) {
        _logo_url = logo_url;
    }

    public String getImage_url() {
        return _image_url;
    }

    public void setImage_url(String image_url) {
        _image_url = image_url;
    }
}
