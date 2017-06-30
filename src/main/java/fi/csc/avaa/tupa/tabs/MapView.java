package fi.csc.avaa.tupa.tabs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.LMarker;
import org.vaadin.addon.leaflet.LOpenStreetMapLayer;
//import org.vaadin.addon.leaflet.LatLngBounds;
import org.vaadin.addon.leaflet.LWmsLayer;
import org.vaadin.addon.leaflet.shared.Bounds;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

import fi.csc.avaa.tools.Const;
import fi.csc.avaa.tools.Tools;
import fi.csc.avaa.tools.vaadin.language.LanguageTools;
import fi.csc.avaa.tools.vaadin.language.Translator;
import fi.csc.avaa.tupa.common.DBTools;
import fi.csc.avaa.tupa.common.MapTools;
import fi.csc.avaa.tupa.common.TupaDBCache;
import fi.csc.avaa.tupa.db.model.Infra;
import fi.csc.avaa.tupa.db.model.Palvelu;
import fi.csc.avaa.tupa.model.ExtPalvelu;

public class MapView extends CustomComponent implements View, NamedView {
	private static final long serialVersionUID = 1L;
	private Collection<ExtPalvelu> extPalvelut;
	public static final String NAME = "location";
	private Translator translator;
	private VerticalLayout viewLayout;
	private int number_in_sight = 0;
	private int number_of_all = 0;
	private int number_of_virtual = 0;
	private List<PalveluMarker> palvelut_kartassa = null;
	private boolean isInitialized;
	
	public MapView(Translator translator) {
		this.translator = translator;
		this.viewLayout = new VerticalLayout();
		setSizeFull();
		viewLayout.setSizeFull();
		viewLayout.setMargin(true);
		viewLayout.setSpacing(true);
		setCompositionRoot(viewLayout);
		extPalvelut = TupaDBCache.getPalveluCacheValues();
	}
	
	private void init() {
		palvelut_kartassa = new ArrayList<PalveluMarker>();
		LMap leafletMap;
		leafletMap = new LMap();
		leafletMap.setStyleName("service-map");
		leafletMap.setCaption(translator.localize("Application.Tab.Map"));
		leafletMap.setWidth(100, Unit.PERCENTAGE);
		leafletMap.setHeight(800, Unit.PIXELS);

		LWmsLayer bgLayer = new LWmsLayer();
		bgLayer.setUrl("http://ows.terrestris.de/osm/service");
		bgLayer.setLayers("OSM-WMS");
		bgLayer.setVersion("1.1.0");
		bgLayer.setAttributionString("© <a target=\"_blank\" href=\"http://ows.terrestris.de/dienste.html\">terrestris</a>. Data: © <a target=\"_blank\" href=\"http://www.openstreetmap.org/copyright\">OpenStreetMap contributors</a>");
		leafletMap.addLayer(bgLayer);
		viewLayout.addComponent(leafletMap);
		number_in_sight = 0;
		number_of_all = 0;
		number_of_virtual = 0;
		
		for (ExtPalvelu extPalvelu: extPalvelut) {
			Palvelu p = extPalvelu.getPalvelu();
			Double[] latLon = MapTools.getLatLong(p);
			if(!Tools.isNull(latLon)) {
				String infra = Const.STRING_EMPTY;
				List<Infra> infrat = DBTools.getPalveluInfrat(p.getPalvelu_id());
				for (Infra i:infrat) {
					infra = infra + LanguageTools.getFI_ENTranslatedValueOrEmpty(i.getNimi(), i.getName(), translator, true) + "<br>";
				}
				// Tarkistetaan löytyykö markkeria samasta paikkaa
				
				if(extPalvelu.isLocationBound()) {
					boolean paivitys = false;
					
					String commonHtml = "<a onclick='displayServiceDetails(" + p.getPalvelu_id() + "); event.returnValue=false;'>" + LanguageTools.getFI_ENTranslatedValueOrEmpty(p.getNimi(), p.getName(), translator, true) + "</a><br>" + infra;
					for (PalveluMarker palv:palvelut_kartassa) {
						//if (m.getPoint().getLon() == lon && m.getPoint().getLat() == lat) {
						if (palv.getKatuosoite().equals(p.getKatuosoite()) && palv.getKaupunki().equals(p.getKaupunki())) {
							paivitys = true;
							if(palv.getPalvelus() == 1) {
								commonHtml = "<div style='float:right;width:45%'>" + commonHtml + "</div>";
							} else {
								if(palv.getPalvelus() % 2 == 0) {
									commonHtml = "<div style='margin-top: 15px;float:left;width:50%'>" + commonHtml + "</div>";
								} else {
									commonHtml = "<div style='margin-top: 15px;float:right;width:45%'>" + commonHtml + "</div>";
								}
							}
							// päivitetään olemassaoleva markkeri.
							String popupHtml = commonHtml;
							palv.appendPopup(popupHtml);
							number_of_all = number_of_all + 1;
						}
					} // for marker add
					
					if (paivitys == false) {// luodaan uusi markkeri
						PalveluMarker uusimarker = new PalveluMarker(latLon[0], latLon[1]);
						uusimarker.setKaupunki(p.getKaupunki());
						uusimarker.setKatuosoite(p.getKatuosoite());
						uusimarker.setTitle(p.getKatuosoite()+Const.STRING_SPACE+p.getKaupunki());
						uusimarker.appendPopup("<h4>"+p.getKatuosoite()+Const.STRING_SPACE+p.getKaupunki()+"</h4><div style='overflow: hidden'><div style='float:left;width:100%;'>" + commonHtml + "</div>");
						uusimarker.setCaption("<p>"+p.getKatuosoite()+"</p><p>"+p.getKaupunki()+"</p>");
						palvelut_kartassa.add(uusimarker);
						number_of_all = number_of_all + 1;
						
					}
				} else {// palvelu, jolla on koordinaatit, mutta tyyppi ei ole paikkasidonnainen
					number_of_virtual = number_of_virtual + 1;
				}
			} else { // palvelu, jolla ei koordinaatteja
				number_of_virtual = number_of_virtual + 1;
			}
		} //palvelut looppi
						
		// Lisätäänlopuksi markerit
		for (PalveluMarker palv:palvelut_kartassa) {
			LMarker leafletMarker = new LMarker(palv.getLat(), palv.getLon());
			leafletMarker.setIcon(FontAwesome.MAP_MARKER);
			leafletMarker.setPopup(palv.getPopup() + "</div>");
			leafletMarker.setTitle(palv.getTitle());
			leafletMarker.setCaption(palv.getCaption());
			leafletMarker.setCaptionAsHtml(true);
			leafletMap.addComponent(leafletMarker);
			leafletMarker.addClickListener(e -> {
					
			});
		}
		leafletMap.setCenter(40.0, 26.0);
		leafletMap.setZoomLevel(2.7);
		leafletMap.setCaption(translator.localize("Application.Tab.Map")+Const.STRING_SPACE+number_in_sight+"/"+number_of_all+Const.STRING_SPACE + translator.localize("Label.Palvelu.Osoiteeton")+" ("+number_of_virtual+")");
		leafletMap.addMoveEndListener(e -> {
			Bounds b = e.getBounds();
			number_in_sight = 0;
			for (PalveluMarker palv:palvelut_kartassa) {
				if (palv.getLat() > b.getSouthWestLat() && palv.getLat() < b.getNorthEastLat() && palv.getLon() > b.getSouthWestLon() && palv.getLon() < b.getNorthEastLon()) {
					number_in_sight = number_in_sight + palv.getPalvelus();
				}
			}
				leafletMap.setCaption(translator.localize("Label.Palvelu.naytetaan1")+Const.STRING_SPACE+number_in_sight+"/"+number_of_all+Const.STRING_SPACE+translator.localize("Label.Palvelu.naytetaan2")+". "+number_of_virtual+Const.STRING_SPACE+translator.localize("Label.Palvelu.Osoiteeton"));
			});
		
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		if(! isInitialized) {
			init();
			isInitialized = true;
		}
	}
	
	private class PalveluMarker {
		
		private Double lon = 0.0;
		private Double lat = 0.0;
		private String title = Const.STRING_EMPTY;
		private String popup = Const.STRING_EMPTY;
		private String caption = Const.STRING_EMPTY;
		private String katuosoite = Const.STRING_EMPTY;
		private String kaupunki = Const.STRING_EMPTY;
		private int palvelus = 0;
		
		public PalveluMarker(Double la, Double lo) {
			lon = lo;
			lat = la;
			title = Const.STRING_EMPTY;
			popup = Const.STRING_EMPTY;
			caption = Const.STRING_EMPTY;
			katuosoite = Const.STRING_EMPTY;
			kaupunki = Const.STRING_EMPTY;
			palvelus = 0; // montako palvelua tämän markkerin alla on
		}
		public Double getLon() {
			return lon;
		}
		public Double getLat() {
			return lat;
		}
		public String getTitle() {
			return title;
		}
		public String getPopup() {
			return popup;
		}
		public String getCaption() {
			return caption;
		}
		public String getKatuosoite() {
			return katuosoite;
		}
		public String getKaupunki() {
			return kaupunki;
		}
		public int getPalvelus() {
			return palvelus;
		}
		public void setTitle(String tit) {
			title = tit;
		}
		public void appendPopup(String pop) {
			if(palvelus == 1) {
				popup = popup.replaceFirst("width:100%", "width:50%");
			}
			popup = popup + pop;
			palvelus = palvelus + 1;
		}
		public void setCaption(String cap) {
			caption = cap;
		}
		public void setKatuosoite(String kat) {
			katuosoite = kat;
		}
		public void setKaupunki(String kau) {
			kaupunki = kau;
		}
	}
	
	@Override
	public String getViewName() {
		return NAME;
	}
}
