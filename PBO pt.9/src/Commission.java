
public class Commission extends Hourly{
	private double total_sales;
	private double commission_rate;
	
	public Commission (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double eComRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.commission_rate = eComRate;
	}
	
	public void addSales (double totalSales) {
		this.total_sales = totalSales;
	}
	
	@Override
	public double pay() {
		double payment = super.pay() + this.total_sales * this.commission_rate;
		this.total_sales = 0;
		return payment;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += "\nTotal Sales: " + this.total_sales;
		return result;
	}
}
