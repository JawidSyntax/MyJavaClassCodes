package com.class24;

//parent class
public class Bank {

	public int chargeInterest() {
		return 0;
	}
}

//Child class
class BOA extends Bank{
	@Override //annotation
	public int chargeInterest() {
		return 2;
	}
}
//Child class

class PNC extends Bank {
	@Override //annotation
	public int chargeInterest() {
	return 3;
	
	}
}