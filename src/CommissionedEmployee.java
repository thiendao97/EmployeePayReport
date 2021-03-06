import java.text.DecimalFormat;

public class CommissionedEmployee extends Employee {
	Double Sales;
	
	CommissionedEmployee(Double s) {
		Sales = s;
		calculateCommissionedSales();
	}
	
	public Double getSales() {
		return Sales;
	}
	
	public void setSales(Double s) {
		Sales = s;
	}
	
	public void calculateCommissionedSales( ) {
		double commissionedRate = .20;
		weeklyPay = Sales * commissionedRate;
	}
	public void printWeeklyPay() {
		System.out.printf("%-24s%-16s%-16s%-12s%-12s%-16s\n", name, "Commissioned", "", "$" + String.format( "%.2f", Sales), "", "$" + String.format( "%.2f", weeklyPay));
	}
}
