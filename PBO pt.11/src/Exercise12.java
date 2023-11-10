import java.util.*;

public class Exercise12 {
	public static void main(String args[]) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Singa");
		hash_map.put(2, "Gajah");
		hash_map.put(3, "Kucing");
		hash_map.put(4, "Anjing");
		hash_map.put(5, "Merpati");

		// checking collection view of the map
		System.out.println("Collection view is: " + hash_map.values());
	}
}
