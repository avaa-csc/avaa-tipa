package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author pj,jmlehtin
 * @generated
 */
public class Infra_AvainsanatPK implements Comparable<Infra_AvainsanatPK>,
    Serializable {
    public int infra_id;
    public int avainsana_id;

    public Infra_AvainsanatPK() {
    }

    public Infra_AvainsanatPK(int infra_id, int avainsana_id) {
        this.infra_id = infra_id;
        this.avainsana_id = avainsana_id;
    }

    public int getInfra_id() {
        return infra_id;
    }

    public void setInfra_id(int infra_id) {
        this.infra_id = infra_id;
    }

    public int getAvainsana_id() {
        return avainsana_id;
    }

    public void setAvainsana_id(int avainsana_id) {
        this.avainsana_id = avainsana_id;
    }

    @Override
    public int compareTo(Infra_AvainsanatPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

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

        if (avainsana_id < pk.avainsana_id) {
            value = -1;
        } else if (avainsana_id > pk.avainsana_id) {
            value = 1;
        } else {
            value = 0;
        }

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

        if (!(obj instanceof Infra_AvainsanatPK)) {
            return false;
        }

        Infra_AvainsanatPK pk = (Infra_AvainsanatPK) obj;

        if ((infra_id == pk.infra_id) && (avainsana_id == pk.avainsana_id)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(infra_id) + String.valueOf(avainsana_id)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("infra_id");
        sb.append(StringPool.EQUAL);
        sb.append(infra_id);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("avainsana_id");
        sb.append(StringPool.EQUAL);
        sb.append(avainsana_id);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
