package fi.csc.avaa.tupa.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "record")
public class RestInfraRecord {
	
	private RestInfraHeader restInfraLegacyHeader;

	public RestInfraRecord() {
	}

	@XmlElement(name = "header")
	public RestInfraHeader getRestInfraLegacyHeader() {
		return restInfraLegacyHeader;
	}

	public void setRestInfraLegacyHeader(RestInfraHeader restInfraLegacyHeader) {
		this.restInfraLegacyHeader = restInfraLegacyHeader;
	}
}
