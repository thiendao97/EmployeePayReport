
public class SalariedEmployee extends Employee{
	
	public void printWeeklyPay() {
		System.out.printf("%-16s%-10s%-10s%-12s%-12s%-16s\n", name, "Salaried", "", "", "", weeklyPay);
	}
	public void addBonus() {
		Double bonus = .10;
	}
}
