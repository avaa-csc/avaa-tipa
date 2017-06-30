package fi.csc.avaa.tupa.db.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import fi.csc.avaa.tupa.db.service.TpOrganisationServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link fi.csc.avaa.tupa.db.service.TpOrganisationServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link fi.csc.avaa.tupa.db.model.TpOrganisationSoap}.
 * If the method in the service utility returns a
 * {@link fi.csc.avaa.tupa.db.model.TpOrganisation}, that is translated to a
 * {@link fi.csc.avaa.tupa.db.model.TpOrganisationSoap}. Methods that SOAP cannot
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
 * @see TpOrganisationServiceHttp
 * @see fi.csc.avaa.tupa.db.model.TpOrganisationSoap
 * @see fi.csc.avaa.tupa.db.service.TpOrganisationServiceUtil
 * @generated
 */
public class TpOrganisationServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(TpOrganisationServiceSoap.class);

    /**
    * Returns a complete list of Organisation objects.
    *
    * @return list of Organisation as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisationSoap[] getAllOrganisations()
        throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> returnValue =
                TpOrganisationServiceUtil.getAllOrganisations();

            return fi.csc.avaa.tupa.db.model.TpOrganisationSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Organisation objects with provided Organisation IDs.
    *
    * @param organisationsIds array of integers to search the DB for (could be a single integer)
    * @return list of Organisations as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisationSoap[] getOrganisationsByOrganisationsIds(
        int[] organisationsIds) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> returnValue =
                TpOrganisationServiceUtil.getOrganisationsByOrganisationsIds(organisationsIds);

            return fi.csc.avaa.tupa.db.model.TpOrganisationSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Organisation objects with provided Organisation ISNIs.
    *
    * @param organisationsIsnis array of Strings to search the DB for (could be a single String)
    * @return list of Organisations as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisationSoap[] getOrganisationsByIsnis(
        java.lang.String[] organisationsIsnis) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> returnValue =
                TpOrganisationServiceUtil.getOrganisationsByIsnis(organisationsIsnis);

            return fi.csc.avaa.tupa.db.model.TpOrganisationSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Organisation objects with provided Infrastructure IDs.
    *
    * @param infrastructuresIds array of integers to search the DB for (could be a single integer)
    * @return list of Organisations as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisationSoap[] getOrganisationsByInfrastructuresIds(
        int[] infrastructuresIds) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> returnValue =
                TpOrganisationServiceUtil.getOrganisationsByInfrastructuresIds(infrastructuresIds);

            return fi.csc.avaa.tupa.db.model.TpOrganisationSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Organisation objects with provided Infrastructure URNs.
    *
    * @param infrastructuresUrns array of Strings to search the DB for (could be a single String)
    * @return list of Organisations as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisationSoap[] getOrganisationsByInfrastructuresUrns(
        java.lang.String[] infrastructuresUrns) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> returnValue =
                TpOrganisationServiceUtil.getOrganisationsByInfrastructuresUrns(infrastructuresUrns);

            return fi.csc.avaa.tupa.db.model.TpOrganisationSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Organisation objects with provided Service IDs.
    *
    * @param servicesIds array of integers to search the DB for (could be a single integer)
    * @return list of Organisations as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisationSoap[] getOrganisationsByServicesIds(
        int[] servicesIds) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> returnValue =
                TpOrganisationServiceUtil.getOrganisationsByServicesIds(servicesIds);

            return fi.csc.avaa.tupa.db.model.TpOrganisationSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Organisation objects with provided Contacts IDs.
    *
    * @param contactsIds array of integers to search the DB for (could be a single integer)
    * @return list of Organisations as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisationSoap[] getOrganisationsByContactsIds(
        int[] contactsIds) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> returnValue =
                TpOrganisationServiceUtil.getOrganisationsByContactsIds(contactsIds);

            return fi.csc.avaa.tupa.db.model.TpOrganisationSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Organisation objects with provided location types. For list of available service types
    *
    * @see TpServizeServiceImpl#getServiceTypes()
    * @param serviceTypes array of Strings to search the DB for (could be a single String)
    * @return list of Organisations as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisationSoap[] getOrganisationsByServiceTypes(
        java.lang.String[] serviceTypes) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> returnValue =
                TpOrganisationServiceUtil.getOrganisationsByServiceTypes(serviceTypes);

            return fi.csc.avaa.tupa.db.model.TpOrganisationSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Organisation objects with provided location types. For list of available location types
    *
    * @see TpServizeServiceImpl#getLocationTypes()
    * @param locationTypes array of Strings to search the DB for (could be a single String)
    * @return list of Organisations as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisationSoap[] getOrganisationsByLocationTypes(
        java.lang.String[] locationTypes) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> returnValue =
                TpOrganisationServiceUtil.getOrganisationsByLocationTypes(locationTypes);

            return fi.csc.avaa.tupa.db.model.TpOrganisationSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns an array of Strings for available countries as two letter codes as in ISO 3166-1 alpha-2 standard.
    *
    * @return array of Strings
    */
    public static java.lang.String[] getCountries() throws RemoteException {
        try {
            java.lang.String[] returnValue = TpOrganisationServiceUtil.getCountries();

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
