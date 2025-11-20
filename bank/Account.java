package SimpleBankingApp.SimpleBankingApp.bank;

public class Account {
    protected String accountHolder;
    protected double balance;

    public Account(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
