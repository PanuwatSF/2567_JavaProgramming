import java.util.*;

public class Lab204 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int valueX,valueY;
		System.out.print("Input value of X : ");
		valueX = input.nextInt();
		System.out.print("Input value of Y : ");
		valueY = input.nextInt();
		
		while (valueX>valueY) 
		{
			System.out.print("Input value of Y, again : ");
			valueY = input.nextInt();
			
		}
		System.out.println();
		for (int i =valueX+1;i<=valueY;i++)
		{
			System.out.println(valueX+" + "+ i+" = " + (valueX+i));
			valueX = valueX+i;
		}
	}

}