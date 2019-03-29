package com.class08;

public class Forloop2 {
	public static void main(String[] args) {
		
		/*what is the outcome*/
		
		for (int a=0;  a<=20; a+=2) {
			System.out.println(a);
		}
		
		
		//when the condition is not correct or false in for loop then we will not have further execution
		//it does not go in the loop, for example if b>=50 in below example will not be executed.
		//because assigned value in initialized stage is not true.
		for (int b=1  ;  b<=50;  b+=5) {
			System.out.println(b);
		}
		
		
	}

}
