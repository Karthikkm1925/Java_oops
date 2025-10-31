package restaurant_menu_simulation;

public abstract class FoodItem {
    private String name;
    private double price;           // Encapsulation
    private int preparationTime;    // Encapsulation
    private String[] ingredients;

    public FoodItem(String name, double price, int preparationTime, String[] ingredients) {
        this.name = name;
        this.price = price;
        this.preparationTime = preparationTime;
        this.ingredients = ingredients;
    }

    // Abstract method (Abstraction)
    public abstract void prepare();

    // Common behavior for all food items
    public void serve() {
        System.out.println(name + " is served! 🍽️");
    }

    // Encapsulation — Getters only (values are protected from direct modification)
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public String[] getIngredients() {
        return ingredients;
    }
}
