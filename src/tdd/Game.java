package tdd;

public class Game {
	private int score = 0;
	private int i = 0;
	private int lancers[] = new int[20];
	public  void roll(int nbQuilles) {
		this.lancers[i]+=nbQuilles;
		i++;
	}
	public  int score() {
		for (int i = 0; i<20; i+=2) {
			if (this.lancers[i]+this.lancers[i+1]==10) {
				this.lancers[i+2]+=this.lancers[i+2];
			}
		}
		for (int i = 0; i<20; i++) {
			this.score+=lancers[i];
		}
		return this.score;
	}
}
