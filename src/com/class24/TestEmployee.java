package com.class24;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		FullTimeEmployee ft = new FullTimeEmployee();
		Contractor contractor = new Contractor();
		
		emp.getPaid(); //Employee gets paid salary from Parent class
		ft.getPaid();//Full time Employee gets paid salary + bonus
		contractor.getPaid();//Contractor gets paid hourly
		
	}

}
