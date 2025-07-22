package com.wipro.Day_One;

class CreditCardPayment implements PaymentMode {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}
