import java.util.Scanner;
import java.util.ArrayList;

public class employeeTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList <Employee> employeeList = new ArrayList<Employee>();
		
		boolean keepLooping = true;
		
		while (keepLooping) {
			System.out.print("Please enter employee name: ");
			String name = in.nextLine();
			
			System.out.print("What is the Employee type? \n 1. Salaried \n 2. Hourly \n 3. Commissioned \n");
			int employeeType = in.nextInt();
			switch(employeeType) {
				case 1:
					// TODO
					System.out.println("You are Salaried");
					keepLooping = false;
					break;
				case 2: // Hourly
					System.out.println("What are your hours?");
					int hours = in.nextInt();
					System.out.println("What is your hourly rate?");
					double rate = in.nextDouble();
					HourlyEmployee employee = new HourlyEmployee(hours, rate);
					employee.setName(name);
					employee.setType(employeeType);
					
					employeeList.add(employee);
					//keepLooping = false;
					break;
				case 3:
					//TODO
					System.out.println("You are Commissioned");
					//keepLooping = false;
					break;
				default:
					System.out.println("Finished Adding Employees.");
					keepLooping = true;
					break;
			} // end of switch

			while (keepLooping) {
				System.out.print("Do you want to continue adding employees? (Y/N)? ");
				String cont = in.nextLine();
				switch (cont) {
					case "y":
					case "Y":
						break;
					case "n":
					case "N":
						keepLooping = false;
						break;
					default:
						System.out.print("Invalid Entry. Please try again.");
						break;
				}
			}// end of cont... innerWhile
		} // end of while
	} // end of main
}
