package mini_atm;
public class MiniATMMain {
    public static void main(String[] args) {
        // Initialize 5 users
        UserAccount[] users = new UserAccount[5];
        users[0] = new UserAccount("Karthik", 1111, 5000);
        users[1] = new UserAccount("Ananya", 2222, 3000);
        users[2] = new UserAccount("Ravi", 3333, 7000);
        users[3] = new UserAccount("Priya", 4444, 10000);
        users[4] = new UserAccount("Manoj", 5555, 2000);

        // Create ATM instance and start it
        ATM atm = new ATM(users);
        atm.start();
    }
}

