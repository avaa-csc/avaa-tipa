package fi.csc.avaa.tupa.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "records")
@XmlType(propOrder = {"version", "dateStamp","list"})
public class RestInfraRecordListWrapper {

	private List<RestInfraRecord> list = new ArrayList<>();
	private RestInfraDateStamp dateStamp;
	private String version = "3.0";

	public RestInfraRecordListWrapper() {
	}

	@XmlElement(name = "record")
	public List<RestInfraRecord> getList() {
		return list;
	}

	public void setList(List<RestInfraRecord> list) {
		this.list = list;
	}

	@XmlElement(name = "protocol-version")
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	@XmlElement(name = "datestamp")
	public RestInfraDateStamp getDateStamp() {
		return dateStamp;
	}

	public void setDateStamp(RestInfraDateStamp dateStamp) {
		this.dateStamp = dateStamp;
	}
}
