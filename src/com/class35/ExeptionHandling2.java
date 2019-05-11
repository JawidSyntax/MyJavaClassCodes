package com.class35;

public class ExeptionHandling2 {
	
	public static void main(String[] args) {
		
		System.out.println("Begining of code");
		
		int a = 10;
		int b = 0;
		
		try {
			System.out.println( a / b);
		}catch(ArithmeticException e) {
			System.out.println("Code inside catch block");
		}
		System.out.println("The end of the program");
	}

}
