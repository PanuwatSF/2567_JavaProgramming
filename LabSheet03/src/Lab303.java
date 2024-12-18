import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char space = ' ';
		int countSpaceber = 0;
		int countWord = 0;
		boolean isWord = false;
		String sentence = "";
		System.out.print("Input a sentence : ");
        sentence = input.nextLine();
		 
		while (!sentence.endsWith(".")) {
	            System.out.print("Input a sentence, agian : ");
	            sentence = input.nextLine();
	            if (sentence.endsWith(".")) {
	                break;
		}
	}
		System.out.println();
		for(int i = 0;i < sentence.length();i++) 
		{
			char ch = sentence.charAt(i);
			if(ch == space) 
			{
				countSpaceber++;
				isWord = false;
				
			}
			else if (ch != '.' && !isWord) {
					countWord++;
	                isWord = true;
			}
		}
		System.out.println("This sentence has " + countSpaceber + " spacebar.");
                            System.out.println("This sentence has " + countWord + " word.");
                            input.close();
	}

}