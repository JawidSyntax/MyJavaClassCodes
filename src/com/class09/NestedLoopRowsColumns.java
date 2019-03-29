package com.class09;

public class NestedLoopRowsColumns {

	public static void main(String[] args) {
		
		  /*I want to print pattern
         * 1111111 --> rows=7, columns=7
         * 2222222
         * 3333333
         * 4444444
         * 5555555
         * 6666666
         * 7777777
         */
		
		for (int i=1; i<=7; i++) {
			
			for (int y=0; y<=7;  y++) {
				
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
