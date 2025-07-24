package com.wipro.day_four;

public abstract class Payment {
	protected double amount;

	public Payment(double amount) {
		this.amount = amount;
	}
	
	public abstract void makePayment();
	
	public void printReceipt() {
		System.out.println("Payment of $"+amount+ " processed");
	}

}
