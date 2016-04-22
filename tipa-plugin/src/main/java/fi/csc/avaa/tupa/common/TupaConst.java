/**
 * 
 */
package fi.csc.avaa.tupa.common;

import fi.csc.avaa.tools.Const;
import fi.csc.avaa.tools.StringTools;

/**
 * @author jmlehtin
 *
 */
public final class TupaConst {

	public static final String PORTLET_PREFERENCE_KEY_LANGUAGE = "language";

	public static final String APPLICATION_HOST_NAME_FI = "infrat.avointiede.fi";
	public static final String APPLICATION_HOST_NAME_EN = "infras.openscience.fi";

	public static final String APPLICATION_HOST_NAME_FI_TEST = "infrat-test.avointiede.fi";
	public static final String APPLICATION_HOST_NAME_EN_TEST = "infras-test.openscience.fi";

	public static final String SUOMEN_AKATEMIA_URL_FI = "http://www.aka.fi/fi/tiedepoliittinen-toiminta/tutkimusinfrastruktuurit";
	public static final String SUOMEN_AKATEMIA_URL_EN = "http://www.aka.fi/en/research-and-science-policy/research-infrastructures";
	public static final String OKM_URL_FI = "http://www.minedu.fi/OPM/Tiede/?lang=fi";
	public static final String OKM_URL_EN = "http://www.minedu.fi/OPM/Tiede/?lang=en";

	public static final int PALVELUTYYPPI_AINEISTO_ID = 1;
	public static final int PALVELUTYYPPI_PALVELU_ID = 2;
	public static final int PALVELUTYYPPI_LAITTEISTO_ID = 3;
	public static final int PAIKKATYYPPI_VIRTUAALINEN_ID = 11;
	public static final int PAIKKATYYPPI_HAJAUTETTU_ID = 12;
	public static final int PAIKKATYYPPI_PAIKKASIDONNAINEN_ID = 13;
	public static final int KAYTTOEHTO_SAAVUTETTAVUUS_BASE_ID = 20;
	public static final int KAYTTOEHTO_SAAVUTETTAVUUS_HAKUPROSESSI_ID = 21;
	public static final int KAYTTOEHTO_SAAVUTETTAVUUS_TUNNISTAUTUMINEN_ID = 22;
	public static final int KAYTTOEHTO_SAAVUTETTAVUUS_AVOIN_ID = 23;
	public static final int KAYTTOEHTO_ANONYMITEETTI_BASE_ID = 30;
	public static final int KAYTTOEHTO_ANONYMITEETTI_KIRJAUTUNEENA_ID = 31;
	public static final int KAYTTOEHTO_ANONYMITEETTI_ANONYYMI_JULKAISU_KIRJAUTUNEENA_ID = 32;
	public static final int KAYTTOEHTO_ANONYMITEETTI_TAYSIN_ANONYYMI_ID = 33;
	public static final int KAYTTOEHTO_MAKSULLISUUS_BASE_ID = 40;
	public static final int KAYTTOEHTO_MAKSULLISUUS_MAKSULLINEN_ID = 41;
	public static final int KAYTTOEHTO_MAKSULLISUUS_OSIN_MAKSULLINEN_ID = 42;
	public static final int KAYTTOEHTO_MAKSULLISUUS_MAKSUTON_ID = 43;
	public static final int KAYTTOEHTO_TULOSTEN_JULKAISUVELVOITE_BASE_ID = 50;
	public static final int KAYTTOEHTO_TULOSTEN_JULKAISUVELVOITE_EI_ID = 51;
	public static final int KAYTTOEHTO_TULOSTEN_JULKAISUVELVOITE_ID = 52;
	public static final int KAYTTOEHTO_TULOSTEN_JULKAISUVELVOITE_AVOIN_ID = 53;
	public static final int KAYTTOEHTO_TUOTOKSIEN_JULKAISUVELVOITE_BASE_ID = 60;
	public static final int KAYTTOEHTO_TUOTOKSIEN_JULKAISUVELVOITE_EI_SAATAVILLA_ID = 61;
	public static final int KAYTTOEHTO_TUOTOKSIEN_JULKAISUVELVOITE_OSA_SAATAVILLA_ID = 62;
	public static final int KAYTTOEHTO_TUOTOKSIEN_JULKAISUVELVOITE_AVOIMESTI_SAATAVILLA_ID = 63;
	public static final int KAYTTOEHTO_OSAAMISEN_AVOIMUUS_BASE_ID = 70;
	public static final int KAYTTOEHTO_OSAAMISEN_AVOIMUUS_EI_ID = 71;
	public static final int KAYTTOEHTO_OSAAMISEN_AVOIMUUS_OSIN_ID = 72;
	public static final int KAYTTOEHTO_OSAAMISEN_AVOIMUUS_AVOIN_ID = 73;
	public static final int KAYTTOEHTO_SEURANTATYOKALUT_BASE_ID = 80;
	public static final int KAYTTOEHTO_SEURANTATYOKALUT_EI_ID = 81;
	public static final int KAYTTOEHTO_SEURANTATYOKALUT_OSIN_ID = 82;
	public static final int KAYTTOEHTO_SEURANTATYOKALUT_AVOIN_ID = 83;
	public static final int KAYTTOEHTO_TULOSTEN_LISENSOINTI_BASE_ID = 90;
	public static final int KAYTTOEHTO_TULOSTEN_LISENSOINTI_EI_ID = 91;
	public static final int KAYTTOEHTO_TULOSTEN_LISENSOINTI_OSIN_ID = 92;
	public static final int KAYTTOEHTO_TULOSTEN_LISENSOINTI_AVOIN_ID = 93;

	public static final String INFRA_CSV_FILENAME = "infra.csv";

	public static final String IMAGE_BASE_URL = "//avaa.tdata.fi/commonjs/images/tupa/";
	public static final String IPC_EVENT_DISPLAY_SERVICE_DETAILS = "displayServiceDetails";

	public static final String KEY_KAYTTOEHTO_KESKIARVO = "Label.Kayttoehto.Keskiarvo";
	
	public static final String ORGANISAATIO_MAA_FI = "FI";

	public static String getNominatimUrl(String city, String streetAddr) {
		if(StringTools.isEmptyOrNull(city)) {
			return null;
		}
		return "http://nominatim.openstreetmap.org/search?format=json&q=!" + (StringTools.isEmptyOrNull(streetAddr) ? Const.STRING_EMPTY : streetAddr + ",") + city + "!&addressdetails=0&limit=1";
	}

}
