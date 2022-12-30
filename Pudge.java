package classwork18;

public class Pudge {
	private int level;
	private String name;
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Pudge [level=" + level + ", name=" + name + "]";
	}
	public Pudge(int level, String name) {
		super();
		this.level = level;
		this.name = name;
	}
	
}
