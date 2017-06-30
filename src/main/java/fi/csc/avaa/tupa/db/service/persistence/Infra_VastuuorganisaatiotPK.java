package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author CSC
 * @generated
 */
public class Infra_VastuuorganisaatiotPK implements Comparable<Infra_VastuuorganisaatiotPK>,
    Serializable {
    public int infra_id;
    public int organisaatio_id;

    public Infra_VastuuorganisaatiotPK() {
    }

    public Infra_VastuuorganisaatiotPK(int infra_id, int organisaatio_id) {
        this.infra_id = infra_id;
        this.organisaatio_id = organisaatio_id;
    }

    public int getInfra_id() {
        return infra_id;
    }

    public void setInfra_id(int infra_id) {
        this.infra_id = infra_id;
    }

    public int getOrganisaatio_id() {
        return organisaatio_id;
    }

    public void setOrganisaatio_id(int organisaatio_id) {
        this.organisaatio_id = organisaatio_id;
    }

    @Override
    public int compareTo(Infra_VastuuorganisaatiotPK pk) {
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

        if (organisaatio_id < pk.organisaatio_id) {
            value = -1;
        } else if (organisaatio_id > pk.organisaatio_id) {
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

        if (!(obj instanceof Infra_VastuuorganisaatiotPK)) {
            return false;
        }

        Infra_VastuuorganisaatiotPK pk = (Infra_VastuuorganisaatiotPK) obj;

        if ((infra_id == pk.infra_id) &&
                (organisaatio_id == pk.organisaatio_id)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(infra_id) + String.valueOf(organisaatio_id)).hashCode();
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
        sb.append("organisaatio_id");
        sb.append(StringPool.EQUAL);
        sb.append(organisaatio_id);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
