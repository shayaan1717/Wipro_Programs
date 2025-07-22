package com.wipro.Day_One;

class CashOnDelivery implements PaymentMode {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " will be collected on delivery.");
    }
}

