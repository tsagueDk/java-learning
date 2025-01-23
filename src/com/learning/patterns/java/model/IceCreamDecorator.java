package src.com.learning.patterns.java.model;

import src.com.learning.patterns.java.controller.IceCream;

public class IceCreamDecorator implements IceCream {

	private IceCream iceCream;
	public IceCreamDecorator (IceCream iceCream){
		this.iceCream=iceCream;
	}

	@Override
	public double cost() {
		return this.iceCream.cost();
	}
}
