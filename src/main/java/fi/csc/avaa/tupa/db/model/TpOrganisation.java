package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the TpOrganisation service. Represents a row in the &quot;tupa_TpOrganisation&quot; database table, with each column mapped to a property of this class.
 *
 * @author CSC
 * @see TpOrganisationModel
 * @see fi.csc.avaa.tupa.db.model.impl.TpOrganisationImpl
 * @see fi.csc.avaa.tupa.db.model.impl.TpOrganisationModelImpl
 * @generated
 */
public interface TpOrganisation extends TpOrganisationModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link fi.csc.avaa.tupa.db.model.impl.TpOrganisationImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    @com.liferay.portal.kernel.json.JSON()
    public int[] getInfrastructuresIds();

    public void setInfrastructuresIds(int[] infrastructuresIds);

    @com.liferay.portal.kernel.json.JSON()
    public int[] getServicesIds();

    public void setServicesIds(int[] servicesIds);

    @com.liferay.portal.kernel.json.JSON()
    public int[] getContactsIds();

    public void setContactsIds(int[] contactsIds);
}
