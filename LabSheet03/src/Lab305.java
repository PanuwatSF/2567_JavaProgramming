import java.util.*;
public class Lab305 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String sentence = "";
		System.out.print("The sentence must end with full stop point : ");
        sentence = input.nextLine();
		 
		while (!sentence.endsWith(".")) {
	            System.out.print("The sentence must end with full stop point : ");
	            sentence = input.nextLine();
	            if (sentence.endsWith(".")) {
	                break;
		}
	  }
		System.out.println();
		 int start=0;
         for (int i = 0; i < sentence.length(); i++) {
             if (sentence.charAt(i) == ' ') {
                 System.out.println(sentence.substring(start, i));
                 start = i + 1;
             }
         }
         if (start < sentence.length()) {
             System.out.println(sentence.substring(start));
         }
	}

}