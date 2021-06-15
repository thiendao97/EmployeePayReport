public class Employee {
	protected String name;
	protected String type;
	protected double weeklyPay;
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String t) {
		type = t;
	}
	
	public double getWeeklyPay() {
		return weeklyPay;
	}
	public void setWeeklyPay(double w) {
		weeklyPay = w;
	}
	
	public void printWeeklyPay() {
		// Child classes method will replace this method.
	}
	public void calculateAllWeeklyTotal() {
		//input how to calculate total
	}
}
