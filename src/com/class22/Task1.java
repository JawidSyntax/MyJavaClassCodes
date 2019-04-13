package com.class22;

public class Task1 {
	
	/*Write a program that will have a constructor: one with parameters and
	 *  second without any parameters. Create a separate Test class
	 *where you will execute both of the constructors.
	 */

	Task1(){
		System.out.println("this is a constructor with no parameters");
	}
	Task1(String str){
		 str = "book";
		System.out.println("this is a constructor with parameters " + str);
	}
	
	public static void main(String[] args) {
		
	
	}
}
