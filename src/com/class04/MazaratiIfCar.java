package com.class04;

import java.util.Scanner;

public class MazaratiIfCar {

	public static void main(String[] args) {
	/* I want to buy only Mazarati
	 * I Red exterior color
	 * I want leather interior
	 * I want 2 door
	 * otherwise I am not interested
	 */
		
		boolean car = true;
		boolean color = false;
		boolean seats =  true;
	
		if(car) {
			System.out.println("Lets check the color");	
			if(color) {
				System.out.println("Let's check the interior");
						if(seats) {
							System.out.println("I will buy the car");
						}
						else {
							System.out.println("I am not interested");
						}
			}
		}
}
}