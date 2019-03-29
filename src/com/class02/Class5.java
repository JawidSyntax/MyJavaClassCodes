package com.class02;

public class Class5 {
	public static void main(String[] args) {
		
		//String Concatenation
		
		int x = 10;
		int y = 20;
		
		String a = "Hello";
		String b = "Bye";
		
//		System.out.println(x+y+a+b);    //30HelloBye
//		System.out.println(x+a+y+b);	//10Hello20Bye
//		System.out.println(x+y+b+y);	//10HelloBye20
//		System.out.println(a+b+x+y);	//HelloBye30; HelloBye1020; Won't work
//		System.out.println(a+b+(x+y));	//HelloBye30
		
		// Integers vs float
		
		int a1 = 10;
		int b1 = 3;
		
		int div = a1/b1;
		
		
		System.out.println(a1/b1);

		
		//moudles
		int mod = a1%b1;
		
		System.out.println(mod);
		
		//parentheses, Exponents, Multiplication/Division, Addition / Subtraction
		
		int e = -5 + 4*6;
		System.out.println(e);//19
		
		int x1 = (22+9) % 7;
		System.out.println(x1);//3
		
		int y1 = 20 + -3*5 / 8;
		System.out.println(y1);//19
		
		int z = 5 + 15 / 3 * 2 - 8 % 3; //(5+10-2)
		
		System.out.println(z);
		
		
		
		
		
	}

}
