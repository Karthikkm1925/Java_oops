package restaurant_menu_simulation;

public class Pasta extends FoodItem {
    public Pasta() {
        super("Pasta", 249.0, 12, new String[]{"Pasta", "Cream Sauce", "Cheese", "Vegetables"});
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Pasta 🍝...");
        System.out.println("Steps: Boiling pasta, making sauce, mixing and serving hot.");
    }
}
