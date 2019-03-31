package com.class14;

public class Task1 {
	
	public static void main(String[] args) {
		
		//Create a String that will hold a sentence. 
		//Write a program to get a new String without any spaces.
		
		String Exam = "This is a good class";
		
		
		System.out.println(Exam);
		
		System.out.println("***********************");
		
		String newStr = Exam.replace(" ", "");
		System.out.println(newStr);
	}

}
