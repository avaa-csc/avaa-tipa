package fi.csc.avaa.tupa.common;

import java.util.HashMap;

import com.vaadin.data.Property;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import fi.csc.avaa.tools.vaadin.language.Translator;
import fi.csc.avaa.tupa.model.ModelTools;

public class OpennessSliders extends CustomComponent implements Property<OpennessSlider> {

	private static final long serialVersionUID = 1L;
	private HashMap<OpennessSliders.SliderType, OpennessSlider> sliderMap;
	private OpennessSlider firingSlider;
	private Translator translator;
	
	public enum SliderType {
		ACCESSIBILITY("Search.Filter.Terms.Accessibility",TupaConst.KAYTTOEHTO_SAAVUTETTAVUUS_BASE_ID),
		ANONYMITY("Search.Filter.Terms.Anonymity",TupaConst.KAYTTOEHTO_ANONYMITEETTI_BASE_ID),
		CHARGEABILITY("Search.Filter.Terms.Chargeable",TupaConst.KAYTTOEHTO_MAKSULLISUUS_BASE_ID),
		RESULTS("Search.Filter.Terms.ObligationToPublishResults",TupaConst.KAYTTOEHTO_TULOSTEN_JULKAISUVELVOITE_BASE_ID),
		OUTPUT("Search.Filter.Terms.ObligationToPublishOutput",TupaConst.KAYTTOEHTO_TUOTOKSIEN_JULKAISUVELVOITE_BASE_ID),
		EXPERTISE("Search.Filter.Terms.OpennesOfExpertise",TupaConst.KAYTTOEHTO_OSAAMISEN_AVOIMUUS_BASE_ID),
		TRACKING("Search.Filter.Terms.TrackingTools",TupaConst.KAYTTOEHTO_SEURANTATYOKALUT_BASE_ID),
		LICENSING("Search.Filter.Terms.LicensingOfResults",TupaConst.KAYTTOEHTO_TULOSTEN_LISENSOINTI_BASE_ID);
		
		private String id;
		private int seliteId;
		
		SliderType(String id) {
			this.id = id;
		}
		SliderType(String id, int seliteId) {
			this.id = id;
			this.seliteId = seliteId;
		}
		public String getId() {
			return id;
		}
		public int getSeliteId() {
			return seliteId;
		}
	}

	public OpennessSliders(Translator translator) {
		this.translator = translator;
		init(OpennessSliders.SliderType.values());
	}

	public OpennessSliders(OpennessSliders.SliderType[] sliders, Translator translator) {
		this.translator = translator;
		init(sliders);
	}
	
	public int getSliderValue(OpennessSliders.SliderType slider) {
		return sliderMap.get(slider).getValue().intValue();
	}

	@Override
	public OpennessSlider getValue() {
		return firingSlider;
	}

	@Override
	public void setValue(OpennessSlider newValue) throws com.vaadin.data.Property.ReadOnlyException {
		this.firingSlider = newValue; 
	}

	@Override
	public Class<? extends OpennessSlider> getType() {
		return OpennessSlider.class;
	}

	@Override
	public boolean isReadOnly() {
		return true;
	}

	@Override
	public void setReadOnly(boolean newStatus) {
	}

	private void init(OpennessSliders.SliderType[] sliders) {
		sliderMap = new HashMap<OpennessSliders.SliderType,  OpennessSlider>();

		GridLayout sliderGrid = new GridLayout(10, 2);
		VerticalLayout sliderLevels = createSliderLevels();
		sliderGrid.setSpacing(true);
		sliderGrid.addComponent(sliderLevels, 0, 0);
		sliderGrid.setCursorX(2);
		for (OpennessSliders.SliderType sliderType : sliders) {
			OpennessSlider slider = new OpennessSlider(sliderType, translator);
//			slider.removeStyleName("blurred-text");
			slider.setImmediate(true);
			slider.addValueChangeListener(e -> {
				int value = ((Double)e.getProperty().getValue()).intValue();
				if (value != 0) {
					try {
						slider.setDescription(ModelTools.getSeliteDescription(sliderType.seliteId+value, translator));
					} catch(NullPointerException npe) {
						slider.setDescription("");
					}
				}
				else {
//					slider.addStyleName("blurred-text");
					slider.setDescription(translator.localize("Description."+sliderType.getId()));
				}
				setValue(slider);
				fireComponentEvent();

			});
			sliderMap.put(sliderType, slider);
			sliderGrid.addComponent(slider);
		}
		setCompositionRoot(sliderGrid);
	}

	private VerticalLayout createSliderLevels() {
		VerticalLayout sliderPositions = new VerticalLayout();
		Label topPadding = new Label(translator.localize("Search.Slider.Openness"));
		topPadding.setStyleName("openness-filter-header");
		topPadding.setDescription(translator.localize("Description.Avoimuus"));
		Label openLabel = new OpennesStars(translator, 3);
		Label slightlyOpenLabel = new OpennesStars(translator, 2);
		Label closedLabel = new OpennesStars(translator, 1);
		Label notAppliedLabel = new OpennesStars(translator, 0);
		notAppliedLabel.setHeight("1em");
		sliderPositions.addComponent(topPadding);
		sliderPositions.addComponent(openLabel);
		sliderPositions.addComponent(slightlyOpenLabel);
		sliderPositions.addComponent(closedLabel);
		sliderPositions.addComponent(notAppliedLabel);
		sliderPositions.setComponentAlignment(topPadding, Alignment.TOP_LEFT);
		sliderPositions.setSizeFull();
		return sliderPositions;
	}
}
