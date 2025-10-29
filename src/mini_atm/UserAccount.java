package mini_atm;
public class UserAccount {
    private String name;
    private int pin;
    private double balance;
    private boolean isLocked; // locked after 3 failed attempts

    public UserAccount(String name, int pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
        this.isLocked = false;
    }

    public String getName() { return name; }
    public double getBalance() { return balance; }
    public boolean isLocked() { return isLocked; }

    public boolean validatePIN(int inputPIN) {
        return this.pin == inputPIN;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " successfully.");
        }
    }

    public void lockAccount() {
        isLocked = true;
    }
}

