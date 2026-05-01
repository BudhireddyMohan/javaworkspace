package com.PaymentProcessSystem;
public abstract class Payment {
 
	
	public abstract void processingpayment();
	
	public abstract void validateTransaction();
	
	
	public void  generatetranscid() {
		System.out.println("Transcation id : "+Math.random());
	}
}
