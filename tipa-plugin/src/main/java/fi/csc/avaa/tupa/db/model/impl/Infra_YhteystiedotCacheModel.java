package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Infra_Yhteystiedot in entity cache.
 *
 * @author pj,jmlehtin
 * @see Infra_Yhteystiedot
 * @generated
 */
public class Infra_YhteystiedotCacheModel implements CacheModel<Infra_Yhteystiedot>,
    Externalizable {
    public int infra_id;
    public int yhteystieto_id;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{infra_id=");
        sb.append(infra_id);
        sb.append(", yhteystieto_id=");
        sb.append(yhteystieto_id);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Infra_Yhteystiedot toEntityModel() {
        Infra_YhteystiedotImpl infra_YhteystiedotImpl = new Infra_YhteystiedotImpl();

        infra_YhteystiedotImpl.setInfra_id(infra_id);
        infra_YhteystiedotImpl.setYhteystieto_id(yhteystieto_id);

        infra_YhteystiedotImpl.resetOriginalValues();

        return infra_YhteystiedotImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        infra_id = objectInput.readInt();
        yhteystieto_id = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(infra_id);
        objectOutput.writeInt(yhteystieto_id);
    }
}
