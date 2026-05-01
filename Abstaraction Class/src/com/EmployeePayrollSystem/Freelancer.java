package com.EmployeePayrollSystem;

public class Freelancer extends Employee{

	private int projectPayment;
	Freelancer(String empname,String empid,int projectPayment){
		super(empname,empid);
		this.projectPayment=projectPayment;
	}
	
   @Override
   public void calculateSalary() {
	   System.out.println("Calculating salary: Project payment = "+this.projectPayment);
   }
}
