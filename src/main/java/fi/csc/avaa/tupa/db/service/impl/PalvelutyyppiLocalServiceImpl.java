package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.model.Palvelutyyppi;
import fi.csc.avaa.tupa.db.model.PalvelutyyppiModel;
import fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.PalvelutyyppiLocalServiceBaseImpl;
import fi.csc.avaa.tupa.db.service.persistence.PalvelutyyppiUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.liferay.portal.kernel.util.ArrayUtil.isEmpty;
import static com.liferay.portal.kernel.util.Validator.isNotNull;

/**
 * The implementation of the palvelutyyppi local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author pj,jmlehtin
 * @see fi.csc.avaa.tupa.db.service.base.PalvelutyyppiLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalServiceUtil
 */
public class PalvelutyyppiLocalServiceImpl
    extends PalvelutyyppiLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalServiceUtil} to access the palvelutyyppi local service.
     */
	
	private static final AvaaLogger log = new AvaaLogger(PalvelutyyppiLocalServiceImpl.class.getName());

	public int[] getServiceTypesIdsByDefinitionsIds(int[] definitionsIds){
		if(isEmpty(definitionsIds)) return null;

		List<Palvelutyyppi> list =  new ArrayList<>();

		Arrays.stream(definitionsIds)
				.distinct()
				.forEach(id -> {
					try {
						list.addAll(PalvelutyyppiUtil.findBydefinitionId(id));
					} catch (SystemException e) {
						log.error(e, e);
					}
				});

		return isNotNull(list) ? list.stream().distinct().mapToInt(PalvelutyyppiModel::getPalvelutyyppi_id).toArray() : null;
	}

	public int[] getDefinitionsIdsByServiceTypesIds(int[] serviceTypesIds){
		if(isEmpty(serviceTypesIds)) return null;

		List<Palvelutyyppi> list =  new ArrayList<>();

		Arrays.stream(serviceTypesIds)
				.distinct()
				.forEach(id -> {
					try {
						list.add(PalvelutyyppiLocalServiceUtil.getPalvelutyyppi(id));
					} catch (SystemException | PortalException e) {
						log.error(e, e);
					}
				});

		return isNotNull(list) ? list.stream().distinct().mapToInt(PalvelutyyppiModel::getPalvelutyyppi_id).toArray() : null;
	}
}
