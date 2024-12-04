import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 // Declare constants
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 final double BASE_SALARY=1000.0;
		 // Declare variables
		 int sales; // Input gross sales
		 double salary; // Salary to be computed
		
		 while (true) 
		 {
			 System.out.print("Enter qross sales foe the salesperson(or -1 to end) : ");
			 sales = input.nextInt();
			 
			 //check for sentinel value
			 if(sales == SENTINEL) {
				 break;
				 }
			 salary =BASE_SALARY +(sales * COMMISSION_RATE);
			 System.out.printf("The saleperson's salary is : $%,.2f%n%n",salary);
		 }
		 System.out.print("bye");
		input.close();
	}

}
