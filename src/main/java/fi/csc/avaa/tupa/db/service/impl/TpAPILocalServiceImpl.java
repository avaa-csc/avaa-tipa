package fi.csc.avaa.tupa.db.service.impl;

import fi.csc.avaa.tupa.db.model.TpAPI;
import fi.csc.avaa.tupa.db.service.base.TpAPILocalServiceBaseImpl;
import fi.csc.avaa.tupa.db.service.persistence.TpAPIUtil;

import java.util.ArrayList;
import java.util.List;

import static fi.csc.avaa.tupa.common.TupaAPIConst.METHODSDESCRIPTIONS;
import static fi.csc.avaa.tupa.common.TupaAPIConst.constructMethodsDescriptionsList;

/**
 * The implementation of the tp a p i local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.TpAPILocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CSC
 * @see fi.csc.avaa.tupa.db.service.base.TpAPILocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.TpAPILocalServiceUtil
 */
public class TpAPILocalServiceImpl extends TpAPILocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.TpAPILocalServiceUtil} to access the tp a p i local service.
     */

	public List<TpAPI> getCapabilities() {
		
		List<TpAPI> list = new ArrayList<>();
		
		TpAPI tpAPI = TpAPIUtil.create(METHODSDESCRIPTIONS);
		tpAPI.setMethodDescription(constructMethodsDescriptionsList());
		list.add(tpAPI);
		
		return list;
	}
}
