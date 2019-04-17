package com.class24;

public class StaticExam {
	
	String a, b, m;
	int a1, b1, x, y;
	
	
	/*  Create 1 class with a static method that has 3 overloaded forms.
	 *  Then call each overloaded method with specific arguments and observe result.
	 */

	 static void example(String a, String b) {
		System.out.println(a + b);
		
	}
	protected static void example (int a1, int b1) {
		System.out.println(a1 + b1);
		
	}
	public static void example (String m, int x,  int y) {
		System.out.println(m + x + y);
		
	}
}
