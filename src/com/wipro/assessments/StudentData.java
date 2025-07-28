package com.wipro.assessments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentData {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Map<String , Integer> student = new HashMap<String , Integer>();
		while(true) {
			System.out.println("======================== WELCOME =========================");
			System.out.println("Enter Your Choice \n"
					+ "1. Enter the Name and Marks of the Student \n"
					+ "2. Get the Marks scored by the particular student \n"
					+ "3. Exit");
			System.out.println("==========================================================");
			int choice = s.nextInt();
			
			switch(choice) {
			
			case 1: {
				System.out.println("Enter the Name of the Student");
				String name = s.next();
				System.out.println("Enter the marks scored");
				int marks = s.nextInt();
				student.put(name, marks);
				break;
				}
			
			case 2:{
				System.out.println("Enter the name of the student to find the marks scored.");
				String findName = s.next();
				int marksFound = student.get(findName);
				if(findName != null)
					System.out.println("Marks scored by "+findName+" is "+marksFound);
				else
					System.out.println("Invalid Name Found");		
				break;
				}
			case 3:{
				System.out.println("Thank you !!!");
				s.close();
				System.exit(0);
				}
			default: System.out.println("Invalid Choic Try Again :( ");
			}

		}
		
	}
	
	
}
