package com.wipro.Day_One;

class UpiPayment implements PaymentMode {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}
