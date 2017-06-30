package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author CSC
 * @generated
 */
public class Palvelu_PalvelutyypitPK implements Comparable<Palvelu_PalvelutyypitPK>,
    Serializable {
    public int palvelu_id;
    public int palvelutyyppi_id;

    public Palvelu_PalvelutyypitPK() {
    }

    public Palvelu_PalvelutyypitPK(int palvelu_id, int palvelutyyppi_id) {
        this.palvelu_id = palvelu_id;
        this.palvelutyyppi_id = palvelutyyppi_id;
    }

    public int getPalvelu_id() {
        return palvelu_id;
    }

    public void setPalvelu_id(int palvelu_id) {
        this.palvelu_id = palvelu_id;
    }

    public int getPalvelutyyppi_id() {
        return palvelutyyppi_id;
    }

    public void setPalvelutyyppi_id(int palvelutyyppi_id) {
        this.palvelutyyppi_id = palvelutyyppi_id;
    }

    @Override
    public int compareTo(Palvelu_PalvelutyypitPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

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

        if (palvelutyyppi_id < pk.palvelutyyppi_id) {
            value = -1;
        } else if (palvelutyyppi_id > pk.palvelutyyppi_id) {
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

        if (!(obj instanceof Palvelu_PalvelutyypitPK)) {
            return false;
        }

        Palvelu_PalvelutyypitPK pk = (Palvelu_PalvelutyypitPK) obj;

        if ((palvelu_id == pk.palvelu_id) &&
                (palvelutyyppi_id == pk.palvelutyyppi_id)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(palvelu_id) + String.valueOf(palvelutyyppi_id)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("palvelu_id");
        sb.append(StringPool.EQUAL);
        sb.append(palvelu_id);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("palvelutyyppi_id");
        sb.append(StringPool.EQUAL);
        sb.append(palvelutyyppi_id);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
