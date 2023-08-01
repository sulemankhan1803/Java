package bankingapplication;

import java.util.Scanner;

public class SavingsAccount extends Account {
	public void calculateInterest() {
		double rateOfInterest = 0.07;
		double interest = balance * rateOfInterest;
		
		deposit(interest);
	}

	public void process() {
		System.out.println("Account Type: Savings Account");
		Scanner scan = new Scanner(System.in);
		int option;

		do{
			System.out.println("Balance: " + getBalance());

			System.out.println("Select the Option:");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3. Exit");
			option = scan.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter amount to Deposit: ");
				double depositAmount = scan.nextDouble();
				deposit(depositAmount);
				System.out.println("Deposited amount:" + getBalance());
				break;
			case 2:
				System.out.println("Enter amount to withdraw: ");
				double withdrawAmount = scan.nextDouble();

				if (withdraw(withdrawAmount)) {
					System.out.println("Balance: " + getBalance());
					calculateInterest();
					System.out.println("Account Balance after Intrest:" + getBalance());
				} else {
					System.out.println("Insufficient balance.");
				}
				break;
			case 3:

				break;
			default:
				System.out.println("Invalid option.");
			}
		}while(option != 3);
		scan.close();

	}
}

//		 if(option == 1) {
//			 System.out.println("Enetr amount to Deposit: ");
//			 double depositAmount = scan.nextDouble();
//			 deposit(depositAmount);
//			 System.out.println("Deposited amount:"+getBalance());
//		 }else if(option == 2) {
//			 System.out.println("Eneter amount to withdraw: ");
//			 double withdrawAmount = scan.nextDouble();
//			 
//			 if (withdraw(withdrawAmount)) {
//				 System.out.println("Balance: "+getBalance());
//				 calculateInterest();
//				 System.out.println("Account Balance after Intrest:"+getBalance());
//			 } else {
//	                System.out.println("Insufficient balance.");
//	                }
//		 }
//		 scan.close();
//	 }
//}
