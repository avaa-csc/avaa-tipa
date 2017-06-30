package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot;
import fi.csc.avaa.tupa.db.model.Infra_YhteystiedotModel;
import fi.csc.avaa.tupa.db.model.impl.Infra_YhteystiedotImpl;
import fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.Infra_YhteystiedotLocalServiceBaseImpl;

import java.util.List;
import java.util.stream.Collectors;

import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;
import static com.liferay.portal.kernel.util.Validator.isNotNull;
import static fi.csc.avaa.tupa.common.TupaConst.PRIMARY_KEY_INFRA_ID;
import static fi.csc.avaa.tupa.common.TupaConst.PRIMARY_KEY_YHTEYSTIETO_ID;

/**
 * The implementation of the infra_ yhteystiedot local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author pj,jmlehtin
 * @see fi.csc.avaa.tupa.db.service.base.Infra_YhteystiedotLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalServiceUtil
 */
public class Infra_YhteystiedotLocalServiceImpl
    extends Infra_YhteystiedotLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalServiceUtil} to access the infra_ yhteystiedot local service.
     */
	
	private static final AvaaLogger log = new AvaaLogger(Infra_YhteystiedotLocalServiceImpl.class.getName());

	public int[] getContactsIdsByInfrastructureId(int infrastructureId) {
		if (infrastructureId == 0) return null;

		return getContactsIdsByInfrastructuresIds(new int[] {infrastructureId});
	}

	public int[] getContactsIdsByInfrastructuresIds(int[] infrastructuresIds) {
		if (isEmpty(infrastructuresIds)) return null;

		String key = PRIMARY_KEY_INFRA_ID;
				
		List<Infra_Yhteystiedot> result = getInfrastructureContactList(key, infrastructuresIds);

		return isNotNull(result) ? result.stream().mapToInt(Infra_YhteystiedotModel::getYhteystieto_id).toArray() : null;
	}

	public int[] getInfrastructuresIdsByContactsIds(int[] contactsIds) {
		if (isEmpty(contactsIds)) return null;

		String key = PRIMARY_KEY_YHTEYSTIETO_ID;

		List<Infra_Yhteystiedot> result = getInfrastructureContactList(key, contactsIds);

		return isNotNull(result) ? result.stream().mapToInt(Infra_YhteystiedotModel::getInfra_id).toArray() : null;
	}

	private List<Infra_Yhteystiedot> getInfrastructureContactList(String key, int[] ids){
		if(isEmpty(ids) || key == null) return null;

		DynamicQuery query = DynamicQueryFactoryUtil.forClass(
				Infra_YhteystiedotImpl.class, PortletClassLoaderUtil.getClassLoader());

		Criterion criterion = RestrictionsFactoryUtil.eq(key, ids[0]);

		for (int id = 1; id < ids.length; id++) {
			criterion = RestrictionsFactoryUtil.or(criterion, RestrictionsFactoryUtil.eq(key, ids[id]));
		}

		query.add(criterion);
		List<Infra_Yhteystiedot> result = null;

		try {
			result = Infra_YhteystiedotLocalServiceUtil.dynamicQuery(query);
		} catch (SystemException e) {
			log.error(e, e);
		}
		return isNotNull(result) ? result.stream().distinct().collect(Collectors.toList()) : null;
	}
}
