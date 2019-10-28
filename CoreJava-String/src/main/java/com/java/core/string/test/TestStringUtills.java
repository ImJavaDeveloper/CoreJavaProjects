package com.java.core.string.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.java.core.string.exception.StringOperationException;
import com.java.core.string.util.StringUtils;

public class TestStringUtills {
	
	public static  void main(String[] args) throws IOException, StringOperationException {
		
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int caseVal = 0;
		while(true)
		{
			System.out.println("");
			System.out.println("Press 1 To Sort The Sentence ");
			System.out.println("Press 2 To Sort The Word ");
			System.out.println("Press 3 To Remove The duplicate Word ");
			System.out.println("Press 4 To Remove The duplicate Char ");
			System.out.println("Press 5 To Short The Sentence With Unique ");
			System.out.println("Press 6 To Print Word Count ");
			System.out.println("Press 0 To Exit the Programme ");
			String inputFromConsole=input.readLine();
			
			if(StringUtils.isInteger(inputFromConsole))
			     caseVal = Integer.parseInt(inputFromConsole);
			
			switch(caseVal) {
			case 1:
				System.out.println("Enter Sentence To Sort");
				try {
				System.out.println(StringUtils.sortStrings(input.readLine()));
				}
				catch(StringOperationException ex)
				{
					System.out.println(ex.getMessage());
					
				}
				break;
			case 2:
				System.out.println("Enter Word To Sort");
				System.out.println(StringUtils.sortString(input.readLine()));
				break;
				
			case 3:
				System.out.println("To Remove The duplicate Word");
				System.out.println(StringUtils.removeDuplicateWordFromStrings(input.readLine()));
				break;
				
			case 4:
				System.out.println("To Remove The duplicate Char");
				System.out.println(StringUtils.removeDulicateCharFromString(input.readLine()));
				break;
				
			case 5:
				System.out.println("To Short The Sentence With Unique");
				System.out.println(StringUtils.sortUniqStrings(input.readLine()));
				break;
				
			case 6:
				System.out.println("Print Word Count");
				StringUtils.printWordcount(input.readLine());
				break;
			
			case 0:
			    System.exit(0);;
			default:
				System.out.println("Invalid Option");	
				break;
			}
			
		}
		
	}

}
