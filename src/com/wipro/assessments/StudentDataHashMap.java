package com.wipro.assessments;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class StudentDataHashMap {

	public static void main(String[] args) {
		System.out.println("======================== WELCOME =========================");
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of Students for the semester");
		int n = s.nextInt();
		HashMap<String ,  Integer> student = new HashMap<String , Integer>();

		
//		Retrieving the data
		System.out.println("Enter your Name and your Total Marks scored in your Semester");
		for(int i = 0 ; i < n; i++) {
			student.put(s.next(), s.nextInt());
		}
		
		
		System.out.println("====================== Student Data ======================");
//		Displaying the data
		for(String i: student.keySet()) {
			System.out.println("Name: "+i+"\t \t \t \t \tMarks: "+student.get(i));
		}
		
		
		
		s.close();
	}

}
