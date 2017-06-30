package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Infra service. Represents a row in the &quot;infra&quot; database table, with each column mapped to a property of this class.
 *
 * @author CSC
 * @see InfraModel
 * @see fi.csc.avaa.tupa.db.model.impl.InfraImpl
 * @see fi.csc.avaa.tupa.db.model.impl.InfraModelImpl
 * @generated
 */
public interface Infra extends InfraModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link fi.csc.avaa.tupa.db.model.impl.InfraImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    @com.liferay.portal.kernel.json.JSON()
    public java.lang.String getURN();

    public void setURN(java.lang.String URN);
}
