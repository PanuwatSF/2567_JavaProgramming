import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare constants
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 final double BASE_SALARY = 1000.0;
		 
		 // Declare variables
		 int sales; // Input gross sales
		 double salary; // Salary to be computed
		 
		 //Scanner for input
		 Scanner input = new Scanner(System.in);
		 
		 //Loop for input and compulation
		 while(true) {
			 System.out.print("Enter qross sales foe the salesperson(or -1 to end) :");
			 sales = input.nextInt();
			 
			 //Check for sentinal value
			 if(sales==SENTINEL) {
				 break;
			 }
			 
			 //Compute salary
			 salary =  BASE_SALARY + (sales * COMMISSION_RATE);
			 
			 //Display the salary
			 System.out.printf("The salaesperson's salary is $%,.2f", salary);
			 System.out.println();
		 }
		 System.out.print("All salesperson's salary have been computed.");
		

	}

}
