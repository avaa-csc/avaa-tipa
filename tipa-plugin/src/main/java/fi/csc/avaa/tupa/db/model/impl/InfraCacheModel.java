package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.Infra;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Infra in entity cache.
 *
 * @author pj,jmlehtin
 * @see Infra
 * @generated
 */
public class InfraCacheModel implements CacheModel<Infra>, Externalizable {
    public int infra_id;
    public String ISNI;
    public boolean aktiivinen;
    public int valmistelu_aloitusvuosi;
    public int rakennus_aloitusvuosi;
    public int toiminta_aloitusvuosi;
    public int toiminta_lopetusvuosi;
    public String nimi;
    public String name;
    public String lyhenne;
    public String acronym;
    public int edellinen_infra;
    public String kuvaus;
    public String description;
    public String logo_url;
    public String image_url;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(33);

        sb.append("{infra_id=");
        sb.append(infra_id);
        sb.append(", ISNI=");
        sb.append(ISNI);
        sb.append(", aktiivinen=");
        sb.append(aktiivinen);
        sb.append(", valmistelu_aloitusvuosi=");
        sb.append(valmistelu_aloitusvuosi);
        sb.append(", rakennus_aloitusvuosi=");
        sb.append(rakennus_aloitusvuosi);
        sb.append(", toiminta_aloitusvuosi=");
        sb.append(toiminta_aloitusvuosi);
        sb.append(", toiminta_lopetusvuosi=");
        sb.append(toiminta_lopetusvuosi);
        sb.append(", nimi=");
        sb.append(nimi);
        sb.append(", name=");
        sb.append(name);
        sb.append(", lyhenne=");
        sb.append(lyhenne);
        sb.append(", acronym=");
        sb.append(acronym);
        sb.append(", edellinen_infra=");
        sb.append(edellinen_infra);
        sb.append(", kuvaus=");
        sb.append(kuvaus);
        sb.append(", description=");
        sb.append(description);
        sb.append(", logo_url=");
        sb.append(logo_url);
        sb.append(", image_url=");
        sb.append(image_url);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Infra toEntityModel() {
        InfraImpl infraImpl = new InfraImpl();

        infraImpl.setInfra_id(infra_id);

        if (ISNI == null) {
            infraImpl.setISNI(StringPool.BLANK);
        } else {
            infraImpl.setISNI(ISNI);
        }

        infraImpl.setAktiivinen(aktiivinen);
        infraImpl.setValmistelu_aloitusvuosi(valmistelu_aloitusvuosi);
        infraImpl.setRakennus_aloitusvuosi(rakennus_aloitusvuosi);
        infraImpl.setToiminta_aloitusvuosi(toiminta_aloitusvuosi);
        infraImpl.setToiminta_lopetusvuosi(toiminta_lopetusvuosi);

        if (nimi == null) {
            infraImpl.setNimi(StringPool.BLANK);
        } else {
            infraImpl.setNimi(nimi);
        }

        if (name == null) {
            infraImpl.setName(StringPool.BLANK);
        } else {
            infraImpl.setName(name);
        }

        if (lyhenne == null) {
            infraImpl.setLyhenne(StringPool.BLANK);
        } else {
            infraImpl.setLyhenne(lyhenne);
        }

        if (acronym == null) {
            infraImpl.setAcronym(StringPool.BLANK);
        } else {
            infraImpl.setAcronym(acronym);
        }

        infraImpl.setEdellinen_infra(edellinen_infra);

        if (kuvaus == null) {
            infraImpl.setKuvaus(StringPool.BLANK);
        } else {
            infraImpl.setKuvaus(kuvaus);
        }

        if (description == null) {
            infraImpl.setDescription(StringPool.BLANK);
        } else {
            infraImpl.setDescription(description);
        }

        if (logo_url == null) {
            infraImpl.setLogo_url(StringPool.BLANK);
        } else {
            infraImpl.setLogo_url(logo_url);
        }

        if (image_url == null) {
            infraImpl.setImage_url(StringPool.BLANK);
        } else {
            infraImpl.setImage_url(image_url);
        }

        infraImpl.resetOriginalValues();

        return infraImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        infra_id = objectInput.readInt();
        ISNI = objectInput.readUTF();
        aktiivinen = objectInput.readBoolean();
        valmistelu_aloitusvuosi = objectInput.readInt();
        rakennus_aloitusvuosi = objectInput.readInt();
        toiminta_aloitusvuosi = objectInput.readInt();
        toiminta_lopetusvuosi = objectInput.readInt();
        nimi = objectInput.readUTF();
        name = objectInput.readUTF();
        lyhenne = objectInput.readUTF();
        acronym = objectInput.readUTF();
        edellinen_infra = objectInput.readInt();
        kuvaus = objectInput.readUTF();
        description = objectInput.readUTF();
        logo_url = objectInput.readUTF();
        image_url = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(infra_id);

        if (ISNI == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ISNI);
        }

        objectOutput.writeBoolean(aktiivinen);
        objectOutput.writeInt(valmistelu_aloitusvuosi);
        objectOutput.writeInt(rakennus_aloitusvuosi);
        objectOutput.writeInt(toiminta_aloitusvuosi);
        objectOutput.writeInt(toiminta_lopetusvuosi);

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

        if (lyhenne == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lyhenne);
        }

        if (acronym == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(acronym);
        }

        objectOutput.writeInt(edellinen_infra);

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

        if (logo_url == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(logo_url);
        }

        if (image_url == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(image_url);
        }
    }
}
