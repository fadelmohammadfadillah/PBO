import java.util.Scanner;

public class soal_no5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		String[] arrayPlatNomor = input.split(" ");
		if (arrayPlatNomor.length > 4) {
			System.out.println("invalid input!");
			return;
		}
		String stringPlatNomor = String.join("", arrayPlatNomor);
		long longPlatNomor = Long.parseLong(stringPlatNomor);
		long result = longPlatNomor - 999_999;
		result = result % 5;
		if (result == 0) {
			System.out.println("jalan");
		}else {
			System.out.println("berhenti");
		}
	}

}
