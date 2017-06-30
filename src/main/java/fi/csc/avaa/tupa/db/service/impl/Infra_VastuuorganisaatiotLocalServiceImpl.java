package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot;
import fi.csc.avaa.tupa.db.model.Infra_VastuuorganisaatiotModel;
import fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotImpl;
import fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.Infra_VastuuorganisaatiotLocalServiceBaseImpl;

import java.util.List;
import java.util.stream.Collectors;

import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;
import static com.liferay.portal.kernel.util.Validator.isNotNull;
import static fi.csc.avaa.tupa.common.TupaConst.PRIMARY_KEY_INFRA_ID;
import static fi.csc.avaa.tupa.common.TupaConst.PRIMARY_KEY_ORGANISAATIO_ID;

/**
 * The implementation of the infra_ vastuuorganisaatiot local service.
 * <p>
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalService} interface.
 * <p>
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author pj, jmlehtin
 * @see fi.csc.avaa.tupa.db.service.base.Infra_VastuuorganisaatiotLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil
 */
public class Infra_VastuuorganisaatiotLocalServiceImpl
		extends Infra_VastuuorganisaatiotLocalServiceBaseImpl {
	/*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil} to access the infra_ vastuuorganisaatiot local service.
     */

	private static final AvaaLogger log = new AvaaLogger(Infra_VastuuorganisaatiotLocalServiceImpl.class.getName());

	public int[] getOrganisationsIdsByInfrastructureId(int infrastructureId) {
		if (infrastructureId == 0) return null;

		return getOrganisationsIdsByInfrastructuresIds(new int[]{infrastructureId});
	}

	public int[] getOrganisationsIdsByInfrastructuresIds(int[] infrastructuresIds) {
		if (isEmpty(infrastructuresIds)) return null;

		String key = PRIMARY_KEY_INFRA_ID;

		List<Infra_Vastuuorganisaatiot> result = getInfrastructureOrganisationList(infrastructuresIds, key);

		return isNotNull(result) ? result.stream().mapToInt(Infra_VastuuorganisaatiotModel::getOrganisaatio_id).toArray() : null;
	}	

	public int[] getInfrastructuresIdsByOrganisationsIds(int[] organisationsIds) {
		if (isEmpty(organisationsIds)) return null;

		String key = PRIMARY_KEY_ORGANISAATIO_ID;

		List<Infra_Vastuuorganisaatiot> result = getInfrastructureOrganisationList(organisationsIds, key);

		return isNotNull(result) ? result.stream().mapToInt(Infra_VastuuorganisaatiotModel::getInfra_id).toArray() : null;
	}

	private List<Infra_Vastuuorganisaatiot> getInfrastructureOrganisationList(int[] ids, String key) {
		if(isEmpty(ids) || key == null) return null;

		DynamicQuery query = DynamicQueryFactoryUtil.forClass(
				Infra_VastuuorganisaatiotImpl.class, PortletClassLoaderUtil.getClassLoader());

		Criterion criterion = RestrictionsFactoryUtil.eq(key, ids[0]);

		for (int id = 1; id < ids.length; id++) {
			criterion = RestrictionsFactoryUtil.or(criterion, RestrictionsFactoryUtil.eq(key, ids[id]));
		}

		query.add(criterion);
		List<Infra_Vastuuorganisaatiot> result = null;

		try {
			result = Infra_VastuuorganisaatiotLocalServiceUtil.dynamicQuery(query);
		} catch (SystemException e) {
			log.error(e, e);
		}
		
		return isNotNull(result) ? result.stream().distinct().collect(Collectors.toList()) : null;
	}
}
