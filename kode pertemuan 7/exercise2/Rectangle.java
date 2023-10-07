package exercise2;

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle() {
		super();
		this.width = 1.0;
		this.length = 1.0;
	}
	
	public Rectangle (double w, double l) {
		super();
		this.width = w;
		this.length = l;
	}
	
	public Rectangle(double w, double l, String color, boolean filled) {
		super(color, filled);
		this.width = w;
		this.length = l;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea(){
		return this.width * this.length;
	}
	public double getPerimeter() {
		return 2*this.width + 2*this.length;
	}
	
	@Override
	public String toString() {
		return "Rectangle[" + super.toString() + ",width=" + this.width + ",length="+ this.length + "]";
	}
}
