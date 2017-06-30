package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.json.JSON;

/**
 * The extended model implementation for the TpContact service. Represents a row in the &quot;tupa_TpContact&quot; database table, with each column mapped to a property of this class.
 * <p>
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.model.TpContact} interface.
 * </p>
 *
 * @author pj, jmlehtin
 */
public class TpContactImpl extends TpContactBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a tp contact model instance should use the {@link fi.csc.avaa.tupa.db.model.TpContact} interface instead.
	 */
	public TpContactImpl() {
	}

	private int[] infrastructuresIds;
	private int[] servicesIds;
	private int[] organisationsIds;

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
	public int[] getOrganisationsIds() {
		return organisationsIds;
	}

	public void setOrganisationsIds(int[] organisationsIds) {
		this.organisationsIds = organisationsIds;
	}
}
