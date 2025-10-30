package banking_system_oops;

public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(int accountNumber, Customer customer, double balance) {
        super(accountNumber, customer, balance);
    }

    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Cannot withdraw! Minimum balance must be ₹" + MIN_BALANCE);
        }
    }
}
