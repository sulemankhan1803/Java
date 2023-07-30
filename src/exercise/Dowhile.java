package exercise;
import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args) {
		String password = "pass";
		Scanner scan = new Scanner(System.in);
			
		
        do {
            System.out.print("Enter the password: ");
            String inputPassword = scan.nextLine();
            
            if (inputPassword.equals(password)) {
                System.out.println("Password is correct.");
                break; 
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        } while (true); 
        
        
        scan.close();
    }
}
