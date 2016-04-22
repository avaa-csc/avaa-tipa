//package fi.csc.avaa.tupa.common;
//
//import java.util.HashMap;
//
//import org.vaadin.teemu.switchui.Switch;
//
//import com.vaadin.data.Property;
//import com.vaadin.shared.ui.label.ContentMode;
//import com.vaadin.ui.Component;
//import com.vaadin.ui.CustomComponent;
//import com.vaadin.ui.GridLayout;
//import com.vaadin.ui.HorizontalLayout;
//import com.vaadin.ui.Label;
//
//import fi.csc.avaa.tools.vaadin.language.Translator;
//
//public class Switches extends CustomComponent implements Property<Switch> {
//	private static final long serialVersionUID = 1L;
//
//	private Translator translator;
//	private Switch triggeringSwitch;
//	private HashMap<SwitchType, Switch> switchMap;
//	
//	public enum SwitchType {
//		ACTIVE("Search.Filter.Status"),
//		MATERIAL("Search.Filter.ServiceType.MaterialOriented"),
//		HARDWARE("Search.Filter.ServiceType.HardwareOriented"),
//		SERVICE("Search.Filter.ServiceType.ServiceOriented"),
//		INTERNATIONAL("Search.Filter.International"),
//		VIRTUAL("Search.Filter.LocationType.Virtual"),
//		DISTRIBUTED("Search.Filter.LocationType.Distributed"),
//		LOCATIONBOUND("Search.Filter.LocationType.LocationBound");
//		
//		private String id;
//
//		private SwitchType(String id) {
//			this.id = id;
//		}
//		
//		public String getId() {
//			return id;
//		}
//	}
//
//	public Switches(Translator translator) {
//		this.translator = translator;
//		init();
//	}
//
//	@Override
//	public Switch getValue() {
//		return this.triggeringSwitch;
//	}
//
//	@Override
//	public void setValue(Switch newValue) throws com.vaadin.data.Property.ReadOnlyException {
//		this.triggeringSwitch = newValue;
//	}
//
//	@Override
//	public Class<? extends Switch> getType() {
//		return Switch.class;
//	}
//	
//	public boolean getSwitchValue(SwitchType active) {
//		return switchMap.get(active).getValue();
//	}
//
//	private void init() {
//		switchMap = new HashMap<SwitchType,  Switch>();
//		setCompositionRoot(createSwitchLayout());
//	}
//
//	private GridLayout createSwitchLayout() {
//		GridLayout switchGrid = new GridLayout(6, 2);
//		switchGrid.setSpacing(true);
//		switchGrid.addComponent(createSwitchLayout(createSwitch(SwitchType.ACTIVE), new Label(translator.localize(SwitchType.ACTIVE.getId()))), 0, 0);
//		switchGrid.addComponent(createLabel(asBoldHtml(translator.localize("Search.Filter.ServiceType") + ":")), 2, 0);
//		switchGrid.addComponent(createSwitchLayout(createSwitch(SwitchType.MATERIAL), new Label(translator.localize(SwitchType.MATERIAL.getId()))), 3, 0);
//		switchGrid.addComponent(createSwitchLayout(createSwitch(SwitchType.HARDWARE), new Label(translator.localize(SwitchType.HARDWARE.getId()))), 4, 0);
//		switchGrid.addComponent(createSwitchLayout(createSwitch(SwitchType.SERVICE), new Label(translator.localize(SwitchType.SERVICE.getId()))), 5, 0);
//		switchGrid.addComponent(createSwitchLayout(createSwitch(SwitchType.INTERNATIONAL), new Label(translator.localize(SwitchType.INTERNATIONAL.getId()))), 0, 1);
//		switchGrid.addComponent(createLabel(asBoldHtml(translator.localize("Search.Filter.LocationType") + ":")), 2, 1);
//		switchGrid.addComponent(createSwitchLayout(createSwitch(SwitchType.VIRTUAL), new Label(translator.localize(SwitchType.VIRTUAL.getId()))), 3, 1);
//		switchGrid.addComponent(createSwitchLayout(createSwitch(SwitchType.DISTRIBUTED), new Label(translator.localize(SwitchType.DISTRIBUTED.getId()))), 4, 1);
//		switchGrid.addComponent(createSwitchLayout(createSwitch(SwitchType.LOCATIONBOUND), new Label(translator.localize(SwitchType.LOCATIONBOUND.getId()))), 5, 1);
//		return switchGrid;
//	}
//
//	private Switch createSwitch(SwitchType switchType) {
//		Switch svvitch = new Switch();
//		svvitch.setId(switchType.getId());
//		svvitch.addValueChangeListener(e -> {
//			setValue((Switch)e.getProperty());
//			fireComponentEvent();
//		});
//		switchMap.put(switchType, svvitch);
//		return svvitch;
//	}
//
//	private Label createLabel(String str) {
//		Label serviceTypesLabel = new Label();
//		serviceTypesLabel.setContentMode(ContentMode.HTML);
//		serviceTypesLabel.setValue(str);
//		return serviceTypesLabel;
//	}
//
//	private HorizontalLayout createSwitchLayout(Component... components) {
//		HorizontalLayout horizontalLayout = new HorizontalLayout();
//		horizontalLayout.setSpacing(true);
//		for (Component component : components) {
//			horizontalLayout.addComponent(component);
//		}
//		return horizontalLayout;
//	}
//
//	private String asBoldHtml(String string) {
//		return "<b>" + string + "</b>";
//	}
//}
