package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.Infra_Identifier;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Infra_Identifier in entity cache.
 *
 * @author CSC
 * @see Infra_Identifier
 * @generated
 */
public class Infra_IdentifierCacheModel implements CacheModel<Infra_Identifier>,
    Externalizable {
    public int identifier_type;
    public int infra_id;
    public String identifier_value;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{identifier_type=");
        sb.append(identifier_type);
        sb.append(", infra_id=");
        sb.append(infra_id);
        sb.append(", identifier_value=");
        sb.append(identifier_value);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Infra_Identifier toEntityModel() {
        Infra_IdentifierImpl infra_IdentifierImpl = new Infra_IdentifierImpl();

        infra_IdentifierImpl.setIdentifier_type(identifier_type);
        infra_IdentifierImpl.setInfra_id(infra_id);

        if (identifier_value == null) {
            infra_IdentifierImpl.setIdentifier_value(StringPool.BLANK);
        } else {
            infra_IdentifierImpl.setIdentifier_value(identifier_value);
        }

        infra_IdentifierImpl.resetOriginalValues();

        return infra_IdentifierImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        identifier_type = objectInput.readInt();
        infra_id = objectInput.readInt();
        identifier_value = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(identifier_type);
        objectOutput.writeInt(infra_id);

        if (identifier_value == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(identifier_value);
        }
    }
}
