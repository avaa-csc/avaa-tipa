package fi.csc.avaa.tupa.result;

import java.util.Collection;

import fi.csc.avaa.tools.search.SearchBean;
import fi.csc.avaa.tools.search.result.ResultControlRow;
import fi.csc.avaa.tools.vaadin.language.Translator;
import fi.csc.avaa.tupa.model.ExtPalvelu;

public class ServiceResultControlRow extends ResultControlRow<ExtPalvelu> {

	public ServiceResultControlRow(Translator translator) {
		super(translator, null, null, false);
	}

	private static final long serialVersionUID = 1L;

	@Override
	protected String getHtml(Collection<ExtPalvelu> searchResults,
			SearchBean queryBean) {
		return null;
	}

}
