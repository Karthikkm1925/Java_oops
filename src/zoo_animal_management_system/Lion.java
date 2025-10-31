package zoo_animal_management_system;

public class Lion extends Animal {
    public Lion(String name, String healthCondition) {
        super(name, healthCondition);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " roars loudly! 🦁");
    }
}
