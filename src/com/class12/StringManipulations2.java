package com.class12;

public class StringManipulations2 {
	
	public static void main(String[] args) {
		
		//Check a specific character or word in all String class
		
		String str = "Good morning , students!";
		boolean contains = str.contains ("students");
		System.out.println(contains);
		
		
		String present = "Welcome, Asel";
		String neededValue = "WELCOME, ";
		boolean flag = present . contains (neededValue);
		System.out.println(flag);
		
		boolean flag1 = present.toLowerCase().contains (neededValue);
		System.out.println(flag1);
		
		boolean flag2= present.toUpperCase().contains (neededValue);
		System.out.println(flag2);
		
		//startWith(), endWith(), --> will return ture if String starts / end with
		//else --> false
		System.out.println( "****StartWith   &    EndWith********");
		String str1 = "Syntax";
		
		boolean starts = str1.startsWith("S");
		System.out.println(starts);
		
		System.out.println(str1.endsWith ("x"));
		
		System.out.println( "&&&&&&&& isEmpty()&&&&&&&&&&&");
		String str2 = " Hello";
		
		boolean isEmpty = str2.isEmpty();
		System.out.println(isEmpty);
		
		//Concatenating two Strings;
		
		System.out.println("--------------Concatenating Strings--------------");
		String str3 = "Hello     ";
		String str4 = "Ali";
		System.out.println(str3 + str4);
		
		//second way to concatenating
		System.out.println("---------2 way to concat()------------------");
		System.out.println(str3.concat(str4));
		
		// trim() -->>> will remove spaces at the beginning and at the end of the your String (only Spaces)
		System.out.println("_______________trim()________________");
		String expected = "You may qualify for a multi-policy discount!";
		String actual = "   You may qualify for a multi-policy discount!    ";
		
		actual = actual.trim();
		System.out.println(expected.equals(actual));
		
	}

}
