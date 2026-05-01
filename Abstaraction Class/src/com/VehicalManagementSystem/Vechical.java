package com.VehicalManagementSystem;

public abstract class Vechical {
   private String modelname;
   private String vehicalnumber;
   private String company;
   
   Vechical(String model,String vechnum,String company){
	   this.modelname=model;
	   this.vehicalnumber=vechnum;
	   this.company=company;
   }
   
   public  abstract void startenginse();
   
   public abstract void fueltype() ;
   
public String getModelname() {
	return modelname;
}
public void setModelname(String modelname) {
	this.modelname = modelname;
}
public String getVehicalnumber() {
	return vehicalnumber;
}
public void setVehicalnumber(String vehicalnumber) {
	this.vehicalnumber = vehicalnumber;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
};
   
 
   
}
