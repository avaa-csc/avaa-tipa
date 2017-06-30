package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author CSC
 * @generated
 */
public class Infra_PalvelutPK implements Comparable<Infra_PalvelutPK>,
    Serializable {
    public int infra_id;
    public int palvelu_id;

    public Infra_PalvelutPK() {
    }

    public Infra_PalvelutPK(int infra_id, int palvelu_id) {
        this.infra_id = infra_id;
        this.palvelu_id = palvelu_id;
    }

    public int getInfra_id() {
        return infra_id;
    }

    public void setInfra_id(int infra_id) {
        this.infra_id = infra_id;
    }

    public int getPalvelu_id() {
        return palvelu_id;
    }

    public void setPalvelu_id(int palvelu_id) {
        this.palvelu_id = palvelu_id;
    }

    @Override
    public int compareTo(Infra_PalvelutPK pk) {
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

        if (palvelu_id < pk.palvelu_id) {
            value = -1;
        } else if (palvelu_id > pk.palvelu_id) {
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

        if (!(obj instanceof Infra_PalvelutPK)) {
            return false;
        }

        Infra_PalvelutPK pk = (Infra_PalvelutPK) obj;

        if ((infra_id == pk.infra_id) && (palvelu_id == pk.palvelu_id)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(infra_id) + String.valueOf(palvelu_id)).hashCode();
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
        sb.append("palvelu_id");
        sb.append(StringPool.EQUAL);
        sb.append(palvelu_id);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
