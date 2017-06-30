/**
 * 
 */
package fi.csc.avaa.tupa.result;

import java.util.List;
import java.util.stream.Collectors;

import com.vaadin.navigator.Navigator;
import com.vaadin.server.Page;
import fi.csc.avaa.tupa.ViewContent;
import fi.csc.avaa.tupa.tabs.InfraView;
import fi.csc.avaa.tupa.tabs.PalveluView;
import org.vaadin.addon.leaflet.LMap;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Accordion;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.TabSheet.Tab;
import com.vaadin.ui.VerticalLayout;

import fi.csc.avaa.tools.StringTools;
import fi.csc.avaa.tools.vaadin.language.LanguageTools;
import fi.csc.avaa.tools.vaadin.language.Translator;
import fi.csc.avaa.tupa.common.TupaDBCache;
import fi.csc.avaa.tupa.db.model.Infra;
import fi.csc.avaa.tupa.db.model.Palvelu;
import fi.csc.avaa.tupa.model.ExtInfra;
import fi.csc.avaa.tupa.model.ExtPalvelu;
import fi.csc.avaa.vaadin.tools.VaadinTools;
/**
 * @author jmlehtin
 *
 */
public class ServiceDetailsWindow extends TupaDetailsWindow {

	private static final long serialVersionUID = 1L;
	private ExtPalvelu extPalvelu;
	public static final String NAME = "service_details";

	public ServiceDetailsWindow(Translator translator, Navigator navigator, ViewContent viewContent) {
		super(translator, navigator, viewContent);
		addStyleName("service-details");
	}

	@Override
	protected void init() {
		this.extPalvelu = TupaDBCache.getPalveluCache().get(windowItemId);
		// In case of erroneous URL
		if(this.extPalvelu == null) {
			viewContent.setSkipFlag(false);
			navigator.navigateTo(InfraView.NAME);
			return;
		}
		Palvelu palvelu = extPalvelu.getPalvelu();
		List<ExtInfra> palveluInfrat = extPalvelu.getInfrat().stream()
				.map(i -> TupaDBCache.getInfraCache().get(i.getInfra_id()))
				.collect(Collectors.toList());
		
		String palveluNimi = LanguageTools.getFI_ENTranslatedValueOrEmpty(palvelu.getNimi(), palvelu.getName(), translator, true);
		setCaption(palveluNimi);
		
		VerticalLayout firstPart = new VerticalLayout();
		firstPart.setStyleName("basic-info-layout");
		firstPart.setMargin(new MarginInfo(false, false, false, true));
		firstPart.setSpacing(true);
		firstPart.setSizeFull();
		
		String kuvaus = LanguageTools.getFI_ENTranslatedValueOrEmpty(palvelu.getKuvaus(), palvelu.getDescription(), translator, true);
		if(!StringTools.isEmptyOrNull(kuvaus)) {
			Label kuvausLabel = new Label(kuvaus.replaceAll("\\n", "<br>"), ContentMode.HTML);
			kuvausLabel.addStyleName("details-description");
			firstPart.addComponent(kuvausLabel);
		}
		
		String palveluUrl = LanguageTools.getFI_ENTranslatedValueOrEmpty(palvelu.getURLfi(), palvelu.getURLen(), translator, true);
		if(!StringTools.isEmptyOrNull(palveluUrl)) {
			firstPart.addComponent(VaadinTools.createLink(palveluUrl, palveluUrl, false));
		}
		
		baseLayout.addComponent(firstPart);
		
		if(extPalvelu.getPalvelutyypit().size() > 0) {
			VerticalLayout secondPart = new VerticalLayout();
			secondPart.setStyleName("type-layout");
			secondPart.setMargin(new MarginInfo(false, false, false, true));
			secondPart.setSpacing(false);
			secondPart.setSizeFull();
			
			Label ppTyyppiLabel = new Label(translator.localize("Details.Service.PalveluPaikkatyypit"));
			ppTyyppiLabel.setStyleName("header");
			secondPart.addComponent(ppTyyppiLabel);
			
			setPalvelutyyppiIconsToLayout(extPalvelu, secondPart);
			setPaikkatyyppiIconToLayout(palvelu, secondPart);
			baseLayout.addComponent(secondPart);
		}
		
		if(extPalvelu.isLocationBound()) {
			VerticalLayout thirdPart = new VerticalLayout();
			thirdPart.setStyleName("location-layout");
			thirdPart.setMargin(new MarginInfo(false, false, true, true));
			thirdPart.setSpacing(false);
			thirdPart.setSizeFull();
			
			Label locationHeaderLabel = new Label(translator.localize("Details.Service.Sijainti"));
			locationHeaderLabel.setStyleName("header");
			thirdPart.addComponent(locationHeaderLabel);
			
			String locationStr = palvelu.getKaupunki();
			if(!StringTools.isEmptyOrNull(palvelu.getKatuosoite())) {
				locationStr = palvelu.getKatuosoite() + ", " + locationStr;
			}
			Label locationLabel = new Label(locationStr);
			thirdPart.addComponent(locationLabel);
			
			LMap locationMap = getLocationMap(palvelu,100, 200);
			if(locationMap != null) {
				thirdPart.addComponent(locationMap);
			}
			baseLayout.addComponent(thirdPart);
		}
		
		VerticalLayout fourthPart = getInfrasLayout(palveluInfrat);
		if(fourthPart != null) {
			baseLayout.addComponent(fourthPart);
		}
	}

	private VerticalLayout getInfraDetails(ExtInfra extInfra) {
		Infra infra = extInfra.getInfra();
		VerticalLayout infraLayout = new VerticalLayout();
		infraLayout.addStyleName("infra");
		infraLayout.setSpacing(true);
		infraLayout.setMargin(new MarginInfo(false, false, false, true));
		
		HorizontalLayout nameLogoLayout = new HorizontalLayout();
		nameLogoLayout.setStyleName("image-row");
		nameLogoLayout.setSizeFull();
		
		VerticalLayout namePart = new VerticalLayout();
		namePart.setSpacing(true);
		
		String infraLyhenne = LanguageTools.getFI_ENTranslatedValueOrEmpty(infra.getLyhenne(), infra.getAcronym(), translator, true);
		Label infraLyhenneLabel = new Label(infraLyhenne);
		infraLyhenneLabel.setStyleName("lyhenne no-bottom-margin-header bold");
		NativeButton infraNimiLink = VaadinTools.createLinkNativeButton(LanguageTools.getFI_ENTranslatedValueOrEmpty(infra.getNimi(), infra.getName(), translator, true), null, null, "nimi no-bottom-margin-header borderless bold");
		infraNimiLink.addClickListener(e -> {
			navigator.navigateTo(InfraDetailsWindow.NAME + "/" + infra.getInfra_id());
		});
		namePart.addComponent(infraLyhenneLabel);
		namePart.addComponent(infraNimiLink);
		nameLogoLayout.addComponent(namePart);
		
		VerticalLayout logoLayout = new VerticalLayout();
		logoLayout.setMargin(new MarginInfo(true, true, false, false));
		logoLayout.setSizeFull();
		Image logo = VaadinTools.createImageFromExternalResource(null, infra.getLogo_url());
		if(logo != null) {
			logo.setStyleName("logo");
			logo.setAlternateText(infraLyhenne);
			logoLayout.addComponent(logo);
			logoLayout.setComponentAlignment(logo, Alignment.TOP_CENTER);
			nameLogoLayout.addComponent(logoLayout);
			nameLogoLayout.setExpandRatio(namePart, 0.75f);
			nameLogoLayout.setExpandRatio(logoLayout, 0.25f);
			
		}
		infraLayout.addComponent(nameLogoLayout);
		
		VerticalLayout lifecycleLayout = getLifecycleLayout(infra, null, false, false);
		infraLayout.addComponents(lifecycleLayout);
		
//		VerticalLayout licenseLayout = new VerticalLayout();
//		licenseLayout.setSizeFull();
//		
//		Label licenseLabel = new Label(translator.localize("Details.Kayttoehdot"));
//		licenseLabel.setStyleName("header");
//		
//		licenseLayout.addComponent(licenseLabel);
//		Kayttoehto kEhto = extInfra.getKayttoehto();
//		licenseLayout.addComponent(getLicenseRatingLayout(extInfra));
//		
//		if(kEhto != null) {
//			licenseLayout.addComponent(getLicenceLinkLayout(extInfra));
//		}
//		infraLayout.addComponent(licenseLayout);
		return infraLayout;
	}
	
	private VerticalLayout getInfrasLayout(List<ExtInfra> infrat) {
		if(infrat != null && infrat.size() > 0) {
			VerticalLayout infrasLayout = new VerticalLayout();
			infrasLayout.setMargin(new MarginInfo(false, false, false, true));
			infrasLayout.setSpacing(true);
			infrasLayout.setSizeFull();
			Label infrasTitle = new Label(translator.localize("Details.Service.Infrastruktuurit"));
			infrasTitle.setStyleName("header");
			infrasLayout.addComponent(infrasTitle);
			
//			if(infrat.size() == 1) {
//				infrasLayout.addComponent(getInfraDetails(infrat.get(0)));
//			} else {
			Accordion infraAccordion = new Accordion();
			for(ExtInfra extInfra : infrat) {
				Tab tab = infraAccordion.addTab(getInfraDetails(extInfra));
				tab.setCaption(LanguageTools.getFI_ENTranslatedValueOrEmpty(extInfra.getInfra().getLyhenne(), extInfra.getInfra().getAcronym(), translator, true));					
			}
			infrasLayout.addComponent(infraAccordion);
//			}
			return infrasLayout;
		}
		return null;
	}
}
