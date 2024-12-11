import javax.swing.*;

public class lab302_1 {
	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail:").toLowerCase();	
		while(inputEmail.startsWith("@")||inputEmail.contains(" ")) 
		{
			inputEmail = JOptionPane.showInputDialog("Input your e-mail, again:");
		}
		if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("hotmail.com"))
		{
			JOptionPane.showMessageDialog(null, "Your e-mail is "+ inputEmail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not email or hotmail dot com");
			while(true) 
			{
				inputEmail = JOptionPane.showInputDialog("Input your e-mail, again:");
				if (inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("hotmail.com")) 
				{
					JOptionPane.showMessageDialog(null, "Your e-mail is "+ inputEmail);
					break;
				}
				
			}
		}
	}
}

/*อีกรูปแบบที่อาจารย์ทำ
while(true)
{
String inputEmail = JOptionPane.showInputDialog("Input your e-mail:").toLowerCase();
while(inputEmail.startsWith("@")||inputEmail.contains(" ")) 
		{
			inputEmail = JOptionPane.showInputDialog("Input your e-mail, again:");
		}	
}
if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("hotmail.com"))
		{
			JOptionPane.showMessageDialog(null, "Your e-mail is "+ inputEmail);
			break;
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not email or hotmail dot com");
			continue;
			}
	*/
