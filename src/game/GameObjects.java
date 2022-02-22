package game;

public enum GameObjects {
	ROCK(0), PAPER(1), SCISSORS(2);
	
	private int id;
	
	GameObjects(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

}
