package zoo_animal_management_system;

public class Elephant extends Animal {
    public Elephant(String name, String healthCondition) {
        super(name, healthCondition);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " trumpets! 🐘");
    }
}
