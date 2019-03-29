package com.class11;

public class AdvancedArrayLoop {
	
	public static void main(String[] args) {
		
		//Retrieve values using : Advanced for loop, for each loop, enhanced for loop
		
												//0					1			2					3				4			5
String [] StudentsNames = {"Shaban", "Bilal", "Mehmat", " Zaki", " Samir", "Frank"};
System.out.println("------------------- For loop-------------------");
				for (int i=0; i <= StudentsNames . length-1; i++) {
					System.out.println(StudentsNames[i]);
				}
				
				
				//Retrieve values using : Advanced for loop, for each loop, enhanced for loop
				
				System.out.println("------------------- For loop-------------------");
				for (String student : StudentsNames) {
					System.out.println(student);
				}
	}

}
