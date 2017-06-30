package fi.csc.avaa.tupa.db.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import fi.csc.avaa.tupa.db.service.TpContactServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link fi.csc.avaa.tupa.db.service.TpContactServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link fi.csc.avaa.tupa.db.model.TpContactSoap}.
 * If the method in the service utility returns a
 * {@link fi.csc.avaa.tupa.db.model.TpContact}, that is translated to a
 * {@link fi.csc.avaa.tupa.db.model.TpContactSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author CSC
 * @see TpContactServiceHttp
 * @see fi.csc.avaa.tupa.db.model.TpContactSoap
 * @see fi.csc.avaa.tupa.db.service.TpContactServiceUtil
 * @generated
 */
public class TpContactServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(TpContactServiceSoap.class);

    /**
    * Returns a complete list of Contact objects.
    *
    * @return list of Contacts as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpContactSoap[] getAllContacts()
        throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpContact> returnValue = TpContactServiceUtil.getAllContacts();

            return fi.csc.avaa.tupa.db.model.TpContactSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Contact objects with provided Contact IDs.
    *
    * @param contactIds array of integers to search the DB for (could be a single integer)
    * @return list of Contacts as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpContactSoap[] getContactsByContactsIds(
        int[] contactIds) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpContact> returnValue = TpContactServiceUtil.getContactsByContactsIds(contactIds);

            return fi.csc.avaa.tupa.db.model.TpContactSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Contact objects with provided Infrastructure IDs.
    *
    * @param infrastructuresIds array of integers to search the DB for (could be a single integer)
    * @return list of Contacts as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpContactSoap[] getContactsByInfrastructuresIds(
        int[] infrastructuresIds) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpContact> returnValue = TpContactServiceUtil.getContactsByInfrastructuresIds(infrastructuresIds);

            return fi.csc.avaa.tupa.db.model.TpContactSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Contact objects with provided Infrastructure URNs.
    *
    * @param infrastructuresUrns array of String to search the DB for (could be a single String)
    * @return list of Contacts as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpContactSoap[] getContactsByInfrastructuresUrns(
        java.lang.String[] infrastructuresUrns) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpContact> returnValue = TpContactServiceUtil.getContactsByInfrastructuresUrns(infrastructuresUrns);

            return fi.csc.avaa.tupa.db.model.TpContactSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Contact objects with provided Organisation IDs.
    *
    * @param organisationIds array of integers to search the DB for (could be a single integer)
    * @return list of Contacts as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpContactSoap[] getContactsByOrganisationsIds(
        int[] organisationIds) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpContact> returnValue = TpContactServiceUtil.getContactsByOrganisationsIds(organisationIds);

            return fi.csc.avaa.tupa.db.model.TpContactSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Contact objects with provided Service IDs.
    *
    * @param serviceIds array of integers to search the DB for (could be a single integer)
    * @return list of Contacts as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpContactSoap[] getContactsByServicesIds(
        int[] serviceIds) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpContact> returnValue = TpContactServiceUtil.getContactsByServicesIds(serviceIds);

            return fi.csc.avaa.tupa.db.model.TpContactSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
