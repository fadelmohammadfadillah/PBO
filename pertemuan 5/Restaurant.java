
public class Restaurant {
    private String[] namaMakanan;
    private double[] hargaMakanan;
    private int[] stok;
    private static byte id=0;
    
    public Restaurant(){
        namaMakanan = new String[10];
        hargaMakanan = new double[10];
        stok = new int[10];
    }
    
    public void tambahMenuMakanan (String nama, double harga, int stok){
    	if (this.id >= 10) {
    		System.out.println("Maaf, jumlah menu telah mencapai batas.");
    		return;
    	}
    	id++;
        this.namaMakanan[id] = nama;
        this.hargaMakanan[id] = harga;
        this.stok[id] = stok;
    }
    
    public boolean isOutOfStock(int id){
        if(stok[id] <= 0){
            return true; 
       }else{
            return false;
        }
    }
    
    public void tampilMenuMakanan(){
        for (int i = 1 ; i<= id; i++){
            if(!isOutOfStock(i)){
                System.out.println(i + ". " + namaMakanan[i] + "["+ stok[i]+ "]\t Rp." +hargaMakanan[i]);
            }else {
            	System.out.println(i + ". " + namaMakanan[i] + "\t Habis!");
            }
        }
    }
    
    public void pesanMakanan(int id, int jumlahMakanan) {
    	if (id < 1 && id > this.id) {
    		System.out.println("maaf, menu tidak tersedia!");
    		return;
    	}
    	if (stok[id] - jumlahMakanan < 0) {
    		System.out.println("maaf, " + namaMakanan[id] + " hanya sisa " + stok[id]);
    		return;
    	}
    	stok[id] -= jumlahMakanan;
    	double totalHarga = hargaMakanan[id] * jumlahMakanan;
    	System.out.println("total harga = Rp." + totalHarga);
    }
    
    
}