import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Product[] productList = new Product[4];
		for(int i = 0; i<=productList.length-1;i++) {
			productList[i]= new Product();
			System.out.print("Input product Id	: ");
			productList[i].setId(input.nextLine());
			System.out.print("Input product Unit	: ");
			int unit = input.nextInt();
			input.nextLine();
			productList[i].setUnit(unit);
			System.out.print("Input product price	: ");
			double price = input.nextDouble();
			input.nextLine();
			productList[i].setPrice(price);
			System.out.println();
		}
		line();
		double sum = 0;
		for(Product product :productList) {
			System.out.printf("Product ID : %s, Total price = %,.2f baht.\n", product.getId(), product.calculate());
			sum += product.calculate();
		}
		line();
		
		 System.out.printf("Total price of all products is %,.2f baht.\n", sum);
		 input.close();
	}
	public static void line() {
		for(int i = 1; i<=60;i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}