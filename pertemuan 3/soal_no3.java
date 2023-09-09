import java.util.Scanner;

public class soal_no3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String expression = sc.nextLine();
		sc.close();
		String[] arrayExpression = expression.split(" ");
		if(arrayExpression.length > 3) {
			System.out.println("Invalid Expression!");
			return;
		}
		int angka1 = Integer.parseInt(arrayExpression[0]);
		int angka2 = Integer.parseInt(arrayExpression[2]);
		char operator = arrayExpression[1].charAt(0);
		if (angka1 < 0 || angka1 > 1000 || angka2 < 0 || angka2 > 1000) {
			System.out.println("Nilai angka diluar batasan yang telah ditentukan: 1 - 1000");
			return;
		}
		int result;
		switch (operator) {
		case '+':
			result = angka1 + angka2;
			break;
		case '-':
			result = angka1 - angka2;
			break;
		case '*':
			result = angka1 * angka2;
			break;
		case '/':
			if (angka1 % angka2 != 0) {
				System.out.println(angka1 + " tidak habis dibagi " + angka2);
				return;
			}
			result = angka1 / angka2;
			break;
		case '%':
			result = angka1 % angka2;
			break;
		default:
			System.out.println("invalid operator!");
			return;
		}
		System.out.println(result);

	}

}
