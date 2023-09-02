import java.util.Scanner;

public class Soal_no1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop_Max = sc.nextInt();
		for (int i=0; i<loop_Max; i++) {
			
			try {
				long input = sc.nextLong();
				System.out.println(input + " can be fitted in:");
				if (input >= Byte.MIN_VALUE && input <= Byte.MAX_VALUE) {
					System.out.println("* Byte");
				}
				if (input >= Short.MIN_VALUE && input <= Short.MAX_VALUE) {
					System.out.println("* Short");
				} 
				if (input >= Integer.MIN_VALUE && input <= Integer.MAX_VALUE) {
					System.out.println("* Int");
				}
				if (input >= Long.MIN_VALUE && input <= Long.MAX_VALUE) {
					System.out.println("* Long");
				}
			} catch(Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.\r\n");
			}
		}
	}
}
