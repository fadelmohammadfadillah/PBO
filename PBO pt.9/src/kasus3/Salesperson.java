package kasus3;

public class Salesperson implements Comparable {
	private String firstName, lastName;
	private int totalSales;
	
	public Salesperson(String first, String last, int sales) {
		this.firstName = first;
		this.lastName = last;
		this.totalSales = sales;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public int getTotalSales() {
		return totalSales;
	}

	public String toString() {
		return this.lastName + ", " + this.firstName + ": \t" + this.totalSales;
	}
	
	public boolean equals(Object other) {
		return (this.lastName.equals(((Salesperson)other).getLastName()) && this.firstName.equals(((Salesperson)other).getFirstName()));
	}
	
	public int compareTo(Object other) {
		int result = this.totalSales - ((Salesperson)other).getTotalSales();
		if (result == 0) {
			String fullName = this.firstName + this.lastName;
			String objFullName = ((Salesperson)other).getFirstName() + ((Salesperson)other).getLastName();
			if (fullName.compareTo(objFullName) < 0) {
				return 1;
			}else {
				return -1;
			}
		}
		return result;
	}
}
