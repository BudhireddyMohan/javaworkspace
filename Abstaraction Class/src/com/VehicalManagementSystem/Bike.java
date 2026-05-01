package com.VehicalManagementSystem;

public class Bike extends Vechical{

	private Boolean hassidercar;
	
	Bike(String model,String vecnum,String company,Boolean t){
		super(model,vecnum,company);
		this.hassidercar=t;
	}
	
	@Override
	public void startenginse() {
		System.out.println("bike start with Kick-Start");
	}
	
	@Override
	public void fueltype() {
		System.out.println("petrol");
	}
	
}
