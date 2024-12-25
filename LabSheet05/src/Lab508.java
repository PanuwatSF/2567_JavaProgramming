import javax.swing.*;
public class Lab508 {

	public static void main(String[] args) {
		int[]  nums = {25, 78, 41, 22, 36, 85,37};
		while(true) {
		int indexOfArray = Integer.parseInt(JOptionPane.showInputDialog(null, "Input index of array"));
		while(checkIndex(nums, indexOfArray)){
			indexOfArray = Integer.parseInt(JOptionPane.showInputDialog(null, "Input index of array, anign"));
			//ยังไม่เสร็จ
			}
		}
		
	}//end main Method
	public static boolean checkIndex(int[] nums,int index) {
		return false;
	}//end checkIndex Method
	public static int currentData(int[] nums,int index) {
		return 0;
	}//end currentData Method
	public static int prevData(int[] nums,int index) {
		return 0;
	}//end prevData Method
	public static int nextData(int[] nums,int index) {
		return 0;
	}//end nextData Method

}
