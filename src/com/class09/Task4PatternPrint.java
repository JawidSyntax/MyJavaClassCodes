package com.class09;

public class Task4PatternPrint {
	
	public static void main(String[] args) {
		
		/*Print the following pattern:
			*
			**
			***
			****
			*****
			****
			***
			**
			*
			*
			*/
		
		for (int r = 0; r<13; r++) {
			for (int c = 1; c<=r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int m = 11;  m>=1; m--) {
			for(int n = m; n>=1; n--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
