import java.util.Scanner;

public class Lab503 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] nums = new int[7];
        int oddCount = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Input number " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
            if (nums[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("\nThere are " + oddCount + " odd number.");
        System.out.print("List of odd numbers: ");
        for (int _nums : nums) {
            if (_nums % 2 != 0) {
                System.out.print(_nums + " ");
            }
        }
        scanner.close();
    }
}