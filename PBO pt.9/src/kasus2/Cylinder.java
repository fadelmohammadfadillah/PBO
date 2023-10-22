package kasus2;

public class Cylinder extends Shape{
	private double radius;
	private double height;
	
	public Cylinder(double r, double h) {
		super("sphere");
		this.radius = r;
		this.height = h;
	}
	
	public double area() {
		return Math.PI * this.radius * this.radius * this.height;
	}
	
	public String toString() {
		return super.toString() + " of radius: " + this.radius + " height: " + this.height;
	}

}
