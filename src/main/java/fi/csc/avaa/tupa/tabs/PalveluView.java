package fi.csc.avaa.tupa.tabs;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

import fi.csc.avaa.tools.search.result.ResultGridWrapper;
import fi.csc.avaa.tools.vaadin.language.Translator;
import fi.csc.avaa.tupa.common.SearchField;
import fi.csc.avaa.tupa.common.TupaDBCache;
import fi.csc.avaa.tupa.common.TupaView;
import fi.csc.avaa.tupa.model.ExtPalvelu;
import fi.csc.avaa.tupa.result.ServiceGrid;
import fi.csc.avaa.tupa.result.ServiceGridBean;
import fi.csc.avaa.tupa.result.ServiceResultControlRow;
import fi.csc.avaa.tupa.search.PalveluSearchTools;
import fi.csc.avaa.tupa.search.QueryBean;

public class PalveluView extends TupaView implements NamedView {

	private static final long serialVersionUID = 1L;
	public static final String NAME = "service";
	private ResultGridWrapper<ServiceGridBean, ExtPalvelu> gridWrapper;
	private PalveluSearchTools palveluSearchTools;
	private Navigator navigator;

	public PalveluView(Translator translator, Navigator navigator) {
		super(translator);
		palveluSearchTools = new PalveluSearchTools();
		this.navigator = navigator;
	}

	@Override
	protected void updateGrid(QueryBean queryBean) {
		palveluSearchTools.queryData(TupaDBCache.getPalveluCacheValues(), queryBean);
		gridWrapper.getCurrentGrid().populateGrid(palveluSearchTools.getSearchResults());
		gridWrapper.getCurrentControlRow().createNewContents(palveluSearchTools.getSearchResults(), queryBean);
	}

	@Override
	protected void initResultGrid() {
		ServiceGrid grid = new ServiceGrid(translator, navigator);
		ServiceResultControlRow resultControlRow = new ServiceResultControlRow(translator);
		gridWrapper = new ResultGridWrapper<>(grid, resultControlRow);
		viewLayout.addComponent(gridWrapper);
	}

	@Override
	protected void viewChange(ViewChangeEvent event) {
		super.init();
	}

	@Override
	protected SearchField getSearchField() {
		return new SearchField("Search.Palvelu.SearchField", translator, 680);
	}
	
	@Override
	public String getViewName() {
		return NAME;
	}
}
