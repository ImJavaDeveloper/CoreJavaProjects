package com.java.core.collections;

import java.util.Map;

import com.java.core.collections.exceptions.MapOperationException;

public interface MapSort {
	
	
	public Map sortMapByValues(Map map)throws MapOperationException;
	Map<String, String> sortMapByKeys(Map<String, String> map) throws MapOperationException;
	


}
