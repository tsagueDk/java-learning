package src.com.learning.patterns.java.model;

import src.com.learning.patterns.java.controller.IceCream;

public class ChocolateIceCream extends IceCreamDecorator{

	public ChocolateIceCream(IceCream iceCream){
		super(iceCream);
	}

	@Override
	public double cost() {
		System.out.println("Adding Chocolate");
		return 15 + super.cost();
	}
}
