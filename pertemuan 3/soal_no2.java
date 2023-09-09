import java.util.ArrayList;
import java.util.Scanner;

public class soal_no2 {

	public static void main(String[] args) {
		int lengthOfLoop = 3;
		Scanner sc = new Scanner(System.in);
		String[] arrayInput;
		ArrayList<String> arrayString = new ArrayList<>();
		ArrayList<Integer> arrayInt = new ArrayList<>();
		for (int i=0; i < lengthOfLoop; i++) {
			String input = sc.nextLine();
			arrayInput = input.split(" ");
			try {
				int intValue = Integer.parseInt(arrayInput[1]);
				if (intValue < 0 || intValue > 999) {
					throw new IllegalArgumentException("Nilai harus berada pada rentang 0-999");
				}
				arrayString.add(arrayInput[0]);
				arrayInt.add(intValue);
			}catch (NumberFormatException e) {
				System.out.println(arrayInput[1] + " bukan bilangan bulat!");
				return;
			}catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				return;
			}
		}
		sc.close();
		System.out.println("================================");
		for (int i=0; i < lengthOfLoop; i++) {
			System.out.printf("%-15s", arrayString.get(i));
			System.out.printf("%03d%n", arrayInt.get(i));
		}
		System.out.println("================================");

	}

}
