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
					System.out.print("What is the Employee type: Salaried, Hourly, or Commissioned");
					String employeeType = in.nextLine();
					switch(employeeType) {
						case "Salaried":
							System.out.println("What is your weekly salary?");
							Double salary = Double.parseDouble(in.nextLine());
							SalariedEmployee Employee = new SalariedEmployee(salary); //can't use same object employee
							Employee.setName(name);
							Employee.setType(employeeType);
							employeeList.add(Employee);
							break;
						case "Hourly": 
							System.out.println("What are your hours?");
							int hours = Integer.parseInt(in.nextLine());
							System.out.println("What is your hourly rate?");
							double rate = Double.parseDouble(in.nextLine());
							HourlyEmployee employee = new HourlyEmployee(hours, rate); //can't use same object employee
							employee.setName(name);
							employee.setType(employeeType);
							employeeList.add(employee);
							break;
						case "Commissioned":
							System.out.println("How much did you make from sales?");
							double sales = Double.parseDouble(in.nextLine());
							CommissionedEmployee cEmployee = new CommissionedEmployee(sales); //can't use same object employee 
							cEmployee.setName(name);
							cEmployee.setType(employeeType);
							employeeList.add(cEmployee);
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
					System.exit(0);
					break; //breaking of menu option 4
				default:
					System.out.println("Invalid option please try again.");
					break;
			} //end of outer switch
		} // end of while
	} // end of main
}
