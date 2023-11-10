import java.util.*;

public class Exercise6 {
	public static void main(String[] args) {
		// Create a empty hash set
		HashSet<String> h_set = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set.add("Senin");
		h_set.add("Selasa");
		h_set.add("Rabu");
		h_set.add("Kamis");
		h_set.add("Jumat");
		h_set.add("Sabtu");
		h_set.add("Minggu");
		System.out.println("Original Hash Set: " + h_set);
		HashSet<String> new_h_set = new HashSet<String>();
		new_h_set = (HashSet) h_set.clone();
		System.out.println("Cloned Hash Set: " + new_h_set);
	}
}
