package com.class22;

public class ConstructorTypes {
	
//	ConstructorTypes (){//constructor without parameter
//		System.out.println("I am a constructor with no parameter");
//	}
	
	ConstructorTypes(String str){ //str is a local variable to the constructor
		System.out.println(" I am a consutrctor with papameters " + str);
	}
	
	ConstructorTypes (int a, String str){//constructor with multiple parameter
		System.out.println(" I am a consutrctor with with two parameters " + a + " and " + str);
	}
	public static void main(String[] args) {
		
		ConstructorTypes obj1 = new ConstructorTypes("String");
		ConstructorTypes obj2 = new ConstructorTypes("String");
		ConstructorTypes obj3 = new ConstructorTypes(123, "String");
	}
}
