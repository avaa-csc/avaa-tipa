/**
 * 
 */
package fi.csc.avaa.tupa.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.model.Organisaatio;
import fi.csc.avaa.tupa.db.model.Palvelu;
import fi.csc.avaa.tupa.db.model.Selite;
import fi.csc.avaa.tupa.db.service.OrganisaatioLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.PalveluLocalServiceUtil;
import fi.csc.avaa.tupa.model.ExtInfra;
import fi.csc.avaa.tupa.model.ExtPalvelu;

/**
 * @author jmlehtin
 *
 */
public final class TupaDBCache {
	
	private static AvaaLogger log = new AvaaLogger(TupaDBCache.class.getName());

	private static Map<Integer, ExtInfra> infraCache = new HashMap<>();
	private static Map<Integer, ExtPalvelu> palveluCache = new HashMap<>();
	
	public static Map<Integer, Selite> selitteet = new HashMap<>();
	public static List<Organisaatio> organisaatiot = new ArrayList<>();
	public static List<Palvelu> palvelut = new ArrayList<>();
	
	public static boolean initCache() {
		return getInfraCacheValues() != null && getPalveluCacheValues() != null && populateTypes();
	}
	
	public static Map<Integer, ExtInfra> getInfraCache() {
		if(infraCache == null || infraCache.size() == 0) {
			if(!updateInfraCacheFromDatabase()) {
				return null;
			}
		}
		return infraCache;
	}
	
	public static Map<Integer, ExtPalvelu> getPalveluCache() {
		if(palveluCache == null || palveluCache.size() == 0) {
			if(!updatePalveluCacheFromDatabase()) {
				return null;
			}
		}
		return palveluCache;
	}
	
	/**
	 * Use this to perform complete sync from database to cache
	 * 
	 * @return
	 */
	public static boolean syncAllInfrasInDatabaseToCache() {
		return updateInfraCacheFromDatabase() && updatePalveluCacheFromDatabase() && populateTypes();
	}
	
	private static boolean updateInfraCacheFromDatabase() {
		if(infraCache != null) {
			infraCache.clear();
		}
		infraCache = ExtInfra.getExtInfras(DBTools.getAllInfras());
		return infraCache != null && infraCache.size() > 0;
	}
	
	public static Collection<ExtInfra> getInfraCacheValues() {
		if(infraCache == null || infraCache.size() == 0) {
			if(!updateInfraCacheFromDatabase()) {
				return null;
			}
		}
		return infraCache.values();
	}
	
	public static Collection<ExtPalvelu> getPalveluCacheValues() {
		if(palveluCache == null || palveluCache.size() == 0) {
			if(!updatePalveluCacheFromDatabase()) {
				return null;
			}
		}
		return palveluCache.values();
	}
	
	private static boolean updatePalveluCacheFromDatabase() {
		if(palveluCache != null) {
			palveluCache.clear();
		}
		palveluCache = ExtPalvelu.getExtPalvelus(DBTools.getAllPalvelus());
		return palveluCache != null && palveluCache.size() > 0;
	}

	private static boolean populateTypes() {
		try {
			selitteet = DBTools.getSelitteet();
			organisaatiot = OrganisaatioLocalServiceUtil.getOrganisaatios(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			palvelut = PalveluLocalServiceUtil.getPalvelus(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (SystemException e) {
			e.printStackTrace();
			log.error("Error when enumerating all available types");
			return false;
		}
		return true;
	}
	
}
