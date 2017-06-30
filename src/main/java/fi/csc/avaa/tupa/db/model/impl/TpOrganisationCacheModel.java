package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.TpOrganisation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TpOrganisation in entity cache.
 *
 * @author CSC
 * @see TpOrganisation
 * @generated
 */
public class TpOrganisationCacheModel implements CacheModel<TpOrganisation>,
    Externalizable {
    public int id;
    public String name_EN;
    public String name_FI;
    public String isni;
    public int motherOrganisationsIds;
    public String country;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{id=");
        sb.append(id);
        sb.append(", name_EN=");
        sb.append(name_EN);
        sb.append(", name_FI=");
        sb.append(name_FI);
        sb.append(", isni=");
        sb.append(isni);
        sb.append(", motherOrganisationsIds=");
        sb.append(motherOrganisationsIds);
        sb.append(", country=");
        sb.append(country);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public TpOrganisation toEntityModel() {
        TpOrganisationImpl tpOrganisationImpl = new TpOrganisationImpl();

        tpOrganisationImpl.setId(id);

        if (name_EN == null) {
            tpOrganisationImpl.setName_EN(StringPool.BLANK);
        } else {
            tpOrganisationImpl.setName_EN(name_EN);
        }

        if (name_FI == null) {
            tpOrganisationImpl.setName_FI(StringPool.BLANK);
        } else {
            tpOrganisationImpl.setName_FI(name_FI);
        }

        if (isni == null) {
            tpOrganisationImpl.setIsni(StringPool.BLANK);
        } else {
            tpOrganisationImpl.setIsni(isni);
        }

        tpOrganisationImpl.setMotherOrganisationsIds(motherOrganisationsIds);

        if (country == null) {
            tpOrganisationImpl.setCountry(StringPool.BLANK);
        } else {
            tpOrganisationImpl.setCountry(country);
        }

        tpOrganisationImpl.resetOriginalValues();

        return tpOrganisationImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readInt();
        name_EN = objectInput.readUTF();
        name_FI = objectInput.readUTF();
        isni = objectInput.readUTF();
        motherOrganisationsIds = objectInput.readInt();
        country = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(id);

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

        if (isni == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(isni);
        }

        objectOutput.writeInt(motherOrganisationsIds);

        if (country == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(country);
        }
    }
}
