package com.wipro.day_six;

public class Division {
	
	public static void main(String[] args) {
		int i = 2  , j = 14, res;
		try 
		{
			res = j/i;
			System.out.println("Division gone right. " + res);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Division gone wrong || " + e.getMessage());
			throw e;
		}
		finally {
			System.out.println("Calculation Operation is completed");
		}
	}
}
