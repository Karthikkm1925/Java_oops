package zoo_animal_management_system;

public class Monkey extends Animal {
    public Monkey(String name, String healthCondition) {
        super(name, healthCondition);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " chatters playfully! 🐒");
    }
}
