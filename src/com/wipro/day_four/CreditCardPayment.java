package com.wipro.day_four;

public class CreditCardPayment extends Payment{

	public CreditCardPayment(double amount) {
		super(amount);
	}

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println("Credit Card is being used for payment");
		printReceipt();
	}
	
}
