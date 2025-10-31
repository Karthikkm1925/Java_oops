package restaurant_menu_simulation;

public class RestaurantSimulation {
	public static void main(String[] args) {
        // Polymorphic array — common reference type FoodItem
        FoodItem[] order = {
            new Pizza(),
            new Burger(),
            new Pasta()
        };

        System.out.println("🍴 Welcome to Karthik’s Café! 🍴");

        for (FoodItem item : order) {
            System.out.println("\nYou ordered: " + item.getName());
            System.out.println("Price: ₹" + item.getPrice());
            System.out.println("Preparation Time: " + item.getPreparationTime() + " minutes");
            System.out.print("Ingredients: ");
            for (String ing : item.getIngredients()) {
                System.out.print(ing + " ");
            }
            System.out.println("\n");

            // Polymorphism in action — same call, different behavior
            item.prepare();
            item.serve();
        }

        System.out.println("\n✅ All orders completed! Enjoy your meal!");
    }
}
