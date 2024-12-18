import java.util.*;
public class Lab304 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Full Name: ");
        String fullName = input.nextLine();

        if (fullName.indexOf(" ") == -1) {
            System.out.println("Incorrect Name");
        } else {
            int spaceIndex = fullName.indexOf(" ");
            String firstName = fullName.substring(0, spaceIndex).toUpperCase();
            String lastName = fullName.substring(spaceIndex + 1).toLowerCase(); 
            
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
        }
        input.close();
    }
}