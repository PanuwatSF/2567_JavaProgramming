import javax.swing.*;
public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//รัย
		String productName = JOptionPane.showInputDialog("Input Product Name: ");
		String strProductUnit = JOptionPane.showInputDialog("Input product unit: ");
		int productUnit = Integer.parseInt(strProductUnit);
		//รับและแปลง
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per Unint"));
		double totalPriceofProduct = productUnit * productPrice;
		String frmTotalPriceofProduct = String.format("%,.2f",totalPriceofProduct);
		double totalwithVat = totalPriceofProduct +(totalPriceofProduct *7/100);
		String frmtotalwithVat = String.format("%,.2f",totalwithVat);
		JOptionPane.showMessageDialog(null, "Total Price is "+frmTotalPriceofProduct+"baht.\nAdd VAT 7% is "+ frmtotalwithVat +"bath.");	
	}


}
