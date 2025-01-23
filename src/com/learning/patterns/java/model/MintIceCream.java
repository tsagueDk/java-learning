package src.com.learning.patterns.java.model;

import src.com.learning.patterns.java.controller.IceCream;

public class MintIceCream extends IceCreamDecorator{

	public MintIceCream (IceCream iceCream){
		super(iceCream);
	}

	@Override
	public double cost() {
		System.out.println("Adding Mint");
		return 1.5 + super.cost();
	}
}
