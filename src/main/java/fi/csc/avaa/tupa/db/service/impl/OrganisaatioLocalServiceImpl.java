package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.model.Organisaatio;
import fi.csc.avaa.tupa.db.model.OrganisaatioModel;
import fi.csc.avaa.tupa.db.service.base.OrganisaatioLocalServiceBaseImpl;
import fi.csc.avaa.tupa.db.service.persistence.OrganisaatioUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;
import static com.liferay.portal.kernel.util.Validator.isNotNull;
import static fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalServiceUtil.getServicesIdsByInfrastructuresIds;
import static fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil.getInfrastructuresIdsByOrganisationsIds;
import static fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalServiceUtil.getContactsIdsByInfrastructuresIds;

/**
 * The implementation of the organisaatio local service.
 * <p>
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.OrganisaatioLocalService} interface.
 * <p>
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author pj, jmlehtin
 * @see fi.csc.avaa.tupa.db.service.base.OrganisaatioLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.OrganisaatioLocalServiceUtil
 */
public class OrganisaatioLocalServiceImpl
		extends OrganisaatioLocalServiceBaseImpl {
	/*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.OrganisaatioLocalServiceUtil} to access the organisaatio local service.
     */

	private static final AvaaLogger log = new AvaaLogger(OrganisaatioLocalServiceImpl.class.getName());

	public int[] getInfrastructuresIdsByOrganisationId(int organisationId) {
		if (organisationId == 0) return null;

		return getInfrastructuresIdsByOrganisationsIds(new int[] {organisationId});
	}

	public int[] getServicesIdsByOrganisationId(int organisationId) {
		if (organisationId == 0) return null;

		int[] infrastructureIds = getInfrastructuresIdsByOrganisationsIds(new int[] {organisationId});

		return getServicesIdsByInfrastructuresIds(infrastructureIds);
	}

	public int[] getContactsIdsByOrganisationId(int organisationId) {
		if (organisationId == 0) return null;

		int[] infrastructureIds = getInfrastructuresIdsByOrganisationsIds(new int[] {organisationId});

		return getContactsIdsByInfrastructuresIds(infrastructureIds);
	}
	
	public String[] getCountries(){
		
		List<Organisaatio> list = new ArrayList<>();

		try {
			list = OrganisaatioUtil.findAll();
		} catch (SystemException e) {
			log.error(e, e);
		}

		return isNotNull(list) ? list.stream().map(OrganisaatioModel::getMaa).distinct().toArray(String[]::new) : null;
	}

	public int[] getOrganisationsIdsByCountries(String[] countries) {
		if (isEmpty(countries)) return null;

		List<Organisaatio> list = new ArrayList<>();

		Arrays.stream(countries)
				.distinct()
				.forEach(country -> {
			try {
				list.addAll(OrganisaatioUtil.findBycountry(country));
			} catch (SystemException e) {
				log.error(e, e);
			}
		});

		return isNotNull(list) ? list.stream().distinct().mapToInt(OrganisaatioModel::getOrganisaatio_id).toArray() : null;
	}
}
