package com.class24;

public class Testing {
	public static void main(String[] args) {
		
		String a;
		a = "10";
		double d = 12;
		
		Parent parent = new Parent();
		parent.love();
		parent.work();
		
		
		Child child = new Child();
		child.love();
		child.cry();
		child.work();
		
		
		//Child obj1=new Parent(); not possible never smaller classes will not be placed in the bigger class
		
		//Type casting
				Parent obj = new Child();
				
				obj.work(); // Parent
				obj.love(); //Child love
			//	obj.cry(); Not accessible because 
		
	}

}
