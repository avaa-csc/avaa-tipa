package fi.csc.avaa.tupa.search;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.apache.xerces.dom.ASDOMImplementationImpl;
import org.junit.Test;

import fi.csc.avaa.tupa.common.PaikkatyyppiType;
import fi.csc.avaa.tupa.common.PalvelutyyppiType;
import fi.csc.avaa.tupa.db.model.Avainsana;
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

public class InfraSearchToolsTest {
	@Mocked ExtInfra extInfra1;
	@Mocked ExtInfra extInfra2;
	@Mocked ExtInfra extInfra3;
	@Mocked QueryBean queryBean;
	@Mocked ModelTools modelTools = null;
	@Mocked Kayttoehto kayttoehto1;
	@Mocked Kayttoehto kayttoehto2;
	@Mocked Kayttoehto kayttoehto3;	
	@SuppressWarnings("serial")
	@Test
	public void shouldCompareSearchStringAgainstAllSpecifiedInfraAttributes(@Mocked Avainsana avainsana1, @Mocked Avainsana avainsana2) {
		// Under construction still
		new Expectations() {{
			queryBean.getSearchStr(); result = "foo";
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
			queryBean.getLicensingOfResults(); result = 0;
			extInfra1.getInfra().getNimi(); result = "bar";
			extInfra1.getInfra().getName(); result = "bar";
			extInfra1.getInfra().getLyhenne(); result = "bar";
			extInfra1.getInfra().getAcronym(); result = "bar";
			extInfra1.getInfra().getKuvaus(); result = "bar";
			extInfra1.getInfra().getDescription(); result = "bar";
			extInfra1.getAvainsanat(); result = new ArrayList<Avainsana>() {{add(avainsana1); add(avainsana2);}};
			avainsana1.getAvainsana(); result = "bar";
			avainsana1.getKeyword(); result = "bar";
			avainsana2.getAvainsana(); result = "bar";
			avainsana2.getKeyword(); result = "bar";
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		infraSearchTools.queryData(arrayList, queryBean);
		new Verifications() {{
			queryBean.getStatus(); times = 1;
			queryBean.getInternationa(); times = 1;
			queryBean.getMaterialOrientedServiceType(); times = 1;
			queryBean.getHardwareOrientedServiceType(); times = 1;
			queryBean.getServiceOrientedServiceType(); times = 1;
			queryBean.getVirtualLocationType(); times = 1;
			queryBean.getDistributedLocationType(); times = 1;
			queryBean.getLocationBoundLocationType(); times = 1;
			queryBean.getAccessibility(); times = 1;
			queryBean.getAnonymity(); times = 1;
			queryBean.getChargeable(); times = 1;
			queryBean.getObligationToPublishResults(); times = 1;
			queryBean.getObligationToPublishOutput(); times = 1;
			queryBean.getOpennesOfExpertise(); times = 1;
			queryBean.getTrackingTools(); times = 1;
			queryBean.getLicensingOfResults(); times = 1;
			extInfra1.getInfra().getNimi(); times = 1;
			extInfra1.getInfra().getName(); times = 1;
			extInfra1.getInfra().getLyhenne(); times = 1;
			extInfra1.getInfra().getAcronym(); times = 1;
			extInfra1.getInfra().getKuvaus(); times = 1;
			extInfra1.getInfra().getDescription(); times = 1;
			extInfra1.getAvainsanat(); times = 1;
			avainsana1.getAvainsana(); times = 1;
			avainsana1.getKeyword(); times = 1;
			avainsana2.getAvainsana(); times = 1;
			avainsana2.getKeyword(); times = 1;
			queryBean.getSearchStr(); times = 2;
		}};
		assertEquals("No infra returned", 0, infraSearchTools.getSearchResults().size());
	}
	@Test
	public void shouldReturnActiveInfras() {
		new Expectations() {{
			queryBean.getStatus(); result = true;
			extInfra1.getInfra().getAktiivinen(); result = false;
			extInfra2.getInfra().getAktiivinen(); result = true;
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		arrayList.add(extInfra2);
		infraSearchTools.queryData(arrayList, queryBean);
		assertEquals("Should return one infra", 1, infraSearchTools.getSearchResults().size());
		assertEquals("Should return correct infra", extInfra2, infraSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnInternationalInfras(@Mocked Organisaatio org) {
		new Expectations() {{
			queryBean.getStatus(); result = false;
			queryBean.getInternationa(); result = true;
			ModelTools.getIntlHostOrganisations(extInfra1); result = new ArrayList<Organisaatio>();
			ModelTools.getIntlHostOrganisations(extInfra2); result = new ArrayList<Organisaatio>() {{add(org);}};
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		arrayList.add(extInfra2);
		infraSearchTools.queryData(arrayList, queryBean);
		new Verifications() {{
			queryBean.getStatus(); times = 2;
			queryBean.getInternationa(); times = 2;
			ModelTools.getIntlHostOrganisations(extInfra1); times = 1;
			ModelTools.getIntlHostOrganisations(extInfra2); times = 1;
		}};
		assertEquals("Should return one infra", 1, infraSearchTools.getSearchResults().size());
		assertEquals("Should return correct infra", extInfra2, infraSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnInfraWithMaterialOrientedServiceType(@Mocked ExtPalvelu extPalvelu, @Mocked Palvelutyyppi palvelutyyppi) {
		new Expectations() {{
			queryBean.getMaterialOrientedServiceType(); result = true;
			extInfra1.getPalvelut(); result =  new ArrayList<ExtPalvelu>();
			extInfra2.getPalvelut(); result =  new ArrayList<ExtPalvelu>(){{add(extPalvelu);}};
			extPalvelu.getPalvelutyypit(); result = new ArrayList<Palvelutyyppi>(){{add(palvelutyyppi);}};
			palvelutyyppi.getTyyppi(); result = PalvelutyyppiType.MATERIAL.getCode();
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		arrayList.add(extInfra2);
		infraSearchTools.queryData(arrayList, queryBean);
		new Verifications() {{
			queryBean.getMaterialOrientedServiceType(); times = 2;
			extInfra1.getPalvelut(); times = 1;
			extInfra2.getPalvelut(); times = 1;
			extPalvelu.getPalvelutyypit(); times = 1;
			palvelutyyppi.getTyyppi(); times = 1;
		}};
		assertEquals("Should return one infra", 1, infraSearchTools.getSearchResults().size());
		assertEquals("Should return correct infra", extInfra2, infraSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnInfraWithHardwareOrientedServiceType(@Mocked ExtPalvelu extPalvelu, @Mocked Palvelutyyppi palvelutyyppi) {
		new Expectations() {{
			queryBean.getHardwareOrientedServiceType(); result = true;
			extInfra1.getPalvelut(); result =  new ArrayList<ExtPalvelu>();
			extInfra2.getPalvelut(); result =  new ArrayList<ExtPalvelu>(){{add(extPalvelu);}};
			extPalvelu.getPalvelutyypit(); result = new ArrayList<Palvelutyyppi>(){{add(palvelutyyppi);}};
			palvelutyyppi.getTyyppi(); result = PalvelutyyppiType.HARDWARE.getCode();
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		arrayList.add(extInfra2);
		infraSearchTools.queryData(arrayList, queryBean);
		new Verifications() {{
			queryBean.getHardwareOrientedServiceType(); times = 2;
			extInfra1.getPalvelut(); times = 1;
			extInfra2.getPalvelut(); times = 1;
			extPalvelu.getPalvelutyypit(); times = 1;
			palvelutyyppi.getTyyppi(); times = 1;
		}};
		assertEquals("Should return one infra", 1, infraSearchTools.getSearchResults().size());
		assertEquals("Should return correct infra", extInfra2, infraSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnInfraWithServiceOrientedServiceType(@Mocked ExtPalvelu extPalvelu, @Mocked Palvelutyyppi palvelutyyppi) {
		new Expectations() {{
			queryBean.getServiceOrientedServiceType(); result = true;
			extInfra1.getPalvelut(); result =  new ArrayList<ExtPalvelu>();
			extInfra2.getPalvelut(); result =  new ArrayList<ExtPalvelu>(){{add(extPalvelu);}};
			extPalvelu.getPalvelutyypit(); result = new ArrayList<Palvelutyyppi>(){{add(palvelutyyppi);}};
			palvelutyyppi.getTyyppi(); result = PalvelutyyppiType.SERVICE.getCode();
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		arrayList.add(extInfra2);
		infraSearchTools.queryData(arrayList, queryBean);
		new Verifications() {{
			queryBean.getServiceOrientedServiceType(); times = 2;
			extInfra1.getPalvelut(); times = 1;
			extInfra2.getPalvelut(); times = 1;
			extPalvelu.getPalvelutyypit(); times = 1;
			palvelutyyppi.getTyyppi(); times = 1;
		}};
		assertEquals("Should return one infra", 1, infraSearchTools.getSearchResults().size());
		assertEquals("Should return correct infra", extInfra2, infraSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnInfraWithVirtualLocationType(@Mocked ExtPalvelu extPalvelu, @Mocked Palvelu palvelu) {
		new Expectations() {{
			queryBean.getVirtualLocationType(); result = true;
			extInfra1.getPalvelut(); result =  new ArrayList<ExtPalvelu>();
			extInfra2.getPalvelut(); result =  new ArrayList<ExtPalvelu>(){{add(extPalvelu);}};
			extPalvelu.getPalvelu(); result = palvelu;
			palvelu.getPaikkatyyppi(); result = PaikkatyyppiType.VIRTUAL.getCode();
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		arrayList.add(extInfra2);
		infraSearchTools.queryData(arrayList, queryBean);
		new Verifications() {{
			queryBean.getVirtualLocationType(); times = 2;
			extInfra1.getPalvelut(); times = 1;
			extInfra2.getPalvelut(); times = 1;
			extPalvelu.getPalvelu(); times = 1;
			palvelu.getPaikkatyyppi(); times = 1;
		}};
		assertEquals("Should return one infra", 1, infraSearchTools.getSearchResults().size());
		assertEquals("Should return correct infra", extInfra2, infraSearchTools.getSearchResults().get(0));
	}


	@SuppressWarnings("serial")
	@Test
	public void shouldReturnInfraWithDistributedLocationType(@Mocked ExtPalvelu extPalvelu, @Mocked Palvelu palvelu) {
		new Expectations() {{
			queryBean.getDistributedLocationType(); result = true;
			extInfra1.getPalvelut(); result =  new ArrayList<ExtPalvelu>();
			extInfra2.getPalvelut(); result =  new ArrayList<ExtPalvelu>(){{add(extPalvelu);}};
			extPalvelu.getPalvelu(); result = palvelu;
			palvelu.getPaikkatyyppi(); result = PaikkatyyppiType.DISTRIBUTED.getCode();
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		arrayList.add(extInfra2);
		infraSearchTools.queryData(arrayList, queryBean);
		new Verifications() {{
			queryBean.getVirtualLocationType(); times = 2;
			extInfra1.getPalvelut(); times = 1;
			extInfra2.getPalvelut(); times = 1;
			extPalvelu.getPalvelu(); times = 1;
			palvelu.getPaikkatyyppi(); times = 1;
		}};
		assertEquals("Should return one infra", 1, infraSearchTools.getSearchResults().size());
		assertEquals("Should return correct infra", extInfra2, infraSearchTools.getSearchResults().get(0));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnInfraWithLocationBoundLocationType(@Mocked ExtPalvelu extPalvelu, @Mocked Palvelu palvelu) {
		new Expectations() {{
			queryBean.getLocationBoundLocationType(); result = true;
			extInfra1.getPalvelut(); result =  new ArrayList<ExtPalvelu>();
			extInfra2.getPalvelut(); result =  new ArrayList<ExtPalvelu>(){{add(extPalvelu);}};
			extPalvelu.getPalvelu(); result = palvelu;
			palvelu.getPaikkatyyppi(); result = PaikkatyyppiType.LOCATIONBOUND.getCode();
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		arrayList.add(extInfra2);
		infraSearchTools.queryData(arrayList, queryBean);
		new Verifications() {{
			queryBean.getVirtualLocationType(); times = 2;
			extInfra1.getPalvelut(); times = 1;
			extInfra2.getPalvelut(); times = 1;
			extPalvelu.getPalvelu(); times = 1;
			palvelu.getPaikkatyyppi(); times = 1;
		}};
		assertEquals("Should return one infra", 1, infraSearchTools.getSearchResults().size());
		assertEquals("Should return correct infra", extInfra2, infraSearchTools.getSearchResults().get(0));
	}

	@Test
	public void shouldReturnInfraWithSpecifiedAccessibility() {
		new Expectations() {{
			queryBean.getAccessibility(); result = 2;
			extInfra1.getKayttoehto(); result = kayttoehto1;
			kayttoehto1.getSaavutettavuus(); result = 1;
			extInfra2.getKayttoehto(); result = kayttoehto2;
			kayttoehto2.getSaavutettavuus(); result = 2;
			extInfra3.getKayttoehto(); result = kayttoehto3;
			kayttoehto3.getSaavutettavuus(); result = 3;
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		arrayList.add(extInfra2);
		arrayList.add(extInfra3);
		infraSearchTools.queryData(arrayList, queryBean);
		assertEquals("Should return two infras", 2, infraSearchTools.getSearchResults().size());
		assertTrue("Should return extInfra2", infraSearchTools.getSearchResults().contains(extInfra2));
		assertTrue("Should return extInfra3", infraSearchTools.getSearchResults().contains(extInfra3));
	}

	@Test
	public void shouldReturnInfraWithSpecifiedAnonymity() {
		new Expectations() {{
			queryBean.getAnonymity(); result = 2;
			extInfra1.getKayttoehto(); result = kayttoehto1;
			kayttoehto1.getAnonymiteetti(); result = 1;
			extInfra2.getKayttoehto(); result = kayttoehto2;
			kayttoehto2.getAnonymiteetti(); result = 2;
			extInfra3.getKayttoehto(); result = kayttoehto3;
			kayttoehto3.getAnonymiteetti(); result = 3;
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		arrayList.add(extInfra2);
		arrayList.add(extInfra3);
		infraSearchTools.queryData(arrayList, queryBean);
		assertEquals("Should return two infras", 2, infraSearchTools.getSearchResults().size());
		assertTrue("Should return extInfra2", infraSearchTools.getSearchResults().contains(extInfra2));
		assertTrue("Should return extInfra3", infraSearchTools.getSearchResults().contains(extInfra3));
	}

	@Test
	public void shouldReturnInfraWithSpecifiedChargeability() {
		new Expectations() {{
			queryBean.getChargeable(); result = 2;
			extInfra1.getKayttoehto(); result = kayttoehto1;
			kayttoehto1.getMaksullisuus(); result = 1;
			extInfra2.getKayttoehto(); result = kayttoehto2;
			kayttoehto2.getMaksullisuus(); result = 2;
			extInfra3.getKayttoehto(); result = kayttoehto3;
			kayttoehto3.getMaksullisuus(); result = 3;
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		arrayList.add(extInfra2);
		arrayList.add(extInfra3);
		infraSearchTools.queryData(arrayList, queryBean);
		assertEquals("Should return two infras", 2, infraSearchTools.getSearchResults().size());
		assertTrue("Should return extInfra2", infraSearchTools.getSearchResults().contains(extInfra2));
		assertTrue("Should return extInfra3", infraSearchTools.getSearchResults().contains(extInfra3));
	}

	@Test
	public void shouldReturnInfraWithSpecifiedObligationToPublishResults() {
		new Expectations() {{
			queryBean.getObligationToPublishResults(); result = 2;
			extInfra1.getKayttoehto(); result = kayttoehto1;
			kayttoehto1.getTulosten_julkaisuvelvoite(); result = 1;
			extInfra2.getKayttoehto(); result = kayttoehto2;
			kayttoehto2.getTulosten_julkaisuvelvoite(); result = 2;
			extInfra3.getKayttoehto(); result = kayttoehto3;
			kayttoehto3.getTulosten_julkaisuvelvoite(); result = 3;
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		arrayList.add(extInfra2);
		arrayList.add(extInfra3);
		infraSearchTools.queryData(arrayList, queryBean);
		assertEquals("Should return two infras", 2, infraSearchTools.getSearchResults().size());
		assertTrue("Should return extInfra2", infraSearchTools.getSearchResults().contains(extInfra2));
		assertTrue("Should return extInfra3", infraSearchTools.getSearchResults().contains(extInfra3));
	}

	@Test
	public void shouldReturnInfraWithSpecifiedObligationToPublishOutput() {
		new Expectations() {{
			queryBean.getObligationToPublishOutput(); result = 2;
			extInfra1.getKayttoehto(); result = kayttoehto1;
			kayttoehto1.getTuotoksien_julkaisuvelvoite(); result = 1;
			extInfra2.getKayttoehto(); result = kayttoehto2;
			kayttoehto2.getTuotoksien_julkaisuvelvoite(); result = 2;
			extInfra3.getKayttoehto(); result = kayttoehto3;
			kayttoehto3.getTuotoksien_julkaisuvelvoite(); result = 3;
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		arrayList.add(extInfra2);
		arrayList.add(extInfra3);
		infraSearchTools.queryData(arrayList, queryBean);
		assertEquals("Should return two infras", 2, infraSearchTools.getSearchResults().size());
		assertTrue("Should return extInfra2", infraSearchTools.getSearchResults().contains(extInfra2));
		assertTrue("Should return extInfra3", infraSearchTools.getSearchResults().contains(extInfra3));
	}

	@Test
	public void shouldReturnInfraWithSpecifiedOpennessOfExpertise() {
		new Expectations() {{
			queryBean.getOpennesOfExpertise(); result = 2;
			extInfra1.getKayttoehto(); result = kayttoehto1;
			kayttoehto1.getOsaamisen_avoimuus(); result = 1;
			extInfra2.getKayttoehto(); result = kayttoehto2;
			kayttoehto2.getOsaamisen_avoimuus(); result = 2;
			extInfra3.getKayttoehto(); result = kayttoehto3;
			kayttoehto3.getOsaamisen_avoimuus(); result = 3;
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		arrayList.add(extInfra2);
		arrayList.add(extInfra3);
		infraSearchTools.queryData(arrayList, queryBean);
		assertEquals("Should return two infras", 2, infraSearchTools.getSearchResults().size());
		assertTrue("Should return extInfra2", infraSearchTools.getSearchResults().contains(extInfra2));
		assertTrue("Should return extInfra3", infraSearchTools.getSearchResults().contains(extInfra3));
	}

	@Test
	public void shouldReturnInfraWithSpecifiedTrackTools() {
		new Expectations() {{
			queryBean.getTrackingTools(); result = 2;
			extInfra1.getKayttoehto(); result = kayttoehto1;
			kayttoehto1.getSeurantatyokalut(); result = 1;
			extInfra2.getKayttoehto(); result = kayttoehto2;
			kayttoehto2.getSeurantatyokalut(); result = 2;
			extInfra3.getKayttoehto(); result = kayttoehto3;
			kayttoehto3.getSeurantatyokalut(); result = 3;
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		arrayList.add(extInfra2);
		arrayList.add(extInfra3);
		infraSearchTools.queryData(arrayList, queryBean);
		assertEquals("Should return two infras", 2, infraSearchTools.getSearchResults().size());
		assertTrue("Should return extInfra2", infraSearchTools.getSearchResults().contains(extInfra2));
		assertTrue("Should return extInfra3", infraSearchTools.getSearchResults().contains(extInfra3));
	}

	@Test
	public void shouldReturnInfraWithSpecifiedLicencingOfReports() {
		new Expectations() {{
			queryBean.getLicensingOfResults(); result = 2;
			extInfra1.getKayttoehto(); result = kayttoehto1;
			kayttoehto1.getTulosten_lisensointi(); result = 1;
			extInfra2.getKayttoehto(); result = kayttoehto2;
			kayttoehto2.getTulosten_lisensointi(); result = 2;
			extInfra3.getKayttoehto(); result = kayttoehto3;
			kayttoehto3.getTulosten_lisensointi(); result = 3;
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		arrayList.add(extInfra2);
		arrayList.add(extInfra3);
		infraSearchTools.queryData(arrayList, queryBean);
		assertEquals("Should return two infras", 2, infraSearchTools.getSearchResults().size());
		assertTrue("Should return extInfra2", infraSearchTools.getSearchResults().contains(extInfra2));
		assertTrue("Should return extInfra3", infraSearchTools.getSearchResults().contains(extInfra3));
	}
	
	@SuppressWarnings("serial")
	@Test
	public void shouldReturnInfraWithWordInOrganisation(@Mocked ExtOrganisaatio extOrg1, @Mocked ExtOrganisaatio extOrg2, @Mocked Organisaatio org1, @Mocked Organisaatio org2) {
		new Expectations() {{
			queryBean.getSearchStr(); result = "foo";			
			extInfra1.getInfra().getNimi(); result = "bar";
			extInfra1.getInfra().getName(); result = "bar";
			extInfra1.getInfra().getLyhenne(); result = "bar";
			extInfra1.getInfra().getAcronym(); result = "bar";
			extInfra1.getInfra().getKuvaus(); result = "bar";
			extInfra1.getInfra().getDescription(); result = "bar";
			extInfra1.getVastuuOrganisaatiot(); result = new ArrayList<ExtOrganisaatio>(){{add(extOrg1); add(extOrg2);}};
			extOrg1.getOrganisaatio(); result = org1;
			extOrg2.getOrganisaatio(); result = org2;
			org1.getNimi(); result = "bar";
			org2.getNimi(); result = "FOO BAR";
			org1.getName(); result = "bar";
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		infraSearchTools.queryData(arrayList, queryBean);
		assertTrue("Should return extInfra1", infraSearchTools.getSearchResults().contains(extInfra1));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnInfraWithWordInKeywords(@Mocked Avainsana avainsana1, @Mocked Avainsana avainsana2) {
		new Expectations() {{
			queryBean.getSearchStr(); result = "foo";			
			extInfra1.getInfra().getNimi(); result = "bar";
			extInfra1.getInfra().getName(); result = "bar";
			extInfra1.getInfra().getLyhenne(); result = "bar";
			extInfra1.getInfra().getAcronym(); result = "bar";
			extInfra1.getInfra().getKuvaus(); result = "bar";
			extInfra1.getInfra().getDescription(); result = "bar";
			extInfra1.getAvainsanat(); result = new ArrayList<Avainsana>(){{add(avainsana1); add(avainsana2);}};
			avainsana1.getAvainsana(); result = "bar";
			avainsana1.getKeyword(); result = "bar";
			avainsana2.getAvainsana(); result = "bar";
			avainsana2.getKeyword(); result = "FOO";
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		infraSearchTools.queryData(arrayList, queryBean);
		assertTrue("Should return extInfra1", infraSearchTools.getSearchResults().contains(extInfra1));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnInfraIfWordPresentInAnyRelatedPalveluNimi(@Mocked ExtPalvelu extPalvelu1, @Mocked ExtPalvelu extpalvelu2) {
		new Expectations() {{
			queryBean.getSearchStr(); result = "foo";			
			extInfra1.getInfra().getNimi(); result = "bar";
			extInfra1.getInfra().getName(); result = "bar";
			extInfra1.getInfra().getLyhenne(); result = "bar";
			extInfra1.getInfra().getAcronym(); result = "bar";
			extInfra1.getInfra().getKuvaus(); result = "bar";
			extInfra1.getInfra().getDescription(); result = "bar";
			extInfra1.getPalvelut(); result = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extpalvelu2); }};
			extPalvelu1.getPalvelu().getNimi(); result = "bar";
			extPalvelu1.getPalvelu().getName(); result = "bar";
			extpalvelu2.getPalvelu().getNimi(); result = "bar";
			extpalvelu2.getPalvelu().getName(); result = "FOO"; // Bingo !!
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		infraSearchTools.queryData(arrayList, queryBean);
		assertTrue("Should return extInfra1", infraSearchTools.getSearchResults().contains(extInfra1));
	}

	@SuppressWarnings("serial")
	@Test
	public void shouldReturnInfraIfWordPresentInAnyRelatedPalveluKuvaus(@Mocked ExtPalvelu extPalvelu1, @Mocked ExtPalvelu extpalvelu2) {
		new Expectations() {{
			queryBean.getSearchStr(); result = "foo";			
			extInfra1.getInfra().getNimi(); result = "bar";
			extInfra1.getInfra().getName(); result = "bar";
			extInfra1.getInfra().getLyhenne(); result = "bar";
			extInfra1.getInfra().getAcronym(); result = "bar";
			extInfra1.getInfra().getKuvaus(); result = "bar";
			extInfra1.getInfra().getDescription(); result = "bar";
			extInfra1.getPalvelut(); result = new ArrayList<ExtPalvelu>(){{ add(extPalvelu1); add(extpalvelu2); }};
			extPalvelu1.getPalvelu().getNimi(); result = "bar";
			extPalvelu1.getPalvelu().getName(); result = "bar";
			extpalvelu2.getPalvelu().getNimi(); result = "bar";
			extpalvelu2.getPalvelu().getName(); result = "bar";
			extPalvelu1.getPalvelu().getKuvaus(); result = "bar";
			extPalvelu1.getPalvelu().getDescription(); result = "bar";
			extpalvelu2.getPalvelu().getKuvaus(); result = "bar";
			extpalvelu2.getPalvelu().getDescription(); result = "FOO"; // Bingo !!
		}};
		InfraSearchTools infraSearchTools = new InfraSearchTools();
		ArrayList<ExtInfra> arrayList = new ArrayList<>();
		arrayList.add(extInfra1);
		infraSearchTools.queryData(arrayList, queryBean);
		assertTrue("Should return extInfra1", infraSearchTools.getSearchResults().contains(extInfra1));
	}
}
