/**
 * 
 */
package fi.csc.avaa.tupa.result;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

import org.vaadin.addon.leaflet.LMap;

import com.vaadin.server.FileDownloader;
import com.vaadin.server.Responsive;
import com.vaadin.server.StreamResource;
import com.vaadin.server.StreamResource.StreamSource;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Accordion;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.TabSheet.Tab;
import com.vaadin.ui.VerticalLayout;

import fi.csc.avaa.tools.Const;
import fi.csc.avaa.tools.StringTools;
import fi.csc.avaa.tools.Tools;
import fi.csc.avaa.tools.vaadin.language.LanguageTools;
import fi.csc.avaa.tools.vaadin.language.Translator;
import fi.csc.avaa.tupa.common.TupaConst;
import fi.csc.avaa.tupa.db.model.Avainsana;
import fi.csc.avaa.tupa.db.model.Infra;
import fi.csc.avaa.tupa.db.model.Kayttoehto;
import fi.csc.avaa.tupa.db.model.Organisaatio;
import fi.csc.avaa.tupa.db.model.Palvelutyyppi;
import fi.csc.avaa.tupa.db.model.Yhteystieto;
import fi.csc.avaa.tupa.model.ExtInfra;
import fi.csc.avaa.tupa.model.ExtOrganisaatio;
import fi.csc.avaa.tupa.model.ExtPalvelu;
import fi.csc.avaa.tupa.model.ExtYhteystieto;
import fi.csc.avaa.tupa.model.ModelTools;
import fi.csc.avaa.vaadin.tools.VaadinTools;
/**
 * @author jmlehtin
 *
 */
public class InfraDetailsWindow extends TupaDetailsWindow {

	private static final long serialVersionUID = 1L;
	private ExtInfra extInfra;
	
	/**
	 * @param caption
	 */
	public InfraDetailsWindow(Translator translator, ExtInfra extInfra) {
		super(translator);
		addStyleName("infra-details");
		this.extInfra = extInfra;
		init();
	}
	
	@Override
	protected void init() {
		Infra infra = extInfra.getInfra();
		Infra edellinenInfra = extInfra.getEdellinenInfra();
		Kayttoehto kayttoehto = extInfra.getKayttoehto();
		List<ExtPalvelu> palvelut = extInfra.getPalvelut();
		List<ExtYhteystieto> yhteystiedot = extInfra.getYhteystiedot();
		List<Avainsana> avainsanat = extInfra.getAvainsanat();
		
		HorizontalLayout firstPart = new HorizontalLayout();
		firstPart.setMargin(new MarginInfo(false, false, false, true));
		firstPart.setStyleName("image-row");
		firstPart.setSizeFull();
		
		VerticalLayout firstPartLeft = new VerticalLayout();
		firstPartLeft.setSpacing(true);
		
		String infraLyhenne = LanguageTools.getFI_ENTranslatedValueOrEmpty(infra.getLyhenne(), infra.getAcronym(), translator, true);
		setCaption(infraLyhenne);
		
		Label nimi = new Label(LanguageTools.getFI_ENTranslatedValueOrEmpty(infra.getNimi(), infra.getName(), translator, true));
		nimi.setStyleName("nimi x-large-font bold");
		firstPartLeft.addComponent(nimi);
		
		Label isni = new Label("ISNI: " + (StringTools.isEmptyOrNull(infra.getISNI()) ? translator.localize("Details.EiMaaritelty") : infra.getISNI()));
		isni.setStyleName("isni");
		isni.setDescription(translator.localize("Description.isni"));
		firstPartLeft.addComponent(isni);
		
		VerticalLayout nontIntlOrgLayout = new VerticalLayout();
		nontIntlOrgLayout.setSizeFull();
		List<ExtOrganisaatio> nonIntlOrgs = ModelTools.getAllNonIntlChildestExtOrganisations(extInfra);
		if(nonIntlOrgs != null) {
			for(ExtOrganisaatio nonIntlOrg : nonIntlOrgs) {
				String orgString = Const.STRING_EMPTY;
				orgString += LanguageTools.getFI_ENTranslatedValueOrEmpty(nonIntlOrg.getOrganisaatio().getNimi(), nonIntlOrg.getOrganisaatio().getName(), translator, true);
				List<Organisaatio> emoOrgs = nonIntlOrg.getEmoOrganisaatiot();
				if(emoOrgs != null && emoOrgs.size() > 0) {
					orgString += " - ";
					orgString += emoOrgs.stream().map(o -> LanguageTools.getFI_ENTranslatedValueOrEmpty(o.getNimi(), o.getName(), translator, true)).collect(Collectors.joining(" - "));
					orgString += TupaConst.ORGANISAATIO_MAA_FI.equals(emoOrgs.get(emoOrgs.size()-1).getMaa()) ? Const.STRING_EMPTY : " (" + emoOrgs.get(emoOrgs.size()-1).getMaa() + ")";
				} else {
					orgString += TupaConst.ORGANISAATIO_MAA_FI.equals(nonIntlOrg.getOrganisaatio().getMaa()) ? Const.STRING_EMPTY : " (" + nonIntlOrg.getOrganisaatio().getMaa() + ")";
				}
				Label orgLabel = new Label(orgString);
				nontIntlOrgLayout.addComponent(orgLabel);
			}
			firstPartLeft.addComponent(nontIntlOrgLayout);
		}
		
		List<Organisaatio> intlOrgs = ModelTools.getIntlHostOrganisations(extInfra);
		if(intlOrgs != null && intlOrgs.size() > 0) {
			String orgString = translator.localize("Details.Infra.KVIsannat");
			orgString += intlOrgs.stream().map(o -> LanguageTools.getFI_ENTranslatedValueOrEmpty(o.getNimi(), o.getName(), translator, true)).collect(Collectors.joining(", "));
			Label orgLabel = new Label(orgString);
			orgLabel.setDescription(translator.localize("Description.kvisanta"));
			firstPartLeft.addComponent(orgLabel);
		}
		
		firstPart.addComponent(firstPartLeft);
	
		VerticalLayout logoLayout = new VerticalLayout();
		logoLayout.setSizeFull();
		Image logo = VaadinTools.createImageFromExternalResource(null, infra.getLogo_url());
		if(logo != null) {
			logo.setStyleName("logo");
			logo.setAlternateText(infraLyhenne);
			logoLayout.addComponent(logo);
			logoLayout.setMargin(new MarginInfo(true, true, false, false));
			logoLayout.setComponentAlignment(logo, Alignment.TOP_CENTER);
			firstPart.addComponent(logoLayout);
			firstPart.setExpandRatio(firstPartLeft, 0.75f);
			firstPart.setExpandRatio(logoLayout, 0.25f);
		} 
		
		baseLayout.addComponent(firstPart);
		
		String kuvaus = LanguageTools.getFI_ENTranslatedValueOrEmpty(infra.getKuvaus(), infra.getDescription(), translator, true);
		if(!StringTools.isEmptyOrNull(kuvaus)) {
			VerticalLayout thirdPart = new VerticalLayout();
			thirdPart.setMargin(new MarginInfo(true, false, false, true));
			thirdPart.setSizeFull();
			Label kuvausLabel = new Label(kuvaus.replaceAll("\\n", "<br>"), ContentMode.HTML);
			kuvausLabel.setStyleName("details-description");
			thirdPart.addComponent(kuvausLabel);
			baseLayout.addComponent(thirdPart);
		}
		
		if(avainsanat != null && avainsanat.size() > 0) {
			VerticalLayout fourthPart = new VerticalLayout();
			fourthPart.setMargin(new MarginInfo(true, false, false, true));
			fourthPart.setSizeFull();
			fourthPart.setSpacing(true);
			
			Label keywordsLabel = new Label(translator.localize("Details.Infra.Avainsanat"));
			keywordsLabel.setStyleName("header");
			keywordsLabel.setDescription(translator.localize("Description.avainsanat"));
			
			CssLayout keywordsLayout = new CssLayout();
			keywordsLayout.setSizeUndefined();
			keywordsLayout.setStyleName("keywords");
			Responsive.makeResponsive(keywordsLayout);
			
			for(Avainsana as : avainsanat) {
				Label kwLabel = new Label(LanguageTools.getFI_ENTranslatedValueOrEmpty(as.getAvainsana(), as.getKeyword(), translator, true));
				kwLabel.setStyleName("keyword");
				keywordsLayout.addComponent(kwLabel);
				kwLabel.setSizeUndefined();
			}
			
			fourthPart.addComponent(keywordsLabel);
			fourthPart.addComponent(keywordsLayout);
			baseLayout.addComponent(fourthPart);
		}
		
		VerticalLayout fifthPart = getLifecycleLayout(infra, edellinenInfra, false, true);
		baseLayout.addComponent(fifthPart);
		
		VerticalLayout sixthPart = getServicesLayout(palvelut);
		if(sixthPart != null) {
			baseLayout.addComponent(sixthPart);
		}
		
//		VerticalLayout seventhPart = new VerticalLayout();
//		seventhPart.setMargin(new MarginInfo(true, false, false, true));
//		seventhPart.setSpacing(true);
//		seventhPart.setSizeFull();
//		
//		Label licenseLabel = new Label(translator.localize("Details.Kayttoehdot"));
//		licenseLabel.setStyleName("header");
//		seventhPart.addComponent(licenseLabel);
//		seventhPart.addComponent(getLicenseRatingLayout(extInfra));
//		if(kayttoehto != null) {
//			seventhPart.addComponent(getLicenceLinkLayout(extInfra));
//		}
//		baseLayout.addComponent(seventhPart);
		
		VerticalLayout eigthPart = new VerticalLayout();
		eigthPart.setMargin(new MarginInfo(true, false, false, true));
		eigthPart.setSpacing(true);
		
		if(yhteystiedot != null && yhteystiedot.size() > 0) {
			Label contactInfoLabel = new Label(translator.localize("Details.Infra.Yhteystiedot"));
			contactInfoLabel.setStyleName("header");
			contactInfoLabel.setDescription(translator.localize("Description.yhteystiedot"));
			
			VerticalLayout contactInfoLayout = new VerticalLayout();
			for(ExtYhteystieto extYt : yhteystiedot) {
				Yhteystieto yt = extYt.getYhteystieto();
				Organisaatio affOrg = extYt.getAffiliaatioOrganisaatio();
				
				String contactInfoTxt = "<p>";
//				HorizontalLayout contactRow = new HorizontalLayout();
//				contactRow.setSpacing(true);
//				Responsive.makeResponsive(contactRow);
				
				String ytKuvaus = LanguageTools.getFI_ENTranslatedValueOrEmpty(yt.getKuvaus(), yt.getDescription(), translator, true);
				String ytTitteli = StringTools.getStringOrEmptyValue(yt.getTitteli());
				String ytEtunimi = StringTools.getStringOrEmptyValue(yt.getEtunimi());
				String ytSukunimi = StringTools.getStringOrEmptyValue(yt.getSukunimi());
				Link ytSposti = VaadinTools.createLink(StringTools.getStringOrEmptyValue(yt.getSahkoposti()), StringTools.getStringOrEmptyValue(yt.getSahkoposti()), true);
				String ytPuh = StringTools.getStringOrEmptyValue(yt.getPuhelin());
				String affOrgStr = extYt.getAffiliaatioOrganisaatio() == null ? null : LanguageTools.getFI_ENTranslatedValueOrEmpty(affOrg.getNimi(), affOrg.getName(), translator, true);
				Link ytUrl = VaadinTools.createLink(yt.getURL(), yt.getURL(), false);
				
				if(!StringTools.isEmptyOrNull(ytKuvaus)) {
					contactInfoTxt += ytKuvaus + Const.STRING_SPACE + "|" + Const.STRING_SPACE;
//					contactRow.addComponent(new Label(ytKuvaus));
				}
				if(!StringTools.isEmptyOrNull(ytTitteli)) {
					contactInfoTxt += ytTitteli + Const.STRING_SPACE + "|" + Const.STRING_SPACE;
//					contactRow.addComponent(new Label(ytTitteli));	
				}
				if(!StringTools.isEmptyOrNull(ytEtunimi) && !StringTools.isEmptyOrNull(ytSukunimi)) {
					contactInfoTxt += ytEtunimi + Const.STRING_SPACE + ytSukunimi + Const.STRING_SPACE + "|" + Const.STRING_SPACE;
//					contactRow.addComponent(new Label(ytEtunimi + Const.STRING_SPACE + ytSukunimi));
				}
				if(!Tools.isNull(ytSposti)) {
					contactInfoTxt += "<a href='mailto:" + ytSposti.getCaption() + "' target='_self'><span>" + ytSposti.getCaption() + "</span></a>" + Const.STRING_SPACE + "|" + Const.STRING_SPACE;
//					contactRow.addComponent(ytSposti);
				}
				if(!StringTools.isEmptyOrNull(ytPuh)) {
					contactInfoTxt += ytPuh + Const.STRING_SPACE + "|" + Const.STRING_SPACE;
//					contactRow.addComponent(new Label(ytPuh));
				}
				if(!StringTools.isEmptyOrNull(affOrgStr)) {
					contactInfoTxt += affOrgStr + Const.STRING_SPACE + "|" + Const.STRING_SPACE;
//					contactRow.addComponent(new Label(affOrgStr));
				}
				if(!Tools.isNull(ytUrl)) {
					contactInfoTxt += "<a href='" + ytUrl.getCaption() + "' target='_blank'><span>" + ytUrl.getCaption() + "</span></a>";
//					contactRow.addComponent(ytUrl);
				} else if(contactInfoTxt.length() > 3) {
					contactInfoTxt = contactInfoTxt.substring(0, contactInfoTxt.length()-3);
				}
				contactInfoTxt += "</p>";
				contactInfoLayout.addComponent(new Label(contactInfoTxt, ContentMode.HTML));
			}
			
			eigthPart.addComponent(contactInfoLabel);
			eigthPart.addComponent(contactInfoLayout);
			baseLayout.addComponent(eigthPart);
		}
		
		VerticalLayout ninthPart = new VerticalLayout();
		ninthPart.setMargin(new MarginInfo(true, false, false, true));
		
		Image image = VaadinTools.createImageFromExternalResource(null, infra.getImage_url());
		VerticalLayout imageLayout = new VerticalLayout();
		imageLayout.setSizeFull();
		if(image != null) {
			image.setStyleName("image");
			image.setWidth(500, Unit.PIXELS);
			imageLayout.addComponent(image);
			imageLayout.setComponentAlignment(image, Alignment.MIDDLE_CENTER);
			ninthPart.addComponent(imageLayout);
			baseLayout.addComponent(ninthPart);
		}
		
		VerticalLayout tenthPart = new VerticalLayout();
		tenthPart.setMargin(new MarginInfo(true, false, false, false));
		tenthPart.setSizeFull();
		Button downloadInfraInfoBtn = downloadText();
		tenthPart.addComponent(downloadInfraInfoBtn);
		tenthPart.setComponentAlignment(downloadInfraInfoBtn, Alignment.BOTTOM_CENTER);
		baseLayout.addComponent(tenthPart);
	}
	
	public VerticalLayout getServicesLayout(List<ExtPalvelu> palvelut) {
		if(palvelut != null && palvelut.size() > 0) {
			VerticalLayout servicesLayout = new VerticalLayout();
			servicesLayout.setMargin(new MarginInfo(false, false, false, true));
			servicesLayout.setSpacing(true);
			servicesLayout.setSizeFull();
			Label servicesTitle = new Label(translator.localize("Details.Infra.Palvelut"));
			servicesTitle.setStyleName("header");
			servicesLayout.addComponent(servicesTitle);
			Accordion services = new Accordion();
			
			for (ExtPalvelu palvelu : palvelut) {
				VerticalLayout serviceLayout = new VerticalLayout();
				serviceLayout.addStyleName("service");
				serviceLayout.setMargin(true);
				serviceLayout.setSpacing(true);
				
				HorizontalLayout upperPart = new HorizontalLayout();
				upperPart.setMargin(false);
				upperPart.setSpacing(false);
				upperPart.setSizeFull();
				
				VerticalLayout upperLeftPart = new VerticalLayout();
				upperLeftPart.setSizeFull();
				upperLeftPart.setMargin(false);
				upperLeftPart.setSpacing(false);
				
				final int MAX_LINK_LENGTH = 70;
				String fiUrl = palvelu.getPalvelu().getURLfi();
				String enUrl = palvelu.getPalvelu().getURLen();
				Link link = VaadinTools.createLink(LanguageTools.getFI_ENTranslatedValueOrEmpty(fiUrl.length() > MAX_LINK_LENGTH ? fiUrl.substring(0, MAX_LINK_LENGTH) + "..." : fiUrl, enUrl.length() > MAX_LINK_LENGTH ? enUrl.substring(0, MAX_LINK_LENGTH) + "..." : enUrl, translator, true), LanguageTools.getFI_ENTranslatedValueOrEmpty(palvelu.getPalvelu().getURLfi(), palvelu.getPalvelu().getURLen(), translator, true), false);
				if(link != null) {
					link.addStyleName("service-link");
					upperLeftPart.addComponent(link);
				}
				
				setPalvelutyyppiIconsToLayout(palvelu, upperLeftPart);
				setPaikkatyyppiIconToLayout(palvelu.getPalvelu(), upperLeftPart);
				upperPart.addComponent(upperLeftPart);
				
				VerticalLayout upperRightPart = new VerticalLayout();
				upperRightPart.setSizeFull();
				upperRightPart.setMargin(false);
				upperRightPart.setSpacing(false);
				
				boolean hasMap = false;
				if(palvelu.isLocationBound()) {
					LMap locationMap = getLocationMap(palvelu.getPalvelu(), 70, 200);
					if(locationMap != null) {
						hasMap = true;
						upperRightPart.addComponent(locationMap);
						upperRightPart.setComponentAlignment(locationMap, Alignment.TOP_RIGHT);
					}
				}
				
				if(!hasMap) {
					String katuOs = palvelu.getPalvelu().getKatuosoite();
					String kaupunki = palvelu.getPalvelu().getKaupunki();
					
					if(!StringTools.isEmptyOrNull(katuOs)) {
						Label katuOsLbl = new Label(translator.localize("Label.Palvelu.Katuosoite") + ": " + katuOs);
						upperRightPart.addComponent(katuOsLbl);
					}
					if(!StringTools.isEmptyOrNull(kaupunki)) {
						Label kaupunkiLbl = new Label(translator.localize("Label.Palvelu.Kaupunki") + ": " + kaupunki);
						upperRightPart.addComponent(kaupunkiLbl);
					}
				}
				upperPart.addComponent(upperRightPart);
				upperPart.setExpandRatio(upperLeftPart, 0.6f);
				upperPart.setExpandRatio(upperRightPart, 0.4f);
				serviceLayout.addComponent(upperPart);
				
				String kuvaus = LanguageTools.getFI_ENTranslatedValueOrEmpty(palvelu.getPalvelu().getKuvaus(), palvelu.getPalvelu().getDescription(), translator, true);
				Label serviceDescr = new Label(kuvaus.replaceAll("\\n", "<br>"), ContentMode.HTML);
				serviceDescr.addStyleName("service-description");
				serviceLayout.addComponent(serviceDescr);
				Tab tab = services.addTab(serviceLayout);
				tab.setCaption(LanguageTools.getFI_ENTranslatedValueOrEmpty(palvelu.getPalvelu().getNimi(), palvelu.getPalvelu().getName(), translator, true));	
			}
			servicesLayout.addComponent(services);
			
			return servicesLayout;
		}
		return null;
	}
	
	private Button downloadText() {
		Button dl = new Button(translator.localize("Details.Infra.Download"));
		dl.setDescription(translator.localize("Description.download"));
		FileDownloader downloader = new FileDownloader(new StreamResource(null, ""));
		downloader.extend(dl);
		downloader.setFileDownloadResource(getTXT());
		dl.addClickListener(e -> {	
		});
		return dl;
	}
	
	private StreamResource getTXT() {
    	return new StreamResource(new StreamSource() {
			private static final long serialVersionUID = 1L;

		@Override
    	public InputStream getStream() { 
    		return new ByteArrayInputStream(getContents().toString().getBytes());
    		}
    	}, "Infradata.txt");	
	}
	
	private StringBuilder getContents() {
		Infra infra = extInfra.getInfra();
		Infra edellinenInfra = extInfra.getEdellinenInfra();
		Kayttoehto kayttoehto = extInfra.getKayttoehto();
		List<ExtPalvelu> palvelut = extInfra.getPalvelut();
		List<ExtYhteystieto> yhteystiedot = extInfra.getYhteystiedot();
		List<Avainsana> avainsanat = extInfra.getAvainsanat();
		
		StringBuilder sb = new StringBuilder();
		String nl = "\n";
		sb.append(infra.getNimi()+" - "+infra.getName()+nl+nl);
		sb.append("Lyhenne: "+infra.getLyhenne()+nl+"Acronym: "+infra.getAcronym()+nl+nl);
		sb.append("Nimi: "+infra.getNimi()+nl+"Name: "+infra.getName()+nl+nl);
		sb.append("ISNI: "+infra.getISNI()+nl+nl);
		
		List<ExtOrganisaatio> nonIntlOrgs = ModelTools.getAllNonIntlChildestExtOrganisations(extInfra);
		if(nonIntlOrgs == null) {
			sb.append("Vastuuorganisaatio"+nl+nl+"Nimi: "+nl+"Name:"+nl+"ISNI: +"+nl+"Maa: "+nl+nl);
		}
		for (ExtOrganisaatio nio : nonIntlOrgs) {
			sb.append("Vastuuorganisaatio"+nl+nl);
			List<Organisaatio> emoOrgs = nio.getEmoOrganisaatiot();
			for (Organisaatio org : emoOrgs) {
				sb.append("Nimi: "+org.getNimi()+nl+"Name: "+org.getName()+nl);
				sb.append("ISNI: "+org.getISNI()+nl+"Maa: "+org.getMaa()+nl+nl);
			}
			sb.append("Aliorganisaatio"+nl+nl);
			sb.append("Nimi: "+nio.getOrganisaatio().getNimi()+nl+"Name: "+nio.getOrganisaatio().getName()+nl);
			sb.append("ISNI: "+nio.getOrganisaatio().getISNI()+nl+"Maa: "+nio.getOrganisaatio().getMaa()+nl+nl);
		}
		
		List<Organisaatio> intlOrgs = ModelTools.getIntlHostOrganisations(extInfra);
		sb.append("Kansainvälinen isäntä: "+nl+nl);
		for (Organisaatio io : intlOrgs) {
			sb.append("Nimi: "+io.getNimi()+nl+"Name: "+io.getName()+nl);
			sb.append("ISNI: "+io.getISNI()+nl+"Maa: "+io.getMaa()+nl+nl);
		}
		sb.append(nl);
		sb.append("Kuvaus: "+infra.getKuvaus()+nl+"Description: "+infra.getDescription()+nl+nl+nl);
		
		if(avainsanat == null || avainsanat.size() == 0) {
			sb.append("Avainsana: "+nl+"Keyword :"+nl+nl);
		}
		for(Avainsana as : avainsanat) {
			sb.append("Avainsana: "+as.getAvainsana()+nl+"Keyword :"+as.getKeyword()+nl+nl);
		}
		sb.append(nl);
		sb.append("Elinkaari"+nl+nl);
		sb.append("Valmistelun alku: "+infra.getValmistelu_aloitusvuosi()+nl+"Rakentamisen alku: "+infra.getRakennus_aloitusvuosi()+nl+"Toiminnan alku: "+infra.getToiminta_aloitusvuosi()+nl+"Toiminnan loppu: "+infra.getToiminta_lopetusvuosi()+nl+"Aktiivinen: "+infra.getAktiivinen()+nl+nl);
		
		sb.append("Edellinen infra"+nl+nl);
		try {
		sb.append("Nimi: "+edellinenInfra.getNimi()+nl+"Name: "+edellinenInfra.getName()+nl+nl);
		} catch (NullPointerException e) {
			sb.append("Nimi: "+nl+"Name: "+nl+nl);
		}
		sb.append("Palvelut"+nl+nl);
		for (ExtPalvelu palvelu : palvelut) {
			sb.append("-------------------------------------"+nl);
			sb.append("Nimi: "+palvelu.getPalvelu().getNimi()+nl+"Name: "+palvelu.getPalvelu().getName()+nl+nl);
			sb.append("Kuvaus: "+palvelu.getPalvelu().getKuvaus()+nl+"Description: "+palvelu.getPalvelu().getDescription()+nl+nl);
			sb.append("URLfi: "+palvelu.getPalvelu().getURLfi()+nl+"URLen: "+palvelu.getPalvelu().getURLen()+nl+nl);
			sb.append("Katuosoite: "+palvelu.getPalvelu().getKatuosoite()+nl+"Kaupunki: "+palvelu.getPalvelu().getKaupunki()+nl+"Paikkatyyppi: "+ModelTools.getSeliteName(palvelu.getPalvelu().getPaikkatyyppi(), translator)+nl+nl);
			for(Palvelutyyppi pt : palvelu.getPalvelutyypit()) {
				sb.append("Palvelutyyppi: "+ModelTools.getSeliteName(pt.getTyyppi(), translator)+nl);
			}
			sb.append(nl);
		}
		sb.append("Käyttöehdot"+nl+nl);
		try {	sb.append("Saavutettavuus: "+ModelTools.getSeliteName(kayttoehto.getSaavutettavuus(), translator)+nl);} catch (NullPointerException ne) { sb.append("Saavutettavuus: "+nl);}
		try {	sb.append("Anonymiteetti: "+ModelTools.getSeliteName(kayttoehto.getAnonymiteetti(), translator)+nl);} catch (NullPointerException ne) {sb.append("Anonymiteetti: "+nl);}
		try {	sb.append("Maksullisuus :"+ModelTools.getSeliteName(kayttoehto.getMaksullisuus(), translator)+nl);} catch (NullPointerException ne) {sb.append("Maksullisuus :"+nl);}
		try {	sb.append("Tulosten julkaisuvelvoite: "+ModelTools.getSeliteName(kayttoehto.getTulosten_julkaisuvelvoite(), translator)+nl);} catch (NullPointerException ne) {sb.append("Tulosten julkaisuvelvoite: "+nl);}
		try {	sb.append("Tuotoksien julkaisuvelvoite: "+ModelTools.getSeliteName(kayttoehto.getTuotoksien_julkaisuvelvoite(), translator)+nl);} catch (NullPointerException ne) {sb.append("Tuotoksien julkaisuvelvoite: "+nl);}
		try {	sb.append("Osaamisen avoimuus: "+ModelTools.getSeliteName(kayttoehto.getOsaamisen_avoimuus(), translator)+nl);} catch (NullPointerException ne) {sb.append("Osaamisen avoimuus: "+nl);}
		try {	sb.append("Seurantatyokalut: "+ModelTools.getSeliteName(kayttoehto.getSeurantatyokalut(), translator)+nl);} catch (NullPointerException ne) {sb.append("Seurantatyokalut: "+nl);}
		try {	sb.append("Tulosten lisensointi: "+ModelTools.getSeliteName(kayttoehto.getTulosten_lisensointi(), translator)+nl);} catch (NullPointerException ne) {sb.append("Tulosten lisensointi: "+nl);}
		try {	sb.append("URLfi: "+kayttoehto.getURLfi()+nl);} catch (NullPointerException ne) {sb.append("URLfi: "+nl);}
		try {	sb.append("URLen: "+kayttoehto.getURLen()+nl+nl);} catch (NullPointerException ne) {sb.append("URLen: "+nl);}
		
		sb.append("Yhteystiedot"+nl+nl);
		for(ExtYhteystieto extYt : yhteystiedot) {
			Yhteystieto yt = extYt.getYhteystieto();
			Organisaatio affOrg = extYt.getAffiliaatioOrganisaatio();
			String ytKuvaus = StringTools.getStringOrEmptyValue(yt.getKuvaus());
			String ytDesc = StringTools.getStringOrEmptyValue(yt.getDescription());
			String ytTitteli = StringTools.getStringOrEmptyValue(yt.getTitteli());
			String ytEtunimi = StringTools.getStringOrEmptyValue(yt.getEtunimi());
			String ytSukunimi = StringTools.getStringOrEmptyValue(yt.getSukunimi());
			String ytSposti = StringTools.getStringOrEmptyValue(yt.getSahkoposti());
			String ytPuh = StringTools.getStringOrEmptyValue(yt.getPuhelin());
			String affOrgStr = extYt.getAffiliaatioOrganisaatio() == null ? null : LanguageTools.getFI_ENTranslatedValueOrEmpty(affOrg.getNimi(), affOrg.getName(), translator, true);
			String ytUrl = StringTools.getStringOrEmptyValue(yt.getURL());
		    sb.append("Titteli: "+ytTitteli+nl);
		    sb.append("Etunimi: "+ytEtunimi+nl);
		    sb.append("Sukunimi: "+ytSukunimi+nl);
		    sb.append("Sähköposti: "+ytSposti+nl);
		    sb.append("Puh: "+ytPuh+nl);
		    sb.append("Organisaatio: "+affOrgStr+nl);
		    sb.append("URL: "+ytUrl+nl);
		    sb.append("Kuvaus: "+ytKuvaus+nl);
		    sb.append("Description: "+ytDesc+nl+nl);
		}
			
		return sb;
	}
	public static void main(String[] args) {
	}

//	@Override
//	public void blur(BlurEvent event) {
//		this.close();
//	}
}
