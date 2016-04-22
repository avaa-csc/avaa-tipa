package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.Kayttoehto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Kayttoehto in entity cache.
 *
 * @author pj,jmlehtin
 * @see Kayttoehto
 * @generated
 */
public class KayttoehtoCacheModel implements CacheModel<Kayttoehto>,
    Externalizable {
    public int infra_id;
    public int saavutettavuus;
    public int anonymiteetti;
    public int maksullisuus;
    public int tulosten_julkaisuvelvoite;
    public int tuotoksien_julkaisuvelvoite;
    public int osaamisen_avoimuus;
    public int seurantatyokalut;
    public int tulosten_lisensointi;
    public String URLfi;
    public String URLen;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{infra_id=");
        sb.append(infra_id);
        sb.append(", saavutettavuus=");
        sb.append(saavutettavuus);
        sb.append(", anonymiteetti=");
        sb.append(anonymiteetti);
        sb.append(", maksullisuus=");
        sb.append(maksullisuus);
        sb.append(", tulosten_julkaisuvelvoite=");
        sb.append(tulosten_julkaisuvelvoite);
        sb.append(", tuotoksien_julkaisuvelvoite=");
        sb.append(tuotoksien_julkaisuvelvoite);
        sb.append(", osaamisen_avoimuus=");
        sb.append(osaamisen_avoimuus);
        sb.append(", seurantatyokalut=");
        sb.append(seurantatyokalut);
        sb.append(", tulosten_lisensointi=");
        sb.append(tulosten_lisensointi);
        sb.append(", URLfi=");
        sb.append(URLfi);
        sb.append(", URLen=");
        sb.append(URLen);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Kayttoehto toEntityModel() {
        KayttoehtoImpl kayttoehtoImpl = new KayttoehtoImpl();

        kayttoehtoImpl.setInfra_id(infra_id);
        kayttoehtoImpl.setSaavutettavuus(saavutettavuus);
        kayttoehtoImpl.setAnonymiteetti(anonymiteetti);
        kayttoehtoImpl.setMaksullisuus(maksullisuus);
        kayttoehtoImpl.setTulosten_julkaisuvelvoite(tulosten_julkaisuvelvoite);
        kayttoehtoImpl.setTuotoksien_julkaisuvelvoite(tuotoksien_julkaisuvelvoite);
        kayttoehtoImpl.setOsaamisen_avoimuus(osaamisen_avoimuus);
        kayttoehtoImpl.setSeurantatyokalut(seurantatyokalut);
        kayttoehtoImpl.setTulosten_lisensointi(tulosten_lisensointi);

        if (URLfi == null) {
            kayttoehtoImpl.setURLfi(StringPool.BLANK);
        } else {
            kayttoehtoImpl.setURLfi(URLfi);
        }

        if (URLen == null) {
            kayttoehtoImpl.setURLen(StringPool.BLANK);
        } else {
            kayttoehtoImpl.setURLen(URLen);
        }

        kayttoehtoImpl.resetOriginalValues();

        return kayttoehtoImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        infra_id = objectInput.readInt();
        saavutettavuus = objectInput.readInt();
        anonymiteetti = objectInput.readInt();
        maksullisuus = objectInput.readInt();
        tulosten_julkaisuvelvoite = objectInput.readInt();
        tuotoksien_julkaisuvelvoite = objectInput.readInt();
        osaamisen_avoimuus = objectInput.readInt();
        seurantatyokalut = objectInput.readInt();
        tulosten_lisensointi = objectInput.readInt();
        URLfi = objectInput.readUTF();
        URLen = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(infra_id);
        objectOutput.writeInt(saavutettavuus);
        objectOutput.writeInt(anonymiteetti);
        objectOutput.writeInt(maksullisuus);
        objectOutput.writeInt(tulosten_julkaisuvelvoite);
        objectOutput.writeInt(tuotoksien_julkaisuvelvoite);
        objectOutput.writeInt(osaamisen_avoimuus);
        objectOutput.writeInt(seurantatyokalut);
        objectOutput.writeInt(tulosten_lisensointi);

        if (URLfi == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(URLfi);
        }

        if (URLen == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(URLen);
        }
    }
}
