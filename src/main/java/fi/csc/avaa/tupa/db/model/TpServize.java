package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the TpServize service. Represents a row in the &quot;tupa_TpServize&quot; database table, with each column mapped to a property of this class.
 *
 * @author CSC
 * @see TpServizeModel
 * @see fi.csc.avaa.tupa.db.model.impl.TpServizeImpl
 * @see fi.csc.avaa.tupa.db.model.impl.TpServizeModelImpl
 * @generated
 */
public interface TpServize extends TpServizeModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link fi.csc.avaa.tupa.db.model.impl.TpServizeImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    @com.liferay.portal.kernel.json.JSON()
    public int[] getInfrastructuresIds();

    public void setInfrastructuresIds(int[] infrastructuresIds);

    @com.liferay.portal.kernel.json.JSON()
    public int[] getOrganisationsIds();

    public void setOrganisationsIds(int[] organisationsIds);

    @com.liferay.portal.kernel.json.JSON()
    public int[] getContactsIds();

    public void setContactsIds(int[] contactsIds);

    @com.liferay.portal.kernel.json.JSON()
    public java.lang.String[] getLocationTypes();

    public void setLocationTypes(java.lang.String[] locationTypes);

    @com.liferay.portal.kernel.json.JSON()
    public java.lang.String[] getServiceTypes();

    public void setServiceTypes(java.lang.String[] serviceTypes);
}
