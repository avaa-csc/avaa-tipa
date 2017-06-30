package fi.csc.avaa.tupa.common;

import java.util.HashMap;

import com.vaadin.data.Property;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.Resource;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.*;

import com.vaadin.ui.themes.Runo;
import fi.csc.avaa.tools.vaadin.language.Translator;
import fi.csc.avaa.tupa.model.ModelTools;

public class ToggleButtons extends CustomComponent implements Property<ToggleButton> {
	private static final long serialVersionUID = 1L;

	private Translator translator;
	private ToggleButton triggeringButton;
	private HashMap<ToggleButtonType, ToggleButton> switchMap;
	
	public enum ToggleButtonType {
		ACTIVE("Search.Filter.Status"),
		MATERIAL("Search.Filter.ServiceType.MaterialOriented"),
		HARDWARE("Search.Filter.ServiceType.HardwareOriented"),
		SERVICE("Search.Filter.ServiceType.ServiceOriented"),
		INTERNATIONAL("Search.Filter.International"),
		VIRTUAL("Search.Filter.LocationType.Virtual"),
		DISTRIBUTED("Search.Filter.LocationType.Distributed"),
		LOCATIONBOUND("Search.Filter.LocationType.LocationBound");
		
		private String id;

		private ToggleButtonType(String id) {
			this.id = id;
		}
		
		public String getId() {
			return id;
		}
	}

	public ToggleButtons(Translator translator) {
		this.translator = translator;
		init();
	}

	@Override
	public ToggleButton getValue() {
		return this.triggeringButton;
	}

	@Override
	public void setValue(ToggleButton newValue) throws com.vaadin.data.Property.ReadOnlyException {
		this.triggeringButton = newValue;
	}

	@Override
	public Class<? extends ToggleButton> getType() {
		return ToggleButton.class;
	}
	
	public boolean isButtonDown(ToggleButtonType active) {
		return switchMap.get(active).isDown();
	}

	private void init() {
		setId("toggle-buttons");
		switchMap = new HashMap<ToggleButtonType,  ToggleButton>();
		setCompositionRoot(createSwitchLayout());
	}

	private VerticalLayout createSwitchLayout() {
		VerticalLayout buttonGrid = new VerticalLayout();
		buttonGrid.setSpacing(true);
		CssLayout firstRow = new CssLayout();
		firstRow.setSizeFull();
		CssLayout secondRow = new CssLayout();
		secondRow.setSizeFull();
		buttonGrid.addComponents(firstRow, secondRow);
		firstRow.addComponent(createToggleButton(ToggleButtonType.ACTIVE, FontAwesome.COGS, translator.localize("Description.aktiivinen")));
		firstRow.addComponent(createLabel(asBoldHtml(translator.localize("Search.Filter.ServiceType") + ":")));
		firstRow.addComponent(createToggleButton(ToggleButtonType.MATERIAL, FontAwesome.ARCHIVE, ModelTools.getSeliteDescription(TupaConst.PALVELUTYYPPI_AINEISTO_ID, translator)));
		firstRow.addComponent(createToggleButton(ToggleButtonType.HARDWARE, FontAwesome.FLASK, ModelTools.getSeliteDescription(TupaConst.PALVELUTYYPPI_LAITTEISTO_ID, translator)));
		firstRow.addComponent(createToggleButton(ToggleButtonType.SERVICE, FontAwesome.USER_MD, ModelTools.getSeliteDescription(TupaConst.PALVELUTYYPPI_PALVELU_ID, translator)));
		secondRow.addComponent(createToggleButton(ToggleButtonType.INTERNATIONAL, FontAwesome.GLOBE, translator.localize("Description.kvisanta")));
		secondRow.addComponent(createLabel(asBoldHtml(translator.localize("Search.Filter.LocationType") + ":")));
		secondRow.addComponent(createToggleButton(ToggleButtonType.VIRTUAL, FontAwesome.CLOUD_DOWNLOAD, ModelTools.getSeliteDescription(TupaConst.PAIKKATYYPPI_VIRTUAALINEN_ID, translator)));
		secondRow.addComponent(createToggleButton(ToggleButtonType.DISTRIBUTED, FontAwesome.SITEMAP, ModelTools.getSeliteDescription(TupaConst.PAIKKATYYPPI_HAJAUTETTU_ID, translator)));
		secondRow.addComponent(createToggleButton(ToggleButtonType.LOCATIONBOUND, FontAwesome.MAP_MARKER, ModelTools.getSeliteDescription(TupaConst.PAIKKATYYPPI_PAIKKASIDONNAINEN_ID, translator)));
		return buttonGrid;
	}

	private ToggleButton createToggleButton(ToggleButtonType buttonType, Resource icon, String description) {
		ToggleButton toggleButton = new ToggleButton(translator.localize(buttonType.getId()));
		if(icon != null) {
			toggleButton.setIcon(icon);
		}
		if(description != null) {
			toggleButton.setDescription(description);
		}
		toggleButton.addClickListener(e -> {
			toggleButton.toggle();
			setValue((ToggleButton)e.getComponent());
			fireComponentEvent();
		});
		switchMap.put(buttonType, toggleButton);
		return toggleButton;
	}
	
	private Label createLabel(String str) {
		Label serviceTypesLabel = new Label();
		serviceTypesLabel.setContentMode(ContentMode.HTML);
		serviceTypesLabel.setValue(str);
		serviceTypesLabel.setSizeUndefined();
		return serviceTypesLabel;
	}

	private String asBoldHtml(String string) {
		return "<b>" + string + "</b>";
	}
}
