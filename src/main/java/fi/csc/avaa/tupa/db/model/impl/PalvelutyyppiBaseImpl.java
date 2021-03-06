package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Palvelutyyppi;
import fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalServiceUtil;

/**
 * The extended model base implementation for the Palvelutyyppi service. Represents a row in the &quot;palvelutyyppi&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PalvelutyyppiImpl}.
 * </p>
 *
 * @author CSC
 * @see PalvelutyyppiImpl
 * @see fi.csc.avaa.tupa.db.model.Palvelutyyppi
 * @generated
 */
public abstract class PalvelutyyppiBaseImpl extends PalvelutyyppiModelImpl
    implements Palvelutyyppi {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a palvelutyyppi model instance should use the {@link Palvelutyyppi} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PalvelutyyppiLocalServiceUtil.addPalvelutyyppi(this);
        } else {
            PalvelutyyppiLocalServiceUtil.updatePalvelutyyppi(this);
        }
    }
}
