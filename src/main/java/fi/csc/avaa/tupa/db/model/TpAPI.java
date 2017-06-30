package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the TpAPI service. Represents a row in the &quot;tupa_TpAPI&quot; database table, with each column mapped to a property of this class.
 *
 * @author CSC
 * @see TpAPIModel
 * @see fi.csc.avaa.tupa.db.model.impl.TpAPIImpl
 * @see fi.csc.avaa.tupa.db.model.impl.TpAPIModelImpl
 * @generated
 */
public interface TpAPI extends TpAPIModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link fi.csc.avaa.tupa.db.model.impl.TpAPIImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    @com.liferay.portal.kernel.json.JSON()
    public java.util.List<com.liferay.portal.kernel.json.JSONObject> getMethodDescription();

    public void setMethodDescription(
        java.util.List<com.liferay.portal.kernel.json.JSONObject> methodDescription);
}
