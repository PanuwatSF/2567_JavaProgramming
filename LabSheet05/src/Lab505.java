import java.util.*;

public class Lab505 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int[] nums = {78, 36, 58, 41, 25, 92, 75};
	        System.out.print("Input index of array : ");
	        int index = scanner.nextInt();
	        while (index < 0 || index >= nums.length){
	            System.out.print("Input index of array, again : ");
	            index = scanner.nextInt();
	        }
	        System.out.println("\nValue in current index is "+nums[index]);
	        nextData(index,nums);
	        scanner.close();
	    }
	    public static void nextData(int index , int[] nums) {
	        if (index < nums.length - 1) { System.out.println("Value in next    index is " + nums[index + 1]); }
	        else { System.out.println("Sorry, "+index+" is the last index in array."); }
	    }
	}