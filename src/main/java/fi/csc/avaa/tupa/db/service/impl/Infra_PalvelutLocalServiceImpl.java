package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.model.Infra_Palvelut;
import fi.csc.avaa.tupa.db.model.Infra_PalvelutModel;
import fi.csc.avaa.tupa.db.model.impl.Infra_PalvelutImpl;
import fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.Infra_PalvelutLocalServiceBaseImpl;

import java.util.List;
import java.util.stream.Collectors;

import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;
import static com.liferay.portal.kernel.util.Validator.isNotNull;
import static fi.csc.avaa.tupa.common.TupaConst.PRIMARY_KEY_INFRA_ID;
import static fi.csc.avaa.tupa.common.TupaConst.PRIMARY_KEY_PALVELU_ID;

/**
 * The implementation of the infra_ palvelut local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author pj,jmlehtin
 * @see fi.csc.avaa.tupa.db.service.base.Infra_PalvelutLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalServiceUtil
 */
public class Infra_PalvelutLocalServiceImpl
    extends Infra_PalvelutLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalServiceUtil} to access the infra_ palvelut local service.
     */

	private static final AvaaLogger log = new AvaaLogger(Infra_PalvelutLocalServiceImpl.class.getName());

	public int[] getServicesIdsByInfrastructureId(int infrastructureId) {
		if (infrastructureId == 0) return null;

		return getServicesIdsByInfrastructuresIds(new int[] {infrastructureId});
	}

	public int[] getServicesIdsByInfrastructuresIds(int[] infrastructuresIds) {
		if (isEmpty(infrastructuresIds)) return null;

		String key = PRIMARY_KEY_INFRA_ID;

		List<Infra_Palvelut> result = getInfrastructureServiceList(infrastructuresIds, key);

		return isNotNull(result) ? result.stream().mapToInt(Infra_PalvelutModel::getPalvelu_id).toArray() : null;
	}

	public int[] getInfrastructuresIdsByServicesIds(int[] servicesIds) {
		if (isEmpty(servicesIds)) return null;

		String key = PRIMARY_KEY_PALVELU_ID;

		List<Infra_Palvelut> result = getInfrastructureServiceList(servicesIds, key);

		return isNotNull(result) ? result.stream().mapToInt(Infra_PalvelutModel::getInfra_id).toArray() : null;
	}
	
	private List<Infra_Palvelut> getInfrastructureServiceList(int[] ids, String key) {
		if(isEmpty(ids) || key == null) return null;

		DynamicQuery query = DynamicQueryFactoryUtil.forClass(
				Infra_PalvelutImpl.class, PortletClassLoaderUtil.getClassLoader());

		Criterion criterion = RestrictionsFactoryUtil.eq(key, ids[0]);

		for (int id = 1; id < ids.length; id++) {
			criterion = RestrictionsFactoryUtil.or(criterion, RestrictionsFactoryUtil.eq(key, ids[id]));
		}

		query.add(criterion);
		List<Infra_Palvelut> result = null;

		try {
			result = Infra_PalvelutLocalServiceUtil.dynamicQuery(query);
		} catch (SystemException e) {
			log.error(e, e);
		}
		return isNotNull(result) ? result.stream().distinct().collect(Collectors.toList()) : null;
	}
}
