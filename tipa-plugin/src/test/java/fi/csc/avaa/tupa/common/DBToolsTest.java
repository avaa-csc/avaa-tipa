package fi.csc.avaa.tupa.common;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.vaadin.sass.internal.parser.function.QuoteUnquoteFunctionGenerator;

import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.model.Infra;
import fi.csc.avaa.tupa.db.model.Infra_Palvelut;
import fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot;
import fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot;
import fi.csc.avaa.tupa.db.model.Organisaatio;
import fi.csc.avaa.tupa.db.model.Palvelu;
import fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit;
import fi.csc.avaa.tupa.db.model.Palvelutyyppi;
import fi.csc.avaa.tupa.db.model.Selite;
import fi.csc.avaa.tupa.db.model.Yhteystieto;
import fi.csc.avaa.tupa.db.service.InfraLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.OrganisaatioLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.PalveluLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.Palvelu_PalvelutyypitLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.SeliteLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.YhteystietoLocalServiceUtil;
import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;

public class DBToolsTest {
	@Mocked AvaaLogger logger;
	@Mocked final InfraLocalServiceUtil unusedInfraLocalServiceUtil = null;
	@Mocked final Infra_PalvelutLocalServiceUtil unusedInfra_PalvelutLocalServiceUti = null;
	@Mocked final PalveluLocalServiceUtil unuPalveluLocalServiceUtil = null;
	@Mocked final Infra_VastuuorganisaatiotLocalServiceUtil unusedInfra_VastuuorganisaatiotLocalServiceUtil = null;
	@Mocked final OrganisaatioLocalServiceUtil unusedOrganisaatioLocalServiceUtil = null;
	@Mocked final Palvelu_PalvelutyypitLocalServiceUtil unusedPalvelu_PalvelutyypitLocalServiceUtil = null;
	@Mocked final PalvelutyyppiLocalServiceUtil unusedPalvelutyyppiLocalServiceUtil = null;
	@Mocked final Infra_YhteystiedotLocalServiceUtil unusedInfra_YhteystiedotLocalServiceUtil = null;
	@Mocked final YhteystietoLocalServiceUtil unusedYhteystietoLocalServiceUtil = null;
	@Mocked final SeliteLocalServiceUtil unusedSeliteLocalServiceUtil = null;
	@Mocked final Infra_PalvelutLocalServiceUtil unusedInfra_PalvelutLocalServiceUtil = null;
	
	@Test
	public void getInfrasShouldCallServiceLayerWithCorrectParametersAndReturnInfras(@Mocked Infra infra1, @Mocked Infra infra2) throws Exception {
		new Expectations() {{
			InfraLocalServiceUtil.getInfras(QueryUtil.ALL_POS, QueryUtil.ALL_POS); returns(infra1, infra2);
		}};
		List<Infra> allInfras = DBTools.getAllInfras();
		assertTrue("DBTools::getInfras() should return infra1", allInfras.contains(infra1));
		assertTrue("DBTools::getInfras() should return infra2", allInfras.contains(infra2));
	}

	@Test
	public void getInfrasShouldLogErrorAndReturnNullWhenExceptionThrown(@Mocked SystemException se) throws Exception {
		new Expectations() {{
			InfraLocalServiceUtil.getInfras(QueryUtil.ALL_POS, QueryUtil.ALL_POS); result = se;
		}};
		List<Infra> allInfras = DBTools.getAllInfras();
		new Verifications() {{
			logger.error(anyString); times = 1;
			se.printStackTrace(); times = 1;
		}};
		assertTrue("DBTools::getInfras() Should return null when querying infras from DB fails", allInfras == null);
	}
	
	@Test
	public void getInfraShouldReturnNullForNullInfraId() throws Exception {
		Infra infra = DBTools.getInfra(0);
		new Verifications() { {
			InfraLocalServiceUtil.getInfra(anyInt); times = 0;
		}};
		assertTrue("DBTools::getInfras() should return null for infra id=0", infra == null);
	}
	
	@Test
	public void getInfraShouldCallServiceLayerWithCorrectParametersAndReturnInfraObject(@Mocked Infra infra) throws Exception {
		int infraId = 1;
		new Expectations() {{
			InfraLocalServiceUtil.getInfra(1); returns(infra);
		}};
		assertTrue("DBTools::getInfras() should return correct infra object instance for intraId", DBTools.getInfra(infraId) == infra);
		new Verifications() { {
			InfraLocalServiceUtil.getInfra(infraId); times = 1;
		}};
	}

	@Test
	public void getInfraShouldLogErrorAndReturnNullWhenExceptionThrown(@Mocked PortalException pe) throws Exception {
		int infraId = 1;
		new Expectations() {{
			InfraLocalServiceUtil.getInfra(infraId); result = pe;
		}};
		Infra infra = DBTools.getInfra(infraId);
		new Verifications() {{
			logger.error(anyString);
			pe.printStackTrace();
		}};
		assertTrue("DBTools::getInfras() should return null when error occurs", infra == null);
	}
	
	@Test
	public void getInfraPalvelutShouldReturnNullForNullInfraId() throws Exception {
		List<Palvelu> infraPalvelut = DBTools.getInfraPalvelut(0);
		new Verifications() { {
			Infra_PalvelutLocalServiceUtil.getInfra_Palveluts(anyInt, anyInt); times = 0;
		}};
		assertTrue("DBTools::getInfraPalvelut() should return null for infraId=0", infraPalvelut == null);
	}
	
	@SuppressWarnings("serial")
	@Test
	public void getInfraPalvelutShouldReturnPalveluObjectInstancesForInfra(@Mocked Infra_Palvelut ip1, @Mocked Infra_Palvelut ip2, @Mocked Palvelu p1, @Mocked Palvelu p2) throws Exception {
		int infraId = 1;
		new Expectations() {{
			Infra_PalvelutLocalServiceUtil.getInfra_Palveluts(QueryUtil.ALL_POS, QueryUtil.ALL_POS); result = new ArrayList<Infra_Palvelut>() {{add(ip1); add(ip2);}};
			ip1.getInfra_id(); result = 1;
			ip2.getInfra_id(); result = 2;
			ip1.getPalvelu_id(); result = 1;
			PalveluLocalServiceUtil.getPalvelu(1); result = p1;
		}};
		List<Palvelu> infraPalvelut = DBTools.getInfraPalvelut(infraId);
		new Verifications() {{
			ip2.getPalvelu_id(); times = 0;
			PalveluLocalServiceUtil.getPalvelu(2); times = 0;
		}};
		assertEquals("DBTools::getInfraPalvelut() should return correct number of Palvelu instances", 1, infraPalvelut.size());
		assertTrue("DBTools::getInfraPalvelut() should return correct Palvelu instance",infraPalvelut.contains(p1));
	}

	@Test
	public void getInfraPalvelutShouldLogErrorAndReturnNullWhenExceptionThrown(@Mocked SystemException se) throws Exception {
		int infraId = 1;
		new Expectations() {{
			Infra_PalvelutLocalServiceUtil.getInfra_Palveluts(QueryUtil.ALL_POS, QueryUtil.ALL_POS); result = se;
		}};
		List<Palvelu> infraPalvelut = DBTools.getInfraPalvelut(infraId);
		new Verifications() {{
			logger.error(anyString); times = 1;
			se.printStackTrace(); times = 1;
		}};
		assertTrue("DBTools::getInfraPalvelut() should return null when error occurs", infraPalvelut == null);
	}
	
	@Test
	public void getInfraInfraVastuuOrganisaatiotShouldReturnNullForNullInfraId() throws Exception {
		List<Organisaatio> infraVastuuOrganisaatiot = DBTools.getInfraVastuuOrganisaatiot(0);
		new Verifications() {{
			Infra_VastuuorganisaatiotLocalServiceUtil.getInfra_Vastuuorganisaatiots(anyInt, anyInt); times = 0;
		}};
		assertTrue("DBTools:getInfraVastuuOrganisaatiot() should return null for infraId=0", infraVastuuOrganisaatiot == null);
	}
	
	@SuppressWarnings("serial")
	@Test
	public void getInfraVastuuOrganisaatiotShouldReturnPalveluObjectInstancesForInfra(@Mocked Infra_Vastuuorganisaatiot ivo1, @Mocked Infra_Vastuuorganisaatiot ivo2, @Mocked Organisaatio org1, @Mocked Organisaatio org2) throws Exception {
		int infraId = 1;
		new Expectations() {{
			Infra_VastuuorganisaatiotLocalServiceUtil.getInfra_Vastuuorganisaatiots(QueryUtil.ALL_POS, QueryUtil.ALL_POS); result = new ArrayList<Infra_Vastuuorganisaatiot>() {{add(ivo1); add(ivo2);}};
			ivo1.getInfra_id(); result = 1;
			ivo2.getInfra_id(); result = 2;
			ivo1.getOrganisaatio_id(); result = 1;
			OrganisaatioLocalServiceUtil.getOrganisaatio(1); result = org1;
		}};
		List<Organisaatio> infraVastuuOrganisaatiot = DBTools.getInfraVastuuOrganisaatiot(infraId);
		new Verifications() {{
			ivo2.getOrganisaatio_id(); times = 0;
			OrganisaatioLocalServiceUtil.getOrganisaatio(2); times = 0;
		}};
		assertEquals("DBTools:getInfraVastuuOrganisaatiot() should return correct number of Organisaatio object instances", 1, infraVastuuOrganisaatiot.size());
		assertTrue("DBTools.getInfraVastuuOrganisaatiot() should return Organisaatio object instances for infraId=1 only", infraVastuuOrganisaatiot.contains(org1));
	}

	@Test
	public void getInfraVastuuOrganisaatiotShouldLogErrorAndReturnNullWhenExceptionThrown(@Mocked SystemException se) throws Exception {
		int infraId = 1;
		new Expectations() {{
			Infra_VastuuorganisaatiotLocalServiceUtil.getInfra_Vastuuorganisaatiots(anyInt, anyInt); result = se;
		}};
		List<Organisaatio> infraVastuuOrganisaatiot = DBTools.getInfraVastuuOrganisaatiot(infraId);
		new Verifications() {{
			logger.error("Unable to fetch Infra's Organisaatio objects from database with infra_id: " + infraId);
			se.printStackTrace();
		}};
		assertTrue(infraVastuuOrganisaatiot == null);
	}

	@Test
	public void getPalvelutyypitShouldReturnNullForNullPalveluId() throws Exception {
		List<Palvelutyyppi> palveluPalvelutyypit = DBTools.getPalveluPalvelutyypit(0);
		new Verifications() {{
			Palvelu_PalvelutyypitLocalServiceUtil.getPalvelu_Palvelutyypits(anyInt, anyInt); times = 0;
		}};
		assertTrue("DBTools:getPalveluPalvelutyypit() should return null for palveluId=0", palveluPalvelutyypit == null);
	}
	
	@SuppressWarnings("serial")
	@Test
	public void getPalvelutyypitShouldReturnCorrectPalvelutyypitForPalveluId(@Mocked Palvelu_Palvelutyypit ppt1, @Mocked Palvelu_Palvelutyypit ppt2, @Mocked Palvelutyyppi pt1, @Mocked Palvelutyyppi pt2) throws Exception {
		int palveluId = 1;
		new Expectations() {{
			Palvelu_PalvelutyypitLocalServiceUtil.getPalvelu_Palvelutyypits(QueryUtil.ALL_POS, QueryUtil.ALL_POS); result = new ArrayList<Palvelu_Palvelutyypit>() {{add(ppt1); add(ppt2);}};
			ppt1.getPalvelu_id(); result = palveluId; times = 1;
			ppt2.getPalvelu_id(); result = 2; times = 1;
			ppt1.getPalvelutyyppi_id(); result = 1; times = 1;
			PalvelutyyppiLocalServiceUtil.getPalvelutyyppi(1); result = pt1; times = 1;
		}};
		List<Palvelutyyppi> palveluPalvelutyypit = DBTools.getPalveluPalvelutyypit(palveluId);
		new Verifications() {{
			ppt2.getPalvelutyyppi_id(); times = 0;
			PalvelutyyppiLocalServiceUtil.getPalvelutyyppi(2); times = 0;
		}};
		assertEquals("DBTools:getPalveluPalvelutyypit() should return correct number of Palvelutyyppi object instances", 1, palveluPalvelutyypit.size());
		assertTrue("DBTools:getPalveluPalvelutyypit() should return Palvelutyyppi object instances for palveluId=1 only", palveluPalvelutyypit.contains(pt1));
	}

	@Test
	public void getPalvelutyypitShouldLogErrorAndReturnNullWhenExceptionThrown(@Mocked SystemException se) throws Exception {
		int palveluId = 1;
		new Expectations() {{
			Palvelu_PalvelutyypitLocalServiceUtil.getPalvelu_Palvelutyypits(anyInt, anyInt); result = se;
		}};
		List<Palvelutyyppi> palveluPalvelutyypit = DBTools.getPalveluPalvelutyypit(palveluId);
		new Verifications() {{
			logger.error("Unable to fetch Palvelu's Palvelutyyppi objects from database with palvelu_id: " + palveluId);
			se.printStackTrace();
		}};
		assertTrue("DBTools:getPalveluPalvelutyypit() should return null when error occurs", palveluPalvelutyypit == null);
	}

	@Test
	public void getInfraYhteystiedotShouldReturnNullForNullInfraId() throws Exception {
		List<Yhteystieto> infraYhteystiedot = DBTools.getInfraYhteystiedot(0);
		new Verifications() {{
			Infra_YhteystiedotLocalServiceUtil.getInfra_Yhteystiedots(anyInt, anyInt); times = 0;
		}};
		assertTrue("DBTools:getInfraYhteystiedot() should return null for infraId=0", infraYhteystiedot == null);
	}
	
	@SuppressWarnings("serial")
	@Test
	public void getInfraYhteystiedotShouldReturnPalveluObjectInstancesForInfra(@Mocked Infra_Yhteystiedot iyt1, @Mocked Infra_Yhteystiedot iyt2, @Mocked Yhteystieto yt1, @Mocked Yhteystieto yt2) throws Exception {
		int infraId = 1;
		new Expectations() {{
			Infra_YhteystiedotLocalServiceUtil.getInfra_Yhteystiedots(QueryUtil.ALL_POS, QueryUtil.ALL_POS); result = new ArrayList<Infra_Yhteystiedot>() {{add(iyt1); add(iyt2);}};
			iyt1.getInfra_id(); result = infraId; times = 1;
			iyt2.getInfra_id(); result = 2; times = 1;
			iyt1.getYhteystieto_id(); result = 1; times = 1;
			YhteystietoLocalServiceUtil.getYhteystieto(1); result = yt1; times = 1;
		}};
		List<Yhteystieto> infraYhteystiedot = DBTools.getInfraYhteystiedot(infraId);
		new Verifications() {{
			iyt2.getYhteystieto_id(); times = 0;
			YhteystietoLocalServiceUtil.getYhteystieto(2); times = 0;
		}};
		assertEquals("DBTools:getInfraYhteystiedot() should return correct number of Yhteystieto object instances for infraid=" + infraId, 1, infraYhteystiedot.size());
		assertTrue("DBTools:getInfraYhteystiedot() should return Yhteystieto object instances for infraId=" + infraId + " only", infraYhteystiedot.contains(yt1));
	}

	@Test
	public void getInfraYhteystiedotShouldLogErrorAndReturnNullWhenExceptionThrown(@Mocked SystemException se) throws Exception {
		int infraId = 1;
		new Expectations() {{
			Infra_YhteystiedotLocalServiceUtil.getInfra_Yhteystiedots(anyInt, anyInt); result = se;
		}};
		List<Yhteystieto> infraYhteystiedot = DBTools.getInfraYhteystiedot(infraId);
		new Verifications() {{
			logger.error(anyString); times = 1;
			se.printStackTrace(); times = 1;
		}};
		assertTrue("DBTools:getInfraYhteystiedot() should return null when error occurs", infraYhteystiedot == null);
	}
	
	@SuppressWarnings("serial")
	@Test
	public void getSelitteetShouldReturnAllSelitteet(@Mocked Selite s1, @Mocked Selite s2) throws Exception {
		new Expectations() {{
			SeliteLocalServiceUtil.getSelites(QueryUtil.ALL_POS, QueryUtil.ALL_POS); result = new ArrayList<Selite>() {{add(s1); add(s2);}};
			s1.getSelite_id(); result = 1;
			s2.getSelite_id(); result = 2;
		}};
		Map<Integer, Selite> selitteet = DBTools.getSelitteet();
		assertEquals("DBTools:getSelitteet should return all Selite object intsnaces", 2, selitteet.size());
		assertTrue("DBTools:getSelitteet should return selite seliteId=1", selitteet.get(1).equals(s1));
		assertTrue("DBTools:getSelitteet should return selite seliteId=2",selitteet.get(2).equals(s2));
	}
	@Test
	public void getPalveluInfratShouldReturnAllInfrasForPalvelu(@Mocked Infra_Palvelut ip1, @Mocked Infra_Palvelut ip2, @Mocked Infra_Palvelut ip3, @Mocked Infra infra1, @Mocked Infra infra2) throws Exception {
		int palveluId = 1;
		new Expectations(DBTools.class) {{
			Infra_PalvelutLocalServiceUtil.getInfra_Palveluts(QueryUtil.ALL_POS, QueryUtil.ALL_POS); result = new ArrayList<Infra_Palvelut>() {{add(ip1); add(ip2); add(ip3);}};
			ip1.getPalvelu_id(); result = 1;
			ip2.getPalvelu_id(); result = 1;
			ip3.getPalvelu_id(); result = 2;
			ip1.getInfra_id(); result = 1;
			ip2.getInfra_id(); result = 2;
			DBTools.getInfra(1); result = infra1;
			DBTools.getInfra(2); result = infra2;
		}};
		List<Infra> palveluInfrat = DBTools.getPalveluInfrat(palveluId);
		new Verifications() {{
			DBTools.getInfra(1); times = 1;
			DBTools.getInfra(2); times = 1;
		}};
		assertEquals("Should return 2 infras", 2, palveluInfrat.size());
		assertTrue("Infra1 returned", palveluInfrat.contains(infra1));
		assertTrue("Infra2 returned", palveluInfrat.contains(infra2));
	}
}
