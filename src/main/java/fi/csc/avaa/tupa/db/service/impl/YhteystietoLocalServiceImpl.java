package fi.csc.avaa.tupa.db.service.impl;

import fi.csc.avaa.tupa.db.service.base.YhteystietoLocalServiceBaseImpl;

import static fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalServiceUtil.getServicesIdsByInfrastructuresIds;
import static fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil.getOrganisationsIdsByInfrastructuresIds;
import static fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalServiceUtil.getInfrastructuresIdsByContactsIds;

/**
 * The implementation of the yhteystieto local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.YhteystietoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author pj,jmlehtin
 * @see fi.csc.avaa.tupa.db.service.base.YhteystietoLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.YhteystietoLocalServiceUtil
 */
public class YhteystietoLocalServiceImpl extends YhteystietoLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.YhteystietoLocalServiceUtil} to access the yhteystieto local service.
     */

	public int[] getInfrastructuresIdsByContactId(int contactId){
		if (contactId == 0) return null;
		
		return getInfrastructuresIdsByContactsIds(new int[] {contactId});
	}

	public int[] getServicesIdsByContactId(int contactId){
		if (contactId == 0) return null;
		
		int[] infrastructureIds = getInfrastructuresIdsByContactsIds(new int[] {contactId});

		return getServicesIdsByInfrastructuresIds(infrastructureIds);
	}

	public int[] getOrganisationsIdsByContactId(int contactId){
		if (contactId == 0) return null;

		int[] infrastructureIds = getInfrastructuresIdsByContactsIds(new int[] {contactId});

		return getOrganisationsIdsByInfrastructuresIds(infrastructureIds);
	}
}
