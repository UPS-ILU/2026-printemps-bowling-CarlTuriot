package tdd;

public class Game {
	private int n=0;
	private int[] rollN = new int[20];
	
	public void roll(int entier) {
		rollN[n]=entier;
		n++;
	}
	
	
	public int score() {
		int scoreTotal=0;
		for (int i = 0; i < 20; i+=2) {
			if (rollN[i]+rollN[i+1]==10) {
				scoreTotal += rollN[i+2];
			} 
			scoreTotal+=rollN[i]+rollN[i+1];
		}
		return scoreTotal;
	}
}
