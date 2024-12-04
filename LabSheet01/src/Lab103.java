import javax.swing.*;
public class Lab103 {

	public static void main(String[] args) {
			String input = JOptionPane.showInputDialog("Input time Parking (minute):");
			int minutes = Integer.parseInt(input);
			
			 int hours = minutes / 60;
			 int min = minutes % 60;
			 double rateHour = 50.0;
			 double rateMinutes = 0.25;
			 double total = (hours * rateHour) + (min * rateMinutes);
			 
			 JOptionPane.showMessageDialog(null, "You parking " + hours + " Hour" + min + " Minute.\nAmount to be paid is " + total + " baht.");
	}

}
