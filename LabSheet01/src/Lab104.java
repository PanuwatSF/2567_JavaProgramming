import javax.swing.*;
public class Lab104 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to the payroll application");
		 String employeeName = JOptionPane.showInputDialog("Enter employee name");
		 
		 String inputHours = JOptionPane.showInputDialog("Enter total hours for this employee.");
		 double hoursWorked = Double.parseDouble(inputHours);
		 double hourlyWage = 7.5;
		 double grossEarnings = hoursWorked * hourlyWage;
		 double taxRate = 0.15;
		 double tax = grossEarnings * taxRate;
		 double netEarnings = grossEarnings - tax;
		 String output = String.format(
		            "Employee name: %s\n" +
		            "Hours worked: %.1f\n" +
		            "Hourly wage: $%.1f\n" +
		            "Gross earnings: $%.2f\n" +
		            "Tax rate: %.2f\n" +
		            "Tax: $%.1f\n" +
		            "Net earnings: $%.1f",
		            employeeName, hoursWorked, hourlyWage, grossEarnings, taxRate, tax, netEarnings
		        );
		 
		        JOptionPane.showMessageDialog(null, output);
	}

}
