
public class Product {
	private String name;
	private double price;
	private double vatRate;
	
	public void setProductDetails(String productName, double productPrice, double productVat){
		name = productName;
		price = productPrice;
		vatRate = productVat;
	}
	public double calculateTotalPrice() {
		return price +(price * (vatRate / 100));
	}
	public void displayProductDetails() {
		System.out.println("Product Name: " + name);
		System.out.println("Price (Bofore VAT): " + price);
		System.out.println("Price (After VaT): " + calculateTotalPrice());
		
	}
}
