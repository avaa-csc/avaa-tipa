package fi.csc.avaa.tupa.search;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import fi.csc.avaa.tupa.common.PaikkatyyppiType;
import fi.csc.avaa.tupa.common.PalvelutyyppiType;
import fi.csc.avaa.tupa.common.TupaDBCache;
import fi.csc.avaa.tupa.db.model.Avainsana;
import fi.csc.avaa.tupa.db.model.Infra;
import fi.csc.avaa.tupa.db.model.Kayttoehto;
import fi.csc.avaa.tupa.db.model.Organisaatio;
import fi.csc.avaa.tupa.db.model.Palvelu;
import fi.csc.avaa.tupa.db.model.Palvelutyyppi;
import fi.csc.avaa.tupa.model.ExtInfra;
import fi.csc.avaa.tupa.model.ExtOrganisaatio;
import fi.csc.avaa.tupa.model.ExtPalvelu;
import fi.csc.avaa.tupa.model.ModelTools;
import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;

public class PalveluSearchToolsTest {
	@Mocked QueryBean queryBean;
	@Mocked ExtPalvelu extPalvelu1;
	@Mocked ExtPalvelu extPalvelu2;
	@Mocked Infra infra1;
	@Mocked Infra infra2;
	@Mocked Palvelu palvelu1;
	@Mocked Palvelu palvelu2;
	@Mocked ExtInfra extInfra1;
	@Mocked ExtInfra extInfra2;
	@Mocked Avainsana avainsana1;
	@Mocked Avainsana avainsana2;
	@Mocked ExtOrganisaatio extOrg1;
	@Mocked ExtOrganisaatio extOrg2;
	@Mocked TupaDBCache tupaDBCache = null;
	@Mocked ModelTools modelTools = null;
	@Mocked Organisaatio organisaatio;
	@Mocked Palvelutyyppi palvelutyyppi1;
	@Mocked Palvelutyyppi palvelutyyppi2;
	@Mocked Kayttoehto kayttoehto1;
	@Mocked Kayttoehto kayttoehto2;
	
	@SuppressWarnings("serial")
	@Test
	public void shouldCompareSearchStringAgainstAllSpecifiedPalveluAttributes() throws Exception {
		// Under construction still
		new Expectations() {{
			queryBean.getSearchStr(); result = "foo";
			extPalvelu1.getPalvelu().getNimi(); result = "bar";
			extPalvelu1.getPalvelu().getName(); result = "bar";
			extPalvelu1.getPalvelu().getKuvaus(); result = "bar";
			extPalvelu1.getPalvelu().getDescription(); result = "bar";
			extPalvelu1.getPalvelu().getKaupunki(); result = "bar";
			extPalvelu1.getInfrat(); result = new ArrayList<Infra>() {{ add(infra1); add(infra2); }};
			queryBean.getStatus(); result = false;
			queryBean.getInternationa(); result = false;
			queryBean.getMaterialOrientedServiceType(); result = false;
			queryBean.getHardwareOrientedServiceType(); result = false;
			queryBean.getServiceOrientedServiceType(); result = false;
			queryBean.getVirtualLocationType(); result = false;
			queryBean.getDistributedLocationType(); result = false;
			queryBean.getLocationBoundLocationType(); result = false;
			infra1.getNimi(); result = "bar";
			infra1.getName(); result = "bar";
			infra2.getNimi(); result = "bar";
			infra2.getName(); result = "bar";
			infra1.getKuvaus(); result = "bar";
			infra1.getDescription(); result = "bar";
			infra2.getKuvaus(); result = "bar";
			infra2.getDescription(); result = "bar";
			extInfra1.getAvainsanat(); result = new ArrayList<Avainsana>() {{ add(avainsana1); add(avainsana2);}};
			avainsana1.getAvainsana(); result = "bar";
			avainsana2.getAvainsana(); result = "bar";
			avainsana1.getKeyword(); result = "bar";
			avainsana2.getKeyword(); result = "bar";
			extInfra1.getVastuuOrganisaatiot(); result = new ArrayList<ExtOrganisaatio>() {{ add(extOrg1); add(extOrg2); }};
			extOrg1.getOrganisaatio().getNimi(); result = "bar";
			extOrg1.getOrganisaatio().getName(); result = "bar";
			extOrg2.getOrganisaatio().getNimi(); result = "bar";
			extOrg2.getOrganisaatio().getName(); result = "bar";
			infra1.getInfra_id(); result = 1;
			infra2.getInfra_id(); result = 2;
			TupaDBCache.getInfraCache(); result = new HashMap<Integer, ExtInfra>() {{put(1, extInfra1); put(2, extInfra1); }};
		}};
		PalveluSearchTools palveluSearchTools = new PalveluSearchTools();
		ArrayList<ExtPalvelu> palveluList = new ArrayList<ExtPalvelu>(){{add(extPalvelu1);}};
		palveluSearchTools.queryData(palveluList, queryBean);
		new Verifications() {{
			queryBean.getSearchStr(); times = 2;
			queryBean.getStatus(); times = 1;
			queryBean.getInternationa(); times = 1;
			queryBean.getMaterialOrientedServiceType(); times = 1;
			queryBean.getHardwareOrientedServiceType(); times = 1;
			queryBean.getServiceOrientedServiceType(); times = 1;
			queryBean.getVirtualLocationType(); times = 1;
			queryBean.getDistributedLocationType(); times = 1;
			queryBean.getLocationBoundLocationType(); times = 1;
			extPalvelu1.getPalvelu().getNimi(); times = 1;
			extPalvelu1.getPalvelu().getName(); times = 1;
			extPalvelu1.getPalvelu().getKuvaus(); times = 1;
			extPalvelu1.getPalvelu().getDescription(); times = 1;
			extPalvelu1.getPalvelu().getKaupunki(); times = 1;
			extInfra1.getAvainsanat(); times = 2;
			avainsana1.getAvainsana(); times = 2;
			avainsana2.getAvainsana(); times = 2;
			avainsana1.getKeyword(); times = 2;
			avainsana2.getKeyword(); times = 2;
			extInfra1.getVastuuOrganisaatiot(); times = 2;
			extOrg1.getOrganisaatio().getNimi(); times = 4;
			extOrg1.getOrganisaatio().getName(); times = 4;	// why 4?
			extOrg2.getOrganisaatio().getNimi(); times = 4;
			extOrg2.getOrganisaatio().getName(); times = 4;	// why 4?
			infra1.getInfra_id(); times = 2;
			infra2.getInfra_id(); times = 2;
		}};
		assertEquals("No palvelu returned", 0, palveluSearchTools.getSearchResults().size());
	}
	
	@SuppressWarnings("serial")
	@Test
	public void shouldReturnPalveluForActiveInfraOnly() {
		new Expectations() {{
			queryBean.getSearchStr(); result = null;
			queryBean.getStatus(); result = true;
			extPalvelu1.getInfrat(); result = new ArrayList<Infra>() {{ add(infra1); }};
			extPalvelu2.getInfrat(); result = new ArrayList<Infra>() {{ add(infra1); add(infra2); }};
			infra1.getAktiivinen(); result = false;
			infra2.getAktiivinen(); result = true;
		}};
		PalveluSearchTools palveluSearchTools = new PalveluSearchTools();
		ArrayList<ExtPalvelu> palveluList = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extPalvelu2); }};
		palveluSearchTools.queryData(palveluList, queryBean);
		assertEquals("No palvelu returned", 1, palveluSearchTools.getSearchResults().size());
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnPalveluForInternationalInfraOnly() {
		new Expectations() {{
			queryBean.getSearchStr(); result = null;
			queryBean.getStatus(); result = false;
			queryBean.getInternationa(); result = true;
			extPalvelu1.getInfrat(); result = new ArrayList<Infra>() {{ add(infra1); }};
			extPalvelu2.getInfrat(); result = new ArrayList<Infra>() {{ add(infra2); }};
			infra1.getInfra_id(); result = 1;
			infra2.getInfra_id(); result = 2;
			TupaDBCache.getInfraCache(); result = new HashMap<Integer, ExtInfra>() {{ put(1, extInfra1); put(2, extInfra2); }};
			ModelTools.getIntlHostOrganisations(extInfra1); result = new ArrayList<Organisaatio>(){{ add(organisaatio); }};
			ModelTools.getIntlHostOrganisations(extInfra2); result = new ArrayList<Organisaatio>();
		}};
		PalveluSearchTools palveluSearchTools = new PalveluSearchTools();
		ArrayList<ExtPalvelu> palveluList = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extPalvelu2); }};
		palveluSearchTools.queryData(palveluList, queryBean);
		assertEquals("Should return 1 extPalvelu", 1, palveluSearchTools.getSearchResults().size());
		assertEquals("Should return extPalvelu1", extPalvelu1, palveluSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldPalveluHavingMaterialService() {
		new Expectations() {{
			queryBean.getSearchStr(); result = null;
			queryBean.getStatus(); result = false;
			queryBean.getInternationa(); result = false;
			queryBean.getMaterialOrientedServiceType(); result = true;
			extPalvelu1.getPalvelutyypit(); result = new ArrayList<Palvelutyyppi>() {{ add(palvelutyyppi1); }};
			extPalvelu2.getPalvelutyypit(); result = new ArrayList<Palvelutyyppi>() {{ add(palvelutyyppi2); }};
			palvelutyyppi1.getTyyppi(); result = PalvelutyyppiType.HARDWARE.getCode();
			palvelutyyppi2.getTyyppi(); result = PalvelutyyppiType.MATERIAL.getCode();
		}};
		PalveluSearchTools palveluSearchTools = new PalveluSearchTools();
		ArrayList<ExtPalvelu> palveluList = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extPalvelu2); }};
		palveluSearchTools.queryData(palveluList, queryBean);
		assertEquals("Should return 1 extPalvelu", 1, palveluSearchTools.getSearchResults().size());
		assertEquals("Should return extPalvelu2", extPalvelu2, palveluSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnPalveluHavingHardwareService() {
		new Expectations() {{
			queryBean.getSearchStr(); result = null;
			queryBean.getStatus(); result = false;
			queryBean.getInternationa(); result = false;
			queryBean.getMaterialOrientedServiceType(); result = false;
			queryBean.getHardwareOrientedServiceType(); result = true;
			extPalvelu1.getPalvelutyypit(); result = new ArrayList<Palvelutyyppi>() {{ add(palvelutyyppi1); }};
			extPalvelu2.getPalvelutyypit(); result = new ArrayList<Palvelutyyppi>() {{ add(palvelutyyppi2); }};
			palvelutyyppi1.getTyyppi(); result = PalvelutyyppiType.HARDWARE.getCode();
			palvelutyyppi2.getTyyppi(); result = PalvelutyyppiType.MATERIAL.getCode();
		}};
		PalveluSearchTools palveluSearchTools = new PalveluSearchTools();
		ArrayList<ExtPalvelu> palveluList = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extPalvelu2); }};
		palveluSearchTools.queryData(palveluList, queryBean);
		assertEquals("Should return 1 extPalvelu", 1, palveluSearchTools.getSearchResults().size());
		assertEquals("Should return extPalvelu1", extPalvelu1, palveluSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnPalveluHavingServiceService() {
		new Expectations() {{
			queryBean.getSearchStr(); result = null;
			queryBean.getStatus(); result = false;
			queryBean.getInternationa(); result = false;
			queryBean.getMaterialOrientedServiceType(); result = false;
			queryBean.getHardwareOrientedServiceType(); result = false;
			queryBean.getServiceOrientedServiceType(); result = true;
			extPalvelu1.getPalvelutyypit(); result = new ArrayList<Palvelutyyppi>() {{ add(palvelutyyppi1); }};
			extPalvelu2.getPalvelutyypit(); result = new ArrayList<Palvelutyyppi>() {{ add(palvelutyyppi2); }};
			palvelutyyppi1.getTyyppi(); result = PalvelutyyppiType.SERVICE.getCode();
			palvelutyyppi2.getTyyppi(); result = PalvelutyyppiType.MATERIAL.getCode();
		}};
		PalveluSearchTools palveluSearchTools = new PalveluSearchTools();
		ArrayList<ExtPalvelu> palveluList = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extPalvelu2); }};
		palveluSearchTools.queryData(palveluList, queryBean);
		assertEquals("Should return 1 extPalvelu", 1, palveluSearchTools.getSearchResults().size());
		assertEquals("Should return extPalvelu1", extPalvelu1, palveluSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnPalveluHavingVirtualLocation() {
		new Expectations() {{
			queryBean.getSearchStr(); result = null;
			queryBean.getStatus(); result = false;
			queryBean.getInternationa(); result = false;
			queryBean.getMaterialOrientedServiceType(); result = false;
			queryBean.getHardwareOrientedServiceType(); result = false;
			queryBean.getServiceOrientedServiceType(); result = false;
			queryBean.getVirtualLocationType(); result = true;
			extPalvelu1.getPalvelu(); result = palvelu1;
			extPalvelu2.getPalvelu(); result = palvelu2;
			palvelu1.getPaikkatyyppi(); result = PaikkatyyppiType.LOCATIONBOUND.getCode();
			palvelu2.getPaikkatyyppi(); result = PaikkatyyppiType.VIRTUAL.getCode();
		}};
		PalveluSearchTools palveluSearchTools = new PalveluSearchTools();
		ArrayList<ExtPalvelu> palveluList = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extPalvelu2); }};
		palveluSearchTools.queryData(palveluList, queryBean);
		assertEquals("Should return 1 extPalvelu", 1, palveluSearchTools.getSearchResults().size());
		assertEquals("Should return extPalvelu1", extPalvelu2, palveluSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnPalveluHavingDistributedLocation() {
		new Expectations() {{
			queryBean.getSearchStr(); result = null;
			queryBean.getStatus(); result = false;
			queryBean.getInternationa(); result = false;
			queryBean.getMaterialOrientedServiceType(); result = false;
			queryBean.getHardwareOrientedServiceType(); result = false;
			queryBean.getServiceOrientedServiceType(); result = false;
			queryBean.getVirtualLocationType(); result = false;
			queryBean.getDistributedLocationType(); result = true;
			extPalvelu1.getPalvelu(); result = palvelu1;
			extPalvelu2.getPalvelu(); result = palvelu2;
			palvelu1.getPaikkatyyppi(); result = PaikkatyyppiType.LOCATIONBOUND.getCode();
			palvelu2.getPaikkatyyppi(); result = PaikkatyyppiType.DISTRIBUTED.getCode();
		}};
		PalveluSearchTools palveluSearchTools = new PalveluSearchTools();
		ArrayList<ExtPalvelu> palveluList = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extPalvelu2); }};
		palveluSearchTools.queryData(palveluList, queryBean);
		assertEquals("Should return 1 extPalvelu", 1, palveluSearchTools.getSearchResults().size());
		assertEquals("Should return extPalvelu1", extPalvelu2, palveluSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnPalveluHavingLocationBoundLocation() {
		new Expectations() {{
			queryBean.getSearchStr(); result = null;
			queryBean.getStatus(); result = false;
			queryBean.getInternationa(); result = false;
			queryBean.getMaterialOrientedServiceType(); result = false;
			queryBean.getHardwareOrientedServiceType(); result = false;
			queryBean.getServiceOrientedServiceType(); result = false;
			queryBean.getVirtualLocationType(); result = false;
			queryBean.getDistributedLocationType(); result = false;
			queryBean.getLocationBoundLocationType(); result = true;
			extPalvelu1.getPalvelu(); result = palvelu1;
			extPalvelu2.getPalvelu(); result = palvelu2;
			palvelu1.getPaikkatyyppi(); result = PaikkatyyppiType.VIRTUAL.getCode();
			palvelu2.getPaikkatyyppi(); result = PaikkatyyppiType.LOCATIONBOUND.getCode();
		}};
		PalveluSearchTools palveluSearchTools = new PalveluSearchTools();
		ArrayList<ExtPalvelu> palveluList = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extPalvelu2); }};
		palveluSearchTools.queryData(palveluList, queryBean);
		assertEquals("Should return 1 extPalvelu", 1, palveluSearchTools.getSearchResults().size());
		assertEquals("Should return extPalvelu1", extPalvelu2, palveluSearchTools.getSearchResults().get(0));
	}
	
	@SuppressWarnings("serial")
	@Test
	public void shouldReturnPalveluHavingAskedAccessibility() {
		new Expectations() {{
			queryBean.getSearchStr(); result = null;
			queryBean.getStatus(); result = false;
			queryBean.getInternationa(); result = false;
			queryBean.getMaterialOrientedServiceType(); result = false;
			queryBean.getHardwareOrientedServiceType(); result = false;
			queryBean.getServiceOrientedServiceType(); result = false;
			queryBean.getVirtualLocationType(); result = false;
			queryBean.getDistributedLocationType(); result = false;
			queryBean.getLocationBoundLocationType(); result = false;
			queryBean.getAccessibility(); result = 2;
			extPalvelu1.getInfrat(); result = new ArrayList<Infra>() {{ add(infra1); }};
			extPalvelu2.getInfrat(); result = new ArrayList<Infra>() {{ add(infra2); }};
			infra1.getInfra_id(); result = 1;
			infra2.getInfra_id(); result = 2;
			TupaDBCache.getInfraCache(); result = new HashMap<Integer, ExtInfra>() {{ put(1, extInfra1); put(2, extInfra2); }};
			extInfra1.getKayttoehto(); result = kayttoehto1;
			extInfra2.getKayttoehto(); result = kayttoehto2;
			kayttoehto1.getSaavutettavuus(); result = 1;
			kayttoehto2.getSaavutettavuus(); result = 2;
		}};
		PalveluSearchTools palveluSearchTools = new PalveluSearchTools();
		ArrayList<ExtPalvelu> palveluList = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extPalvelu2); }};
		palveluSearchTools.queryData(palveluList, queryBean);
		assertEquals("Should return 1 extPalvelu", 1, palveluSearchTools.getSearchResults().size());
		assertEquals("Should return extPalvelu1", extPalvelu2, palveluSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnPalveluHavingAskedAnonymity() {
		new Expectations() {{
			queryBean.getSearchStr(); result = null;
			queryBean.getStatus(); result = false;
			queryBean.getInternationa(); result = false;
			queryBean.getMaterialOrientedServiceType(); result = false;
			queryBean.getHardwareOrientedServiceType(); result = false;
			queryBean.getServiceOrientedServiceType(); result = false;
			queryBean.getVirtualLocationType(); result = false;
			queryBean.getDistributedLocationType(); result = false;
			queryBean.getLocationBoundLocationType(); result = false;
			queryBean.getAccessibility(); result = 0;
			queryBean.getAnonymity(); result = 2;
			extPalvelu1.getInfrat(); result = new ArrayList<Infra>() {{ add(infra1); }};
			extPalvelu2.getInfrat(); result = new ArrayList<Infra>() {{ add(infra2); }};
			infra1.getInfra_id(); result = 1;
			infra2.getInfra_id(); result = 2;
			TupaDBCache.getInfraCache(); result = new HashMap<Integer, ExtInfra>() {{ put(1, extInfra1); put(2, extInfra2); }};
			extInfra1.getKayttoehto(); result = kayttoehto1;
			extInfra2.getKayttoehto(); result = kayttoehto2;
			kayttoehto1.getAnonymiteetti(); result = 1;
			kayttoehto2.getAnonymiteetti(); result = 2;
		}};
		PalveluSearchTools palveluSearchTools = new PalveluSearchTools();
		ArrayList<ExtPalvelu> palveluList = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extPalvelu2); }};
		palveluSearchTools.queryData(palveluList, queryBean);
		assertEquals("Should return 1 extPalvelu", 1, palveluSearchTools.getSearchResults().size());
		assertEquals("Should return extPalvelu1", extPalvelu2, palveluSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnPalveluHavingAskedChargeability() {
		new Expectations() {{
			queryBean.getSearchStr(); result = null;
			queryBean.getStatus(); result = false;
			queryBean.getInternationa(); result = false;
			queryBean.getMaterialOrientedServiceType(); result = false;
			queryBean.getHardwareOrientedServiceType(); result = false;
			queryBean.getServiceOrientedServiceType(); result = false;
			queryBean.getVirtualLocationType(); result = false;
			queryBean.getDistributedLocationType(); result = false;
			queryBean.getLocationBoundLocationType(); result = false;
			queryBean.getAccessibility(); result = 0;
			queryBean.getAnonymity(); result = 0;
			queryBean.getChargeable(); result = 2;
			extPalvelu1.getInfrat(); result = new ArrayList<Infra>() {{ add(infra1); }};
			extPalvelu2.getInfrat(); result = new ArrayList<Infra>() {{ add(infra2); }};
			infra1.getInfra_id(); result = 1;
			infra2.getInfra_id(); result = 2;
			TupaDBCache.getInfraCache(); result = new HashMap<Integer, ExtInfra>() {{ put(1, extInfra1); put(2, extInfra2); }};
			extInfra1.getKayttoehto(); result = kayttoehto1;
			extInfra2.getKayttoehto(); result = kayttoehto2;
			kayttoehto1.getMaksullisuus(); result = 1;
			kayttoehto2.getMaksullisuus(); result = 2;
		}};
		PalveluSearchTools palveluSearchTools = new PalveluSearchTools();
		ArrayList<ExtPalvelu> palveluList = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extPalvelu2); }};
		palveluSearchTools.queryData(palveluList, queryBean);
		assertEquals("Should return 1 extPalvelu", 1, palveluSearchTools.getSearchResults().size());
		assertEquals("Should return extPalvelu1", extPalvelu2, palveluSearchTools.getSearchResults().get(0));
	}
	
	@SuppressWarnings("serial")
	@Test
	public void shouldReturnPalveluHavingAskedObligationToPublishResults() {
		new Expectations() {{
			queryBean.getSearchStr(); result = null;
			queryBean.getStatus(); result = false;
			queryBean.getInternationa(); result = false;
			queryBean.getMaterialOrientedServiceType(); result = false;
			queryBean.getHardwareOrientedServiceType(); result = false;
			queryBean.getServiceOrientedServiceType(); result = false;
			queryBean.getVirtualLocationType(); result = false;
			queryBean.getDistributedLocationType(); result = false;
			queryBean.getLocationBoundLocationType(); result = false;
			queryBean.getAccessibility(); result = 0;
			queryBean.getAnonymity(); result = 0;
			queryBean.getChargeable(); result = 0;
			queryBean.getObligationToPublishResults(); result = 2;
			extPalvelu1.getInfrat(); result = new ArrayList<Infra>() {{ add(infra1); }};
			extPalvelu2.getInfrat(); result = new ArrayList<Infra>() {{ add(infra2); }};
			infra1.getInfra_id(); result = 1;
			infra2.getInfra_id(); result = 2;
			TupaDBCache.getInfraCache(); result = new HashMap<Integer, ExtInfra>() {{ put(1, extInfra1); put(2, extInfra2); }};
			extInfra1.getKayttoehto(); result = kayttoehto1;
			extInfra2.getKayttoehto(); result = kayttoehto2;
			kayttoehto1.getTulosten_julkaisuvelvoite(); result = 1;
			kayttoehto2.getTulosten_julkaisuvelvoite(); result = 2;
		}};
		PalveluSearchTools palveluSearchTools = new PalveluSearchTools();
		ArrayList<ExtPalvelu> palveluList = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extPalvelu2); }};
		palveluSearchTools.queryData(palveluList, queryBean);
		assertEquals("Should return 1 extPalvelu", 1, palveluSearchTools.getSearchResults().size());
		assertEquals("Should return extPalvelu1", extPalvelu2, palveluSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnPalveluHavingAskedObligationToPublishOutput() {
		new Expectations() {{
			queryBean.getSearchStr(); result = null;
			queryBean.getStatus(); result = false;
			queryBean.getInternationa(); result = false;
			queryBean.getMaterialOrientedServiceType(); result = false;
			queryBean.getHardwareOrientedServiceType(); result = false;
			queryBean.getServiceOrientedServiceType(); result = false;
			queryBean.getVirtualLocationType(); result = false;
			queryBean.getDistributedLocationType(); result = false;
			queryBean.getLocationBoundLocationType(); result = false;
			queryBean.getAccessibility(); result = 0;
			queryBean.getAnonymity(); result = 0;
			queryBean.getChargeable(); result = 0;
			queryBean.getObligationToPublishResults(); result = 0;
			queryBean.getObligationToPublishOutput(); result = 2;
			extPalvelu1.getInfrat(); result = new ArrayList<Infra>() {{ add(infra1); }};
			extPalvelu2.getInfrat(); result = new ArrayList<Infra>() {{ add(infra2); }};
			infra1.getInfra_id(); result = 1;
			infra2.getInfra_id(); result = 2;
			TupaDBCache.getInfraCache(); result = new HashMap<Integer, ExtInfra>() {{ put(1, extInfra1); put(2, extInfra2); }};
			extInfra1.getKayttoehto(); result = kayttoehto1;
			extInfra2.getKayttoehto(); result = kayttoehto2;
			kayttoehto1.getTuotoksien_julkaisuvelvoite(); result = 1;
			kayttoehto2.getTuotoksien_julkaisuvelvoite(); result = 2;
		}};
		PalveluSearchTools palveluSearchTools = new PalveluSearchTools();
		ArrayList<ExtPalvelu> palveluList = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extPalvelu2); }};
		palveluSearchTools.queryData(palveluList, queryBean);
		assertEquals("Should return 1 extPalvelu", 1, palveluSearchTools.getSearchResults().size());
		assertEquals("Should return extPalvelu1", extPalvelu2, palveluSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnPalveluHavingAskedExpertise() {
		new Expectations() {{
			queryBean.getSearchStr(); result = null;
			queryBean.getStatus(); result = false;
			queryBean.getInternationa(); result = false;
			queryBean.getMaterialOrientedServiceType(); result = false;
			queryBean.getHardwareOrientedServiceType(); result = false;
			queryBean.getServiceOrientedServiceType(); result = false;
			queryBean.getVirtualLocationType(); result = false;
			queryBean.getDistributedLocationType(); result = false;
			queryBean.getLocationBoundLocationType(); result = false;
			queryBean.getAccessibility(); result = 0;
			queryBean.getAnonymity(); result = 0;
			queryBean.getChargeable(); result = 0;
			queryBean.getObligationToPublishResults(); result = 0;
			queryBean.getObligationToPublishOutput(); result = 0;
			queryBean.getOpennesOfExpertise(); result = 2;
			extPalvelu1.getInfrat(); result = new ArrayList<Infra>() {{ add(infra1); }};
			extPalvelu2.getInfrat(); result = new ArrayList<Infra>() {{ add(infra2); }};
			infra1.getInfra_id(); result = 1;
			infra2.getInfra_id(); result = 2;
			TupaDBCache.getInfraCache(); result = new HashMap<Integer, ExtInfra>() {{ put(1, extInfra1); put(2, extInfra2); }};
			extInfra1.getKayttoehto(); result = kayttoehto1;
			extInfra2.getKayttoehto(); result = kayttoehto2;
			kayttoehto1.getOsaamisen_avoimuus(); result = 1;
			kayttoehto2.getOsaamisen_avoimuus(); result = 2;
		}};
		PalveluSearchTools palveluSearchTools = new PalveluSearchTools();
		ArrayList<ExtPalvelu> palveluList = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extPalvelu2); }};
		palveluSearchTools.queryData(palveluList, queryBean);
		assertEquals("Should return 1 extPalvelu", 1, palveluSearchTools.getSearchResults().size());
		assertEquals("Should return extPalvelu1", extPalvelu2, palveluSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnPalveluHavingAskedTracking() {
		new Expectations() {{
			queryBean.getSearchStr(); result = null;
			queryBean.getStatus(); result = false;
			queryBean.getInternationa(); result = false;
			queryBean.getMaterialOrientedServiceType(); result = false;
			queryBean.getHardwareOrientedServiceType(); result = false;
			queryBean.getServiceOrientedServiceType(); result = false;
			queryBean.getVirtualLocationType(); result = false;
			queryBean.getDistributedLocationType(); result = false;
			queryBean.getLocationBoundLocationType(); result = false;
			queryBean.getAccessibility(); result = 0;
			queryBean.getAnonymity(); result = 0;
			queryBean.getChargeable(); result = 0;
			queryBean.getObligationToPublishResults(); result = 0;
			queryBean.getObligationToPublishOutput(); result = 0;
			queryBean.getOpennesOfExpertise(); result = 0;
			queryBean.getTrackingTools(); result = 2;
			extPalvelu1.getInfrat(); result = new ArrayList<Infra>() {{ add(infra1); }};
			extPalvelu2.getInfrat(); result = new ArrayList<Infra>() {{ add(infra2); }};
			infra1.getInfra_id(); result = 1;
			infra2.getInfra_id(); result = 2;
			TupaDBCache.getInfraCache(); result = new HashMap<Integer, ExtInfra>() {{ put(1, extInfra1); put(2, extInfra2); }};
			extInfra1.getKayttoehto(); result = kayttoehto1;
			extInfra2.getKayttoehto(); result = kayttoehto2;
			kayttoehto1.getSeurantatyokalut(); result = 1;
			kayttoehto2.getSeurantatyokalut(); result = 2;
		}};
		PalveluSearchTools palveluSearchTools = new PalveluSearchTools();
		ArrayList<ExtPalvelu> palveluList = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extPalvelu2); }};
		palveluSearchTools.queryData(palveluList, queryBean);
		assertEquals("Should return 1 extPalvelu", 1, palveluSearchTools.getSearchResults().size());
		assertEquals("Should return extPalvelu1", extPalvelu2, palveluSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnPalveluHavingAskedLicensing() {
		new Expectations() {{
			queryBean.getSearchStr(); result = null;
			queryBean.getStatus(); result = false;
			queryBean.getInternationa(); result = false;
			queryBean.getMaterialOrientedServiceType(); result = false;
			queryBean.getHardwareOrientedServiceType(); result = false;
			queryBean.getServiceOrientedServiceType(); result = false;
			queryBean.getVirtualLocationType(); result = false;
			queryBean.getDistributedLocationType(); result = false;
			queryBean.getLocationBoundLocationType(); result = false;
			queryBean.getAccessibility(); result = 0;
			queryBean.getAnonymity(); result = 0;
			queryBean.getChargeable(); result = 0;
			queryBean.getObligationToPublishResults(); result = 0;
			queryBean.getObligationToPublishOutput(); result = 0;
			queryBean.getOpennesOfExpertise(); result = 0;
			queryBean.getTrackingTools(); result = 0;
			queryBean.getLicensingOfResults(); result = 2;
			extPalvelu1.getInfrat(); result = new ArrayList<Infra>() {{ add(infra1); }};
			extPalvelu2.getInfrat(); result = new ArrayList<Infra>() {{ add(infra2); }};
			infra1.getInfra_id(); result = 1;
			infra2.getInfra_id(); result = 2;
			TupaDBCache.getInfraCache(); result = new HashMap<Integer, ExtInfra>() {{ put(1, extInfra1); put(2, extInfra2); }};
			extInfra1.getKayttoehto(); result = kayttoehto1;
			extInfra2.getKayttoehto(); result = kayttoehto2;
			kayttoehto1.getTulosten_lisensointi(); result = 1;
			kayttoehto2.getTulosten_lisensointi(); result = 2;
		}};
		PalveluSearchTools palveluSearchTools = new PalveluSearchTools();
		ArrayList<ExtPalvelu> palveluList = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extPalvelu2); }};
		palveluSearchTools.queryData(palveluList, queryBean);
		assertEquals("Should return 1 extPalvelu", 1, palveluSearchTools.getSearchResults().size());
		assertEquals("Should return extPalvelu1", extPalvelu2, palveluSearchTools.getSearchResults().get(0));
	}
}
