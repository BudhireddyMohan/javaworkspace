package com.EmployeePayrollSystem;

public class FullTimeEmployee extends Employee{
	
	private int basepay;
	private int benefits;
	
	FullTimeEmployee(String empname,String empid,int basepay,int benefits){
		super(empname,empid);
		this.basepay=basepay;
		this.benefits=benefits;
	}
	
	@Override
	public void calculateSalary(){
		System.out.println("Calculating salary: Base pay + benefits ="+ basepay+benefits);
	}
	
	
}
