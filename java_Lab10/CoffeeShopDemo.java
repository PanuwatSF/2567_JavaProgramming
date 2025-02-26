package java_Lab10;

import javax.swing.*;
public class CoffeeShopDemo {

	public static void main(String[] args) {
		Barista staff1 = new Barista("Leon", 'M');
        Barista staff2 = new Barista("Claire", 'F');

        int drinkType = Integer.parseInt(JOptionPane.showInputDialog("Enter Drink type\n1 : Hot\n2 : Cold"));
        int coffeeType = Integer.parseInt(JOptionPane.showInputDialog("Enter Coffee type\n1 : Americano\n2 : Espresso\n3 : Cappuccino"));
        char sizeCoffee = JOptionPane.showInputDialog("Enter Coffee size\nS : Short\nT : Tall\nG : Grande\nV : Venti").toUpperCase().charAt(0);
        int baristaChoice = Integer.parseInt(JOptionPane.showInputDialog("Choose Barista\n1 : Leon\n2 : Claire"));
        
        Barista selectedBarista;
        if (baristaChoice == 1) {
            selectedBarista = staff1;
        } else {
            selectedBarista = staff2;
        }
        
        Coffee order = new Coffee(drinkType, sizeCoffee, coffeeType, selectedBarista);

        JOptionPane.showMessageDialog(null,order.toString()+
        		"\nBarista: "+selectedBarista.getName()+" ("+selectedBarista.getGender()+")");
	}

}