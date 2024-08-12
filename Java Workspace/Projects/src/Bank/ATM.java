package Bank;

import java.util.Scanner;

public class ATM {
	static String login = "out";
	static BankAccount user = new BankAccount(1000);
	public static void main(String[] args) {
		while (login.equals("out")) {
			Login();
		}

		while (login.equals("in")) {
			runATM();
		}
	}
	public static void Login() {
		
		Scanner scan = new Scanner(System.in);

		
		System.out.print("Please enter name: ");
		String name = scan.nextLine();
		System.out.print("Please enter id: ");
		String id = scan.nextLine();
		
		
		
		if (name.equals("Neil Bhattacharyya")) {
			if (id.equals("180900192")) {
				login = "in";
			}
			else {
				System.out.println("Please try again, your name or id was not correct.");
			}
		}
		else {
			System.out.println("\n\nPlease try again. \n");
		}
	}
	public static void runATM() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n\nWould you like to... \n\t1. Withdraw\n\t2.Check acccount balance\n\t3.Exit\n: " );
		
		String choice = scan.next();
		
		if (choice.equals("1")) {
			System.out.print("\n\nHow much would you like to withdraw... your account balance is $"+user.get_Balance()+"\n:");
			double with = scan.nextDouble();
			user.Withdraw(with);
		}
		else if (choice.equals("2")) {
			System.out.print("\n\nYour account balance is $"+user.get_Balance()+"\n\n");
		}
		else {
			System.out.println("\n\nThank you, and have a nice day!");
			login = "out";
		}
	}
	public static void checkAccount() {
		
	}
}
