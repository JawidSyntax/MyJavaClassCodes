package com.class26;

public class Shape {

	/*
	 * Write program: Shape class has a constructor that takes the radius and extend
	 * circle class print area of circle while creating and object of a child class
	 */

	int a;

	int b;

	Shape() {

		this.a = 0;
		this.b = 5;
	}
	public static void main(String[] args) {
		child ch = new child();
		ch.calculate();
	}
	}
	class child extends Shape {
		void calculate() {
			this.a = b * b;
			System.out.println("The are of the circle is " + a);
		}
	}