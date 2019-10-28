package com.java.core.string.util;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.java.core.string.constant.StringConstants;
import com.java.core.string.exception.StringOperationException;

public class StringHelper {
	
	protected static String[] splitStrings(String sentence,String delimeter)
	{
       String splitString[]=null;
		
		if(delimeter!=null && !delimeter.equals(StringConstants.DEFAULT_DELIMETER) )
		   {
			splitString=sentence.split(" ");
			
		   }
		else
			splitString=sentence.split(StringConstants.DEFAULT_DELIMETER);
		
		return splitString;
		
	}
	
	protected static String  removeduplicateWord(String sentence) throws StringOperationException
	{
		return removeduplicateWord(sentence,null);
	}
	
	protected static String  removeduplicateWord(String sentence,String delimeter) throws StringOperationException
	{
		String strings[]=splitStrings(sentence, delimeter);
		Set<String> set=new LinkedHashSet<String>();
		
		for(String s:strings)
			set.add(s);
		Iterator< String> itr=set.iterator();
		StringBuffer buffer=new StringBuffer();
		if(delimeter==null)
			delimeter=StringConstants.DEFAULT_DELIMETER;
		while(itr.hasNext())
		{
			buffer.append(itr.next()+delimeter);
		}
		
		return buffer.toString();
	}

protected static void printMap(Map<String, ?> map)
{
	Set<String> keySet=map.keySet();
	Iterator<String> itr=keySet.iterator();
	
	while(itr.hasNext())
	 {
		String key=itr.next();
		System.out.println("key:"+key+"-->Value:"+map.get(key)); 
	 }
}
}
