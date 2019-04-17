package com.class24;

public class PrivateExam {
	
	/*   Create 1 class with a private method that has 3 overloaded forms. 
	 * Then call each overloaded method with specific arguments and observe result.
	 */

	private void testone(String a) {
		System.out.println(a);
	}
private void testone (String a, String b) {
	System.out.println(a + b);
		
	}
private void testone (int x, int y) {
	
	System.out.println(x + y);
	
}

public static void main(String[] args) {
	
	PrivateExam obj = new PrivateExam();
	obj.testone("Good");
	obj.testone(10, 15);
	obj.testone("Hello", "Class");
	
}

}
