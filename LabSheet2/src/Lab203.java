import javax.swing.*;
public class Lab203 {

	public static void main(String[] args) {
		double weight = Integer.parseInt(
				JOptionPane.showInputDialog("Input Weight"));
		double height = Integer.parseInt(
				JOptionPane.showInputDialog("Input Height"));
		double heightM = height /100;
		double bmi = weight /(heightM*heightM);
		if(bmi < 18.5) {
		JOptionPane.showMessageDialog(null,
				"BMI = "+ bmi+ "\nYou're ");
		}
	}

}
