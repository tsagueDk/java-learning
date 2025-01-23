package src.com.learning.patterns.java;

import src.com.learning.patterns.java.model.BasisIceCream;
import src.com.learning.patterns.java.model.ChocolateIceCream;
import src.com.learning.patterns.java.model.MintIceCream;

import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		BasisIceCream iceCream = new BasisIceCream();
		System.out.println("the cost for this is : "+iceCream.cost());

		MintIceCream mintIceCream = new MintIceCream(iceCream);
		System.out.println("the cost for this is : "+mintIceCream.cost());

		ChocolateIceCream chocolateIceCream = new ChocolateIceCream(mintIceCream);
		System.out.println("the cost for this is : "+chocolateIceCream.cost());
	}
}
