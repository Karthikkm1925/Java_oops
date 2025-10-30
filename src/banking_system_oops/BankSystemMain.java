package banking_system_oops;

public class BankSystemMain {
	public static void main(String[] args) {
        Bank bank = new Bank("Smart Bank");

        Customer c1 = new Customer(1, "Karthik");
        Customer c2 = new Customer(2, "Meena");

        SavingsAccount s1 = new SavingsAccount(1001, c1, 2000);
        CurrentAccount ca1 = new CurrentAccount(2001, c2, 5000);

        bank.addAccount(s1);
        bank.addAccount(ca1);

        s1.deposit(1000);
        s1.withdraw(2300); // will fail due to min balance rule

        ca1.withdraw(8000); // works — overdraft allowed

        bank.printAllAccounts();
    }
}
