package com.class26;

public class TestBank {
	
	public static void main(String[] args) {
		
	Bank D;
	D = new Bank();
	System.out.println(D.getBalance());
	D = new BankA();
	System.out.println(D.getBalance());
	D = new BankB();
	System.out.println(D.getBalance());
	D = new BankC();
	System.out.println(D.getBalance());



}
}