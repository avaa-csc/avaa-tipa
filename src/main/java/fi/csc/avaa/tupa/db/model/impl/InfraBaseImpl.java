package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Infra;
import fi.csc.avaa.tupa.db.service.InfraLocalServiceUtil;

/**
 * The extended model base implementation for the Infra service. Represents a row in the &quot;infra&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link InfraImpl}.
 * </p>
 *
 * @author CSC
 * @see InfraImpl
 * @see fi.csc.avaa.tupa.db.model.Infra
 * @generated
 */
public abstract class InfraBaseImpl extends InfraModelImpl implements Infra {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a infra model instance should use the {@link Infra} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            InfraLocalServiceUtil.addInfra(this);
        } else {
            InfraLocalServiceUtil.updateInfra(this);
        }
    }
}
