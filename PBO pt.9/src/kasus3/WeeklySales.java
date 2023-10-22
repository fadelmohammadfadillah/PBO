package kasus3;

import java.util.Scanner;

public class WeeklySales {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Banyak pegawai? ");
		int size = scan.nextInt();
		
		Salesperson[] salesStaff = new Salesperson[size];
		
		for(int index=0; index<size; index++) {
			System.out.println("Nama depan: ");
			String firstName = scan.next();
			System.out.println("Nama belakang: ");
			String lastName = scan.next();
			System.out.println("Total Penjualan: ");
			int totalSales = scan.nextInt();
			salesStaff[index] = new Salesperson(firstName, lastName, totalSales);
		}
		
		Sorting.insertionSort(salesStaff);
		System.out.println("\nRanking of Sales for the week\n");
		for (Salesperson s : salesStaff) {
			System.out.println(s);
		}
	}
}
