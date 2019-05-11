package com.class35;

public class FinallyBlock {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		try {
			System.out.println("Try Block Code");
			System.out.println(a /b );
		}catch (ArithmeticException e) {
			System.out.println("Catch Block code");
		}finally {
			System.out.println("Finally block code");
		}
		
		try {
			System.out.println(a /b);
		}finally {
			System.out.println("Finally block code");
		}
		System.out.println("Continues code.....");
	}

}
