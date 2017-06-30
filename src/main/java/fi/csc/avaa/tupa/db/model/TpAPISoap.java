package fi.csc.avaa.tupa.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.avaa.tupa.db.service.http.TpAPIServiceSoap}.
 *
 * @author CSC
 * @see fi.csc.avaa.tupa.db.service.http.TpAPIServiceSoap
 * @generated
 */
public class TpAPISoap implements Serializable {
    private String _methodsDescription;

    public TpAPISoap() {
    }

    public static TpAPISoap toSoapModel(TpAPI model) {
        TpAPISoap soapModel = new TpAPISoap();

        soapModel.setMethodsDescription(model.getMethodsDescription());

        return soapModel;
    }

    public static TpAPISoap[] toSoapModels(TpAPI[] models) {
        TpAPISoap[] soapModels = new TpAPISoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TpAPISoap[][] toSoapModels(TpAPI[][] models) {
        TpAPISoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TpAPISoap[models.length][models[0].length];
        } else {
            soapModels = new TpAPISoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TpAPISoap[] toSoapModels(List<TpAPI> models) {
        List<TpAPISoap> soapModels = new ArrayList<TpAPISoap>(models.size());

        for (TpAPI model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TpAPISoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _methodsDescription;
    }

    public void setPrimaryKey(String pk) {
        setMethodsDescription(pk);
    }

    public String getMethodsDescription() {
        return _methodsDescription;
    }

    public void setMethodsDescription(String methodsDescription) {
        _methodsDescription = methodsDescription;
    }
}
