
public class SalariedEmployee extends Employee{
	private boolean bonusAdded; // ADD to UML Diagram.
	
	public SalariedEmployee (double d) {
		weeklyPay = d;
	}
	public void printWeeklyPay() {
		if (!bonusAdded) {
			System.out.printf("%-16s%-10s%-10s%-12s%-12s%-16s\n", name, "Salaried", "", "", "", weeklyPay);
		}
		else {
			System.out.printf("%-16s%-10s%-10s%-12s%-12s%-16s%-3s\n", name, "Salaried", "", "", "", weeklyPay, "*");
		}
		
	}
	
	public void addBonus() {
		Double bonus = 1.10;
		weeklyPay = weeklyPay * bonus;
	}
	
	public void setBonusAddedToTrue() {
		bonusAdded = true;
	}
	
	public boolean getBonusAddedToTrue() {
		return bonusAdded;
	}
}
