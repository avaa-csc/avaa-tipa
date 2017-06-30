package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.util.Validator;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.NoSuchPalveluException;
import fi.csc.avaa.tupa.db.model.Palvelu;
import fi.csc.avaa.tupa.db.model.PalveluModel;
import fi.csc.avaa.tupa.db.model.impl.PalveluImpl;
import fi.csc.avaa.tupa.db.service.PalveluLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.PalveluLocalServiceBaseImpl;
import fi.csc.avaa.tupa.db.service.persistence.PalveluUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil.*;
import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;
import static fi.csc.avaa.tupa.common.TupaConst.*;
import static fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalServiceUtil.getInfrastructuresIdsByServicesIds;
import static fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil.getOrganisationsIdsByInfrastructuresIds;
import static fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalServiceUtil.getContactsIdsByInfrastructuresIds;
import static fi.csc.avaa.tupa.db.service.Palvelu_PalvelutyypitLocalServiceUtil.getServiceTypesIdsByServiceId;
import static fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalServiceUtil.getDefinitionsIdsByServiceTypesIds;
import static fi.csc.avaa.tupa.db.service.SeliteLocalServiceUtil.getTypesByDefinitionsIds;

/**
 * The implementation of the palvelu local service.
 * <p>
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.PalveluLocalService} interface.
 * <p>
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author pj, jmlehtin
 * @see fi.csc.avaa.tupa.db.service.base.PalveluLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.PalveluLocalServiceUtil
 */
public class PalveluLocalServiceImpl extends PalveluLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.PalveluLocalServiceUtil} to access the palvelu local service.
     */

	private static final AvaaLogger log = new AvaaLogger(PalveluLocalServiceImpl.class.getName());

	public int[] getInfrastructuresIdsByServiceId(int serviceId) {
		if (serviceId == 0) return null;

		return getInfrastructuresIdsByServicesIds(new int[]{serviceId});
	}

	public int[] getOrganisationsIdsByServiceId(int serviceId) {
		if (serviceId == 0) return null;

		int[] infrastructuresIds = getInfrastructuresIdsByServicesIds(new int[]{serviceId});

		return getOrganisationsIdsByInfrastructuresIds(infrastructuresIds);
	}

	public int[] getContactsIdsByServiceId(int serviceId) {
		if (serviceId == 0) return null;

		int[] infrastructuresIds = getInfrastructuresIdsByServicesIds(new int[]{serviceId});

		return getContactsIdsByInfrastructuresIds(infrastructuresIds);
	}
	
	public String[] getLocationTypesByServiceId(int serviceId){
		if(serviceId == 0) return null;

		//locationTypesIds in this case are the same as definitionsIds. for details please see the DB structure
		int[] definitionTypesIds = getLocationTypesIdsByServicesIds(new int[]{serviceId});
		
		return getTypesByDefinitionsIds(definitionTypesIds);
	}
	
	public String[] getServiceTypesByServiceId(int serviceId){
		if(serviceId == 0) return null;

		int[] serviceTypesIds = getServiceTypesIdsByServiceId(serviceId);
		int[] definitionsIds = getDefinitionsIdsByServiceTypesIds(serviceTypesIds);
		
		return getTypesByDefinitionsIds(definitionsIds);
	}
		
	public int[] getServicesIdsByPostalCodes(int[] PostalCodes) {
		if (isEmpty(PostalCodes)) return null;

		String key = KATUOSOITE;
		String anySymbols = ANYSYMBOL_SQL;

		DynamicQuery query = DynamicQueryFactoryUtil.forClass(
				PalveluImpl.class, PortletClassLoaderUtil.getClassLoader());

		Criterion criterion = like(key, anySymbols + String.valueOf(PostalCodes[0]) + anySymbols);

		for (int id = 1; id < PostalCodes.length; id++) {
			criterion = or(like(key, anySymbols + String.valueOf(PostalCodes[id]) + anySymbols), criterion);
		}

		query.add(criterion);
		List<Palvelu> result = null;

		try {
			result = PalveluLocalServiceUtil.dynamicQuery(query);
		} catch (SystemException e) {
			log.error(e, e);
		}

		return Validator.isNotNull(result) ? result.stream().distinct().mapToInt(PalveluModel::getPalvelu_id).toArray() : null;
	}

	public int[] getServicesIdsByLocation(double latitude, double longitude) {

		String keyLat = LAT;
		String keyLon = LON;
		double deviation = 0.01;

		DynamicQuery query = DynamicQueryFactoryUtil.forClass(
				PalveluImpl.class, PortletClassLoaderUtil.getClassLoader());

		Criterion criterion = between(keyLat, latitude - deviation, latitude + deviation);
		criterion = and(between(keyLon, longitude - deviation, longitude + deviation), criterion);

		query.add(criterion);
		List<Palvelu> result = null;

		try {
			result = PalveluLocalServiceUtil.dynamicQuery(query);
		} catch (SystemException e) {
			log.error(e, e);
		}
		return Validator.isNotNull(result) ? result.stream().distinct().mapToInt(PalveluModel::getPalvelu_id).toArray() : null;
	}

	public int[] getServiceTypesIdsByServicesIds(int[] servicesIds) {
		if (isEmpty(servicesIds)) return null;

		List<Palvelu> list = new ArrayList<>();

		Arrays.stream(servicesIds)
				.distinct()
				.forEach(id -> {
					try {
						list.add(PalveluLocalServiceUtil.getPalvelu(id));
					} catch (SystemException | PortalException e) {
						log.error(e, e);
					}
				});

		return Validator.isNotNull(list) ? list.stream().distinct().mapToInt(PalveluModel::getPaikkatyyppi).toArray() : null;
	}

	public int[] getServicesIdsByLocationTypesIds(int[] locationTypesIds) {
		if (isEmpty(locationTypesIds)) return null;

		List<Palvelu> list = new ArrayList<>();

		Arrays.stream(locationTypesIds)
				.distinct()
				.forEach(id -> {
					try {
						list.addAll(PalveluUtil.findBylocationTypeId(id));
					} catch (SystemException e) {
						log.error(e, e);
					}
				});

		return Validator.isNotNull(list) ? list.stream().distinct().mapToInt(PalveluModel::getPalvelu_id).toArray() : null;
	}
	
	public int[] getLocationTypesIdsByServicesIds(int[] servicesIds){
		if (isEmpty(servicesIds)) return null;

		List<Palvelu> list = new ArrayList<>();

		Arrays.stream(servicesIds)
				.distinct()
				.forEach(id -> {
					try {
						list.add(PalveluUtil.findByPrimaryKey(id));
					} catch (SystemException | NoSuchPalveluException e) {
						log.error(e, e);
					}
				});

		return Validator.isNotNull(list) ? list.stream().distinct().mapToInt(PalveluModel::getPaikkatyyppi).toArray() : null;
	}
}
