package fi.csc.avaa.tupa.tabs;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Page;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.*;

import fi.csc.avaa.tools.vaadin.language.Translator;

public class AboutView extends CustomComponent implements View, NamedView {
	private static final long serialVersionUID = 1L;

	public static final String NAME = "about";
	private Translator translator;
	private VerticalLayout viewLayout;
	private boolean isInitialized;
	
	private HorizontalLayout splitPanel;
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
		navigationTree.setWidth("200px");
		
		contentLayout = new VerticalLayout();
		
		splitPanel = new HorizontalLayout();
		splitPanel.setImmediate(true);
		splitPanel.setSizeFull();

		if(Page.getCurrent().getBrowserWindowWidth() < 1000) {
			viewLayout.addComponent(navigationTree);
			viewLayout.setComponentAlignment(navigationTree, Alignment.TOP_CENTER);
		} else {
			splitPanel.addComponent(navigationTree);
		}
		splitPanel.addComponent(contentLayout);
		splitPanel.setExpandRatio(contentLayout, 1.0f);
		viewLayout.addComponent(splitPanel);

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

		Page.getCurrent().addBrowserWindowResizeListener(e -> {
			if(e.getWidth() < 1000) {
				if(splitPanel.getComponentIndex(navigationTree) != -1) {
					splitPanel.removeComponent(navigationTree);
				}
				if(viewLayout.getComponentIndex(navigationTree) == -1) {
					viewLayout.addComponentAsFirst(navigationTree);
					viewLayout.setComponentAlignment(navigationTree, Alignment.TOP_CENTER);
				}
			} else {
				if(splitPanel.getComponentIndex(navigationTree) == -1) {
					splitPanel.addComponentAsFirst(navigationTree);
				}
				if(viewLayout.getComponentIndex(navigationTree) != -1) {
					viewLayout.removeComponent(navigationTree);
				}
			}
		});
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
