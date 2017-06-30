/**
 * 
 */
package fi.csc.avaa.tupa.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.vaadin.server.FontAwesome;

import fi.csc.avaa.tools.Const;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tools.vaadin.language.LanguageConst;
import fi.csc.avaa.tools.vaadin.language.Translator;
import fi.csc.avaa.tupa.common.SeliteType;
import fi.csc.avaa.tupa.common.TupaConst;
import fi.csc.avaa.tupa.common.TupaDBCache;
import fi.csc.avaa.tupa.db.model.Kayttoehto;
import fi.csc.avaa.tupa.db.model.Organisaatio;
import fi.csc.avaa.tupa.db.model.Palvelutyyppi;
import fi.csc.avaa.tupa.db.model.Selite;

/**
 * @author jmlehtin
 *
 */
public final class ModelTools {
	
	private static AvaaLogger log = new AvaaLogger(ModelTools.class.getName());

	/**
	 * 
	 * @param extInfra
	 * @return map whose keys are palvelutyyppi IDs and values are count of that palvelutyyppi for all infra's palvelut
	 */
	public static Map<Integer, Integer> getInfraPalveluTyyppiCount(ExtInfra extInfra) {
		Map<Integer, Integer> palveluTyyppiCount = new HashMap<>();
		palveluTyyppiCount.put(TupaConst.PALVELUTYYPPI_AINEISTO_ID, 0);
		palveluTyyppiCount.put(TupaConst.PALVELUTYYPPI_LAITTEISTO_ID, 0);
		palveluTyyppiCount.put(TupaConst.PALVELUTYYPPI_PALVELU_ID, 0);
		for(ExtPalvelu extPalvelu : extInfra.getPalvelut()) {
			for(Palvelutyyppi palveluTyyppi : extPalvelu.getPalvelutyypit()) {
				int palveluTyyppiId = palveluTyyppi.getPalvelutyyppi_id();
				Integer count = palveluTyyppiCount.get(palveluTyyppiId);
				palveluTyyppiCount.put(palveluTyyppiId, ++count);
			}
		}
		return palveluTyyppiCount;
	}
	
	public static Map<Integer, Integer> getPalveluPalveluTyyppiCount(ExtPalvelu extPalvelu) {
		Map<Integer, Integer> palveluTyyppiCount = new HashMap<>();
		palveluTyyppiCount.put(TupaConst.PALVELUTYYPPI_AINEISTO_ID, 0);
		palveluTyyppiCount.put(TupaConst.PALVELUTYYPPI_LAITTEISTO_ID, 0);
		palveluTyyppiCount.put(TupaConst.PALVELUTYYPPI_PALVELU_ID, 0);
		for(Palvelutyyppi palveluTyyppi : extPalvelu.getPalvelutyypit()) {
			int palveluTyyppiId = palveluTyyppi.getPalvelutyyppi_id();
			Integer count = palveluTyyppiCount.get(palveluTyyppiId);
			palveluTyyppiCount.put(palveluTyyppiId, ++count);
		}
		return palveluTyyppiCount;
	}
	
	/**
	 * @param extInfra
	 * @return map whose keys are palvelu paikkatyyppi IDs and values are count of infras total palvelu paikkatyyppi amounts
	 */
	public static Map<Integer, Integer> getInfraPaikkatyyppiCount(ExtInfra extInfra) {
		Map<Integer, Integer> palveluPaikkaTyyppiCount = new HashMap<>();
		palveluPaikkaTyyppiCount.put(TupaConst.PAIKKATYYPPI_HAJAUTETTU_ID, 0);
		palveluPaikkaTyyppiCount.put(TupaConst.PAIKKATYYPPI_VIRTUAALINEN_ID, 0);
		palveluPaikkaTyyppiCount.put(TupaConst.PAIKKATYYPPI_PAIKKASIDONNAINEN_ID, 0);
		for(ExtPalvelu extPalvelu : extInfra.getPalvelut()) {
			int paikkaTyyppiId = extPalvelu.getPalvelu().getPaikkatyyppi();
			Integer count = palveluPaikkaTyyppiCount.get(paikkaTyyppiId);
			if(count == null) {
				count = 0;
			}
			count++;
			palveluPaikkaTyyppiCount.put(paikkaTyyppiId, count);
		}
		return palveluPaikkaTyyppiCount;
	}
	
	public static Map<Integer, Integer> getPalveluPaikkatyyppiCount(ExtPalvelu extPalvelu) {
		Map<Integer, Integer> palveluPaikkaTyyppiCount = new HashMap<>();
		palveluPaikkaTyyppiCount.put(TupaConst.PAIKKATYYPPI_HAJAUTETTU_ID, 0);
		palveluPaikkaTyyppiCount.put(TupaConst.PAIKKATYYPPI_VIRTUAALINEN_ID, 0);
		palveluPaikkaTyyppiCount.put(TupaConst.PAIKKATYYPPI_PAIKKASIDONNAINEN_ID, 0);
		if(extPalvelu.getPalvelu().getPaikkatyyppi() > 0) {
			palveluPaikkaTyyppiCount.put(extPalvelu.getPalvelu().getPaikkatyyppi(), 1);
		}
		return palveluPaikkaTyyppiCount;
	}
	
	public static String getTyyppiIcons(Map<Integer, Integer> map, Translator translator) {
		String retVal = Const.STRING_EMPTY;
		for(Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
			int key = mapEntry.getKey();
			int val = mapEntry.getValue();
			String description = "";
			if(val > 0) {
				if(TupaConst.PAIKKATYYPPI_HAJAUTETTU_ID == key) {
					description = "title='"+getSeliteDescription(TupaConst.PAIKKATYYPPI_HAJAUTETTU_ID, translator)+"'";
					retVal += FontAwesome.SITEMAP.getHtml().replace("style",""+description+" style");
				} else if(TupaConst.PAIKKATYYPPI_VIRTUAALINEN_ID == key) {
					description = "title='"+getSeliteDescription(TupaConst.PAIKKATYYPPI_VIRTUAALINEN_ID, translator)+"'";
					retVal += FontAwesome.CLOUD_DOWNLOAD.getHtml().replace("style",""+description+" style");
				} else if(TupaConst.PAIKKATYYPPI_PAIKKASIDONNAINEN_ID == key) {
					description = "title='"+getSeliteDescription(TupaConst.PAIKKATYYPPI_PAIKKASIDONNAINEN_ID, translator)+"'";
					retVal += FontAwesome.MAP_MARKER.getHtml().replace("style",""+description+" style");
				} else if(TupaConst.PALVELUTYYPPI_AINEISTO_ID == key) {
					description = "title='"+getSeliteDescription(TupaConst.PALVELUTYYPPI_AINEISTO_ID, translator)+"'";
					retVal += FontAwesome.ARCHIVE.getHtml().replace("style",""+description+" style");
				} else if(TupaConst.PALVELUTYYPPI_LAITTEISTO_ID == key) {
					description = "title='"+getSeliteDescription(TupaConst.PALVELUTYYPPI_LAITTEISTO_ID, translator)+"'";
					retVal += FontAwesome.FLASK.getHtml().replace("style",""+description+" style");
				} else if(TupaConst.PALVELUTYYPPI_PALVELU_ID == key) {
					description = "title='"+getSeliteDescription(TupaConst.PALVELUTYYPPI_PALVELU_ID, translator)+"'";
					retVal += FontAwesome.USER_MD.getHtml().replace("style",""+description+" style");
				}
			}
		}
		return retVal;
	}
	
	public static float getOpennessAveragedValue(ExtInfra extInfra) {
		Kayttoehto kEhto = extInfra.getKayttoehto();
		if(kEhto != null) {
			int saavutettavuus = kEhto.getSaavutettavuus() % 10;
			int anonymiteetti = kEhto.getAnonymiteetti() % 10;
			int maksullisuus = kEhto.getMaksullisuus() % 10;
			int tulostenJulkVelvoite = kEhto.getTulosten_julkaisuvelvoite() % 10;
			int tuotoksienJulkVelvoite = kEhto.getTuotoksien_julkaisuvelvoite() % 10;
			int osaamisenAvoimuus = kEhto.getOsaamisen_avoimuus() % 10;
			int seurantaTyokalut = kEhto.getSeurantatyokalut() % 10;
			int tulostenLisensiointi = kEhto.getTulosten_lisensointi() % 10;
			return (saavutettavuus+anonymiteetti+maksullisuus+tulostenJulkVelvoite+tuotoksienJulkVelvoite+osaamisenAvoimuus+seurantaTyokalut+tulostenLisensiointi)/8.0f;
		}
		return 0.0f;
	}

	public static String getOpennessRatingForInfra(ExtInfra extInfra, Translator translator) {
		if(extInfra != null) {
			float opennessValue = ModelTools.getOpennessAveragedValue(extInfra);
			String desc = "title='"+translator.localize("Description.Avoimuus")+"' ";
			FontAwesome fullStar = FontAwesome.STAR;
			FontAwesome emptyStar = FontAwesome.STAR_O;
			FontAwesome halfFullStar = FontAwesome.STAR_HALF_FULL;
			if(opennessValue == 0.0) {
				return (emptyStar.getHtml() + emptyStar.getHtml() + emptyStar.getHtml()).replace("style",""+desc+" style");
			} else if(opennessValue < 0.5) {
				return (halfFullStar.getHtml() + emptyStar.getHtml() + emptyStar.getHtml()).replace("style",""+desc+" style");
			} else if(opennessValue <= 1.0) {
				return (fullStar.getHtml() + emptyStar.getHtml() + emptyStar.getHtml()).replace("style",""+desc+" style");
			} else if(opennessValue < 1.5) {
				return (fullStar.getHtml() + halfFullStar.getHtml() + emptyStar.getHtml()).replace("style",""+desc+" style");
			} else if(opennessValue <= 2.0) {
				return (fullStar.getHtml() + fullStar.getHtml() + emptyStar.getHtml()).replace("style",""+desc+" style");
			} else if(opennessValue < 2.5) {
				return (fullStar.getHtml() + fullStar.getHtml() + halfFullStar.getHtml()).replace("style",""+desc+" style");
			} else {
				return (fullStar.getHtml() + fullStar.getHtml() + fullStar.getHtml()).replace("style",""+desc+" style");
			}
		}
		return Const.STRING_EMPTY;
	}
	
	public static String getOpennessRatingForPalvelu(ExtPalvelu extPalvelu, Translator translator) {
		if(extPalvelu != null && extPalvelu.getInfrat() != null) {
			return 	extPalvelu.getInfrat().stream()
					.map(i -> TupaDBCache.getInfraCache().get(i.getInfra_id()))
					.map(ei -> getOpennessRatingForInfra(ei, translator))
					.collect(Collectors.joining("<br>"));
		}
		return Const.STRING_EMPTY;
	}
	
	public static List<Organisaatio> getAllNonIntlParentestOrganisations(ExtInfra extInfra) {
		if(extInfra.getVastuuOrganisaatiot() != null) {
			return extInfra.getVastuuOrganisaatiot().stream()
					.filter(e -> !e.getOrganisaatio().getKv_isanta())
					.map(e -> e.getTopmostOrganisation())
					.collect(Collectors.toList());
		}
		return null;
	}
	
	public static List<ExtOrganisaatio> getAllNonIntlChildestExtOrganisations(ExtInfra extInfra) {
		if(extInfra.getVastuuOrganisaatiot() != null) {
			return extInfra.getVastuuOrganisaatiot().stream()
					.filter(o -> !o.getOrganisaatio().getKv_isanta())
					.collect(Collectors.toList());
		}
		return null;
	}
	
	public static List<Organisaatio> getIntlHostOrganisations(ExtInfra extInfra) {
		if(extInfra.getVastuuOrganisaatiot() != null) {
			return 	extInfra.getVastuuOrganisaatiot().stream()
					.filter(e -> e.getOrganisaatio().getKv_isanta())
					.map(e -> e.getOrganisaatio()).collect(Collectors.toList());
		}
		return null;
	}
	
	public static String getSeliteName(int seliteId, Translator translator) {
		if(LanguageConst.LOCALE_FI.equals(translator.getDefaultLocale())) {
			try {
				return TupaDBCache.selitteet.get(seliteId).getNimi();
			} catch (Exception e) {
				return "-";
			}
		} else if(LanguageConst.LOCALE_EN.equals(translator.getDefaultLocale())) {
			try {
				return TupaDBCache.selitteet.get(seliteId).getName();
			} catch(Exception e) {
				return "-";
			}
		}
		return null;
	}
	
	public static String getSeliteDescription(int seliteId, Translator translator) {
		try {
			if(LanguageConst.LOCALE_FI.equals(translator.getDefaultLocale())) {
				return TupaDBCache.selitteet.get(seliteId).getKuvaus();
			} else if(LanguageConst.LOCALE_EN.equals(translator.getDefaultLocale())) {
				return TupaDBCache.selitteet.get(seliteId).getDescription();
			}
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		}
		return null;
	}
	
	public static List<Selite> getSeliteTypes(SeliteType type) {
		List<Selite> seliteTypes = new ArrayList<>();
		switch (type) {
			case KAYTTOEHTO_ANONYMITEETTI:
				seliteTypes.addAll(Arrays.asList(TupaDBCache.selitteet.get(31), TupaDBCache.selitteet.get(32), TupaDBCache.selitteet.get(33)));
				break;
			case KAYTTOEHTO_MAKSULLISUUS:
				seliteTypes.addAll(Arrays.asList(TupaDBCache.selitteet.get(41), TupaDBCache.selitteet.get(42), TupaDBCache.selitteet.get(43)));
				break;
			case KAYTTOEHTO_OSAAMISEN_AVOIMUUS:
				seliteTypes.addAll(Arrays.asList(TupaDBCache.selitteet.get(71), TupaDBCache.selitteet.get(72), TupaDBCache.selitteet.get(73)));
				break;
			case KAYTTOEHTO_SAAVUTETTAVUUS:
				seliteTypes.addAll(Arrays.asList(TupaDBCache.selitteet.get(21), TupaDBCache.selitteet.get(22), TupaDBCache.selitteet.get(23)));
				break;
			case KAYTTOEHTO_SEURANTATYOKALUT:
				seliteTypes.addAll(Arrays.asList(TupaDBCache.selitteet.get(81), TupaDBCache.selitteet.get(82), TupaDBCache.selitteet.get(83)));
				break;
			case KAYTTOEHTO_TULOSTEN_JULKAISUVELVOITE:
				seliteTypes.addAll(Arrays.asList(TupaDBCache.selitteet.get(51), TupaDBCache.selitteet.get(52), TupaDBCache.selitteet.get(53)));
				break;
			case KAYTTOEHTO_TULOSTEN_LISENSOINTI:
				seliteTypes.addAll(Arrays.asList(TupaDBCache.selitteet.get(91), TupaDBCache.selitteet.get(92), TupaDBCache.selitteet.get(93)));
				break;
			case KAYTTOEHTO_TUOTOKSIEN_JULKAISUVELVOITE:
				seliteTypes.addAll(Arrays.asList(TupaDBCache.selitteet.get(61), TupaDBCache.selitteet.get(62), TupaDBCache.selitteet.get(63)));
				break;
			case PAIKKATYYPPI:
				seliteTypes.addAll(Arrays.asList(TupaDBCache.selitteet.get(11), TupaDBCache.selitteet.get(12), TupaDBCache.selitteet.get(13)));
				break;
			case PALVELUTYYPPI:
				seliteTypes.addAll(Arrays.asList(TupaDBCache.selitteet.get(1), TupaDBCache.selitteet.get(2), TupaDBCache.selitteet.get(3)));
				break;
			default:
				log.error("Unknown selite type");
				break;
		}
		return seliteTypes;
	}
}
