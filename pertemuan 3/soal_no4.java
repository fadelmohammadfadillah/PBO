import java.util.Scanner;

public class soal_no4 {

	public static void main(String[] args) {
		int gajiPokok = 500_000;
		int hargaItem = 50_000;
		int gajiFinal;
		Scanner sc = new Scanner(System.in);
		int itemTerjual = sc.nextInt();
		sc.close();
		int totalPenjualan = hargaItem * itemTerjual;
		if (itemTerjual > 80) {
			gajiFinal = totalPenjualan * 35/100 + gajiPokok;
		}else if(itemTerjual >= 40) {
			gajiFinal = totalPenjualan * 25/100 + gajiPokok;
		}else if (itemTerjual < 15) {
			gajiFinal = gajiPokok - (15 - itemTerjual) * (hargaItem * 15 / 100);
		}else {
			gajiFinal = totalPenjualan * 10/100 + gajiPokok;
		}
		System.out.println(gajiFinal);
	}

}
