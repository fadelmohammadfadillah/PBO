import java.util.Scanner;

public class soal_no1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		if (input.length() < 1 || input.length() > 4 * (int) Math.pow(10, 5)) {
			System.out.println("Invalid input length");
			return;
		}
		String[] arrayInput = input.split("[ !,?._'@]+");
		System.out.println(arrayInput.length);
		for (String word : arrayInput) {
			System.out.println(word);
		}
	}

}
