package com.wipro.Day_One;

class PartTimeEmployee extends EmployeeDetails {
	 	int hoursWorked;
	    double ratePerHour;

	    public PartTimeEmployee(String name, int empId, int hoursWorked, double ratePerHour) {
	        super(name, empId);
	        this.hoursWorked = hoursWorked;
	        this.ratePerHour = ratePerHour;
	    }

	    @Override
	    double calculateSalary() {
	        return hoursWorked * ratePerHour;
	    }
}
