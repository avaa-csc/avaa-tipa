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
public class AvainsanaSoap implements Serializable {
    private int _avainsana_id;
    private String _avainsana;
    private String _keyword;

    public AvainsanaSoap() {
    }

    public static AvainsanaSoap toSoapModel(Avainsana model) {
        AvainsanaSoap soapModel = new AvainsanaSoap();

        soapModel.setAvainsana_id(model.getAvainsana_id());
        soapModel.setAvainsana(model.getAvainsana());
        soapModel.setKeyword(model.getKeyword());

        return soapModel;
    }

    public static AvainsanaSoap[] toSoapModels(Avainsana[] models) {
        AvainsanaSoap[] soapModels = new AvainsanaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AvainsanaSoap[][] toSoapModels(Avainsana[][] models) {
        AvainsanaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AvainsanaSoap[models.length][models[0].length];
        } else {
            soapModels = new AvainsanaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AvainsanaSoap[] toSoapModels(List<Avainsana> models) {
        List<AvainsanaSoap> soapModels = new ArrayList<AvainsanaSoap>(models.size());

        for (Avainsana model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AvainsanaSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _avainsana_id;
    }

    public void setPrimaryKey(int pk) {
        setAvainsana_id(pk);
    }

    public int getAvainsana_id() {
        return _avainsana_id;
    }

    public void setAvainsana_id(int avainsana_id) {
        _avainsana_id = avainsana_id;
    }

    public String getAvainsana() {
        return _avainsana;
    }

    public void setAvainsana(String avainsana) {
        _avainsana = avainsana;
    }

    public String getKeyword() {
        return _keyword;
    }

    public void setKeyword(String keyword) {
        _keyword = keyword;
    }
}
