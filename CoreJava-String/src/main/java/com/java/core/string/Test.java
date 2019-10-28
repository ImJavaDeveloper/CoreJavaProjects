package com.java.core.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.java.core.string.exception.StringOperationException;
import com.java.core.string.util.StringUtils;

public class Test {
	
	
	
	
	/*private static void printWordcnt(String sentence) throws CustomException
	{
		
		String tempWord[]=sentence.split(" ");
		
		Arrays.sort(tempWord);
		    int backpointer=0;
		    int forwardpointer=2;
		    int pointer=1;
		    
		    boolean isNewWord=true;
		    int count=1;
			for(int i=1;i<tempWord.length-1;i++)
			{
				String a=tempWord[i];
				System.out.println(a);
				
					
				if(tempWord[pointer].equals(tempWord[backpointer]))
				{
					
					count++;
					backpointer=backpointer+1;
					i++;
					isNewWord=false;
					
				}
				if(tempWord[pointer].equals(tempWord[forwardpointer]))
				{
					
					count++;
					pointer=pointer+1;
					forwardpointer=forwardpointer+1;
				    i++;
				    isNewWord=false;
					
				}
				else
				{
					
					isNewWord=true;
					count=1;
					i++;
				}
				
				
				
				
			}
			
		
	}*/
	
	
	
	
	
	
	public static void main(String[] args) throws StringOperationException, IOException {
		
		//System.out.println("Enter The Sentence You Want To Check");
		//Scanner scanner=new Scanner(System.in);
		//BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		//String consolString=reader.readLine();
		//if(!consolString.isEmpty())
		//printWordcount(consolString.toString());
			//printWordSorted(consolString);
			//System.out.println(sortUniqWord(consolString));
		
		//System.out.println(StringUtils.sortString("aabbccaa"));
		System.out.println(StringUtils.reversString("ad bc cm az"));
		
	}

}
