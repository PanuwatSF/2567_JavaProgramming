import javax.swing.*;
public class ShoppingCart {

	public static void main(String[] args) {
		// call Method displayCartListAndTotal
		displayCartListAndTotal("Apple" ,10.5,"Banana",5.75,"Orenge",7.3);
		displayCartListAndTotal("Milk" ,20.0,"Bread",15.0);
		displayCartListAndTotal();

	}//end main Method
	public static void displayCartListAndTotal(Object... items) {
		if (items.length == 0) {
			System.out.println("No item in the cart.");
			return; 
		}
		System.out.println("Item in the cart");
		for(int i =0;i<items.length;i+=2) {
			String itemName = (String)items[i];
			double itemPrice = (double)items[i+1];
			
			JOptionPane.showMessageDialog(null, 
					"- "+itemName+
					": $"+itemPrice);
			
			System.out.printf("- %s: %$%.2f%n",itemName,itemPrice);
		}
		System.out.println();
	}// end displayCartListAndTotal Method

}