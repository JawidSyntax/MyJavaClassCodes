package com.class23;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		System.out.println("I am a consturctor with no parameters");
	}
	ConstructorOverloading(String str){
		System.out.println("I am a constructor with one String parameter");
	}
	ConstructorOverloading(String str, String str2){
		System.out.println(" I am a constructor with 2 String parameters");
	}
	ConstructorOverloading(int a){
		System.out.println(" I am a constructor with one integer parameter");
	}

}
