package com.class25;

public class Animal {
	
	public static void whoAmI() {
		System.out.println("I am an animal");
	}

}

class puppy extends Animal  {
/*	Can not override static method with instanc 
 * public void whoAmI() {
	public void whoAmI (" I am a puppy")
}*/
}

// static methods can not be overidden
class monkey extends Animal{
	public static void whoAmI() {
		System.out.println("I am a monkey");
	}
}
