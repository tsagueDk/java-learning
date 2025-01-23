package src.com.learning.patterns.java.model;

import src.com.learning.patterns.java.controller.IceCream;

public class BasisIceCream implements IceCream {

	public BasisIceCream (){
		System.out.println("First the base Ice cream");
	}

	@Override
	public double cost() {
		System.out.println("Basic IceCream");
		return 0.5;
	}
}
