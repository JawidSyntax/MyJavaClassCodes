package com.class05;

public class LogicalOr {
	
	public static void main(String[] args) {
		
		/* We have 7 days in a week
		 * If days are from 1 - 5 --> weekday
		 * If days are from 6 - 7 --> weekend
		 * Otherwise "Not a valid day"
		 */
		
		int day = 7;
		if(day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("It is a weekday");
		}
		else if(day==6 || day==7) {
			System.out.println("It is a weekend");
		}
	}

}
