package com.wipro.day_three;

public class GeneralPay {
	
	public static void main(String[] args) {
	    	CreditCardPayment c = new CreditCardPayment(15000);
	    	c.makePayment();
	    	
	    	System.out.println("Success\n");
	    	
	    	UpiPayment u = new UpiPayment(100000);
	    	u.makePayment();
	    	
	       	
	    	System.out.println("Success");
	    	
		
	}

}
