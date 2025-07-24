package com.wipro.day_four;

public class UpiPayment extends Payment{

	public UpiPayment(double amount) {
		super(amount);
	}

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println("UPI is being used for payment");
		printReceipt();
	}

}
