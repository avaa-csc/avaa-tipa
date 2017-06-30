package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.json.JSON;

/**
 * The extended model implementation for the TpOrganisation service. Represents a row in the &quot;tupa_TpOrganisation&quot; database table, with each column mapped to a property of this class.
 * <p>
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.model.TpOrganisation} interface.
 * </p>
 *
 * @author pj, jmlehtin
 */
public class TpOrganisationImpl extends TpOrganisationBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a tp organisation model instance should use the {@link fi.csc.avaa.tupa.db.model.TpOrganisation} interface instead.
	 */
	public TpOrganisationImpl() {
	}

	private int[] infrastructuresIds;
	private int[] servicesIds;
	private int[] contactsIds;

	@JSON
	public int[] getInfrastructuresIds() {
		return infrastructuresIds;
	}

	public void setInfrastructuresIds(int[] infrastructuresIds) {
		this.infrastructuresIds = infrastructuresIds;
	}

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
}
