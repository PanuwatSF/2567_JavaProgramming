import javax.swing.*;
import java.util.*;
public class Icecream {

	public static void main(String[] args) {
		
		final int VANILLA = 10;
        final int CHOCOLATE = 15;
        final int TOPPING = 5;
        int numberofIceCream;
        String vani = "Vanilla";
        String choco = "Chocolate";
        while (true){
            numberofIceCream = Integer.parseInt(JOptionPane.showInputDialog("[1] Vanilla Flavor 10 B." +
                                                                        "\n[2] Chocolate Flavor 15 B." +
                                                                        "\nPress number to choose flavor:"));
            if (numberofIceCream == 1 || numberofIceCream == 2) { break; }
            JOptionPane.showMessageDialog(null,"ERROR: Wrong choice!" +
                                                                    "\nTry again...","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        int topping = JOptionPane.showConfirmDialog(null,"Do you want to add topping?","Topping",JOptionPane.YES_NO_OPTION);
        int iceCreamtotal = (numberofIceCream == 1) ? VANILLA : CHOCOLATE;
        String iceCresmSr = (numberofIceCream == 1) ? vani : choco;
        int iceTopping = (topping == JOptionPane.YES_OPTION) ? iceCreamtotal+TOPPING : iceCreamtotal;
        JOptionPane.showMessageDialog(null,"You choose "+iceCresmSr+" Flavor " +
                                                                "\nAnd no topping" +
                                                                "\nTotal price = "+iceTopping+" baht.");
	}

}