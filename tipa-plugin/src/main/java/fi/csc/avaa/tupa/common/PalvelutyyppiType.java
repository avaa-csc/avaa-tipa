package fi.csc.avaa.tupa.common;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum PalvelutyyppiType {
	MATERIAL(1),
	SERVICE(2),
	HARDWARE(3);
    private static final Map<Integer,PalvelutyyppiType> lookup = new HashMap<>();

    static {
    	for(PalvelutyyppiType acc : EnumSet.allOf(PalvelutyyppiType.class))
         lookup.put(acc.getCode(), acc);
    }
	
	private int code;

	private PalvelutyyppiType(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
    public static PalvelutyyppiType get(int code) { 
        return lookup.get(code); 
   }
}
