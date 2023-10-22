package kasus2;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		super("Rectangle");
		this.length = l;
		this.width = w;
	}
	
	public double area() {
		return this.length * this.width;
	}
	
	public String toString() {
		return super.toString() + " of length: " + this.length + " width: " + this.width;
	}
}
