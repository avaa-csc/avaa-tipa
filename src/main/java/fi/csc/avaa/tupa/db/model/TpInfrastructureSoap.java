package fi.csc.avaa.tupa.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.avaa.tupa.db.service.http.TpInfrastructureServiceSoap}.
 *
 * @author CSC
 * @see fi.csc.avaa.tupa.db.service.http.TpInfrastructureServiceSoap
 * @generated
 */
public class TpInfrastructureSoap implements Serializable {
    private int _id;
    private String _urn;
    private String _name_EN;
    private String _name_FI;
    private String _acronym_EN;
    private String _acronym_FI;
    private String _description_EN;
    private String _description_FI;
    private boolean _active;
    private int _preparationsStarted;
    private int _buildingStarted;
    private int _operationsStarted;
    private int _operationsFinished;
    private String _formerIds;
    private String _formerUrns;

    public TpInfrastructureSoap() {
    }

    public static TpInfrastructureSoap toSoapModel(TpInfrastructure model) {
        TpInfrastructureSoap soapModel = new TpInfrastructureSoap();

        soapModel.setId(model.getId());
        soapModel.setUrn(model.getUrn());
        soapModel.setName_EN(model.getName_EN());
        soapModel.setName_FI(model.getName_FI());
        soapModel.setAcronym_EN(model.getAcronym_EN());
        soapModel.setAcronym_FI(model.getAcronym_FI());
        soapModel.setDescription_EN(model.getDescription_EN());
        soapModel.setDescription_FI(model.getDescription_FI());
        soapModel.setActive(model.getActive());
        soapModel.setPreparationsStarted(model.getPreparationsStarted());
        soapModel.setBuildingStarted(model.getBuildingStarted());
        soapModel.setOperationsStarted(model.getOperationsStarted());
        soapModel.setOperationsFinished(model.getOperationsFinished());
        soapModel.setFormerIds(model.getFormerIds());
        soapModel.setFormerUrns(model.getFormerUrns());

        return soapModel;
    }

    public static TpInfrastructureSoap[] toSoapModels(TpInfrastructure[] models) {
        TpInfrastructureSoap[] soapModels = new TpInfrastructureSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TpInfrastructureSoap[][] toSoapModels(
        TpInfrastructure[][] models) {
        TpInfrastructureSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TpInfrastructureSoap[models.length][models[0].length];
        } else {
            soapModels = new TpInfrastructureSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TpInfrastructureSoap[] toSoapModels(
        List<TpInfrastructure> models) {
        List<TpInfrastructureSoap> soapModels = new ArrayList<TpInfrastructureSoap>(models.size());

        for (TpInfrastructure model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TpInfrastructureSoap[soapModels.size()]);
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

    public String getUrn() {
        return _urn;
    }

    public void setUrn(String urn) {
        _urn = urn;
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

    public String getAcronym_EN() {
        return _acronym_EN;
    }

    public void setAcronym_EN(String acronym_EN) {
        _acronym_EN = acronym_EN;
    }

    public String getAcronym_FI() {
        return _acronym_FI;
    }

    public void setAcronym_FI(String acronym_FI) {
        _acronym_FI = acronym_FI;
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

    public boolean getActive() {
        return _active;
    }

    public boolean isActive() {
        return _active;
    }

    public void setActive(boolean active) {
        _active = active;
    }

    public int getPreparationsStarted() {
        return _preparationsStarted;
    }

    public void setPreparationsStarted(int preparationsStarted) {
        _preparationsStarted = preparationsStarted;
    }

    public int getBuildingStarted() {
        return _buildingStarted;
    }

    public void setBuildingStarted(int buildingStarted) {
        _buildingStarted = buildingStarted;
    }

    public int getOperationsStarted() {
        return _operationsStarted;
    }

    public void setOperationsStarted(int operationsStarted) {
        _operationsStarted = operationsStarted;
    }

    public int getOperationsFinished() {
        return _operationsFinished;
    }

    public void setOperationsFinished(int operationsFinished) {
        _operationsFinished = operationsFinished;
    }

    public String getFormerIds() {
        return _formerIds;
    }

    public void setFormerIds(String formerIds) {
        _formerIds = formerIds;
    }

    public String getFormerUrns() {
        return _formerUrns;
    }

    public void setFormerUrns(String formerUrns) {
        _formerUrns = formerUrns;
    }
}
