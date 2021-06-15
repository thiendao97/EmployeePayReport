
public class HourlyEmployee extends Employee {
	int hours;
	double rate;
	
	HourlyEmployee(int h, double r) {
		hours = h;
		rate = r;
		calculateHourlyPay();
	}
	
	public int getHours() {
		return hours;
	}
	
	public void setHours(int h) {
		hours = h;
	}
	public double getRate() {
		return rate;
	}
	
	public void setRate(double r) {
		rate = r;
	}
	
	public void calculateHourlyPay() {
		if (hours > 40) {
			weeklyPay = 40 * rate;
			int overtimeHours = hours - 40;
			double overtimeRate = rate * 2;
			double overtimePay = overtimeHours * overtimeRate;
			weeklyPay += overtimePay;
		}
		else {
			weeklyPay = hours * rate;
		}
	}
	public void printWeeklyPay() {
		System.out.printf("%-16s%-10s%-10s%-12s%-12s%-16s\n", name, "Hourly", hours, "", rate, weeklyPay);
	}
}
