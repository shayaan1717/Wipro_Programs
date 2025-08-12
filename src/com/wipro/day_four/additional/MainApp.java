package com.wipro.day_four.additional;

import com.wipro.day_four.CreditCardPayment;
import com.wipro.day_four.Payment;
import com.wipro.day_four.UpiPayment;
import com.wipro.day_four.*;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment CC = new CreditCardPayment(5505.25); 
		CC.makePayment();
		System.out.println("==========================================");
		Payment UPI = new UpiPayment(1205.30);
		UPI.makePayment();
		
		System.out.println("==========================================");

		BillGenerator.displayHeader();
//		Lambda Operation is being done
	     BillGenerator bill = (amount) -> {
	            System.out.println("Amount: ₹" + amount);
	            System.out.println("Thank you for your payment!");
	     };
	     
	     bill.showBillFormat();  
	     bill.generate(6500); 
	}

}
