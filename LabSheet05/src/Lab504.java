import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[5];
        double totalScores = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Input score of student " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            totalScores += scores[i];
        }

        double average = totalScores / 5;
        System.out.println();
        System.out.printf("Average of 5 students is %.2f%n", average);
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > average) {
                System.out.printf("> Student %d (%.2f)\n", i + 1, scores[i]);
            }
        }
        scanner.close();
    }
}