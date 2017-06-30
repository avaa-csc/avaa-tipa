package fi.csc.avaa.tupa.db.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import fi.csc.avaa.tupa.db.service.TpServizeServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link fi.csc.avaa.tupa.db.service.TpServizeServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link fi.csc.avaa.tupa.db.model.TpServizeSoap}.
 * If the method in the service utility returns a
 * {@link fi.csc.avaa.tupa.db.model.TpServize}, that is translated to a
 * {@link fi.csc.avaa.tupa.db.model.TpServizeSoap}. Methods that SOAP cannot
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
 * @see TpServizeServiceHttp
 * @see fi.csc.avaa.tupa.db.model.TpServizeSoap
 * @see fi.csc.avaa.tupa.db.service.TpServizeServiceUtil
 * @generated
 */
public class TpServizeServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(TpServizeServiceSoap.class);

    /**
    * Returns a complete list of Service objects.
    *
    * @return list of Services as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpServizeSoap[] getAllServices()
        throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpServize> returnValue = TpServizeServiceUtil.getAllServices();

            return fi.csc.avaa.tupa.db.model.TpServizeSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Service objects with provided Service IDs.
    *
    * @param servicesIds array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpServizeSoap[] getServicesByServicesIds(
        int[] servicesIds) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpServize> returnValue = TpServizeServiceUtil.getServicesByServicesIds(servicesIds);

            return fi.csc.avaa.tupa.db.model.TpServizeSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Service objects for related Infrastructure IDs.
    *
    * @param infrastructuresIds array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpServizeSoap[] getServicesByInfrastructuresIds(
        int[] infrastructuresIds) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpServize> returnValue = TpServizeServiceUtil.getServicesByInfrastructuresIds(infrastructuresIds);

            return fi.csc.avaa.tupa.db.model.TpServizeSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Service objects for related Infrastructure URNs.
    *
    * @param infrastructuresUrns array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpServizeSoap[] getServicesByInfrastructuresUrns(
        java.lang.String[] infrastructuresUrns) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpServize> returnValue = TpServizeServiceUtil.getServicesByInfrastructuresUrns(infrastructuresUrns);

            return fi.csc.avaa.tupa.db.model.TpServizeSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Service objects for related Organisation IDs.
    *
    * @param organisationsIds array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpServizeSoap[] getServicesByOrganisationsIds(
        int[] organisationsIds) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpServize> returnValue = TpServizeServiceUtil.getServicesByOrganisationsIds(organisationsIds);

            return fi.csc.avaa.tupa.db.model.TpServizeSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Service objects for related Contact IDs.
    *
    * @param contactsIds array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpServizeSoap[] getServicesByContactsIds(
        int[] contactsIds) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpServize> returnValue = TpServizeServiceUtil.getServicesByContactsIds(contactsIds);

            return fi.csc.avaa.tupa.db.model.TpServizeSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Service objects for related keywords.
    *
    * @param keywords array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpServizeSoap[] getServicesByKeywords(
        java.lang.String[] keywords) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpServize> returnValue = TpServizeServiceUtil.getServicesByKeywords(keywords);

            return fi.csc.avaa.tupa.db.model.TpServizeSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Service objects for related service types. For list of available countries
    *
    * @see #getServiceTypes()
    * @param serviceTypes array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpServizeSoap[] getServicesByServiceTypes(
        java.lang.String[] serviceTypes) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpServize> returnValue = TpServizeServiceUtil.getServicesByServiceTypes(serviceTypes);

            return fi.csc.avaa.tupa.db.model.TpServizeSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a double array of Strings for service types.
    *
    * @return double array of Strings for service types in English and Finnish respectively
    */
    public static java.lang.String[][] getServiceTypes()
        throws RemoteException {
        try {
            java.lang.String[][] returnValue = TpServizeServiceUtil.getServiceTypes();

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Service objects for location types. For list of available location
    *
    * @see #getLocationTypes()
    * @param locationTypes array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpServizeSoap[] getServicesByLocationTypes(
        java.lang.String[] locationTypes) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpServize> returnValue = TpServizeServiceUtil.getServicesByLocationTypes(locationTypes);

            return fi.csc.avaa.tupa.db.model.TpServizeSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a double array of Strings for location types.
    *
    * @return double array of Strings for location types in English and Finnish respectively
    */
    public static java.lang.String[][] getLocationTypes()
        throws RemoteException {
        try {
            java.lang.String[][] returnValue = TpServizeServiceUtil.getLocationTypes();

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Service objects for related postal codes.
    *
    * @param PostalCodes array of integers to search the DB for (could be a single integer)
    * @return list of Services as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpServizeSoap[] getServicesByPostalCodes(
        int[] PostalCodes) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpServize> returnValue = TpServizeServiceUtil.getServicesByPostalCodes(PostalCodes);

            return fi.csc.avaa.tupa.db.model.TpServizeSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Service objects located at approximately (depends on the actual location) 1 km from exact coordinates.
    *
    * @param latitude double coordinate to search the DB for
    * @param longitude double coordinate to search the DB for
    * @return list of Services as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpServizeSoap[] getServicesByLocation(
        double latitude, double longitude) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpServize> returnValue = TpServizeServiceUtil.getServicesByLocation(latitude,
                    longitude);

            return fi.csc.avaa.tupa.db.model.TpServizeSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Service objects for related countries. For list of available countries as two letter codes as in ISO 3166-1 alpha-2 standard.
    *
    * @see TpOrganisationServiceImpl#getCountries()
    * @param countries array of Strings to search the DB for (could be a single String)
    * @return list of Services as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpServizeSoap[] getServicesByCountries(
        java.lang.String[] countries) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpServize> returnValue = TpServizeServiceUtil.getServicesByCountries(countries);

            return fi.csc.avaa.tupa.db.model.TpServizeSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
