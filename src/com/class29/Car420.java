package com.class29;

public class Car420 {
	int carPrice;
	String color;
	double discount;
	
	public static void main(String[] args) {
		
		Truck obj = new Truck();
		obj.calcuateSalePrice();
		Sedan obj1 = new Sedan();
		obj1.calculateSalePrice();
	}
}

class Truck extends Car420{
	
public void calcuateSalePrice() {
		int carPrice = 18000;
		int weight = 1000;
		
		if(weight>2000) {
		discount = carPrice * 10 / 100;
			System.out.println("The  truck weights over 2000, hence the discout is " + discount + " percent");
		} else {
			discount = carPrice * 20 / 100;
			System.out.println("The  truck weights less than 2000, hence the discout is " + discount + "percent"); // 3600
		}
}
}
class Sedan extends Car420{
	
	public void calculateSalePrice() {
		int carPrice = 10000;
		int length = 35;
		
		if (length >20) {
			discount = carPrice * 5 / 100;
			System.out.println("The Sedan is longer than 20 feet, hence the discount is " + discount + " percent"); //500
		} else {
			discount = carPrice*10 / 100;
			System.out.println("The Sedan is shorter than 20 feet, hence the discount is " + discount + " percent"); 
		}
	}
	
}