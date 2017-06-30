package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the TpInfrastructure service. Represents a row in the &quot;tupa_TpInfrastructure&quot; database table, with each column mapped to a property of this class.
 *
 * @author CSC
 * @see TpInfrastructureModel
 * @see fi.csc.avaa.tupa.db.model.impl.TpInfrastructureImpl
 * @see fi.csc.avaa.tupa.db.model.impl.TpInfrastructureModelImpl
 * @generated
 */
public interface TpInfrastructure extends TpInfrastructureModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link fi.csc.avaa.tupa.db.model.impl.TpInfrastructureImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    @com.liferay.portal.kernel.json.JSON()
    public int[] getServicesIds();

    public void setServicesIds(int[] servicesIds);

    @com.liferay.portal.kernel.json.JSON()
    public int[] getContactsIds();

    public void setContactsIds(int[] contactsIds);

    @com.liferay.portal.kernel.json.JSON()
    public int[] getOrganisationsIds();

    public void setOrganisationsIds(int[] organisationsIds);

    @com.liferay.portal.kernel.json.JSON()
    public java.lang.String[] getKeywords_EN();

    public void setKeywords_EN(java.lang.String[] keywords_EN);

    @com.liferay.portal.kernel.json.JSON()
    public java.lang.String[] getKeywords_FI();

    public void setKeywords_FI(java.lang.String[] keywords_FI);

    @com.liferay.portal.kernel.json.JSON()
    public com.liferay.portal.kernel.json.JSONObject getPids();

    public void setPids(com.liferay.portal.kernel.json.JSONObject pids);
}
