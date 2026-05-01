package com.EmployeePayrollSystem;

public class PartTimeEmployee extends Employee{

	
	private int hourlyRate;
	private int hoursWorked;
	
	PartTimeEmployee(String empname,String empid,int hourlyRate,int hoursWorked){
		super(empname,empid);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}
	
	
	@Override
	public void calculateSalary() {
		System.out.println("Calculating salary: Hours worked × rate : "+hourlyRate*hoursWorked);
	}
	
}
