package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Infra_Vastuuorganisaatiot in entity cache.
 *
 * @author pj,jmlehtin
 * @see Infra_Vastuuorganisaatiot
 * @generated
 */
public class Infra_VastuuorganisaatiotCacheModel implements CacheModel<Infra_Vastuuorganisaatiot>,
    Externalizable {
    public int infra_id;
    public int organisaatio_id;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{infra_id=");
        sb.append(infra_id);
        sb.append(", organisaatio_id=");
        sb.append(organisaatio_id);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Infra_Vastuuorganisaatiot toEntityModel() {
        Infra_VastuuorganisaatiotImpl infra_VastuuorganisaatiotImpl = new Infra_VastuuorganisaatiotImpl();

        infra_VastuuorganisaatiotImpl.setInfra_id(infra_id);
        infra_VastuuorganisaatiotImpl.setOrganisaatio_id(organisaatio_id);

        infra_VastuuorganisaatiotImpl.resetOriginalValues();

        return infra_VastuuorganisaatiotImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        infra_id = objectInput.readInt();
        organisaatio_id = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(infra_id);
        objectOutput.writeInt(organisaatio_id);
    }
}
