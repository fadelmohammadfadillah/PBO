import java.util.Scanner;

public class soal_no5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String ab = a + b;
		System.out.println(ab.length());
		int lexicographicalOrder = a.compareTo(b);
		if (lexicographicalOrder < 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		System.out.println(a.toUpperCase().charAt(0)+ a.substring(1) + " " + b.toUpperCase().charAt(0)  + b.substring(1));
	}

}
