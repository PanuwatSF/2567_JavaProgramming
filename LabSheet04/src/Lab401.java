import javax.swing.*;
public class Lab401 {

	public static void main(String[] args) {
		inputEmail();
	}//end main Method
	public static void inputEmail() {
		String ans;
		String varEmail;
		do {
			varEmail = JOptionPane.showInputDialog("Input your e-mail: ");
			if(varEmail != null && !varEmail.isEmpty()) {
				checkEmailError(varEmail);
			}
			else {
				JOptionPane.showInternalMessageDialog(null, "E-mail cannot be empty!!");
			}
			
			ans = JOptionPane.showInputDialog("Do you to input your e-mail address[Y/y]: ");
		}while(ans != null && ans.equalsIgnoreCase("y"));		
	}//end inputEmail Method
	
	//checkEmailError Method
	public static void checkEmailError(String email) {
		while(email.startsWith("@")||email.contains(" ")) {
			email = JOptionPane.showInputDialog("Invaild e-mail. Input your e-mail agian: ");
		}
		email = email.toLowerCase();
		
		JOptionPane.showMessageDialog(null, 
				checkEmail(email)
				?"Your e-mail is " +email//return true
				:"Your e-mail is not a hotmail or gamil address");//return false
	}// end checkEmailError
	public static boolean checkEmail(String email) {
		/*if (email.endsWith("@gmail.com")|| email.endsWith("@hotmail.com")) {
			return true;
		}
		else {
			return false;
		}*/
	return email.endsWith("@gmail.com")|| email.endsWith("@hotmail.com");
	}//end checkEmail

}
