/**
 * 
 */
package fi.csc.avaa.tupa.result;


/**
 * @author jmlehtin
 *
 */
public class InfraGridBean {

	private int infraId;
	private String lyhenne;
	private String nimi;
	private String vastuuOrganisaatiot;
	private String kvIsannat;
	
	public InfraGridBean(
			int infraId, 
			String lyhenne, 
			String nimi,
			String vastuuOrganisaatiot,
			String kvIsannat) {
		this.infraId = infraId;
		this.lyhenne = lyhenne;
		this.nimi = nimi;
		this.vastuuOrganisaatiot = vastuuOrganisaatiot;
		this.kvIsannat = kvIsannat;
	}
	
	public enum FieldName {
		INFRA_ID("infraId"),
		LYHENNE("lyhenne"),
		NIMI("nimi"),
		VASTUUORGANISAATIOT("vastuuOrganisaatiot"),
		KV_ISANNAT("kvIsannat"),
		GENERATED_COLUMN_PALVELUTYYPIT("palvelutyypit"),
		GENERATED_COLUMN_PAIKKATYYPIT("paikkatyypit");
//		GENERATED_COLUMN_AVOIMUUS("avoimuus");
		
		private String value;
		
		private FieldName(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
		
		public static FieldName fromValue(String name) {
			if(name == null || name.isEmpty()) {
				return null;
			}
			for(FieldName columnType : FieldName.values()) {
				String col = columnType.getValue();
				if(col.equals(name)) {
					return columnType;
				}
			}
			return null;
		}
	}
	
	public enum GridColumnName {
		LYHENNE("Results.Grid.ColumnName.Lyhenne"),
		NIMI("Results.Grid.ColumnName.Nimi"),
		VASTUUORGANISAATIOT("Results.Grid.ColumnName.Vastuuorganisaatiot"),
		KV_ISANNAT("Results.Grid.ColumnName.KVIsannat"),
		GENERATED_COLUMN_PALVELUTYYPIT("Results.Grid.ColumnName.Palvelutyypit"),
		GENERATED_COLUMN_PAIKKATYYPIT("Results.Grid.ColumnName.Paikkatyypit");
//		GENERATED_COLUMN_AVOIMUUS("Results.Grid.ColumnName.Avoimuus");
		
		String value;
		
		private GridColumnName(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}	
		
		public static GridColumnName getValuefromName(String name) {
			if(name == null || name.isEmpty()) {
				return null;
			}
			for(GridColumnName columnType : GridColumnName.values()) {
				String col = columnType.name();
				if(col.equals(name)) {
					return columnType;
				}
			}
			return null;
		}
	}

	public int getInfraId() {
		return infraId;
	}
	
	public String getLyhenne() {
		return lyhenne;
	}

	public String getNimi() {
		return nimi;
	}
	
	public String getVastuuOrganisaatiot() {
		return vastuuOrganisaatiot;
	}

	public String getKvIsannat() {
		return kvIsannat;
	}

}
