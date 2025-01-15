import java.util.*;

public class Lab502 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length;i++){
            System.out.print("Input number "+(i+1)+" : " );
            nums[i] = scanner.nextInt();
            if (nums[i] <= 0 ){
                System.out.print("Input number "+(i+1)+" : " );
                nums[i] = scanner.nextInt();
            }
        }
        System.out.print("\nSummation of positive number is "+sumOfPos(nums));
    }
    public static int sumOfPos(int[] nums){
        int sum = 0;
        for (int _nums : nums){
            sum += _nums;
        }
        return sum;
    }
}