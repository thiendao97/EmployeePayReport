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
					boolean printAsterisk = false;
					System.out.printf("%-24s%-16s%-16s%-12s%-12s%-16s\n", "Name", "Class", "Hours", "Sales", "Rate", "Weekly Pay");
					System.out.println("==========================================================================================");
					for (int i = 0; i < employeeList.size(); i++) {
						employeeList.get(i).printWeeklyPay();
					}
					System.out.println("==========================================================================================");
					System.out.print("TOTAL $"); 
			
					Double totalPay = 0.0;
					for (int i = 0;  i < employeeList.size(); i++) {
						 totalPay = totalPay + employeeList.get(i).getWeeklyPay();
					}
					System.out.println(Math.round(totalPay));
					
					for (int i = 0; i < employeeList.size(); i++) {
						if (employeeList.get(i) instanceof SalariedEmployee) {
							if (((SalariedEmployee) employeeList.get(i)).getBonusAddedToTrue() == true) {
								System.out.println("*A 10% bonus is awarded\n");
							}
						}
					}	
					
					
					break; //breaking of menu option 2
				case "3":
					System.out.printf("%-7s%-24s%-16s%-16s%-12s%-12s%-16s\n", "Index", "Name", "Class", "Hours", "Sales", "Rate", "Weekly Pay");
					System.out.println("=================================================================================================");
					for (int i = 0; i < employeeList.size(); i++) {
						if (employeeList.get(i) instanceof SalariedEmployee) { // checks if the Employee in the array list is Salaried Employee
							System.out.printf("%-7s", i); // spacing for index
							employeeList.get(i).printWeeklyPay();
						}
					}	
					System.out.println("Which Salaried employee would you like to give the bonus to? (Choose a number from the index)");
					int bonusAnswer = Integer.parseInt(in.nextLine());
					if (((SalariedEmployee) employeeList.get(bonusAnswer)).getBonusAddedToTrue() == false) {
						((SalariedEmployee) employeeList.get(bonusAnswer)).addBonus(); // First convert Employee in the ArrayList to a SalariedEmployee. We do this so we can call addBonus(). Which only SalariedEmployee can call.
						((SalariedEmployee) employeeList.get(bonusAnswer)).setBonusAddedToTrue();
						System.out.println("Bonus was added for Employee at index " + bonusAnswer + " to program.\n");
					}
					System.out.println("This person already has a bonus added. Please choose another.\n");
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
