package com.class14;

public class StringManipulations {
	
	public static void main(String[] args) {
		
		//1 Replace ()   Function --> will replace old value or char to new char or value.
		
		String str = "I am good Tester # 1 !";
		String newStr = str.replace ("a" , "e");
		
		System.out.println(newStr);
	
		String newStr1 = str.replace ("good" , "great");
		System.out.println(newStr1);
		//what we are looking for to     replace      new value
		String newStr2 = str.replace ("Tester" , "Programmer");
		System.out.println(newStr2);
		
		str = str.replace( "!", "?");
		System.out.println(str);
		
		str = str.replace( "1", "2");
		System.out.println(str);
		
		//2 Replace all number, specify group of all number or chars, case sensitive.
		String str1 = "12Hello 3232 World 465%^%";
		
		String replacedNoNumbers = str1.replaceAll("[0-9]", "");
		System.out.println(replacedNoNumbers);
		
		// to remove everything but some except use ^
		String newString = replacedNoNumbers.replaceAll("[^A-Za-z]", "");
	System.out.println(newString);
		String replacedNoCharacter =  replacedNoNumbers.replaceAll ("[ A-za-z]", " ");
		System.out.println(replacedNoCharacter);
		
		
		String str2 = "1Hello123";
		System.out.println(str2.replaceAll ("^[0-9]", ""));
		
		
		
		
	}

}
