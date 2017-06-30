package fi.csc.avaa.tupa.result;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.Page;
import com.vaadin.ui.*;
import fi.csc.avaa.tupa.ViewContent;
import fi.csc.avaa.tupa.tabs.*;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.LMarker;
import org.vaadin.addon.leaflet.LOpenStreetMapLayer;

import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.shared.ui.window.WindowMode;

import fi.csc.avaa.tools.Const;
import fi.csc.avaa.tools.StringTools;
import fi.csc.avaa.tools.Tools;
import fi.csc.avaa.tools.vaadin.customcomponent.ItemDetailsWindow;
import fi.csc.avaa.tools.vaadin.language.LanguageConst;
import fi.csc.avaa.tools.vaadin.language.LanguageTools;
import fi.csc.avaa.tools.vaadin.language.Translator;
import fi.csc.avaa.tupa.common.MapTools;
import fi.csc.avaa.tupa.common.OpennesStars;
import fi.csc.avaa.tupa.common.TupaConst;
import fi.csc.avaa.tupa.common.TupaDBCache;
import fi.csc.avaa.tupa.db.model.Infra;
import fi.csc.avaa.tupa.db.model.Kayttoehto;
import fi.csc.avaa.tupa.db.model.Palvelu;
import fi.csc.avaa.tupa.db.model.Palvelutyyppi;
import fi.csc.avaa.tupa.model.ExtInfra;
import fi.csc.avaa.tupa.model.ExtPalvelu;
import fi.csc.avaa.tupa.model.ModelTools;
import fi.csc.avaa.vaadin.tools.VaadinTools;
import org.vaadin.addon.leaflet.LWmsLayer;

public abstract class TupaDetailsWindow extends ItemDetailsWindow implements View {

	private static final long serialVersionUID = 1L;
	protected int windowItemId;
	protected Navigator navigator;
	protected ViewContent viewContent;
	private String cameFromUriFragment = null;

	public TupaDetailsWindow(Translator translator, Navigator navigator, ViewContent viewContent) {
		super(translator, 1000, 600, true, true, true);
		this.navigator = navigator;
		this.viewContent = viewContent;
		addStyleName("tupa-details");
		setResizable(true);
		setModal(true);
		addWindowModeChangeListener(e -> {
			if(WindowMode.NORMAL == e.getWindowMode()) {
				removeStyleName("maximized");
			} else if(WindowMode.MAXIMIZED == e.getWindowMode()) {
				addStyleName("maximized");
			}
		});
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent event) {
		center();
		baseLayout.removeAllComponents();
		if(!StringTools.isEmptyOrNull(event.getParameters())) {
			try {
				windowItemId = Integer.parseInt(event.getParameters());
			} catch(NumberFormatException e) {
				viewContent.setSkipFlag(false);
				navigator.navigateTo(InfraView.NAME);
				return;
			}

			cameFromUriFragment = null;
			View oldView = event.getOldView();
			if(oldView != null && oldView instanceof NamedView) {
				NamedView oldNamedView = (NamedView) oldView;
				if (oldNamedView.getViewName().equals(InfraView.NAME)) {
					cameFromUriFragment = "!" + InfraView.NAME;
				}
				else if (oldNamedView.getViewName().equals(PalveluView.NAME)) {
					cameFromUriFragment = "!" + PalveluView.NAME;
				}
				else if (oldNamedView.getViewName().equals(MapView.NAME)) {
					cameFromUriFragment = "!" + MapView.NAME;
				}
				else if (oldNamedView.getViewName().equals(AboutView.NAME)) {
					cameFromUriFragment = "!" + AboutView.NAME;
				}
			}

			getListeners(CloseEvent.class).stream().forEach(l -> removeCloseListener((CloseListener)l));
			addCloseListener(e -> {
				if(cameFromUriFragment == null) {
					viewContent.setSkipFlag(false);
					Page.getCurrent().setUriFragment("!" + InfraView.NAME);
				} else {
					Page.getCurrent().setUriFragment(cameFromUriFragment);
				}
			});

			init();
			if(!UI.getCurrent().getWindows().contains(this)) {
				UI.getCurrent().addWindow(this);
				this.focus();
			}
		}
	}

	protected AbstractLayout getLicenceLinkLayout(ExtInfra extInfra) {
		Kayttoehto kEhto = extInfra.getKayttoehto();
		Link readMoreLink = null;
		HorizontalLayout readMoreLayout = new HorizontalLayout();
		readMoreLayout.addStyleName("licence-link-layout");
		readMoreLayout.setSpacing(true);
		if(LanguageConst.LOCALE_FI.equals(translator.getDefaultLocale())) {
			if(!StringTools.isEmptyOrNull(kEhto.getURLfi())) {
				readMoreLink = VaadinTools.createLink(kEhto.getURLfi(), kEhto.getURLfi(), false);
			}
		} else if(LanguageConst.LOCALE_EN.equals(translator.getDefaultLocale())) {
			if(!StringTools.isEmptyOrNull(kEhto.getURLen())) {
				readMoreLink = VaadinTools.createLink(kEhto.getURLen(), kEhto.getURLen(), false);
			}
		}
		if(readMoreLink != null) {
			readMoreLink.setStyleName("licence-link");
			readMoreLayout.addComponent(new Label(translator.localize("Details.Kayttoehdot.LueLisaa")));
			readMoreLayout.addComponent(readMoreLink);
		}
		return readMoreLayout;
	}
	
//	protected AbstractLayout getLicenseRatingLayout(ExtInfra extInfra) {
//		GridLayout licenseGridLayout = new GridLayout(4, 8);
//		Kayttoehto kayttoehto = extInfra.getKayttoehto();
//		
//		addSaavutettavuusRow(licenseGridLayout, kayttoehto);
//		addAnonymiteettiRow(licenseGridLayout, kayttoehto);
//		addMaksullisuusRow(licenseGridLayout, kayttoehto);
//		addTulostenJulkaisuVelvoiteRow(licenseGridLayout, kayttoehto);
//		addTuotoksienJulkaisuVelvoiteRow(licenseGridLayout, kayttoehto);
//		addOsaamisenAvoimuusRow(licenseGridLayout, kayttoehto);
//		addSeurantaTyokalutRow(licenseGridLayout, kayttoehto);
//		addTulostenLisensiointiRow(licenseGridLayout, kayttoehto);
//		
//		Label ratingLabel = new Label(ModelTools.getOpennessRatingForInfra(extInfra, translator), ContentMode.HTML);
//		ratingLabel.setStyleName("openness-rating");
//		ratingLabel.setDescription(LanguageTools.getLocalizedValueForFieldOrEmpty(TupaConst.KEY_KAYTTOEHTO_KESKIARVO, translator));
//		licenseGridLayout.addComponent(ratingLabel, 3, 2, 3, 7);
//		return licenseGridLayout;
//	}
//	
//	private void addSaavutettavuusRow(GridLayout licenseGridLayout, Kayttoehto kayttoehto) {
//		licenseGridLayout.addComponent(getLicenseTermLayout("Details.Kayttoehdot.Saavutettavuus"), 0, 0);
//		licenseGridLayout.addComponent(getLicenseValueLayout(kayttoehto == null ? 0 : kayttoehto.getSaavutettavuus()), 1, 0);
//		licenseGridLayout.addComponent(getLicenseStarsLayout(kayttoehto == null ? 0 : kayttoehto.getSaavutettavuus()), 2, 0);
//	}
//
//	private void addAnonymiteettiRow(GridLayout licenseGridLayout, Kayttoehto kayttoehto) {
//		licenseGridLayout.addComponent(getLicenseTermLayout("Details.Kayttoehdot.Anonymiteetti"), 0, 1);
//		licenseGridLayout.addComponent(getLicenseValueLayout(kayttoehto == null ? 0 : kayttoehto.getAnonymiteetti()), 1, 1);
//		licenseGridLayout.addComponent(getLicenseStarsLayout(kayttoehto == null ? 0 : kayttoehto.getAnonymiteetti()), 2, 1);
//	}
//
//	private void addMaksullisuusRow(GridLayout licenseGridLayout, Kayttoehto kayttoehto) {
//		licenseGridLayout.addComponent(getLicenseTermLayout("Details.Kayttoehdot.Maksullisuus"), 0, 2);
//		licenseGridLayout.addComponent(getLicenseValueLayout(kayttoehto == null ? 0 : kayttoehto.getMaksullisuus()), 1, 2);
//		licenseGridLayout.addComponent(getLicenseStarsLayout(kayttoehto == null ? 0 : kayttoehto.getMaksullisuus()), 2, 2);
//	}
//
//	private void addTulostenJulkaisuVelvoiteRow(GridLayout licenseGridLayout, Kayttoehto kayttoehto) {
//		licenseGridLayout.addComponent(getLicenseTermLayout("Details.Kayttoehdot.TulostenJulkaisuvelvoite"), 0, 3);
//		licenseGridLayout.addComponent(getLicenseValueLayout(kayttoehto == null ? 0 : kayttoehto.getTulosten_julkaisuvelvoite()), 1, 3);
//		licenseGridLayout.addComponent(getLicenseStarsLayout(kayttoehto == null ? 0 : kayttoehto.getTulosten_julkaisuvelvoite()), 2,  3);
//	}
//
//	private void addTuotoksienJulkaisuVelvoiteRow(GridLayout licenseGridLayout, Kayttoehto kayttoehto) {
//		licenseGridLayout.addComponent(getLicenseTermLayout("Details.Kayttoehdot.TuotoksienJulkaisuvelvoite"), 0, 4);
//		licenseGridLayout.addComponent(getLicenseValueLayout(kayttoehto == null ? 0 : kayttoehto.getTuotoksien_julkaisuvelvoite()), 1, 4);
//		licenseGridLayout.addComponent(getLicenseStarsLayout(kayttoehto == null ? 0 : kayttoehto.getTuotoksien_julkaisuvelvoite()), 2, 4);
//	}
//
//	private void addOsaamisenAvoimuusRow(GridLayout licenseGridLayout, Kayttoehto kayttoehto) {
//		licenseGridLayout.addComponent(getLicenseTermLayout("Details.Kayttoehdot.OsaamisenAvoimuus"), 0, 5);
//		licenseGridLayout.addComponent(getLicenseValueLayout(kayttoehto == null ? 0 : kayttoehto.getOsaamisen_avoimuus()), 1, 5);
//		licenseGridLayout.addComponent(getLicenseStarsLayout(kayttoehto == null ? 0 : kayttoehto.getOsaamisen_avoimuus()), 2, 5);
//	}
//
//	private void addSeurantaTyokalutRow(GridLayout licenseGridLayout, Kayttoehto kayttoehto) {
//		licenseGridLayout.addComponent(getLicenseTermLayout("Details.Kayttoehdot.Seurantatyokalut"), 0, 6);
//		licenseGridLayout.addComponent(getLicenseValueLayout(kayttoehto == null ? 0 : kayttoehto.getSeurantatyokalut()), 1, 6);
//		licenseGridLayout.addComponent(getLicenseStarsLayout(kayttoehto == null ? 0 : kayttoehto.getSeurantatyokalut()), 2, 6);
//	}
//
//	private void addTulostenLisensiointiRow(GridLayout licenseGridLayout, Kayttoehto kayttoehto) {
//		licenseGridLayout.addComponent(getLicenseTermLayout("Details.Kayttoehdot.TulostenLisensointi"), 0, 7);
//		licenseGridLayout.addComponent(getLicenseValueLayout(kayttoehto == null ? 0 : kayttoehto.getTulosten_lisensointi()), 1, 7);
//		licenseGridLayout.addComponent(getLicenseStarsLayout(kayttoehto == null ? 0 : kayttoehto.getTulosten_lisensointi()), 2, 7);
//	}
	
	protected HorizontalLayout getLicenseTermLayout(String licensePropertyKey) {
		HorizontalLayout licenseTermLayout = new HorizontalLayout();
		licenseTermLayout.setMargin(new MarginInfo(false, true, false, false));
		licenseTermLayout.setSpacing(true);
		Label licenseKeyLabel = new Label(translator.localize(licensePropertyKey));
		String licensedescriptionkey = licensePropertyKey.replace("Details", "Description");
		licenseKeyLabel.setDescription(translator.localize(licensedescriptionkey));
		licenseTermLayout.addComponent(licenseKeyLabel);
		return licenseTermLayout;
	}
	
	protected HorizontalLayout getLicenseValueLayout(int licenseId) {
		HorizontalLayout licenseValueLayout = new HorizontalLayout();
		licenseValueLayout.setMargin(new MarginInfo(false, true, false, false));
		licenseValueLayout.setSpacing(true);
		Label licenseValueLabel = new Label(licenseId > 0 ? ModelTools.getSeliteName(licenseId, translator) : translator.localize("Details.EiMaaritelty").toLowerCase());
		licenseValueLayout.addComponent(licenseValueLabel);
		return licenseValueLayout;
	}

	protected HorizontalLayout getLicenseStarsLayout(int licenseId) {
		HorizontalLayout licenseOpennessLayout = new HorizontalLayout();
		licenseOpennessLayout.setMargin(new MarginInfo(false, true, false, false));
		licenseOpennessLayout.setSpacing(true);
		licenseOpennessLayout.setSizeFull();
		Label licenseOpennessLabel = new OpennesStars(translator, licenseId % 10);
		licenseOpennessLayout.addComponent(licenseOpennessLabel);
		return licenseOpennessLayout;
	}
	
	protected void setPalvelutyyppiIconsToLayout(ExtPalvelu extPalvelu, AbstractLayout layout) {
		for (Palvelutyyppi pTyyppi : extPalvelu.getPalvelutyypit()) {
			String icon = Const.STRING_EMPTY;
			String description = "";
			if (TupaConst.PALVELUTYYPPI_AINEISTO_ID == pTyyppi.getTyyppi()) {
				description = ModelTools.getSeliteDescription(TupaConst.PALVELUTYYPPI_AINEISTO_ID, translator);
				icon = FontAwesome.ARCHIVE.getHtml();
			} else if(TupaConst.PALVELUTYYPPI_LAITTEISTO_ID == pTyyppi.getTyyppi()) {
				description = ModelTools.getSeliteDescription(TupaConst.PALVELUTYYPPI_LAITTEISTO_ID, translator);
				icon = FontAwesome.FLASK.getHtml();
			} else if(TupaConst.PALVELUTYYPPI_PALVELU_ID == pTyyppi.getTyyppi()) {
				description = ModelTools.getSeliteDescription(TupaConst.PALVELUTYYPPI_PALVELU_ID, translator);
				icon = FontAwesome.USER_MD.getHtml();
			}
			Label pTyyppiLabel = new Label(icon + Const.STRING_SPACE + ModelTools.getSeliteName(pTyyppi.getTyyppi(), translator), ContentMode.HTML);
			pTyyppiLabel.setDescription(description);
			layout.addComponent(pTyyppiLabel);
		}
	}
	
	protected void setPaikkatyyppiIconToLayout(Palvelu palvelu, AbstractLayout layout) {
		int paikkaTyyppiId = palvelu.getPaikkatyyppi();
		if(paikkaTyyppiId > 0) {
			String icon = "";
			String description = "";
			if(TupaConst.PAIKKATYYPPI_HAJAUTETTU_ID == paikkaTyyppiId) {
				description = ModelTools.getSeliteDescription(TupaConst.PAIKKATYYPPI_HAJAUTETTU_ID, translator);
				icon += FontAwesome.SITEMAP.getHtml();
			} else if(TupaConst.PAIKKATYYPPI_VIRTUAALINEN_ID == paikkaTyyppiId) {
				description = ModelTools.getSeliteDescription(TupaConst.PAIKKATYYPPI_VIRTUAALINEN_ID, translator);
				icon += FontAwesome.CLOUD_DOWNLOAD.getHtml();
			} else if(TupaConst.PAIKKATYYPPI_PAIKKASIDONNAINEN_ID == paikkaTyyppiId) {
				description = ModelTools.getSeliteDescription(TupaConst.PAIKKATYYPPI_PAIKKASIDONNAINEN_ID, translator);
				icon += FontAwesome.MAP_MARKER.getHtml();
			}
			Label la = new Label(icon+" "+ModelTools.getSeliteName(paikkaTyyppiId, translator), ContentMode.HTML);
			la.setDescription(description);
			layout.addComponent(la);
		}
	}
	
	protected VerticalLayout getLifecycleLayout(Infra infra, Infra edellinenInfra, boolean useTopMargin, boolean useLeftMargin) {
		VerticalLayout lifecycleLayout = new VerticalLayout();
		lifecycleLayout.setMargin(new MarginInfo(useTopMargin, false, false, useLeftMargin));
		lifecycleLayout.setSizeFull();
		Label lifecycleLabel = new Label(translator.localize("Details.Elinkaari"));
		lifecycleLabel.setStyleName("header");
		
		if(	infra.getValmistelu_aloitusvuosi() > 0 ||
			infra.getRakennus_aloitusvuosi() > 0 ||
			infra.getToiminta_aloitusvuosi() > 0 ||
			infra.getToiminta_lopetusvuosi() > 0) {
				
			HorizontalLayout yearLayout = new HorizontalLayout();
			yearLayout.setMargin(false);
			yearLayout.setSpacing(true);
			yearLayout.setSizeUndefined();
			
			if(infra.getValmistelu_aloitusvuosi() > 0) {
				Label label = new Label(translator.localize("Details.Elinkaari.Valmistelu") + infra.getValmistelu_aloitusvuosi());
				label.setDescription(translator.localize("Description.valmistelu"));
				yearLayout.addComponent(label);
			}
			if(infra.getRakennus_aloitusvuosi() > 0) {
				if(yearLayout.getComponentCount() > 0) {
					Label dashLabel = new Label("-");
					yearLayout.addComponent(dashLabel);
				}
				Label label = new Label(translator.localize("Details.Elinkaari.Rakennus") + infra.getRakennus_aloitusvuosi());
				label.setDescription(translator.localize("Description.rakennus"));
				yearLayout.addComponent(label);
			}
			if(infra.getToiminta_aloitusvuosi() > 0) {
				if(yearLayout.getComponentCount() > 0) {
					Label dashLabel = new Label("-");
					yearLayout.addComponent(dashLabel);
				}
				Label label = new Label(translator.localize("Details.Elinkaari.ToimintaAlkoi") + infra.getToiminta_aloitusvuosi());
				label.setDescription(translator.localize("Description.toimintaalkoi"));
				yearLayout.addComponent(label);
			}
			if(infra.getToiminta_lopetusvuosi() > 0) {
				if(yearLayout.getComponentCount() > 0) {
					Label dashLabel = new Label("-");
					yearLayout.addComponent(dashLabel);
				}
				Label label = new Label(translator.localize("Details.Elinkaari.ToimintaLoppui") + infra.getToiminta_lopetusvuosi());
				label.setDescription(translator.localize("Description.toimintaloppui"));
				yearLayout.addComponent(label);
			}
			
			lifecycleLayout.addComponent(lifecycleLabel);
			lifecycleLayout.addComponent(yearLayout);
		}
		
		HorizontalLayout isActiveLayout =  new HorizontalLayout();
		isActiveLayout.setSpacing(true);
		isActiveLayout.setMargin(false);
		if(lifecycleLayout.getComponentIndex(lifecycleLabel) == -1) {
			lifecycleLayout.addComponent(lifecycleLabel);
		}
		if(infra.getAktiivinen()) {
			isActiveLayout.addComponent(new Label(translator.localize("Details.Active")));
			isActiveLayout.setDescription(translator.localize("Description.aktiivinen"));
		} else {
			isActiveLayout.addComponent(new Label(translator.localize("Details.Inactive")));
		}
		lifecycleLayout.addComponent(isActiveLayout);
		
		if(edellinenInfra != null) {
			HorizontalLayout prevInfraLayout = new HorizontalLayout();
			prevInfraLayout.setMargin(false);
			prevInfraLayout.setSpacing(true);
			prevInfraLayout.addComponent(new Label(translator.localize("Details.Infra.Previous")));
			prevInfraLayout.setDescription(translator.localize("Description.edellinen"));
			Button prevInfraBtn = VaadinTools.createLinkNativeButton(LanguageTools.getFI_ENTranslatedValueOrEmpty(edellinenInfra.getNimi(), edellinenInfra.getName(), translator, true), null, null, null);
			prevInfraBtn.addStyleName("borderless");
			prevInfraBtn.addClickListener(e -> {
				navigator.navigateTo(InfraDetailsWindow.NAME + "/" + edellinenInfra.getInfra_id());
			});
			prevInfraLayout.addComponent(prevInfraBtn);
			lifecycleLayout.addComponent(prevInfraLayout);
		}
		return lifecycleLayout;
	}
	
	protected LMap getLocationMap(Palvelu palvelu, int widthInPercent, int heightInPixels) {
		Double[] latLon = MapTools.getLatLong(palvelu);
		if (!Tools.isNull(latLon)) { 
			LMap leafletMap = new LMap();
			leafletMap.setCenter(latLon[0], latLon[1]);
			leafletMap.setZoomLevel(15);
			LWmsLayer bgLayer = new LWmsLayer();
			bgLayer.setUrl("http://ows.terrestris.de/osm/service");
			bgLayer.setLayers("OSM-WMS");
			bgLayer.setVersion("1.1.0");
			bgLayer.setAttributionString("© <a target=\"_blank\" href=\"http://ows.terrestris.de/dienste.html\">terrestris</a>. Data: © <a target=\"_blank\" href=\"http://www.openstreetmap.org/copyright\">OpenStreetMap contributors</a>");
			leafletMap.addLayer(bgLayer);
			LMarker leafletMarker = new LMarker(latLon[0], latLon[1]);
			
			leafletMarker.setIcon(FontAwesome.MAP_MARKER);
			leafletMarker.setPopup(StringTools.isEmptyOrNull(palvelu.getKatuosoite()) ? palvelu.getKaupunki() : palvelu.getKatuosoite() + ", " + palvelu.getKaupunki());
			leafletMarker.setTitle(StringTools.isEmptyOrNull(palvelu.getKatuosoite()) ? palvelu.getKaupunki() : palvelu.getKatuosoite() + ", " + palvelu.getKaupunki());
			
			leafletMarker.setCaptionAsHtml(true);
			leafletMap.addComponent(leafletMarker);
			leafletMarker.openPopup();
			
			if(StringTools.isEmptyOrNull(palvelu.getKatuosoite())) {
				leafletMap.setZoomLevel(5);
			}
			
			leafletMap.setWidth(widthInPercent, Unit.PERCENTAGE);
			leafletMap.setHeight(heightInPixels, Unit.PIXELS);
			return leafletMap;
		}
		return null;
	}

}
