package com.wipro.assessments;

public class Assesment1 {

	public static void main(String[] args) {
		
//		Widening
		int valint = 10;
		double valdoub = valint;
		
		System.out.println(valint);
		System.out.println(valdoub);
		System.out.println("------------------");
//		byte -> short -> int -> long -> float -> double
				
// Narrowing
		float valFloat = 189.02f;
		long valLong = (long)valFloat;
		
		System.out.println(valFloat);
		System.out.println(valLong);
		
		
//	double -> float -> long -> int -> short -> byte	
	}

}
