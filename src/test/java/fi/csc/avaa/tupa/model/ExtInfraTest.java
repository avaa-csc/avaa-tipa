package fi.csc.avaa.tupa.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Map;

import org.junit.Test;

import fi.csc.avaa.liferay.service.model.ModelExtendError;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.common.DBTools;
import fi.csc.avaa.tupa.db.model.Infra;
import fi.csc.avaa.tupa.db.model.Kayttoehto;
import fi.csc.avaa.tupa.db.model.Organisaatio;
import fi.csc.avaa.tupa.db.model.Palvelu;
import fi.csc.avaa.tupa.db.model.Yhteystieto;
import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;

public class ExtInfraTest {
	@Mocked AvaaLogger logger;
	@Mocked Infra infra;
	@Mocked Infra previousInfra;
	@Mocked final DBTools unusedDBTools = null;
	@Mocked Organisaatio organisaatio1;
	@Mocked Organisaatio organisaatio2;
	@Mocked ExtOrganisaatio extOrganisaatio;
	@Mocked Yhteystieto yhteystieto1;
	@Mocked Yhteystieto yhteystieto2;
	@Mocked ExtYhteystieto extYhteystieto;
	@Mocked Palvelu palvelu1;
	@Mocked Palvelu palvelu2;
	@Mocked ExtPalvelu extPalvelu;
	@Mocked Kayttoehto kayttoehto;
	
	int infraId = 1;
	int previousInfraId = 2;

	@SuppressWarnings("serial")
	@Test
	public void extendShouldWork() throws Exception {
		new Expectations() {{
			infra.getInfra_id(); result = infraId;
			infra.getEdellinen_infra(); result = previousInfraId;
			DBTools.getInfra(previousInfraId); result = previousInfra;
			DBTools.getInfraVastuuOrganisaatiot(infraId); result = new ArrayList<Organisaatio>() {{add(organisaatio1);add(organisaatio2);}};
			DBTools.getInfraYhteystiedot(infraId); result = new ArrayList<Yhteystieto>() {{add(yhteystieto1);add(yhteystieto2);}};
			DBTools.getInfraPalvelut(infraId); result = new ArrayList<Palvelu>(){{add(palvelu1);add(palvelu2);}};
			DBTools.getInfraKayttoehto(infraId); result = kayttoehto;
		}};
		ExtInfra extInfra = new ExtInfra();
		extInfra.extend(infra);
		new Verifications() {{
			extOrganisaatio.extend(organisaatio1); times = 1;
			extOrganisaatio.extend(organisaatio2); times = 1;
			extYhteystieto.extend(yhteystieto1); times = 1;
			extYhteystieto.extend(yhteystieto2); times = 1;
			extPalvelu.extend(palvelu1); times = 1;
			extPalvelu.extend(palvelu2); times = 1;
		}};
		assertTrue("ExtInfra should have correct infra object", extInfra.getInfra() == infra);
		assertTrue("ExtInfra should have correct previous infra object", extInfra.getEdellinenInfra() == previousInfra);
		assertEquals("ExtInfra should have correct number of organizations", 2, extInfra.getVastuuOrganisaatiot().size());
		assertEquals("ExtInfra should have correct number of Yhteystieto objects", 2, extInfra.getYhteystiedot().size());
		assertEquals("ExtInfra should have correct number of Palvelu objects", 2, extInfra.getPalvelut().size());
		assertTrue("ExtInfra should have correct Kayttoehto object", extInfra.getKayttoehto() == kayttoehto);
	}

	@Test(expected=ModelExtendError.class)
	public void extendShouldThrowExceptionIfReadingOrganizationFails() throws Exception {
		new Expectations() {{
			infra.getInfra_id(); result = infraId;
			infra.getEdellinen_infra(); result = previousInfraId;
			DBTools.getInfra(2); result = previousInfra;
			DBTools.getInfraVastuuOrganisaatiot(infraId); result = null;
			logger.error(anyString); times = 1;
		}};
		ExtInfra extInfra = new ExtInfra();
		extInfra.extend(infra);
	}

	@SuppressWarnings("serial")
	@Test(expected=ModelExtendError.class)
	public void extendShouldThrowExceptionIfOrganizationExtendFails() throws Exception {
		new Expectations() {{
			infra.getInfra_id(); result = infraId;
			infra.getEdellinen_infra(); result = previousInfraId;
			DBTools.getInfra(2); result = previousInfra;
			DBTools.getInfraVastuuOrganisaatiot(infraId); result = new ArrayList<Organisaatio>() {{add(organisaatio1);add(organisaatio2);}};
			extOrganisaatio.extend(organisaatio1); result = new ModelExtendError();
			logger.error(anyString); times = 1;
		}};
		ExtInfra extInfra = new ExtInfra();
		extInfra.extend(infra);
	}

	@SuppressWarnings("serial")
	@Test(expected=ModelExtendError.class)
	public void extendShouldThrowExceptionIfYhteystietoExtendFails() throws Exception {
		new Expectations() {{
			infra.getInfra_id(); result = infraId;
			infra.getEdellinen_infra(); result = previousInfraId;
			DBTools.getInfra(2); result = previousInfra;
			DBTools.getInfraVastuuOrganisaatiot(infraId); result = new ArrayList<Organisaatio>() {{add(organisaatio1);add(organisaatio2);}};
			DBTools.getInfraYhteystiedot(infraId); result = new ArrayList<Yhteystieto>() {{add(yhteystieto1);add(yhteystieto2);}};
			extYhteystieto.extend(yhteystieto1); result = new ModelExtendError();
			logger.error(anyString); times = 1;
		}};
		ExtInfra extInfra = new ExtInfra();
		extInfra.extend(infra);
	}

	@SuppressWarnings("serial")
	@Test(expected=ModelExtendError.class)
	public void extendShouldThrowExceptionIfPalveluExtendFails() throws Exception {
		new Expectations() {{
			infra.getInfra_id(); result = infraId;
			infra.getEdellinen_infra(); result = previousInfraId;
			DBTools.getInfra(previousInfraId); result = previousInfra;
			DBTools.getInfraVastuuOrganisaatiot(infraId); result = new ArrayList<Organisaatio>() {{add(organisaatio1);add(organisaatio2);}};
			DBTools.getInfraYhteystiedot(infraId); result = new ArrayList<Yhteystieto>() {{add(yhteystieto1);add(yhteystieto2);}};
			DBTools.getInfraPalvelut(infraId); result = new ArrayList<Palvelu>(){{add(palvelu1);add(palvelu2);}};
			extPalvelu.extend(palvelu1); result = new ModelExtendError();
			logger.error(anyString); times = 1;
		}};
		ExtInfra extInfra = new ExtInfra();
		extInfra.extend(infra);
	}

	@Test(expected=ModelExtendError.class)
	public void extendShouldThrowExceptionForNullInfraParameter() throws Exception {
		new Expectations() {{
			logger.error(anyString); times = 1;
		}};
		ExtInfra extInfra = new ExtInfra();
		extInfra.extend(null);
	}
	
	@SuppressWarnings("serial")
	@Test
	public void getExtInfras(@Mocked Infra infra1, @Mocked Infra infra2) throws Exception {
		new Expectations() {{
			infra1.getInfra_id(); result = 1;
			infra2.getInfra_id(); result = 2;
		}};
		Map<Integer, ExtInfra> extInfras = ExtInfra.getExtInfras(new ArrayList<Infra>() {{add(infra1);add(infra2);}});
		new Verifications() {{
			infra1.getInfra_id(); times = 2;
			infra2.getInfra_id(); times = 2;
		}};
		assertEquals("Should return 2 ExtInfra instances", 2, extInfras.size());
		assertTrue("ExtIntra created for intra id=1", extInfras.get(1) != null);
		assertTrue("ExtIntra created for intra id=2", extInfras.get(2) != null);
	}
	
	@Test
	public void getExtInfrasExecutesBestEffort(@Mocked Infra infra1, @Mocked Infra infra2, @Mocked ModelExtendError error) throws Exception {
		ExtInfra anyInstance = new ExtInfra();
		new Expectations(ExtInfra.class) {{
			anyInstance.extend(infra1); result = error;
			anyInstance.extend(infra2);
			infra2.getInfra_id(); result = 2;
		}};
		@SuppressWarnings("serial")
		Map<Integer, ExtInfra> extInfras = ExtInfra.getExtInfras(new ArrayList<Infra>() {{add(infra1);add(infra2);}});
		new Verifications() {{
			anyInstance.extend(infra1); times = 1;
			anyInstance.extend(infra2); times = 1;
			logger.error(anyString); times = 1;
		}};
		assertEquals("Should return one intra", 1, extInfras.size());
		assertTrue("ExtIntra not created for intra", extInfras.get((Integer)2) != null);
	}

}
