package com.class05;

public class AndandOr {
	
	public static void main(String[] args) {
		
		/* If number is between 1 - 10 --> number is small
		 * If number is between 11 - 100 --> number is medium
		 * If number is between 101 - 1000 --> number is large*/
		
		int num = 15;
		
		//  True  AND False --> false
		if (num>=1 && num<=10) {
			System.out.println("number is small");
			
			//True  AND True --> True
		}
		else if(num>=11 && num<=100) {
			System.out.println("number is medium");
			
			//False  AND True  --> False
		}
		else if(num>=101 && num<=1000) {
			System.out.println("number is large");
			
		}
		else {
			System.out.println("Number is not in our range");
		}
	}

}
