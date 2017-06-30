package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.common.TupaConst;
import fi.csc.avaa.tupa.db.NoSuchSeliteException;
import fi.csc.avaa.tupa.db.model.Selite;
import fi.csc.avaa.tupa.db.model.SeliteModel;
import fi.csc.avaa.tupa.db.model.impl.SeliteImpl;
import fi.csc.avaa.tupa.db.service.SeliteLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.SeliteLocalServiceBaseImpl;
import fi.csc.avaa.tupa.db.service.persistence.SeliteUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;
import static com.liferay.portal.kernel.util.ArrayUtil.isNotEmpty;
import static com.liferay.portal.kernel.util.Validator.isNotNull;
import static fi.csc.avaa.tupa.common.TupaConst.*;
import static fi.csc.avaa.tupa.db.service.impl.SeliteLocalServiceImpl.DefinitionClassificator.LOCATIONTYPE;
import static fi.csc.avaa.tupa.db.service.impl.SeliteLocalServiceImpl.DefinitionClassificator.SERVICETYPE;

/**
 * The implementation of the selite local service.
 * <p>
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.SeliteLocalService} interface.
 * <p>
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author pj, jmlehtin
 * @see fi.csc.avaa.tupa.db.service.base.SeliteLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.SeliteLocalServiceUtil
 */
public class SeliteLocalServiceImpl extends SeliteLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.SeliteLocalServiceUtil} to access the selite local service.
     */

	private static final AvaaLogger log = new AvaaLogger(SeliteLocalServiceImpl.class.getName());

	public enum DefinitionClassificator {
		SERVICETYPE, LOCATIONTYPE, TERMS
	}

	public int[] getDefinitionsIdsByServiceTypes(String[] serviceTypes) {
		if (isEmpty(serviceTypes)) return null;

		return getDefinitionsIdsByClassificators(serviceTypes, SERVICETYPE);
	}

	public int[] getLocationTypesIdsByLocationTypes(String[] locationTypes) {
		if (isEmpty(locationTypes)) return null;

		//locationTypesIds in this case are the same as definitionsIds. for details please see the DB structure
		return getDefinitionsIdsByClassificators(locationTypes, LOCATIONTYPE);
	}
	
	public String[][] getLocationTypesByClassificator(){
		
		String classificator = DefinitionClassificator.SERVICETYPE.toString();

		return getTypesByClassificator(classificator);
	}

	public String[][] getServiceTypesByClassificator(){

		String classificator = DefinitionClassificator.LOCATIONTYPE.toString();
		
		return getTypesByClassificator(classificator);
	}
	
	private String[][] getTypesByClassificator(String classificator){
		if (classificator == null) return null;

		String[] types_EN = null;
		String[] types_FI = null;
		
		Criterion criterion = RestrictionsFactoryUtil.eq(TupaConst.CLASSIFICATOR, classificator);
		
		List<Selite> result = getDefinitionsList(criterion);

		if (isNotNull(result)) {
			types_EN = result.stream().distinct().map(SeliteModel::getName).toArray(String[]::new);
			types_FI = result.stream().distinct().map(SeliteModel::getNimi).toArray(String[]::new);
		}
		
		return (isNotEmpty(types_EN) || isNotEmpty(types_FI)) ? new String[][] {types_EN, types_FI} : null;
	}

	private int[] getDefinitionsIdsByClassificators(String[] classificators, DefinitionClassificator definitionClassificator) {
		if (isEmpty(classificators) || definitionClassificator == null) return null;

		String classificator = CLASSIFICATOR;
		String nameFi = NIMI;
		String nameEn = NAME;

		Criterion criterion = RestrictionsFactoryUtil.eq(classificator, definitionClassificator.toString());
		criterion = RestrictionsFactoryUtil.and(criterion, RestrictionsFactoryUtil.eq(nameFi, classificators[0]));
		criterion = RestrictionsFactoryUtil.or(criterion, RestrictionsFactoryUtil.eq(nameEn, classificators[0]));

		for (int id = 1; id < classificators.length; id++) {
			criterion = RestrictionsFactoryUtil.and(criterion, RestrictionsFactoryUtil.eq(nameFi, classificators[id]));
			criterion = RestrictionsFactoryUtil.or(criterion, RestrictionsFactoryUtil.eq(nameEn, classificators[id]));
		}

		List<Selite> result = getDefinitionsList(criterion);

		return isNotNull(result) ? result.stream().distinct().mapToInt(SeliteModel::getSelite_id).toArray() : null;
	}

	public String[] getTypesByDefinitionsIds(int[] definitionsIds) {
		if (isEmpty(definitionsIds)) return null;

		List<Selite> list = new ArrayList<>();

		Arrays.stream(definitionsIds)
				.filter(id -> id != 0)
				.distinct()
				.forEach(id -> {
					try {
						list.add(SeliteUtil.findByPrimaryKey(id));
					} catch (SystemException | NoSuchSeliteException e) {
						log.error(e, e);
					}
				});

		return isNotNull(list) ? list.stream().distinct().map(SeliteModel::getName).toArray(String[]::new) : null;
	}

	private List<Selite> getDefinitionsList(Criterion criterion) {
		if (criterion == null) return null;

		DynamicQuery query = DynamicQueryFactoryUtil.forClass(
				SeliteImpl.class, PortletClassLoaderUtil.getClassLoader());

		query.add(criterion);
		List<Selite> result = null;

		try {
			result = SeliteLocalServiceUtil.dynamicQuery(query);
		} catch (SystemException e) {
			log.error(e, e);
		}
		
		return isNotNull(result) ? result.stream().distinct().collect(Collectors.toList()) : null;
	}
}
