package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author pj,jmlehtin
 * @generated
 */
public class Infra_YhteystiedotPK implements Comparable<Infra_YhteystiedotPK>,
    Serializable {
    public int infra_id;
    public int yhteystieto_id;

    public Infra_YhteystiedotPK() {
    }

    public Infra_YhteystiedotPK(int infra_id, int yhteystieto_id) {
        this.infra_id = infra_id;
        this.yhteystieto_id = yhteystieto_id;
    }

    public int getInfra_id() {
        return infra_id;
    }

    public void setInfra_id(int infra_id) {
        this.infra_id = infra_id;
    }

    public int getYhteystieto_id() {
        return yhteystieto_id;
    }

    public void setYhteystieto_id(int yhteystieto_id) {
        this.yhteystieto_id = yhteystieto_id;
    }

    @Override
    public int compareTo(Infra_YhteystiedotPK pk) {
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

        if (yhteystieto_id < pk.yhteystieto_id) {
            value = -1;
        } else if (yhteystieto_id > pk.yhteystieto_id) {
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

        if (!(obj instanceof Infra_YhteystiedotPK)) {
            return false;
        }

        Infra_YhteystiedotPK pk = (Infra_YhteystiedotPK) obj;

        if ((infra_id == pk.infra_id) && (yhteystieto_id == pk.yhteystieto_id)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(infra_id) + String.valueOf(yhteystieto_id)).hashCode();
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
        sb.append("yhteystieto_id");
        sb.append(StringPool.EQUAL);
        sb.append(yhteystieto_id);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
