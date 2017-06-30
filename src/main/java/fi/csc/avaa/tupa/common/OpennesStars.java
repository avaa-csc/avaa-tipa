package fi.csc.avaa.tupa.common;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Label;

import fi.csc.avaa.tools.vaadin.language.Translator;

public class OpennesStars extends Label {
	private static final long serialVersionUID = 1L;
	
	public OpennesStars(Translator translator, int nrStars) {
		super();
		setCaptionAsHtml(true);
		setCaption(getStarsForOpenness(nrStars, 3));
		setDescription(translator.localize("Search.Slider.Openness.Stars." + nrStars));
		setStyleName("openness-rating");
	}

	private String getStarsForOpenness(int nrStars, int maxStars) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nrStars; i++) {
			sb.append(FontAwesome.STAR.getHtml());
		}
		for (int i = 0; i < maxStars - nrStars; i++) {
			sb.append(FontAwesome.STAR_O.getHtml());
		}
		return sb.toString();
	}

}
