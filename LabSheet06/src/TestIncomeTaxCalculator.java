
public class TestIncomeTaxCalculator {

	public static void main(String[] args) {
		IncomeTaxCalculator taxCalculator = new IncomeTaxCalculator();
		
		taxCalculator.setIncome(450000.00 );
		
		taxCalculator.displayTaxDetails();
	}

}
