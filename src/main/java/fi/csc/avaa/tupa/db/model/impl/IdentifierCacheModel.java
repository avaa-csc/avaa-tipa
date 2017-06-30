package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.Identifier;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Identifier in entity cache.
 *
 * @author CSC
 * @see Identifier
 * @generated
 */
public class IdentifierCacheModel implements CacheModel<Identifier>,
    Externalizable {
    public int identifier_type;
    public String identifier_name;
    public String identifier_description_translation_key;
    public String resolution_url;
    public String definition_url;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{identifier_type=");
        sb.append(identifier_type);
        sb.append(", identifier_name=");
        sb.append(identifier_name);
        sb.append(", identifier_description_translation_key=");
        sb.append(identifier_description_translation_key);
        sb.append(", resolution_url=");
        sb.append(resolution_url);
        sb.append(", definition_url=");
        sb.append(definition_url);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Identifier toEntityModel() {
        IdentifierImpl identifierImpl = new IdentifierImpl();

        identifierImpl.setIdentifier_type(identifier_type);

        if (identifier_name == null) {
            identifierImpl.setIdentifier_name(StringPool.BLANK);
        } else {
            identifierImpl.setIdentifier_name(identifier_name);
        }

        if (identifier_description_translation_key == null) {
            identifierImpl.setIdentifier_description_translation_key(StringPool.BLANK);
        } else {
            identifierImpl.setIdentifier_description_translation_key(identifier_description_translation_key);
        }

        if (resolution_url == null) {
            identifierImpl.setResolution_url(StringPool.BLANK);
        } else {
            identifierImpl.setResolution_url(resolution_url);
        }

        if (definition_url == null) {
            identifierImpl.setDefinition_url(StringPool.BLANK);
        } else {
            identifierImpl.setDefinition_url(definition_url);
        }

        identifierImpl.resetOriginalValues();

        return identifierImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        identifier_type = objectInput.readInt();
        identifier_name = objectInput.readUTF();
        identifier_description_translation_key = objectInput.readUTF();
        resolution_url = objectInput.readUTF();
        definition_url = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(identifier_type);

        if (identifier_name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(identifier_name);
        }

        if (identifier_description_translation_key == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(identifier_description_translation_key);
        }

        if (resolution_url == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(resolution_url);
        }

        if (definition_url == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(definition_url);
        }
    }
}
