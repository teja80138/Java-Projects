package Bank;

public class BankAccount {
	private double balance = 0;
	double with = 0;
	double depo = 0;
	String name = "Neil Bhattacharyya";
	String id = "180900192";
	
	public BankAccount(double balance) {
		set_Balance(balance);
	}
	public void set_Balance(double b) {
		if (b>=0) {
			this.balance = b;
		}
		else {
			System.out.print("Error occured. Please input a valid number\n");
		}
	}
	public double get_Balance() {
		return this.balance;
	}
	public void Withdraw(double amnt) {
		this.balance-=amnt;
		System.out.println("Your remaining balance is $"+balance);
		System.out.println("Amount withdrawed: $"+amnt);
	}
	public void Deposit(double amnt) {
		this.balance+=amnt;
		System.out.println("Your remaining balance is $"+balance);
		System.out.println("Amount deposited: $"+amnt);
	}
	
	
}
