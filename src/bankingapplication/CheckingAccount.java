package bankingapplication;

import java.util.Scanner;

public class CheckingAccount extends Account {

    public void process() {
        System.out.println("Account Type: Checking Account");
        Scanner scan = new Scanner(System.in);
        int option;
        do {
            System.out.println("Balance: " + getBalance());

            System.out.println("Select the Option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");

            option = scan.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the amount to Deposit: ");
                    double depositedAmount = scan.nextDouble();
                    deposit(depositedAmount);
                    System.out.println("Deposited amount: " + getBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw: ");
                    double withdrawAmount = scan.nextDouble();
                    if (withdraw(withdrawAmount)) {
                        System.out.println("Balance: " + getBalance());
                        if (withdrawAmount > 50000) {
                            
                            double feePer10000 = 5;
                            double amountExceedingLimit = withdrawAmount - 50000;
                            double num_of_10000s = amountExceedingLimit / 10000;
                            double fee = Math.floor(num_of_10000s) * feePer10000;
                            balance -= fee;
                            System.out.println("Balance after deduction: " + getBalance());
                        }
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 3);
        scan.close();
    }
}

//package assignment;
//
//import java.util.Scanner;
//
//public class CheckingAccount extends Account {
//	public void deductFee() {
//        double feePer10000 = 5;
//        double num_of_10000s = balance / 10000;
//        double fee = Math.floor(num_of_10000s) * feePer10000;
//        balance -= fee;
//    }
//
//	public void process() {
//		System.out.println("Account Type: Checking Account");
//		Scanner scan = new Scanner(System.in);
//		int option;
//		do{
//			System.out.println("Balance: " + getBalance());
//
//			System.out.println("Select the Option:");
//			System.out.println("1.Deposit");
//			System.out.println("2.Withdraw");
//			System.out.println("3. Exit");
//
//			option = scan.nextInt();
//			switch (option) {
//			case 1:
//				System.out.println("Enter the amount to Deposit: ");
//				double depositedAmount = scan.nextDouble();
//				deposit(depositedAmount);
//				System.out.println("Deposited amount: " + getBalance());
//				break;
//			case 2:
//				System.out.println("Enter the amount to withdraw: ");
//				double withdrawAmount = scan.nextDouble();
//				if (withdraw(withdrawAmount)) {
//					System.out.println("Balance: " + getBalance());
//					if (withdrawAmount > 50000) {
//	                    deductFee();
//	                    System.out.println("Balance after deduction: " + getBalance());
//	                }
//	            } else {
//	                System.out.println("Insufficient balance.");
//	            
//				}
//				break;
//			case 3:
//				return;
//			default:
//				System.out.println("Invalid option.");
//			}
//		}while(option != 3);
//		scan.close();
//
//	}
//
//}
