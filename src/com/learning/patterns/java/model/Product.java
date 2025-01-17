package src.com.learning.patterns.java.model;

public class Product {
	private double price;

	private String upcCode;

	public Product (double price, String upcCode){
		this.price= price;
		this.upcCode= upcCode;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
