package com.class13;

public class Task2NoEmptyString {
	
	public static void main(String[] args) {
		
		//Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more
		//characters, print the character in the middle of the String
		
		
		String str = "Sunday Class Java";
		
		int a = str.length();
		
		boolean result = str.isEmpty();
		
		if (!result) {
			
			if (a>3 & a % 2==1) {
				
			}
			System.out.println(str.substring (1,    5));
		}
		
	}

}
