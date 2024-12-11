import java.util.*;
public class SecurePasswordCheker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) 
		{
			System.out.println("Enter your password(type 'exit' to quit):");
			String password = input.next();
			if(password.equalsIgnoreCase("exit")) 
			{
				System.out.println("Program terminated.");
				break;
			}
			String errors = "";
			//check
			if(password.length() <8 ) {
				errors += "- Password must be at least 8 characters long.\n";
			}
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			boolean hasDigit = false;
			
			for(int i =0;i<password.length();i++) 
			{
				char ch = password.charAt(i);
				if (ch>='A'&&ch<='Z') 
				{
					hasUpperCase =true;
				}
				else if (ch>='a'&&ch<='z') 
				{
					hasLowerCase =true;
				}
				else if (ch>='0'&&ch<='9') 
				{
					hasDigit =true;
				}
			}
			if(!hasUpperCase) 
			{
				errors += "Password must cantain lease one uppercase letter(A-z).\n";
			}
			if(!hasLowerCase) 
			{
				errors += "Password must cantain lease one Lowercase letter(a-z).\n";
			}
			if(!hasDigit) 
			{
				errors += "Password must cantain lease one Digit(0-9).\n";
			}
			
			if(errors.isEmpty()) 
			{
				System.out.println("Your password is secure");
			}
			else 
			{
				System.out.println("Password validtion error.");
				System.out.println(errors);
			}
			
		}
		
		input.close();
	}
}
