package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.Avainsana;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Avainsana in entity cache.
 *
 * @author CSC
 * @see Avainsana
 * @generated
 */
public class AvainsanaCacheModel implements CacheModel<Avainsana>,
    Externalizable {
    public int avainsana_id;
    public String avainsana;
    public String keyword;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{avainsana_id=");
        sb.append(avainsana_id);
        sb.append(", avainsana=");
        sb.append(avainsana);
        sb.append(", keyword=");
        sb.append(keyword);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Avainsana toEntityModel() {
        AvainsanaImpl avainsanaImpl = new AvainsanaImpl();

        avainsanaImpl.setAvainsana_id(avainsana_id);

        if (avainsana == null) {
            avainsanaImpl.setAvainsana(StringPool.BLANK);
        } else {
            avainsanaImpl.setAvainsana(avainsana);
        }

        if (keyword == null) {
            avainsanaImpl.setKeyword(StringPool.BLANK);
        } else {
            avainsanaImpl.setKeyword(keyword);
        }

        avainsanaImpl.resetOriginalValues();

        return avainsanaImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        avainsana_id = objectInput.readInt();
        avainsana = objectInput.readUTF();
        keyword = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(avainsana_id);

        if (avainsana == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(avainsana);
        }

        if (keyword == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(keyword);
        }
    }
}
