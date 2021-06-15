import java.util.Scanner;
import java.util.ArrayList;

public class employeeTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList <Employee> employeeList = new ArrayList<Employee>();
		
		boolean keepLooping = true;
		String menuOption;
		
		while (keepLooping) {
			System.out.print("Choose an option: \n");
			System.out.print("1. Add an employee to the list\n");
			System.out.print("2. Print the employee list\n");
			System.out.print("3. Reward a salaried employee\n");
			System.out.print("4. Exit Program\n");
			menuOption = in.nextLine();
			
			switch (menuOption) {
				case "1":
					System.out.print("Please enter employee name: ");
					String name = in.nextLine();
					System.out.print("What is the Employee type: 1. Salaried, 2. Hourly, or 3. Commissioned 4. Go Back\n");
					int employeeType = Integer.parseInt(in.nextLine());
					switch(employeeType) {
						case 1:
							System.out.println("What is your weekly salary?");
							Double salary = Double.parseDouble(in.nextLine());
							SalariedEmployee sEmployee = new SalariedEmployee(salary); //can't use same object employee
							sEmployee.setName(name);
							sEmployee.setType("Salaried");
							employeeList.add(sEmployee);
							System.out.println("Employee was added to program.\n");
							break;
						case 2: 
							System.out.println("What are your hours?");
							int hours = Integer.parseInt(in.nextLine());
							System.out.println("What is your hourly rate?");
							double rate = Double.parseDouble(in.nextLine());
							HourlyEmployee hEmployee = new HourlyEmployee(hours, rate); //can't use same object employee
							hEmployee.setName(name);
							hEmployee.setType("Hourly");
							employeeList.add(hEmployee);
							System.out.println("Employee was added to program.\n");
							break;
						case 3:
							System.out.println("How much did you make from sales?");
							double sales = Double.parseDouble(in.nextLine());
							CommissionedEmployee cEmployee = new CommissionedEmployee(sales); //can't use same object employee 
							cEmployee.setName(name);
							cEmployee.setType("Commissioned");
							employeeList.add(cEmployee);
							System.out.println("Employee was added to program.\n");
							break;
						case 4:
							System.out.println("Going back to menu.");
							break;
						default:
							System.out.println("Invalid Option. No employee was added.");
							break;
					} // end of inner switch
					break; //breaking menu option 1
				case "2":
					System.out.printf("%-16s%-10s%-10s%-12s%-12s%-16s\n", "Name", "Class", "Hours", "Sales", "Rate", "Weekly Pay");
					System.out.println("=======================================================================");
					System.out.println("TOTAL $"); //need to find a way to add all the weekly pay... go through each one in array and add it?
					for (int i = 0; i < employeeList.size(); i++) {
						employeeList.get(i).printWeeklyPay();
					}
					break; //breaking of menu option 2
				case "3":
					System.out.println("Which Salaried employee would you like to give the bonus to?");
					
					//TODO: print list + Let user choose employee to give bonus to
					break; //breaking of menu option 3
				case "4":
					System.out.println("Exiting program.....");
					System.exit(0);
					break; //breaking of menu option 4
				default:
					System.out.println("Invalid option please try again.");
					break;
			} //end of outer switch
		} // end of while
	} // end of main
}
