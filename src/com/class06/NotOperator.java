package com.class06;

public class NotOperator {
	
	public static void main(String[] args) {
		
		/*
		 * Not operator
		 */
		boolean a = true;
		System.out.println("The value of boolean variable is " +a);
		
		boolean snow = true;
		
		//if is not snowing --> I will come to the class otherwise I will stay at home
		
		if(!snow) {
			System.out.println("I will come to the class");
		}
		
		int x = 10;
		int y = 20;
		
		if(!(x>y)) {
			System.out.println("Hello");
		}
	}

}
