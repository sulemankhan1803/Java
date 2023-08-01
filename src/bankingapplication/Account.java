package bankingapplication;

public class Account {

	 double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance +=amount;
	}
	public boolean withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		}
		else {
			return false;
		}
	}
}




