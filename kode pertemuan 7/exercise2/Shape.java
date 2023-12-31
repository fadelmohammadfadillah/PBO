package exercise2;

public class Shape {
	private String color;
	private boolean filled;
	
	public Shape() {
		this.color = "red";
		this.filled = true;
	}
	public Shape(String c, boolean f) {
		this.color = c;
		this.filled = f;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return "Shape[color=" + this.color + ",filled=" + this.filled + "]";
	}
}
