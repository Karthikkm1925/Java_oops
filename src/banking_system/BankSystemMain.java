package banking_system;

public class BankSystemMain {
	public static void main(String[] args) {
        Bank bank = new Bank(10); // Max 10 accounts

        // Create accounts
        bank.createAccount("Karthik", 5000);
        bank.createAccount("Ananya", 2000);
        bank.createAccount("Ravi"); // no initial balance

        // Transactions
        bank.depositToAccount(1001, 1500);
        bank.withdrawFromAccount(1002, 500);
        bank.transfer(1001, 1003, 1000);

        // Display all accounts
        bank.showAllAccounts();
    }
}
