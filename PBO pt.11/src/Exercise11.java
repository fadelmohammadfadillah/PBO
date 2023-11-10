import java.util.*;

public class Exercise11 {
	public static void main(String args[]) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(1, "Singa");
		hash_map.put(2, "Gajah");
		hash_map.put(3, "Kucing");
		hash_map.put(4, "Anjing");
		hash_map.put(5, "Merpati");

		// get keyset value from map
		Set keyset = hash_map.keySet();

		// check key set values
		System.out.println("Key set values are: " + keyset);
	}
}
