import java.util.*;
public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input product name : ");
		
		String productName = input.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = input.nextInt();
		System.out.print("Input product per unit : ");
		double productPrice = input.nextFloat();
		System.out.println("------------------------------------");
		double totalPrice = productUnit * productPrice;
		String frmTotalPrice = String.format("%,.2f",totalPrice);
		System.out.println("Total Price is "+ frmTotalPrice +" baht.");
		System.out.println("------------------------------------");
		System.out.print("How many dicount (%) : ");
		int discount = input.nextInt();
		System.out.println("------------------------------------");
		double totalDiscount = totalPrice * (discount/100.0);
		double amount = totalPrice - totalDiscount;
		String frmTotalDiscount = String.format("%,.2f",totalDiscount);
		String frmAmount = String.format("%,.2f",amount);
		System.out.println("Discount for "+discount+"%\t"+ frmTotalDiscount + " baht.");
		System.out.println("Amount to be paid \t"+ frmAmount+" bath.");
	}

}
