package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.Yhteystieto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Yhteystieto in entity cache.
 *
 * @author CSC
 * @see Yhteystieto
 * @generated
 */
public class YhteystietoCacheModel implements CacheModel<Yhteystieto>,
    Externalizable {
    public int yhteystieto_id;
    public String sahkoposti;
    public int affiliaatio;
    public String puhelin;
    public String titteli;
    public String etunimi;
    public String sukunimi;
    public String URL;
    public String kuvaus;
    public String description;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{yhteystieto_id=");
        sb.append(yhteystieto_id);
        sb.append(", sahkoposti=");
        sb.append(sahkoposti);
        sb.append(", affiliaatio=");
        sb.append(affiliaatio);
        sb.append(", puhelin=");
        sb.append(puhelin);
        sb.append(", titteli=");
        sb.append(titteli);
        sb.append(", etunimi=");
        sb.append(etunimi);
        sb.append(", sukunimi=");
        sb.append(sukunimi);
        sb.append(", URL=");
        sb.append(URL);
        sb.append(", kuvaus=");
        sb.append(kuvaus);
        sb.append(", description=");
        sb.append(description);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Yhteystieto toEntityModel() {
        YhteystietoImpl yhteystietoImpl = new YhteystietoImpl();

        yhteystietoImpl.setYhteystieto_id(yhteystieto_id);

        if (sahkoposti == null) {
            yhteystietoImpl.setSahkoposti(StringPool.BLANK);
        } else {
            yhteystietoImpl.setSahkoposti(sahkoposti);
        }

        yhteystietoImpl.setAffiliaatio(affiliaatio);

        if (puhelin == null) {
            yhteystietoImpl.setPuhelin(StringPool.BLANK);
        } else {
            yhteystietoImpl.setPuhelin(puhelin);
        }

        if (titteli == null) {
            yhteystietoImpl.setTitteli(StringPool.BLANK);
        } else {
            yhteystietoImpl.setTitteli(titteli);
        }

        if (etunimi == null) {
            yhteystietoImpl.setEtunimi(StringPool.BLANK);
        } else {
            yhteystietoImpl.setEtunimi(etunimi);
        }

        if (sukunimi == null) {
            yhteystietoImpl.setSukunimi(StringPool.BLANK);
        } else {
            yhteystietoImpl.setSukunimi(sukunimi);
        }

        if (URL == null) {
            yhteystietoImpl.setURL(StringPool.BLANK);
        } else {
            yhteystietoImpl.setURL(URL);
        }

        if (kuvaus == null) {
            yhteystietoImpl.setKuvaus(StringPool.BLANK);
        } else {
            yhteystietoImpl.setKuvaus(kuvaus);
        }

        if (description == null) {
            yhteystietoImpl.setDescription(StringPool.BLANK);
        } else {
            yhteystietoImpl.setDescription(description);
        }

        yhteystietoImpl.resetOriginalValues();

        return yhteystietoImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        yhteystieto_id = objectInput.readInt();
        sahkoposti = objectInput.readUTF();
        affiliaatio = objectInput.readInt();
        puhelin = objectInput.readUTF();
        titteli = objectInput.readUTF();
        etunimi = objectInput.readUTF();
        sukunimi = objectInput.readUTF();
        URL = objectInput.readUTF();
        kuvaus = objectInput.readUTF();
        description = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(yhteystieto_id);

        if (sahkoposti == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(sahkoposti);
        }

        objectOutput.writeInt(affiliaatio);

        if (puhelin == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(puhelin);
        }

        if (titteli == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(titteli);
        }

        if (etunimi == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(etunimi);
        }

        if (sukunimi == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(sukunimi);
        }

        if (URL == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(URL);
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
