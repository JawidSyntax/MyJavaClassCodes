package com.class11;

public class Recap {
	
	//lets create an array of names that will hold five elements and retrieve all values from it.
	
	public static void main(String[] args) {
		
		
		String [] names = new String [7];
		
		names[0] = "Asel";
		names[1] = "Awet";
		names[2] = "Arif";
		names[3] = "Weqas";
		names[4] = "Dzmitri";
	    names[5] = "Shiva"; //will get an runtime exception when trying to access it.
		names[6] = "Sandesh";
		for (int i = 0;  i<names.length; i++ ) {
		System.out.println(names [i]);
		
		}	
		
		System.out.println("----------------------------------------------------------------------");
		//create an array using array literal
														//0					1			2					3				4			5
		String [] StudentsNames = {"Shaban", "Bilal", "Mehmat", " Zaki", " Samir", "Frank"};
		
		for (int i=0; i<=StudentsNames.length-1; i++) {
			System.out.println(StudentsNames[i]);
		}
		System.out.println("===================================================");
		//Retrieve values using : Advanced for loop, for each loop, enhanced for loop
		
		for (String student : StudentsNames) {
			System.out.println(student);
		}
		
		
	}
}
