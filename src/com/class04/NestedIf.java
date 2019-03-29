package com.class04;

public class NestedIf {
		
		/*write a program to check work eligibility
		 * if user is younger than <16--> not allowed to work
		 * otherwise --> allow to work. I user is younger than 64--> go to work
		 * 										otherwise--> enjoy your life
		 * 
		 */
		
		public static void main(String[] args) {
			
			int age = 12;
			
			int eligibleAge = 16;
			
			int retirementAge = 64;
			
			
			if(age<eligibleAge) {
				System.out.println("You are too young, no work fo your");
	
		}else {
			System.out.println("You are eligile to work");
		}
	}
	
	
	

}
