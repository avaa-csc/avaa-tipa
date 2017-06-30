package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Infra_Identifier service. Represents a row in the &quot;infra_identifier&quot; database table, with each column mapped to a property of this class.
 *
 * @author CSC
 * @see Infra_IdentifierModel
 * @see fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierImpl
 * @see fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl
 * @generated
 */
public interface Infra_Identifier extends Infra_IdentifierModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    @com.liferay.portal.kernel.json.JSON()
    public java.lang.String getDefinition_url();

    public void setDefinition_url(java.lang.String definition_url);

    @com.liferay.portal.kernel.json.JSON()
    public java.lang.String getResolution_url();

    public void setResolution_url(java.lang.String resolution_url);

    @com.liferay.portal.kernel.json.JSON()
    public java.lang.String getIdentifier_description_translation_key();

    public void setIdentifier_description_translation_key(
        java.lang.String identifier_description_translation_key);

    @com.liferay.portal.kernel.json.JSON()
    public java.lang.String getIdentifier_name();

    public void setIdentifier_name(java.lang.String identifier_name);
}
