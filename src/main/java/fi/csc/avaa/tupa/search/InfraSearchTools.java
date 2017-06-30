/**
 * 
 */
package fi.csc.avaa.tupa.search;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import fi.csc.avaa.tools.search.Searcher;
import fi.csc.avaa.tupa.common.PaikkatyyppiType;
import fi.csc.avaa.tupa.common.PalvelutyyppiType;
import fi.csc.avaa.tupa.db.model.Organisaatio;
import fi.csc.avaa.tupa.model.ExtInfra;
import fi.csc.avaa.tupa.model.ExtPalvelu;
import fi.csc.avaa.tupa.model.ModelTools;

/**
 * @author jmlehtin
 *
 */
public final class InfraSearchTools extends Searcher<ExtInfra, QueryBean> {

	@Override
	public void queryData(Collection<ExtInfra> searchDataset, QueryBean queryParams) {
		if(queryParams != null && searchDataset != null) {
			String searchStr = (queryParams.getSearchStr() == null) ? null : queryParams.getSearchStr().toLowerCase();
			
			Predicate<ExtInfra> vkFilter = new Predicate<ExtInfra>() {
				
				@Override
				public boolean test(ExtInfra extInfra) {
					if (queryParams.getStatus() && !extInfra.getInfra().getAktiivinen()) {
						return false;
					}
					if (queryParams.getInternationa() && !hasInternationalOrganisation(extInfra)) {
						return false;
					}
					if (queryParams.getMaterialOrientedServiceType() && !hasServiceType(extInfra, PalvelutyyppiType.MATERIAL)) {
						return false;
					}
					if (queryParams.getHardwareOrientedServiceType() && !hasServiceType(extInfra, PalvelutyyppiType.HARDWARE)) {
						return false;
					}
					if (queryParams.getServiceOrientedServiceType() && !hasServiceType(extInfra, PalvelutyyppiType.SERVICE)) {
						return false;
					}
					if (queryParams.getVirtualLocationType() && !hasLocationType(extInfra, PaikkatyyppiType.VIRTUAL)) {
						return false;
					}
					if (queryParams.getDistributedLocationType() && !hasLocationType(extInfra, PaikkatyyppiType.DISTRIBUTED)) {
						return false;
					}
					if (queryParams.getLocationBoundLocationType() && !hasLocationType(extInfra, PaikkatyyppiType.LOCATIONBOUND)) {
						return false;
					}
					if (queryParams.getAccessibility() != 0 && !hasAccessibility(extInfra, queryParams.getAccessibility())) {
						return false;
					}
					if (queryParams.getAnonymity() != 0 && !hasAnonymity(extInfra, queryParams.getAnonymity())) {
						return false;
					}
					if (queryParams.getChargeable() != 0 && !hasChargeability(extInfra, queryParams.getChargeable())) {
						return false;
					}
					if (queryParams.getObligationToPublishResults() != 0 && !hasObligationToPublishResult(extInfra, queryParams.getObligationToPublishResults())) {
						return false;
					}
					if (queryParams.getObligationToPublishOutput() != 0 && !hasObligationToPublishOutput(extInfra, queryParams.getObligationToPublishOutput())) {
						return false;
					}
					if (queryParams.getOpennesOfExpertise() != 0 && !hasOpennesOfExpertise(extInfra, queryParams.getOpennesOfExpertise())) {
						return false;
					}
					if (queryParams.getTrackingTools() != 0 && !hasTrackingTools(extInfra, queryParams.getTrackingTools())) {
						return false;
					}
					if (queryParams.getLicensingOfResults() != 0 && !hasLicensingOfResults(extInfra, queryParams.getLicensingOfResults())) {
						return false;
					}
					return (searchStr == null || searchStr.equals("")) ? true: isWordPresent(searchStr, extInfra);
				}
			};
			searchResults = searchDataset.stream().filter(vkFilter).collect(Collectors.toList());
		} else {
			searchResults = new ArrayList<>();
		}
	}
	
	private boolean hasInternationalOrganisation(ExtInfra t) {
		List<Organisaatio> intlOrgs = ModelTools.getIntlHostOrganisations(t);
		return intlOrgs != null && intlOrgs.size() > 0;
	}

	protected boolean hasLicensingOfResults(ExtInfra t, int licensingOfResults) {
		return t.getKayttoehto() == null ? false : t.getKayttoehto().getTulosten_lisensointi() >= licensingOfResults;
	}

	protected boolean hasTrackingTools(ExtInfra t, int trackingTools) {
		return t.getKayttoehto() == null ? false : t.getKayttoehto().getSeurantatyokalut() >= trackingTools;
	}

	protected boolean hasOpennesOfExpertise(ExtInfra t, int opennesOfExpertise) {
		return t.getKayttoehto() == null ? false : t.getKayttoehto().getOsaamisen_avoimuus() >= opennesOfExpertise;
	}

	protected boolean hasObligationToPublishOutput(ExtInfra t, int obligationToPublishOutput) {
		return t.getKayttoehto() == null ? false : t.getKayttoehto().getTuotoksien_julkaisuvelvoite() >= obligationToPublishOutput;
	}

	protected boolean hasObligationToPublishResult(ExtInfra t, int obligationToPublishResults) {
		return t.getKayttoehto() == null ? false : t.getKayttoehto().getTulosten_julkaisuvelvoite() >= obligationToPublishResults;
	}

	protected boolean hasChargeability(ExtInfra t, int chargeable) {
		return t.getKayttoehto() == null ? false : t.getKayttoehto().getMaksullisuus() >= chargeable;
	}

	private boolean hasAnonymity(ExtInfra t, int anonymity) {
		return t.getKayttoehto() == null ? false : t.getKayttoehto().getAnonymiteetti() >= anonymity;
	}
	
	private boolean hasAccessibility(ExtInfra t, int accessibility) {
		return t.getKayttoehto() == null ? false : t.getKayttoehto().getSaavutettavuus() >= accessibility;
	}

	private boolean hasServiceType(ExtInfra t, PalvelutyyppiType type) {
		for (ExtPalvelu extPalvelu : t.getPalvelut()) {
			if (extPalvelu.getPalvelutyypit().stream().anyMatch(palvelutyyppi -> palvelutyyppi.getTyyppi() == type.getCode())) {
				return true;
			}
		}
		return false;
	}

	private boolean hasLocationType(ExtInfra t, PaikkatyyppiType type) {
		return t.getPalvelut().stream().anyMatch(extPalvelu -> extPalvelu.getPalvelu().getPaikkatyyppi() == type.getCode());
	}

	private boolean isWordPresent(String searchStr, ExtInfra extInfra) {
		if (doesFieldContainsValue(searchStr, extInfra.getInfra().getNimi()) ||
				doesFieldContainsValue(searchStr, extInfra.getInfra().getName()) ||
				doesFieldContainsValue(searchStr, extInfra.getInfra().getLyhenne()) ||
				doesFieldContainsValue(searchStr, extInfra.getInfra().getAcronym()) ||
				doesFieldContainsValue(searchStr, extInfra.getInfra().getKuvaus()) ||
				doesFieldContainsValue(searchStr, extInfra.getInfra().getDescription()) ||
				isWordPresentInAvainsanat(searchStr, extInfra) ||
				isWordUsedInOrganizations(searchStr, extInfra) ||
				isWordUsedInPalveluNimi(searchStr, extInfra) ||
				isWordUsedInPalveluKuvaus(searchStr, extInfra)) {
			return true;
		}
		return false;
	}

	private boolean isWordUsedInPalveluNimi(String searchStr, ExtInfra extInfra) {
		return extInfra.getPalvelut().stream().anyMatch(palvelu -> palvelu.getPalvelu().getNimi().toLowerCase().contains(searchStr) || palvelu.getPalvelu().getName().toLowerCase().contains(searchStr));
	}

	private boolean isWordUsedInPalveluKuvaus(String searchStr, ExtInfra extInfra) {
		return extInfra.getPalvelut().stream().anyMatch(palvelu -> palvelu.getPalvelu().getKuvaus().toLowerCase().contains(searchStr) || palvelu.getPalvelu().getDescription().toLowerCase().contains(searchStr));
	}

	private boolean isWordPresentInAvainsanat(String searchStr, ExtInfra extInfra) {
		return extInfra.getAvainsanat().stream().anyMatch(avainsana -> avainsana.getAvainsana().toLowerCase().equals(searchStr) || avainsana.getKeyword().toLowerCase().equals(searchStr));
	}
	
	private boolean isWordUsedInOrganizations(String searchStr, ExtInfra extInfra) {
		return extInfra.getVastuuOrganisaatiot().stream().anyMatch(extOrg -> {
			if(doesFieldContainsValue(searchStr, extOrg.getOrganisaatio().getNimi().toLowerCase()) || doesFieldContainsValue(searchStr, extOrg.getOrganisaatio().getName().toLowerCase())) {
				return true;
			}
			for(Organisaatio emoOrg : extOrg.getEmoOrganisaatiot()) {
				if(doesFieldContainsValue(searchStr, emoOrg.getNimi().toLowerCase()) || doesFieldContainsValue(searchStr, emoOrg.getName().toLowerCase())) {
					return true;
				}
			}
			return false;
		});
	}

	private boolean doesFieldContainsValue(String searchStr, String dbValue) {
		return dbValue.toLowerCase().contains(searchStr);
	}
}
