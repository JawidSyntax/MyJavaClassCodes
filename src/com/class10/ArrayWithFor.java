package com.class10;

public class ArrayWithFor {
	
	public static void main(String[] args) {
		
	//									0	 1   2   3	4	 5
		char [] grades = {'A','B','C','D','E','F'}; // size is 6
		
		for (int i = 0; i<=grades.length - 1; i++) {// size minus the number of elements or
																			//index gives the correct answer
		
		System.out.print(grades [i]);
		}
	}

}
