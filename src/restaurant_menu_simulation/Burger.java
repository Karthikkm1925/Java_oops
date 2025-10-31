package restaurant_menu_simulation;

public class Burger extends FoodItem {
    public Burger() {
        super("Burger", 199.0, 10, new String[]{"Bun", "Patty", "Lettuce", "Cheese"});
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Burger 🍔...");
        System.out.println("Steps: Grilling patty, toasting bun, assembling layers.");
    }
}