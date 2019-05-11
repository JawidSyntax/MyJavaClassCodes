package com.class29;

public class StudentA extends Marks {

//	StudentA(){
////		super.math = math;
////		super.biology = biology;
////		super.arts = arts;
//	}

	@Override
	public void  getPercentage() {
		int percent = (78 + 96 + 80) / 3;
		System.out.println("The percentage of Studen A from three subjects is " + percent);
	}
}
class StudentB extends Marks{
//	StudentB(){
//		super.math = math;
//		super.biology = biology;
//		super.arts = arts;
//		super.Science = Science;
//	}

	@Override
	public void getPercentage(){
		int percent = (78 + 68 + 90 + 77) / 4;
		System.out.println("The percentage of Student B out of four subjects are " + percent);
		
	}
	
}