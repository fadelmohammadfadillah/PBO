
public class Cylinder extends Circle {
	private double height;
	public Cylinder() {
		super();
		height = 1.0;
	}
	public Cylinder(double r) {
		super(r);
		height = 1.0;
	}
	public Cylinder (double r, double h) {
		super(r);
		height = h;
	}
	public Cylinder (double r, double h, String c) {
		super(r, c);
		height = h;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		double volume = getArea() * height;
		return volume;
	}
	@Override
	public double getArea() {
		double area = 2*3.14* getRadius() + 2*super.getArea();
		return area;
	}
	@Override
	public String toString() {
		return "Cylinder: subclass of " + super.toString() + "height=" + height;
	}
	
}
