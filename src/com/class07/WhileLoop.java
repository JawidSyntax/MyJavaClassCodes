package com.class07;

public class WhileLoop {
	public static void main(String[] args) {
		
		int  a= 1;
		
		while (a<10) {
			System.out.println("Good Morning");
			a++;
		}
		
		int b = 0;
		while (b<5) {
			System.out.println("I am inside the loop"+b);
			b++;
		}
		System.out.println("I am outside of while loop");
		
		//If I want to print values from 10 to 20 inclusive;
		
		int z = 10;
		while (z<=20) {
			System.out.println(z);
			z++;
		}
		
		//I want to print values from 1 to 20 inclusive but all in 1 line with space;
		
		int q = 1;
		while (q<=20) {
			System.out.print(q+ " ");
			q++;
		}
		
		// I want to print values from 10 to 1; decrementing
		
		int e = 10;
		while (e>=1) {
			System.out.println(e);
			e--;
		}
	}

}
