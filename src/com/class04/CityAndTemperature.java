package com.class04;

import java.util.Scanner;

public class CityAndTemperature {

		/*
		 * Ask user to enter city and temperature in Faranhite 
		 * your program should convert F-->C
		 * Your program should say "The Temperature in the city _______ is _____
		 * 
		 * */
		public static void main(String[] args) {
			
			String cityName;
			int temp;
			
			Scanner myScanner = new Scanner (System.in);
			System.out.println("Please enter your city");
			
			cityName =myScanner.nextLine();
			
			System.out.println("Please enter temperature in Faranhite");
			
			temp = myScanner.nextInt();
			
			//Formula (F - 32) x5/9;
			
			int convertedtemp = (temp - 32)* 5/9;
			
			System.out.println("the tempreture in the city " +cityName+ " is " +convertedtemp+ "C");
			
			
		}

}
