package com.VehicalManagementSystem;

public class Truck extends Vechical{

	
	private int cargocapacity;
	
	Truck(String model,String vecnumber,String company,int cargo){
		super(model,vecnumber,company);
		this.cargocapacity=cargo;
		
	}
	
	@Override 
	public void startenginse() {
		System.out.println("truct start with heavyload work:");
	}
	
	@Override 
	public void fueltype() {
		System.out.println("truck with diesal");
	}
}
