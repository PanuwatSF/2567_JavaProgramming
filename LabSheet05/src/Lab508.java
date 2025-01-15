import javax.swing.*;

public class Lab508 {
	public static void main(String[] args) {
		int[] nums = {25, 78, 41, 22, 36, 85, 37};
		 int index = Integer.parseInt(JOptionPane.showInputDialog("Input inedx of array:"));
	        while (!checkIndex(nums, index)) {
	            index = Integer.getInteger(JOptionPane.showInputDialog("Input inedx of array, again:"));
	        }
	        String message = currentData(nums,index)+"\n"+prevData(nums,index)+"\n"+nextData(nums,index);

	        JOptionPane.showMessageDialog(null, message);
			}
		
	//end main Method
	 public static boolean checkIndex(int[] nums, int index) {
	        return (index >= 0 && index < nums.length) ? true : false;
	}//end checkIndex Method
	 public static String currentData(int[] nums, int index){
	        return "Current data, nums["+index+"] is "+nums[index];
	}//end currentData Method
	 public static String prevData(int[] nums, int index){
	        return (index > 0) ? "Previous data, nums[" + (index - 1) + "] is " + nums[index - 1] : "No previous data";
	}//end prevData Method
	 public static String nextData(int[] nums, int index){
	        return (index < nums.length - 1) ? "Next data, nums[" + (index + 1) + "] is " + nums[index + 1] : "No next data";
	}//end nextData Method
}