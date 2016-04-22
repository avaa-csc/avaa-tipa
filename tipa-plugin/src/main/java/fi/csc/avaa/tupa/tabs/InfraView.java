package fi.csc.avaa.tupa.tabs;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

import fi.csc.avaa.tools.search.result.ResultGridWrapper;
import fi.csc.avaa.tools.vaadin.language.Translator;
import fi.csc.avaa.tupa.common.SearchField;
import fi.csc.avaa.tupa.common.TupaDBCache;
import fi.csc.avaa.tupa.common.TupaView;
import fi.csc.avaa.tupa.model.ExtInfra;
import fi.csc.avaa.tupa.result.InfraGrid;
import fi.csc.avaa.tupa.result.InfraGridBean;
import fi.csc.avaa.tupa.result.InfraResultControlRow;
import fi.csc.avaa.tupa.search.InfraSearchTools;
import fi.csc.avaa.tupa.search.QueryBean;

public class InfraView extends TupaView implements NamedView {
	
	public static final String NAME = "";
	private static final long serialVersionUID = 1L;
	private InfraSearchTools infraSearchTools;
	private ResultGridWrapper<InfraGridBean, ExtInfra> gridWrapper;

	public InfraView(Translator translator) {
		super(translator);
		infraSearchTools = new InfraSearchTools();
	}

	@Override
	protected void updateGrid(QueryBean queryBean) {
		infraSearchTools.queryData(TupaDBCache.getInfraCacheValues(), queryBean);
		gridWrapper.getCurrentGrid().populateGrid(infraSearchTools.getSearchResults());
		gridWrapper.getCurrentControlRow().createNewContents(infraSearchTools.getSearchResults(), queryBean);
	}

	@Override
	protected void initResultGrid() {
		InfraGrid grid = new InfraGrid(translator);
		InfraResultControlRow resultControlRow = new InfraResultControlRow(translator);
		gridWrapper = new ResultGridWrapper<>(grid, resultControlRow);
		viewLayout.addComponent(gridWrapper);
	}

	@Override
	protected SearchField getSearchField() {
		return new SearchField("Search.Infra.SearchField", translator, 550);
	}

	@Override
	protected void viewChange(ViewChangeEvent event) {
		super.init();
	}
	
	@Override
	public String getViewName() {
		return NAME;
	}
}
