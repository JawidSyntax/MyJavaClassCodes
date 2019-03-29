package com.class12;

public class StringManipulations {
	
	public static void main(String[] args) {
		
		String str = "Syntax";
		
		int lengthOfString=str.length();
		System.out.println(lengthOfString);
		
		String str1 = "Syntax Technologies";
		
		int name = str1.length();
		System.out.println(name);
		
		
		String str2 = "Welcome, Students, Have a great day";
		
		int count = str2.length();
		System.out.println(count);
		
		//toUpperCase() --->>> to convert all characters to Upper case.
		//toLowerCase() --->>> to convert all characters to Lower case.
		String str3 = "Hello";
		String newString=str3.toUpperCase();
		System.out.println(newString);
		
		String Lowercase = newString.toLowerCase();
		System.out.println(Lowercase);
		
		//equals() --->>>> compares 2 strings, if strings are equal -->> true, else -->> false.
		
		String str4 = "Hello";
		String str5 = "hello";
		boolean same = str4.equals(str5);
		System.out.println(same);
		
		//equalsIgnoreCase () --->>> compare two Strings but ignore the case.
		
		String expectedBrowser = "Chrome";
		String actualBrowser = "chrome";
		boolean equals = expectedBrowser.equalsIgnoreCase (actualBrowser);
		System.out.println(equals);
		
	}

}
