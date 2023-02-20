import java.util.Scanner;

import javax.naming.AuthenticationException;

public class BankApplication{

    private String userName;
    private String passWord;
    private double balance = 42069.69;
    private double cash = 0;

    private boolean userAuthenticated = false;

    public void run(){
        Scanner scan= new Scanner(System.in);

        System.out.println("Welcome to the bank");
        System.out.println("+++++++++++++++++++");
        System.out.print("Enter Username: ");

        String userName = scan.nextLine();
        System.out.print("Enter Password: ");
        String passWord = scan.nextLine();

        AuthenticateUser(userName, passWord);

        if (userAuthenticated!=true){
            System.out.println("Invalid Username and Password.");
        }
        else{
            askUser(scan);
        }
    }

    private boolean AuthenticateUser(String username, String password){
        if (username.equals("neilb18")){
            if (password.equals("180607")){
                userAuthenticated = true;
            }
        }
        return userAuthenticated;
    }

    private void askUser(Scanner scan){
        
        System.out.println("Options: ");
        System.out.println("1. Deposit\n2. Withdrawl\n3. View Balance\n4. Log out");
        System.out.print("Choose an option: ");
        
        int option = scan.nextInt();

        calculateOptions(option,scan);

    }     
    
    private void calculateOptions(int option, Scanner scan){
        switch(option){
            case 1:
                deposit(scan);
                break;
            case 2:
                withdraw(scan);
                break;
            case 3:
                System.out.println("Your current balance is $"+balance);
                break;
            case 4:
                System.out.println("Thank you for using neilBanks!");
            default:
                System.out.println("Please enter a valid option.");
                askUser(scan);
        }
    }
    
    private double deposit(Scanner scan){
        System.out.print("\nEnter deposit amount: $");
        double deposit = scan.nextDouble();
        balance+=deposit;
        System.out.println("Your balance has been updated: $"+balance);
        return balance;
    }

    private double withdraw(Scanner scan){
        System.out.print("\nEnter withdraw amount: $");
        double withdraw= scan.nextDouble();
        balance-=withdraw;
        System.out.println("Your balance has been updated: $"+balance);
        return balance;        
    }

    
}
