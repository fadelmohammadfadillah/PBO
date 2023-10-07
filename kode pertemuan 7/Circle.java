
public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		color = "red";
		radius = 1.0;
	}
	public Circle(double radius) {
		this.radius = radius;
		color = "red";
	}
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
	public String toString() {
		return "Circle[radius=" + radius + "color=" + color + "]";
	}
}
