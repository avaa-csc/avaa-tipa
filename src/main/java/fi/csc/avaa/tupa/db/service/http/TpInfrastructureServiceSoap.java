package fi.csc.avaa.tupa.db.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import fi.csc.avaa.tupa.db.service.TpInfrastructureServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link fi.csc.avaa.tupa.db.service.TpInfrastructureServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link fi.csc.avaa.tupa.db.model.TpInfrastructureSoap}.
 * If the method in the service utility returns a
 * {@link fi.csc.avaa.tupa.db.model.TpInfrastructure}, that is translated to a
 * {@link fi.csc.avaa.tupa.db.model.TpInfrastructureSoap}. Methods that SOAP cannot
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
 * @see TpInfrastructureServiceHttp
 * @see fi.csc.avaa.tupa.db.model.TpInfrastructureSoap
 * @see fi.csc.avaa.tupa.db.service.TpInfrastructureServiceUtil
 * @generated
 */
public class TpInfrastructureServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(TpInfrastructureServiceSoap.class);

    /**
    * Returns a complete list of Infrastructure objects.
    *
    * @return list of Infrastructure as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructureSoap[] getAllInfrastructures()
        throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> returnValue =
                TpInfrastructureServiceUtil.getAllInfrastructures();

            return fi.csc.avaa.tupa.db.model.TpInfrastructureSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure IDs.
    *
    * @param infrastructuresIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructureSoap[] getInfrastructuresByInfrastructuresIds(
        int[] infrastructuresIds) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> returnValue =
                TpInfrastructureServiceUtil.getInfrastructuresByInfrastructuresIds(infrastructuresIds);

            return fi.csc.avaa.tupa.db.model.TpInfrastructureSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure URNs.
    *
    * @param infrastructuresUrns array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructureSoap[] getInfrastructuresByUrns(
        java.lang.String[] infrastructuresUrns) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> returnValue =
                TpInfrastructureServiceUtil.getInfrastructuresByUrns(infrastructuresUrns);

            return fi.csc.avaa.tupa.db.model.TpInfrastructureSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Infrastructure objects with provided Organisation IDs.
    *
    * @param organisationsIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructureSoap[] getInfrastructuresByOrganisationIds(
        int[] organisationsIds) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> returnValue =
                TpInfrastructureServiceUtil.getInfrastructuresByOrganisationIds(organisationsIds);

            return fi.csc.avaa.tupa.db.model.TpInfrastructureSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Infrastructure objects with provided Service IDs.
    *
    * @param servicesIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructureSoap[] getInfrastructuresByServiceIds(
        int[] servicesIds) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> returnValue =
                TpInfrastructureServiceUtil.getInfrastructuresByServiceIds(servicesIds);

            return fi.csc.avaa.tupa.db.model.TpInfrastructureSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Infrastructure objects with provided Contact IDs.
    *
    * @param contactIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructureSoap[] getInfrastructuresByContactIds(
        int[] contactIds) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> returnValue =
                TpInfrastructureServiceUtil.getInfrastructuresByContactIds(contactIds);

            return fi.csc.avaa.tupa.db.model.TpInfrastructureSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Infrastructure objects with provided keyword. For list of available keywords
    *
    * @see #getKeywords()
    * @param keywords array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructureSoap[] getInfrastructuresByKeywords(
        java.lang.String[] keywords) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> returnValue =
                TpInfrastructureServiceUtil.getInfrastructuresByKeywords(keywords);

            return fi.csc.avaa.tupa.db.model.TpInfrastructureSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Infrastructure objects with provided service types. For list of available service types
    *
    * @see TpServizeServiceImpl#getServiceTypes()
    * @param serviceTypes array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructureSoap[] getInfrastructuresByServiceTypes(
        java.lang.String[] serviceTypes) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> returnValue =
                TpInfrastructureServiceUtil.getInfrastructuresByServiceTypes(serviceTypes);

            return fi.csc.avaa.tupa.db.model.TpInfrastructureSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Infrastructure objects with provided location types. For list of available location types
    *
    * @see TpServizeServiceImpl#getLocationTypes()
    * @param locationTypes array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructureSoap[] getInfrastructuresByLocationTypes(
        java.lang.String[] locationTypes) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> returnValue =
                TpInfrastructureServiceUtil.getInfrastructuresByLocationTypes(locationTypes);

            return fi.csc.avaa.tupa.db.model.TpInfrastructureSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Infrastructure objects for related postal codes.
    *
    * @param PostalCodes array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructureSoap[] getInfrastructuresByPostalCodes(
        int[] PostalCodes) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> returnValue =
                TpInfrastructureServiceUtil.getInfrastructuresByPostalCodes(PostalCodes);

            return fi.csc.avaa.tupa.db.model.TpInfrastructureSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Infrastructure objects located at approximately (depends on the actual location) 1 km from exact coordinates.
    *
    * @param latitude double coordinate to search the DB for
    * @param longitude double coordinate to search the DB for
    * @return list of Infrastructures as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructureSoap[] getInfrastructuresByLocation(
        double latitude, double longitude) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> returnValue =
                TpInfrastructureServiceUtil.getInfrastructuresByLocation(latitude,
                    longitude);

            return fi.csc.avaa.tupa.db.model.TpInfrastructureSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Infrastructure objects for related countries. For list of available countries as two letter codes as in ISO 3166-1 alpha-2 standard.
    *
    * @see TpOrganisationServiceImpl#getCountries()
    * @param countries array of Strings to search the DB for (could be a single String)
    * @return list of Interface JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructureSoap[] getInfrastructuresByCountries(
        java.lang.String[] countries) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> returnValue =
                TpInfrastructureServiceUtil.getInfrastructuresByCountries(countries);

            return fi.csc.avaa.tupa.db.model.TpInfrastructureSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure previous IDs.
    *
    * @param previousIds array of integers to search the DB for (could be a single integer)
    * @return list of Infrastructures as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructureSoap[] getInfrastructuresByPreviousIds(
        int[] previousIds) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> returnValue =
                TpInfrastructureServiceUtil.getInfrastructuresByPreviousIds(previousIds);

            return fi.csc.avaa.tupa.db.model.TpInfrastructureSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure previous URNs.
    *
    * @param previousUrns array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructureSoap[] getInfrastructuresByPreviousUrns(
        java.lang.String[] previousUrns) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> returnValue =
                TpInfrastructureServiceUtil.getInfrastructuresByPreviousUrns(previousUrns);

            return fi.csc.avaa.tupa.db.model.TpInfrastructureSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a double array of Strings for keywords.
    *
    * @return double array of Strings for keywords in English and Finnish respectively
    */
    public static java.lang.String[][] getKeywords() throws RemoteException {
        try {
            java.lang.String[][] returnValue = TpInfrastructureServiceUtil.getKeywords();

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns an array of Strings for overall existing PIDs.
    *
    * @return an array of Strings for of persistent identifiers' names
    */
    public static java.lang.String[] getPids() throws RemoteException {
        try {
            java.lang.String[] returnValue = TpInfrastructureServiceUtil.getPids();

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns a list of Infrastructure objects with provided Infrastructure PIDs.
    *
    * @param pids array of Strings to search the DB for (could be a single String)
    * @return list of Infrastructures as JSON
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructureSoap[] getInfrastructuresByPids(
        java.lang.String[] pids) throws RemoteException {
        try {
            java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> returnValue =
                TpInfrastructureServiceUtil.getInfrastructuresByPids(pids);

            return fi.csc.avaa.tupa.db.model.TpInfrastructureSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
