package fi.csc.avaa.tupa.common;

import com.vaadin.ui.Button;

public class ToggleButton extends Button {
	private static final long serialVersionUID = 1L;
	private boolean isDown;
	public ToggleButton(String caption) {
		super(caption);
		setWidth(190, Unit.PIXELS);
		isDown = false;
	}

	public boolean toggle() {
		if(isDown) {
			removeStyleName("toggle-button-down");
			isDown = false;
		}
		else {
			addStyleName("toggle-button-down");
			isDown = true;
		}
		return isDown;
	}

	public boolean isDown() {
		return isDown;
	}
}
