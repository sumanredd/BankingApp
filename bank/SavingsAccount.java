package SimpleBankingApp.SimpleBankingApp.bank;

public class SavingsAccount extends Account implements BankOperations {

    public SavingsAccount(String accountHolder) {
        super(accountHolder);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs " + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: Rs " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
