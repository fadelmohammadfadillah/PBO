package kasus2;

public class Sphere extends Shape{
	private double radius;
	
	public Sphere(double r) {
		super("sphere");
		this.radius = r;
	}
	
	public double area() {
		return 4 * Math.PI * this.radius * this.radius;
	}
	
	public String toString() {
		return super.toString() + " of radius: " + this.radius;
	}
}
