@XmlSchema(
		namespace = "urn:nbn:se:uu:ub:epc-schema:rs-location-mapping",
		elementFormDefault = XmlNsForm.QUALIFIED,
		xmlns = {
				@XmlNs(
						prefix = "xsi",
						namespaceURI = "http://www.w3.org/2001/XMLSchema-instance"),
				@XmlNs(
						prefix = "",
						namespaceURI = "urn:nbn:se:uu:ub:epc-schema:rs-location-mapping"
				)
		}
)
		
package fi.csc.avaa.tupa.model;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;