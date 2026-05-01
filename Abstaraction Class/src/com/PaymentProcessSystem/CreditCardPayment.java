package com.PaymentProcessSystem;

public class CreditCardPayment extends Payment{

	
	
	private String cardnum;
	private String expirydate;
	private String cvv;
	
	CreditCardPayment(String cardnum,String expirydate,String cvv){
		this.cardnum=cardnum;
		this.expirydate=expirydate;
		this.cvv=cvv;
	}
	
	@Override
	public void processingpayment() {
		System.out.println("processing the credit card");
	}
	
	@Override
	public void validateTransaction() {
		System.out.println("Validating card number, expiry, and CVV");
	}
}
