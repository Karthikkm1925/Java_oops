package banking_system;

public class Account {
    private String ownerName;
    private long accountNumber;
    private double balance;

    // Static counter for auto account number generation
    private static long nextAccountNumber = 424221001;

    // Constructor with initial balance
    public Account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.accountNumber = nextAccountNumber++;
        this.balance = balance;
    }

    // Overloaded constructor (no initial balance)
    public Account(String ownerName) {
        this(ownerName, 0.0); // Calls main constructor
    }

    // Getters
    public String getOwnerName() { return ownerName; }
    public long getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(ownerName + " deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance for " + ownerName);
        } else {
            balance -= amount;
            System.out.println(ownerName + " withdrew ₹" + amount);
        }
    }

    // Display account info
    public void showAccountInfo() {
        System.out.println("[" + accountNumber + "] " + ownerName + " - Balance: ₹" + balance);
    }
}
