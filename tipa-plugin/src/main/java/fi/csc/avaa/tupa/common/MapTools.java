/**
 * 
 */
package fi.csc.avaa.tupa.common;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import fi.csc.avaa.tools.Const;
import fi.csc.avaa.tools.StringTools;
import fi.csc.avaa.tools.Tools;
import fi.csc.avaa.tools.logging.AvaaLogger;
import fi.csc.avaa.tupa.db.model.Palvelu;

/**
 * @author jmlehtin
 *
 */
public final class MapTools {

	private static AvaaLogger log = new AvaaLogger(MapTools.class.getName());
	
	// USING NOMINATIM
//	public static Double[] getLatLong(Palvelu palvelu) {
//		String streetAddr = StringTools.isEmptyOrNull(palvelu.getKatuosoite()) ? null : palvelu.getKatuosoite().replaceAll(Const.STRING_SPACE, "+");
//		String city = StringTools.isEmptyOrNull(palvelu.getKaupunki()) ? null : palvelu.getKaupunki().replaceAll(Const.STRING_SPACE, "+");
//		if(city != null) {
//			Double[] latLon = getLatLongFromNominatim(TupaConst.getNominatimUrl(city, streetAddr));
//			if(latLon == null) {
//				 return getLatLongFromNominatim(TupaConst.getNominatimUrl(city, null));
//			}
//			return latLon;
//		}
//		return null;
//	}
	
	// USING MODEL'S OWN COORDINATES TODO: Waiting for coordinates to be populated to 
	public static Double[] getLatLong(Palvelu palvelu) {
		if(palvelu != null && palvelu.getLat() != 0.0f && palvelu.getLon() != 0.0f) {
			return new Double[] {palvelu.getLat(), palvelu.getLon()};
		}
		return null;
	}
	
//	private static Double[] getLatLongFromNominatim(String nominatimUrl) {
//		try {
//			URL obj = new URL(nominatimUrl);
//			URLConnection conn = (HttpURLConnection) obj.openConnection();
//			conn.connect();
//			JsonParser parser = new JsonParser();
//			JsonArray response = (JsonArray) parser.parse(new InputStreamReader(conn.getInputStream()));
//			Iterator<JsonElement> it = response.iterator();
//			while(it.hasNext()) {
//				JsonObject jObj = (JsonObject) it.next();
//				Double lat = Tools.isNull(jObj.get("lat")) ? null : jObj.get("lat").getAsDouble();
//				Double lon = Tools.isNull(jObj.get("lon")) ? null : jObj.get("lon").getAsDouble();
//				if (!Tools.isNull(lat) && !Tools.isNull(lon)) {
//					return new Double[] {lat, lon};
//				}
//			}
//		} catch (IOException ioe) {
//			log.error("Unable to get nominatim data");
//		}
//		return null;
//	}
	
}
