package kasus2;

public abstract class Shape {
	private String shapeName;
	
	public Shape(String shName) {
		this.shapeName = shName;
	}
	
	public String toString() {
		String result = "Shape: " + this.shapeName;
		return result;
	}
	
	public abstract double area();
}
