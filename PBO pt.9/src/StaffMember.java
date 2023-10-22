
public abstract class StaffMember {
	protected String name; 
	protected String address; 
	protected String phone;
	
	public StaffMember (String eName, String eAddress, String ePhone) {
		//	Sets up a staff member using the specified information. public StaffMember (String eName, String eAddress, String ePhone)
		name = eName; 
		address = eAddress; 
		phone = ePhone;		
	}
	
	public String toString() {
		//	Returns a string including the basic employee information. public String tostring()
		String result = "Name:"	+ name + "\n";
				
		result = result + "Address: " + address + "\n"; result += "Phone: " + phone;
		
		return result;
		
	}
	//	Derived classes must define the pay method for each type of
	//	employee.
	public abstract double pay();
	 

}
