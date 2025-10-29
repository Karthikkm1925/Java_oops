package banking_system;

public class Bank {
 
	private Account[] accounts;
    private int accountCount;

    public Bank(int capacity) {
        accounts = new Account[capacity];
        accountCount = 0;
    }

    // Create a new account
    public void createAccount(String name, double initialBalance) {
        if (accountCount < accounts.length) {
            accounts[accountCount++] = new Account(name, initialBalance);
            System.out.println("Account created for " + name);
        } else {
            System.out.println("Bank full! Cannot create more accounts.");
        }
    }

    // Overloaded (no initial balance)
    public void createAccount(String name) {
        createAccount(name, 0.0);
    }

    // Find account by account number
    private Account findAccount(int accNo) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber() == accNo) {
                return accounts[i];
            }
        }
        return null;
    }

    // Deposit
    public void depositToAccount(int accNo, double amount) {
        Account acc = findAccount(accNo);
        if (acc != null) acc.deposit(amount);
        else System.out.println("Account not found!");
    }

    // Withdraw
    public void withdrawFromAccount(int accNo, double amount) {
        Account acc = findAccount(accNo);
        if (acc != null) acc.withdraw(amount);
        else System.out.println("Account not found!");
    }

    // Transfer
    public void transfer(int fromAcc, int toAcc, double amount) {
        Account src = findAccount(fromAcc);
        Account dest = findAccount(toAcc);

        if (src == null || dest == null) {
            System.out.println("One or both accounts not found!");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid transfer amount!");
            return;
        }

        if (src.getBalance() < amount) {
            System.out.println("Insufficient funds for transfer!");
            return;
        }

        src.withdraw(amount);
        dest.deposit(amount);
        System.out.println("Transferred ₹" + amount + " from " + src.getOwnerName() + " to " + dest.getOwnerName());
    }

    // Display all accounts
    public void showAllAccounts() {
        System.out.println("\n--- Bank Accounts ---");
        for (int i = 0; i < accountCount; i++) {
            accounts[i].showAccountInfo();
        }
    }
}
