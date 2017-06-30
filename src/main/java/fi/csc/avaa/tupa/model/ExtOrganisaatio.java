/**
 * 
 */
package fi.csc.avaa.tupa.model;

import java.util.ArrayList;
import java.util.List;

import fi.csc.avaa.liferay.service.model.ExtendableModel;
import fi.csc.avaa.liferay.service.model.ModelExtendError;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.common.DBTools;
import fi.csc.avaa.tupa.db.model.Organisaatio;

/**
 * @author jmlehtin
 *
 */
public class ExtOrganisaatio implements ExtendableModel<Organisaatio> {

	private static AvaaLogger log = new AvaaLogger(ExtOrganisaatio.class.getName());
	private Organisaatio organisaatio;
	/* emoOrganisaatiot should be ordered from the lowest org to the top-level parent org
	 (lowest meaning the parent organization of this organisaatio)
	*/
	private List<Organisaatio> emoOrganisaatiot;
	
	public ExtOrganisaatio() {
	}
	
	public ExtOrganisaatio(Organisaatio organisaatio, List<Organisaatio> emoOrganisaatiot) {
		this.organisaatio = organisaatio;
		this.emoOrganisaatiot = emoOrganisaatiot;
	}
	
	@Override
	public void extend(Organisaatio organisaatio) throws ModelExtendError {
		if(organisaatio == null) {
			log.error("Unable to create ExtOrganisaatio");
			throw new ModelExtendError();
		}
		
		this.organisaatio = organisaatio;
		this.emoOrganisaatiot = new ArrayList<>();
		
		Organisaatio org = this.organisaatio;
		while(org.getEmo_organisaatio() > 0) {
			Organisaatio pOrg = DBTools.getOrganisaatio(org.getEmo_organisaatio());
			if(pOrg != null) {
				this.emoOrganisaatiot.add(pOrg);
			}
			org = pOrg;
		}
	}

	public Organisaatio getOrganisaatio() {
		return organisaatio;
	}

	public List<Organisaatio> getEmoOrganisaatiot() {
		return emoOrganisaatiot;
	}
	
	public Organisaatio getTopmostOrganisation() {
		if(emoOrganisaatiot != null && emoOrganisaatiot.size() > 0) {
			return emoOrganisaatiot.get(emoOrganisaatiot.size()-1);
		}
		return organisaatio;
	}
	
}
