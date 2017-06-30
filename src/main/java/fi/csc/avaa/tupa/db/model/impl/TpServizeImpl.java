package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.json.JSON;

/**
 * The extended model implementation for the TpServize service. Represents a row in the &quot;tupa_TpServize&quot; database table, with each column mapped to a property of this class.
 * <p>
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.model.TpServize} interface.
 * </p>
 *
 * @author CSC
 */
public class TpServizeImpl extends TpServizeBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a tp servize model instance should use the {@link fi.csc.avaa.tupa.db.model.TpServize} interface instead.
	 */
	public TpServizeImpl() {
	}

	private int[] infrastructuresIds;
	private int[] organisationsIds;
	private int[] contactsIds;
	private String[] serviceTypes;
	private String[] locationTypes;

	@JSON
	public int[] getInfrastructuresIds() {
		return infrastructuresIds;
	}

	public void setInfrastructuresIds(int[] infrastructuresIds) {
		this.infrastructuresIds = infrastructuresIds;
	}

	@JSON
	public int[] getOrganisationsIds() {
		return organisationsIds;
	}

	public void setOrganisationsIds(int[] organisationsIds) {
		this.organisationsIds = organisationsIds;
	}

	@JSON
	public int[] getContactsIds() {
		return contactsIds;
	}

	public void setContactsIds(int[] contactsIds) {
		this.contactsIds = contactsIds;
	}

	@JSON
	public String[] getLocationTypes() {
		return locationTypes;
	}

	public void setLocationTypes(String[] locationTypes) {
		this.locationTypes = locationTypes;
	}

	@JSON
	public String[] getServiceTypes() {
		return serviceTypes;
	}

	public void setServiceTypes(String[] serviceTypes) {
		this.serviceTypes = serviceTypes;
	}
}
