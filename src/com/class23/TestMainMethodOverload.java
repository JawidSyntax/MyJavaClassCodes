package com.class23;

public class TestMainMethodOverload {
	
	public static void main(String[] args) {
		
		String [] a  = { "Hello", "Bye"};
		MainMethodOverload.main(a );
		
		MainMethodOverload.main(10);
		String a1 = "Hello World";
		MainMethodOverload.main(a1);
	}

}
