package com.java.core.collections;

import static com.java.core.collections.utils.MapUtils.getEntrySet;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.java.core.collections.exceptions.MapOperationException;
import com.java.core.collections.utils.MapUtils;

public class MapSorting implements MapSort {

	@Override
	public Map<String, String> sortMapByKeys(Map<String, String> map) throws MapOperationException {
		
		TreeMap<String, String> treeMap=new TreeMap<>(map);
		return treeMap;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map sortMapByValues(Map map) throws MapOperationException {
		
		// Sort method needs a List, so let's first convert Set to List in Java
        @SuppressWarnings("unchecked")
		ArrayList<Entry<String, String>> listOfEntries = new ArrayList<Entry<String, String>>(MapUtils.getEntrySet(map));
        
        // sorting HashMap by values using comparator
        Collections.sort(listOfEntries, MapUtils.comparator);
        
        LinkedHashMap<String, String> sortedByValue = new LinkedHashMap<String, String>(listOfEntries.size());
        
        // copying entries from List to Map
        for(Entry<String, String> entry : listOfEntries){
            sortedByValue.put(entry.getKey(), entry.getValue());
        }
        
        System.out.println("HashMap after sorting entries by values ");
		return sortedByValue;
		// TODO Auto-generated method stub
		
	}

	
}
