package com.PaymentProcessSystem;

public class PayPalPayment extends Payment{

	private String email;
	private String authtoken;
	PayPalPayment(String email,String authtoken){
		this.authtoken=authtoken;
		this.email=email;
	}
	
	
	@Override
	public void processingpayment() {
		System.out.println("Processing PayPal payment.");
	}
	
	@Override 
	public void validateTransaction() {
		System.out.println("Validating email and authentication");
	}
}
