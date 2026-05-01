package com.VehicalManagementSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Vechical v;
		v=new Car("toyota camry","Ap32bg6219","toyota",4,true);
		v.startenginse();
		v.fueltype();
		 v=new Bike("Yamaha R1", "XYZ789", "Yamaha", false);
		 v.startenginse();
		 v.fueltype();
		 v=new Truck("Volvo FH", "DEF456", "Volvo", 20000);
		 v.startenginse();
		 v.fueltype();
		 
	}

}
