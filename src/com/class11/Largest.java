package com.class11;

public class Largest {
	
	public static void main(String[] args) {
		
		//create an array of integers and find the largest number
		
		int [] numbers = {2, 4, 5, 6, 7, 1, 9};
	     int largest = numbers[0]; //Assume that the largest number is a number. initialize the max number
	
		for (int i = 0; i<numbers . length; i++) {
			
			if (largest <numbers[i]) {
				
				
				largest = numbers[i];
			}
		}
			System.out.println("The largest number in the group is " +largest);
		
		}
	}


