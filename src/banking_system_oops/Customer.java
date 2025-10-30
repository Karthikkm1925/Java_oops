package banking_system_oops;

public class Customer {
	private int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }
}
