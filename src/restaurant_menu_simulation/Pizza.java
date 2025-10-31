package restaurant_menu_simulation;

public  class Pizza extends FoodItem {
    public Pizza() {
        super("Pizza", 299.0, 15, new String[]{"Dough", "Cheese", "Tomato Sauce", "Toppings"});
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Pizza 🍕...");
        System.out.println("Steps: Rolling dough, adding sauce and cheese, baking in oven.");
    }
}
