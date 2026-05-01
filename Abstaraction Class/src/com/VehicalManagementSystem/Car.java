package com.VehicalManagementSystem;

public class Car extends Vechical{
  private int numberofdoors;
 private  Boolean hassunroof;
 
Car(String model,String vecnumber,String company,int doors,Boolean t){
	super(model,vecnumber,company);
	this.numberofdoors=doors;
	this.hassunroof=t;
	
}

@Override
public void startenginse() {
	System.out.println("car start with Key");
	
}

@Override
public void fueltype() {
	System.out.println("car Run with petrol");
}
 
}
