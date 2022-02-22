package game;

public class GameObject implements Comparable<GameObject> {
	private int id;
	private String name;
	
	private int[][] comparison = {
			{0, -1, 1}, {1, 0, -1}, {-1, 1, 0}
	};
	
	@Override
	public int compareTo(GameObject other) {
		return comparison[id][other.id];
	}
	
	protected int getId() {
		return id;
	}
	
	protected void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
