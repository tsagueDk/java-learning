package src.com.learning.patterns.java.model;

import src.com.learning.patterns.java.controller.ScoreboardAlgorithmBase;

public class Clowns implements ScoreboardAlgorithmBase {

	@Override
	public int calculate(int clicks, int factor) {
		return (clicks * factor) - 10;
	}

}
