
public class Employee {
	private String name;
	private int hourWorked;
	private double hourlyRate;
	
	//Method to set employee details
	public void setEmployeeDatails(String empName,int hour, double rate) {
		name = empName;
		hourWorked = hour;
		hourlyRate = rate;
		
	}
	//Method to calculate salary
	public double calculateSalary () {
		double salary = hourWorked * hourlyRate;
		if(hourWorked > 40) {
			double bonus = salary*0.10;
			salary+=bonus;
		}
		return salary;
	}
	//Method display employee details
	public void displayEmployeeDetails() {
		System.out.println("Name: "+ name
				+"\nHours Worked: "+ hourWorked
				+"\nHourly Rate: "+ hourlyRate
				+"\nTotal Salart: " + calculateSalary());
		
	}//end of class employee

}
