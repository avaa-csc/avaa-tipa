/**
 * 
 */
package fi.csc.avaa.tupa.model;

import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import fi.csc.avaa.liferay.service.model.ModelExtendError;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.common.DBTools;
import fi.csc.avaa.tupa.db.model.Organisaatio;
import fi.csc.avaa.tupa.db.model.Yhteystieto;
import mockit.Expectations;
import mockit.Mocked;

/**
 * @author jmlehtin
 *
 */
public class ExtYhteystietoTest {

	@Mocked AvaaLogger log;
	@Mocked Organisaatio mockAffiliaatioOrg;
	@Mocked DBTools dbTools;
	
	int mockAffiliaatioOrgId = 1;
	int mockNoAffiliaatioOrgId = 0;
	
	@Test
	public void extendShouldWork(@Mocked Yhteystieto yhteystieto) throws ModelExtendError {
		new Expectations() {{
			yhteystieto.getAffiliaatio(); result = mockAffiliaatioOrgId;
			DBTools.getOrganisaatio(mockAffiliaatioOrgId); result = mockAffiliaatioOrg;
		}};
		ExtYhteystieto extYhteystieto = new ExtYhteystieto();
		extYhteystieto.extend(yhteystieto);
		
		assertTrue("ExtYhteystieto should have correct yhteystieto object", extYhteystieto.getYhteystieto() == yhteystieto);
		assertTrue("ExtYhteystieto should have correct affiliaatio-organisaatio object", extYhteystieto.getAffiliaatioOrganisaatio() == mockAffiliaatioOrg);
	}
	
	@Test
	public void extendShouldNotSetAffiliaatioOrganisaatioIfYhteystietoHasNoAffiliaatioOrganisaatio(@Mocked Yhteystieto yhteystieto) throws Exception {
		new Expectations() {{
			yhteystieto.getAffiliaatio(); result = mockNoAffiliaatioOrgId;
			DBTools.getOrganisaatio(mockNoAffiliaatioOrgId); result = null;
		}};
		ExtYhteystieto extYhteystieto = new ExtYhteystieto();
		extYhteystieto.extend(yhteystieto);
		assertTrue("ExtYhteystieto should not have affiliaatio-organisaatio if yhteystieto does not refer one in database", extYhteystieto.getAffiliaatioOrganisaatio() == null);
	}
	
	@Test(expected=ModelExtendError.class)
	public void extendShouldThrowExceptionForNullYhteystietoParameter() throws Exception {
		new Expectations() {{
			log.error(anyString); times = 1;
		}};
		ExtYhteystieto extYhteystieto = new ExtYhteystieto();
		extYhteystieto.extend(null);
	}

}
