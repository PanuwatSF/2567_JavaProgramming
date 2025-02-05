import java.util.*;

public class StockProduct {
	public static void main(String[] args) {
		Product[] productList = new Product[4];

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			System.out.print("Input Product ID : ");
			productList[i].setId(input.next());

			int unit;
			do {
				System.out.print("Input Product Unit : ");
				unit = input.nextInt();
			} while (unit <= 0);
			productList[i].setUnit(unit);

			double price;
			do {
				System.out.print("Input Product Price : ");
				price = input.nextDouble();
			} while (price <= 0);
			productList[i].setPrice(price);
		}

		double totalValue = 0;
		System.out.println("--------------------------------------------------------");
		for (Product p : productList) {
			double value = p.calculate();
			System.out.println("Product ID : " + p.getId() + ", Total Price: " + value + " baht.");
			totalValue += value ;
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("Total price of All Products is : " + totalValue +  " baht.");

		input.close();
	}
}
