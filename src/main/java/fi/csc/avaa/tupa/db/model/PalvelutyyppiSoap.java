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
public class PalvelutyyppiSoap implements Serializable {
    private int _palvelutyyppi_id;
    private int _tyyppi;

    public PalvelutyyppiSoap() {
    }

    public static PalvelutyyppiSoap toSoapModel(Palvelutyyppi model) {
        PalvelutyyppiSoap soapModel = new PalvelutyyppiSoap();

        soapModel.setPalvelutyyppi_id(model.getPalvelutyyppi_id());
        soapModel.setTyyppi(model.getTyyppi());

        return soapModel;
    }

    public static PalvelutyyppiSoap[] toSoapModels(Palvelutyyppi[] models) {
        PalvelutyyppiSoap[] soapModels = new PalvelutyyppiSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PalvelutyyppiSoap[][] toSoapModels(Palvelutyyppi[][] models) {
        PalvelutyyppiSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PalvelutyyppiSoap[models.length][models[0].length];
        } else {
            soapModels = new PalvelutyyppiSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PalvelutyyppiSoap[] toSoapModels(List<Palvelutyyppi> models) {
        List<PalvelutyyppiSoap> soapModels = new ArrayList<PalvelutyyppiSoap>(models.size());

        for (Palvelutyyppi model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PalvelutyyppiSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _palvelutyyppi_id;
    }

    public void setPrimaryKey(int pk) {
        setPalvelutyyppi_id(pk);
    }

    public int getPalvelutyyppi_id() {
        return _palvelutyyppi_id;
    }

    public void setPalvelutyyppi_id(int palvelutyyppi_id) {
        _palvelutyyppi_id = palvelutyyppi_id;
    }

    public int getTyyppi() {
        return _tyyppi;
    }

    public void setTyyppi(int tyyppi) {
        _tyyppi = tyyppi;
    }
}
