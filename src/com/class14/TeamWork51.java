package com.class14;

public class TeamWork51 {
	
	public static void main(String[] args) {
		
		//Write a java program to reverse String? Reverse a string word by word?
		
		String word="Java is getting tough";
		
		System.out.println( " Before : " + word);
		
		System.out.println("********************");
		
		String []reverse = word.split(" ");
		for (int i=reverse.length-1; i>=0; i--) {
			
			System.out.print (reverse[i] + " ");
			
		}
		
		char [] word1 = word.toCharArray();
		
		for (int i=word1.length-1; i>=0; i--) {
			
			System.out.print(word1 [i] + " ");
			
		}
	}

}
