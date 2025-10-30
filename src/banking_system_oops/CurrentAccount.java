package banking_system_oops;

public class CurrentAccount extends Account {
    private static final double OVERDRAFT_LIMIT = -10000;

    public CurrentAccount(int accountNumber, Customer customer, double balance) {
        super(accountNumber, customer, balance);
    }

    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}
