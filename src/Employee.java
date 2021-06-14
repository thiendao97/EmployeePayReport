public class Employee {
	protected String name;
	protected int type;
	protected double weeklyPay;
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int t) {
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
}
