package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.TpContact;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TpContact in entity cache.
 *
 * @author CSC
 * @see TpContact
 * @generated
 */
public class TpContactCacheModel implements CacheModel<TpContact>,
    Externalizable {
    public int id;
    public String email;
    public String phone;
    public String title;
    public String firstName;
    public String lastName;
    public String url;
    public String description_EN;
    public String description_FI;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{id=");
        sb.append(id);
        sb.append(", email=");
        sb.append(email);
        sb.append(", phone=");
        sb.append(phone);
        sb.append(", title=");
        sb.append(title);
        sb.append(", firstName=");
        sb.append(firstName);
        sb.append(", lastName=");
        sb.append(lastName);
        sb.append(", url=");
        sb.append(url);
        sb.append(", description_EN=");
        sb.append(description_EN);
        sb.append(", description_FI=");
        sb.append(description_FI);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public TpContact toEntityModel() {
        TpContactImpl tpContactImpl = new TpContactImpl();

        tpContactImpl.setId(id);

        if (email == null) {
            tpContactImpl.setEmail(StringPool.BLANK);
        } else {
            tpContactImpl.setEmail(email);
        }

        if (phone == null) {
            tpContactImpl.setPhone(StringPool.BLANK);
        } else {
            tpContactImpl.setPhone(phone);
        }

        if (title == null) {
            tpContactImpl.setTitle(StringPool.BLANK);
        } else {
            tpContactImpl.setTitle(title);
        }

        if (firstName == null) {
            tpContactImpl.setFirstName(StringPool.BLANK);
        } else {
            tpContactImpl.setFirstName(firstName);
        }

        if (lastName == null) {
            tpContactImpl.setLastName(StringPool.BLANK);
        } else {
            tpContactImpl.setLastName(lastName);
        }

        if (url == null) {
            tpContactImpl.setUrl(StringPool.BLANK);
        } else {
            tpContactImpl.setUrl(url);
        }

        if (description_EN == null) {
            tpContactImpl.setDescription_EN(StringPool.BLANK);
        } else {
            tpContactImpl.setDescription_EN(description_EN);
        }

        if (description_FI == null) {
            tpContactImpl.setDescription_FI(StringPool.BLANK);
        } else {
            tpContactImpl.setDescription_FI(description_FI);
        }

        tpContactImpl.resetOriginalValues();

        return tpContactImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readInt();
        email = objectInput.readUTF();
        phone = objectInput.readUTF();
        title = objectInput.readUTF();
        firstName = objectInput.readUTF();
        lastName = objectInput.readUTF();
        url = objectInput.readUTF();
        description_EN = objectInput.readUTF();
        description_FI = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(id);

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }

        if (phone == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(phone);
        }

        if (title == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(title);
        }

        if (firstName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(firstName);
        }

        if (lastName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastName);
        }

        if (url == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(url);
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
    }
}
