/**
 * 
 */
package fi.csc.avaa.tupa.result;

import static fi.csc.avaa.tupa.result.ServiceGridBean.FieldName.GENERATED_COLUMN_AVOIMUUS;
import static fi.csc.avaa.tupa.result.ServiceGridBean.FieldName.GENERATED_COLUMN_PAIKKATYYPPI;
import static fi.csc.avaa.tupa.result.ServiceGridBean.FieldName.GENERATED_COLUMN_PALVELUTYYPIT;
import static fi.csc.avaa.tupa.result.ServiceGridBean.FieldName.INFRA_LYHENTEET;
import static fi.csc.avaa.tupa.result.ServiceGridBean.FieldName.KUVAUS;
import static fi.csc.avaa.tupa.result.ServiceGridBean.FieldName.PALVELU_ID;
import static fi.csc.avaa.tupa.result.ServiceGridBean.FieldName.PALVELU_NIMI;
import static fi.csc.avaa.tupa.result.ServiceGridBean.FieldName.SIJAINTI;

import java.util.Map;
import java.util.stream.Collectors;

import com.vaadin.data.Item;
import com.vaadin.data.util.BeanItem;
import com.vaadin.data.util.PropertyValueGenerator;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.renderers.HtmlRenderer;

import fi.csc.avaa.tools.Const;
import fi.csc.avaa.tools.StringTools;
import fi.csc.avaa.tools.vaadin.customcomponent.AvaaBaseGrid;
import fi.csc.avaa.tools.vaadin.language.LanguageTools;
import fi.csc.avaa.tools.vaadin.language.Translator;
import fi.csc.avaa.tupa.common.TupaDBCache;
import fi.csc.avaa.tupa.db.model.Palvelu;
import fi.csc.avaa.tupa.model.ExtPalvelu;
import fi.csc.avaa.tupa.model.ModelTools;
import fi.csc.avaa.tupa.result.ServiceGridBean.FieldName;
import fi.csc.avaa.tupa.result.ServiceGridBean.GridColumnName;

/**
 * @author jmlehtin
 *
 */
public class ServiceGrid extends AvaaBaseGrid<ServiceGridBean, ExtPalvelu> {

	private static final long serialVersionUID = 1L;
	private static final int SERVICE_DESCRIPTION_LETTER_AMOUNT_TO_SHOW = 230;
	private Navigator navigator;

	public ServiceGrid(Translator translator, Navigator navigator) {
		super(translator, ServiceGridBean.class);
		this.navigator = navigator;
		init();
		setStyleName("service-grid tupa-grid");
//		setColumnOrder(PALVELU_NIMI.getValue(), KUVAUS.getValue(), INFRA_LYHENTEET.getValue(), SIJAINTI.getValue(), GENERATED_COLUMN_PALVELUTYYPIT.getValue(), GENERATED_COLUMN_PAIKKATYYPPI.getValue(), GENERATED_COLUMN_AVOIMUUS.getValue());
		setColumnOrder(PALVELU_NIMI.getValue(), KUVAUS.getValue(), INFRA_LYHENTEET.getValue(), SIJAINTI.getValue(), GENERATED_COLUMN_PALVELUTYYPIT.getValue(), GENERATED_COLUMN_PAIKKATYYPPI.getValue());
		setVisible(true);
	}

	@Override
	protected void addListeners() {
		addSelectionListener(e -> {
		    // Get the item of the selected row
			Object selectedItemId = getSelectedRow();
			if(selectedItemId != null) {
				navigator.navigateTo(ServiceDetailsWindow.NAME + "/" + container.getItem(selectedItemId).getBean().getPalveluId());
			}
		});
	}

	@Override
	protected void setColumns() {
		setGridColumn(PALVELU_NIMI);
		setGridColumn(KUVAUS);
		setGridColumn(INFRA_LYHENTEET);
		setGridColumn(SIJAINTI);
		setGridColumn(GENERATED_COLUMN_PALVELUTYYPIT);
		setGridColumn(GENERATED_COLUMN_PAIKKATYYPPI);
//		setGridColumn(GENERATED_COLUMN_AVOIMUUS);
		wrapperContainer.removeContainerProperty(PALVELU_ID.getValue());
		
		setCellStyleGenerator(cellReference -> {
				if(cellReference != null && cellReference.getPropertyId() != null) {
					FieldName fName = FieldName.fromValue(String.valueOf(cellReference.getPropertyId()));
					if(fName != null) {
						switch (fName) {
//						case GENERATED_COLUMN_AVOIMUUS:
//							return "grid-cell-center grid-cell-openness grid-cell-wrap";
						case GENERATED_COLUMN_PAIKKATYYPPI:
							return "grid-cell-middle grid-cell-center";
						case GENERATED_COLUMN_PALVELUTYYPIT:
							return "grid-cell-middle grid-cell-center";
						case INFRA_LYHENTEET:
							return "grid-cell-text grid-cell-middle grid-cell-center grid-cell-wrap";
						case KUVAUS:
							return "grid-cell-text grid-cell-wrap";
						case PALVELU_NIMI:
							return "grid-cell-text grid-cell-center grid-cell-wrap";
						case SIJAINTI:
							return "grid-cell-text grid-cell-middle grid-cell-center grid-cell-wrap";
						default:
							break;
						}
						return null;
					}
				}
				return null;
			});
	}
	
	@Override
	public boolean setModelsToContainer() {
		wrapperContainer.removeAllItems();
		if(models.size() > 0) {
			for(ExtPalvelu extPalvelu : models) {
				ServiceGridBean gridItem = convertToGridBean(extPalvelu);
				container.addBean(gridItem);
			}
			setGridHeightInPixels(650);
			setVisible(true);
			setSelectionMode(SelectionMode.SINGLE);
			return true;
		}
		setVisible(false);
		setSelectionMode(SelectionMode.SINGLE);
		return false;
	}
	
	private void setGridColumn(FieldName field) {
		Grid.Column gridCol = getColumn(field.getValue());
		GridColumnName column = GridColumnName.getValuefromName(field.name());
		gridCol.setEditable(false);
		String additionalCaption = Const.STRING_EMPTY;
		switch (column) {
//		case GENERATED_COLUMN_AVOIMUUS:
//			break;
		case GENERATED_COLUMN_PAIKKATYYPPI:
			break;
		case GENERATED_COLUMN_PALVELUTYYPIT:
			break;
		case INFRA_LYHENTEET:
			gridCol.setWidth(100);
			break;
		case KUVAUS:
			gridCol.setWidth(400);
			break;
		case PALVELU_NIMI:
			gridCol.setWidth(150);
			break;
		case SIJAINTI:
			gridCol.setWidth(100);
			break;
		default:
			break;
		}
		gridCol.setHeaderCaption(translator.localize(column.getValue()) + additionalCaption);
	}

	@Override
	protected void setGeneratedColumns() {
//		wrapperContainer.addGeneratedProperty(GENERATED_COLUMN_AVOIMUUS.getValue(), new PropertyValueGenerator<String>() {
//			private static final long serialVersionUID = 1L;
//
//			@Override
//		    public String getValue(Item item, Object itemId,
//		                           Object propertyId) {
//				BeanItem<ServiceGridBean> beanItem = container.getItem(itemId);
//		        return ModelTools.getOpennessRatingForPalvelu(TupaDBCache.getPalveluCache().get(beanItem.getBean().getPalveluId()), translator);
//		    }
//
//		    @Override
//		    public Class<String> getType() {
//		        return String.class;
//		    }
//		});
		wrapperContainer.addGeneratedProperty(GENERATED_COLUMN_PALVELUTYYPIT.getValue(), new PropertyValueGenerator<String>() {
			private static final long serialVersionUID = 1L;

			@Override
		    public String getValue(Item item, Object itemId,
		                           Object propertyId) {
				BeanItem<ServiceGridBean> beanItem = container.getItem(itemId);
				Map<Integer, Integer> palvelutyyppiCount = ModelTools.getPalveluPalveluTyyppiCount(TupaDBCache.getPalveluCache().get(beanItem.getBean().getPalveluId()));
		        return ModelTools.getTyyppiIcons(palvelutyyppiCount, translator);
		    }

		    @Override
		    public Class<String> getType() {
		        return String.class;
		    }
		});
		wrapperContainer.addGeneratedProperty(GENERATED_COLUMN_PAIKKATYYPPI.getValue(), new PropertyValueGenerator<String>() {
			private static final long serialVersionUID = 1L;

			@Override
		    public String getValue(Item item, Object itemId,
		                           Object propertyId) {
				BeanItem<ServiceGridBean> beanItem = container.getItem(itemId);
				Map<Integer, Integer> paikkatyyppiCount = ModelTools.getPalveluPaikkatyyppiCount(TupaDBCache.getPalveluCache().get(beanItem.getBean().getPalveluId()));
		        return ModelTools.getTyyppiIcons(paikkatyyppiCount, translator);
		    }

		    @Override
		    public Class<String> getType() {
		        return String.class;
		    }
		});
		
//		getColumn(GENERATED_COLUMN_AVOIMUUS.getValue()).setRenderer(new HtmlRenderer());
		getColumn(GENERATED_COLUMN_PALVELUTYYPIT.getValue()).setRenderer(new HtmlRenderer());
		getColumn(GENERATED_COLUMN_PAIKKATYYPPI.getValue()).setRenderer(new HtmlRenderer());
	}
	
	@Override
	protected ServiceGridBean convertToGridBean(ExtPalvelu extPalvelu) {
		Palvelu service = extPalvelu.getPalvelu();
		int serviceId = service.getPalvelu_id();
		String serviceName = LanguageTools.getFI_ENTranslatedValueOrEmpty(service.getNimi(), service.getName(), translator, true);
		String description = LanguageTools.getFI_ENTranslatedValueOrEmpty(service.getKuvaus(), service.getDescription(), translator, true);
		if(description.length() > SERVICE_DESCRIPTION_LETTER_AMOUNT_TO_SHOW) {
			description = description.substring(0, SERVICE_DESCRIPTION_LETTER_AMOUNT_TO_SHOW) + "...";
		}
		String infraAcronyms = extPalvelu.getInfrat() != null && extPalvelu.getInfrat().size() > 0 ? 
				extPalvelu.getInfrat().stream().map(i -> LanguageTools.getFI_ENTranslatedValueOrEmpty(i.getLyhenne(), i.getAcronym(), translator, true)).collect(Collectors.joining(", ")) : Const.STRING_EMPTY;
		String location = StringTools.getStringOrEmptyValue(service.getKaupunki());
		return new ServiceGridBean(serviceId, serviceName, description, infraAcronyms, location);
	}

	@Override
	protected void setCustomHeaders() {
		
//		GridColumnName column = GridColumnName.getValuefromName(GENERATED_COLUMN_AVOIMUUS.name());
//		String avoimuusHtml = "<div class='v-label v-widget v-has-width' title='" + translator.localize("Description.Avoimuus") + "'>" + translator.localize(column.getValue()) + "</div>";
//		Label avoimuusLabel = new Label(translator.localize(column.getValue()));
//		avoimuusLabel.setDescription(translator.localize("Description.Avoimuus"));
//		getDefaultHeaderRow().getCell(GENERATED_COLUMN_AVOIMUUS.getValue()).setHtml(avoimuusHtml);
		
		GridColumnName column2 = GridColumnName.getValuefromName(SIJAINTI.name());
		String sijaintiHtml = "<div class='v-label v-widget v-has-width' title='" + translator.localize("Description.sijainti") + "'>" + translator.localize(column2.getValue()) + "</div>";
//		Label sijaintiLabel = new Label(translator.localize(column2.getValue()));
//		sijaintiLabel.setDescription(translator.localize("Description.sijainti"));
		getDefaultHeaderRow().getCell(SIJAINTI.getValue()).setHtml(sijaintiHtml);
		
		GridColumnName column3 = GridColumnName.getValuefromName(GENERATED_COLUMN_PALVELUTYYPIT.name());
		String palveluTyyppiHtml = "<div class='v-label v-widget v-has-width' title='" + translator.localize("Description.palvelutyypit") + "'>" + translator.localize(column3.getValue()) + "</div>";
//		Label palveluLabel = new Label(translator.localize(column3.getValue()));
//		palveluLabel.setDescription(translator.localize("Description.palvelutyypit"));
		getDefaultHeaderRow().getCell(GENERATED_COLUMN_PALVELUTYYPIT.getValue()).setHtml(palveluTyyppiHtml);
		
		GridColumnName column4 = GridColumnName.getValuefromName(GENERATED_COLUMN_PAIKKATYYPPI.name());
		String paikkaHtml = "<div class='v-label v-widget v-has-width' title='" + translator.localize("Description.paikkatyypit") + "'>" + translator.localize(column4.getValue()) + "</div>";
//		Label paikkaLabel = new Label(translator.localize(column4.getValue()));
//		paikkaLabel.setDescription(translator.localize("Description.paikkatyypit"));
		getDefaultHeaderRow().getCell(GENERATED_COLUMN_PAIKKATYYPPI.getValue()).setHtml(paikkaHtml);
		
		GridColumnName column5 = GridColumnName.getValuefromName(INFRA_LYHENTEET.name());
		String infratHtml = "<div class='v-label v-widget v-has-width' title='" + translator.localize("Description.infrat") + "'>" + translator.localize(column5.getValue()) + "</div>";
//		Label infraLabel = new Label(translator.localize(column5.getValue()));
//		infraLabel.setDescription(translator.localize("Description.infrat"));
		getDefaultHeaderRow().getCell(INFRA_LYHENTEET.getValue()).setHtml(infratHtml);
		
		GridColumnName column6 = GridColumnName.getValuefromName(PALVELU_NIMI.name());
		String palveluNimiHtml = "<div class='v-label v-widget v-has-width' title='" + translator.localize("Description.palvelunimi") + "'>" + translator.localize(column6.getValue()) + "</div>";
//		Label nimiLabel = new Label(translator.localize(column6.getValue()));
//		nimiLabel.setDescription(translator.localize("Description.palvelunimi"));
		getDefaultHeaderRow().getCell(PALVELU_NIMI.getValue()).setHtml(palveluNimiHtml);
		
		GridColumnName column7 = GridColumnName.getValuefromName(KUVAUS.name());
		String kuvausHtml = "<div class='v-label v-widget v-has-width' title='" + translator.localize("Description.kuvaus") + "'>" + translator.localize(column7.getValue()) + "</div>";
//		Label kuvausLabel = new Label(translator.localize(column7.getValue()));
//		kuvausLabel.setDescription(translator.localize("Description.kuvaus"));
		getDefaultHeaderRow().getCell(KUVAUS.getValue()).setHtml(kuvausHtml);
		
	}

}
