package src.com.learning.patterns.java;

import src.com.learning.patterns.java.controller.ScoreboardAlgorithmBase;
import src.com.learning.patterns.java.controller.ScoreboardBase;
import src.com.learning.patterns.java.model.Ballon;
import src.com.learning.patterns.java.model.Clowns;
import src.com.learning.patterns.java.model.SquareBallon;

public class main {
	public static void main(String[] args) {

		ScoreboardBase scoreboardBase = new ScoreboardBase();

		System.out.println("With the algorithm for Ballon : ");
		scoreboardBase.scoreboardAlgorithmBase= new Ballon();
		scoreboardBase.showScore(10,5);

		System.out.println("With the algorithm for Clowns : ");
		scoreboardBase.scoreboardAlgorithmBase= new Clowns();
		scoreboardBase.showScore(10,5);
		
		System.out.println("With the algorithm for SquareBallon : ");
		scoreboardBase.scoreboardAlgorithmBase= new SquareBallon();
		scoreboardBase.showScore(10,5);
	}
}
