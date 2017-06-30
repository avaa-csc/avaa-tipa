package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.util.StringUtil;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.common.TupaConst;
import fi.csc.avaa.tupa.db.model.Avainsana;
import fi.csc.avaa.tupa.db.model.AvainsanaModel;
import fi.csc.avaa.tupa.db.model.Selite;
import fi.csc.avaa.tupa.db.model.SeliteModel;
import fi.csc.avaa.tupa.db.model.impl.AvainsanaImpl;
import fi.csc.avaa.tupa.db.service.AvainsanaLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.AvainsanaLocalServiceBaseImpl;
import fi.csc.avaa.tupa.db.service.persistence.AvainsanaUtil;

import java.util.List;
import java.util.stream.Collectors;

import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;
import static com.liferay.portal.kernel.util.ArrayUtil.isNotEmpty;
import static com.liferay.portal.kernel.util.Validator.isNotNull;
import static fi.csc.avaa.tupa.common.TupaConst.*;

/**
 * The implementation of the avainsana local service.
 * <p>
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.AvainsanaLocalService} interface.
 * <p>
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author pj, jmlehtin
 * @see fi.csc.avaa.tupa.db.service.base.AvainsanaLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.AvainsanaLocalServiceUtil
 */
public class AvainsanaLocalServiceImpl extends AvainsanaLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.AvainsanaLocalServiceUtil} to access the avainsana local service.
     */
	private static final AvaaLogger log = new AvaaLogger(AvainsanaLocalServiceImpl.class.getName());

	public int[] getKeywordsIdsByKeywords(String[] keywords) {
		if (isEmpty(keywords)) return null;

		String keywordFi = AVAINSANA;
		String keywordEn = KEYWORD;

		Criterion criterion = RestrictionsFactoryUtil.eq(keywordFi, keywords[0]);
		criterion = RestrictionsFactoryUtil.or(criterion, RestrictionsFactoryUtil.eq(keywordEn, keywords[0]));

		for (int id = 1; id < keywords.length; id++) {
			criterion = RestrictionsFactoryUtil.or(criterion, RestrictionsFactoryUtil.eq(keywordFi, keywords[id]));
			criterion = RestrictionsFactoryUtil.or(criterion, RestrictionsFactoryUtil.eq(keywordEn, keywords[id]));
		}

		List<Avainsana> result = getKeywordsList(criterion);

		return isNotNull(result) ? result.stream().mapToInt(AvainsanaModel::getAvainsana_id).toArray() : null;
	}

	private List<Avainsana> getKeywordsByKeywordsIds(int[] keywordsIds) {
		if (isEmpty(keywordsIds)) return null;

		String key = AVAINSANA_ID;

		Criterion criterion = RestrictionsFactoryUtil.eq(key, keywordsIds[0]);

		for (int id = 1; id < keywordsIds.length; id++) {
			criterion = RestrictionsFactoryUtil.or(criterion, RestrictionsFactoryUtil.eq(key, keywordsIds[id]));
		}

		return getKeywordsList(criterion);
	}

	public String[][] getKeywords() {

		String[] keywords_EN = null;
		String[] keywords_FI = null;

		List<Avainsana> result = null;

		try {
			result = AvainsanaUtil.findAll();
		} catch (SystemException e) {
			log.error(e, e);
		}

		if (isNotNull(result)) {
			keywords_EN = result.stream().map(AvainsanaModel::getKeyword).toArray(String[]::new);
			keywords_FI = result.stream().map(AvainsanaModel::getAvainsana).toArray(String[]::new);
		}

		return (isNotEmpty(keywords_EN) || isNotEmpty(keywords_FI)) ? new String[][]{keywords_EN, keywords_FI} : null;
	}

	private List<Avainsana> getKeywordsList(Criterion criterion) {
		if (criterion == null) return null;

		DynamicQuery query = DynamicQueryFactoryUtil.forClass(
				AvainsanaImpl.class, PortletClassLoaderUtil.getClassLoader());

		query.add(criterion);

		List<Avainsana> result = null;

		try {
			result = AvainsanaLocalServiceUtil.dynamicQuery(query);
		} catch (SystemException e) {
			log.error(e, e);
		}

		return isNotNull(result) ? result.stream().distinct().collect(Collectors.toList()) : null;
	}

	private String[] getEnglishKeywordsByKeywordsIds(List<Avainsana> keywordsList) {
		if (keywordsList == null || keywordsList.isEmpty()) return null;

		return isNotNull(keywordsList) ? keywordsList.stream().map(AvainsanaModel::getKeyword).map(Object::toString).toArray(String[]::new) : null;
	}

	private String[] getFinnishKeywordsByKeywordsIds(List<Avainsana> keywordsList) {
		if (keywordsList == null || keywordsList.isEmpty()) return null;

		return isNotNull(keywordsList) ? keywordsList.stream().map(AvainsanaModel::getAvainsana).map(Object::toString).toArray(String[]::new) : null;
	}

	public String[] getKeywords_ENbyInfrastructureId(int infrastructureId) {
		if (infrastructureId == 0) return null;

		return getEnglishKeywordsByKeywordsIds(getKeywordsByKeywordsIds(new int[]{infrastructureId}));
	}

	public String[] getKeywords_FIbyInfrastructureId(int infrastructureId) {
		if (infrastructureId == 0) return null;

		return getFinnishKeywordsByKeywordsIds(getKeywordsByKeywordsIds(new int[]{infrastructureId}));
	}
}
