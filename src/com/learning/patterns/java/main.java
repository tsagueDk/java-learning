package src.com.learning.patterns.java;

import src.com.learning.patterns.java.model.CreditCardPaymentAPi;
import src.com.learning.patterns.java.model.PaypalPaymentApi;
import src.com.learning.patterns.java.model.Product;
import src.com.learning.patterns.java.model.ShoppinCart;

import java.util.Arrays;

public class main {
	public static void main(String[] args) {

		Product book = new Product(100, "Design Pattern in Java");
		Product milk = new Product(5, "Soja milk");

		ShoppinCart newCard= new ShoppinCart();
		Arrays.asList(book,milk).forEach(newCard::addProduct);
		newCard.pay(new PaypalPaymentApi("todo@mail.com","pass"));

		newCard.removeProduct(milk);
		newCard.pay(new CreditCardPaymentAPi("Mastercard", "0123456789"));
	}
}
