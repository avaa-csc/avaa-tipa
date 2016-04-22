package fi.csc.avaa.tupa.common;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum PaikkatyyppiType {
	VIRTUAL(11),
	DISTRIBUTED(12),
	LOCATIONBOUND(13);
    private static final Map<Integer,PaikkatyyppiType> lookup = new HashMap<>();

    static {
    	for(PaikkatyyppiType acc : EnumSet.allOf(PaikkatyyppiType.class))
         lookup.put(acc.getCode(), acc);
    }
	
	private int code;

	private PaikkatyyppiType(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
    public static PaikkatyyppiType get(int code) { 
        return lookup.get(code); 
   }
}
