package com.class09;

public class NestedLoop2 {
	
	public static void main(String[] args) {
		
//		for (int i=0; i<=5; i++) {
//			System.out.print(i);
//		}
		
		/*I want to print pattern
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 */
		
		for (int i=1; i<6;  i++) { // the outer loop controls the rows
			for (int y=1; y<6; y++) {// the inner loop controls the columns
				
				System.out.print(y);
			}
			System.out.println();
		}
	}

}
