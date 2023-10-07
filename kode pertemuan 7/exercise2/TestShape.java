package exercise2;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Shape("blue", false);
		System.out.println(s1.toString());
		
		Circle s2 = new Circle(7.0);
		System.out.println(s2.toString() + s2.getArea());
		
		Rectangle s3 = new Rectangle(5.0, 7.0);
		System.out.println(s3.toString() + s3.getArea());
		
		Square s4 = new Square(10.0);
		System.out.println(s4.toString() + s4.getArea());
		
		
	}

}
