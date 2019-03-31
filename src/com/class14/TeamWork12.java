package com.class14;

public class TeamWork12 {
	
	public static void main(String[] args) {
		
		
		String x="Hello";
	       String y="Bye";

	       System.out.println("Before swap: " + x + " " + y);

	       x = x + y;  // Hello+Bye=HelloBye
	       y = x.substring(0, x.length() - y.length());  // HelloBye-Bye=Hello
	       x = x.substring(y.length());  // HelloBye(Hello) = Bye 
	       System.out.println("After X is : " + x );
	    		   System.out.println("After Y is: "+ y);
	}

}
