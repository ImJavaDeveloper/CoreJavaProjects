package com.java.core.string.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.java.core.string.constant.StringConstants;
import com.java.core.string.exception.StringOperationException;

public class StringUtils extends StringHelper
{

	public String delimeter=StringConstants.DEFAULT_DELIMETER;
	
	public static String  sortStrings(String sentence,String delimeter) throws StringOperationException
	{			
		StringBuffer buffer = new StringBuffer();
		String []s=splitStrings(sentence, delimeter);
		if(s.length<=0 || s.length==1)
			throw new StringOperationException("Sentence:"+sentence+ " is either single word or empty");
		Arrays.sort(s);
		
		if(delimeter==null)
			delimeter=StringConstants.DEFAULT_DELIMETER;
		for(int i =0;i<s.length;i++)
			buffer.append(s[i]+delimeter);		
		
		return buffer.toString();
	}
	
	public static String  sortStrings(String sentence) throws StringOperationException
	{						
		return sortStrings(sentence,null);
	}
	
	/*Sorting Single Word*/
	public static String  sortString(String word) 
	{			
		
	    char [] chars=word.toCharArray();
		Arrays.sort(chars);
	
		return new String(chars);
	}
	
	/* Sorting String With Uniqueness*/
	public static String sortUniqStrings(String sentence,String delimeter) throws StringOperationException
	{
	
	return removeDuplicateWord	(sortStrings(sentence,delimeter),delimeter);
	
	}
	public static String sortUniqStrings(String sentence) throws StringOperationException
	{
		
	return sortUniqStrings(sentence,null);
	
	}
	
	
	public static void printWordcount(String sentence) throws StringOperationException
	{
		Map<String,Integer> map=new HashMap<String,Integer>(); 
		if(sentence.trim().length()==0 || sentence==null)
		{
			throw new StringOperationException("Sentence is either is null or it is empty");
		
		}
		else
		{
			
			String strings[]=splitStrings(sentence, null);
			for(String s:strings)
			{
				if(map.get(s)!=null)
				{
					map.put(s, map.get(s)+1);	
				}
				else
				map.put(s, 1);
			}
		}
		
		printMap(map);
		
	}
	
	public static String reversString(String string)
	{
		StringBuffer buffer =new StringBuffer(string);
		buffer.reverse();
		return buffer.toString();
		
	}
	public static String removeDulicateCharFromString(String string) throws StringOperationException
	{
	
		return removeDuplicateChar(string);
		
	}
	
	public static String removeDuplicateWordFromStrings(String sentence) throws StringOperationException
	{
	
		return removeDuplicateWord(sentence);
		
	}
	
	
}
