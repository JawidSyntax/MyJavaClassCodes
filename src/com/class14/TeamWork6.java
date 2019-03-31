package com.class14;

import java.util.Scanner;

public class TeamWork6 {
	public static void main(String[] args) {
		
		//Write a Java Program to find whether a String is palindrome or not?
		
		String word = "";
		String reverse = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value");
		word = scan.nextLine();
		
		char [] array = word.toCharArray();
		for (int i=array.length-1; i>=0; i--) {
			reverse=reverse+array[i];
		
		if (!word.equals (reverse)) {
			
			
		}else{
		System.out.println (reverse + " is not a palindrome number");
		}
		}	
		System.out.println(reverse + " is a Palindrome number");
	}
}
	