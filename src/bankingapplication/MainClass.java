package bankingapplication;

import java.util.*;


public class MainClass {
	public static void main(String args[]) {
		
		System.out.println("Choose account type: \n 1.SavingsAccount \n 2.CheckingAccount) ");
		Scanner scan = new Scanner(System.in);
		int accountType = scan.nextInt();
		

        if (accountType == 1) {
            SavingsAccount account = new SavingsAccount();
            account.process();
        } else if (accountType == 2) {
            CheckingAccount account = new CheckingAccount();
            account.process();
        } else {
            System.out.println("Invalid account type.");
        }
    }
}


