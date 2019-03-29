package com.class10;

public class ArrayIntro {
	
	public static void main(String[] args) {
		
		int num;
		num = 10;  //int num = 10;
		
		int [] array1; //declare an array --> preferred way
		int [] array2; //declare an array 
		int  array3 []; //declare an array 
		
		//Array is the collection of the same data type
		
		array1 = new int [4]; // creating or initializing
		
		//assigning value to array
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;
		
		//access values
		
		System.out.println(array1[0]);
		
		//how to index the elements
		int [] number = new int[4];
		
		number [0] = 5;
		number [1] = 10;
		number [2] = 15;
		//number[3] = 20; no error during compilation but error during run time
	
		System.out.println(number[3]); //ArrayIndex out of bounds exception
		
	String [] a = new String[3];
	
	a [0] = "Hello";
	a [1] = "Hi";
	a [2] = "Bye";
	
	System.out.println(a[1]+ " friends");
	
	}

}
