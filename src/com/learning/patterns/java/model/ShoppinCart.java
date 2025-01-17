package src.com.learning.patterns.java.model;

import src.com.learning.patterns.java.controller.Payment;

import java.util.ArrayList;
import java.util.List;

public class ShoppinCart {

	private List<Product> productList;

	public ShoppinCart (){
		productList = new ArrayList<>();
	}

	public void addProduct(Product productToAdd){
		productList.add(productToAdd);
	}
	public void removeProduct(Product productToremove){
		productList.removeIf(product -> product.equals(productToremove));
	}

	public double calculateTotalAmount(){
		return productList.stream().map(Product::getPrice).mapToDouble(Double::doubleValue).sum();
	}

	public void pay(Payment paymentApi){
		paymentApi.pay(calculateTotalAmount());
		System.out.println("You paid the amount of "+ calculateTotalAmount());
	}
}
