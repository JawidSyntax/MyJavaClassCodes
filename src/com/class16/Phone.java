package com.class16;

public class Phone {
	
	String color, OS, Model;
	int screen, capacity;
	boolean wifi, remotecharging;
	
	public static void main(String[] args) {
		
		Phone iphone = new Phone ();
		
		iphone.OS = "Apple";
		iphone.color = "Jet Black";
		iphone.screen = 8;
		iphone.capacity = 128;
		iphone.wifi = true;
		iphone.remotecharging = false;
		iphone.Model = "X";
		
		iphone.reliablity();
		iphone.connectivity();
		iphone.price();
		
		
		
		Phone Android = new Phone ();
		
		Android.OS = "Samsung";
		Android.color = "Silver";
		Android.screen = 12;
		Android.capacity = 500;
		Android.wifi = false;
		Android.remotecharging = true;
		Android.Model = "S+";
		
		
		Android.reliablity();
		Android.connectivity();
		Android.price();
		
		
		Phone Nokia = new Phone ();
		
		Nokia.OS = "Noki";
		Nokia.color = "Navy Blue";
		Nokia.screen = 1;
		Nokia.capacity = 12;
		Nokia.wifi = false;
		Nokia.remotecharging = false;
		Nokia.Model = "3011";
		
		Nokia.reliablity();
		Nokia.connectivity();
		Nokia.price();
		
		
	}
	void reliablity () {
		System.out.println(" My phone is reliable and has good performance " + Model);
	}
	void price () {
		System.out.println("My phone is too expensive " + Model);
	}
	void connectivity () {
		System.out.println("My phone has good connectivity " + Model);
	}
	}
	
