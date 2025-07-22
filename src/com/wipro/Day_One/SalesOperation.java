package com.wipro.Day_One;

public class SalesOperation {

	public static void main(String[] args) {
		
		SaleItem s = new SaleItem("Mobile" , 40000, 9);
 		System.out.println("Total Price: "+s.getTotalPrice());
 		System.out.println("Item Details");
 		s.displayItem();
	}

}
