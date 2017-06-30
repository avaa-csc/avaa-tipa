package fi.csc.avaa.tupa.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "header")
public class RestInfraHeader {
	
	private RestInfraDateStamp dateStamp;
	private String identifier;
	private RestInfraDestinationListWrapper restInfraDestinationListWrapper;

	public RestInfraHeader() {
	}

	@XmlElement(name = "datestamp")
	public RestInfraDateStamp getDateStamp() {
		return dateStamp;
	}

	public void setDateStamp(RestInfraDateStamp dateStamp) {
		this.dateStamp = dateStamp;
	}

	@XmlElement(name = "identifier")
	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@XmlElement(name = "destinations")
	public RestInfraDestinationListWrapper getRestInfraDestinationListWrapper() {
		return restInfraDestinationListWrapper;
	}

	public void setRestInfraDestinationListWrapper(RestInfraDestinationListWrapper restInfraDestinationListWrapper) {
		this.restInfraDestinationListWrapper = restInfraDestinationListWrapper;
	}
}
