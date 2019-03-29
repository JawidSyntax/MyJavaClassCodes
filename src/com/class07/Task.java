package com.class07;

public class Task {
	/* Create a boolean variable workDay and assign true
	 * create int variable day and assign it to 1
	 * as long as it is workDay Print --> "I need a day off" and increment day
	 * day once day is 6 --> your condition for your loop  should become false
	 */
	public static void main(String[] args) {
		
		boolean workDay = true;
		int day = 1;
		
		while(workDay) {
			System.out.println("I need  day " +day+ " off ");
			
			if(day>5) {
				System.out.println("I dont need a day off");
				workDay = false;
				
			}
			day++;

		}	
		}
	}
	

