package inventory_management_system;

public class InventoryMain {
	public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(5);

        // Add products
        warehouse.addProduct(new Product(1, "Laptop", 60000, 10));
        warehouse.addProduct(new Product(2, "Mouse", 800, 50));
        warehouse.addProduct(new Product(3, "Keyboard", 1500, 20));

        warehouse.showInventory();

        // Create an order
        Order order1 = new Order(warehouse, 3);
        order1.addProductToOrder(1, 2); // 2 Laptops
        order1.addProductToOrder(2, 5); // 5 Mice
        order1.addProductToOrder(3, 1); // 1 Keyboard

        order1.showOrderSummary();

        warehouse.showInventory(); // Check stock after order
    }
}
