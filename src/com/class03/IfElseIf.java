package com.class03;

public class IfElseIf {
	public static void main(String[] args) {
		
		//if else if coding
		
		int x = 40;
		int y = 40;
		
		if(x>y){
			System.out.println("X is larger than Y");
			
		}else {
			
			System.out.println("Y is larger than X");
			
		}
		
		//need corr
		int numberOfstudents = 6;
		
		if(numberOfstudents==5) {
			System.out.println("Do not start the class");
			
		} else if(numberOfstudents == 6) {
			System.out.println("Send them to the playground");
			
		} else if(numberOfstudents == 7) {
			System.out.println("Have them lunch outside");
		}else if(numberOfstudents == 10) {
			System.out.println("Take the class and have them do the classwork");
			
		}else {
			System.out.println("Have make a phone call to each student");
		}
	}
	
	
	
}