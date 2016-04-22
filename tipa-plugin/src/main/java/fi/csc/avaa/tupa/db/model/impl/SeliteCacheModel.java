package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.Selite;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Selite in entity cache.
 *
 * @author pj,jmlehtin
 * @see Selite
 * @generated
 */
public class SeliteCacheModel implements CacheModel<Selite>, Externalizable {
    public int selite_id;
    public String nimi;
    public String name;
    public String kuvaus;
    public String description;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{selite_id=");
        sb.append(selite_id);
        sb.append(", nimi=");
        sb.append(nimi);
        sb.append(", name=");
        sb.append(name);
        sb.append(", kuvaus=");
        sb.append(kuvaus);
        sb.append(", description=");
        sb.append(description);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Selite toEntityModel() {
        SeliteImpl seliteImpl = new SeliteImpl();

        seliteImpl.setSelite_id(selite_id);

        if (nimi == null) {
            seliteImpl.setNimi(StringPool.BLANK);
        } else {
            seliteImpl.setNimi(nimi);
        }

        if (name == null) {
            seliteImpl.setName(StringPool.BLANK);
        } else {
            seliteImpl.setName(name);
        }

        if (kuvaus == null) {
            seliteImpl.setKuvaus(StringPool.BLANK);
        } else {
            seliteImpl.setKuvaus(kuvaus);
        }

        if (description == null) {
            seliteImpl.setDescription(StringPool.BLANK);
        } else {
            seliteImpl.setDescription(description);
        }

        seliteImpl.resetOriginalValues();

        return seliteImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        selite_id = objectInput.readInt();
        nimi = objectInput.readUTF();
        name = objectInput.readUTF();
        kuvaus = objectInput.readUTF();
        description = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(selite_id);

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

        if (kuvaus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(kuvaus);
        }

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }
    }
}
