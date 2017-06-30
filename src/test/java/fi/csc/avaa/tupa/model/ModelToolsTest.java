package fi.csc.avaa.tupa.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tools.vaadin.language.LanguageConst;
import fi.csc.avaa.tools.vaadin.language.Translator;
import fi.csc.avaa.tupa.common.SeliteType;
import fi.csc.avaa.tupa.common.TupaDBCache;
import fi.csc.avaa.tupa.db.model.Infra;
import fi.csc.avaa.tupa.db.model.Selite;
import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;

public class ModelToolsTest {
	@Mocked AvaaLogger logger;
	@Mocked final TupaDBCache tupaDBCacheUnused = null;
	
	@Test
	public void getExtInfrasShouldReturnEmptyMapForEmptyInput() throws Exception {
		Map<Integer, ExtInfra> extInfras = ExtInfra.getExtInfras(new ArrayList<Infra>());
		assertTrue("Should return 0 ExtInfra instances", extInfras.size() == 0);
	}

	@Test
	public void getExtInfrasReturnsNullIfNullParameterPassed() throws Exception {
		Map<Integer, ExtInfra> extInfras = ExtInfra.getExtInfras(null);
		assertTrue("Should return null for null input", extInfras == null);
	}

	@Test
	public void getSeliteNameShouldReturnNameInCorrectLanguage(@Mocked Map<Integer, Selite> seliteMapMock) throws Exception {
		new Expectations() {{
			TupaDBCache.selitteet = seliteMapMock;
			TupaDBCache.selitteet.get(1).getNimi(); result = "SeliteNimi";
			TupaDBCache.selitteet.get(1).getName(); result = "SeliteName";
		}};
		assertEquals("ModelTools:getSeliteName() should return name in finnish", "SeliteNimi", ModelTools.getSeliteName(1, new Translator(LanguageConst.LOCALE_FI)));
		assertEquals("ModelTools:getSeliteName() should return name in english", "SeliteName", ModelTools.getSeliteName(1, new Translator(LanguageConst.LOCALE_EN)));
		new Verifications() {{
			TupaDBCache.selitteet.get(1).getNimi(); times = 1;
			TupaDBCache.selitteet.get(1).getName(); times = 1;
		}};
	}

	@Test
	public void getSeliteNameShouldReturnNullForUnsupportedLocale() throws Exception {
		assertEquals("ModelTools:getSeliteName() should return null for swedish locale", null, ModelTools.getSeliteName(1, new Translator(LanguageConst.LOCALE_SE)));
	}

	@Test
	public void getSeliteDescriptionShouldReturnNameInCorrectLanguaga(@Mocked Map<Integer, Selite> seliteMapMock) throws Exception {
		new Expectations() {{
			TupaDBCache.selitteet = seliteMapMock;
			TupaDBCache.selitteet.get(1).getKuvaus(); result = "SeliteKuvaus";
			TupaDBCache.selitteet.get(1).getDescription(); result = "SeliteDescription";
		}};
		assertEquals("ModelTools:getSeliteDescription() should return name in finnish", "SeliteKuvaus", ModelTools.getSeliteDescription(1, new Translator(LanguageConst.LOCALE_FI)));
		assertEquals("ModelTools:getSeliteDescription() should return name in english", "SeliteDescription", ModelTools.getSeliteDescription(1, new Translator(LanguageConst.LOCALE_EN)));
		new Verifications() {{
			TupaDBCache.selitteet.get(1).getKuvaus(); times = 1;
			TupaDBCache.selitteet.get(1).getDescription(); times = 1;
		}};
	}

	@Test
	public void getSeliteDescriptionShouldReturnNullForUnsupportedLocale() throws Exception {
		assertEquals("ModelTools:getSeliteDescription() should return null for swedish locale", null, ModelTools.getSeliteDescription(1, new Translator(LanguageConst.LOCALE_SE)));
	}

	@Test
	public void getSeliteTypesShouldReturnNameInCorrectLanguage(@Mocked Map<Integer, Selite> seliteMapMock, @Mocked Selite selite) throws Exception {
		new Expectations() {{
			TupaDBCache.selitteet = seliteMapMock;
			TupaDBCache.selitteet.get(11); result = selite;
			TupaDBCache.selitteet.get(12); result = selite;
			TupaDBCache.selitteet.get(13); result = selite;
			TupaDBCache.selitteet.get(21); result = selite;
			TupaDBCache.selitteet.get(22); result = selite;
			TupaDBCache.selitteet.get(23); result = selite;
			TupaDBCache.selitteet.get(31); result = selite;
			TupaDBCache.selitteet.get(32); result = selite;
			TupaDBCache.selitteet.get(33); result = selite;
			TupaDBCache.selitteet.get(41); result = selite;
			TupaDBCache.selitteet.get(42); result = selite;
			TupaDBCache.selitteet.get(43); result = selite;
			TupaDBCache.selitteet.get(51); result = selite;
			TupaDBCache.selitteet.get(52); result = selite;
			TupaDBCache.selitteet.get(53); result = selite;
			TupaDBCache.selitteet.get(61); result = selite;
			TupaDBCache.selitteet.get(62); result = selite;
			TupaDBCache.selitteet.get(63); result = selite;
			TupaDBCache.selitteet.get(71); result = selite;
			TupaDBCache.selitteet.get(72); result = selite;
			TupaDBCache.selitteet.get(73); result = selite;
			TupaDBCache.selitteet.get(81); result = selite;
			TupaDBCache.selitteet.get(82); result = selite;
			TupaDBCache.selitteet.get(83); result = selite;
			TupaDBCache.selitteet.get(91); result = selite;
			TupaDBCache.selitteet.get(92); result = selite;
			TupaDBCache.selitteet.get(93); result = selite;
		}};
		assertSelite(ModelTools.getSeliteTypes(SeliteType.KAYTTOEHTO_ANONYMITEETTI), selite);
		assertSelite(ModelTools.getSeliteTypes(SeliteType.KAYTTOEHTO_MAKSULLISUUS), selite);
		assertSelite(ModelTools.getSeliteTypes(SeliteType.KAYTTOEHTO_OSAAMISEN_AVOIMUUS), selite);
		assertSelite(ModelTools.getSeliteTypes(SeliteType.KAYTTOEHTO_SAAVUTETTAVUUS), selite);
		assertSelite(ModelTools.getSeliteTypes(SeliteType.KAYTTOEHTO_SEURANTATYOKALUT), selite);
		assertSelite(ModelTools.getSeliteTypes(SeliteType.KAYTTOEHTO_TULOSTEN_JULKAISUVELVOITE), selite);
		assertSelite(ModelTools.getSeliteTypes(SeliteType.KAYTTOEHTO_TULOSTEN_LISENSOINTI), selite);
		assertSelite(ModelTools.getSeliteTypes(SeliteType.KAYTTOEHTO_TUOTOKSIEN_JULKAISUVELVOITE), selite);
		assertSelite(ModelTools.getSeliteTypes(SeliteType.PAIKKATYYPPI), selite);
		assertSelite(ModelTools.getSeliteTypes(SeliteType.PALVELUTYYPPI), selite);
	}

	private void assertSelite(List<Selite> seliteTypes, Selite selite) {
		assertEquals("Should return 3 Selite object instances", 3, seliteTypes.size());
		for (Selite sel : seliteTypes) {
			assertTrue("Should return correct Selite onject instance", sel == selite);
		}
	}
}
