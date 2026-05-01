package com.EmployeePayrollSystem;


public abstract class Employee {

	
	
	private String empname;
	private String empid;
	

	Employee(String empname,String empid){
		this.empname=empname;
		this.empid=empid;
	}
	
	public abstract void calculateSalary();
	
	
	public  void applyleave() {
		System.out.println("Leave applied successfully");
	}
	
	public void getDetails() {
		System.out.println("empname : "+this.empname);
		System.out.println("empid : "+this.empid);
	}
}
