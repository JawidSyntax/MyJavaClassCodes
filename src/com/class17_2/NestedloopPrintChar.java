package com.class17_2;

public class NestedloopPrintChar {
	
	public static void main(String[] args) {
		
		/* I want to print pattern
		 * ***** 4 rows & 5 columns
		 * *****
		 * *****
		 * *****
		 */
		
		for (int a=0; a<4; a++) {
			
			for (int b=0; b<5; b++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}
