package com.wipro.Day_One;

public class PayRollAbstract {
	public static void main(String[] args) {
        EmployeeDetails e1 = new FullTimeEmployee("Chetan", 101, 50000);
        EmployeeDetails e2 = new PartTimeEmployee("Gagan", 102, 80, 300);

        e1.display();
        System.out.println("Salary: ₹" + e1.calculateSalary());

        System.out.println();

        e2.display();
        System.out.println("Salary: ₹" + e2.calculateSalary());
    }
}
