package com.Class28;

public class VehicleTest {
	
	public static void main(String[] args) {
		
		Car car = new BMW("bmw");
		car.drive();
		car.start();
		car.stop();
		Vehicle.displayTotalVehicles();
		
		new BMW("bmw");
		new Toyota("Toyota");
		Vehicle.displayTotalVehicles();
		
	}
}
