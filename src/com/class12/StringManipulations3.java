package com.class12;

public class StringManipulations3 {
	
	public static void main(String[] args) {
		
		// charAt() returns a characters of specified character
		System.out.println("------------ CharAt()------------------");
		String str = "Students";
		
        char character = str.charAt(7);
		System.out.println(character);
		
		//Looping through all the characters in the String
		
	//	for (int i = 0; i<str.length(); i++) {
		//System.out.print(str.charAt(i) + "  , ");
		
		//
		
		System.out.println(" ----------- indexOf()------------------");
		String str1 = "Sunday";
		int index = str1.indexOf("n");
		System.out.println(index);
		
		String str2 = "Syntax Technologies";
		System.out.println(str2.indexOf("Syntax"));
		System.out.println(str2.indexOf("Technologies"));
		System.out.println(str2.indexOf (" ")); //6
		System.out.println(str2.indexOf ("w")); //-1 since this is not part of the index
		
		
		//substring() --> gives another string from your current String.
		
		System.out.println("----------------- substring    ----------------------");
		String str3 = "Today is Sunday Java class";
		String newstring = str3.substring(8);
		System.out.println(newstring);//Sunday Java class
		
		System.out.println(str3.substring(0, 5));//today
		System.out.println(str3.substring(9, 20));//Sunday Java
		System.out.println(str3.substring(16, 20));//Java
		System.out.println(str3.substring(21));//class
		
		
		
		
		
		
	}

}
