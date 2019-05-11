package com.class33;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task3 {

	public static void main(String[] args) {
		
	
	/*Create an HashSet of cities and add duplicates into it.
    Retrieve all values from hashset in 2 different ways.
    Retrieve all values in alphabetical order.   */
	
	Set <String> city = new LinkedHashSet<>();
	
	city.add("Tokyo");
	city.add("Dehki");
	city.add("New York");
	city.add("Paris");
	city.add("Rio");
	city.add("Kabul");
	city.add("New York");
	city.add("Paris");
	city.add("Rio");
	
	System.out.println("before sorting them: " + city);
	
	List<String> list = new ArrayList<String>(city);
	Collections.sort(list);
	System.out.print("HashSet list in sorted order: " + list);
	
	}
}
