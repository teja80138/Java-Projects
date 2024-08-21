package Bank;

import java.util.Scanner;

public class ATM {
    static String loginStatus = "out";
    static BankAccount user = new BankAccount(1000);
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            if (loginStatus.equals("out")) {
                login();
            } else if (loginStatus.equals("in")) {
                runATM();
            } else {
                System.out.println("Invalid login status.");
                break;
            }
        }
    }

    public static void login() {
        System.out.print("Please enter name: ");
        String name = scan.nextLine();
        System.out.print("Please enter ID: ");
        String id = scan.nextLine();

        if (name.equals("Neil Bhattacharyya") && id.equals("180900192")) {
            loginStatus = "in";
        } else {
            System.out.println("Invalid name or ID. Please try again.\n");
        }
    }

    public static void runATM() {
        System.out.print("\nWould you like to... \n\t1. Withdraw\n\t2. Check account balance\n\t3. Exit\n: ");
        String choice = scan.next();

        switch (choice) {
            case "1":
                withdraw();
                break;
            case "2":
                checkAccount();
                break;
            case "3":
                System.out.println("Thank you, and have a nice day!");
                loginStatus = "out";
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void withdraw() {
        System.out.print("How much would you like to withdraw? Your account balance is $" + user.get_Balance() + "\n: ");
        double amount = scan.nextDouble();

        if (amount > 0 && amount <= user.get_Balance()) {
            user.Withdraw(amount);
            System.out.println("You have successfully withdrawn $" + amount + ". Your new balance is $" + user.get_Balance() + "\n");
        } else {
            System.out.println("Invalid amount. Please try again.");
        }
    }

    public static void checkAccount() {
        System.out.println("Your account balance is $" + user.get_Balance() + "\n");
    }
}
