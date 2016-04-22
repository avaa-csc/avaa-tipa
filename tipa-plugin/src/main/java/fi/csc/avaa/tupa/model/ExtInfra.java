/**
 * 
 */
package fi.csc.avaa.tupa.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fi.csc.avaa.liferay.service.model.ExtendableModel;
import fi.csc.avaa.liferay.service.model.ModelExtendError;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.common.DBTools;
import fi.csc.avaa.tupa.db.model.Avainsana;
import fi.csc.avaa.tupa.db.model.Infra;
import fi.csc.avaa.tupa.db.model.Kayttoehto;
import fi.csc.avaa.tupa.db.model.Organisaatio;
import fi.csc.avaa.tupa.db.model.Palvelu;
import fi.csc.avaa.tupa.db.model.Yhteystieto;

/**
 * @author jmlehtin
 *
 */
public class ExtInfra implements ExtendableModel<Infra> {

	private static AvaaLogger log = new AvaaLogger(ExtInfra.class.getName());
	private Infra infra;
	private Infra edellinenInfra;
	private List<ExtOrganisaatio> vastuuOrganisaatiot;
	private List<ExtYhteystieto> yhteystiedot;
	private List<ExtPalvelu> palvelut;
	private List<Avainsana> avainsanat;
	private Kayttoehto kayttoehto;
	
	public ExtInfra() {
	}
	
	public ExtInfra(Infra infra, Infra edellinenInfra, List<ExtOrganisaatio> vastuuOrganisaatiot, List<ExtYhteystieto> yhteystiedot, List<ExtPalvelu> palvelut, Kayttoehto kayttoehto, List<Avainsana> avainsanat) {
		this.infra = infra;
		this.edellinenInfra = edellinenInfra;
		this.vastuuOrganisaatiot = vastuuOrganisaatiot;
		this.yhteystiedot = yhteystiedot;
		this.palvelut = palvelut;
		this.kayttoehto = kayttoehto;
		this.avainsanat = avainsanat;
	}
	
	@Override
	public void extend(Infra infra) throws ModelExtendError {
		if(infra == null) {
			log.error("Unable to create ExtInfra");
			throw new ModelExtendError();
		}
		
		int infraId = infra.getInfra_id();
		Infra edellinenInfra = DBTools.getInfra(infra.getEdellinen_infra());
		List<Organisaatio> vastuuOrgs = DBTools.getInfraVastuuOrganisaatiot(infraId);
		List<Yhteystieto> yhteystiedot = DBTools.getInfraYhteystiedot(infraId);
		List<Palvelu> palvelut = DBTools.getInfraPalvelut(infraId);
		Kayttoehto kayttoehto = DBTools.getInfraKayttoehto(infraId);
		List<Avainsana> avainsanat = DBTools.getInfraAvainsanat(infraId);
		
		if(vastuuOrgs == null || yhteystiedot == null || palvelut == null) {
			log.error("Unable to create ExtInfra");
			throw new ModelExtendError();
		}
		
		List<ExtOrganisaatio> extVastuuOrgs = new ArrayList<>();
		for(Organisaatio org : vastuuOrgs) {
			ExtOrganisaatio extOrg = new ExtOrganisaatio();
			try {
				extOrg.extend(org);
				extVastuuOrgs.add(extOrg);
			} catch(ModelExtendError e) {
				log.error("Unable to create ExtOrganisaatio for ExtInfra");
				throw e;
			}
		}
		
		List<ExtYhteystieto> extYhteystiedot = new ArrayList<>();
		for(Yhteystieto yt : yhteystiedot) {
			ExtYhteystieto extYhteystieto = new ExtYhteystieto();
			try {
				extYhteystieto.extend(yt);
				extYhteystiedot.add(extYhteystieto);
			} catch(ModelExtendError e) {
				log.error("Unable to create ExtYhteystieto for ExtInfra");
				throw e;
			}
		}
		
		List<ExtPalvelu> extPalvelut = new ArrayList<>();
		for(Palvelu p : palvelut) {
			ExtPalvelu extPalvelu = new ExtPalvelu();
			try {
				extPalvelu.extend(p);
				extPalvelut.add(extPalvelu);
			} catch(ModelExtendError e) {
				log.error("Unable to create ExtPalvelu");
				throw e;
			}
		}
		
		this.infra = infra;
		if(edellinenInfra != null) {
			this.edellinenInfra = edellinenInfra;
		}
		this.vastuuOrganisaatiot = extVastuuOrgs;
		this.yhteystiedot = extYhteystiedot;
		this.palvelut = extPalvelut;
		if(kayttoehto != null) {
			this.kayttoehto = kayttoehto;
		}
		if(avainsanat != null) {
			this.avainsanat = avainsanat;
		}
	}

	public Infra getInfra() {
		return infra;
	}
	
	public Infra getEdellinenInfra() {
		return edellinenInfra;
	}

	public List<ExtOrganisaatio> getVastuuOrganisaatiot() {
		return vastuuOrganisaatiot;
	}

	public List<ExtYhteystieto> getYhteystiedot() {
		return yhteystiedot;
	}

	public List<ExtPalvelu> getPalvelut() {
		return palvelut;
	}

	public Kayttoehto getKayttoehto() {
		return kayttoehto;
	}
	
	public List<Avainsana> getAvainsanat() {
		return avainsanat;
	}

	public static Map<Integer, ExtInfra> getExtInfras(List<Infra> infras) {
		Map<Integer, ExtInfra> retVal = new HashMap<>();
		if(infras != null) {
			for(Infra infra : infras) {
				ExtInfra extInfra = getExtInfraFromInfra(infra);
				if(extInfra != null) {
					retVal.put(infra.getInfra_id(), extInfra);
				}
			}
			return retVal;
		}
		return null;
	}
	
	public static ExtInfra getExtInfraFromInfra(Infra infra) {
		if(infra != null) {
			ExtInfra extInfra = new ExtInfra();
			try {
				extInfra.extend(infra);
				return extInfra;
			} catch(ModelExtendError e) {
				log.error("Unable to extend infra model with infra id " + infra.getInfra_id());
			}
		}
		return null;
	}

}
