package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.Organisaatio;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Organisaatio in entity cache.
 *
 * @author pj,jmlehtin
 * @see Organisaatio
 * @generated
 */
public class OrganisaatioCacheModel implements CacheModel<Organisaatio>,
    Externalizable {
    public int organisaatio_id;
    public String nimi;
    public String name;
    public String maa;
    public String ISNI;
    public String crmid;
    public int emo_organisaatio;
    public boolean kv_isanta;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{organisaatio_id=");
        sb.append(organisaatio_id);
        sb.append(", nimi=");
        sb.append(nimi);
        sb.append(", name=");
        sb.append(name);
        sb.append(", maa=");
        sb.append(maa);
        sb.append(", ISNI=");
        sb.append(ISNI);
        sb.append(", crmid=");
        sb.append(crmid);
        sb.append(", emo_organisaatio=");
        sb.append(emo_organisaatio);
        sb.append(", kv_isanta=");
        sb.append(kv_isanta);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Organisaatio toEntityModel() {
        OrganisaatioImpl organisaatioImpl = new OrganisaatioImpl();

        organisaatioImpl.setOrganisaatio_id(organisaatio_id);

        if (nimi == null) {
            organisaatioImpl.setNimi(StringPool.BLANK);
        } else {
            organisaatioImpl.setNimi(nimi);
        }

        if (name == null) {
            organisaatioImpl.setName(StringPool.BLANK);
        } else {
            organisaatioImpl.setName(name);
        }

        if (maa == null) {
            organisaatioImpl.setMaa(StringPool.BLANK);
        } else {
            organisaatioImpl.setMaa(maa);
        }

        if (ISNI == null) {
            organisaatioImpl.setISNI(StringPool.BLANK);
        } else {
            organisaatioImpl.setISNI(ISNI);
        }

        if (crmid == null) {
            organisaatioImpl.setCrmid(StringPool.BLANK);
        } else {
            organisaatioImpl.setCrmid(crmid);
        }

        organisaatioImpl.setEmo_organisaatio(emo_organisaatio);
        organisaatioImpl.setKv_isanta(kv_isanta);

        organisaatioImpl.resetOriginalValues();

        return organisaatioImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        organisaatio_id = objectInput.readInt();
        nimi = objectInput.readUTF();
        name = objectInput.readUTF();
        maa = objectInput.readUTF();
        ISNI = objectInput.readUTF();
        crmid = objectInput.readUTF();
        emo_organisaatio = objectInput.readInt();
        kv_isanta = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(organisaatio_id);

        if (nimi == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nimi);
        }

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (maa == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(maa);
        }

        if (ISNI == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ISNI);
        }

        if (crmid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(crmid);
        }

        objectOutput.writeInt(emo_organisaatio);
        objectOutput.writeBoolean(kv_isanta);
    }
}
