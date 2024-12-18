import javax.swing.*;
public class Lab303_1 {

public static void main(String[] args) {
		
		char space = ' ';
		int countSpaceber = 0;
		int countWord = 0;
		boolean isWord = false;
		String inputSentence = JOptionPane.showInputDialog(null, "Input a sentence :");
		while (!inputSentence.endsWith(".")) {
			inputSentence = JOptionPane.showInputDialog(null, "Input a sentence, agian :");
			if (inputSentence.endsWith(".")) {
                break;
			}
		}
		for(int i = 0;i < inputSentence.length();i++) 
		{
			char ch = inputSentence.charAt(i);
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

		JOptionPane.showMessageDialog(null, "This sentence has " + countSpaceber + " spacebar.\nThis sentence has " + countWord + " word.");
	}

}