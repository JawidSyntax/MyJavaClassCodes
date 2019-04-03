package com.class16;

public class Computer {

	String OS, brand;
	boolean mouse, keyboard;

	int screen, ram;

	public static void main(String[] args) {

		Computer comp1 = new Computer();

		comp1.mouse = true;
		comp1.keyboard = true;
		comp1.screen = 2;
		comp1.ram = 18;
		comp1.OS = "Windows";
		comp1.brand = "Dell";

		comp1.watchmovies();
		comp1.doJavaCoding();
		comp1.playMusic();

		Computer com2 = new Computer();

		com2.mouse = false;
		com2.keyboard = false;
		com2.screen = 4;
		com2.ram = 8;
		com2.OS = "Mac";
		com2.brand = "Apple";

		com2.watchmovies();
		com2.doJavaCoding();
		com2.playMusic();

	}

	void watchmovies() {
		System.out.println("We can watch movie on a computer " + brand);
	}

	void doJavaCoding() {
		System.out.println("We can do Java coding on our comuter" + brand);
	}

	void playMusic() {
		System.out.println("Lets paly some music on our comuter " + brand);
	}
}
