package com.class22;

public class Car {
	
	public static String make = "Toyota";
	String color; // declaring the instance variable, all instance variables will have a default value if they are not initialized (global variables)
	String model;
	int doors;
	boolean engin;
	Car (){ //constructor with no parameters
		
		System.out.println("I am a constructor");
		System.out.println("Hello from constructor");
	}
	//ACCESS MODIFIER           NON-ACCESS MODIFIER               RETURN TYPE   NAME OF METHOD    PARAMETER, ARRAY, ARGUMENTS
	         public                                           static                                              void           main                                (String[] args) {
		
	        	 //Car -  is our class name
	        	 //obj  - is a reference variable, object name
	        	 // =  - assigning operator
	        	 // new - new is a keyword which makes /creates and object.
	        	 //     Car() - Constructor
	        	 Car obj = new Car();
	        	 System.out.println(obj.color);
	        	 System.out.println(obj.doors);
	        	 System.out.println(obj.engin);
	        	 hello();	 
	}
	         public static void hello() {
	        	 //before using any local variable we have to initialize it.
	        	 String name;
	      //  	 System.out.println(name); //The local variable name may not have been initialized
	        	 System.out.println("I am a static hello method");
	         }
	         

}
