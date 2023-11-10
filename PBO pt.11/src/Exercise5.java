import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		// Create a empty hash set
		HashSet<String> h_set = new HashSet();
		System.out.println("Is hash set empty? " + h_set.isEmpty());
		System.out.println("Filling hash set...");
		// use add() method to add values in the hash set
		h_set.add("Senin");
		h_set.add("Selasa");
		h_set.add("Rabu");
		h_set.add("Kamis");
		h_set.add("Jumat");
		h_set.add("Sabtu");
		h_set.add("Minggu");
		System.out.println("Hash Set: " + h_set);
		System.out.println("Checking the above array list is empty or not! " + h_set.isEmpty());
		System.out.println("Remove all the elements from a Hash Set: ");
		h_set.removeAll(h_set);
		System.out.println("Hash Set after removing all the elements " + h_set);
	}
}
