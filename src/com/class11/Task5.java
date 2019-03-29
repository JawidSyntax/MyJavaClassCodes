package com.class11;

public class Task5 {
	
	public static void main(String[] args) {
		
		/*Create a 2D array that first row will contain 4 names and second 
		 * row will contain grades. Then you program should print name of 
		 * the students that has as an A and B grade   */
		
		String [] [] names = {
				
				{"Ahmad", "Nasim", "John", "Noor", "Qasim"},
				{"A", "B", "C", "D"},
				
		};
		
		//System.out.println(names [0] [1] + " grade is  " +names [1] [0]);
	//	System.out.println(names [0] [2] + " grade is  " +names [1] [1]);
	//	System.out.println(names [0] [3] + " grade is  " +names [1] [2]);
	//	System.out.println(names [0] [4] + " grade is  " +names [1] [3]);
		
		
		int [] [] digit = {
				
				{2, 3, 80, 5, 6, 7, 8, 9, 10},
				{5, 6, 8, 9},
				
		};
		
		System.out.println(digit [0] [0] + digit [1] [0]);
		System.out.println(digit [0] [1]  *  digit [1] [1]);
		System.out.println(digit [0] [2]  / digit [1] [2]);
		
		
	}

}
