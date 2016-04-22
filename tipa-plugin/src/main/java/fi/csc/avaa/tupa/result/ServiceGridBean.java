/**
 * 
 */
package fi.csc.avaa.tupa.result;


/**
 * @author jmlehtin
 *
 */
public class ServiceGridBean {

	private int palveluId;
	private String palveluNimi;
	private String kuvaus;
	private String infraLyhenteet;
	private String sijainti;
	
	public ServiceGridBean(
			int palveluId, 
			String palveluNimi, 
			String kuvaus,
			String infraLyhenteet,
			String sijainti) {
		this.palveluId = palveluId;
		this.palveluNimi = palveluNimi;
		this.kuvaus = kuvaus;
		this.infraLyhenteet = infraLyhenteet;
		this.sijainti = sijainti;
	}
	
	public enum FieldName {
		PALVELU_ID("palveluId"),
		PALVELU_NIMI("palveluNimi"),
		KUVAUS("kuvaus"),
		INFRA_LYHENTEET("infraLyhenteet"),
		SIJAINTI("sijainti"),
		GENERATED_COLUMN_PALVELUTYYPIT("palvelutyypit"),
		GENERATED_COLUMN_PAIKKATYYPPI("paikkatyyppi"),
		GENERATED_COLUMN_AVOIMUUS("avoimuus");
		
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
		PALVELU_NIMI("Results.Grid.ColumnName.PalveluNimi"),
		KUVAUS("Results.Grid.ColumnName.Kuvaus"),
		INFRA_LYHENTEET("Results.Grid.ColumnName.InfraLyhenteet"),
		SIJAINTI("Results.Grid.ColumnName.Sijainti"),
		GENERATED_COLUMN_PALVELUTYYPIT("Results.Grid.ColumnName.Palvelutyypit"),
		GENERATED_COLUMN_PAIKKATYYPPI("Results.Grid.ColumnName.Paikkatyyppi"),
		GENERATED_COLUMN_AVOIMUUS("Results.Grid.ColumnName.Avoimuus");
		
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

	public int getPalveluId() {
		return palveluId;
	}

	public String getPalveluNimi() {
		return palveluNimi;
	}

	public String getKuvaus() {
		return kuvaus;
	}

	public String getInfraLyhenteet() {
		return infraLyhenteet;
	}

	public String getSijainti() {
		return sijainti;
	}

}
