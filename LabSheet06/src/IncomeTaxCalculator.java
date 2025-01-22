
public class IncomeTaxCalculator {
private double income;
	
	public void setIncome(double IncomePerYear) {
		income = IncomePerYear;
	}
	 public double calculateTax() {
	        double tax = 0;
	         if (income > 150000) {
	                if (income <= 300000) {
	                    tax = (income - 150000) * 0.05;
	                } else if (income <= 500000) {
	                    tax = ((300000 - 150000) * 0.05)+((income - 300000) * 0.10);
	                } else {
	                    tax = ((300000 - 150000) * 0.05) + ((500000 - 300000) * 0.10)+((income - 500000) * 0.20);
	                }
	            }
	        return tax;
	    }
	public void displayTaxDetails() {
		System.out.println("Income: " + income);
				System.out.println("Tax: " + calculateTax());
	}
}