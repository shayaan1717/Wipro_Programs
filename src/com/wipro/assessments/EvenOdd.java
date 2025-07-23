package com.wipro.assessments;

import java.util.Scanner;

public class EvenOdd {

	public static Boolean EvenOddNum(int num) {
		return (num % 2 == 0) ? true : false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check Even or Odd");
		System.out.println(
				(EvenOddNum(s.nextInt())
				? "The Given Number is Even" : "The Given Number is Odd"));
	}
}
