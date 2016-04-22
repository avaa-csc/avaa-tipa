package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.Infra_Palvelut;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Infra_Palvelut in entity cache.
 *
 * @author pj,jmlehtin
 * @see Infra_Palvelut
 * @generated
 */
public class Infra_PalvelutCacheModel implements CacheModel<Infra_Palvelut>,
    Externalizable {
    public int infra_id;
    public int palvelu_id;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{infra_id=");
        sb.append(infra_id);
        sb.append(", palvelu_id=");
        sb.append(palvelu_id);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Infra_Palvelut toEntityModel() {
        Infra_PalvelutImpl infra_PalvelutImpl = new Infra_PalvelutImpl();

        infra_PalvelutImpl.setInfra_id(infra_id);
        infra_PalvelutImpl.setPalvelu_id(palvelu_id);

        infra_PalvelutImpl.resetOriginalValues();

        return infra_PalvelutImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        infra_id = objectInput.readInt();
        palvelu_id = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(infra_id);
        objectOutput.writeInt(palvelu_id);
    }
}
