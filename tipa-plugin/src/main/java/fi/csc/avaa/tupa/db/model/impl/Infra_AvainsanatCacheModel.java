package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.Infra_Avainsanat;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Infra_Avainsanat in entity cache.
 *
 * @author pj,jmlehtin
 * @see Infra_Avainsanat
 * @generated
 */
public class Infra_AvainsanatCacheModel implements CacheModel<Infra_Avainsanat>,
    Externalizable {
    public int infra_id;
    public int avainsana_id;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{infra_id=");
        sb.append(infra_id);
        sb.append(", avainsana_id=");
        sb.append(avainsana_id);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Infra_Avainsanat toEntityModel() {
        Infra_AvainsanatImpl infra_AvainsanatImpl = new Infra_AvainsanatImpl();

        infra_AvainsanatImpl.setInfra_id(infra_id);
        infra_AvainsanatImpl.setAvainsana_id(avainsana_id);

        infra_AvainsanatImpl.resetOriginalValues();

        return infra_AvainsanatImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        infra_id = objectInput.readInt();
        avainsana_id = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(infra_id);
        objectOutput.writeInt(avainsana_id);
    }
}
