package fi.csc.avaa.tupa.search;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import fi.csc.avaa.tools.search.Searcher;
import fi.csc.avaa.tupa.common.PaikkatyyppiType;
import fi.csc.avaa.tupa.common.PalvelutyyppiType;
import fi.csc.avaa.tupa.common.TupaDBCache;
import fi.csc.avaa.tupa.db.model.Infra;
import fi.csc.avaa.tupa.db.model.Organisaatio;
import fi.csc.avaa.tupa.model.ExtInfra;
import fi.csc.avaa.tupa.model.ExtPalvelu;
import fi.csc.avaa.tupa.model.ModelTools;

public class PalveluSearchTools extends Searcher<ExtPalvelu, QueryBean> {

	@Override
	public void queryData(Collection<ExtPalvelu> searchDataset, QueryBean queryParams) {
		if(queryParams != null && searchDataset != null) {
			String searchStr = (queryParams.getSearchStr() == null) ? null : queryParams.getSearchStr().toLowerCase();
			
			Predicate<ExtPalvelu> palveluFilter = new Predicate<ExtPalvelu>() {
				@Override
				public boolean test(ExtPalvelu extPalvelu) {
					if (queryParams.getStatus() && !hasActiveInfra(extPalvelu)) {
						return false;
					}
					if (queryParams.getInternationa() && !hasInternationalOrganisation(extPalvelu)) {
						return false;
					}
					if (queryParams.getMaterialOrientedServiceType() && !hasServiceType(extPalvelu, PalvelutyyppiType.MATERIAL)) {
						return false;
					}
					if (queryParams.getHardwareOrientedServiceType() && !hasServiceType(extPalvelu, PalvelutyyppiType.HARDWARE)) {
						return false;
					}
					if (queryParams.getServiceOrientedServiceType() && !hasServiceType(extPalvelu, PalvelutyyppiType.SERVICE)) {
						return false;
					}
					if (queryParams.getVirtualLocationType() && !hasLocationType(extPalvelu, PaikkatyyppiType.VIRTUAL)) {
						return false;
					}
					if (queryParams.getDistributedLocationType() && !hasLocationType(extPalvelu, PaikkatyyppiType.DISTRIBUTED)) {
						return false;
					}
					if (queryParams.getLocationBoundLocationType() && !hasLocationType(extPalvelu, PaikkatyyppiType.LOCATIONBOUND)) {
						return false;
					}
					if (queryParams.getAccessibility() != 0 && !hasAccessibility(extPalvelu, queryParams.getAccessibility())) {
						return false;
					}
					if (queryParams.getAnonymity() != 0 && !hasAnonymity(extPalvelu, queryParams.getAnonymity())) {
						return false;
					}
					if (queryParams.getChargeable() != 0 && !hasChargeability(extPalvelu, queryParams.getChargeable())) {
						return false;
					}
					if (queryParams.getObligationToPublishResults() != 0 && !hasObligationToPublishResult(extPalvelu, queryParams.getObligationToPublishResults())) {
						return false;
					}
					if (queryParams.getObligationToPublishOutput() != 0 && !hasObligationToPublishOutput(extPalvelu, queryParams.getObligationToPublishOutput())) {
						return false;
					}
					if (queryParams.getOpennesOfExpertise() != 0 && !hasOpennesOfExpertise(extPalvelu, queryParams.getOpennesOfExpertise())) {
						return false;
					}
					if (queryParams.getTrackingTools() != 0 && !hasTrackingTools(extPalvelu, queryParams.getTrackingTools())) {
						return false;
					}
					if (queryParams.getLicensingOfResults() != 0 && !hasLicensingOfResults(extPalvelu, queryParams.getLicensingOfResults())) {
						return false;
					}
					return (searchStr == null || searchStr.equals("")) ? true: isWordPresent(searchStr.toLowerCase(), extPalvelu);
				}
			};
			searchResults = searchDataset.stream().filter(palveluFilter).collect(Collectors.toList());
		} else {
			searchResults = new ArrayList<>();
		}
	}
	
	private boolean hasActiveInfra(ExtPalvelu extPalvelu) {
		return extPalvelu.getInfrat().stream().anyMatch(infra -> infra.getAktiivinen());
	}

	private boolean hasInternationalOrganisation(ExtPalvelu extPalvelu) {
		return extPalvelu.getInfrat().stream().anyMatch(infra -> hasInternationalOrganisation(infra));
	}

	private boolean hasInternationalOrganisation(Infra infra) {
		ExtInfra extInfra = getExtInfra(infra);
		return ModelTools.getIntlHostOrganisations(extInfra).size() != 0;		
	}

	private boolean hasAccessibility(ExtPalvelu extPalvelu, int accessibility) {
		return extPalvelu.getInfrat().stream().anyMatch(infra -> hasAccessibility(infra, accessibility));
	}
	
	private boolean hasAccessibility(Infra infra, int accessibility) {
		ExtInfra extInfra = getExtInfra(infra);
		return extInfra.getKayttoehto().getSaavutettavuus() >= accessibility;		
	}
	
	private boolean hasAnonymity(ExtPalvelu extPalvelu, int anonymity) {
		return extPalvelu.getInfrat().stream().anyMatch(infra -> hasAnonymity(infra, anonymity));
	}

	private boolean hasAnonymity(Infra infra, int anonymity) {
		ExtInfra extInfra = getExtInfra(infra);
		return extInfra.getKayttoehto().getAnonymiteetti() >= anonymity;		
	}
	
	private boolean hasChargeability(ExtPalvelu extPalvelu, int chargeable) {
		return extPalvelu.getInfrat().stream().anyMatch(infra -> hasChargeability(infra, chargeable));
	}
	
	private boolean hasChargeability(Infra infra, int chargeable) {
		ExtInfra extInfra = getExtInfra(infra);
		return extInfra.getKayttoehto().getMaksullisuus() >= chargeable;		
	}
	
	private boolean hasObligationToPublishResult(ExtPalvelu extPalvelu, int obligationToPublishResults) {
		return extPalvelu.getInfrat().stream().anyMatch(infra -> hasObligationToPublishResult(infra, obligationToPublishResults));
	}

	private boolean hasObligationToPublishResult(Infra infra, int obligationToPublishResults) {
		ExtInfra extInfra = getExtInfra(infra);
		return extInfra.getKayttoehto().getTulosten_julkaisuvelvoite() >= obligationToPublishResults;		
	}

	private boolean hasObligationToPublishOutput(ExtPalvelu extPalvelu, int obligationToPublishOutput) {
		return extPalvelu.getInfrat().stream().anyMatch(infra -> hasObligationToPublishOutput(infra, obligationToPublishOutput));
	}

	private boolean hasObligationToPublishOutput(Infra infra, int obligationToPublishOutput) {
		ExtInfra extInfra = getExtInfra(infra);
		return extInfra.getKayttoehto().getTuotoksien_julkaisuvelvoite() >= obligationToPublishOutput;		
	}

	private boolean hasOpennesOfExpertise(ExtPalvelu extPalvelu, int opennesOfExpertise) {
		return extPalvelu.getInfrat().stream().anyMatch(infra -> hasOpennesOfExpertise(infra, opennesOfExpertise));
	}

	private boolean hasOpennesOfExpertise(Infra infra, int opennesOfExpertise) {
		ExtInfra extInfra = getExtInfra(infra);
		return extInfra.getKayttoehto().getOsaamisen_avoimuus() >= opennesOfExpertise;		
	}

	private boolean hasTrackingTools(ExtPalvelu extPalvelu, int trackingTools) {
		return extPalvelu.getInfrat().stream().anyMatch(infra -> hasTrackingTools(infra, trackingTools));
	}

	private boolean hasTrackingTools(Infra infra, int trackingTools) {
		ExtInfra extInfra = getExtInfra(infra);
		return extInfra.getKayttoehto().getSeurantatyokalut() >= trackingTools;		
	}

	private boolean hasLicensingOfResults(ExtPalvelu extPalvelu, int licensingOfResults) {
		return extPalvelu.getInfrat().stream().anyMatch(infra -> hasLicensingOfResults(infra, licensingOfResults));
	}
	
	private boolean hasLicensingOfResults(Infra infra, int licensingOfResults) {
		ExtInfra extInfra = getExtInfra(infra);
		return extInfra.getKayttoehto().getTulosten_lisensointi() >= licensingOfResults;		
	}
	
	private ExtInfra getExtInfra(Infra infra) {
		return TupaDBCache.getInfraCache().get(infra.getInfra_id());
	}

	private boolean hasServiceType(ExtPalvelu extPalvelu, PalvelutyyppiType type) {
		if (extPalvelu.getPalvelutyypit().stream().anyMatch(palvelutyyppi -> palvelutyyppi.getTyyppi() == type.getCode())) {
			return true;
		}
		return false;
	}

	private boolean hasLocationType(ExtPalvelu extPalvelu, PaikkatyyppiType type) {
		return extPalvelu.getPalvelu().getPaikkatyyppi() == type.getCode();
	}

	private boolean isWordPresent(String searchStr, ExtPalvelu extPalvelu) {
		if (doesFieldContainsValue(searchStr, extPalvelu.getPalvelu().getNimi()) ||
			doesFieldContainsValue(searchStr,extPalvelu.getPalvelu().getName()) ||
			doesFieldContainsValue(searchStr, extPalvelu.getPalvelu().getKuvaus()) ||
			doesFieldContainsValue(searchStr, extPalvelu.getPalvelu().getDescription()) ||
			doesFieldContainsValue(searchStr, extPalvelu.getPalvelu().getKaupunki()) ||
			isWordUsedInContainingInfraName(searchStr, extPalvelu) ||
			isWordUsedInContainingInfraDescription(searchStr, extPalvelu) ||
			isWordUsedInContainingInfraKeywords(searchStr, extPalvelu) ||
			isWordUsedInResponsibleOrganizationName(searchStr, extPalvelu)) {
			return true;
		}
		return false;
	}

	private boolean isWordUsedInContainingInfraName(String searchStr, ExtPalvelu extPalvelu) {
		return extPalvelu.getInfrat().stream().anyMatch(infra -> infra.getNimi().toLowerCase().contains(searchStr)||infra.getName().toLowerCase().contains(searchStr));
	}

	private boolean isWordUsedInContainingInfraDescription(String searchStr, ExtPalvelu extPalvelu) {
		return extPalvelu.getInfrat().stream().anyMatch(infra -> infra.getKuvaus().toLowerCase().contains(searchStr)||infra.getDescription().toLowerCase().contains(searchStr));
	}

	private boolean isWordUsedInContainingInfraKeywords(String searchStr, ExtPalvelu extPalvelu) {
		return extPalvelu.getInfrat().stream().anyMatch(infra -> isWordUsedInContainingInfraKeywords(searchStr, infra));
	}

	private boolean isWordUsedInContainingInfraKeywords(String searchStr, Infra infra) {
		ExtInfra extInfra = getExtInfra(infra);
		return extInfra.getAvainsanat().stream().anyMatch(avainSana -> avainSana.getAvainsana().equalsIgnoreCase(searchStr) || avainSana.getKeyword().equalsIgnoreCase(searchStr));
	}

	private boolean isWordUsedInResponsibleOrganizationName(String searchStr, ExtPalvelu extPalvelu) {
		return extPalvelu.getInfrat().stream().anyMatch(infra -> isWordUsedInResponsibleOrganizationName(infra, searchStr));
	}

	private boolean isWordUsedInResponsibleOrganizationName(Infra infra, String searchStr) {
		ExtInfra extInfra = getExtInfra(infra);
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
