package com.class29;

public class Circle implements Shape {

	@Override
	public void calculateArea(int y) {
		System.out.println("the area of this circle is " + 3.14*y*y);
		
	}

	@Override
	public void calcuatePerimiter(int x) {
		System.out.println(2*3.14*x);
		
	}
}

class Square implements Shape{

	@Override
	public void calculateArea(int y) {
		System.out.println(y*y);
		
	}

	@Override
	public void calcuatePerimiter(int x) {
		System.out.println(4*5);
		
	}
	
}

