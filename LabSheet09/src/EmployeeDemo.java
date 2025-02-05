import java.util.*;
public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input employee id :");
		String empId = input.next();
		input.nextLine();
		System.out.print("Input employee name :");
		String empName = input.nextLine();
		System.out.print("Input emloyee salary :");
		double empSalary = input.nextDouble();
		System.out.print("Input emloyee sales :");
		double empSales = input.nextDouble();
		System.out.println();
		
		Sales emp1 = new Sales(empId, empName, empSalary, empSales);
		System.out.println(emp1.toSring());
		double totalSalary = emp1.getSalary()+emp1.getCommission();
		System.out.printf("total salary %,.2f baht",totalSalary);
	}

}
