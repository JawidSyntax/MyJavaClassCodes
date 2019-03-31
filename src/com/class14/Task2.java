package com.class14;

public class Task2 {
	
	public static void main(String[] args) {
		
		//Create a String that should be combination of letters,
		//numbers and special characters.
		//Find out how many alpha characters are there in the String.
		
		String sent = "I love to read 24 hours and 43343 minutes @ %10";
		
		String newSrt = sent.replaceAll ("^[a-z]", " ");
		//System.out.println(newSrt);
		System.out.println(sent.length());
		
	}

}
