import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int minvalue = Integer.MIN_VALUE;
		while(true) 
		{
			System.out.print("Input number :");
			int number = input.nextInt();
			if (number < minvalue) 
			{
				System.out.println("BYE BYE");
				break;
				 
			}
			minvalue = number;
		}
		
		
	}

}
