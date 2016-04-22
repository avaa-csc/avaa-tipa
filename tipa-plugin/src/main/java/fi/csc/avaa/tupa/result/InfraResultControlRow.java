package fi.csc.avaa.tupa.result;

import java.util.Collection;

import fi.csc.avaa.tools.search.SearchBean;
import fi.csc.avaa.tools.search.result.ResultControlRow;
import fi.csc.avaa.tools.vaadin.language.Translator;
import fi.csc.avaa.tupa.model.ExtInfra;

public class InfraResultControlRow extends ResultControlRow<ExtInfra> {

	public InfraResultControlRow(Translator translator) {
		super(translator, false, false, false);
	}

	private static final long serialVersionUID = 1L;

	@Override
	protected String getHtml(Collection<ExtInfra> searchResults,
			SearchBean queryBean) {
		return null;
	}

}
