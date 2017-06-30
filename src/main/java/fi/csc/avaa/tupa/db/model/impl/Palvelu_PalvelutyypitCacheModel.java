package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Palvelu_Palvelutyypit in entity cache.
 *
 * @author CSC
 * @see Palvelu_Palvelutyypit
 * @generated
 */
public class Palvelu_PalvelutyypitCacheModel implements CacheModel<Palvelu_Palvelutyypit>,
    Externalizable {
    public int palvelu_id;
    public int palvelutyyppi_id;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{palvelu_id=");
        sb.append(palvelu_id);
        sb.append(", palvelutyyppi_id=");
        sb.append(palvelutyyppi_id);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Palvelu_Palvelutyypit toEntityModel() {
        Palvelu_PalvelutyypitImpl palvelu_PalvelutyypitImpl = new Palvelu_PalvelutyypitImpl();

        palvelu_PalvelutyypitImpl.setPalvelu_id(palvelu_id);
        palvelu_PalvelutyypitImpl.setPalvelutyyppi_id(palvelutyyppi_id);

        palvelu_PalvelutyypitImpl.resetOriginalValues();

        return palvelu_PalvelutyypitImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        palvelu_id = objectInput.readInt();
        palvelutyyppi_id = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(palvelu_id);
        objectOutput.writeInt(palvelutyyppi_id);
    }
}
