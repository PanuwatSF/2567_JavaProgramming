import java.util.*;
import java.text.*;
public class JavaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//จัดรูปแบบ
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("Input product name: ");
		String productName = input.nextLine();
		System.out.print("Input product unit: ");
		int productUnit = input.nextInt();
		System.out.print("Input product per unit: ");
		float productPrice = input.nextFloat();
		System.out.println();
		float totalPriceofProduct = productUnit * productPrice;
		System.out.println("Total price is "+frm.format(totalPriceofProduct)+"bath.");
		//ภาษี
		//สูตรลัด float totalwithVat = totalPriceofProduct +1.07f;
		float totalwithVat = totalPriceofProduct +(totalPriceofProduct *7/100);
		System.out.println("Add VAT 7% is "+frm.format(totalwithVat)+"bath.");
		System.out.println();
		//String Format of pintf
		String frmtotalwithVat = String.format("%,.2f",totalwithVat);
		System.out.println("useing String Format");
		System.out.println("Add VAT 7% is "+ frmtotalwithVat +"bath.");
		System.out.println();
		System.out.println("useing pintf");
		System.out.printf("Add VAT 7%% is %,.2f", totalwithVat);

		input.close();
	}

}
