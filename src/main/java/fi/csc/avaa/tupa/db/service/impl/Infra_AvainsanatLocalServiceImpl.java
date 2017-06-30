package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.model.Infra_Avainsanat;
import fi.csc.avaa.tupa.db.model.Infra_AvainsanatModel;
import fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatImpl;
import fi.csc.avaa.tupa.db.service.Infra_AvainsanatLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.Infra_AvainsanatLocalServiceBaseImpl;

import java.util.List;
import java.util.stream.Collectors;

import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;
import static com.liferay.portal.kernel.util.Validator.isNotNull;
import static fi.csc.avaa.tupa.common.TupaConst.PRIMARY_KEY_AVAINSANA_ID;
import static fi.csc.avaa.tupa.common.TupaConst.PRIMARY_KEY_INFRA_ID;

/**
 * The implementation of the infra_ avainsanat local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.Infra_AvainsanatLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author pj,jmlehtin
 * @see fi.csc.avaa.tupa.db.service.base.Infra_AvainsanatLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.Infra_AvainsanatLocalServiceUtil
 */
public class Infra_AvainsanatLocalServiceImpl
    extends Infra_AvainsanatLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.Infra_AvainsanatLocalServiceUtil} to access the infra_ avainsanat local service.
     */
	
	private static final AvaaLogger log = new AvaaLogger(Infra_AvainsanatLocalServiceImpl.class.getName());

	public int[] getKeywordsIdsByInfrastructureId(int infrastructureId) {
		if (infrastructureId == 0) return null;

		return getKeywordsIdsByInfrastructuresIds(new int[] {infrastructureId});
	}

	public int[] getKeywordsIdsByInfrastructuresIds(int[] infrastructuresIds) {
		if (isEmpty(infrastructuresIds)) return null;

		String key = PRIMARY_KEY_INFRA_ID;

		List<Infra_Avainsanat> result = getInfrastructureKeywordList(infrastructuresIds, key);

		return isNotNull(result) ? result.stream().mapToInt(Infra_AvainsanatModel::getAvainsana_id).toArray() : null;
	}

	public int[] getInfrastructuresIdsByKeywordsIds(int[] keywordsIds) {
		if (isEmpty(keywordsIds)) return null;

		String key = PRIMARY_KEY_AVAINSANA_ID;

		List<Infra_Avainsanat> result = getInfrastructureKeywordList(keywordsIds, key);

		return isNotNull(result) ? result.stream().mapToInt(Infra_AvainsanatModel::getInfra_id).toArray() : null;
	}

	private List<Infra_Avainsanat> getInfrastructureKeywordList(int[] ids, String key) {
		if(isEmpty(ids) || key == null) return null;

		DynamicQuery query = DynamicQueryFactoryUtil.forClass(
				Infra_AvainsanatImpl.class, PortletClassLoaderUtil.getClassLoader());
		
		Criterion criterion = RestrictionsFactoryUtil.eq(key, ids[0]);

		for (int id = 1; id < ids.length; id++) {
			criterion = RestrictionsFactoryUtil.or(criterion, RestrictionsFactoryUtil.eq(key, ids[id]));
		}
		
		query.add(criterion);
		List<Infra_Avainsanat> result = null;

		try {
			result = Infra_AvainsanatLocalServiceUtil.dynamicQuery(query);
		} catch (SystemException e) {
			log.error(e, e);
		}
		return isNotNull(result) ? result.stream().distinct().collect(Collectors.toList()) : null;
	}
}
