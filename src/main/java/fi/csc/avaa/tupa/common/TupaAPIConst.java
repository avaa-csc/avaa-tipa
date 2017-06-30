package fi.csc.avaa.tupa.common;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import fi.csc.avaa.tupa.db.model.Infra;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static fi.csc.avaa.tupa.common.TupaConst.BASE_URN;

public final class TupaAPIConst {

	//this class should be modified accordingly if the set of JSON API methods changes

	public static final String METHODSDESCRIPTIONS = "Tupa API methods, please refer to: ";
	public static final String HTTPMETHODGET = "GET";
	public static final String HTTPMETHOD = "HTTP Method";
	public static final String METHOD = "method";
	public static final String METHODS = "Methods";
	public static final String RETURN_TYPE = "return";
	public static final String PARAMETERS = "parameters";
	public static final String INPUT_TYPE_INT_ARRAY = "int[]";
	public static final String INPUT_TYPE_STRING_ARRAY = "String[]";
	public static final String INPUT_TYPE_LONG_LONG = "long, long";
	public static final String INPUT_TYPE_NULL = "null";
	public static final String HELPER = "Helper";
	public static final String CONTACTS = "Contacts";
	public static final String INFRASTRUCTURES = "Infrastructures";
	public static final String ORGANISATIONS = "Organisations";
	public static final String SERVICES = "Services";
	public static final String BASE_API_URL_LOCAL = "http://localhost:8080/api/jsonws/tupa-portlet.";
	public static final String BASE_API_URL_TEST = "http://avoin-test.csc.fi/api/jsonws/tupa-portlet.";
	public static final String BASE_API_URL_PROD = "http://avaa.tdata.fi/api/jsonws/tupa-portlet.";
	public static final String URL = "url";
	public static final String SERVICE_TYPES = "Service types in EN and FI";
	public static final String LOCATION_TYPES = "Location types in EN and FI";
	public static final String KEYWORDS = "Keywords in EN and FI";
	public static final String COUNTRIES = "Countries' names";
	public static final String PIDS = "Persistent Identifiers";

	//Helper
	public static final String GET_CAPABILITIES = "get-capabilities";

	//Contacts
	public static final String GET_ALL_CONTACTS = "get-all-contacts";
	public static final String GET_CONTACTS_BY_CONTACTS_IDS = "get-contacts-by-contacts-ids";
	public static final String GET_CONTACTS_BY_INFRASTCTURES_IDS = "get-contacts-by-infrastructures-ids";
	public static final String GET_CONTACTS_BY_INFRASTCTURES_URNS = "get-contacts-by-infrastructures-urns";
	public static final String GET_CONTACTS_BY_ORGANISATIONS_IDS = "get-contacts-by-organisations_ids";
	public static final String GET_CONTACTS_BY_SERVICES_IDS = "get-contacts-by-services_ids";

	//Infrastructures
	public static final String GET_ALL_INFRASTRUCTURES = "get-all-infrastructures";
	public static final String GET_INFRASTRUCTURES_BY_CONTACT_IDS = "get-infrastructures-by-contact-ids";
	public static final String GET_INFRASTRUCTURES_BY_INFRASTRUCTURES_IDS = "get-infrastructures-by-infrastructures-ids";
	public static final String GET_INFRASTRUCTURES_BY_COUNTRIES = "get-infrastructures-by-countries";
	public static final String GET_INFRASTRUCTURES_BY_KEYWORDS = "get-infrastructures-by-keywords";
	public static final String GET_INFRASTRUCTURES_BY_LOCATION = "get-infrastructures-by-location";
	public static final String GET_INFRASTRUCTURES_BY_LOCATION_TYPES = "get-infrastructures-by-location-types";
	public static final String GET_INFRASTRUCTURES_BY_ORGANISATION_IDS = "get-infrastructures-by-organisation-ids";
	public static final String GET_INFRASTRUCTURES_BY_PIDS = "get-infrastructures-by-pids";
	public static final String GET_INFRASTRUCTURES_BY_POST_OFFICES = "get-infrastructures-by-post-offices";
	public static final String GET_INFRASTRUCTURES_BY_PREVIOUS_IDS = "get-infrastructures-by-previous-ids";
	public static final String GET_INFRASTRUCTURES_BY_PREVIOUS_URNS = "get-infrastructures-by-previous-urns";
	public static final String GET_INFRASTRUCTURES_BY_SERVICE_IDS = "get-infrastructures-by-service-ids";
	public static final String GET_INFRASTRUCTURES_BY_SERVICE_TYPES = "get-infrastructures-by-service-types";
	public static final String GET_INFRASTRUCTURES_BY_URNS = "get-infrastructures-by-urns";
	public static final String GET_KEYWORDS = "get-keywords";
	public static final String GET_PIDS = "get-pids";

	//Services
	public static final String GET_ALL_SERVICES = "get-all-services";
	public static final String GET_LOCATION_TYPES = "get-location-types";
	public static final String GET_SERVICE_TYPES = "get-service-types";
	public static final String GET_SERVICES_BY_CONTACTS_IDS = "get-services-by-contacts-ids";
	public static final String GET_SERVICES_BY_COUNTRIES = "get-services-by-countries";
	public static final String GET_SERVICES_BY_SERVICES_IDS = "get-services-by-services-ids";
	public static final String GET_SERVICES_BY_INFRASTRUCTURES_IDS = "get-services-by-infrastructures-ids";
	public static final String GET_SERVICES_BY_INFRASTRUCTURES_URNS = "get-services-by-infrastructures-urns";
	public static final String GET_SERVICES_BY_KEYWORDS = "get-services-by-keywords";
	public static final String GET_SERVICES_BY_LOCATION = "get-services-by-location";
	public static final String GET_SERVICES_BY_LOCATION_TYPES = "get-services-by-location-types";
	public static final String GET_SERVICES_BY_ORGANISATIONs_IDS = "get-services-by-organisations-ids";
	public static final String GET_SERVICES_BY_POST_OFFICES = "get-services-by-post-offices";
	public static final String GET_SERVICES_BY_SERVICE_TYPES = "get-services-by-service-types";

	//Organisations
	public static final String GET_ALL_ORGANISATIONS = "get-all-organisations";
	public static final String GET_ORGANISATIONS_BY_CONTACTS_IDS = "get-organisations-by-contacts-ids";
	public static final String GET_ORGANISATIONS_BY_ORGANISATIONS_IDS = "get-organisations-by-organisations-ids";
	public static final String GET_ORGANISATIONS_BY_INFRASTRUCTURES_IDS = "get-organisations-by-infrastructures-ids";
	public static final String GET_ORGANISATIONS_BY_INFRASTRUCTURES_URNS = "get-organisations-by-infrastructures-urns";
	public static final String GET_ORGANISATIONS_BY_ISNIS = "get-organisations-by-isnis";
	public static final String GET_ORGANISATIONS_BY_LOCATION_TYPES = "get-organisations-by-location-types";
	public static final String GET_ORGANISATIONS_BY_SERVICE_TYPES = "get-organisations-by-service-types";
	public static final String GET_ORGANISATIONS_BY_SERVICE_IDS = "get-organisations-by-service-ids";
	public static final String GET_COUNTRIES = "get-countries";

	public static List<JSONObject> constructMethodsDescriptionsList() {

		List<JSONObject> list = new ArrayList<>();

		list.add(constructMethodDescription(HELPER, GET_CAPABILITIES, INPUT_TYPE_NULL, METHODS, HTTPMETHODGET));

		list.add(constructMethodDescription(ORGANISATIONS, GET_ALL_ORGANISATIONS, INPUT_TYPE_NULL, ORGANISATIONS, HTTPMETHODGET));
		list.add(constructMethodDescription(ORGANISATIONS, GET_ORGANISATIONS_BY_CONTACTS_IDS, INPUT_TYPE_INT_ARRAY, ORGANISATIONS, HTTPMETHODGET));
		list.add(constructMethodDescription(ORGANISATIONS, GET_ORGANISATIONS_BY_ORGANISATIONS_IDS, INPUT_TYPE_INT_ARRAY, ORGANISATIONS, HTTPMETHODGET));
		list.add(constructMethodDescription(ORGANISATIONS, GET_ORGANISATIONS_BY_INFRASTRUCTURES_IDS, INPUT_TYPE_INT_ARRAY, ORGANISATIONS, HTTPMETHODGET));
		list.add(constructMethodDescription(ORGANISATIONS, GET_ORGANISATIONS_BY_INFRASTRUCTURES_URNS, INPUT_TYPE_STRING_ARRAY, ORGANISATIONS, HTTPMETHODGET));
		list.add(constructMethodDescription(ORGANISATIONS, GET_ORGANISATIONS_BY_ISNIS, INPUT_TYPE_STRING_ARRAY, ORGANISATIONS, HTTPMETHODGET));
		list.add(constructMethodDescription(ORGANISATIONS, GET_ORGANISATIONS_BY_LOCATION_TYPES, INPUT_TYPE_STRING_ARRAY, ORGANISATIONS, HTTPMETHODGET));
		list.add(constructMethodDescription(ORGANISATIONS, GET_ORGANISATIONS_BY_SERVICE_TYPES, INPUT_TYPE_STRING_ARRAY, ORGANISATIONS, HTTPMETHODGET));
		list.add(constructMethodDescription(ORGANISATIONS, GET_ORGANISATIONS_BY_SERVICE_IDS, INPUT_TYPE_INT_ARRAY, ORGANISATIONS, HTTPMETHODGET));
		list.add(constructMethodDescription(ORGANISATIONS, GET_COUNTRIES, INPUT_TYPE_NULL, COUNTRIES, HTTPMETHODGET));

		list.add(constructMethodDescription(SERVICES, GET_ALL_SERVICES, INPUT_TYPE_NULL, SERVICES, HTTPMETHODGET));
		list.add(constructMethodDescription(SERVICES, GET_SERVICES_BY_SERVICES_IDS, INPUT_TYPE_INT_ARRAY, SERVICES, HTTPMETHODGET));
		list.add(constructMethodDescription(SERVICES, GET_SERVICES_BY_INFRASTRUCTURES_IDS, INPUT_TYPE_INT_ARRAY, SERVICES, HTTPMETHODGET));
		list.add(constructMethodDescription(SERVICES, GET_SERVICES_BY_INFRASTRUCTURES_URNS, INPUT_TYPE_STRING_ARRAY, SERVICES, HTTPMETHODGET));
		list.add(constructMethodDescription(SERVICES, GET_SERVICE_TYPES, INPUT_TYPE_NULL, SERVICE_TYPES, HTTPMETHODGET));
		list.add(constructMethodDescription(SERVICES, GET_LOCATION_TYPES, INPUT_TYPE_NULL, LOCATION_TYPES, HTTPMETHODGET));
		list.add(constructMethodDescription(SERVICES, GET_SERVICES_BY_COUNTRIES, INPUT_TYPE_STRING_ARRAY, SERVICES, HTTPMETHODGET));
		list.add(constructMethodDescription(SERVICES, GET_SERVICES_BY_CONTACTS_IDS, INPUT_TYPE_INT_ARRAY, SERVICES, HTTPMETHODGET));
		list.add(constructMethodDescription(SERVICES, GET_SERVICES_BY_KEYWORDS, INPUT_TYPE_STRING_ARRAY, SERVICES, HTTPMETHODGET));
		list.add(constructMethodDescription(SERVICES, GET_SERVICES_BY_LOCATION, INPUT_TYPE_LONG_LONG, SERVICES, HTTPMETHODGET));
		list.add(constructMethodDescription(SERVICES, GET_SERVICES_BY_LOCATION_TYPES, INPUT_TYPE_STRING_ARRAY, SERVICES, HTTPMETHODGET));
		list.add(constructMethodDescription(SERVICES, GET_SERVICES_BY_ORGANISATIONs_IDS, INPUT_TYPE_INT_ARRAY, SERVICES, HTTPMETHODGET));
		list.add(constructMethodDescription(SERVICES, GET_SERVICES_BY_POST_OFFICES, INPUT_TYPE_INT_ARRAY, SERVICES, HTTPMETHODGET));
		list.add(constructMethodDescription(SERVICES, GET_SERVICES_BY_SERVICE_TYPES, INPUT_TYPE_STRING_ARRAY, SERVICES, HTTPMETHODGET));
		
		list.add(constructMethodDescription(CONTACTS, GET_ALL_CONTACTS, INPUT_TYPE_NULL, CONTACTS, HTTPMETHODGET));
		list.add(constructMethodDescription(CONTACTS, GET_CONTACTS_BY_CONTACTS_IDS, INPUT_TYPE_INT_ARRAY, CONTACTS, HTTPMETHODGET));
		list.add(constructMethodDescription(CONTACTS, GET_CONTACTS_BY_INFRASTCTURES_IDS, INPUT_TYPE_INT_ARRAY, CONTACTS, HTTPMETHODGET));
		list.add(constructMethodDescription(CONTACTS, GET_CONTACTS_BY_INFRASTCTURES_URNS, INPUT_TYPE_STRING_ARRAY, CONTACTS, HTTPMETHODGET));
		list.add(constructMethodDescription(CONTACTS, GET_CONTACTS_BY_ORGANISATIONS_IDS, INPUT_TYPE_INT_ARRAY, CONTACTS, HTTPMETHODGET));
		list.add(constructMethodDescription(CONTACTS, GET_CONTACTS_BY_SERVICES_IDS, INPUT_TYPE_INT_ARRAY, CONTACTS, HTTPMETHODGET));

		list.add(constructMethodDescription(INFRASTRUCTURES, GET_ALL_INFRASTRUCTURES, INPUT_TYPE_NULL, INFRASTRUCTURES, HTTPMETHODGET));
		list.add(constructMethodDescription(INFRASTRUCTURES, GET_INFRASTRUCTURES_BY_CONTACT_IDS, INPUT_TYPE_INT_ARRAY, INFRASTRUCTURES, HTTPMETHODGET));
		list.add(constructMethodDescription(INFRASTRUCTURES, GET_INFRASTRUCTURES_BY_INFRASTRUCTURES_IDS, INPUT_TYPE_INT_ARRAY, INFRASTRUCTURES, HTTPMETHODGET));
		list.add(constructMethodDescription(INFRASTRUCTURES, GET_INFRASTRUCTURES_BY_COUNTRIES, INPUT_TYPE_STRING_ARRAY, INFRASTRUCTURES, HTTPMETHODGET));
		list.add(constructMethodDescription(INFRASTRUCTURES, GET_INFRASTRUCTURES_BY_KEYWORDS, INPUT_TYPE_STRING_ARRAY, INFRASTRUCTURES, HTTPMETHODGET));
		list.add(constructMethodDescription(INFRASTRUCTURES, GET_INFRASTRUCTURES_BY_LOCATION, INPUT_TYPE_LONG_LONG, INFRASTRUCTURES, HTTPMETHODGET));
		list.add(constructMethodDescription(INFRASTRUCTURES, GET_INFRASTRUCTURES_BY_LOCATION_TYPES, INPUT_TYPE_STRING_ARRAY, INFRASTRUCTURES, HTTPMETHODGET));
		list.add(constructMethodDescription(INFRASTRUCTURES, GET_INFRASTRUCTURES_BY_ORGANISATION_IDS, INPUT_TYPE_INT_ARRAY, INFRASTRUCTURES, HTTPMETHODGET));
		list.add(constructMethodDescription(INFRASTRUCTURES, GET_INFRASTRUCTURES_BY_PIDS, INPUT_TYPE_STRING_ARRAY, INFRASTRUCTURES, HTTPMETHODGET));
		list.add(constructMethodDescription(INFRASTRUCTURES, GET_INFRASTRUCTURES_BY_POST_OFFICES, INPUT_TYPE_INT_ARRAY, INFRASTRUCTURES, HTTPMETHODGET));
		list.add(constructMethodDescription(INFRASTRUCTURES, GET_INFRASTRUCTURES_BY_PREVIOUS_IDS, INPUT_TYPE_INT_ARRAY, INFRASTRUCTURES, HTTPMETHODGET));
		list.add(constructMethodDescription(INFRASTRUCTURES, GET_INFRASTRUCTURES_BY_PREVIOUS_URNS, INPUT_TYPE_STRING_ARRAY, INFRASTRUCTURES, HTTPMETHODGET));
		list.add(constructMethodDescription(INFRASTRUCTURES, GET_INFRASTRUCTURES_BY_SERVICE_IDS, INPUT_TYPE_INT_ARRAY, INFRASTRUCTURES, HTTPMETHODGET));
		list.add(constructMethodDescription(INFRASTRUCTURES, GET_INFRASTRUCTURES_BY_SERVICE_TYPES, INPUT_TYPE_STRING_ARRAY, INFRASTRUCTURES, HTTPMETHODGET));
		list.add(constructMethodDescription(INFRASTRUCTURES, GET_INFRASTRUCTURES_BY_URNS, INPUT_TYPE_STRING_ARRAY, INFRASTRUCTURES, HTTPMETHODGET));
		list.add(constructMethodDescription(INFRASTRUCTURES, GET_KEYWORDS, INPUT_TYPE_NULL, KEYWORDS, HTTPMETHODGET));
		list.add(constructMethodDescription(INFRASTRUCTURES, GET_PIDS, INPUT_TYPE_NULL, PIDS, HTTPMETHODGET));

		return list;
	}

	public static String substringInputParam(String methodName) {
		return methodName.substring(methodName.lastIndexOf("by-") + 3, methodName.length());
	}

	public static JSONObject constructMethodDescription(String group, String name, String parametersType, String returnType, String httpMethod) {

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		jsonObject.put(METHOD, name);
		jsonObject.put(HTTPMETHOD, httpMethod);
		jsonObject.put(RETURN_TYPE, returnType);
		jsonObject.put(PARAMETERS, parametersType);

		if (parametersType == INPUT_TYPE_NULL) {
			jsonObject.put(URL, BASE_API_URL_PROD + group + "/" + name + "/");
		} else {
			jsonObject.put(URL, BASE_API_URL_PROD + group + "/" + name + "/" + substringInputParam(name) + "/");
		}
		
		return jsonObject;
	}

	public static String createURN(Infra infra) {
		if (infra == null) return null;
		return BASE_URN + new SimpleDateFormat("yyyyMMdd").format(infra.getApi_date()) + infra.getInfra_id();
	}
}
