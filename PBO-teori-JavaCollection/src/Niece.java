import java.util.ArrayList;

public class Niece {
	String name;
	int day;
	int month;
	ArrayList<String> presentList = new ArrayList<String>();
	Niece (String pName, int pDay, int pMonth){
		this.name = pName;
		this.day = pDay;
		this.month = pMonth;
	}
	 public int clearPresent() {
		 int amount = presentList.size();
		 presentList.clear();
		 return amount;
	 }
	 
	 public void listPresents() {
		 System.out.println(presentList);
	 }
}
