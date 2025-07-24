package com.wipro.day_four;

public class General {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment CC = new CreditCardPayment(5505.25); 
		CC.makePayment();
		System.out.println("==========================================");
		Payment UPI = new UpiPayment(1205.30);
		UPI.makePayment();
		
		
		
		System.out.println("//========================================//");
	}

}
