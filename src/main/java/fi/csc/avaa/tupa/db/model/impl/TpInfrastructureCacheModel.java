package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.TpInfrastructure;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TpInfrastructure in entity cache.
 *
 * @author CSC
 * @see TpInfrastructure
 * @generated
 */
public class TpInfrastructureCacheModel implements CacheModel<TpInfrastructure>,
    Externalizable {
    public int id;
    public String urn;
    public String name_EN;
    public String name_FI;
    public String acronym_EN;
    public String acronym_FI;
    public String description_EN;
    public String description_FI;
    public boolean active;
    public int preparationsStarted;
    public int buildingStarted;
    public int operationsStarted;
    public int operationsFinished;
    public String formerIds;
    public String formerUrns;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(31);

        sb.append("{id=");
        sb.append(id);
        sb.append(", urn=");
        sb.append(urn);
        sb.append(", name_EN=");
        sb.append(name_EN);
        sb.append(", name_FI=");
        sb.append(name_FI);
        sb.append(", acronym_EN=");
        sb.append(acronym_EN);
        sb.append(", acronym_FI=");
        sb.append(acronym_FI);
        sb.append(", description_EN=");
        sb.append(description_EN);
        sb.append(", description_FI=");
        sb.append(description_FI);
        sb.append(", active=");
        sb.append(active);
        sb.append(", preparationsStarted=");
        sb.append(preparationsStarted);
        sb.append(", buildingStarted=");
        sb.append(buildingStarted);
        sb.append(", operationsStarted=");
        sb.append(operationsStarted);
        sb.append(", operationsFinished=");
        sb.append(operationsFinished);
        sb.append(", formerIds=");
        sb.append(formerIds);
        sb.append(", formerUrns=");
        sb.append(formerUrns);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public TpInfrastructure toEntityModel() {
        TpInfrastructureImpl tpInfrastructureImpl = new TpInfrastructureImpl();

        tpInfrastructureImpl.setId(id);

        if (urn == null) {
            tpInfrastructureImpl.setUrn(StringPool.BLANK);
        } else {
            tpInfrastructureImpl.setUrn(urn);
        }

        if (name_EN == null) {
            tpInfrastructureImpl.setName_EN(StringPool.BLANK);
        } else {
            tpInfrastructureImpl.setName_EN(name_EN);
        }

        if (name_FI == null) {
            tpInfrastructureImpl.setName_FI(StringPool.BLANK);
        } else {
            tpInfrastructureImpl.setName_FI(name_FI);
        }

        if (acronym_EN == null) {
            tpInfrastructureImpl.setAcronym_EN(StringPool.BLANK);
        } else {
            tpInfrastructureImpl.setAcronym_EN(acronym_EN);
        }

        if (acronym_FI == null) {
            tpInfrastructureImpl.setAcronym_FI(StringPool.BLANK);
        } else {
            tpInfrastructureImpl.setAcronym_FI(acronym_FI);
        }

        if (description_EN == null) {
            tpInfrastructureImpl.setDescription_EN(StringPool.BLANK);
        } else {
            tpInfrastructureImpl.setDescription_EN(description_EN);
        }

        if (description_FI == null) {
            tpInfrastructureImpl.setDescription_FI(StringPool.BLANK);
        } else {
            tpInfrastructureImpl.setDescription_FI(description_FI);
        }

        tpInfrastructureImpl.setActive(active);
        tpInfrastructureImpl.setPreparationsStarted(preparationsStarted);
        tpInfrastructureImpl.setBuildingStarted(buildingStarted);
        tpInfrastructureImpl.setOperationsStarted(operationsStarted);
        tpInfrastructureImpl.setOperationsFinished(operationsFinished);

        if (formerIds == null) {
            tpInfrastructureImpl.setFormerIds(StringPool.BLANK);
        } else {
            tpInfrastructureImpl.setFormerIds(formerIds);
        }

        if (formerUrns == null) {
            tpInfrastructureImpl.setFormerUrns(StringPool.BLANK);
        } else {
            tpInfrastructureImpl.setFormerUrns(formerUrns);
        }

        tpInfrastructureImpl.resetOriginalValues();

        return tpInfrastructureImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readInt();
        urn = objectInput.readUTF();
        name_EN = objectInput.readUTF();
        name_FI = objectInput.readUTF();
        acronym_EN = objectInput.readUTF();
        acronym_FI = objectInput.readUTF();
        description_EN = objectInput.readUTF();
        description_FI = objectInput.readUTF();
        active = objectInput.readBoolean();
        preparationsStarted = objectInput.readInt();
        buildingStarted = objectInput.readInt();
        operationsStarted = objectInput.readInt();
        operationsFinished = objectInput.readInt();
        formerIds = objectInput.readUTF();
        formerUrns = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(id);

        if (urn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(urn);
        }

        if (name_EN == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name_EN);
        }

        if (name_FI == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name_FI);
        }

        if (acronym_EN == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(acronym_EN);
        }

        if (acronym_FI == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(acronym_FI);
        }

        if (description_EN == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description_EN);
        }

        if (description_FI == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description_FI);
        }

        objectOutput.writeBoolean(active);
        objectOutput.writeInt(preparationsStarted);
        objectOutput.writeInt(buildingStarted);
        objectOutput.writeInt(operationsStarted);
        objectOutput.writeInt(operationsFinished);

        if (formerIds == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(formerIds);
        }

        if (formerUrns == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(formerUrns);
        }
    }
}
