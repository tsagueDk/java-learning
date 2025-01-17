package src.com.learning.patterns.java.controller;

public class ScoreboardBase {
	public  ScoreboardAlgorithmBase scoreboardAlgorithmBase;

	public void showScore(int clicks, int factor){
		System.out.println("Your score is : "+ scoreboardAlgorithmBase.calculate(clicks,factor));
	}
}
