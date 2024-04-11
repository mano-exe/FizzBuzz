package tdd;

public class Game {
	private static int score = 0;
	
	public static void roll(int nbQuilles) {
		score+=nbQuilles;
	}
	public static int score() {
		return score;
	}
}
