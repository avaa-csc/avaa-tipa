package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.TpAPI;
import fi.csc.avaa.tupa.db.service.TpAPILocalServiceUtil;

/**
 * The extended model base implementation for the TpAPI service. Represents a row in the &quot;tupa_TpAPI&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TpAPIImpl}.
 * </p>
 *
 * @author CSC
 * @see TpAPIImpl
 * @see fi.csc.avaa.tupa.db.model.TpAPI
 * @generated
 */
public abstract class TpAPIBaseImpl extends TpAPIModelImpl implements TpAPI {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a tp a p i model instance should use the {@link TpAPI} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TpAPILocalServiceUtil.addTpAPI(this);
        } else {
            TpAPILocalServiceUtil.updateTpAPI(this);
        }
    }
}
