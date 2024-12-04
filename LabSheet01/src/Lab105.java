import javax.swing.*;
public class Lab105 {

	public static void main(String[] args) {
		double taxRate = 0.0625;
		String cdId = JOptionPane.showInputDialog("This program calculates the total cost of a CD order\nPlease enter the ID of the CD");
		String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		String inputPrice = JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars");
		double cdPrice = Double.parseDouble(inputPrice);
		String inputQuantity = JOptionPane.showInputDialog("Please enter the quantity to be purchased");
        int quantity = Integer.parseInt(inputQuantity);
        
        double cdSubtotal = cdPrice * quantity;
        double tax = cdSubtotal * taxRate;
        double total = cdSubtotal + tax;

        String output = String.format(
                "Summary of the transaction:\n" +
                "CD ID: %s\n" +
                "CD Title: %s\n" +
                "CD Unit Price: $%.2f\n" +
                "CD Quantity: %d\n\n" +
                "Subtotal: $%.2f\n" +
                "Tax rate: %.2f%%\n" +
                "Total: $%.2f\n\n" +
                "End of Program",
                cdId, cdTitle, cdPrice, quantity, cdSubtotal, taxRate * 100, total
            );
        
            JOptionPane.showMessageDialog(null, output);
	}

}
