package com.wipro.Day_One;

class FullTimeEmployee extends EmployeeDetails{
	    double monthlySalary;

	    FullTimeEmployee(String name, int empId, double monthlySalary) {
	        super(name, empId);
	        this.monthlySalary = monthlySalary;
	    }

	    @Override
	    double calculateSalary() {
	        return monthlySalary;
	    }
}



