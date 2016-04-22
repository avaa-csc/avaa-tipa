package fi.csc.avaa.tupa.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Map;

import org.junit.Test;

import fi.csc.avaa.liferay.service.model.ModelExtendError;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.common.DBTools;
import fi.csc.avaa.tupa.db.model.Infra;
import fi.csc.avaa.tupa.db.model.Palvelu;
import fi.csc.avaa.tupa.db.model.Palvelutyyppi;
import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;

public class ExtPalveluTest {
	@Mocked AvaaLogger logger;
	@Mocked DBTools dbTools;
	@Mocked Infra infra1;
	@Mocked Infra infra2;
	private final int palveluId = 1;

	@SuppressWarnings("serial")
	@Test
	public void extendShouldExtendPalvelu(@Mocked Palvelu palvelu, @Mocked Palvelutyyppi palvelutyyppi1, @Mocked Palvelutyyppi palvelutyyppi2) throws Exception {
		new Expectations() {{
			palvelu.getPalvelu_id(); result = palveluId;
			DBTools.getPalveluPalvelutyypit(palveluId);	result = new ArrayList<Palvelutyyppi>() {{ add(palvelutyyppi1);	add(palvelutyyppi2);}};
			DBTools.getPalveluInfrat(palveluId); result = new ArrayList<Infra>() {{add(infra1); add(infra2);}};
		}};
		ExtPalvelu extPalvelu = new ExtPalvelu();
		extPalvelu.extend(palvelu);
		assertTrue("Should extend correct Palvelu instance", extPalvelu.getPalvelu() == palvelu);
		assertEquals("Should have 2 infras", 2, extPalvelu.getInfrat().size());
		assertTrue("Should have infra1", extPalvelu.getInfrat().contains(infra1));
		assertTrue("Should have infra2", extPalvelu.getInfrat().contains(infra2));
		assertEquals("Should have correct number of Palvelutyyppi instances", 2, extPalvelu.getPalvelutyypit().size());
		assertTrue("Should have palvelutyyppi1", extPalvelu.getPalvelutyypit().contains(palvelutyyppi1));
		assertTrue("Should have palvelutyyppi2", extPalvelu.getPalvelutyypit().contains(palvelutyyppi2));
	}

	@Test(expected=ModelExtendError.class)
	public void extendShouldThrowExceptionIfNullPalveluPassed() throws Exception {
		new Expectations() {{
			logger.error(anyString);
		}};
		ExtPalvelu extPalvelu = new ExtPalvelu();
		extPalvelu.extend(null);
	}

	@Test(expected=ModelExtendError.class)
	public void extendShouldThrowExceptionIfReadingInfrasFails(@Mocked Palvelu palvelu) throws Exception {
		new Expectations() {{
			palvelu.getPalvelu_id(); result = palveluId;
			DBTools.getPalveluInfrat(palveluId); result = null;
		}};
		ExtPalvelu extPalvelu = new ExtPalvelu();
		extPalvelu.extend(palvelu);
	}

	@Test(expected=ModelExtendError.class)
	public void extendShouldThrowExceptionIfReadingPalvelutyypitFails(@Mocked Palvelu palvelu) throws Exception {
		new Expectations() {{
			palvelu.getPalvelu_id(); result = palveluId;
			DBTools.getPalveluPalvelutyypit(palveluId);	result = null;
		}};
		ExtPalvelu extPalvelu = new ExtPalvelu();
		extPalvelu.extend(palvelu);
	}

	@SuppressWarnings("serial")
	@Test
	public void getExtPalvelus(@Mocked Palvelu palvelu1, @Mocked Palvelu palvelu2) throws Exception {
		new Expectations() {{
			palvelu1.getPalvelu_id(); result = 1;
			palvelu2.getPalvelu_id(); result = 2;
		}};
		Map<Integer, ExtPalvelu> extPalvelus = ExtPalvelu.getExtPalvelus(new ArrayList<Palvelu>() {{ add(palvelu1); add(palvelu2); }});
		new Verifications() {{
			palvelu1.getPalvelu_id(); times = 2;
			palvelu2.getPalvelu_id(); times = 2;
		}};
		assertEquals("Should return 2 ExtPalvelu instances", 2, extPalvelus.size());
		assertTrue("ExtPalvelu created for palvelu id=1", extPalvelus.get(1) != null);
		assertTrue("ExtPalvelu created for palvelu id=2", extPalvelus.get(2) != null);
	}
	
	@Test
	public void getExtPalvelusExecutesBestEffort(@Mocked Palvelu palvelu1, @Mocked Palvelu palvelu2, @Mocked ModelExtendError error) throws Exception {
		ExtPalvelu anyInstance = new ExtPalvelu();
		new Expectations(ExtPalvelu.class) {{
			anyInstance.extend(palvelu1); result = error;
			anyInstance.extend(palvelu2);
			palvelu2.getPalvelu_id(); result = 2;
		}};
		@SuppressWarnings("serial")
		Map<Integer, ExtPalvelu> extPalvelus = ExtPalvelu.getExtPalvelus(new ArrayList<Palvelu>() {{ add(palvelu1); add(palvelu2); }});
		new Verifications() {{
			anyInstance.extend(palvelu1); times = 1;
			anyInstance.extend(palvelu2); times = 1;
			logger.error(anyString); times = 1;
		}};
		assertEquals("Should return one palvelu", 1, extPalvelus.size());
		assertTrue("ExtPalvelu not created for palvelu", extPalvelus.get((Integer)2) != null);
	}
}
