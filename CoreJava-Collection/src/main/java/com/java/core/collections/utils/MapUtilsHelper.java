package com.java.core.collections.utils;

import java.util.Set;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class MapUtilsHelper {

	;
	
	protected static void printMapEntrySet(Set<Entry<String,String>> entry)
	{
		for(Entry<String,String> entries:entry )
		    System.out.println("'Key': "+entries.getKey()+" 'Value:' "+entries.getValue());
	}
	
	public static Comparator<Entry<String,String>> comparator=new Comparator<Entry<String,String>>() {

		@Override
		public int compare(Entry<String, String> val1, Entry<String, String> val2) {
			// TODO Auto-generated method stub
			return val1.getValue().compareTo(val2.getValue());
		}
		
	};
}
