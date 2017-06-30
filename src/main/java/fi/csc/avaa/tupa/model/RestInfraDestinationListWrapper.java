package fi.csc.avaa.tupa.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "destinations")
public class RestInfraDestinationListWrapper {
	
	private List<RestInfraDestination> list = new ArrayList<>();
	
	public RestInfraDestinationListWrapper() {
	}

	@XmlElement(name = "destination")
	public List<RestInfraDestination> getList() {
		return list;
	}

	public void setList(List<RestInfraDestination> list) {
		this.list = list;
	}
}
