import java.util.*;
public class Lab306 {

	public static void main(String[] args) {		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Message: ");
        String message = scanner.nextLine();
        
        String lowerCaseMessage = message.toLowerCase();        
        if (lowerCaseMessage.indexOf("nichi") >= 0) {            
            System.out.println("Nichi is a sentence");
        } else {
            System.out.println(message);
        }
        scanner.close();
    }
}