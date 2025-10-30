package banking_system_oops;

public class Bank {
	private String bankName;
    private Account[] accounts = new Account[5];
    private int accountCount = 0;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addAccount(Account account) {
        if (accountCount < accounts.length) {
            accounts[accountCount++] = account;
        } else {
            System.out.println("Cannot add more accounts — limit reached!");
        }
    }

    public void printAllAccounts() {
        System.out.println("\n=== " + bankName + " Account List ===");
        for (int i = 0; i < accountCount; i++) {
            accounts[i].printStatement();
        }
    }
}
