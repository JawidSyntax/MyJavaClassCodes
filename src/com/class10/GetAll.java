package com.class10;

public class GetAll {
	
	public static void main(String[] args) {
		
		String [] names = {"John", "Mike", "Jane", "Talgat", "Olga", " Mehmet", "Siyar"};
		int a = 3;
		
		System.out.println(names [a]); //Talgat
		a+= 2;
		
		System.out.println(names [a]); // Mehmet
		a-=4;
		
		System.out.println(names [a]);
		
		int size = names.length;
		System.out.println(size);
		
		// If want to print all the names at once, we use the loop option
		
		for (int i =0; i<size; i++) {
			System.out.println(names [i]);
		}
		
		
		}
	}
