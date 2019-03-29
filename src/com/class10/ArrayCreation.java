package com.class10;

public class ArrayCreation {
	
	public static void main(String[] args) {
							 // 0  ,  1,    2,  3
		int [] array = {10, 20, 30, 40 };
		
		System.out.println(array [2]);
		
		// How to find the size of the array? please refer below
		// We use the length to determine the size of our array
		
		System.out.println(array.length); // it is 4 because as humans we count normally. 
		
		// Lets create String of names = 5
		
		String [] name = {"John", "Mile", "Jane", "Talgat", "Olga"};
		System.out.println("There are " +name. length+ " values in my array of names");
		System.out.println(name [2]);
		
		
	}

}
