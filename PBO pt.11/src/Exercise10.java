import java.util.*;

public class Exercise10 {
	public static void main(String[] args) {

		// Create Priority Queue
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		// use add() method to add values in the Priority Queue
		pq1.add("Singa");
		pq1.add("Gajah");
		pq1.add("Kucing");
		pq1.add("Anjing");
		System.out.println("Original Priority Queue: " + pq1);

		// Convert a linked list to array list
		List<String> array_list = new ArrayList<String>(pq1);
		System.out.println("Array containing all of the elements in the queue: " + array_list);

	}
}
