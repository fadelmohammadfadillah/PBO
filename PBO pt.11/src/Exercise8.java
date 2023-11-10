import java.util.TreeSet;
import java.util.Iterator;

public class Exercise8 {
	public static void main(String[] args) {
		// Create a empty tree set
		TreeSet<String> t_set1 = new TreeSet<String>();
		// use add() method to add values in the tree set
		t_set1.add("Ikan Mas");
		t_set1.add("Cupang");
		t_set1.add("Gurame");
		t_set1.add("Koi");
		t_set1.add("Lele");
		System.out.println("Free Tree set: " + t_set1);

		TreeSet<String> t_set2 = new TreeSet<String>();
		t_set2.add("Ikan Mas");
		t_set2.add("Cupang");
		t_set2.add("Belut");
		t_set2.add("Koki");
		t_set2.add("Gurame");
		System.out.println("Second Tree set: " + t_set2);
		// comparison output in tree set
		TreeSet<String> result_set = new TreeSet<String>();
		for (String element : t_set1) {
			System.out.println(t_set2.contains(element) ? "Yes" : "No");
		}
	}
}
