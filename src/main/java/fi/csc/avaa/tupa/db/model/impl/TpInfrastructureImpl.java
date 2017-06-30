package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.json.JSONObject;

/**
 * The extended model implementation for the TpInfrastructure service. Represents a row in the &quot;tupa_TpInfrastructure&quot; database table, with each column mapped to a property of this class.
 * <p>
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.model.TpInfrastructure} interface.
 * </p>
 *
 * @author pj, jmlehtin
 */
public class TpInfrastructureImpl extends TpInfrastructureBaseImpl {
	/*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. All methods that expect a tp infrastructure model instance should use the {@link fi.csc.avaa.tupa.db.model.TpInfrastructure} interface instead.
     */

	public TpInfrastructureImpl() {
	}

	private int[] servicesIds;
	private int[] contactsIds;
	private int[] organisationsIds;
	private String[] keywords_EN;
	private String[] keywords_FI;
	private JSONObject pids;

	@JSON
	public int[] getServicesIds() {
		return servicesIds;
	}

	public void setServicesIds(int[] servicesIds) {
		this.servicesIds = servicesIds;
	}

	@JSON
	public int[] getContactsIds() {
		return contactsIds;
	}

	public void setContactsIds(int[] contactsIds) {
		this.contactsIds = contactsIds;
	}

	@JSON
	public int[] getOrganisationsIds() {
		return organisationsIds;
	}

	public void setOrganisationsIds(int[] organisationsIds) {
		this.organisationsIds = organisationsIds;
	}
	
	@JSON
	public String[] getKeywords_EN() {
		return keywords_EN;
	}

	public void setKeywords_EN(String[] keywords_EN) {
		this.keywords_EN = keywords_EN;
	}

	@JSON
	public String[] getKeywords_FI() {
		return keywords_FI;
	}

	public void setKeywords_FI(String[] keywords_FI) {
		this.keywords_FI = keywords_FI;
	}

	@JSON
	public JSONObject getPids() {
		return pids;
	}

	public void setPids(JSONObject pids) {
		this.pids = pids;
	}
}
