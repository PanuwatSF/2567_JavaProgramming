import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char space = ' ';
		int countSpaceber = 0;
		int countWord;
		System.out.print("Input the sentence : ");
		String sentence = input.next();
		
		while(!sentence.endsWith(".")) 
		{
			System.out.print("Input the sentence, again : ");
			sentence = input.next();
		}
		System.out.println();
		for(int i = 0;i < sentence.length();i++) 
		{
			char ch = sentence.charAt(i);
			if(ch == space) 
			{
				countSpaceber++;
				
			}
		}//ยังไม่เสร็จ

	}

}
