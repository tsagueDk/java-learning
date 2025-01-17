package src.com.learning.patterns.java.model;

import src.com.learning.patterns.java.controller.Payment;

public class PaypalPaymentApi implements Payment {

	private String emailAddress;
	private String password;

	public PaypalPaymentApi(String emailAddress, String password) {
		this.emailAddress = emailAddress;
		this.password = password;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Thanks for using Paypal payment interface. We will charge " + paypalFees(amount));
	}

	private double paypalFees(double amount) {
		double fees = 0;
		if (amount > 100) {
			fees = amount / 10;
		}
		else {
			fees = (amount * 2) / 10;
		}
		return fees;
	}
}
