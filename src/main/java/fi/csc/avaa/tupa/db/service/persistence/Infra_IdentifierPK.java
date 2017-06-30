package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author CSC
 * @generated
 */
public class Infra_IdentifierPK implements Comparable<Infra_IdentifierPK>,
    Serializable {
    public int identifier_type;
    public int infra_id;
    public String identifier_value;

    public Infra_IdentifierPK() {
    }

    public Infra_IdentifierPK(int identifier_type, int infra_id,
        String identifier_value) {
        this.identifier_type = identifier_type;
        this.infra_id = infra_id;
        this.identifier_value = identifier_value;
    }

    public int getIdentifier_type() {
        return identifier_type;
    }

    public void setIdentifier_type(int identifier_type) {
        this.identifier_type = identifier_type;
    }

    public int getInfra_id() {
        return infra_id;
    }

    public void setInfra_id(int infra_id) {
        this.infra_id = infra_id;
    }

    public String getIdentifier_value() {
        return identifier_value;
    }

    public void setIdentifier_value(String identifier_value) {
        this.identifier_value = identifier_value;
    }

    @Override
    public int compareTo(Infra_IdentifierPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (identifier_type < pk.identifier_type) {
            value = -1;
        } else if (identifier_type > pk.identifier_type) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (infra_id < pk.infra_id) {
            value = -1;
        } else if (infra_id > pk.infra_id) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        value = identifier_value.compareTo(pk.identifier_value);

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Infra_IdentifierPK)) {
            return false;
        }

        Infra_IdentifierPK pk = (Infra_IdentifierPK) obj;

        if ((identifier_type == pk.identifier_type) &&
                (infra_id == pk.infra_id) &&
                (identifier_value.equals(pk.identifier_value))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(identifier_type) + String.valueOf(infra_id) +
        String.valueOf(identifier_value)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("identifier_type");
        sb.append(StringPool.EQUAL);
        sb.append(identifier_type);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("infra_id");
        sb.append(StringPool.EQUAL);
        sb.append(infra_id);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("identifier_value");
        sb.append(StringPool.EQUAL);
        sb.append(identifier_value);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
