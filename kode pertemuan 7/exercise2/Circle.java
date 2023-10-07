package exercise2;

public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		super();
		this.radius = 1.0;
	}
	
	public Circle(double r) {
		super();
		this.radius = r;
	}
	
	public Circle(double r, String c, boolean f) {
		super(c, f);
		this.radius = r;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14* this.radius * this.radius;
	}
	
	public double getPerimeter() {
		return 2 * 3.14 * this.radius;
	}
	
	@Override
	public String toString() {
		return "Circle[" + super.toString() + ",radius=" + this.radius + "]";
	}
	
}
