package com.class25;

public class Casting {
	
	public static void main(String[] args) {
		
		//implicit  or automatic casting done by the compiler / widening -- compiler takes care of conversation
		
		double a = 10;
		System.out.println(a); // 10.0 variable double but value integer but compiler changed the integer to double.
		
		//Explicit / Manual / Narrowing  casting --> Programmer takes care of the conversion
		double b = 10.0;
		int c = (int)b;
		System.out.println(c);
		int i = 130;
		//byte by = 130; --> compiler wont allow to do this due to size of the variable value
		byte by = (byte)i;
		System.out.println(by);
		
		//upcasting  --> compiler  takes care of conversion Casting example between Super class and sub class
		Payment pay = new MasterCard();
		
		//MasterCard mc = new Payment(); The compiler wont allow you to through super class in side the sub class
		
		//DownCasting, explicit way of casting super class in a sub class
		MasterCard mc = (MasterCard) new Payment();
		
		
		
	}

}
