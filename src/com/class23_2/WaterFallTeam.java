package com.class23_2;

import com.class23.Employee;

public class WaterFallTeam extends Employee {
	
	public static void main(String[] args) {
		
		WaterFallTeam wt = new WaterFallTeam();
		wt.salary1=90000; //can access protected members (Variables & methods )values from different packages through inheritance
		//wt.salary = 1000; // default value cannot be accessed in different package
		
		wt.test(); // it is a protected method and can be  inherited from another package
		//wt.test1(): // it is a default method and can not be inherited from another package
	}

}
