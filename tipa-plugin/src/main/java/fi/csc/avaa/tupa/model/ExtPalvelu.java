/**
 * 
 */
package fi.csc.avaa.tupa.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fi.csc.avaa.liferay.service.model.ExtendableModel;
import fi.csc.avaa.liferay.service.model.ModelExtendError;
import fi.csc.avaa.tools.StringTools;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.common.DBTools;
import fi.csc.avaa.tupa.common.TupaConst;
import fi.csc.avaa.tupa.db.model.Infra;
import fi.csc.avaa.tupa.db.model.Palvelu;
import fi.csc.avaa.tupa.db.model.Palvelutyyppi;

/**
 * @author jmlehtin
 *
 */
public class ExtPalvelu implements ExtendableModel<Palvelu> {

	private static AvaaLogger log = new AvaaLogger(ExtPalvelu.class.getName());
	private Palvelu palvelu;
	private List<Palvelutyyppi> palvelutyypit;
	private List<Infra> infrat;
	
	public ExtPalvelu() {
	}
	
	public ExtPalvelu(Palvelu palvelu, List<Palvelutyyppi> palvelutyypit) {
		this.palvelu = palvelu;
		this.palvelutyypit = palvelutyypit;
	}
	
	@Override
	public void extend(Palvelu palvelu) throws ModelExtendError {
		if(palvelu == null) {
			log.error("Unable to create ExtPalvelu");
			throw new ModelExtendError();
		}
		
		int palveluId = palvelu.getPalvelu_id();
		List<Palvelutyyppi> palvelutyypit = DBTools.getPalveluPalvelutyypit(palveluId);
		if(palvelutyypit == null) {
			log.error("Unable to create ExtPalvelu");
			throw new ModelExtendError();
		}
		
		List<Infra> infrat = DBTools.getPalveluInfrat(palveluId);
		if(infrat == null) {
			log.error("Unable to create ExtPalvelu");
			throw new ModelExtendError();
		}
		this.infrat = infrat;
		this.palvelu = palvelu;
		this.palvelutyypit = palvelutyypit;
	}

	public Palvelu getPalvelu() {
		return palvelu;
	}

	public List<Palvelutyyppi> getPalvelutyypit() {
		return palvelutyypit;
	}

	public List<Infra> getInfrat() {
		return infrat;
	}
	
	public boolean isLocationBound() {
		return TupaConst.PAIKKATYYPPI_PAIKKASIDONNAINEN_ID == palvelu.getPaikkatyyppi();
	}

	public static Map<Integer, ExtPalvelu> getExtPalvelus(List<Palvelu> allPalvelus) {
		Map<Integer, ExtPalvelu> retVal = new HashMap<>();
		if(allPalvelus != null) {
			for(Palvelu palvelu : allPalvelus) {
				ExtPalvelu extPalvelu = getExtPalveluFrompalvelu(palvelu);
				if(extPalvelu != null) {
					retVal.put(palvelu.getPalvelu_id(), extPalvelu);
				}
			}
			return retVal;
		}
		return null;
	}

	public static ExtPalvelu getExtPalveluFrompalvelu(Palvelu palvelu) {
		if(palvelu != null) {
			ExtPalvelu extPalvelu = new ExtPalvelu();
			try {
				extPalvelu.extend(palvelu);
				return extPalvelu;
			} catch(ModelExtendError e) {
				log.error("Unable to extend palvelu model with palvelu id " + palvelu.getPalvelu_id());
			}
		}
		return null;
	}


}
