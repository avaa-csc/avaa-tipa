package fi.csc.avaa.tupa.tabs;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

import fi.csc.avaa.tools.vaadin.language.Translator;

public class ErrorView extends CustomComponent implements View, NamedView {
	public static final String NAME = "error";

	private static final long serialVersionUID = 1L;
	private Translator translator;
	private VerticalLayout viewLayout;
	
	public ErrorView(Translator translator) {
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
	}
	
	@Override
	public String getViewName() {
		return NAME;
	}

}
