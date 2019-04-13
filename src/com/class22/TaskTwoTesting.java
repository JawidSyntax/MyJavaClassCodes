package com.class22;

public class TaskTwoTesting {
	
	public static void main(String[] args) {
		
		TaskTwo obj = new TaskTwo("Ahmad");
		System.out.println(obj.fndAverage(90, 80, 75));
		
		TaskTwo obj1 = new TaskTwo("Bilal");
		System.out.println(obj.fndAverage(90, 95, 60));
		
		TaskTwo obj2 = new TaskTwo("Asha");
		System.out.println(obj.fndAverage(95, 80, 40));
		
		TaskTwo obj3 = new TaskTwo("Baba");
		System.out.println(obj.fndAverage(100, 85, 88));
	}

}
