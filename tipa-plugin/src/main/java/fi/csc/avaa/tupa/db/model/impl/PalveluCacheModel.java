package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.Palvelu;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Palvelu in entity cache.
 *
 * @author pj,jmlehtin
 * @see Palvelu
 * @generated
 */
public class PalveluCacheModel implements CacheModel<Palvelu>, Externalizable {
    public int palvelu_id;
    public String nimi;
    public String name;
    public String kuvaus;
    public String description;
    public String URLen;
    public String URLfi;
    public int paikkatyyppi;
    public String katuosoite;
    public String kaupunki;
    public double lat;
    public double lon;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{palvelu_id=");
        sb.append(palvelu_id);
        sb.append(", nimi=");
        sb.append(nimi);
        sb.append(", name=");
        sb.append(name);
        sb.append(", kuvaus=");
        sb.append(kuvaus);
        sb.append(", description=");
        sb.append(description);
        sb.append(", URLen=");
        sb.append(URLen);
        sb.append(", URLfi=");
        sb.append(URLfi);
        sb.append(", paikkatyyppi=");
        sb.append(paikkatyyppi);
        sb.append(", katuosoite=");
        sb.append(katuosoite);
        sb.append(", kaupunki=");
        sb.append(kaupunki);
        sb.append(", lat=");
        sb.append(lat);
        sb.append(", lon=");
        sb.append(lon);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Palvelu toEntityModel() {
        PalveluImpl palveluImpl = new PalveluImpl();

        palveluImpl.setPalvelu_id(palvelu_id);

        if (nimi == null) {
            palveluImpl.setNimi(StringPool.BLANK);
        } else {
            palveluImpl.setNimi(nimi);
        }

        if (name == null) {
            palveluImpl.setName(StringPool.BLANK);
        } else {
            palveluImpl.setName(name);
        }

        if (kuvaus == null) {
            palveluImpl.setKuvaus(StringPool.BLANK);
        } else {
            palveluImpl.setKuvaus(kuvaus);
        }

        if (description == null) {
            palveluImpl.setDescription(StringPool.BLANK);
        } else {
            palveluImpl.setDescription(description);
        }

        if (URLen == null) {
            palveluImpl.setURLen(StringPool.BLANK);
        } else {
            palveluImpl.setURLen(URLen);
        }

        if (URLfi == null) {
            palveluImpl.setURLfi(StringPool.BLANK);
        } else {
            palveluImpl.setURLfi(URLfi);
        }

        palveluImpl.setPaikkatyyppi(paikkatyyppi);

        if (katuosoite == null) {
            palveluImpl.setKatuosoite(StringPool.BLANK);
        } else {
            palveluImpl.setKatuosoite(katuosoite);
        }

        if (kaupunki == null) {
            palveluImpl.setKaupunki(StringPool.BLANK);
        } else {
            palveluImpl.setKaupunki(kaupunki);
        }

        palveluImpl.setLat(lat);
        palveluImpl.setLon(lon);

        palveluImpl.resetOriginalValues();

        return palveluImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        palvelu_id = objectInput.readInt();
        nimi = objectInput.readUTF();
        name = objectInput.readUTF();
        kuvaus = objectInput.readUTF();
        description = objectInput.readUTF();
        URLen = objectInput.readUTF();
        URLfi = objectInput.readUTF();
        paikkatyyppi = objectInput.readInt();
        katuosoite = objectInput.readUTF();
        kaupunki = objectInput.readUTF();
        lat = objectInput.readDouble();
        lon = objectInput.readDouble();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(palvelu_id);

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

        if (URLen == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(URLen);
        }

        if (URLfi == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(URLfi);
        }

        objectOutput.writeInt(paikkatyyppi);

        if (katuosoite == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(katuosoite);
        }

        if (kaupunki == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(kaupunki);
        }

        objectOutput.writeDouble(lat);
        objectOutput.writeDouble(lon);
    }
}
