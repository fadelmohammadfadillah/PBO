import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		// Create a list and add some colors to the list
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Senin");
		list_Strings.add("Selasa");
		list_Strings.add("Rabu");
		list_Strings.add("Kamis");
		list_Strings.add("Jumat");
		list_Strings.add("Sabtu");
		list_Strings.add("Minggu");
		// Print the list
		for (String element : list_Strings) {
			System.out.println(element);
		}
	}
}
