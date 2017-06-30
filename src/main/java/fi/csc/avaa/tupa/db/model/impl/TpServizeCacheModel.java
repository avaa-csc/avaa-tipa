package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.TpServize;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TpServize in entity cache.
 *
 * @author CSC
 * @see TpServize
 * @generated
 */
public class TpServizeCacheModel implements CacheModel<TpServize>,
    Externalizable {
    public int id;
    public String name_EN;
    public String name_FI;
    public String description_EN;
    public String description_FI;
    public String url;
    public String address;
    public String city;
    public double lat;
    public double lon;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{id=");
        sb.append(id);
        sb.append(", name_EN=");
        sb.append(name_EN);
        sb.append(", name_FI=");
        sb.append(name_FI);
        sb.append(", description_EN=");
        sb.append(description_EN);
        sb.append(", description_FI=");
        sb.append(description_FI);
        sb.append(", url=");
        sb.append(url);
        sb.append(", address=");
        sb.append(address);
        sb.append(", city=");
        sb.append(city);
        sb.append(", lat=");
        sb.append(lat);
        sb.append(", lon=");
        sb.append(lon);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public TpServize toEntityModel() {
        TpServizeImpl tpServizeImpl = new TpServizeImpl();

        tpServizeImpl.setId(id);

        if (name_EN == null) {
            tpServizeImpl.setName_EN(StringPool.BLANK);
        } else {
            tpServizeImpl.setName_EN(name_EN);
        }

        if (name_FI == null) {
            tpServizeImpl.setName_FI(StringPool.BLANK);
        } else {
            tpServizeImpl.setName_FI(name_FI);
        }

        if (description_EN == null) {
            tpServizeImpl.setDescription_EN(StringPool.BLANK);
        } else {
            tpServizeImpl.setDescription_EN(description_EN);
        }

        if (description_FI == null) {
            tpServizeImpl.setDescription_FI(StringPool.BLANK);
        } else {
            tpServizeImpl.setDescription_FI(description_FI);
        }

        if (url == null) {
            tpServizeImpl.setUrl(StringPool.BLANK);
        } else {
            tpServizeImpl.setUrl(url);
        }

        if (address == null) {
            tpServizeImpl.setAddress(StringPool.BLANK);
        } else {
            tpServizeImpl.setAddress(address);
        }

        if (city == null) {
            tpServizeImpl.setCity(StringPool.BLANK);
        } else {
            tpServizeImpl.setCity(city);
        }

        tpServizeImpl.setLat(lat);
        tpServizeImpl.setLon(lon);

        tpServizeImpl.resetOriginalValues();

        return tpServizeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readInt();
        name_EN = objectInput.readUTF();
        name_FI = objectInput.readUTF();
        description_EN = objectInput.readUTF();
        description_FI = objectInput.readUTF();
        url = objectInput.readUTF();
        address = objectInput.readUTF();
        city = objectInput.readUTF();
        lat = objectInput.readDouble();
        lon = objectInput.readDouble();
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

        if (url == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(url);
        }

        if (address == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(address);
        }

        if (city == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(city);
        }

        objectOutput.writeDouble(lat);
        objectOutput.writeDouble(lon);
    }
}
