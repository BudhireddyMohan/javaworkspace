package com.EmployeePayrollSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e;
		e=new FullTimeEmployee("John Doe", "12345", 50000, 10000);
		e.calculateSalary();
		e.applyleave();
		e.getDetails();
		e=new PartTimeEmployee("Jane Smith", "67890", 20, 15);
		e.calculateSalary();
		e.applyleave();
		e.getDetails();
		e=new Freelancer("Alice Johnson", "54321", 5000);
		e.calculateSalary();
		e.applyleave();
		e.getDetails();
	}

}
