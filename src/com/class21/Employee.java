package com.class21;

public class Employee {
	
	public static String CEO = "Sumair";
	
	int eID = 123;
	int salary = 5000;
	
	public static void main(String[] args) {
		
		/*   Create a Class called Employee:
Create three  variables  eID , salary and set the CEO to “Sumair”
Create two objects of the class Employee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects*/
		
		Employee individual= new Employee();
		individual.eID = 123;
		individual.salary = 5000;
		//String CEO = "Sumair";
		
		Employee individual1= new Employee();
		individual1.eID = 420;
		individual.salary = 8000;
		//String name = "Ahmad";
	
		System.out.println(" The name of employee is " + individual.CEO + " and the ID is " + individual.eID +
				" and the salary is " + individual.salary);
	}

}
