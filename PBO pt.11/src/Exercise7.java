import java.util.TreeSet;
import java.util.Iterator;

public class Exercise7 {
	public static void main(String[] args) {
		// create an empty tree set
		TreeSet<String> t_set = new TreeSet<String>();
		// use add() method to add values in the tree set
		t_set.add("Ikan Mas");
		t_set.add("Cupang");
		t_set.add("Gurame");
		t_set.add("Koi");
		t_set.add("Lele");
		System.out.println("Original tree set: " + t_set);
		System.out.println("Size of the tree set: " + t_set.size());
	}
}
