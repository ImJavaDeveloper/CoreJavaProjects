package com.java.core.collections.utils;

import static com.java.core.collections.utils.MapUtils.getEntrySet;

import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

import com.java.core.collections.exceptions.MapOperationException;

public class MapUtils extends MapUtilsHelper {
	
	
	
	public static boolean isInteger(String string)
    {
      Scanner scanner=new Scanner(string);
      try {
      if(scanner.hasNextInt())
	       return true;
      else
	   return false;
    }
      finally {
	   scanner.close();	
      }
    }
      
	@SuppressWarnings("unchecked")
	public static Set<Entry<String,String>> getEntrySet(Map<String,String> map) throws MapOperationException
	{
		if(map==null)
			throw new MapOperationException("Map Is Empty or Null");
		Set<Entry<String, String>> set=map.entrySet();
		return  set;
		
		
	}
	
	public static void printMapEntry(Map map) throws MapOperationException
	{
		Set<Entry<String, String>> entrySet=getEntrySet(map);
		printMapEntrySet(entrySet);
	}

}
