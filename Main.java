package SimpleBankingApp.SimpleBankingApp;

import java.util.Scanner;
import SimpleBankingApp.SimpleBankingApp.bank.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name to create an account: ");
        String name = scanner.nextLine();
        SavingsAccount account = new SavingsAccount(name);

        while (true) {
            System.out.println("\nWelcome, " + account.getAccountHolder());
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = scanner.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double with = scanner.nextDouble();
                    account.withdraw(with);
                    break;
                case 3:
                    System.out.println("Current Balance: Rs " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using SimpleBankingApp.");
                    return;
            }
        }
    }
}
// To RUN the Application
// javac SimpleBankingApp/SimpleBankingApp/bank/*.java SimpleBankingApp/SimpleBankingApp/Main.java -d out

// java -cp out SimpleBankingApp.SimpleBankingApp.Main
