package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.json.JSON;

/**
 * The extended model implementation for the Infra_Identifier service. Represents a row in the &quot;infra_identifier&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.model.Infra_Identifier} interface.
 * </p>
 *
 * @author CSC
 */
public class Infra_IdentifierImpl extends Infra_IdentifierBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. All methods that expect a infra_ identifier model instance should use the {@link fi.csc.avaa.tupa.db.model.Infra_Identifier} interface instead.
     */
    public Infra_IdentifierImpl() {
    }

    private String identifier_name;
    private String identifier_description_translation_key;
    private String resolution_url;

    @JSON
	public String getDefinition_url() {
		return definition_url;
	}

	public void setDefinition_url(String definition_url) {
		this.definition_url = definition_url;
	}

	private String definition_url;

    @JSON
	public String getResolution_url() {
		return resolution_url;
	}

	public void setResolution_url(String resolution_url) {
		this.resolution_url = resolution_url;
	}

	@JSON
	public String getIdentifier_description_translation_key() {
		return identifier_description_translation_key;
	}

	public void setIdentifier_description_translation_key(String identifier_description_translation_key) {
		this.identifier_description_translation_key = identifier_description_translation_key;
	}

	@JSON
    public String getIdentifier_name() {
        return identifier_name;
    }

    public void setIdentifier_name(String identifier_name) {
        this.identifier_name = identifier_name;
    }
}
