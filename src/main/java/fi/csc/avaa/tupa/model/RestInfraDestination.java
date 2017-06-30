package fi.csc.avaa.tupa.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "destination")
public class RestInfraDestination {
	
	private RestInfraDateStamp dateStamp;
	private String status;
	private String url;

	public RestInfraDestination() {
	}

	@XmlElement(name = "datestamp")
	public RestInfraDateStamp getDateStamp() {
		return dateStamp;
	}

	public void setDateStamp(RestInfraDateStamp dateStamp) {
		this.dateStamp = dateStamp;
	}
	
	@XmlElement(name = "url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@XmlAttribute(name = "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
