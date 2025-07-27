package com.wipro.day_six;

public class ArrayOutOfBound {
	
	public static void main(String[] args) {
		int arr[] = {0 , 1 , 3 , 10 , -91};
		
		try {
			System.out.println(arr[6]);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Wrong Index Value");
		}
		finally {
			System.out.println("Thank You for Executing :)");
		}
		
	}

}
