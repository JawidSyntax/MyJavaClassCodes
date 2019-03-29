package com.class11;

public class Task1 {
	
	public static void main(String[] args) {
		
		//Create an array of cars and store 6 elements into it. Using 2 different 
		//loops print all values from the array.
		String [] cars = {"Toyota", "BMW", "Benz", "Honda", "Lada", " RAM", "AUDI"};
		
		for (String car : cars ) {
		System.out.print( car+ "   ");
		
		
	}
		
		//Create an array of countries. While retrieving all values from an array print capital for each country. 
		//(use 2 different loops).
		
		String [] country = {"USA", "AFG", "TURKEY", "JAPAN"};
	
		for( int i = 0; i<country . length-1; i++) {
			
			if (country[i].equals("USA")) {
				System.out.println("Washington");
			}	if (country[i].equals("AFG")) {
				System.out.println("Kabul");
			}if (country[i].equals("TURKEY")) {
				System.out.println("Ankara");
			}else {
				System.out.println("Tokyo");
			}
		}
		
		
	}
	}

