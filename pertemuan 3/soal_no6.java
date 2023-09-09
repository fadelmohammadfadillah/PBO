import java.math.BigInteger;
import java.util.Scanner;

public class soal_no6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if (input.length() > 200) {
			System.out.println("The maximum is 200 characters");
			return;
		}
		BigInteger angka1 = new BigInteger(input);
		input = sc.nextLine();
		if (input.length() > 200) {
			System.out.println("The maximum is 200 characters");
			return;
		}
		BigInteger angka2 = new BigInteger(input);
		sc.close();
		BigInteger hasilTambah = angka1.add(angka2);
		System.out.println(hasilTambah);
		BigInteger hasilKali = angka1.multiply(angka2);
		System.out.println(hasilKali);
	}

}
