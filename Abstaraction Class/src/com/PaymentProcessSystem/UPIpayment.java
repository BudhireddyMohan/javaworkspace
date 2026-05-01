package com.PaymentProcessSystem;

public class UPIpayment extends Payment{
private String upiid;
private String phonenumber;

UPIpayment(String upiid,String phonenumber){
	this.upiid=upiid;
	this.phonenumber=phonenumber;
}

@Override
public void processingpayment() {
	System.out.println("Processing UPI payment");
}


@Override
public void validateTransaction() {
	System.out.println("Validating UPI ID and phone number");
}

}
