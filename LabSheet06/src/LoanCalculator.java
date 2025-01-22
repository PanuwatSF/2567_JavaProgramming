
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
		 double r = interestRate / 12 /100;
		 int n = year * 12;
		 return (price * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
	}
	
	public void displayLoanDetails() {
		double calculateMonthlyPayment = calculateMonthlyPayment();
		System.out.println("Product: "+ productName);
		System.out.println("Price: "+ price);
		System.out.println("Interest Rate: "+ interestRate +"%");
		System.out.println("Loan period: "+ year +"year");
		System.out.println("Monthly Payment: "+ String.format("%.2f", calculateMonthlyPayment));
	}
}