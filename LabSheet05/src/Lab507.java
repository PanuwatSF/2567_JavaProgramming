import javax.swing.*;
public class Lab507 {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		for(int i=0;i< numbers.length;i++) {
			numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number"+(i+1)));
		}
		showEven(numbers);
		showOdd(numbers);

	}
	public static void showEven(int[] nums) {
		String evenNumber="";
		for(int _nums : nums) {
		if(_nums % 2 ==0) {
			 evenNumber+= _nums+" ";
			}
		}
		JOptionPane.showMessageDialog(null,"List of even number: \n" +evenNumber);
	}
	public static void showOdd(int[] nums) {
		String oddNumber ="";
		for(int _nums : nums) {
		if(_nums % 2 !=0) {
			oddNumber+=_nums+" ";
			}
		}
		JOptionPane.showMessageDialog(null,"List of odd number: \n"+ oddNumber);
	}

}
