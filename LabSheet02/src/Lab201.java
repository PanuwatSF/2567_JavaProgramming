import javax.swing.*;
import java.text.*;
public class Lab201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int BUTFEET = 299;
		double discount;
		int isMember;
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		int numberofcustomer = Integer.parseInt(
				JOptionPane.showInputDialog("How many customber per bill?"));
		
		double totalPrice = numberofcustomer * BUTFEET;
		
		do {
		     isMember = JOptionPane.showConfirmDialog(null, 
				"Total Price is " + frm.format(totalPrice)+ "baht."+
				"\n Do you have a member card"); 
		}while(isMember==2);
		
		if(isMember==0) { // if(isMember==JOptionPane.YES_OPTION) 
			discount = totalPrice *0.90; //discount = totalPrice -(totalPrice*10/100)
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(discount)  +
					" baht.");	
		}
		else if(isMember==1) {
			JOptionPane.showMessageDialog(null,"Amount to be paid is "+ 
					frm.format(totalPrice)+"baht.");
	}

  }
	
}
