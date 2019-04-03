package com.class15;

public class IQ8 {
	
	public static void main(String[] args) {
		
	
	
	//Write a Java Program to print first 10 numbers of Fibonacci series.
	
	int a = 0,   b = 1, c = 0;
	
	for (int i = 0; i<10; i++) {
		c = a+b;
		a = b;
		b = c;
		
		System.out.println(a+ " ");
	}
}
}
