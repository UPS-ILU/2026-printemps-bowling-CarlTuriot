package tdd;

public class Game {
	private int scoreTotal=0;
	
	public void roll(int entier) {
		scoreTotal+=entier;
	}
	public int score() {
		return scoreTotal;
	}
}
