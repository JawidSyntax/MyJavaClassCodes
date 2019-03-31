package com.class14;

public class TeamWork8 {
	
	public static void main(String[] args) {
		
		//Write a Java Program to print first 10 numbers of Fibonacci series.
		
		int num = 10, f1 = 0, f2 = 1, sum;
		
		for (int i = 1; i<num; ++i) {	
			sum = f1 + f2;
			f1 = f2;
			f2 = sum;
			
			System.out.println(sum);
		}
		
		
		
		
		
	}

}
