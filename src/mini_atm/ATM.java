package mini_atm;

import java.util.Scanner;

public class ATM {
    private UserAccount[] users;
    private int[] failedAttempts; // Track wrong PIN attempts per user

    public ATM(UserAccount[] users) {
        this.users = users;
        this.failedAttempts = new int[users.length];
    }

    private int findUserIndexByPIN(int pin) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].validatePIN(pin))
                return i;
        }
        return -1;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Welcome to Mini ATM =====");

        while (true) {
            System.out.print("\nEnter PIN (or 0 to exit): ");
            int enteredPIN = sc.nextInt();
            if (enteredPIN == 0) {
                System.out.println("Thank you for using ATM!");
                break;
            }

            int userIndex = findUserIndexByPIN(enteredPIN);

            if (userIndex == -1) {
                System.out.println("Invalid PIN!");
                continue;
            }

            UserAccount currentUser = users[userIndex];

            // Check if locked
            if (currentUser.isLocked()) {
                System.out.println("Account locked due to 3 failed attempts!");
                continue;
            }

            // Ask for confirmation (simulate PIN check)
            System.out.print("Confirm PIN again: ");
            int confirmPIN = sc.nextInt();

            if (!currentUser.validatePIN(confirmPIN)) {
                failedAttempts[userIndex]++;
                System.out.println("Incorrect PIN! Attempt " + failedAttempts[userIndex] + "/3");

                if (failedAttempts[userIndex] >= 3) {
                    currentUser.lockAccount();
                    System.out.println("Account locked!");
                }
                continue;
            }

            // Reset failed attempts on success
            failedAttempts[userIndex] = 0;

            System.out.println("\nWelcome, " + currentUser.getName() + "!");
            boolean exit = false;

            while (!exit) {
                System.out.println("\n1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Logout");
                System.out.print("Choose option: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your balance: ₹" + currentUser.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        currentUser.deposit(dep);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double wd = sc.nextDouble();
                        currentUser.withdraw(wd);
                        break;
                    case 4:
                        System.out.println("Logging out...");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option!");
                }
            }
        }
        sc.close();
    }
}

