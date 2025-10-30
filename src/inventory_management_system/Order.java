package inventory_management_system;

public class Order {
	private int orderId;
    private Product[] orderedItems;
    private int itemCount;
    private Warehouse warehouse;
    private static int orderCounter = 1000;

    public Order(Warehouse warehouse, int maxItems) {
        this.warehouse = warehouse;
        this.orderedItems = new Product[maxItems];
        this.itemCount = 0;
        this.orderId = orderCounter++;
    }

    public void addProductToOrder(int productId, int qty) {
        Product stockItem = warehouse.findProductById(productId);
        if (stockItem == null) {
            System.out.println("Product ID " + productId + " not found.");
            return;
        }

        if (stockItem.getQuantity() >= qty) {
            stockItem.setQuantity(stockItem.getQuantity() - qty); // update warehouse stock
            Product orderCopy = new Product(stockItem.getId(), stockItem.getName(), stockItem.getPrice(), qty);
            orderedItems[itemCount++] = orderCopy;
            System.out.println("Added to order: " + qty + " x " + stockItem.getName());
        } else {
            System.out.println("Not enough stock for " + stockItem.getName());
        }
    }

    public void showOrderSummary() {
        double total = 0;
        System.out.println("\n--- Order #" + orderId + " Summary ---");
        for (int i = 0; i < itemCount; i++) {
            Product p = orderedItems[i];
            double itemTotal = p.getPrice() * p.getQuantity();
            total += itemTotal;
            System.out.println(p.getName() + " | Qty: " + p.getQuantity() + " | ₹" + itemTotal);
        }
        System.out.println("Total Amount: ₹" + total);
    }
}
