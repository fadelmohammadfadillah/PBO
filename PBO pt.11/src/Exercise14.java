import java.util.*;
import java.util.Map.Entry;

public class Exercise14 {
	public static void main(String args[]) {

		// Create a tree map
		TreeMap<Integer, String> tree_map1 = new TreeMap<Integer, String>();

		// Put elements to the map
		tree_map1.put(10, "Singa");
		tree_map1.put(20, "Gajah");
		tree_map1.put(40, "Badak");
		tree_map1.put(50, "Walrus");
		tree_map1.put(60, "Palkon");

		System.out.println("Orginal TreeMap content: " + tree_map1);
		System.out.println("Checking the entry for 10: ");
		System.out.println("Key(s): " + tree_map1.higherEntry(10));
		System.out.println("Checking the entry for 20: ");
		System.out.println("Key(s): " + tree_map1.higherEntry(20));
		System.out.println("Checking the entry for 70: ");
		System.out.println("Key(s): " + tree_map1.higherEntry(70));
	}
}
