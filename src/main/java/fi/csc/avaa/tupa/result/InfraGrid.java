/**
 * 
 */
package fi.csc.avaa.tupa.result;

//import static fi.csc.avaa.tupa.result.InfraGridBean.FieldName.GENERATED_COLUMN_AVOIMUUS;
import static fi.csc.avaa.tupa.result.InfraGridBean.FieldName.GENERATED_COLUMN_PAIKKATYYPIT;
import static fi.csc.avaa.tupa.result.InfraGridBean.FieldName.GENERATED_COLUMN_PALVELUTYYPIT;
import static fi.csc.avaa.tupa.result.InfraGridBean.FieldName.INFRA_ID;
import static fi.csc.avaa.tupa.result.InfraGridBean.FieldName.KV_ISANNAT;
import static fi.csc.avaa.tupa.result.InfraGridBean.FieldName.LYHENNE;
import static fi.csc.avaa.tupa.result.InfraGridBean.FieldName.NIMI;
import static fi.csc.avaa.tupa.result.InfraGridBean.FieldName.VASTUUORGANISAATIOT;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.vaadin.data.Item;
import com.vaadin.data.util.BeanItem;
import com.vaadin.data.util.PropertyValueGenerator;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import com.vaadin.ui.renderers.HtmlRenderer;

import fi.csc.avaa.tools.vaadin.customcomponent.AvaaBaseGrid;
import fi.csc.avaa.tools.vaadin.language.LanguageTools;
import fi.csc.avaa.tools.vaadin.language.Translator;
import fi.csc.avaa.tupa.common.TupaDBCache;
import fi.csc.avaa.tupa.db.model.Infra;
import fi.csc.avaa.tupa.db.model.Organisaatio;
import fi.csc.avaa.tupa.model.ExtInfra;
import fi.csc.avaa.tupa.model.ModelTools;
import fi.csc.avaa.tupa.result.InfraGridBean.FieldName;
import fi.csc.avaa.tupa.result.InfraGridBean.GridColumnName;

/**
 * @author jmlehtin
 *
 */
public class InfraGrid extends AvaaBaseGrid<InfraGridBean, ExtInfra> {

	private static final long serialVersionUID = 1L;
	private static final int INFRA_NAME_LETTER_AMOUNT_TO_SHOW = 100;
	private static final int INFRA_RESPONSIBLE_ORGS_AMOUNT_TO_SHOW = 75;
	private Navigator navigator;

	public InfraGrid(Translator translator, Navigator navigator) {
		super(translator, InfraGridBean.class);
		this.navigator = navigator;
		init();
		setStyleName("infra-grid tupa-grid");
//		setColumnOrder(LYHENNE.getValue(), NIMI.getValue(), VASTUUORGANISAATIOT.getValue(), KV_ISANNAT.getValue(), GENERATED_COLUMN_PALVELUTYYPIT.getValue(), GENERATED_COLUMN_PAIKKATYYPIT.getValue(), GENERATED_COLUMN_AVOIMUUS.getValue());
		setColumnOrder(LYHENNE.getValue(), NIMI.getValue(), VASTUUORGANISAATIOT.getValue(), KV_ISANNAT.getValue(), GENERATED_COLUMN_PALVELUTYYPIT.getValue(), GENERATED_COLUMN_PAIKKATYYPIT.getValue());
		setVisible(true);
	}

	@Override
	protected void addListeners() {
		addSelectionListener(e -> {
		    // Get the item of the selected row
			Object selectedItemId = getSelectedRow();
			if(selectedItemId != null) {
				navigator.navigateTo(InfraDetailsWindow.NAME + "/" + container.getItem(selectedItemId).getBean().getInfraId());
			}
		});
	}

	@Override
	protected void setColumns() {
		setGridColumn(LYHENNE);
		setGridColumn(NIMI);
		setGridColumn(VASTUUORGANISAATIOT);
		setGridColumn(KV_ISANNAT);
		setGridColumn(GENERATED_COLUMN_PALVELUTYYPIT);
		setGridColumn(GENERATED_COLUMN_PAIKKATYYPIT);
//		setGridColumn(GENERATED_COLUMN_AVOIMUUS);
		wrapperContainer.removeContainerProperty(INFRA_ID.getValue());
		
		setCellStyleGenerator(cellReference -> {
				if(cellReference != null && cellReference.getPropertyId() != null) {
					FieldName fName = FieldName.fromValue(String.valueOf(cellReference.getPropertyId()));
					if(fName != null) {
						switch (fName) {
//						case GENERATED_COLUMN_AVOIMUUS:
//							return "grid-cell-middle grid-cell-center grid-cell-openness";
						case KV_ISANNAT:
							return "grid-cell-text grid-cell-middle grid-cell-wrap grid-cell-center";
						case LYHENNE:
							return "grid-cell-text grid-cell-middle grid-cell-wrap grid-cell-center";
						case NIMI:
							return "grid-cell-text grid-cell-upper grid-cell-wrap grid-cell-center";
						case GENERATED_COLUMN_PAIKKATYYPIT:
							return "grid-cell-middle grid-cell-center";
						case GENERATED_COLUMN_PALVELUTYYPIT:
							return "grid-cell-middle grid-cell-center";
						case VASTUUORGANISAATIOT:
							return "grid-cell-text grid-cell-upper grid-cell-wrap grid-cell-center";
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
			for(ExtInfra extInfra : models) {
				InfraGridBean gridItem = convertToGridBean(extInfra);
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
		switch (column) {
//		case GENERATED_COLUMN_AVOIMUUS:
//			break;
		case KV_ISANNAT:
			gridCol.setWidth(120);
			break;
		case LYHENNE:
			gridCol.setWidth(110);
			break;
		case NIMI:
			gridCol.setWidth(280);
			break;
		case GENERATED_COLUMN_PAIKKATYYPIT:
			break;
		case GENERATED_COLUMN_PALVELUTYYPIT:
			break;
		case VASTUUORGANISAATIOT:
			gridCol.setWidth(200);
			break;
		default:
			break;
		}
	}

	@Override
	protected void setGeneratedColumns() {
//		wrapperContainer.addGeneratedProperty(GENERATED_COLUMN_AVOIMUUS.getValue(), new PropertyValueGenerator<String>() {
//			private static final long serialVersionUID = 1L;
//
//			@Override
//		    public String getValue(Item item, Object itemId,
//		                           Object propertyId) {
//				BeanItem<InfraGridBean> beanItem = container.getItem(itemId);
//		        return ModelTools.getOpennessRatingForInfra(TupaDBCache.getInfraCache().get(beanItem.getBean().getInfraId()), translator);
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
				BeanItem<InfraGridBean> beanItem = container.getItem(itemId);
				Map<Integer, Integer> palvelutyyppiCount = ModelTools.getInfraPalveluTyyppiCount(TupaDBCache.getInfraCache().get(beanItem.getBean().getInfraId()));
		        return ModelTools.getTyyppiIcons(palvelutyyppiCount, translator);
		    }

		    @Override
		    public Class<String> getType() {
		        return String.class;
		    }
		});
		wrapperContainer.addGeneratedProperty(GENERATED_COLUMN_PAIKKATYYPIT.getValue(), new PropertyValueGenerator<String>() {
			private static final long serialVersionUID = 1L;

			@Override
		    public String getValue(Item item, Object itemId,
		                           Object propertyId) {
				BeanItem<InfraGridBean> beanItem = container.getItem(itemId);
				Map<Integer, Integer> paikkatyyppiCount = ModelTools.getInfraPaikkatyyppiCount(TupaDBCache.getInfraCache().get(beanItem.getBean().getInfraId()));
		        return ModelTools.getTyyppiIcons(paikkatyyppiCount, translator);
		    }

		    @Override
		    public Class<String> getType() {
		        return String.class;
		    }
		});
		
//		getColumn(GENERATED_COLUMN_AVOIMUUS.getValue()).setRenderer(new HtmlRenderer());
		getColumn(GENERATED_COLUMN_PALVELUTYYPIT.getValue()).setRenderer(new HtmlRenderer());
		getColumn(GENERATED_COLUMN_PAIKKATYYPIT.getValue()).setRenderer(new HtmlRenderer());
		
	}
	
	@Override
	protected InfraGridBean convertToGridBean(ExtInfra extInfra) {
		Infra infra = extInfra.getInfra();
		int infraId = infra.getInfra_id();
		String infraAcronym = LanguageTools.getFI_ENTranslatedValueOrEmpty(infra.getLyhenne(), infra.getAcronym(), translator, true);
		String infraName = LanguageTools.getFI_ENTranslatedValueOrEmpty(infra.getNimi(), infra.getName(), translator, true);
		if(infraName.length() > INFRA_NAME_LETTER_AMOUNT_TO_SHOW) {
			infraName = infraName.substring(0, INFRA_NAME_LETTER_AMOUNT_TO_SHOW) + "...";
		}
		List<Organisaatio> topmostOrgs = ModelTools.getAllNonIntlParentestOrganisations(extInfra);
		String topmostOrgNames = topmostOrgs.stream().map(o -> LanguageTools.getFI_ENTranslatedValueOrEmpty(o.getNimi(), o.getName(), translator, true)).collect(Collectors.joining(", "));
		if(topmostOrgNames.length() > INFRA_RESPONSIBLE_ORGS_AMOUNT_TO_SHOW) {
			topmostOrgNames = topmostOrgNames.substring(0, INFRA_RESPONSIBLE_ORGS_AMOUNT_TO_SHOW) + "...";
		}
		List<Organisaatio> intlHostOrgs = ModelTools.getIntlHostOrganisations(extInfra);
		if(intlHostOrgs.size() > 1) {
			System.out.println("!");
		}
		String intlHostOrgNames = intlHostOrgs.stream().map(o -> LanguageTools.getFI_ENTranslatedValueOrEmpty(o.getNimi(), o.getName(), translator, true)).collect(Collectors.joining(", "));
		return new InfraGridBean(infraId, infraAcronym, infraName, topmostOrgNames, intlHostOrgNames);
	}

	@Override
	protected void setCustomHeaders() {
		
//		GridColumnName column = GridColumnName.getValuefromName(GENERATED_COLUMN_AVOIMUUS.name());
//		String avoimuusHtml = "<div class='v-label v-widget v-has-width' title='" + translator.localize("Description.Avoimuus") + "'>" + translator.localize(column.getValue()) + "</div>";
//		Label avoimuusLabel = new Label(translator.localize(column.getValue()));
//		avoimuusLabel.setDescription(translator.localize("Description.Avoimuus"));
//		getDefaultHeaderRow().getCell(GENERATED_COLUMN_AVOIMUUS.getValue()).setHtml(avoimuusHtml);//setComponent(avoimuusLabel);
		
		GridColumnName column2 = GridColumnName.getValuefromName(KV_ISANNAT.name());
		String isantaHtml = "<div class='v-label v-widget v-has-width' title='" + translator.localize("Description.kvisanta") + "'>" + translator.localize(column2.getValue()) + "</div>";
//		Label isantaLabel = new Label(translator.localize(column2.getValue()));
//		isantaLabel.setDescription(translator.localize("Description.kvisanta"));
		getDefaultHeaderRow().getCell(KV_ISANNAT.getValue()).setHtml(isantaHtml);
		
		GridColumnName column3 = GridColumnName.getValuefromName(GENERATED_COLUMN_PALVELUTYYPIT.name());
		String palveluHtml = "<div class='v-label v-widget v-has-width' title='" + translator.localize("Description.palvelutyypit") + "'>" + translator.localize(column3.getValue()) + "</div>";
//		Label palveluLabel = new Label(translator.localize(column3.getValue()));
//		palveluLabel.setDescription(translator.localize("Description.palvelutyypit"));
		getDefaultHeaderRow().getCell(GENERATED_COLUMN_PALVELUTYYPIT.getValue()).setHtml(palveluHtml);//setComponent(palveluLabel);
		
		GridColumnName column4 = GridColumnName.getValuefromName(GENERATED_COLUMN_PAIKKATYYPIT.name());
		String paikkaHtml = "<div class='v-label v-widget v-has-width' title='" + translator.localize("Description.paikkatyypit") + "'>" + translator.localize(column4.getValue()) + "</div>";
//		Label paikkaLabel = new Label(translator.localize(column4.getValue()));
//		paikkaLabel.setDescription(translator.localize("Description.paikkatyypit"));
		getDefaultHeaderRow().getCell(GENERATED_COLUMN_PAIKKATYYPIT.getValue()).setHtml(paikkaHtml);//setComponent(paikkaLabel);
		
		GridColumnName column5 = GridColumnName.getValuefromName(LYHENNE.name());
		String lyhenneHtml = "<div class='v-label v-widget v-has-width' title='" + translator.localize("Description.lyhenne") + "'>" + translator.localize(column5.getValue()) + "</div>";
//		Label lyhenneLabel = new Label(translator.localize(column5.getValue()));
//		lyhenneLabel.setDescription(translator.localize("Description.lyhenne"));
		getDefaultHeaderRow().getCell(LYHENNE.getValue()).setHtml(lyhenneHtml);//setComponent(lyhenneLabel);
		
		GridColumnName column6 = GridColumnName.getValuefromName(NIMI.name());
		String nimiHtml = "<div class='v-label v-widget v-has-width' title='" + translator.localize("Description.nimi") + "'>" + translator.localize(column6.getValue()) + "</div>";
//		Label nimiLabel = new Label(translator.localize(column6.getValue()));
//		nimiLabel.setDescription(translator.localize("Description.nimi"));
		getDefaultHeaderRow().getCell(NIMI.getValue()).setHtml(nimiHtml);//setComponent(nimiLabel);
		
		GridColumnName column7 = GridColumnName.getValuefromName(VASTUUORGANISAATIOT.name());
		String vastuuHtml = "<div class='v-label v-widget v-has-width' title='" + translator.localize("Description.vastuu") + "'>" + translator.localize(column7.getValue()) + "</div>";
//		Label vastuuLabel = new Label(translator.localize(column7.getValue()));
//		vastuuLabel.setDescription(translator.localize("Description.vastuu"));
		getDefaultHeaderRow().getCell(VASTUUORGANISAATIOT.getValue()).setHtml(vastuuHtml);//setComponent(vastuuLabel);
	}

}
