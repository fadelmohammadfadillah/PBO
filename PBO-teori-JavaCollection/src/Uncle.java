import java.util.HashMap;

public class Uncle {
	String name;
	HashMap<Niece, String> unclePresents = new HashMap<Niece, String>();
	
	Uncle(String pName){
		this.name = pName;
	}
	public boolean addPresent(Niece recipient, String desc) {
		if (recipient.presentList.contains(desc)) {
			return false;
		}
		if(unclePresents.containsKey(recipient)) {
			System.out.println(this.name + " has already given gift to " + recipient.name);
		}
		recipient.presentList.add(desc);
		unclePresents.put(recipient, desc);
		return true;
	}
	public void listPresents() {
		System.out.println("List of present gifted by uncle " + this.name);
		System.out.println(unclePresents);
	}
}
