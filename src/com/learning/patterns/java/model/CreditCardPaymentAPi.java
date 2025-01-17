package src.com.learning.patterns.java.model;

import src.com.learning.patterns.java.controller.Payment;

public class CreditCardPaymentAPi implements Payment {

	private String name;
	private String cardNummer;

	public CreditCardPaymentAPi(String name, String cardNummer) {
		this.name = name;
		this.cardNummer = cardNummer;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Thanks for using our Credit card for payment; it is free");
	}
}
