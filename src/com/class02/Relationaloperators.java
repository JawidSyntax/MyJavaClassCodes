package com.class02;

public class Relationaloperators {
	public static void main(String[] args) {

		// using Relationaloperators using boolean

		int a = 19; 
		int b = 5;

		boolean result = a > b;

		boolean result1 = a == b;

		System.out.println(result);
		System.out.println(result1);

		// compare 2 numbers and if a is larger than b --> print
		
		 if (a!=b ) {
			 System.out.println("Hello");
		 }else {
			 System.out.println("Bye");
		 }
		 
		 //declare price and if price is higher than expected price--> I will not bye the shoes
		 
		 double shoePrice= 32.99;
		 double allowedPrice = 31.99;
		 
		 if(shoePrice<=allowedPrice) {
			 System.out.println("I am buying the shoes");
		 }else {
				 System.out.println("I am not buying the shoes");
				 
				 
			 }
		 }
				 
	}
