package com.class23;

public class AreaCalculation {
	
	/* Create 1 class in which create a methods that will calcualte the area of
	 * Rectangle to find the area width * length (5*4)
	 * Square to find the area it is width * width (4)
	 * Box to find the area of box width * length * height (3*4*5)
	 * use separate class to test your code */
	
	public void area(int a, int b) {
		int rectangle = (a * b);
		System.out.println("The area of a rectangle is " + rectangle + " cm");
	}
	public void area (int a) {
		int square = (a * a);
		System.out.println("The area of a square is " +square + " cm");
	}
	public void area (int a, int b, int c) {
		int box = (a * b * c);
		System.out.println(" The area of a box is " +box + " cm");
		
	}

}
