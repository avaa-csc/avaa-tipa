/**
 * 
 */
package fi.csc.avaa.tupa;

import java.util.Collection;
import java.util.Locale;

import com.vaadin.addon.ipcforliferay.LiferayIPC;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.JavaScript;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.ProgressBar;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import fi.csc.avaa.tools.Const;
import fi.csc.avaa.tools.vaadin.language.LanguageChangeEvent;
import fi.csc.avaa.tools.vaadin.language.LanguageChangeListener;
import fi.csc.avaa.tools.vaadin.language.LanguageConst;
import fi.csc.avaa.tools.vaadin.language.Translator;
import fi.csc.avaa.tupa.common.TupaConst;
import fi.csc.avaa.tupa.common.TupaDBCache;
import fi.csc.avaa.tupa.model.ExtInfra;
import fi.csc.avaa.tupa.result.ServiceDetailsWindow;
import fi.csc.avaa.tupa.tabs.AboutView;
import fi.csc.avaa.tupa.tabs.ErrorView;
import fi.csc.avaa.tupa.tabs.InfraView;
import fi.csc.avaa.tupa.tabs.MapView;
import fi.csc.avaa.tupa.tabs.NamedView;
import fi.csc.avaa.tupa.tabs.PalveluView;
import fi.csc.avaa.vaadin.tools.VaadinTools;

/**
 * @author jmlehtin
 *
 */
public class ViewContent extends VerticalLayout implements LanguageChangeListener {

	private static final long serialVersionUID = 1L;

	private HorizontalLayout progLayout = new HorizontalLayout();
	private ProgressBar pBar;

	private Translator translator;
	private Locale locale;
	private VerticalLayout mainLayout;
	private LiferayIPC ipc;
	private Link otherAppLink;
	private String initialUriFragment;
	
	private InfraView infraView;
	private PalveluView palveluView;
	private MapView mapView;
	private AboutView aboutView;
	
	private TabSheet tabSheet;
	private Navigator navigator;

	protected boolean skip;

	public ViewContent(VaadinRequest request, Translator translator, LiferayIPC ipc, String initialUriFragment) {
		this.translator = translator;
		this.ipc = ipc;
		this.locale = this.translator.getDefaultLocale();
		this.initialUriFragment = initialUriFragment;
		JavaScript.eval("window.locale = '" + Translator.getLocaleStr(this.locale) + "';");
		progLayout.setSpacing(true);
		pBar = new ProgressBar();
		pBar.setIndeterminate(true);
		pBar.setEnabled(false);
		Label status = new Label(this.translator.localize("Application.Loading"));
		status.setWidth(100, Unit.PERCENTAGE);
		progLayout.addComponent(status);
		progLayout.addComponent(pBar);
		progLayout.setComponentAlignment(status, Alignment.MIDDLE_CENTER);
		progLayout.setComponentAlignment(pBar, Alignment.MIDDLE_CENTER);
		addComponent(progLayout);
		setComponentAlignment(progLayout, Alignment.MIDDLE_CENTER);
		setWidth(100, Unit.PERCENTAGE);
		setHeight(600, Unit.PIXELS);
		setSpacing(true);
		UI.getCurrent().setPollInterval(100);
		Worker worker = new Worker();
		worker.start();
	}

	public void createMainContent() {
		setHeightUndefined();
		mainLayout = new VerticalLayout();
		mainLayout.setMargin(false);
		mainLayout.setHeightUndefined();
		infraView = new InfraView(translator);
		infraView.setSizeFull();
		palveluView = new PalveluView(translator);
		ErrorView errorView = new ErrorView(translator);
		mapView = new MapView(translator);
		mapView.setSizeFull();
		aboutView = new AboutView(translator);
		tabSheet = getTabSheet();
		tabSheet.addTab(infraView, translator.localize("Application.Tab.ResearchInfrastructures"));
		tabSheet.addTab(palveluView, translator.localize("Application.Tab.Services"));
		tabSheet.addTab(mapView, translator.localize("Application.Tab.Map"));
		tabSheet.addTab(aboutView, translator.localize("Application.Tab.About"));

		// Create a navigator to control the views
		navigator = new Navigator(UI.getCurrent(), new ViewDisplay() {
			private static final long serialVersionUID = 1L;

			@Override
			public void showView(View view) {
				
			}
		});
		
		tabSheet.addSelectedTabChangeListener(e -> {
			if(skip) {
				skip = false;
			} else {
				if (e.getTabSheet().getSelectedTab() == infraView) {
					Page.getCurrent().setUriFragment(InfraView.NAME);
				} else if (e.getTabSheet().getSelectedTab() == palveluView) {
					Page.getCurrent().setUriFragment(PalveluView.NAME);
				} else if (e.getTabSheet().getSelectedTab() == mapView) {
					Page.getCurrent().setUriFragment(MapView.NAME);
				} else if (e.getTabSheet().getSelectedTab() == aboutView) {
					Page.getCurrent().setUriFragment(AboutView.NAME);
				}
			}
		});

		// Create and register the views
		navigator.addView(InfraView.NAME, infraView);
		navigator.addView(PalveluView.NAME, palveluView);
		navigator.addView(MapView.NAME, mapView);
		navigator.addView(AboutView.NAME, aboutView);
		navigator.setErrorView(errorView);
		
		if(initialUriFragment != null) {
			navigateAfterUriFragmentChange(initialUriFragment);
		} else {
			navigator.navigateTo(InfraView.NAME);
		}
		
		Page.getCurrent().addUriFragmentChangedListener(e -> {
			navigateAfterUriFragmentChange(e.getUriFragment());
		});
		
		mainLayout.addComponent(getHeader());
		mainLayout.addComponent(tabSheet);
		UI.getCurrent().setContent(mainLayout);
		
		setIPCListeners();
	}
	
	private void navigateAfterUriFragmentChange(String uriFragment) {
		updateOtherLanguageApplicationLinkUrl();
		String changedViewName = uriFragment.replaceFirst("!", Const.STRING_EMPTY);
		NamedView selectedTabView = (NamedView) tabSheet.getSelectedTab();
		if(!changedViewName.equals(selectedTabView.getViewName())) {
			skip = true;
			if (changedViewName.equals(infraView.getViewName())) {
				tabSheet.setSelectedTab(infraView);
			}
			else if (changedViewName.equals(palveluView.getViewName())) {
				tabSheet.setSelectedTab(palveluView);
			}
			else if (changedViewName.equals(mapView.getViewName())) {
				tabSheet.setSelectedTab(mapView);
			}
			else if (changedViewName.equals(aboutView.getViewName())) {
				tabSheet.setSelectedTab(aboutView);
			}
		}
		navigator.navigateTo(changedViewName);
	}

	private void setIPCListeners() {
		ipc.addLiferayIPCEventListener(TupaConst.IPC_EVENT_DISPLAY_SERVICE_DETAILS, e -> {
			Integer serviceId = null;
			if(e.getData() != null) {
				try {
					serviceId = Integer.parseInt(e.getData());
				} catch(NumberFormatException ex) {}
			}
			if(serviceId != null) {
				ServiceDetailsWindow window = new ServiceDetailsWindow(translator, TupaDBCache.getPalveluCache().get(serviceId));
				UI.getCurrent().addWindow(window);
				window.focus();
			}
		});
	}

	private TabSheet getTabSheet() {
		TabSheet tabSheet = new TabSheet();
		tabSheet.setImmediate(true);
		tabSheet.setStyleName("tab-navigation");
		tabSheet.setResponsive(true);
		return tabSheet;
	}
	
	private HorizontalLayout getHeader() {
		HorizontalLayout headerLayout = new HorizontalLayout();
		headerLayout.setSizeFull();
		headerLayout.setSpacing(true);
		
		HorizontalLayout headerLogos = new HorizontalLayout();
		headerLogos.setSizeUndefined();
		
		String finAcademyLogoUrl = LanguageConst.LOCALE_FI.equals(translator.getDefaultLocale()) ? TupaConst.IMAGE_BASE_URL + "suomen_akatemia_vaaka_FI.png" : TupaConst.IMAGE_BASE_URL + "suomen_akatemia_vaaka_EN.png";
		String finAcademyUrl = LanguageConst.LOCALE_FI.equals(translator.getDefaultLocale()) ? TupaConst.SUOMEN_AKATEMIA_URL_FI : TupaConst.SUOMEN_AKATEMIA_URL_EN;
		Link finAcademyLogo = VaadinTools.createLink(null, finAcademyUrl, false);
		finAcademyLogo.setIcon(new ExternalResource(finAcademyLogoUrl));
//		Image finAcademyLogo = VaadinTools.createImageFromExternalResource(null, finAcademyLogoUrl);
		finAcademyLogo.setId("academy-logo");
//		finAcademyLogo.setHeight(130, Unit.PIXELS);
		
		String okmLogoUrl = LanguageConst.LOCALE_FI.equals(translator.getDefaultLocale()) ? TupaConst.IMAGE_BASE_URL + "OKM_Fi_RGB_LM_logot_ISO.jpg" : TupaConst.IMAGE_BASE_URL + "OKM_Eng_RGB_LM_logot_ISO.jpg";
		String okmUrl = LanguageConst.LOCALE_FI.equals(translator.getDefaultLocale()) ? TupaConst.OKM_URL_FI : TupaConst.OKM_URL_EN;
		Link okmLogo = VaadinTools.createLink(null, okmUrl, false);
		okmLogo.setIcon(new ExternalResource(okmLogoUrl));
//		Image okmLogo = VaadinTools.createImageFromExternalResource(null, okmLogoUrl);
		okmLogo.setId("okm-logo");
//		okmLogo.setHeight(85, Unit.PIXELS);
		
		headerLogos.addComponent(finAcademyLogo);
		headerLogos.addComponent(okmLogo);
		
		Label headerTitle = new Label(translator.localize("Application.Title"));
		headerTitle.setId("tupa-header-title");
		
		headerLayout.addComponent(headerTitle);
		headerLayout.setComponentAlignment(headerTitle, Alignment.MIDDLE_LEFT);
		
		HorizontalLayout rightSideOfHeader = new HorizontalLayout();
		rightSideOfHeader.setSizeFull();
		rightSideOfHeader.setSpacing(true);
		rightSideOfHeader.addComponent(headerLogos);
		rightSideOfHeader.setComponentAlignment(headerLogos, Alignment.TOP_LEFT);
		
		otherAppLink = new Link();
		otherAppLink.setTargetName("_self");
		otherAppLink.setImmediate(true);
		otherAppLink.setCaption(LanguageConst.LOCALE_FI.equals(translator.getDefaultLocale()) ? translator.localize("LanguageSelect.Item.EN") : translator.localize("LanguageSelect.Item.FI"));
		updateOtherLanguageApplicationLinkUrl();
		rightSideOfHeader.addComponent(otherAppLink);
		rightSideOfHeader.setComponentAlignment(otherAppLink, Alignment.TOP_RIGHT);
		headerLayout.addComponent(rightSideOfHeader);
    	return headerLayout;
	}

	private class Worker extends Thread {

		@Override
		public void run() {
			UI.getCurrent().getSession().getLockInstance().lock();
			TupaDBCache.initCache();
			Collection<ExtInfra> allInfras = TupaDBCache.getInfraCacheValues();
			if (allInfras != null && allInfras.size() > 0) {
				removeComponent(progLayout);
				createMainContent();
			} else {
				showError();
			}
			removeComponent(progLayout);
			UI.getCurrent().setPollInterval(-1);
			UI.getCurrent().getSession().getLockInstance().unlock();
		}

		private void showError() {
			removeComponent(progLayout);
			VaadinTools.showError("Error occurred while loading the application", "Please contact AVAA administrators");
		}
	}

	private void updateOtherLanguageApplicationLinkUrl() {
		if(otherAppLink != null) {
			String uriFragment = Page.getCurrent().getUriFragment();
			String urlToOtherLangApp = "http://";
			if(UI.getCurrent().getPage().getLocation().getHost().contains("-test")) {
				if(LanguageConst.LOCALE_FI.equals(translator.getDefaultLocale())) {
					urlToOtherLangApp += TupaConst.APPLICATION_HOST_NAME_EN_TEST;
				} else {
					urlToOtherLangApp += TupaConst.APPLICATION_HOST_NAME_FI_TEST;
				}
			} else {
				if(LanguageConst.LOCALE_FI.equals(translator.getDefaultLocale())) {
					urlToOtherLangApp += TupaConst.APPLICATION_HOST_NAME_EN;
				} else {
					urlToOtherLangApp += TupaConst.APPLICATION_HOST_NAME_FI;
				}
			}
			otherAppLink.setResource(new ExternalResource(urlToOtherLangApp + (uriFragment == null ? Const.STRING_EMPTY : "#" + uriFragment)));
		}
	}
	
	@Override
	public void changeComponentLanguage(LanguageChangeEvent e) {
		VaadinSession.getCurrent().setLocale(e.getLocale());
		JavaScript.eval("window.location.reload();");
	}
}



