package fi.csc.avaa.tupa.tabs;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.Tree;
import com.vaadin.ui.VerticalLayout;

import fi.csc.avaa.tools.vaadin.language.Translator;

public class AboutView extends CustomComponent implements View, NamedView {
	private static final long serialVersionUID = 1L;

	public static final String NAME = "about";
	private Translator translator;
	private VerticalLayout viewLayout;
	private boolean isInitialized;
	
	private HorizontalSplitPanel splitPanel;
	private Tree navigationTree;
	private VerticalLayout contentLayout;

	public AboutView(Translator translator) {
		this.translator = translator;
		this.viewLayout = new VerticalLayout();
		setSizeFull();
		viewLayout.setSizeFull();
		viewLayout.setMargin(true);
		viewLayout.setSpacing(true);
		setCompositionRoot(viewLayout);
	}
	@Override
	public void enter(ViewChangeEvent event) {
		if(! isInitialized) {
			init();
			isInitialized = true;
		}
		navigationTree.setValue(translator.localize("Application.Tab.About"));
	}

	private void init() {
		navigationTree = new Tree();
		navigationTree.setMultiSelect(false);
		navigationTree.setNewItemsAllowed(false);
		navigationTree.setNullSelectionAllowed(false);

		navigationTree.setChildrenAllowed(navigationTree.addItem(translator.localize("Application.Tab.About")), false);
		navigationTree.setChildrenAllowed(navigationTree.addItem(translator.localize("Application.Tab.Glossary")), false);
		navigationTree.setChildrenAllowed(navigationTree.addItem(translator.localize("Application.Tab.Register")), false);
		
		contentLayout = new VerticalLayout();
		
		splitPanel = new HorizontalSplitPanel(navigationTree, contentLayout);
		splitPanel.setImmediate(true);
		splitPanel.setLocked(true);
		splitPanel.setSplitPosition(20);
		
		navigationTree.addValueChangeListener(e -> {
			if(e.getProperty().getValue() == translator.localize("Application.Tab.About")) {
				contentLayout.removeAllComponents();
				contentLayout.addComponent(getAboutContent());
			} else if(e.getProperty().getValue() == translator.localize("Application.Tab.Glossary")) {
				contentLayout.removeAllComponents();
				contentLayout.addComponent(getGlossaryContent());
			} else if(e.getProperty().getValue() == translator.localize("Application.Tab.Register")) {
				contentLayout.removeAllComponents();
				contentLayout.addComponent(getRegisterContent());
			}
		});
		
		viewLayout.addComponent(splitPanel);
	}
	
	private Label getAboutContent() {
		return new Label(translator.localize("About.Content"), ContentMode.HTML);
	}
	
	private Label getGlossaryContent() {
		return new Label(translator.localize("Glossary.Content"), ContentMode.HTML);
	}
	
	private Label getRegisterContent() {
		return new Label(translator.localize("Register.Content"), ContentMode.HTML);
	}
	
	@Override
	public String getViewName() {
		return NAME;
	}
}
