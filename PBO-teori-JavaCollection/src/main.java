
public class main {

	public static void main(String[] args) {
		Family fam1 = new Family();
		//tambah niece
		fam1.addNiece("Siti", 12, 3); //siti 12 maret
		fam1.addNiece("Stepen", 1, 12); //stepen 1 desember
		fam1.addNiece("Reza", 6, 6); //reza 6 juni
		
		//print list niece
		fam1.listNieces();
		
		//test findNiece
		System.out.println(fam1.findNiece("Stepen"));//harusnya ada
		System.out.println(fam1.findNiece("Ujang"));//harusnya tidak ada
		
		
		//tambah uncle
		fam1.addUncle("Ujang");
		fam1.addUncle("Joko");
		
		//print list uncle 
		fam1.listUncles();
		
		//test findUncles
		System.out.println(fam1.findUncle("Joko"));
		System.out.println(fam1.findUncle("Stepen"));
	
		//test add present
		Uncle uncleJoko = fam1.findUncle("Joko");
		Niece nieceSiti = fam1.findNiece("Siti");
		if (uncleJoko.addPresent(nieceSiti, "Boneka")) {
			System.out.println("uncle Joko berhasil memberikan kado pada Siti");
		}else {
			System.out.println("uncle Joko gagal memberikan kado pada Siti karena telah diberikan oleh uncle lain");
		}
		
		//test jika present yang diberikan sama oleh uncle berbeda
		Uncle uncleUjang = fam1.findUncle("Ujang");
		if (uncleUjang.addPresent(nieceSiti, "Boneka")) {
			System.out.println("uncle Ujang berhasil memberikan kado pada Siti");
		}else {
			System.out.println("uncle Ujang gagal memberikan kado pada Siti karena telah diberikan oleh uncle lain");
		}
		
		uncleUjang.addPresent(nieceSiti, "Make-Up");
		
		//test print list yang dimiliki niece
		nieceSiti.listPresents();
		
		//test clear present niece
		nieceSiti.clearPresent();
		nieceSiti.listPresents();
	
		Niece nieceReza = fam1.findNiece("Reza");
		uncleUjang.addPresent(nieceReza, "RC cars");
		//test unclePresent
		uncleUjang.listPresents();
	}

}
