import javax.swing.*;
public class Lab402 {

	public static void main(String[] args) {
		while(true) {
		int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Input year:"));
		
		while(!checkYear(year)) {
			year = Integer.parseInt(JOptionPane.showInputDialog(null, "Input year:"));
		}
			if (isLeapYear(year)) {
				JOptionPane.showMessageDialog(null, year +" is Leap year.");
			}
			else {
				JOptionPane.showMessageDialog(null, year +" is NOT Leap year.");
			}
			break;
		}
	}//end main
	
	public static boolean checkYear(int  year) {
		return year >=1000 && year<=3000; //ตรวจสอบถ้าใช่ return ture กลับไป
	}//end checkYear
	public static boolean isLeapYear(int year) {
		if (year % 4 ==0) {
			if (year % 100 != 0||year % 400 ==0) {
				return true;
			}
		}
		return false;
	}//end isLeapYear
}