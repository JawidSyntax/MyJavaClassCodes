package com.class08;

import java.util.Scanner;

public class RangeOfNumbersTask {
	public static void main(String[] args) {
		
		/*Let user define a range of numbers to print
		 * */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Pleae enter a starting number ");
		int startNumber = input.nextInt();
		
		System.out.println("Pleae enter a starting number ");
		int endNumber = input.nextInt();
		
			if (startNumber>endNumber) {
				System.out.println("The range is invalid");
			}
				for (int i=startNumber; i<=endNumber; i++) {
					System.out.println(i);
				}
				
	}

}
