package com.class26;

import sun.applet.Main;

/* Write a program in class A has final dispaly method and try to overload and override this method and observe result */
public class classA {
	
	public final void show () {
		System.out.println("This is a check for final keyword");
	}
	public void show (String str) {
		System.out.println("This is is a check for overloading");
	}
	
	public class example extends classA{
		public final void show (String str) { // Can not override the final method
			System.out.println("This is a check if overriding works");
	}
	}
 public static void main(String[] args) {
	
	 classA obj = new classA();
	 obj.show();
	 obj.show("Syntax");
	 
	 classA obj1 = new classA();
	 obj1.show("Syntax");
	 
}
}

