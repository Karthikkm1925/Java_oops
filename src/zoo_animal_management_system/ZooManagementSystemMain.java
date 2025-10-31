package zoo_animal_management_system;

public class ZooManagementSystemMain {
	public static void main(String[] args) {
        Animal[] zoo = {
            new Lion("Simba", "Good"),
            new Elephant("Dumbo", "Sick"),
            new Monkey("George", "Good")
        };

        for (Animal animal : zoo) {
            System.out.println("\nAnimal: " + animal.getName());
            System.out.println("Health Condition: " + animal.getHealthCondition());
            animal.eat();
            animal.sleep();
            animal.makeSound();
            System.out.println("Updated Health Condition: " + animal.getHealthCondition());
        }
    }
}
