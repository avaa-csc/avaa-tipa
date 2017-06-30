package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the TpContact service. Represents a row in the &quot;tupa_TpContact&quot; database table, with each column mapped to a property of this class.
 *
 * @author CSC
 * @see TpContactModel
 * @see fi.csc.avaa.tupa.db.model.impl.TpContactImpl
 * @see fi.csc.avaa.tupa.db.model.impl.TpContactModelImpl
 * @generated
 */
public interface TpContact extends TpContactModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link fi.csc.avaa.tupa.db.model.impl.TpContactImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    @com.liferay.portal.kernel.json.JSON()
    public int[] getInfrastructuresIds();

    public void setInfrastructuresIds(int[] infrastructuresIds);

    @com.liferay.portal.kernel.json.JSON()
    public int[] getServicesIds();

    public void setServicesIds(int[] servicesIds);

    @com.liferay.portal.kernel.json.JSON()
    public int[] getOrganisationsIds();

    public void setOrganisationsIds(int[] organisationsIds);
}
