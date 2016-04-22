package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Palvelu;
import fi.csc.avaa.tupa.db.service.PalveluLocalServiceUtil;

/**
 * The extended model base implementation for the Palvelu service. Represents a row in the &quot;palvelu&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PalveluImpl}.
 * </p>
 *
 * @author pj,jmlehtin
 * @see PalveluImpl
 * @see fi.csc.avaa.tupa.db.model.Palvelu
 * @generated
 */
public abstract class PalveluBaseImpl extends PalveluModelImpl
    implements Palvelu {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a palvelu model instance should use the {@link Palvelu} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PalveluLocalServiceUtil.addPalvelu(this);
        } else {
            PalveluLocalServiceUtil.updatePalvelu(this);
        }
    }
}
