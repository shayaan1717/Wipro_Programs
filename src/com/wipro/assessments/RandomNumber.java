package com.wipro.assessments;
import java.util.Random;

public class RandomNumber {
	public static long generateRandom() {
		Random rno = new Random();
		
		long min = 1000000000l;
		long max = 9999999999l;
		
		long num = min + ((long) (rno.nextDouble()*(max - min +1) ));
		return num;
		
		
		 
	}
	public static void main(String[] args) {
		
		long num = generateRandom();
		System.out.println(num);
	}
}
