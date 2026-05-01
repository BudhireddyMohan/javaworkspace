package com.PaymentProcessSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Payment p;
       p=new CreditCardPayment("1234567890123456", "12/25", "123");
       p.processingpayment();
       p.validateTransaction();
       p.generatetranscid();
       p=new UPIpayment("user@upi", "1234567890");
       p.processingpayment();
       p.validateTransaction();
       p.generatetranscid();
       p=new PayPalPayment("user@example.com", "abc123");
       p.processingpayment();
       p.validateTransaction();
       p.generatetranscid();
	}

}
