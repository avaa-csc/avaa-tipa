package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.model.Identifier;
import fi.csc.avaa.tupa.db.service.base.IdentifierLocalServiceBaseImpl;
import fi.csc.avaa.tupa.db.service.persistence.IdentifierUtil;

import static com.liferay.portal.kernel.util.Validator.isNotNull;

import java.util.List;

/**
 * The implementation of the identifier local service.
 * <p>
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.IdentifierLocalService} interface.
 * <p>
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CSC
 * @see fi.csc.avaa.tupa.db.service.base.IdentifierLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.IdentifierLocalServiceUtil
 */
public class IdentifierLocalServiceImpl extends IdentifierLocalServiceBaseImpl {
	/*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.IdentifierLocalServiceUtil} to access the identifier local service.
     */

	private static final AvaaLogger log = new AvaaLogger(IdentifierLocalServiceImpl.class.getName());

	public String[] getPidsArray() {

		String[] pids = null;
		List<Identifier> result = null;
		
		try {
			result = IdentifierUtil.findAll();
		} catch (SystemException e) {
			log.error(e, e);
		}
		
		if (isNotNull(result)) {
			pids = result.stream().map(Identifier::getIdentifier_name).toArray(String[]::new);
		}

		return pids;
	}
}
