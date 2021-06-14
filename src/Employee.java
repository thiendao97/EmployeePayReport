import java.util.Scanner;

public class Employee {
	private String name;
	private int type;
	protected double weeklyPay;
	
	/*
	Employee () {
		name = "";
		type = null;
		weeklyPay = 0.0;
	}
	*/
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
}
