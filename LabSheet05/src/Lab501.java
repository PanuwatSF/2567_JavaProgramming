import java.util.*;
import javax.swing.*;

public class Lab501 {

	public static void main(String[] args) {
		//การค้นหาข้อมูล
		int[] idProduct = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		double[] priceProduct = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
		
		double itemPrice = 0.0;
		boolean validItem = false;
		
		int itemOder =Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
		
		for(int i =0;i<idProduct.length;i++) {
			if(itemOder == idProduct[i]) {
				itemPrice = priceProduct[i];
				validItem = true;
			}
		}//end for
		if(validItem) {
			JOptionPane.showMessageDialog(null, "Item "+itemOder+" is "+ itemPrice);
			System.out.print("Item "+itemOder+" is "+ itemPrice);
		}
		else {
			JOptionPane.showMessageDialog(null, "Invalid item" ,"error",JOptionPane.ERROR_MESSAGE);
			System.out.print("Invalid item");
		}
		
	}

}
