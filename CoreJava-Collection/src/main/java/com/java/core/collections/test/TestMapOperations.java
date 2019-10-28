package com.java.core.collections.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import com.java.core.collections.MapSorting;
import com.java.core.collections.exceptions.MapOperationException;
import com.java.core.collections.utils.MapUtils;

public class TestMapOperations {
	
	Map map;
	
	public static void main(String[] args) throws MapOperationException, IOException {
		
		
		MapSorting sorting=new MapSorting();
	      HashMap<String, String> mapData = new HashMap<String, String>();
	        
	      mapData.put("EDTSUPPORT", "Twinkle Urade");
	      mapData.put("EDTBAU", "Prashant Sarkar");
	      mapData.put("CCS", "Pooja Yadav");
	      mapData.put("BANK", "Ankita Mudgil");
	      mapData.put("CARD", "Rahat Ali");
	      mapData.put("CCSSUPPORT", "Rahul Gorane");
	      mapData.put("EDP", "Ritesh Wadhigare");
	      mapData.put("CARD ONSITE", "Rahul Gorane");
	      
		
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int caseVal = 0;
		while(true)
		{
			System.out.println("");
			System.out.println("Press 1 Print Map Data ");
			System.out.println("Press 2 To Sort The Map By Key ");
			System.out.println("Press 3 To Sort The Map By Value ");
			System.out.println("Press 0 To Exit the Programme ");
			String inputFromConsole=input.readLine();
			
			if(MapUtils.isInteger(inputFromConsole))
			     caseVal = Integer.parseInt(inputFromConsole);
			
			switch(caseVal) {
			case 1:
				System.out.println("Print The Map Data");
				MapUtils.printMapEntry(mapData) ;
				
				break;
			case 2:
				Map map1=sorting.sortMapByKeys(mapData);
				MapUtils.printMapEntry(map1) ;
				break;
			case 3:
				Map map2=sorting.sortMapByValues(mapData);
				MapUtils.printMapEntry(map2) ;
				break;
			case 0:
			    System.out.println("exiting the system....");
				System.exit(0);;
			default:
				System.out.println("Invalid Option");	
				break;
		
		
	         }
	  }

   }
}
