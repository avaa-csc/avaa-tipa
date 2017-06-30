package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.tupa.db.model.TpAPI;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TpAPI in entity cache.
 *
 * @author CSC
 * @see TpAPI
 * @generated
 */
public class TpAPICacheModel implements CacheModel<TpAPI>, Externalizable {
    public String methodsDescription;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(3);

        sb.append("{methodsDescription=");
        sb.append(methodsDescription);

        return sb.toString();
    }

    @Override
    public TpAPI toEntityModel() {
        TpAPIImpl tpAPIImpl = new TpAPIImpl();

        if (methodsDescription == null) {
            tpAPIImpl.setMethodsDescription(StringPool.BLANK);
        } else {
            tpAPIImpl.setMethodsDescription(methodsDescription);
        }

        tpAPIImpl.resetOriginalValues();

        return tpAPIImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        methodsDescription = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (methodsDescription == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(methodsDescription);
        }
    }
}
