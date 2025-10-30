package inventory_management_system;

public class Warehouse {
	private Product[] products;
    private int count;

    public Warehouse(int capacity) {
        products = new Product[capacity];
        count = 0;
    }

    public void addProduct(Product p) {
        if (count < products.length) {
            products[count++] = p;
            System.out.println(p.getName() + " added to warehouse.");
        } else {
            System.out.println("Warehouse full! Cannot add more products.");
        }
    }

    public Product findProductById(int id) {
        for (int i = 0; i < count; i++) {
            if (products[i].getId() == id)
                return products[i];
        }
        return null;
    }

    public void showInventory() {
        System.out.println("\n--- Warehouse Inventory ---");
        for (int i = 0; i < count; i++) {
            products[i].display();
        }
    }
}
