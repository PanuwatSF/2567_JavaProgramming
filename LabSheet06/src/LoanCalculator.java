
public class LoanCalculator {
	private String productName;
	private double price;
	private double interestRate;
	private int year;
	
	public void setLoanDetails(String Name, double productPrice, double rate, int years) {
		productName= Name;
		price=productPrice;
		interestRate = rate;
		year = years; 
	}
	public double calculateMonthlyPayment() {
		int n = year * 12;
		
	}

}
