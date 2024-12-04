import javax.swing.*;
import java.util.*;
public class Withdrawal {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		//System.out.print(balance);
		int moneyWithdrawal = Integer.parseInt(
				JOptionPane.showInputDialog("Your balance "+ balance + "\nInput money to withdraw"));
		
		if (moneyWithdrawal > balance ) {
			JOptionPane.showMessageDialog(null, 
					"Error : Cannot witdraw more then balance",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (moneyWithdrawal > 50000 ) {
			JOptionPane.showMessageDialog(null, 
					"Error : Cannot witdraw more then 50,000",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (moneyWithdrawal % 100 !=0) 
		{
			JOptionPane.showMessageDialog(null, 
					"Error : Cannot witdraw "+(moneyWithdrawal%100)+" baht.",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else {
		JOptionPane.showMessageDialog(null,
				"You withdraw "+ moneyWithdrawal+" baht."
						+ "\n1,000 = "+ (moneyWithdrawal/1000)
						+"\n500 = "+ ((moneyWithdrawal%1000)/500)
						+"\n100 = "+ ((moneyWithdrawal%500)/100));
		}

	}

}
