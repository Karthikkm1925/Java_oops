package banking_system_oops;

public abstract class Account {
	protected int accountNumber;
    protected double balance;
    protected Customer customer;

    public Account(int accountNumber, Customer customer, double balance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public abstract void withdraw(double amount);

    public void printStatement() {
        System.out.println("Account No: " + accountNumber + 
                           " | Customer: " + customer.getName() + 
                           " | Balance: " + balance);
    }
}
