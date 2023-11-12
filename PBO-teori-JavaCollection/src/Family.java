import java.util.TreeMap;

public class Family {
	private static TreeMap<String, Uncle> uncleList = new TreeMap<String, Uncle>();
	private static TreeMap<Integer, Niece> nieceList = new TreeMap<Integer, Niece>();
	
	
	public boolean addNiece(String name, int day, int month) {
		for (Niece objNiece : nieceList.values()) {
			if (objNiece.name.equals(name)) {
				return false;
			}
		}
		Niece objNiece = new Niece(name, day, month);
		nieceList.put(month, objNiece);
		return true;
	}
	
	public boolean addUncle(String name) {
		if(uncleList.containsKey(name)) {
			return false;
		}
		Uncle objUncle = new Uncle(name);
		uncleList.put(name, objUncle);
		return true;
	}
	public Niece findNiece (String name) {
		for (Niece objNiece: nieceList.values()) {
			if (objNiece.name.equals(name)) {
				return objNiece;
			}
		}
		return null;
	}
	public Uncle findUncle (String name) {
		if(uncleList.containsKey(name)) {
			return uncleList.get(name);
		}
		return null;
	}
	
	public void listNieces() {
		String printString = "[";
		for (Niece objNiece : nieceList.values()) {
			printString += objNiece.name + ", ";
		}
		printString += "]";
		System.out.println(printString);
	}
	
	public void listUncles() {
		System.out.println(this.uncleList.keySet());
	}
}
