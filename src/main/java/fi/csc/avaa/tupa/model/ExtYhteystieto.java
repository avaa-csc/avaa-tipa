/**
 * 
 */
package fi.csc.avaa.tupa.model;

import fi.csc.avaa.liferay.service.model.ExtendableModel;
import fi.csc.avaa.liferay.service.model.ModelExtendError;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.common.DBTools;
import fi.csc.avaa.tupa.db.model.Organisaatio;
import fi.csc.avaa.tupa.db.model.Yhteystieto;

/**
 * @author jmlehtin
 *
 */
public class ExtYhteystieto implements ExtendableModel<Yhteystieto> {

	private static AvaaLogger log = new AvaaLogger(ExtYhteystieto.class.getName());
	private Yhteystieto yhteystieto;
	private Organisaatio affiliaatioOrganisaatio;
	
	public ExtYhteystieto() {
	}
	
	public ExtYhteystieto(Yhteystieto yhteystieto, Organisaatio affiliaatioOrganisaatio) {
		this.yhteystieto = yhteystieto;
		this.affiliaatioOrganisaatio = affiliaatioOrganisaatio;
	}
	
	@Override
	public void extend(Yhteystieto yhteystieto) throws ModelExtendError {
		if(yhteystieto == null) {
			log.error("Unable to create ExtYhteystieto");
			throw new ModelExtendError();
		}
		
		int affiliaatio = yhteystieto.getAffiliaatio();
		Organisaatio affiliaatioOrg = DBTools.getOrganisaatio(affiliaatio);
		
		this.yhteystieto = yhteystieto;
		if(affiliaatioOrg != null) {
			this.affiliaatioOrganisaatio = affiliaatioOrg;
		}
	}

	public Yhteystieto getYhteystieto() {
		return yhteystieto;
	}

	public Organisaatio getAffiliaatioOrganisaatio() {
		return affiliaatioOrganisaatio;
	}
	
	
}
