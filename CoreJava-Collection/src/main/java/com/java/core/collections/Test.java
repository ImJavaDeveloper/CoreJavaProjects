package com.java.core.collections;

import java.util.HashMap;
import java.util.Map;

import com.java.core.collections.exceptions.MapOperationException;
import com.java.core.collections.utils.MapUtils;

public class Test {

	
	public static void main(String[] args) {
		
	  MapSorting sorting=new MapSorting();
      HashMap<String, String> codenames = new HashMap<String, String>();
        
        codenames.put("JDK 1.1.4", "Sparkler");
        codenames.put("J2SE 1.2", "Playground");
        codenames.put("J2SE 1.3", "Kestrel");
        codenames.put("J2SE 1.4", "Merlin");
        codenames.put("J2SE 5.0", "Tiger");
        codenames.put("Java SE 6", "Mustang");
        codenames.put("Java SE 7", "Dolphin");
        try {
			System.out.println("Print The Map Entries Before Sorting");
        	MapUtils.printMapEntry(codenames) ;
			Map map=sorting.sortMapByKeys(codenames);
			System.out.println("Print The Map Entries Before Sorting");
			MapUtils.printMapEntry(map);
			Map map2=sorting.sortMapByValues(codenames);
			MapUtils.printMapEntry(map2);
			
		} catch (MapOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	
	
}
