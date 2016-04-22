/**
 * 
 */
package fi.csc.avaa.tupa.common;

import com.vaadin.shared.ui.slider.SliderOrientation;
import com.vaadin.ui.Slider;

import fi.csc.avaa.tools.vaadin.language.Translator;
import fi.csc.avaa.tupa.common.OpennessSliders.SliderType;
import fi.csc.avaa.tupa.model.ModelTools;

/**
 * @author ebister
 *
 */
public class OpennessSlider extends Slider {
	private static final long serialVersionUID = 1L;
	private SliderType type;

	public OpennessSlider(SliderType type, Translator translator) {
		super(0,3);
		this.type = type;
		setId(type.getId());
		addStyleName("slider-center"); //  blurred-text
		setCaption(translator.localize(type.getId()));
		setDescription(translator.localize("Description."+type.getId()));
		setImmediate(true);
		setOrientation(SliderOrientation.VERTICAL);
		setResolution(0);
		setHeight(70, Unit.PIXELS);
		setWidth(5, Unit.PIXELS);
	}

	public OpennessSliders.SliderType getSliderType() {
		return type;
	}
}