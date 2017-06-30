/**
 * 
 */
package fi.csc.avaa.tupa.search;

import fi.csc.avaa.tools.search.SearchBean;
import fi.csc.avaa.tools.vaadin.language.Translator;

/**
 * @author jmlehtin
 *
 */
public class QueryBean extends SearchBean {

	private String searchStr;
	private Boolean materialOrientedServiceType;
	private boolean hardwareOrientedServiceType;
	private boolean serviceOrientedServiceType;
	private boolean status;
	private boolean international;
	private boolean virtualLocationType;
	private boolean distributedLocationType;
	private boolean locationBoundLocationType;
	private int accessibility;
	private int anonymity;
	private int chargeable;
	private int obligationToPublishResults;
	private int obligationToPublishOutput;
	private int opennesOfExpertise;
	private int trackingTools;
	private int licensingOfResults;
	
	public QueryBean(String searchStr) {
		this.searchStr = searchStr;
	}
	
	public String getSearchStr() {
		return searchStr;
	}

	public void setSearchStr(String searchStr) {
		this.searchStr = searchStr;
	}

	@Override
	public String getFieldsAsHtml(Translator translator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFieldsAsString() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMaterialOrientedServiceType(boolean materialOrientedServiceType) {
		this.materialOrientedServiceType = materialOrientedServiceType;
	}

	public boolean getMaterialOrientedServiceType() {
		return this.materialOrientedServiceType;
	}

	public void setHardwareOrientedServiceType(boolean hardwareOrientedServiceType) {
		this.hardwareOrientedServiceType = hardwareOrientedServiceType;
	}

	public boolean getHardwareOrientedServiceType() {
		return hardwareOrientedServiceType;
	}

	public void setServiceOrientedServiceType(boolean isServiceOrientedServiceType) {
		this.serviceOrientedServiceType = isServiceOrientedServiceType;
	}

	public boolean getServiceOrientedServiceType() {
		return serviceOrientedServiceType;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public boolean getStatus() {
		return this.status;
	}

	public void setInternational(boolean international) {
		this.international = international;
	}
	
	public boolean getInternationa() {
		return this.international;
	}

	public void setVirtualLocationType(boolean virtualLocationType) {
		this.virtualLocationType = virtualLocationType;
	}
	
	public boolean getVirtualLocationType() {
		return this.virtualLocationType;
	}

	public void setDistributedLocationType(Boolean distributedLocationType) {
		this.distributedLocationType = distributedLocationType;
	}

	public boolean getDistributedLocationType() {
		return this.distributedLocationType;
	}

	public void setLocationBoundLocationType(boolean locationBoundLocationType) {
		this.locationBoundLocationType = locationBoundLocationType;
	}

	public boolean getLocationBoundLocationType() {
		return this.locationBoundLocationType;
	}

	public void setAccessibilty(int accessibility) {
		this.accessibility = accessibility;
	}

	public int getAccessibility() {
		return this.accessibility;
	}

	public void setAnonymity(int anonymity) {
		this.anonymity = anonymity;
	}

	public int getAnonymity() {
		return this.anonymity;
	}

	public void setChargeable(int chargeable) {
		this.chargeable = chargeable;
	}

	public int getChargeable() {
		return this.chargeable;
	}

	public void setObligationToPublishResults(int obligationToPublishResults) {
		this.obligationToPublishResults = obligationToPublishResults;
	}

	public int getObligationToPublishResults() {
		return this.obligationToPublishResults;
	}

	public void setObligationToPublishOutput(int obligationToPublishOutput) {
		this.obligationToPublishOutput = obligationToPublishOutput;
	}

	public int getObligationToPublishOutput() {
		return this.obligationToPublishOutput;
	}

	public void setOpennesOfExpertise(int opennesOfExpertise) {
		this.opennesOfExpertise = opennesOfExpertise;
	}

	public int getOpennesOfExpertise() {
		return this.opennesOfExpertise;
	}

	public void setTrackingTools(int trackingTools) {
		this.trackingTools = trackingTools;
	}

	public int getTrackingTools() {
		return this.trackingTools;
	}

	public void setLicensingOfResults(int licensingOfResults) {
		this.licensingOfResults = licensingOfResults;
	}

	public int getLicensingOfResults() {
		return this.licensingOfResults;
	}
}
