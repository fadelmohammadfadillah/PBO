import java.util.Scanner;

public class MainRestaurant {

    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan("Tahu", 1_000, 20);
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        
        String keputusan = "Y";
        while (keputusan.equals("Y")) {
        	menu.tampilMenuMakanan();
            Scanner input = new Scanner(System.in);
            System.out.println("Pilih makanan yang ingin dipesan: ");
            int idMakanan = input.nextInt();
            System.out.println("Jumlah makanan yang ingin dipesan: ");
            int jumlahMakanan = input.nextInt();
            menu.pesanMakanan(idMakanan, jumlahMakanan);
            System.out.println("Apakah ingin memesan makanan lain? (Y/T)");
            keputusan = input.next().toUpperCase();
        }
        
    }
}