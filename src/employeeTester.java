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
					System.out.print("What is the Employee type? \n 1. Salaried \n 2. Hourly \n 3. Commissioned \n");
					int employeeType = Integer.parseInt(in.nextLine());
					switch(employeeType) {
						case 1:
							// TODO
							System.out.println("You are Salaried");
							break;
						case 2: // Hourly
							System.out.println("What are your hours?");
							int hours = Integer.parseInt(in.nextLine());
							System.out.println("What is your hourly rate?");
							double rate = Double.parseDouble(in.nextLine());
							HourlyEmployee employee = new HourlyEmployee(hours, rate);
							employee.setName(name);
							employee.setType(employeeType);
							employeeList.add(employee);
							break;
						case 3:
							//TODO
							System.out.println("You are Commissioned");
							break;
						default:
							System.out.println("Invalid Option. No employee was added.");
							break;
					} // end of inner switch
					break; //breaking menu option 1
				case "2":
					//TODO: Fix Formatting.... That's it.
					System.out.println("Name\t\t\t\tClass\t\tHours\t\tSales\t\tRate\t\tWeeklyPay");
					System.out.println("=========================================================================================================");
					for (int i = 0; i < employeeList.size(); i++) {
						int type = employeeList.get(i).getType();
						employeeList.get(i).printWeeklyPay();
					}
					
					break; //breaking of menu option 2
				case "3":
					
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
