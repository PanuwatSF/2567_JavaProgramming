import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Product[] productList = new Product[4];
		for(int i = 1; i<=productList.length;i++) {
			productList[i]= new Product();
			System.out.print("Input product Id	: ");
			productList[i].setId(input.nextLine());
			System.out.print("Input product Unit	: ");
			int unit = input.nextInt();
			input.nextLine();
			productList[i].setUnit(unit);
			System.out.print("Input product price	:");
			double price = input.nextDouble();
			input.nextLine();
			productList[i].setPrice(price);
			System.out.println();
			
		}
		line();
		double sum = 0;
		for(Product product :productList) {
			System.out.print("Product ID "+product.getId()+", Total price = " + product.calulate()+" baht.");
			sum += product.calulate();
		}
		System.out.println("Total price of all product is "+ sum + "baht.");

	}
	public static void line() {
		for(int i = 1; i<=60;i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
