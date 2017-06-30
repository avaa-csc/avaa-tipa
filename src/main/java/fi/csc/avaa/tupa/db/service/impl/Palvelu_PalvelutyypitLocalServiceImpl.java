package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit;
import fi.csc.avaa.tupa.db.model.Palvelu_PalvelutyypitModel;
import fi.csc.avaa.tupa.db.model.impl.Palvelu_PalvelutyypitImpl;
import fi.csc.avaa.tupa.db.service.Palvelu_PalvelutyypitLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.Palvelu_PalvelutyypitLocalServiceBaseImpl;

import java.util.List;
import java.util.stream.Collectors;

import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;
import static com.liferay.portal.kernel.util.Validator.isNotNull;
import static fi.csc.avaa.tupa.common.TupaConst.PRIMARY_KEY_PALVELUTYYPPI_ID;
import static fi.csc.avaa.tupa.common.TupaConst.PRIMARY_KEY_PALVELU_ID;

/**
 * The implementation of the palvelu_ palvelutyypit local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.Palvelu_PalvelutyypitLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author pj,jmlehtin
 * @see fi.csc.avaa.tupa.db.service.base.Palvelu_PalvelutyypitLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.Palvelu_PalvelutyypitLocalServiceUtil
 */
public class Palvelu_PalvelutyypitLocalServiceImpl
    extends Palvelu_PalvelutyypitLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.Palvelu_PalvelutyypitLocalServiceUtil} to access the palvelu_ palvelutyypit local service.
     */
	
	private static final AvaaLogger log = new AvaaLogger(Palvelu_PalvelutyypitLocalServiceImpl.class.getName());

	public int[] getServiceTypesIdsByServiceId(int serviceId) {
		if (serviceId == 0) return null;

		return getServiceTypesIdsByServicesIds(new int[] {serviceId});
	}

	public int[] getServiceTypesIdsByServicesIds(int[] servicesIds) {
		if (isEmpty(servicesIds)) return null;

		String key = PRIMARY_KEY_PALVELU_ID;

		List<Palvelu_Palvelutyypit> result = getServiceServiceTypeList(servicesIds, key);

		return isNotNull(result) ? result.stream().mapToInt(Palvelu_PalvelutyypitModel::getPalvelutyyppi_id).toArray() : null;
	}

	public int[] getServicesIdsByServiceTypesIds(int[] serviceTypesIds) {
		if (isEmpty(serviceTypesIds)) return null;

		String key = PRIMARY_KEY_PALVELUTYYPPI_ID;

		List<Palvelu_Palvelutyypit> result = getServiceServiceTypeList(serviceTypesIds, key);

		return isNotNull(result) ? result.stream().mapToInt(Palvelu_PalvelutyypitModel::getPalvelu_id).toArray() : null;
	}

	private List<Palvelu_Palvelutyypit> getServiceServiceTypeList(int[] ids, String key) {
		if(isEmpty(ids) || key == null) return null;

		DynamicQuery query = DynamicQueryFactoryUtil.forClass(
				Palvelu_PalvelutyypitImpl.class, PortletClassLoaderUtil.getClassLoader());

		Criterion criterion = RestrictionsFactoryUtil.eq(key, ids[0]);

		for (int id = 1; id < ids.length; id++) {
			criterion = RestrictionsFactoryUtil.or(criterion, RestrictionsFactoryUtil.eq(key, ids[id]));
		}

		query.add(criterion);
		List<Palvelu_Palvelutyypit> result = null;

		try {
			result = Palvelu_PalvelutyypitLocalServiceUtil.dynamicQuery(query);
		} catch (SystemException e) {
			log.error(e, e);
		}
		return isNotNull(result) ? result.stream().distinct().collect(Collectors.toList()) : null;
	}
}
