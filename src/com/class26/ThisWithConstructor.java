package com.class26;

public class ThisWithConstructor {

	public ThisWithConstructor() {
		System.out.println("I am inside constructor with no parameter");
		System.out.println("I have no parameters");
	}

	ThisWithConstructor(String str) {
		System.out.println("I am inside consturctor with 1 parameters");
		System.out.println("I have 1 String parameter " + str);
	}

	ThisWithConstructor(String str1, String str2) {
		this(str1); // this must always be the first line / statement in the constructor  / special method
		System.out.println("I am inside consturctor with 2 parameters");
		System.out.println("I have 2 String parameter " + str1 + str2);
	}

	public static void main(String[] args) {

		ThisWithConstructor obj = new ThisWithConstructor();
		ThisWithConstructor obj1 = new ThisWithConstructor("Hello");
		ThisWithConstructor obj2 = new ThisWithConstructor("Hello ", "Bye");
// 1. I am inside constructor with no parameter
//2. I have no parameters
//3. I am inside constructor with one parameter
//4. I have one String parameter
//5. I am inside constructor with 2 parameter
//6. I have two String parameters
		
	}
}
