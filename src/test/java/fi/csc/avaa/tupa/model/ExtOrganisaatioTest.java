/**
 * 
 */
package fi.csc.avaa.tupa.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import fi.csc.avaa.liferay.service.model.ModelExtendError;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.common.DBTools;
import fi.csc.avaa.tupa.db.model.Organisaatio;
import mockit.Expectations;
import mockit.Mocked;

/**
 * @author jmlehtin
 *
 */
public class ExtOrganisaatioTest {

	@Mocked AvaaLogger log;
	@Mocked Organisaatio mockEmoOrg1;
	@Mocked Organisaatio mockEmoOrg2;
	@Mocked Organisaatio organisaatio;
	@Mocked DBTools dbTools;
	
	int mockNoEmoOrgId = 0;
	int mockEmoOrg1Id = 1;
	int mockEmoOrg2Id = 2;
	
	@Test
	public void extendShouldWork() throws ModelExtendError {
		new Expectations() {{
			organisaatio.getEmo_organisaatio(); result = mockEmoOrg1Id;
			mockEmoOrg1.getEmo_organisaatio(); result = mockEmoOrg2Id;
			mockEmoOrg2.getEmo_organisaatio(); result = mockNoEmoOrgId;
			DBTools.getOrganisaatio(mockEmoOrg1Id); result = mockEmoOrg1;
			DBTools.getOrganisaatio(mockEmoOrg2Id); result = mockEmoOrg2;
		}};
		ExtOrganisaatio extOrg = new ExtOrganisaatio();
		extOrg.extend(organisaatio);
		
		assertTrue("ExtOrganisaatio should have correct organisaatio object", extOrg.getOrganisaatio() == organisaatio);
		assertEquals("ExtOrganisaatio should have correct amount of emo-organisaatio object", 2, extOrg.getEmoOrganisaatiot().size());
	}
	
	@Test
	public void extendShouldNotSetEmoOrganisaatioIfOrganisaatioHasNoEmoOrganisaatio() throws Exception {
		new Expectations() {{
			organisaatio.getEmo_organisaatio(); result = 0;
		}};
		ExtOrganisaatio extOrg = new ExtOrganisaatio();
		extOrg.extend(organisaatio);
		assertTrue("ExtOrganisaatio should not have emo-organisaatios if organisaatio does not refer one in database", extOrg.getEmoOrganisaatiot().size() == 0);
	}
	
	@Test(expected=ModelExtendError.class)
	public void extendShouldThrowExceptionForNullOrganisaatioParameter() throws Exception {
		new Expectations() {{
			log.error(anyString); times = 1;
		}};
		ExtOrganisaatio extOrg = new ExtOrganisaatio();
		extOrg.extend(null);
	}

}
