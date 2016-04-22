package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.Palvelutyyppi;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Palvelutyyppi in entity cache.
 *
 * @author pj,jmlehtin
 * @see Palvelutyyppi
 * @generated
 */
public class PalvelutyyppiCacheModel implements CacheModel<Palvelutyyppi>,
    Externalizable {
    public int palvelutyyppi_id;
    public int tyyppi;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{palvelutyyppi_id=");
        sb.append(palvelutyyppi_id);
        sb.append(", tyyppi=");
        sb.append(tyyppi);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Palvelutyyppi toEntityModel() {
        PalvelutyyppiImpl palvelutyyppiImpl = new PalvelutyyppiImpl();

        palvelutyyppiImpl.setPalvelutyyppi_id(palvelutyyppi_id);
        palvelutyyppiImpl.setTyyppi(tyyppi);

        palvelutyyppiImpl.resetOriginalValues();

        return palvelutyyppiImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        palvelutyyppi_id = objectInput.readInt();
        tyyppi = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(palvelutyyppi_id);
        objectOutput.writeInt(tyyppi);
    }
}
