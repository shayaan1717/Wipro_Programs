package com.wipro.Day_One;

abstract public class EmployeeDetails {
	String name;
    int empId;

    public EmployeeDetails(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

	// Abstract method
    abstract double calculateSalary();

    // Common method
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
    }
}

