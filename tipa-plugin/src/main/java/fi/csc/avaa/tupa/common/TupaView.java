package fi.csc.avaa.tupa.common;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component.Listener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.VerticalLayout;

import fi.csc.avaa.tools.vaadin.customcomponent.CollapsibleLayout;
import fi.csc.avaa.tools.vaadin.language.Translator;
import fi.csc.avaa.tupa.common.ToggleButtons.ToggleButtonType;
import fi.csc.avaa.tupa.common.OpennessSliders.SliderType;
import fi.csc.avaa.tupa.search.QueryBean;

public abstract class TupaView extends CustomComponent implements View, Listener {
	private static final long serialVersionUID = 1L;
	private SearchField searchField;
	private ToggleButtons toggleButtons;
//	private OpennessSliders sliders;

	protected Translator translator;
	protected VerticalLayout viewLayout;
	private boolean isInitialized;

	public TupaView(Translator translator) {
		this.translator = translator;
		viewLayout = new VerticalLayout();
		setSizeFull();
		viewLayout.setSizeFull();
		viewLayout.setMargin(true);
		viewLayout.setImmediate(true);
		viewLayout.setResponsive(true);
		setCompositionRoot(viewLayout);
	}

	protected void init() {
		if (!isInitialized) {
			VerticalLayout searchFieldLayout = createSearchFieldLayout();
			VerticalLayout filters = createFilterLayout();
			Button collapseButton = new NativeButton();
			collapseButton.setId("CollapseButton");
			collapseButton.addStyleName("borderless");
			CollapsibleLayout collapsibleFilters = new CollapsibleLayout(filters, collapseButton, translator.localize("Search.Filter.Show"), translator.localize("Search.Filter.Hide"), true);
			filters.setMargin(true);
			searchFieldLayout.addComponent(collapsibleFilters.getCollapseLink());
			viewLayout.addComponents(searchFieldLayout, collapsibleFilters);
			initResultGrid();
			updateResults();
			isInitialized = true;
		}
	}

	private VerticalLayout createSearchFieldLayout() {
		searchField = getSearchField();
		searchField.addListener(e -> {
			updateResults();
		});
		VerticalLayout searchFieldLayout = new VerticalLayout(searchField);
		searchFieldLayout.setSpacing(true);
		searchFieldLayout.addComponents(searchField);
		return searchFieldLayout;
	}

	private VerticalLayout createFilterLayout() {
		toggleButtons = new ToggleButtons(translator);
		toggleButtons.addListener(this);
//		sliders = new OpennessSliders(translator);
//		sliders.addListener(this);
//		VerticalLayout filters = new VerticalLayout(toggleButtons, sliders);
		VerticalLayout filters = new VerticalLayout(toggleButtons);
		filters.setSpacing(true);
		return filters;
	}

	private void updateResults() {
		String value = searchField.getValue();
		QueryBean queryBean = new QueryBean(value);
		queryBean.setStatus(toggleButtons.isButtonDown(ToggleButtonType.ACTIVE));
		queryBean.setInternational(toggleButtons.isButtonDown(ToggleButtonType.INTERNATIONAL));
		queryBean.setMaterialOrientedServiceType(toggleButtons.isButtonDown(ToggleButtonType.MATERIAL));
		queryBean.setHardwareOrientedServiceType(toggleButtons.isButtonDown(ToggleButtonType.HARDWARE));
		queryBean.setServiceOrientedServiceType(toggleButtons.isButtonDown(ToggleButtonType.SERVICE));
		queryBean.setVirtualLocationType(toggleButtons.isButtonDown(ToggleButtonType.VIRTUAL));
		queryBean.setDistributedLocationType(toggleButtons.isButtonDown(ToggleButtonType.DISTRIBUTED));
		queryBean.setLocationBoundLocationType(toggleButtons.isButtonDown(ToggleButtonType.LOCATIONBOUND));
//		queryBean.setAccessibilty(sliders.getSliderValue(SliderType.ACCESSIBILITY) == 0 ? 0 : TupaConst.KAYTTOEHTO_SAAVUTETTAVUUS_BASE_ID + sliders.getSliderValue(SliderType.ACCESSIBILITY));
//		queryBean.setAnonymity(sliders.getSliderValue(SliderType.ANONYMITY) == 0 ? 0 : TupaConst.KAYTTOEHTO_ANONYMITEETTI_BASE_ID + sliders.getSliderValue(SliderType.ANONYMITY));
//		queryBean.setChargeable(sliders.getSliderValue(SliderType.CHARGEABILITY) == 0 ? 0 : TupaConst.KAYTTOEHTO_MAKSULLISUUS_BASE_ID + sliders.getSliderValue(SliderType.CHARGEABILITY));
//		queryBean.setObligationToPublishResults(sliders.getSliderValue(SliderType.RESULTS) == 0 ? 0 : TupaConst.KAYTTOEHTO_TULOSTEN_JULKAISUVELVOITE_BASE_ID + sliders.getSliderValue(SliderType.RESULTS));
//		queryBean.setObligationToPublishOutput(sliders.getSliderValue(SliderType.OUTPUT) == 0 ? 0 : TupaConst.KAYTTOEHTO_TUOTOKSIEN_JULKAISUVELVOITE_BASE_ID + sliders.getSliderValue(SliderType.OUTPUT));
//		queryBean.setOpennesOfExpertise(sliders.getSliderValue(SliderType.EXPERTISE) == 0 ? 0 : TupaConst.KAYTTOEHTO_OSAAMISEN_AVOIMUUS_BASE_ID + sliders.getSliderValue(SliderType.EXPERTISE));
//		queryBean.setTrackingTools(sliders.getSliderValue(SliderType.TRACKING) == 0 ? 0 : TupaConst.KAYTTOEHTO_SEURANTATYOKALUT_BASE_ID + sliders.getSliderValue(SliderType.TRACKING));
//		queryBean.setLicensingOfResults(sliders.getSliderValue(SliderType.LICENSING) == 0 ? 0 : TupaConst.KAYTTOEHTO_TULOSTEN_LISENSOINTI_BASE_ID + sliders.getSliderValue(SliderType.LICENSING));
		updateGrid(queryBean);
	}

	@Override
	public void componentEvent(Event event) {
		updateResults();
	}

	@Override
	public void enter(ViewChangeEvent event) {
		viewChange(event);
	}

	protected abstract void updateGrid(QueryBean queryBean);

	protected abstract void viewChange(ViewChangeEvent event);

	protected abstract SearchField getSearchField();

	protected abstract void initResultGrid();
}
