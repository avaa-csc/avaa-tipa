/**
 * 
 */
package fi.csc.avaa.tupa.common;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.NoSuchIdentifierException;
import fi.csc.avaa.tupa.db.model.*;
import fi.csc.avaa.tupa.db.service.*;
import fi.csc.avaa.tupa.db.service.persistence.IdentifierUtil;
import fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierUtil;

import static fi.csc.avaa.tupa.db.service.Infra_IdentifierLocalServiceUtil.getExtendedInfraIdentifiersList;
import static fi.csc.avaa.tupa.db.service.persistence.IdentifierUtil.findByPrimaryKey;

/**
 * @author jmlehtin
 *
 */
public final class DBTools {

	static final AvaaLogger log = new AvaaLogger(DBTools.class.getName());
	
	public static List<Infra> getAllInfras() {
		try {
			return InfraLocalServiceUtil.getInfras(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (SystemException e) {
			log.error("Error fetching all Infra objects from database");
			e.printStackTrace();
		}
		return null;
	}
	
	public static Infra getInfra(int infraId) {
		if(infraId == 0) {
			return null;
		}
		try {
			return InfraLocalServiceUtil.getInfra(infraId);
		} catch (PortalException | SystemException e) {
			log.error("Unable to fetch Infra object from database with infra_id: " + infraId);
			e.printStackTrace();
		}
		return null;
	}

	public static List<Infra_Identifier> getInfraIdentifiers(int infraId) {
		if (infraId == 0) {
			return null;
		}
		return getExtendedInfraIdentifiersList(infraId);
	}
	
	public static List<Palvelu> getInfraPalvelut(int infraId) {
		if(infraId == 0) {
			return null;
		}
		try {
			List<Infra_Palvelut> joinData = Infra_PalvelutLocalServiceUtil.getInfra_Palveluts(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			return joinData.stream().filter(ip -> ip.getInfra_id() == infraId).map(ip -> DBTools.getPalvelu(ip.getPalvelu_id())).collect(Collectors.toList());
		} catch (SystemException e) {
			log.error("Unable to fetch Infra's Palvelu objects from database with infra_id: " + infraId);
			e.printStackTrace();
		}
		return null;
	}
	
	public static List<Organisaatio> getInfraVastuuOrganisaatiot(int infraId) {
		if(infraId == 0) {
			return null;
		}
		try {
			List<Infra_Vastuuorganisaatiot> joinData = Infra_VastuuorganisaatiotLocalServiceUtil.getInfra_Vastuuorganisaatiots(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			return joinData.stream().filter(iv -> iv.getInfra_id() == infraId).map(iv -> DBTools.getOrganisaatio(iv.getOrganisaatio_id())).collect(Collectors.toList());
		} catch (SystemException e) {
			log.error("Unable to fetch Infra's Organisaatio objects from database with infra_id: " + infraId);
			e.printStackTrace();
		}
		return null;
	}
	
	public static List<Palvelutyyppi> getPalveluPalvelutyypit(int palveluId) {
		if(palveluId == 0) {
			return null;
		}
		try {
			List<Palvelu_Palvelutyypit> joinData = Palvelu_PalvelutyypitLocalServiceUtil.getPalvelu_Palvelutyypits(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			return joinData.stream().filter(pp -> pp.getPalvelu_id() == palveluId).map(pp -> DBTools.getPalvelutyyppi(pp.getPalvelutyyppi_id())).collect(Collectors.toList());
		} catch (SystemException e) {
			log.error("Unable to fetch Palvelu's Palvelutyyppi objects from database with palvelu_id: " + palveluId);
			e.printStackTrace();
		}
		return null;
	}
	
	public static List<Yhteystieto> getInfraYhteystiedot(int infraId) {
		if(infraId == 0) {
			return null;
		}
		try {
			List<Infra_Yhteystiedot> joinData = Infra_YhteystiedotLocalServiceUtil.getInfra_Yhteystiedots(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			return joinData.stream().filter(iy -> iy.getInfra_id() == infraId).map(iy -> DBTools.getYhteystieto(iy.getYhteystieto_id())).collect(Collectors.toList());
		} catch (SystemException e) {
			log.error("Unable to fetch Infra's Yhteystieto objects from database with infra_id: " + infraId);
			e.printStackTrace();
		}
		return null;
	}
	
	public static List<Avainsana> getInfraAvainsanat(int infraId) {
		if(infraId == 0) {
			return null;
		}
		try {
			List<Infra_Avainsanat> joinData = Infra_AvainsanatLocalServiceUtil.getInfra_Avainsanats(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			return joinData.stream().filter(ia -> ia.getInfra_id() == infraId).map(ia -> DBTools.getAvainsana(ia.getAvainsana_id())).collect(Collectors.toList());
		} catch (SystemException e) {
			log.error("Unable to fetch Infra's Yhteystieto objects from database with infra_id: " + infraId);
			e.printStackTrace();
		}
		return null;
	}
	
	public static Palvelu getPalvelu(int palveluId) {
		try {
			return PalveluLocalServiceUtil.getPalvelu(palveluId);
		} catch (PortalException | SystemException e) {
			log.error("Unable to fetch Palvelu from database with palvelu_id: " + palveluId);
			e.printStackTrace();
		}
		return null;
	}
	
	public static Yhteystieto getYhteystieto(int yhteystietoId) {
		try {
			return YhteystietoLocalServiceUtil.getYhteystieto(yhteystietoId);
		} catch (PortalException | SystemException e) {
			log.error("Unable to fetch Yhteystieto from database with yhteystieto_id: " + yhteystietoId);
			e.printStackTrace();
		}
		return null;
	}
	
	public static Organisaatio getOrganisaatio(int organisaatioId) {
		if(organisaatioId == 0) {
			return null;
		}
		try {
			return OrganisaatioLocalServiceUtil.getOrganisaatio(organisaatioId);
		} catch (PortalException | SystemException e) {
			log.error("Unable to fetch Organisaatio object from database with organisaatio_id: " + organisaatioId);
			e.printStackTrace();
		}
		return null;
	}
	
	public static Palvelutyyppi getPalvelutyyppi(int palvelutyyppiId) {
		if(palvelutyyppiId == 0) {
			return null;
		}
		try {
			return PalvelutyyppiLocalServiceUtil.getPalvelutyyppi(palvelutyyppiId);
		} catch (PortalException | SystemException e) {
			log.error("Unable to fetch Palvelutyyppi object from database with palvelutyyppi_id: " + palvelutyyppiId);
			e.printStackTrace();
		}
		return null;
	}
	
	public static Kayttoehto getInfraKayttoehto(int infraId) {
		if(infraId == 0) {
			return null;
		}
		try {
			return KayttoehtoLocalServiceUtil.getKayttoehto(infraId);
		} catch (PortalException | SystemException e) {
			log.warn("Unable to fetch Infra's Kayttoehto object from database with infra_id: " + infraId + " (probably because it does not exist)");
		}
		return null;
	}
	
	public static Avainsana getAvainsana(int avainsanaId) {
		if(avainsanaId == 0) {
			return null;
		}
		try {
			return AvainsanaLocalServiceUtil.getAvainsana(avainsanaId);
		} catch (PortalException | SystemException e) {
			log.warn("Unable to fetch Avainsana object from database with avainsana_id: " + avainsanaId + " (probably because it does not exist)");
		}
		return null;
	}
	
	public static Map<Integer, Selite> getSelitteet() {
		try {
			List<Selite> selitteet = SeliteLocalServiceUtil.getSelites(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			return selitteet.stream().collect(Collectors.toMap(Selite::getSelite_id, Function.identity()));
		} catch (SystemException e) {
			log.error("Unable to fetch Selite objects from database");
			e.printStackTrace();
		}
		return null;
	}

	public static List<Infra> getPalveluInfrat(int palveluId) {
		if(palveluId == 0) {
			return null;
		}
		List<Infra_Palvelut> infra_Palveluts;
		try {
			infra_Palveluts = Infra_PalvelutLocalServiceUtil.getInfra_Palveluts(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			return infra_Palveluts.stream().filter(ip -> ip.getPalvelu_id() == palveluId).map(ip -> DBTools.getInfra(ip.getInfra_id())).collect(Collectors.toList());
		} catch (SystemException e) {
			log.error("Unable to fetch Palvelu's Infra objects from database with palvelu_id: " + palveluId);
			e.printStackTrace();
		}
		return null;
	}

	public static List<Palvelu> getAllPalvelus() {
		try {
			return PalveluLocalServiceUtil.getPalvelus(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (SystemException e) {
			log.error("Error fetching all Palvelu objects from database");
			e.printStackTrace();
		}
		return null;
	}
}
