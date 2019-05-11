package com.class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Task3Test {
	
	public static void main(String[] args) {
		
		/* In Test Class create a Map to store personId and a Person Object. Print each object details. */
		
		Task3 p1 = new Task3("John", "Smith", 35 , 45000);
		Task3 p2 = new Task3("Jim", "Brown", 22 , 35000);
		Task3 p3 = new Task3("Kim", "Lee", 40 , 78000);
		Task3 p4 = new Task3("Nancy", "Lora", 65 , 90000);
		
		Map <Integer, Task3> personMap = new HashMap<>();
		
		personMap.put(001, p1);
		personMap.put(002, p2);
		personMap.put(003, p3);
		personMap.put(004, p4);
		
		Collection <Task3> personid = personMap.values();
		
		for (Task3 check : personid) {
			check.personInfo();
			
		}
		
	}

}
