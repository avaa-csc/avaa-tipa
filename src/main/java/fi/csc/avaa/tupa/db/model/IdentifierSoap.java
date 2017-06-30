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
public class IdentifierSoap implements Serializable {
    private int _identifier_type;
    private String _identifier_name;
    private String _identifier_description_translation_key;
    private String _resolution_url;
    private String _definition_url;

    public IdentifierSoap() {
    }

    public static IdentifierSoap toSoapModel(Identifier model) {
        IdentifierSoap soapModel = new IdentifierSoap();

        soapModel.setIdentifier_type(model.getIdentifier_type());
        soapModel.setIdentifier_name(model.getIdentifier_name());
        soapModel.setIdentifier_description_translation_key(model.getIdentifier_description_translation_key());
        soapModel.setResolution_url(model.getResolution_url());
        soapModel.setDefinition_url(model.getDefinition_url());

        return soapModel;
    }

    public static IdentifierSoap[] toSoapModels(Identifier[] models) {
        IdentifierSoap[] soapModels = new IdentifierSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static IdentifierSoap[][] toSoapModels(Identifier[][] models) {
        IdentifierSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new IdentifierSoap[models.length][models[0].length];
        } else {
            soapModels = new IdentifierSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static IdentifierSoap[] toSoapModels(List<Identifier> models) {
        List<IdentifierSoap> soapModels = new ArrayList<IdentifierSoap>(models.size());

        for (Identifier model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new IdentifierSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _identifier_type;
    }

    public void setPrimaryKey(int pk) {
        setIdentifier_type(pk);
    }

    public int getIdentifier_type() {
        return _identifier_type;
    }

    public void setIdentifier_type(int identifier_type) {
        _identifier_type = identifier_type;
    }

    public String getIdentifier_name() {
        return _identifier_name;
    }

    public void setIdentifier_name(String identifier_name) {
        _identifier_name = identifier_name;
    }

    public String getIdentifier_description_translation_key() {
        return _identifier_description_translation_key;
    }

    public void setIdentifier_description_translation_key(
        String identifier_description_translation_key) {
        _identifier_description_translation_key = identifier_description_translation_key;
    }

    public String getResolution_url() {
        return _resolution_url;
    }

    public void setResolution_url(String resolution_url) {
        _resolution_url = resolution_url;
    }

    public String getDefinition_url() {
        return _definition_url;
    }

    public void setDefinition_url(String definition_url) {
        _definition_url = definition_url;
    }
}
