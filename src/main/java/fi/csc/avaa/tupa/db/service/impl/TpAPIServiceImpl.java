package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.security.ac.AccessControlled;
import fi.csc.avaa.tupa.db.model.TpAPI;
import fi.csc.avaa.tupa.db.service.TpAPILocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.TpAPIServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the tp a p i remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.TpAPIService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author CSC
 * @see fi.csc.avaa.tupa.db.service.base.TpAPIServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.TpAPIServiceUtil
 */
@JSONWebService("Helper")
public class TpAPIServiceImpl extends TpAPIServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.TpAPIServiceUtil} to access the tp a p i remote service.
     */

	@AccessControlled(guestAccessEnabled = true)
	public List<TpAPI> getCapabilities() {
		return TpAPILocalServiceUtil.getCapabilities();
	}
}
