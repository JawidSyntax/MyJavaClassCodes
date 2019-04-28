package com.class25;

public class SyntaxStudents extends Student{
	
	public void study() {
		System.out.println("Syntax Students must study hard");
	}
	protected void doHomeWork() {
		System.out.println("Syntax Students must do repel homeworks");
	}
	void attendClasses() {
		System.out.println("Syntax Students must attend classes");
	}
	//creating child specific  private do research
	private void doResearch() {
		System.out.println("Syntax Students must do research");
	}
}
