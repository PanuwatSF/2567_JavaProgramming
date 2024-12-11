import javax.swing.*;
import java.text.*;
public class Lab203 {

	public static void main(String[] args) {
		 DecimalFormat frm = new DecimalFormat("#.0");
	        double weight = Double.parseDouble(
	        		JOptionPane.showInputDialog("Input Weight:"));
	        double height = Double.parseDouble(
	        		JOptionPane.showInputDialog("Input Height:"));
	        double meterHeight = height/100.0;
	        String status = "";
	        double bmi = weight / (meterHeight*meterHeight);
	        if (bmi<18.5) { status = "Under-weight"; }
	        else if (bmi>=18.5&&bmi<=24.9){ status = "Normal-weight"; }
	        else if (bmi>=25.0&&bmi<29.9) { status = "Over-weight"; }
	        else if (bmi>=33.0){ status = "Obesity"; }
	        else { status = "Error"; }
	        JOptionPane.showMessageDialog(null,
	                "BMI ="+frm.format(bmi)+"\nYou're "+status,
	                "BMI",JOptionPane.WARNING_MESSAGE);
		}
	}
