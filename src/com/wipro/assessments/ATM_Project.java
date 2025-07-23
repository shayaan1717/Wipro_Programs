package com.wipro.assessments;

import java.util.Scanner;

public class ATM_Project {

	private double balance;
	
	private Scanner s;
	ATM_Project() {
		balance = 1000.0;
		s = new Scanner(System.in);
	}
//	Bank Menu
	public void displayMenu() {
		System.out.println("ATM Menu");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit");
		System.out.println("=====================");
	}
//	Balance Details
	public void checkBal() {
		System.out.println("Your Balance : $" + balance);	
	}
//	Deposit
	public void deposit() {
		System.out.println("Enter the Amount to Deposit");
		double amount = s.nextDouble();
		if(amount > 0) {
			balance += amount;
			System.out.println("$"+amount+" has been deposited.");
		}else 
			System.out.println("Invalid Amount is entered");
	}
//	Withdraw
	public void withdraw() {
		System.out.println("Enter the Amount to Withdraw");
		double amount = s.nextDouble();
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("$"+amount+" has been withdrawn.");
		}
		else if(amount > balance)
			System.out.println("Insufficient Funds. Your balance is $"+balance);
		
		else 
			System.out.println("Invalid Amount is entered");
		
	}

	public static void main(String[] args) {
		ATM_Project atm = new ATM_Project();		
		while(true) {
			atm.displayMenu();
			System.out.println("Enter your Choice");
			int choice = atm.s.nextInt();
			System.out.println("=====================");
			
			switch(choice) {
				case 1 : atm.checkBal();
							break;
				case 2 : atm.deposit();
							break;
				case 3 : atm.withdraw();
							break;
				case 4 : System.out.println("Thank you for using the ATM, Good Bye :)");
							System.exit(0);
							break;
							
				default: System.out.println("Invalid Choice :( --- Try Again");
			}
		}
	}


}
