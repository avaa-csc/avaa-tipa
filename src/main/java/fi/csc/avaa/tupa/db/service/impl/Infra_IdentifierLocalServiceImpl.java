package fi.csc.avaa.tupa.db.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.NoSuchIdentifierException;
import fi.csc.avaa.tupa.db.model.Identifier;
import fi.csc.avaa.tupa.db.model.Infra_Identifier;
import fi.csc.avaa.tupa.db.model.Infra_Palvelut;
import fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot;
import fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.base.Infra_IdentifierLocalServiceBaseImpl;
import fi.csc.avaa.tupa.db.service.persistence.IdentifierUtil;
import fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierUtil;
import fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotUtil;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The implementation of the infra_ identifier local service.
 * <p>
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.service.Infra_IdentifierLocalService} interface.
 * <p>
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CSC
 * @see fi.csc.avaa.tupa.db.service.base.Infra_IdentifierLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.Infra_IdentifierLocalServiceUtil
 */
public class Infra_IdentifierLocalServiceImpl
		extends Infra_IdentifierLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.tupa.db.service.Infra_IdentifierLocalServiceUtil} to access the infra_ identifier local service.
     */

	private static final AvaaLogger log = new AvaaLogger(Infra_IdentifierLocalServiceImpl.class.getName());

	public List<Infra_Identifier> getExtendedInfraIdentifiersList(int infraId) {
		if (infraId == 0) return null;

		List<Infra_Identifier> identifierValues = null;

		try {
			identifierValues = Infra_IdentifierUtil.findByinfraId(infraId);
		} catch (SystemException e) {
			log.error("Could not get Infra_Identifier with Id: " + infraId, e);
		}

		if (identifierValues != null) {
			for (int i = 0; i < identifierValues.size(); i++) {
				int identifier_type = identifierValues.get(i).getIdentifier_type();
				Identifier identifier = null;
				try {
					identifier = IdentifierUtil.findByPrimaryKey(identifier_type);
				} catch (SystemException | NoSuchIdentifierException e) {
					log.error("Could not get Identifier for identifier_type: " + identifier_type, e);
				}
				String identifier_name = identifier.getIdentifier_name();
				String identifier_description_translation_key = identifier.getIdentifier_description_translation_key();
				String resolution_url = identifier.getResolution_url();
				String definition_url = identifier.getDefinition_url();
				identifierValues.get(i).setIdentifier_name(identifier_name);
				identifierValues.get(i).setIdentifier_description_translation_key(identifier_description_translation_key);
				identifierValues.get(i).setResolution_url(resolution_url);
				identifierValues.get(i).setDefinition_url(definition_url);
			}
			return identifierValues.stream().filter(i -> i.getIdentifier_value() != null).collect(Collectors.toList());
		}
		return null;
	}
}
