package com.class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CarTest {
	
	public static void main(String[] args) {
		
		//create a map in which we will store the carNumber  and Car Object
		
		Car car1 = new Car("Toyota", "Corolla");
		Car car2 = new Car("Honda", "Accord");
		Car car3 = new Car("Lada", "Priora");
		
		car1.printCarDetails();
		car2.printCarDetails();
		car3.printCarDetails();
		
		System.out.println("---------------------------------");
		
		Map<Integer, Car> carMap = new HashMap<>();
		carMap.put(1, car1);
		carMap.put(2, car2);
		carMap.put(3, car3);
		
		Collection <Car> carValues = carMap.values();
		for (Car car : carValues) {
			car.printCarDetails();
			
		}
		
		//another way to call the objects through in the HashMap.
		
		System.out.println("///////////////////////////////////////");
		Map<Integer, Car> carMap1 = new HashMap<>();
		carMap1.put(1, new Car ("BMD", "X8"));
		carMap1.put(2, new Car ("Audi", "R8"));
		carMap1.put(3, new Car ("Mercedes", "CLS"));
		
		Collection <Car> carValues1 = carMap1.values();
		for (Car car : carValues1) {
			car.printCarDetails();
	}
	}
}
