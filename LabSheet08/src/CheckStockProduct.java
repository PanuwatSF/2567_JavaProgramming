import java.util.*;
public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many product list in stock : ");
		int numProduct = input.nextInt();
		input.nextLine();

		Product[] productList = new Product[numProduct];
		for(int i = 0; i<=productList.length-1;i++) {
			productList[i]= new Product();
			System.out.print("Input product Id	: ");
			productList[i].setId(input.nextLine());
			System.out.print("Input product Unit	: ");
			int unit = input.nextInt();
			input.nextLine();
			productList[i].setUnit(unit);
			System.out.println();
		}
		line();
		System.out.println("List of product in 'LOW' status.");
		line();
		for(Product product :productList) {
			if(product.getUnit() < 5) {
				System.out.println(">>> " + product.getId() + " has "+product.getUnit()+" units");
			}
		}
		line();
		System.out.println("List of product in 'NORMAL' status.");
		line();
		for(Product product :productList) {
			if(product.getUnit() >= 5 && product.getUnit()<=50) {
				System.out.println(">>> " + product.getId() + " has "+product.getUnit()+" units");
			}	
		}
		line();
		System.out.println("List of product in 'HIGH' status.");
		line();
		for(Product product :productList) {
			if(product.getUnit() > 50 ) {
				System.out.println(">>> " + product.getId() + " has "+product.getUnit()+" units");
			}	
		}
		input.close();

	}
	public static void line() {
		for(int i = 1; i<=60;i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
