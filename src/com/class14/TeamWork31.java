package com.class14;

public class TeamWork31 {
	
	public static void main(String[] args) {
		
		//Find out how many alpha characters present in a string?
		
String sent = "I like to study Java";
		
		String newSrt = sent.replaceAll ("[^A-Za-z]", "");
		System.out.println(newSrt.length());
		
		
		String str=" I Like to study Java";
        String replaced =str.replaceAll("[^A-Za-z]", "");
        
        System.out.println(replaced.length());
	}

}
